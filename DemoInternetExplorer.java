
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoInternetExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// create driver object for InternetExplorer browser
		//we will strictly implement methods of web driver
		/* class name = chromeDriver
		 * 
		 * X driver = new X();
		 */
		
		//Microsoft driver
		
		System.setProperty("webdriver.ie.driver" , "F:\\aTesting\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
