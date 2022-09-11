package DataParameterization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Propsource {
	
	
     public static void main(String[] args) throws Exception {
		
		
		
		
			InputStream file =new FileInputStream("C:\\Users\\askri\\eclipse-workspace\\Satwa Tech2\\fileprop\\Creds");
			 
			
			 Properties prop=new Properties();
			 prop.load(file);
			 
			 System.out.println(prop.getProperty("FirstName"));

	         HashMap <String,String> data =getpropertiesdata("C:\\Users\\askri\\eclipse-workspace\\Satwa Tech2\\fileprop\\Creds");
	
	         LaunchApplication(data.get("browser"),data.get("URL"));
	
     }
	
	
	
     

         
         public static HashMap<String,String> getpropertiesdata (String propertyfile) throws Exception{
    	 HashMap<String,String> propertydata= new HashMap<>();  
    	 
    	 try{
    		 
    	 
    	 InputStream file =new FileInputStream(propertyfile);
		 Properties prop=new Properties();
		 prop.load(file);
		               
		                    Set<Object> allprops=prop.keySet();
		                    
		                    for(Object key:allprops) {
		                    	
		                      String keyName=key.toString();
		                      String keyValue   =prop.getProperty(keyName);
		                    	
		                      propertydata.put(keyName, keyValue);
		                               	   
		                    	   
		                    }    }
		   	 
    	    catch(IOException R){
    		 
    		 System.out.println("cannot retrive value from  map");
    		 
    		 
    	 }
	       	return propertydata;
    		 
    	 }
    	 
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
		}
    	 
     }
     
     
     
     
     
     
     
     
     
}