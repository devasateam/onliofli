package controllers;

import models.account.utils.AppException;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.accounts.service.AuthenticationService;
import com.accounts.service.impl.AuthenticationServiceImpl;
import com.fasterxml.jackson.databind.node.ObjectNode;
/**
 * @Author Pramod Email:sendpramod@gmail.com
 */
public class AuthenticationController extends Controller {

	public static Result authenticate(String email, String password)
			throws AppException {
		ObjectNode result = Json.newObject();

		AuthenticationService authenticationService = new AuthenticationServiceImpl();
		return ok(result.put("message",
				authenticationService.authenticateUser(email, password)));
	}
	
	public static Result login(){
		return ok();
	}
}
