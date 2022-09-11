package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;

public class FirstClass {

	
	
	public static void main(String[] args) {
		
		WebDriver driver;
		String  browsername="chrome";
		String projectpath=System.getProperty("user.dir");
		
//		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
		
		  switch (browsername) {
		    case "chrome":
			System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
	    	case "firefox":
			System.setProperty("webdriver.gecko.driver", projectpath+"\\Drivers\\geckodriver.exe");
		    driver = new FirefoxDriver();
			break;
			  
		    case "edge":
			System.setProperty("webdriver.msedge.driver", projectpath+"\\Drivers\\msedgedriver.exe" );
			
			 driver = new EdgeDriver();
			 break;
			 
			 
			  
     		default:
	     	case "Internetexplorer":
			System.setProperty("webdriver.ie.driver",projectpath+"\\Drivers\\IEDriverserver.exe");
			
			driver= new InternetExplorerDriver();
			break;

		}
		
		  
		  
		  
	}

}
