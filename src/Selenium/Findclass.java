package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findclass {
 static WebDriver driver;
	public static void countClass(int e) {
		
		List<WebElement> allelem=driver.findElements(By.xpath("//body/table/tbody/tr[*]/td[2]"));
		
		for(int i=0;i<=4;i++) {
			
		String j=	allelem.get(i).getText();
	    System.out.println(j);
			
		}
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/askri/Downloads/html.html");
		countClass(9);
    	
		
	}
	
	
	
	
}
