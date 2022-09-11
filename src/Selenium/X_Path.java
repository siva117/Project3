package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import DataParameterization.Propsource;

public class X_Path {
	
	public static void main(String[] args) throws InterruptedException {
		
		String path=System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",path+"\\Drivers\\chromedriver.exe");
		
     	WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername'and @type='text'] ")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtUsername'or @id='txtUsername'] ")).sendKeys("Admin");
        Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//div[@id='divLoginButton'] /input[@value='LOGIN']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
