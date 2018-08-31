package PhantomJS_1.PhantomJS_1;

import java.net.MalformedURLException;

import org.junit.Test;
//import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

//import ALM_Maturity_Bamboo_test1.ALM_Maturity_Bamboo_test1.PhantomJSDriver;
import junit.framework.Assert;

public class PhantomJS_1 
{
	WebDriver driver;
	@Test
	public void checkTitle() throws MalformedURLException {
		
		//System.setProperty("phantomjs.binary.path", "lib/phantomjs-2.1.1-windows/bin/phantomjs.exe");
		// driver = new PhantomJSDriver();
		
		//Capabilities caps = new DesiredCapabilities();
	//caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "lib/phantomjs-2.1.1-windows/bin/phantomjs.exe");
	//	driver = new PhantomJSDriver(caps);
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"lib/phantomjs-2.1.1-windows/bin/phantomjs.exe");
		WebDriver driver = new  PhantomJSDriver(caps);
		
		driver.get("http://newtours.demoaut.com");
		//driver.get(baseUrl);

		System.out.println(driver.getTitle());
		Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());

		driver.quit();
	}
}
