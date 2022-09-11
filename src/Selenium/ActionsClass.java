package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Websites/Testteams.html");
		
		driver.manage().window().maximize();
		
		
		Actions action = new Actions(driver);
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement ele=driver.findElement(By.xpath("//a[text()='Sell']"));
//		action.contextClick(ele).perform();
		  
//		WebElement ele=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
//				
//			action.moveToElement(ele).perform();
		
		
		
		
		
				
//		WebElement srcele=driver.findElement(By.xpath("//a[text()='Gift Cards']"));
//		 WebElement trgtele=driver.findElement(By.id("twotabsearchtextbox"));
//			action.dragAndDrop(srcele, trgtele).perform();
//			action.clickAndHold(srcele).perform();
//			action.clickAndHold(srcele).contextClick(srcele).build().perform();
//			action.pause(Duration.ofSeconds(5)).perform();
//		action.doubleClick(ele).perform();
		
		      WebElement ele =driver.findElement(By.id("teams"));
//		          
		          ele.click();
		          
		
				action.keyDown(Keys.SHIFT).sendKeys(Keys.HOME).keyUp(Keys.SHIFT).build().perform();
	
				action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
				
				driver.findElement(By.id("get")).click();
				
				action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
				
		
		WebElement opt1=driver.findElement(By.xpath("//option[text()=' India']"));
		WebElement opt2=driver.findElement(By.xpath("//option[text()='  Australia']"));
		WebElement opt3=driver.findElement(By.xpath("//option[text()=' England']"));
		
		
		action.click(opt1).keyDown(Keys.CONTROL).click(opt2).click(opt3).keyUp(Keys.CONTROL).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
