package Academy;

import java.io.IOException;



import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;
//Adding logs 
//Generating html reports
//Screenshots on failure
//JEnkins integration
public class validateNavigationBar extends base{
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
@BeforeTest

public void initialize() throws IOException
{
	
	 driver =initializeDriver();
		
	driver.get(prop.getProperty("url"));
}
	
	@Test
	
	public void validateAppNavBar() throws IOException
	{

		//one is inheritance
		// creating object to that class and invoke methods of it
		LandingPage l=new LandingPage(driver);
	
		//compare the text from the browser with actual text.- Error..
	    Assert.assertTrue(l.getNavigationBar().isDisplayed());
	    log.info("Navigation Bar is displayed");
		 System.out.println("Test completed");
	 //   Assert.assertFalse(false);
		 
		 System.out.println("ggod to see you");
		;
	
		
		}
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}

	
}
