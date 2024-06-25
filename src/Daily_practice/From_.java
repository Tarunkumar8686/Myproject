package Daily_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class From_ {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.partialLinkText("Laptops & Notebooks")).click();
		
	WebElement lap =	driver.findElement(By.xpath(""));
		
	Actions act = new Actions(driver);
		act.moveToElement(lap).click().build().perform();

		
	}

}
