package controllers.account.settings;


import java.net.MalformedURLException;

import models.Token;
import models.User;
import play.Logger;
import play.i18n.Messages;
import play.mvc.Result;
import play.mvc.Security;
import controllers.BaseApiController;
import controllers.Secured;

/**
 * Settings -> Email page.
 * 
 * @author samir
 */
@Security.Authenticated(Secured.class)
public class Email extends BaseApiController {

	/**
	 * Password Page. Ask the user to change his password.
	 * 
	 * @return index settings
	 */
	public static Result index() {
		User user = User.findByEmail(request().username());
		return jsonResponse(Messages.get("signup.reset.password"), 200);
	}

	/**
	 * Send a mail to confirm.
	 * 
	 * @return email page with flash error or success
	 */
	public static Result runEmail() {
		User user = User.findByEmail(request().username());
		try {
			String mail = user.email;
			Token.sendMailChangeMail(user, mail);
			flash("success", Messages.get("changemail.mailsent"));
			return jsonResponse(Messages.get("changemail.mailsent"), 200);
		} catch (MalformedURLException e) {
			Logger.error("Cannot validate URL", e);
			flash("error", Messages.get("error.technical"));
		}
		return jsonResponse(Messages.get("signup.reset.password"), 200);
	}

	/**
	 * Validate a email.
	 * 
	 * @return email page with flash error or success
	 */
	public static Result validateEmail(String token) {
		User user = User.findByEmail(request().username());

		if (token == null) {
			flash("error", Messages.get("error.technical"));
			return jsonResponse(Messages.get("error.technical"), 200);
		}

		Token resetToken = Token.findByTokenAndType(token,
				Token.TypeToken.email);
		if (resetToken == null) {
			flash("error", Messages.get("error.technical"));
			return jsonResponse(Messages.get("error.technical"), 200);
		}

		if (resetToken.isExpired()) {
			resetToken.delete(resetToken);
			flash("error", Messages.get("error.expiredmaillink"));
			return jsonResponse(Messages.get("error.expiredmaillink"), 200);
		}

		user.email = resetToken.email;
		user.update(user);

		session("email", resetToken.email);

		flash("success",
				Messages.get("account.settings.email.successful", user.email));

		return jsonResponse(Messages.get(user.email+"ccount.settings.email.successful"),
				200);
	}
}
