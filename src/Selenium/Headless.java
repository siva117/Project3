package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.google.common.io.Files;

public class Headless {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver",projectpath+"\\Drivers\\msedgedriver.exe");
		
		
	    EdgeOptions Options = new EdgeOptions();
		Options.addArguments("--Headless");
	    WebDriver driver=new EdgeDriver(Options);
		
//	    WebDriver driver=new EdgeDriver();		
		
		
		
		
		
//		ChromeOptions Options = new ChromeOptions();
//		Options.addArguments("--Headless");
//		WebDriver driver=new ChromeDriver(Options);
////		WebDriver driver=new ChromeDriver();
		TakesScreenshot  ts =(TakesScreenshot)driver;
	    driver.get("https://www.google.com/");
		
	          File f =ts.getScreenshotAs(OutputType.FILE);
	          File dest = new File("D:\\TS shots\\teamsshotedge9.png");
	          Files.copy(f, dest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
