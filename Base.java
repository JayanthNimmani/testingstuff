import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\aTesting\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++) 
		{
			String name = products.get(i).getText();
			//convert array into array list for easy search
			//check whether name you extracted is present or not
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			
			
			if(itemsNeededList.contains(name)) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
				break;
			}
			
		}

	}

}
