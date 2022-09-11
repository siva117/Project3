package Selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 driver.get("file:///D:/Websites/ipl%20teams.html");
		          
	/*	 WebElement ele=driver.findElement(By.id("teamsofipl"));
		
		Select sel= new Select(ele);
		 sel.selectByIndex(3);
	     sel.selectByVisibleText(" kings X11 punjab ");
		   sel.selectByValue("rcb");
		*/
		
		WebElement newele =driver.findElement(By.id("teams"));
		
		 Select sel = new Select(newele);
		        
	   /*String [] team = {"Delhi capitals","  mubai indians   "," sun royals  "," sunrisers hyderabad   "};
		 
		  for(String teams:team) {
			  sel.selectByVisibleText(teams);
			
		 */
//		 sel.deselectAll();
		 sel.selectByIndex(5);
		 String val="rajstan royals";
		 
		 
	/*	 List<WebElement> all=sel.getAllSelectedOptions();
		 boolean isfound=false;
		for(WebElement selopt:all) {
			String option= selopt.getText();
	    
    	 if(option.equalsIgnoreCase(val)) {		
			isfound=true;
			break;
		}
		}
		 if(isfound) {
			 System.out.println("slected");
		 }else {
			 System.out.println("not selcted");
		 }
			 
		*/
		 
		 
		 
		 
		 
		  }
		
	}
		
		
		
		
	


