package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.util.concurrent.FluentFuture;

public class ExplicitWait {
private static WebDriver driver;
	public static void main(String[] args) {
		
			String projectpath=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
			
			 driver=new ChromeDriver();
			
			
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("sDHVS")));
		
//		Wait <WebDriver> wiat= new FluentWait<WebDriver>(driver);
		
  driver.get("https://www.amazon.in/");
	

   WebElement Element=driver.findElement(By.xpath("//a[text()='Amazon Pay']"));

   
   
   ExplicitWait.clickelement(Element, 20);
	}
		
	public static boolean isElementDisplayed(WebElement ele,int timeout)	{
		try {
		WebDriverWait wait =new WebDriverWait(driver,20);
		wait.pollingEvery(Duration.ofMillis(300));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		return true;
		
		}catch(Exception e){
			return false;
		}
	}
	
	public static boolean isElementEnabled(WebElement Element,int timeout) {
		try {
	          WebDriverWait wait = new WebDriverWait(driver,20);
	          wait.pollingEvery(Duration.ofMillis(300));
	          wait.until(ExpectedConditions.elementToBeClickable(Element));
		  
	          return true;
 	} catch(Exception e){
		return false;
 	}
	}
		
		public static boolean getElement(By by,int timeout) {
			WebElement el=null;
			try {
		          WebDriverWait wait = new WebDriverWait(driver,20);
		          wait.pollingEvery(Duration.ofMillis(300));
		          el= wait.until(ExpectedConditions.presenceOfElementLocated(by));
			  
		          return true;
	 	} catch(Exception e){
			return false;
	 	}
		}
		
		
		
		
		
		public static void clickelement(WebElement Ement,int timeout) {
			   if(isElementDisplayed(Ement, 20)) {
				   if(isElementEnabled(Ement,20)){
					   Ement.click();
					   
				   }
				   
			   }
			    
		}
		/*public static void clickelement2(By by,int timeout)
		
	        WebElement el=ExplicitWait.getElement(By by,int timeout);
			if(el!=null) {
				if(isElementDisplayed(el, 20)) {
					   if(isElementEnabled(el,20)){
						   el.click();
			*/		
				
	
		}
		
		
		

	


