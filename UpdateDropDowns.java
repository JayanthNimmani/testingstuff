import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class UpdateDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\aTesting\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://beta.spicejet.com/");
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("svg-img")).click();
		
		/*int i=1;
	while(i<5)
	{
		driver.findElement(By.id("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep")).click();
		i++;
	}*/
for(int i=1;i<5;i++)
{
	driver.findElement(By.className("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep")).click();
}
		
		driver.findElement(By.className("css-76zvg2 r-homxoj r-adyw6z r-q4m81j")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
	}

}
