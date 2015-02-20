package models;

import java.util.*;

import play.data.validation.Constraints.Required;
import play.modules.mongodb.jackson.MongoDB;
import net.vz.mongodb.jackson.JacksonDBCollection;
import net.vz.mongodb.jackson.Id;
import net.vz.mongodb.jackson.ObjectId;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.annotate.JsonProperty;

import com.mongodb.BasicDBObject;

import javax.persistence.*;

public class Product {

	@Id
	@ObjectId
	private String id;

	@Required
	private String sku;

	

	private String itemDesc;

	private static JacksonDBCollection<Product, String> coll = MongoDB
			.getCollection("Products", Product.class, String.class);

	public Product() {

	}

	public Product(String sku) {
		this.sku = sku;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	
	public static List<Product> all() {
		return Product.coll.find().toArray();
	}
	
	public static Product findBySku(String sku) {
		return  Product.coll.findOne(new BasicDBObject().append(
				"sku", sku));
	}

	public static void create(Product product) {
		Product.coll.save(product);
	
	}
	
	public static void update(Product product){
		if(!StringUtils.isEmpty(product.id))
			Product.coll.save(product);
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

	public void map(Product p) {
		this.itemDesc=p.itemDesc;
		
	}

	

}