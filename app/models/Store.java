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

public class Store {

	@Id
	@ObjectId
	public String id;

	@Required
	public String name;

	public String address;

	public String location;

	private static JacksonDBCollection<Store, String> coll = MongoDB
			.getCollection("Stores", Store.class, String.class);

	public Store() {

	}

	public static List<Store> all() {
		return Store.coll.find().toArray();
	}

	public static void create(Store Product) {
		Store.coll.save(Product);
	}

	public static void delete(String id) {
		Store product = Store.coll.findOneById(id);
		if (product != null)
			Store.coll.remove(product);
	}

}