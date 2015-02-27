package controllers;

import models.User;
import models.account.utils.AppException;
import play.i18n.Messages;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.accounts.service.AuthenticationService;
import com.accounts.service.impl.AuthenticationServiceImpl;
import com.fasterxml.jackson.databind.node.ObjectNode;
/**
 * @Author Pramod Email:sendpramod@gmail.com
 */
public class AuthenticationController extends Application {

	/**
	 * 
	 * @return Dashboard if auth OK or login form if auth KO
	 * @throws AppException
	 */
	public static Result authenticate(String email, String password)
			throws AppException {
		AuthenticationService authenticationService = new AuthenticationServiceImpl();
		
		if (email != null || password != null) {
			User authenticateUser = authenticationService.authenticateUser(
					email, password);

			if (authenticateUser == null) {
				return jsonResponse(Messages.get("invalid.user.or.password"),
						401);
			} else if (!authenticateUser.validated) {
				return jsonResponse(
						Messages.get("account.not.validated.check.mail"), 400);
			}
			session("email", authenticateUser.email);
			session("passwordHash", authenticateUser.passwordHash);
			session("id", authenticateUser.id);
			session("name", authenticateUser.fullname);
			return jsonResponse(Messages.get("account.successfully.validated"),
					200);
		} else {
			session().clear();
			return jsonResponse(Messages.get("invalid.user.or.password"), 400);
		}
	}
	
	/**
	 * Logout and clean the session.
	 * 
	 * @return Index page
	 */
	public static Result logout() {
		session().clear();
		flash("success", Messages.get("youve.been.logged.out"));
		return jsonResponse(Messages.get("youve.been.logged.out"), 200);
	}
}
