package controllers;

import models.Product;
import play.Logger;
import play.data.Form;
import play.mvc.Result;

public class ProductController extends BaseApiController{

	public static Result getProducts(){
		Logger.info("Getting products");
		return jsonResponse(Product.all());
	}
	
	public static Result getProductBySku(String sku){
		Logger.info("Getting products by sku");
		
		return jsonResponse(Product.findBySku(sku));
	}

	public static Result createProduct(){
		Logger.info("Creating products");

		Form<Product> pForm = Form.form(Product.class)
				.bindFromRequest();
		if (pForm.hasErrors()) {
			return badRequest("Invalid json data "
					+ pForm.errorsAsJson().toString());
		}
		Product p = pForm.get();
		Product.create(p);
		return jsonResponse("success");
	}
	
	public static Result modifyProduct(String sku){
		Logger.info("Modify product");

		Form<Product> pForm = Form.form(Product.class)
				.bindFromRequest();
		if (pForm.hasErrors()) {
			return badRequest("Invalid json data "
					+ pForm.errorsAsJson().toString());
		}
		Product p = pForm.get();
		Product findBySku = Product.findBySku(sku);
		findBySku.map(p);
		Product.update(findBySku);
		return jsonResponse("success");
	}
	public static Result deleteProduct(String sku){
		Logger.info("Deleting product by sku");

		Product.deleteBySku(sku);
		return jsonResponse("success");
	}
}
