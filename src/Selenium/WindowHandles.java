package Selenium;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandles {
	
	
	public static void main(String[] args) {
		
		
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Websites/mainpage.html");
		List<WebElement> alllinks =driver.findElements(By.tagName("a"));
		
		      for(WebElement link:alllinks) {
		    	  link.click();
		      }
		
		  String mainpagehandle =driver.getWindowHandle();
		  Set<String> allhandles =driver.getWindowHandles();
	/*	  
		      boolean iswindowfound=false;
		      String WindowToSWitch ="Gmail";
		      for(String handle:allhandles) {
			   driver.switchTo().window(handle);
			  if( driver.getTitle().contains(WindowToSWitch)){
				  iswindowfound=true;
			   break;
			   
			  }}
			  if(iswindowfound) {
				  System.out.println("successfully opened :"+WindowToSWitch);
				  
			  }else {
				  System.out.println(WindowToSWitch+" : window as not found");
			  }
			   
		   
		      
		      System.out.println(driver.getTitle());
		      */
		  
		                 Object[] arrhandle = allhandles.toArray();
		                  
		                 driver.switchTo().window(arrhandle[2].toString());
		                
		                 
		                 
		                 
		                  
		                 
		                 
		  
		  
	}}
		



		   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	


