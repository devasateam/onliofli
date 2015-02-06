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

public class Brand {

	@Id
	@ObjectId
	public String id;

	@Required
	public String name;

	public String details;

	private static JacksonDBCollection<Brand, String> coll = MongoDB
			.getCollection("Brands", Brand.class, String.class);

	public Brand() {

	}

	
	public static List<Brand> all() {
		return Brand.coll.find().toArray();
	}
	
	

	public static void create(Brand brand) {
		Brand.coll.save(brand);
	}

	
	public static void delete(String id) {
		Brand product = Brand.coll.findOneById(id);
		if (product != null)
			Brand.coll.remove(product);
	}

	

	

}