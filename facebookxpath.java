
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\aTesting\\chromedriver.exe");
		//WebDriver  driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("adc@gmail.com");
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("dwedx");
		//driver.findElement(By.xpath("//input[@type='login']")).click();
	// ----//tagName[@attribute = 'value']--------------xpath
		///WebDriver driver = new ChromeDriver();
		//driver.get("https://login.salesforce.com/?locale=eu");
		//driver.findElement(By.xpath("//*[@type='email']")).sendKeys("adFADF@gamail.com");
		//driver.findElement(By.xpath("//*[@id='password']")).sendKeys("965652");
		//driver.findElement(By.xpath("//*[@name='Login']")).click();
		
		//------tagName[attribute = 'value']--------------css
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("aascex@GMAIL.COM");
		driver.findElement(By.cssSelector("*[id='password']")).sendKeys("fax84495");
		driver.findElement(By.cssSelector("*[name='Login']")).click();
				

	}

}
