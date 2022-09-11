package Selenium;

import org.openqa.selenium.WebElement;

public class Newone {
	
	
	
	public   void Insertvalue(WebElement elem,String input){
		if(elem.isDisplayed()) {
			if(elem.isEnabled()) {
				elem.sendKeys(input);
				
			}else {
				System.out.println("unale to enter the value into the field,bcz element is disabled");
			}
			
		}else {
			System.out.println("unale to enter the value into the field,bcz the element is not visible");
			
		}}
	
	
	

}
