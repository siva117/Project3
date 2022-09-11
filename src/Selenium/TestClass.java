package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
       static WebDriver driver;
	   public static void main(String[] args) throws InterruptedException {
		
	    
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
            
	/*	driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(80000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		*/
	/*	
		driver.get("https://freecrm.com/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		driver.manage().window().maximize();
		String username="krishna8712436@gmail.com";
		String password="Krishna@117";
		
		
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //in version 3 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//in version 4
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		*/
	
	
//		driver.get("file:///D:/sendkeys.html");
//		driver.findElement(By.id("pizza")).clear();
		WebElement elem=driver.findElement(By.id("pizza"));
//		Insertvalue(elem, "value");
	/*	Newone s =new Newone();
		 s.Insertvalue(elem, "insertvalue");
		*/
	}
		
	 /*  public static  void Insertvalue(WebElement elem,String input){
			if(elem.isDisplayed()) {
				if(elem.isEnabled()) {
					elem.sendKeys(input);
					
				}else {
					System.out.println("unale to enter the value into the field,bcz element is disabled");
				}
				
			}else {
				System.out.println("unale to enter the value into the field,bcz the element is not visible");
				
			}}
		*/
	
	
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


