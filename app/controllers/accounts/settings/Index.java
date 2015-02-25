package controllers.account.settings;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import controllers.Secured;

/**
 * Index Settings page.
 * @author samir
 */
@Security.Authenticated(Secured.class)
public class Index extends Controller {

    /**
     * Main page settings
     *
     * @return index settings
     */
    public static Result index() {
        return null;
    }
}
