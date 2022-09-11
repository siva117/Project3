package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class JavaScript {
	
	public static void main(String[] args) throws IOException {
		
	
	
	String projectpath=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/V4/index.php");
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	 driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr421379");
//	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("usemuhe");
//	 WebElement buttom=driver.findElement(By.xpath("//input[@name='btnLogin']"));
//	 js.executeScript("arguments[0].click();", buttom);
//	 
////     js.executeScript("alert('welcome to mainpage')" );
//	 WebElement ele = driver.findElement(By.xpath("//a[text()='Log out']"));
////	 driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
//	 WebDriverWait wait = new WebDriverWait(driver,10);
//	 wait.until(ExpectedConditions.visibilityOf(ele));
////	js.executeScript("arguments[0].scrollIntoView()",ele);
////	js.executeScript("window.scrollBy(0,6000)");
//	 

//	 driver.get("https://www.google.com/");
//	 WebElement element=driver.findElement(By.name("q"));
//	 js.executeScript("arguments[0].value='amazon';", element);
	 
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	     File src = ts.getScreenshotAs(OutputType.FILE);
	     File dest=new File("D:\\TS Shots\\guru.png");
	     
	     Files.move(src, dest);
	           
	 
	 
	 
	
	

}
}