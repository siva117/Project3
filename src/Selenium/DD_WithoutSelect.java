package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DD_WithoutSelect {
	public static void main(String[] args) throws InterruptedException {
		
		
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ui.cogmento.com/");
		
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("krishna8712436@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Krishna@117");
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='users icon']")).click();
		
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		
		WebElement menu=driver.findElement(By.xpath("//div[@role='listbox'and @name='category']"));
		  
		 List<WebElement> items =menu.findElements(By.tagName("span"));
	      
		 String ValueToSelect="Lead";
		 boolean isnotfound =false;
		 
		 for(WebElement item:items) {
			 String itemtext=item.getText();
			 
	     if(itemtext.trim().equalsIgnoreCase(ValueToSelect.trim())) {
			 item.click();
			 isnotfound=true;
			 break; 
		 }}
		 if(!isnotfound) {
			 System.out.println(ValueToSelect+"is not selected from"+items);
			 
		 }
	}}
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	


