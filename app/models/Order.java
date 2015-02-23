package models;

import java.util.List;

import net.vz.mongodb.jackson.Id;
import net.vz.mongodb.jackson.JacksonDBCollection;
import net.vz.mongodb.jackson.ObjectId;
import play.data.validation.Constraints.Required;
import play.modules.mongodb.jackson.MongoDB;

public class Order {

	@Id
	@ObjectId
	public String id;

	@Required
	public String sku;

	public int quantity;

	private static JacksonDBCollection<Order, String> coll = MongoDB
			.getCollection("Orders", Order.class, String.class);

	public Order() {

	}

	

	public static List<Order> all() {
		return Order.coll.find().toArray();
	}
	
	

	public static void create(Order order) {
		Order.coll.save(order);
	}



	public static void delete(String id) {
		Order order = Order.coll.findOneById(id);
		if (order != null)
			Order.coll.remove(order);
	}


	

}