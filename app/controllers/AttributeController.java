package controllers;

import models.Attribute;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.accounts.service.AttributeService;
import com.accounts.service.impl.AttributeServiceImpl;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class AttributeController extends Controller {
	private static AttributeService attributeService = new AttributeServiceImpl();

	public static Result saveAttribute(String name, String desc) {
		ObjectNode result = Json.newObject();
		Attribute attribute = new Attribute();
		attribute.setName(name);
		attribute.setDescription(desc);
		attribute = attributeService.saveAttribute(attribute);
		return ok(Json.toJson(attribute));
	}

	public static Result getAttributes() {
		return ok(Json.toJson(attributeService.getAttributes()));
	}
}
