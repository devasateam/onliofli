package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;

import play.i18n.Messages;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

/**
 * @author samir
 */
public class Secured extends Security.Authenticator {

	@Override
	public String getUsername(Http.Context ctx) {
		return ctx.session().get("email");
	}

	@Override
	public Result onUnauthorized(Http.Context ctx) {
		ObjectNode result = Json.newObject();
		result.put("status_code", 401);
		result.put("message", Messages.get("signin.required"));
		return ok(result);
	}
}
