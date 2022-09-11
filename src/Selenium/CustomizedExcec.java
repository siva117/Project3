package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedExcec{

	public static void main(String[] args) throws ValueInLisBoxNotFoundException {
	
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
	
	     driver.get("file:///D:/Websites/ipl%20teams.html");
	     WebElement listbox=driver.findElement(By.id("teamsofipl"));
	     
		
		CustomizedExcec.Elementtoselect(listbox, " Deccan Charges ");
	     
		
	}
	public static void Elementtoselect(WebElement listbox,String valuetoselect) throws ValueInLisBoxNotFoundException {
		 
	       List<WebElement> options=listbox.findElements(By.tagName("option"));
		           
		         boolean iselementfound=false;
		       for(WebElement option:options) {
		    	   String opttext=option.getText();
		    	   
		    	   if(opttext.trim().equalsIgnoreCase(valuetoselect.trim())) {
		    		   option.click();
		    		   iselementfound=true;
		    		   break;
		    	   }}
		     
		       if(!iselementfound) {
		    	   
		    	  throw new ValueInLisBoxNotFoundException("given value :"+valuetoselect+"is not found in "+listbox.toString());
		    		   
		    	   }
		    	   
		    	   
		    	   
	}       }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


