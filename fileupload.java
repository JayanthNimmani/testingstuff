
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class fileupload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver" , "F:\\aTesting\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		String downloadPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","F:\\aTesting\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freepdfconvert.com/pdf-to-jpg");
		//driver.get("https://avepdf.com/pdf-to-jpeg");
		//driver.findElement(By.xpath(//*[@id='upload']")).click();
		driver.findElement(By.cssSelector("[class*='btn-label']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\ravi\\Downloads\\doc\\FileUpload.exe");
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));
		
		
		driver.findElement(By.cssSelector("button[class*='medium']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download now")));
		driver.findElement(By.linkText("Download Now")).click();
		
		File f = new File("C:\\Users\\ravi\\Downloads\\convert.zip");
		if(f.exists()){
			System.out.println("File Found");
		}

	}

}
