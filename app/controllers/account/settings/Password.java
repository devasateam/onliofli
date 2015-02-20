package controllers.account.settings;

import java.net.MalformedURLException;

import models.Token;
import models.User;
import play.Logger;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import controllers.Secured;

/**
 * @author samir
 */
@Security.Authenticated(Secured.class)
public class Password extends Controller {

    /**
     * Password Page. Ask the user to change his password.
     *
     * @return index settings
     */
    public static Result index() {
        return ok("success");
    }

    /**
     * Send a mail with the reset link.
     *
     * @return password page with flash error or success
     */
    public static Result runPassword() {
        User user = User.findByEmail(request().username());
        try {
            Token.sendMailResetPassword(user);
            flash("success", Messages.get("resetpassword.mailsent"));
            return ok("success");
        } catch (MalformedURLException e) {
            Logger.error("Cannot validate URL", e);
            flash("error", Messages.get("error.technical"));
        }
        return badRequest("Failure");
    }
}
