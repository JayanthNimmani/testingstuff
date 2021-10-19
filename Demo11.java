import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create driver object for chrome browser
		//we will strictly implement methods of web driver
		/* class name = chromeDriver
		 * 
		 * X driver = new X();
		 */
		
		// chrome driver
		
		System.setProperty("webdriver.chrome.driver" , "F:\\aTesting\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");  // Hit url
		System.out.println(driver.getTitle());  //validate if your page title is correct
		
		System.out.println(driver.getCurrentUrl()); //validate if you are landed on correct url
		//System.out.println(driver.getPageSource()); //print page source
		
		driver.get("https://www.yahoo.com/");
		driver.navigate().back();
		
		//driver.close();  //close the current browser
		driver.quit(); //closes all the browsers opened from selenium
		
	}

}
