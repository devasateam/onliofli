package models.account.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import play.Configuration;
import play.Logger;

/**
 * <p/>
 * User: samir *
 */
public class Mail {

	/**
	 * 1 second delay on sending emails
	 */
	private static final int DELAY = 1;

	/**
	 * Send a email, using Akka to offload it to an actor.
	 * 
	 * @param envelop
	 *            envelop to send
	 */

	public static void sendMail(MailContent mailContent) {
		final Configuration root = Configuration.root();
		final String from = root.getString("mail.from");
		final String host = root.getString("smtp.host");
		final String port = root.getString("smtp.port");
		final String auth = root.getString("smtp.auth");
		final String enable = root.getString("starttls.enable");
		// "smtp.gmail.com";//
		// or IP address
		final String password = root.getString("smtp.password");// "wewillrockyou007";smtp.password
		Logger.info(from + "-------------" + host + "-------" + password);
		// Get the session object
		Properties properties = System.getProperties();
		properties.put("mail.smtp.auth", auth);
		properties.put("mail.smtp.starttls.enable", enable);
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", port);
		List<String> toEmails = mailContent.getToEmails();
		String readableMessage = mailContent.getMessage();
		String subject = mailContent.getSubject();
		Session session = Session.getInstance(properties,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(from, password);
					}
				});
		// compose the message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
					toEmails.get(0)));
			System.out.println(joinToString(toEmails, ","));
			message.setSubject(subject);
			message.setText(readableMessage);
			message.setDescription(readableMessage);
			Transport.send(message);
			System.out.println("message sent successfully....");

		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}

	public static String joinToString(Collection<?> collection,
			CharSequence separator) {

		if (collection.isEmpty()) {
			return "";
		} else {
			StringBuilder sepValueBuilder = new StringBuilder();

			for (Object obj : collection) {
				// Append the valuen and the separator even if it's the las
				// element
				sepValueBuilder.append(obj).append(separator);
			}
			// Remove the last separator
			sepValueBuilder.setLength(sepValueBuilder.length()
					- separator.length());

			return sepValueBuilder.toString();

		}
	}

	public void run(MailContent content) {
		sendMail(content);
		// MailerAPI email = play.Play.application()
		// .plugin(MailerPlugin.class).email();
		// final Configuration root = Configuration.root();
		// final String mailFrom = root.getString("mail.from");
		// email.setFrom(mailFrom);
		// email.setSubject(envelop.subject);

		// for (String toEmail : envelop.toEmails) {
		// email.setRecipient(toEmail);
		// Logger.debug("Mail.sendMail: Mail will be sent to " + toEmail);
		// }
		//
		// final String mailSign = root.getString("mail.sign");
		// email.send(envelop.message
		// + "\n\n  mailSign, envelop.message<br><br>--<br> mailSign");
		//
		// Logger.debug("Mail sent - SMTP:" + root.getString("smtp.host")
		// + ":" + root.getString("smtp.port") + " SSL:"
		// + root.getString("smtp.ssl") + " user:"
		// + root.getString("smtp.user") + " password:"
		// + root.getString("smtp.password"));

	}
}
