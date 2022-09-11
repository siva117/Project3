package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TSClass {
public static void main(String[] args) throws IOException {
	

	String projectpath=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	TakesScreenshot ts=(TakesScreenshot)driver;
	driver.get("file:///D:/Websites/Testteams.html");
	
	 File f=ts.getScreenshotAs(OutputType.FILE);
	  File  dest=new File("D:\\TS shots\\teamsshot.png");
	  
	 Files.move(f, dest);
	
	 Files.copy(f, dest);
	 
	 Files.copy(f, dest);
	 
	
} 
}