package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Websites/mainpage.html");
		
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("asdsf")).sendKeys("siva");
		
		driver.findElement(By.id("asghf")).sendKeys("krishna");
		
		
		driver.findElement(By.id("asdhj")).sendKeys("766576357673");
		
		
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.id("txtusername")).sendKeys("asshgjhgkjh");
		driver.findElement(By.id("txtpassword")).sendKeys("000000");
		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[text()='Outlook']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
