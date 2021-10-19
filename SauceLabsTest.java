

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class SauceLabsTest {
	
	public static final String USERNAME = "rahul2";
	public static final String ACCESS_KEY = "XXXXX";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";



	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Windows 7");
		cap.setCapability("browserVersion", "75");
		MutableCapabilities sauceOptions = new MutableCapabilities();
		cap.setCapability("sauce:options", sauceOptions);
		
		WebDriver driver = new RemoteWebDriver(new URL(URL), cap);
		driver.get("://www.google.co.in/");
		System.out.println(driver.getTitle());
		
	}

}
