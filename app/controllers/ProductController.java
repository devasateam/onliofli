package controllers;

import com.ecommerce.model.dao.ProductDao;

import models.Product;
import play.Logger;
import play.data.Form;
import play.mvc.Result;

public class ProductController extends BaseApiController {

	public static Result getProducts() {
		Logger.info("Getting products");
		return jsonResponse(ProductDao.all());
	}

	public static Result getProductBySku(String sku) {
		Logger.info("Getting products by sku");

		return jsonResponse(ProductDao.findBySku(sku));
	}

	public static Result createProduct() {
		Logger.info("Creating products");

		Form<Product> pForm = Form.form(Product.class).bindFromRequest();
		if (pForm.hasErrors()) {
			return badRequest("Invalid json data "
					+ pForm.errorsAsJson().toString());
		}
		Product p = pForm.get();
		ProductDao.create(p);
		return jsonResponse("success");
	}

	public static Result modifyProduct(String sku) {
		Logger.info("Modify product");

		Form<Product> pForm = Form.form(Product.class).bindFromRequest();
		if (pForm.hasErrors()) {
			return badRequest("Invalid json data "
					+ pForm.errorsAsJson().toString());
		}
		Product p = pForm.get();
		Product findBySku = ProductDao.findBySku(sku);
		// findBySku.map(p);
		ProductDao.update(findBySku);
		return jsonResponse("success");
	}

	public static Result deleteProduct(String sku) {
		Logger.info("Deleting product by sku");
		ProductDao.deleteBySku(sku);
		return jsonResponse("success");
	}
}
