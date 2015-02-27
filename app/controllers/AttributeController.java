package controllers;

import models.Attribute;
import play.mvc.Result;
import play.mvc.Security;

import com.accounts.service.AttributeService;
import com.accounts.service.impl.AttributeServiceImpl;

@Security.Authenticated(Secured.class)
public class AttributeController extends Application {
	private static AttributeService attributeService = new AttributeServiceImpl();

	public static Result saveAttribute(String name, String desc) {
		Attribute attribute = new Attribute();
		attribute.setName(name);
		attribute.setDescription(desc);
		attribute = attributeService.saveAttribute(attribute);
		return jsonResponse(attribute, 200);
	}

	public static Result getAttributes() {
		return jsonResponse(attributeService.getAttributes(), 200);
	}
}
