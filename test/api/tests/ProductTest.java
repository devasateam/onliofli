package api.tests;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.GET;
import static play.test.Helpers.POST;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.route;
import static play.test.Helpers.status;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Product;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import play.Logger;
import play.api.test.FakeHeaders;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;
import play.test.FakeApplication;
import play.test.FakeRequest;
import play.test.Helpers;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.gargoylesoftware.htmlunit.HttpMethod;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 
 *
 */
public class ProductTest {

	static Gson gson;
    static FakeApplication fp;
  	@BeforeClass
	public static void startApp() {
		gson = new GsonBuilder().create();
		Map<String,String> config= new HashMap<String,String>();
		//fp = fakeApplication(config,new GlobalTest());
		fp=fakeApplication();
		Helpers.start(fp);
	}

	@AfterClass
	public static void stopApp() {
		Helpers.stop( fp);
	}

	

	
	
	@Test
	public void testGetProduct() throws JsonParseException,
			JsonMappingException, IOException {
		FakeRequest request = new FakeRequest(HttpMethod.GET.toString(), "/api/products");

		Result result = route(request);
		assertThat(status(result)).isEqualTo(Http.Status.OK);
		
	}

}
