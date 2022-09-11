package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethods {

	public static void main(String[] args) throws InterruptedException {
		
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("file:///D:/Websites/checkbox.html");
		
	/*	WebElement elem=driver.findElement(By.id("check"));
		
		if (!elem.isSelected()) {
			
			Thread.sleep(5000);
			elem.click();
			Thread.sleep(5000);
		}
		*/
		
	/*	List<WebElement> allelem=driver.findElements(By.tagName("input"));
			System.out.println(allelem.size());
			
			 int totalcheckboxes =allelem.size();
			  int totalselected=0;
		                for(WebElement ele:allelem) {
		                	if(ele.isSelected());
		                	totalselected++;
		                }
		                if(totalcheckboxes==totalselected) {
		                	System.out.println("defaultly selected all checkboxes");}
		                	else {	   
		                		System.out.println("Total :"+(totalcheckboxes-totalselected)+"are not selected out of"+totalcheckboxes+"checkboxes");
		                	}
	*/	                		  
		                	   
		   /*             	   
		                driver.get("file:///D:/Websites/textcheck.html");	
		               
		              List< WebElement> allele =  driver.findElements(By.tagName("input"));
		              int count=0;
		              for(WebElement ele:allele) {
		            	     String val=ele.getAttribute("value");
		            	  if (val.isEmpty()) {
		            		  ele.sendKeys("abc");
		            		  count++;
		            		  
		            	  }
		              }
		              System.out.println(count);
		*/
		
		driver.get("file:///D:/Websites/links.html");
		
		 List<WebElement> val=driver.findElements(By.tagName("a"));
		 
		 for(WebElement get:val) {
			 String t=get.getAttribute("href");
			 String y=get.getText();
			 System.out.println(t+"::::"+y);
		 }
		 
		    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}
	
	
	
	

