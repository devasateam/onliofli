package models;

import java.util.*;

import play.data.validation.Constraints.Required;
import play.modules.mongodb.jackson.MongoDB;
import net.vz.mongodb.jackson.JacksonDBCollection;
import net.vz.mongodb.jackson.Id;
import net.vz.mongodb.jackson.ObjectId;

import org.codehaus.jackson.annotate.JsonProperty;

import com.mongodb.BasicDBObject;

import javax.persistence.*;

public class Product {

	@Id
	@ObjectId
	public String id;

	@Required
	public String sku;

	public String itemDesc;

	private static JacksonDBCollection<Product, String> coll = MongoDB
			.getCollection("Products", Product.class, String.class);

	public Product() {

	}

	public Product(String sku) {
		this.sku = sku;
	}

	public static List<Product> all() {
		return Product.coll.find().toArray();
	}
	
	public static Product findBySku(String sku) {
		return  Product.coll.findOne(new BasicDBObject().append(
				"sku", sku));
	}

	public static void create(Product Product) {
		Product.coll.save(Product);
	}

	public static void create(String label) {
		create(new Product(label));
	}

	public static void delete(String id) {
		Product product = Product.coll.findOneById(id);
		if (product != null)
			Product.coll.remove(product);
	}

	public static void deleteBySku(String sku) {
		Product product = findBySku(sku);
		if (product != null)
			Product.coll.remove(product);
	}

	

}