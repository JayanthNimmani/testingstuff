
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// create driver object for Firefox browser
		//we will strictly implement methods of web driver
		/* class name = chromeDriver
		 * 
		 * X driver = new X();
		 */
		
		// gecko driver
		
		System.setProperty("webdriver.gecko.driver" , "F:\\aTesting\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		

	}

}
