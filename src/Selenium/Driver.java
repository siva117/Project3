package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
        

        static WebDriver driver;
        public static void LaunchApplication(String browser,String url) {
       	 
       	 switch (browser.toLowerCase()) {
   		case "chrome":
   			System.setProperty("webdriver.chrome.driver", "C:\\Users\\askri\\eclipse-workspace\\Satwa Tech2\\Drivers\\chromedriver.exe");    
   			driver=new ChromeDriver();
   			   break;
   		case "firefox":
   			System.setProperty("webdriver.gecko.driver", "C:\\Users\\askri\\eclipse-workspace\\Satwa Tech2\\Drivers\\geckodriver.exe");
   			driver = new FirefoxDriver();
   		       break;
   		       
   		case "edge": 
   			System.setProperty("webdriver.msedge.driver", System.getProperty("uesr.dir")+"\\Drivers\\msedgedriver.exe" );
   			driver = new EdgeDriver();
   		       break;
   		default :
   		case "InternetExplorer":
   			
               System.setProperty("webdriver.ie.driver",System.getProperty("uesr.dir")+"\\Drivers\\IEDriverserver.exe");
   			driver= new InternetExplorerDriver();
   			   break;
   	
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//		public static WebDriver way() {
//		String projectpath=System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
//		
//		 driver=new ChromeDriver();
//		 return driver;
		
		
			
		
	}

        }}
