/**
 * 
 */
package api.tests;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.POST;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.route;
import static play.test.Helpers.status;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;
import play.test.FakeApplication;
import play.test.FakeRequest;
import play.test.Helpers;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author samir
 * 
 */
public class TokenTest {

	static FakeApplication fp;

	@BeforeClass
	public static void startApp() {
		Gson gson = new GsonBuilder().create();
		Map<String, String> config = new HashMap<String, String>();
		// fp = fakeApplication(config,new GlobalTest());
		fp = fakeApplication();
		Helpers.start(fp);
	}

	@AfterClass
	public static void stopApp() {
		Helpers.stop(fp);
	}

	@Test
	public void testSignUp() throws JsonParseException, JsonMappingException,
			IOException {
		String body = "{\"email\":\"sam.sunny1@gmail.com\",\"fullname\":\"samir\",\"passwordHash\":\"samir\",\"confirmationToken\":\"samir\",\"dateCreated\":\""
				+ 12909292 + "\",\"validated\":" + true + "}";
		JsonNode node = Json.parse(body);
		FakeRequest request = new FakeRequest(POST, "/api/account/getNewToken")
				.withJsonBody(node);

		Result result = route(request);
		assertThat(status(result)).isEqualTo(Http.Status.OK);

	}
}
