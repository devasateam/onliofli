package controllers;

//import play.data.*;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class BaseApiController extends Controller {

	public static Result preflight(String path) {
		response().setHeader("Access-Control-Allow-Origin", "*");
		response().setHeader("Access-Control-Allow-Methods",
				"POST, GET, OPTIONS, PUT, DELETE");
		response().setHeader("Access-Control-Max-Age", "3600");
		response()
				.setHeader(
						"Access-Control-Allow-Headers",
						"Origin, X-Requested-With, Content-Type, Accept, Authorization, X-Auth-Token, x-json, x-prototype-version");
		response().setHeader("Access-Control-Allow-Credentials", "true");
		return ok();
	}

	public static Result jsonResponse(Object obj) {
		return jsonResponse(obj, 200);
	}

	public static Result jsonResponse(Object obj, int code) {
		ObjectNode result = Json.newObject();
		result.put("status_code", code);
		result.put("message", Json.toJson(obj));
		return status(code, Json.toJson(obj));
		// StringWriter w = new StringWriter();
		// try {
		// mapper.writeValue(w, obj);
		// } catch (Exception e) {
		// Logger.error("Error in serializing json response ",e);
		// }
		//
		//
		// response().setHeader("Access-Control-Allow-Origin", "*");
		// response().setHeader("Access-Control-Allow-Methods",
		// "POST, GET, OPTIONS, PUT, DELETE");
		// response().setHeader("Access-Control-Max-Age", "3600");
		// response().setHeader("Access-Control-Allow-Headers",
		// "Origin, X-Requested-With, Content-Type, Accept, Authorization, X-Auth-Token, x-json, x-prototype-version");
		// response().setHeader("Access-Control-Allow-Credentials", "true");
		// response().setContentType("application/json");
		//
		// return status(code, w.toString());
	}

}
