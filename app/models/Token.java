package models;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Nullable;
import javax.persistence.Id;

import models.account.utils.Mail;
import net.vz.mongodb.jackson.JacksonDBCollection;
import net.vz.mongodb.jackson.ObjectId;
import play.Configuration;
import play.Logger;
import play.data.validation.Constraints.Required;
import play.i18n.Messages;
import play.modules.mongodb.jackson.MongoDB;

import com.mongodb.BasicDBObject;

/**
 * @author samir
 */
public class Token{
    // Reset tokens will expire after a day.
    private static final int EXPIRATION_DAYS = 1;

    public enum TypeToken {
        password("reset"), email("email");
        private String urlPath;

        TypeToken(String urlPath) {
            this.urlPath = urlPath;
        }

    }
    
    @Id
    @ObjectId
    public String token;
    
    @Required
    public String userId;
    
    @Required
    public TypeToken type;
    
    @Required
    public Date dateCreation;

    @Required
    public String email;

    // -- Queries
    public static JacksonDBCollection<Token, String> tokenCollection = MongoDB
			.getCollection("Token", Token.class, String.class);
    /**
     * Retrieve a token by id and type.
     *
     * @param token token Id
     * @param type  type of token
     * @return a resetToken
     */
    public static Token findByTokenAndType(String token, TypeToken type) {
    	return Token.tokenCollection.findOne(new BasicDBObject().append("token", token).append("type", type));
    }

    /**
     * @return true if the reset token is too old to use, false otherwise.
     */
    public boolean isExpired() {
        return dateCreation != null && dateCreation.before(expirationTime());
    }

    /**
     * @return a date before which the password link has expired.
     */
    private Date expirationTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, -EXPIRATION_DAYS);
        return cal.getTime();
    }

    /**
     * Return a new Token.
     *
     * @param user  user
     * @param type  type of token
     * @param email email for a token change email
     * @return a reset token
     */
    private static Token getNewToken(User user, TypeToken type, String email) {
        Token token = new Token();
        token.token = UUID.randomUUID().toString();
        token.userId = user.getId();
        token.type = type;
        token.email = email;
        token.save(token);
        return token;
    }

    /**
     * Send the Email to confirm ask new password.
     *
     * @param user the current user
     * @throws java.net.MalformedURLException if token is wrong.
     */
    public static void sendMailResetPassword(User user) throws MalformedURLException {
        sendMail(user, TypeToken.password, null);
    }

    /**
     * Send the Email to confirm ask new password.
     *
     * @param user  the current user
     * @param email email for a change email token
     * @throws java.net.MalformedURLException if token is wrong.
     */
    public static void sendMailChangeMail(User user, @Nullable String email) throws MalformedURLException {
        sendMail(user, TypeToken.email, email);
    }

    /**
     * Send the Email to confirm ask new password.
     *
     * @param user  the current user
     * @param type  token type
     * @param email email for a change email token
     * @throws java.net.MalformedURLException if token is wrong.
     */
    private static void sendMail(User user, TypeToken type, String email) throws MalformedURLException {

        Token token = getNewToken(user, type, email);
        String externalServer = Configuration.root().getString("server.hostname");

        String subject = null;
        String message = null;
        String toMail = null;

        // Should use reverse routing here.
        String urlString = urlString = "http://" + externalServer + "/" + type.urlPath + "/" + token.token;
        URL url = new URL(urlString); // validate the URL

        switch (type) {
            case password:
                subject = Messages.get("mail.reset.ask.subject");
                message = Messages.get("mail.reset.ask.message", url.toString());
                toMail = user.email;
                break;
            case email:
                subject = Messages.get("mail.change.ask.subject");
                message = Messages.get("mail.change.ask.message", url.toString());
                toMail = token.email; // == email parameter
                break;
        }

        Logger.debug("sendMailResetLink: url = " + url);
        Mail.Envelop envelop = new Mail.Envelop(subject, message, toMail);
        Mail.sendMail(envelop);
    }
    
    private void save(Token token){
    	Token.tokenCollection.save(token);
    }
    
    public void delete(Token token){
    	Token.tokenCollection.remove(token);
    }

}
