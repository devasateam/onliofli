package controllers.account;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import models.Token;
import models.TypeToken;
import models.User;
import models.account.utils.AppException;
import models.account.utils.Mail;
import models.account.utils.MailContent;

import org.apache.commons.mail.EmailException;

import play.Logger;
import play.i18n.Messages;
import play.mvc.Result;
import controllers.Application;

/**
 * Token password : - ask for an email address. - send a link pointing them to a
 * reset page. - show the reset page and set them reset it.
 * <p/>
 * <p/>
 * 
 * @author samir
 */
public class Reset extends Application {

	/**
	 * Run ask password.
	 * 
	 * @return reset password , runAsk render otherwise
	 */
	public static Result runAsk(String email1) {
		if (email1 == null) {
			flash("error", Messages.get("signup.valid.email"));
			return jsonResponse(Messages.get("error.expiredmaillink"), 200);
		}

		final String email = email1;
		Logger.debug("runAsk: email = " + email);
		User user = User.findByEmail(email);
		Logger.debug("runAsk: user = " + user);

		// If we do not have this email address in the list, we should not
		// expose this to the user.
		// This exposes that the user has an account, allowing a user
		// enumeration attack.
		// Instead, email the person saying that the reset failed.
		if (user == null) {
			Logger.debug("No user found with email " + email);
			sendFailedPasswordResetAttempt(email);
			return jsonResponse(
					Messages.get("account.settings.email.successful"), 200);
		}

		Logger.debug("Sending password reset link to user " + user);

		try {
			Token.sendMailResetPassword(user);
			return jsonResponse(
					Messages.get("account.settings.email.successful"), 200);
		} catch (MalformedURLException e) {
			Logger.error("Cannot validate URL", e);
			flash("error", Messages.get("error.technical"));
		}
		return jsonResponse(Messages.get("error.expiredmaillink"), 200);
	}

	/**
	 * Sends an email to say that the password reset was to an invalid email.
	 * 
	 * @param email
	 *            the email address to send to.
	 */
	private static void sendFailedPasswordResetAttempt(String email) {
		String subject = Messages.get("mail.reset.fail.subject");
		String message = Messages.get("mail.reset.fail.message", email);

		List<String> emailList = new ArrayList<String>();
		emailList.add(email);
		MailContent content = new MailContent(subject, message, emailList,
				null, null, null);
		Mail.sendMail(content);
	}

	public static Result reset(String token) {

		if (token == null) {
			flash("error", Messages.get("error.technical"));

			return jsonResponse(Messages.get("error.technical"), 200);
		}

		Token resetToken = Token.findByTokenAndType(token,TypeToken.password);
		if (resetToken == null) {
			flash("error", Messages.get("error.technical"));

			return jsonResponse(Messages.get("error.technical"), 200);
		}

		if (resetToken.isExpired()) {
			resetToken.delete(resetToken);
			flash("error", Messages.get("error.expiredresetlink"));

			return jsonResponse(Messages.get("error.expiredmaillink"), 200);
		}

		return jsonResponse(Messages.get("account.settings.email.successful"),
				200);
	}

	/**
	 * @return reset password
	 */
	public static Result runReset(String token, String password) {
		// Map<String, String[]> parameters =
		// request().body().asFormUrlEncoded();
		// String token = parameters.get("token")[0];
		// String password = parameters.get("password")[0];
		if (token == null) {
			flash("error", Messages.get("signup.valid.password"));
			return jsonResponse(Messages.get("signup.valid.password"), 200);
		}

		try {
			Token resetToken = Token.findByTokenAndType(token,
					TypeToken.password);
			if (resetToken == null) {
				flash("error", Messages.get("error.technical"));
				return jsonResponse(Messages.get("error.expiredmaillink"), 200);
			}

			if (resetToken.isExpired()) {
				resetToken.delete(resetToken);
				flash("error", Messages.get("error.expiredresetlink"));
				return jsonResponse(Messages.get("error.expiredmaillink"), 200);
			}

			// check email
			User user = User.findById(resetToken.userId);
			if (user == null) {
				flash("error", Messages.get("error.technical"));
				return jsonResponse(Messages.get("error.technical"), 200);
			}

			String inputPassword = password;
			user.changePassword(inputPassword);

			// Send email saying that the password has just been changed.
			sendPasswordChanged(user);
			flash("success", Messages.get("resetpassword.success"));
			return jsonResponse(Messages.get("resetpassword.success"), 200);
		} catch (AppException e) {
			flash("error", Messages.get("error.technical"));
			return jsonResponse(Messages.get("error.technical"), 200);
		}

	}

	/**
	 * Send mail with the new password.
	 * 
	 * @param user
	 *            user created
	 * @throws EmailException
	 *             Exception when sending mail
	 */
	private static void sendPasswordChanged(User user) {
		String subject = Messages.get("mail.reset.confirm.subject");
		String message = Messages.get("mail.reset.confirm.message");
		List<String> emailList = new ArrayList<String>();
		emailList.add(user.email);
		MailContent content = new MailContent(subject, message, emailList);
		Mail.sendMail(content);
	}
}
