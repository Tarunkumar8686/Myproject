package ALL;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions_Classes {

	public static void main(String[] args) throws InterruptedException {
     
        ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//     	----->	MoveHover---moveToElement() -- Method  <-------
		
//		driver.get("http://www.snapdeal.com");
//		//driver.findElement(By.partialLinkText("Gift Cards")).click();
//	    WebElement mens =	driver.findElement(By.xpath("//span[@class='catText']"));
//		WebElement shirts = driver.findElement(By.xpath("//a[contains(@href,'https://www.snapdeal.com/products/men-apparel-shirts')]//span[contains(@class,'linkTest')][normalize-space()='Shirts']"));
//		
//		Actions act = new Actions(driver);
//		Thread.sleep(5000);
//		act.moveToElement(mens).moveToElement(shirts).click().build().perform();
//		
//		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//		WebElement right = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
//		
//		Actions act = new Actions(driver);
//		act.contextClick(right).perform();
//		
//	    WebElement clixk=	driver.findElement(By.xpath("//*[@class='context-menu-item context-menu-icon context-menu-icon-cut']"));
//		clixk.click();
		
		
//        -------> DRAG AND DROP()  <---------
		
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		
//	    WebElement left =	driver.findElement(By.xpath("//div[@id='box6']"));
//		WebElement right = driver.findElement(By.id("box102"));
//		
//		Actions act = new Actions(driver);
//		act.dragAndDrop(left, right).perform();
		
//        ------->   KEYBOARD EVENTS   <------
		
//		driver.get("http://text-compare.com");
//		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("My Name is Tarun Im from Telangana District");
//		
//		//Ctrl+A
//		Actions act = new Actions(driver);
//	    act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
//	    //Ctrl+C
//		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
//		
//		//TAb 
//		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
//		
//		//Ctrl+V
//		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
//           ------>   SideBar Actions Drag drop  <-------
		
//		driver.get("https://www.snapdeal.com/products/men-apparel-shirts?sort=plrty&q=Price%3A150%2C2752%7C");
//		
//		WebElement start =driver.findElement(By.xpath("//a[@class='price-slider-scroll left-handle ui-slider-handle ui-state-default ui-corner-all hashAdded ui-state-hover ui-state-focus']"));
//		System.out.println(start.getLocation());
//		
//		Actions act = new Actions(driver);
//		act.dragAndDropBy(start, 200,380 ).perform();
		
		
//          -------> Select Tag <------
		
     	   //FaceBook Registration Page ALL IN ONE
//	     driver.get("https://www.facebook.com/register");
//
//	     driver.findElement(By.name("firstname")).sendKeys("TaunKumar");
//	     driver.findElement(By.xpath("//input[@name ='lastname']")).sendKeys("Kumar");
//	     driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Kumar1234@gmail.com");
//	     driver.findElement(By.id("password_step_input")).sendKeys("0987654321");
//	     
//	     WebElement date = driver.findElement(By.name("birthday_day"));
//	     date.click();
//	     Select d = new Select(date);
//	     d.selectByIndex(13);
//	     WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
//	     month.click();
//	     Select m = new Select(month);
//	     m.selectByValue("3");
//	     WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
//	     year.click();
//	     Select y = new Select(year);
//	     y.selectByValue("2001");
//	     
//	     driver.findElement(By.xpath("//input[@value='2']")).click();
//	     
	
//       --------->   JavaScript Executor  <---------		
		
//		With out using "sendkeys" We can use JavaScript Executor 
		
//		driver.get("http://www.testautomationpractice.blogspot.com/");
//	    List<WebElement> frame = driver.findElements(By.tagName("iframe"));
//	    int count = frame.size();
//		driver.switchTo().frame(0);
//		//driver.findElement(By.id("RESULT_TextField-0")).sendKeys("tarun");   
//		WebElement text = driver.findElement(By.id("RESULT_TextField-0"));
//		
//		JavascriptExecutor js = driver;
//		js.executeScript("arguments[0].setAttribute('value','vinod')", text);
//		
//		WebElement radio = driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-1_0']"));
//		js.executeScript("arguments[0].click();", radio);
		
		
//		-------------> JavaScript Executor <------------------
//	                    Uses Scroll Bar 
		
//		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
//		driver.get("http://www.bbc.com");
//		JavascriptExecutor js = driver;
//		js.executeScript("window.scrollBy(0,3000)", "");		
//		System.out.println(js.executeScript("return  window.pageYOffset;"));
//		
//		--->	Scroll Into The View Point   <-----
		
//        WebElement CheckPoint = driver.findElement(By.xpath("//a[normalize-space()='India News']"));
//		js.executeScript("arguments[0].scrollIntoView();", CheckPoint);
//		
//       ------->  Scroll to the Bottom of the page     <-------
		
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		System.out.println(js.executeScript("return  window.pageYOffset;"));

//		 ---------->  ImplicitWait Command    <------------
		
//		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("password");
		
//		    ----------> ExplicitWait Command   <----------
		
//		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
//		WebDriverWait ExplicitWait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		ExplicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']"))).sendKeys("TArun");
//		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("password");
		
		
//	      ----------->  Alerts Methods   <---------------	
	
//	     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		
//		//driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//		
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		
//		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//		
//	    Alert window =  driver.switchTo().alert();
//	    
//	    System.out.println(window.getText());
//	   // window.accept();
//	   // window.dismiss();
	    
	    //------>In Alerts method  By prompt   <-------
    
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
//		
//		Alert window = driver.switchTo().alert();
//		window.sendKeys("Tarun");
//		//window.accept();
//		
//		Robot rb = new Robot();
//		rb.keyPress(KeyEvent.VK_T);
//		rb.keyRelease(KeyEvent.VK_T);
//		
//		rb.keyPress(KeyEvent.VK_A);
//		rb.keyRelease(KeyEvent.VK_A);
//		
//		rb.keyPress(KeyEvent.VK_R);
//		rb.keyRelease(KeyEvent.VK_R);
//		
//		rb.keyPress(KeyEvent.VK_U);
//		rb.keyRelease(KeyEvent.VK_U);
//		
//		rb.keyPress(KeyEvent.VK_N);
//		rb.keyRelease(KeyEvent.VK_N);
//		
//		rb.keyPress(KeyEvent.VK_TAB);
//		rb.keyRelease(KeyEvent.VK_TAB);
//		
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
//             ---------> Tab window <--------------
		
 /*      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
        //driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
        
       // driver.findElement(By.name("EmailHomePage")).sendKeys("TarunMandha2001@");
        driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
        
       Set<String> win1 = driver.getWindowHandles();
           System.out.println(win1.size());
           
        Iterator<String> it =   win1.iterator();
        String mainwindow = it.next();
        while(it.hasNext()) {
        	String tabwindow = it.next();
        	driver.switchTo().window(tabwindow);
        	
        boolean elementpresent =	driver.findElement(By.id("Form_submitForm_EmailHomePage")).isDisplayed();
        	if(elementpresent) {
        		driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("kkkkkkkk");
        	}else {
        		continue;
        	}
             driver.close();
        }
            driver.switchTo().window(mainwindow);
            
            driver.findElement(By.name("username")).sendKeys("tarun");
            driver.quit();                                                      */
            
            
  /*          --------->  Single Frame Handle < ------>
            
            driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> frame =driver.findElements(By.tagName("frame"));
		System.out.println(frame.size());
	
		driver.switchTo().frame(0);
		driver.findElement(By.id("RESULT_TextField-0")).sendKeys("Tarun");      */
            
            
      /*       ------> Multi Frame Handle <---------      
            
            driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> frame =driver.findElements(By.tagName("frame"));
		System.out.println(frame.size());
	
		driver.switchTo().frame(0);
		
		driver.findElement(By.name("mytext1")).sendKeys("Tarun");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.name("mytext2")).sendKeys("djdjd");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.findElement(By.name("mytext3")).sendKeys("uuuuu");                 */
            
 /*          -------->  Dynamic Frame Handle 
  * 
  *           
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement desiredElement = null;
		List<WebElement> frame =driver.findElements(By.tagName("frame"));
		System.out.println(frame.size());
            
		for(WebElement iframe : frame) {
			driver.switchTo().frame(iframe);
			
		List<WebElement> testElement =	driver.findElements(By.name("mytext3"));
		if(!testElement.isEmpty()) {
			desiredElement = testElement.get(0);
			break;
		}
		driver.switchTo().defaultContent();
		}
		if(desiredElement != null) {
			desiredElement.sendKeys("vinod");
		}                                           */
		                                            
////          ---------> Static WebTable Handle <---------		
//		driver.get("http://testautomationpractice.blogspot.com/");
//		
//	   List<WebElement> rows =	driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
//		
//		System.out.println("No of Rows :"+ rows.size()); // Read  total rows
//		
//	   List<WebElement> columns =	driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
//		System.out.println("no of columns" + columns.size());  // Read total columns
//		
//	     String cellvalue =	driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[5]/td[3]")).getText();
//		System.out.println(cellvalue);                       // read the data for specific cell
//		
//		System.out.println("Bookname"+"       "+"Author"+"        "+"Subject"+"          "+"price");
//		
//		for(int r=2;r<=rows.size();r++) {
//			for(int c =1;c<=columns.size();c++) {
//				
//			String value =	driver.findElement(By.xpath("//table[@name='BookTable']/tbody//tr["+r+"]//td["+c+"]")).getText();
//			
//			System.out.print(value+"\t");
//			
//			}
//			System.out.println();
//			
//		}
		
		
//		for(int r=2;r<=rows.size();r++) {
//		String authorname =	driver.findElement(By.xpath("//table[@name='BookTable']/tbody//tr["+r+"]//td[2]")).getText();
//		if(authorname.equals("Amit")) {
//		String bookname=	driver.findElement(By.xpath("//table[@name='BookTable']/tbody//tr["+r+"]//td[1]")).getText();
//		System.out.println("BookNAME :" +   bookname);
//		}
//		}
//		
//        
//	   -----------> Dynamic Table Handle
	/*	
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    String Nextbutton =	driver.findElement(By.xpath("//a[@id='example_next']")).getAttribute("class");
		System.out.println(Nextbutton);
		
		List<String > web = new ArrayList<String>();
		while(!Nextbutton.contains("disable"))
		{
			driver.findElement(By.xpath("//a[@id='example_next']")).click();
			Thread.sleep(5000);
			
		List<WebElement> elements =	driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[1]"));
		
		for(WebElement names : elements) {
			
			web.add(names.getText());
			
		}
		       Nextbutton = driver.findElement(By.xpath("//a[@id='example_next']")).getAttribute("class");
		}
	      for(String name : web) {
	    	  System.out.println(name);
	      }                                                                                                       */
		        
		
//                -[-------------> DatePicker 
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		                                                                         // ---->   Approach 1
//		driver.findElement(By.xpath("//input[@id ='datepicker']")).sendKeys("03/14/2027");
		
		driver.findElement(By.xpath("//input[@id ='datepicker']")).click();
		
		String year ="2027";
		String month ="March";
		String date = "14";
		while(true){
		String mn = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(yr.equals(year) && mn.equals(month)) {
			
			break;
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		
	List<WebElement> calander =	driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[5]"));
		for(WebElement dt : calander) {
			if(dt.getText().equals(date)) {
				
			}
			dt.click();
		}
		
	}

}

