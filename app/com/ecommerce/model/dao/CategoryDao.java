package com.ecommerce.model.dao;

import java.util.List;

import models.Category;
import net.vz.mongodb.jackson.JacksonDBCollection;
import play.modules.mongodb.jackson.MongoDB;

/**

@Author	Pramod
Email:sendpramod@gmail.com
 */
public class CategoryDao {
	private static JacksonDBCollection<Category, String> coll = MongoDB
			.getCollection("Categories", Category.class, String.class);
	
	public static List<Category> all() {
		return coll.find().toArray();
	}

	public static void create(Category category) {
		coll.save(category);
	}

	public static void delete(String id) {
		Category category = coll.findOneById(id);
		if (category != null)
			coll.remove(category);
	}
}


