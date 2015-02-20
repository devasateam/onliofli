import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.HTMLUNIT;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.running;
import static play.test.Helpers.testServer;

import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import play.test.FakeApplication;
import play.libs.F.Callback;
import play.test.Helpers;
import play.test.TestBrowser;

public class IntegrationTest {
	
	static FakeApplication fp ;
	
	@BeforeClass
	public static void startApp() {
		
		Map<String,String> config= new HashMap<String,String>();
		 fp = fakeApplication();
		
		Helpers.start(fp);
		
	}

    
	@AfterClass
	public static void stopApp() {
		Helpers.stop( fp);
	}
	
    @Test
    public void test() {
        running(testServer(3333, fp), HTMLUNIT, new Callback<TestBrowser>() {
            public void invoke(TestBrowser browser) {
                browser.goTo("http://localhost:3333");
                assertThat(browser.pageSource()).contains("success");
            }
        });
    }

}