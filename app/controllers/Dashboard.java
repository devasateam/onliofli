package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

/**
 * @author samir
 */
@Security.Authenticated(Secured.class)
public class Dashboard extends Controller {

    public static Result index() {
    	return ok("i am dash board!!!");
    }
}
