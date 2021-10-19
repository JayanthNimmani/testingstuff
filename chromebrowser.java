import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\aTesting\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1");
		// driver.findElement(By.id("email")).sendKeys("This is aryan");
		//driver.findElement(By.className("inputtext_55r1 _6luy")).sendKeys("abc");
		//driver.findElement(By.className("inputtext_55r1 _6luy")).sendKeys("15626");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("rfowpkc");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("29626263");
		driver.findElement(By.xpath("//*[@id='login_link']/a[1]")).click();
		
		//driver.findElement(By.name("pass")).sendKeys("5596596356@");
		//driver.findElement(By.linkText("Forgotten account?")).click();
			
	}

}
