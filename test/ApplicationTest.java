import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.fakeApplication;

import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import play.test.FakeApplication;
import play.test.Helpers;


/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {
	
	
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
    public void simpleCheck() {
        int a = 1 + 1;
        assertThat(a).isEqualTo(2);
    }



}