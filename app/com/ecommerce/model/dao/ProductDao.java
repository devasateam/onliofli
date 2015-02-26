package com.ecommerce.model.dao;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import com.mongodb.BasicDBObject;
import models.Product;
import net.vz.mongodb.jackson.JacksonDBCollection;
import play.modules.mongodb.jackson.MongoDB;

/**
 * @Author Pramod Email:sendpramod@gmail.com
 */

public class ProductDao {
	private static JacksonDBCollection<Product, String> coll = MongoDB
			.getCollection("Products", Product.class, String.class);

	public static List<Product> all() {
		return coll.find().toArray();
	}

	public static Product findBySku(String sku) {
		return coll.findOne(new BasicDBObject().append("sku", sku));
	}

	public static void create(Product product) {
		coll.save(product);

	}

	public static void update(Product product) {
		if (!StringUtils.isEmpty(product.getId()))
			coll.save(product);
	}

	public static void delete(String id) {
		Product product = coll.findOneById(id);
		if (product != null)
			coll.remove(product);
	}

	public static void deleteBySku(String sku) {
		Product product = findBySku(sku);
		if (product != null)
			coll.remove(product);
	}
}
