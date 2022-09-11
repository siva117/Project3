package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptInterface {

	public static void main(String[] args) {
		

		
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 
		         
			driver.get("https://www.amazon.in/");
		 
		WebElement ele=driver.findElement(By.xpath("//div[@ id='nav-flyout-ya-signin' and @class ='nav-flyout-content nav-flyout-accessibility']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		  js.executeScript("arguments[0].click();", ele);
		  
		
	/*	try {
			ele.click();
		}
		catch(RuntimeException e){
			JavascriptExecutor js =(JavascriptExecutor)driver;
			
			  js.executeScript("arguments[0].click();", ele);	
		}
		*/
		/*
		driver.get("https://www.amazon.in/");
	    WebElement value =driver.findElement(By.xpath("//a[text()='Singapore']"));
		  JavascriptExecutor js=(JavascriptExecutor)driver;
	      js.executeScript("arguments[0].scrollIntoView(true);", value);
		  js.executeScript("arguments[0].setAttribute('style','border:4px solid red')", value);
		               
                   driver.get("file:///D:/Websites/javaScriptdis.html");
                    WebElement Element =driver.findElement(By.id("skhdh"));
              
                    JavascriptExecutor js=(JavascriptExecutor)driver;
                    js.executeScript("arguments[0].setAttribute('value','adhjdhghj')", Element);

		
		
		                   driver.get("https://www.amazon.in/");
		
		                   JavascriptExecutor js=(JavascriptExecutor)driver;
		                   
		                   js.executeScript("window.scrollBy(0,6000)");
		                   
		                   js.executeScript("window.scrollBy(0,6000)"," ");
		          */         
		                   
		            
		
		
	                   
		
		
		
		
	}

}
