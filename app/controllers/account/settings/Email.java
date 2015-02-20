package controllers.account.settings;

import static play.data.Form.form;

import java.net.MalformedURLException;

import models.Token;
import models.User;
import play.Logger;
import play.data.Form;
import play.data.validation.Constraints;
import play.i18n.Messages;
import play.mvc.Result;
import play.mvc.Security;
import controllers.BaseApiController;
import controllers.Secured;

/**
 * Settings -> Email page.
 * @author samir
 */
@Security.Authenticated(Secured.class)
public class Email extends BaseApiController {

	public static class AskForm {
		@Constraints.Required
		public String email;

		public AskForm() {
		}

		AskForm(String email) {
			this.email = email;
		}
	}

	/**
	 * Password Page. Ask the user to change his password.
	 * 
	 * @return index settings
	 */
	public static Result index() {
		User user = User.findByEmail(request().username());
		Form<AskForm> askForm = form(AskForm.class);
		askForm = askForm.fill(new AskForm(user.email));
		return jsonResponse("success");
	}

	/**
	 * Send a mail to confirm.
	 * 
	 * @return email page with flash error or success
	 */
	public static Result runEmail() {
		Form<AskForm> askForm = form(AskForm.class).bindFromRequest();
		User user = User.findByEmail(request().username());

		if (askForm.hasErrors()) {
			flash("error", Messages.get("signup.valid.email"));
			return badRequest("failure");
		}

		try {
			String mail = askForm.get().email;
			Token.sendMailChangeMail(user, mail);
			flash("success", Messages.get("changemail.mailsent"));
			return jsonResponse("success");
		} catch (MalformedURLException e) {
			Logger.error("Cannot validate URL", e);
			flash("error", Messages.get("error.technical"));
		}
		return badRequest("failure");
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
			return badRequest("failure");
		}

		Token resetToken = Token.findByTokenAndType(token,
				Token.TypeToken.email);
		if (resetToken == null) {
			flash("error", Messages.get("error.technical"));
			return badRequest("failure");
		}

		if (resetToken.isExpired()) {
			resetToken.delete(resetToken);
			flash("error", Messages.get("error.expiredmaillink"));
			return badRequest("failure");
		}

		user.email = resetToken.email;
		user.update(user);

		session("email", resetToken.email);

		flash("success",
				Messages.get("account.settings.email.successful", user.email));

		return ok("Success");
	}
}
