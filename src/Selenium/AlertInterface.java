package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInterface {

	public static void main(String[] args) throws InterruptedException {
		
		
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		
/*		driver.findElement(By.partialLinkText("Login")).click();
		Thread.sleep(5000);
		Alert alt =driver.switchTo().alert();
		
   	   String text = alt.getText();
		   System.out.println(text);
		
		        alt.accept();
		       alt.dismiss();
		*/
		
		
		
		/////////////Requirement////////////////////
		driver.get("file:///D:/Websites/alerts.html");
		Thread.sleep(10000);
//		WebElement link=driver.findElement(By.partialLinkText("index"));
//		Thread.sleep(5000);
//		link.click();
		
		driver.findElement(By.className("confirmation")).click();
		Thread.sleep(5000);
		Alert alt =driver.switchTo().alert();
		      alt.accept();
		         
		
		
		
		
		         Alert al =driver.switchTo().alert();
		                 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
