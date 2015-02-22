package com.ecommerce.model.dao;

import java.util.List;

import models.Attribute;
import net.vz.mongodb.jackson.JacksonDBCollection;
import play.modules.mongodb.jackson.MongoDB;

/**
 * @Author Pramod Email:sendpramod@gmail.com
 */
public class AttributeDao {
	private static JacksonDBCollection<Attribute, String> coll = MongoDB
			.getCollection("Attributes", Attribute.class, String.class);

	public static List<Attribute> all() {
		return coll.find().toArray();
	}

	public static void create(Attribute attribute) {
		coll.save(attribute);
	}

	public static void delete(String id) {
		Attribute attribute = coll.findOneById(id);
		if (attribute != null)
			coll.remove(attribute);
	}
}
