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

public class Retailer {

	@Id
	@ObjectId
	public String id;

	@Required
	public String name;

	public String details;

	private static JacksonDBCollection<Retailer, String> coll = MongoDB
			.getCollection("Retailers", Retailer.class, String.class);

	public Retailer() {

	}

	

	public static List<Retailer> all() {
		return Retailer.coll.find().toArray();
	}
	
	

	public static void create(Retailer ret) {
		Retailer.coll.save(ret);
	}

	

	public static void delete(String id) {
		Retailer product = Retailer.coll.findOneById(id);
		if (product != null)
			Retailer.coll.remove(product);
	}

	

	

}