
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\aTesting\\chromedriver.exe");
		//WebDriver  driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("adc@gmail.com");
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("dwedx");
		//driver.findElement(By.xpath("//input[@type='login']")).click();
		WebDriver driver = new ChromeDriver();
		//driver.get("http://admin:admin@the-internet.herokuapp.com/");
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
		

	}

}
