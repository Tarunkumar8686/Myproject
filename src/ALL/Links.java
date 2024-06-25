package ALL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Links {

	public static void main(String[] args) {
     
     
//         -------->    iframes
     // https://ui.vision/demo/webtest/frames/
     
//     ----> orangeHRM datapicker
//     "https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList"
//     
//     --------> mousehover
 //    https://demo.opencart.com/
//     
//     https://jqueryui.com/datepicker/
//     
//     http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html---->Drag and Drop
     
//     http://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/-------SlideBar-Drag and Drop
     
//    	 https://demo.opencart.com/
     
//    	 https://testautomationpractice.blogsot.com/  --------> All in One 
     
     
//    	 https://datatables.net/examples/advanced_init/dt_events.html  -------> dynamic WebTable
//     
//      http://admin-demo.nopcommerce.com/
//     
//     
//   
		ChromeDriver driver = new ChromeDriver();
	     driver.get("https://text-compare.com/");
	     driver.manage().window().maximize();
//	   WebElement women = driver.findElement(By.partialLinkText("Women's Fashion"));
//
//	 WebElement dress =	driver.findElement(By.partialLinkText("Dresses"));
//		
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(women).moveToElement(dress).click().build().perform();
//		
//	String url=	driver.getCurrentUrl();
//		
//		System.out.println(url);
		
//		WebElement drag = driver.findElement(By.xpath("//div[@id='box5']"));
//	WebElement drop =	driver.findElement(By.xpath("//div[@class='dragableBoxRight']"));
//    
//	Actions act = new Actions(driver);
//	act.dragAndDrop(drag,drop).perform();
//	
	     driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("TArun");
	     
	     Actions act = new Actions(driver);
	     act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	     act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	     act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	     act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	     
	     
	     
	
	}

}
