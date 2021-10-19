import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\aTesting\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		//driver.findElement(By.id("username")).sendKeys("hello");
		//driver.findElement(By.name("pw")).sendKeys("122345");
		//driver.findElement(By.className("button r4 wide primary")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("64561@");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("84626");
		driver.findElement(By.xpath("//*[@id=\'u_0_a_3H\']/div[3]/a")).click();

	}

}
