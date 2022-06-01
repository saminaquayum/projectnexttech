package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellSolutionsPOM {

	WebDriver driver;   //WebDriver=variable type,driver=variable name, WebDriver driver=attiribute,properties,variable of the POM class.

	public DellSolutionsPOM(WebDriver driver) {
		this.driver = driver;              // this =object of the corrent page, PageFactory is a class given by selenium
											//initElements is a method where in peremeters we can pass webdriver(driver) and object of the page(this)
	PageFactory.initElements(driver, this);//this line helps to activate all the locator (xpath) of webelements we keep in this POM class.otherwise all 
	}                                       //locator(webelement) gonna be deactivate,we woun't be able to use them.
	
   @FindBy(xpath = "//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/a")
   WebElement mouseover;
   public WebElement mouseover() {
	return mouseover;
	
}
 
   @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[4]")//@means giving instruction
      WebElement  cloudSolutions ;
   public WebElement  cloudSolutions() {
	return cloudSolutions;
	   
   }
   @FindBy(xpath="//a[text()='Multi Cloud Data Services']")
       WebElement multiCloudDataServices;
      public WebElement multiCloudDataServices() {
		return multiCloudDataServices;
    	  
      }
      
      @FindBy(xpath="//*[@id=\"tt-content\"]/div[1]/div/ul/li/div/div/div/div[2]/div[1]/div/div/h1[2]")
      WebElement multiCloudePage ;
      public  WebElement multiCloudePage() {
		return multiCloudePage;
    	  
      }
      
}





