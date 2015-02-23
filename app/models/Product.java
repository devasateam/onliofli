package models;

import java.util.List;

import net.vz.mongodb.jackson.Id;
import net.vz.mongodb.jackson.ObjectId;
import play.data.validation.Constraints.Required;

public class Product {
	

	@Id
	@ObjectId
	private String id;

	@Required
	private String sku;

	private String title;
	
	private String description;
	
	private List<VendorProductInfo> vendorProductInfos;
	
	private List<Product> productVariants;
	
	private double mrp;
	
	private User createdBy;
	
	private String name;
	
	private Category category;
	
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


}