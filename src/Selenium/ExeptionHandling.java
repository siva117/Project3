package Selenium;

import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class ExeptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	/*	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
		driver.findElement(By.xpath("//input[@id='empsearch_id']")).click();
		
		
		}
		
		catch(Exception e){
		System.out.println("unable to found the element,its not available in th page for performing click operation");
		}
		finally {
			driver.quit();
		}
		*/
		
		
		driver.get("file:///D:/Websites/Testteams.html");
	/*	
		WebElement ListBox=driver.findElement(By.xpath("//Select[@id='teams']"));
		               
		String[] Countries = {"India","Australia","UAE","Kajakistan","England"};
		
		Select select = new Select(ListBox);
		
		for(String country : Countries) {
			try {
				select.selectByVisibleText(country);
				
			} catch (NoSuchElementException e){
				
				System.out.println(country+": is not found in the list box.unable to select");}
			catch (NullPointerException e) {
				System.out.println(e.getMessage());
				break;
			}finally {
				driver.close();
				System.out.println("finally block has executed");
			}
		*/
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter value for A:");
			int a = sc.nextInt();
			System.out.println("Enter value for B");
			int b=sc.nextInt();
			try {
				int sum=a/b;
				System.out.println(sum+":is result of both variables ");
				
			}catch(ArithmeticException x) {
				
				System.out.println("Cannaot be be performed division with input");
			
			}
			
		
		}catch (InputMismatchException e) {
			
			System.out.println("Invalid input provided");
		}
		finally {
			
			driver.close();	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
		
	}}

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

