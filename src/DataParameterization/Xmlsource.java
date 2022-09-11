package DataParameterization;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Xmlsource {
	
	public static void main(String[] args) throws ParserConfigurationException, FileNotFoundException, SAXException, IOException {
		
	
	
	
	DocumentBuilderFactory dfb= DocumentBuilderFactory.newInstance();
	DocumentBuilder db = dfb.newDocumentBuilder();
    Document document =db.parse(new FileInputStream(new File(""))) ;   
                           //parse will convert raw data to readable format 
    NodeList allnodes =document.getElementsByTagName("password");
    
    
    if (allnodes.getLength() ==1) {
    	 Element Elem = (Element) allnodes.item(0);
    	 
    	 if (Elem.hasAttribute("LocatorName") && Elem.hasAttribute("LocatorValue") ) {
    	 
    	                  String Name =Elem.getAttribute("LocatorName");
    	                  String Value  =Elem.getAttribute("LocatorValue");
    	                  By by =null;
    	                  switch (Name.toLowerCase()) {
						case "id":
							    by=By.id(Value);
							break;
						case "name":
							by =By.name(Value);
							break;
						case "xpath":
							by=By.xpath(Value);
							break;
						case "linktext":
							by = By.linkText(Value);
							break;
							
						case"css" :
							by = By.cssSelector(Value);
							break;
							default:
								System.out.println("Invalid locator has been provided for the password element."+"(locator should be css,xpath,id,name,linktext)");}
    	 }
    	                  else {
    	                	System.out.println("unable to get the locator for the password");  
    	                  }
    	 }     
    	 
    else if(allnodes.getLength()==0){
    	
    	System.out.println("unable to get the info for element password,bez elenent entry is not defined in the node list");
    }
    else {
    	System.out.println("unable to get info for element , multiple entries are over there for password element");
    }
    	 
    
}
}