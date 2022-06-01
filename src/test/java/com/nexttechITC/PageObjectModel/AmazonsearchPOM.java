package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;    //WebDriver import selenium library
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonsearchPOM {

	WebDriver driver;//global variable,globally means inside the web/internet
//constructor is not a method but special type of method.constructor name should be the same name as class name.there is no return type
	
	public AmazonsearchPOM(WebDriver driver) {  //in parameter this driver is local //we use constructor to reuse our code like inheritance
		this.driver = driver;   //this means this class                                           //any oop concept we use to reuse our code

		PageFactory.initElements(driver, this);
	}
     //locator of the element
	// @FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	@FindBy(name = "field-keywords")// we did 3 things here 1.first we are gonna get locator for this web elements.To get the locator the code is @FindBy(xpath="value")
	WebElement edit_serchbox;                         //   2.we r gonna declare the web element that this is a WebElement(type/editable,clickable)     "  (id="value")
        public WebElement Searchbox() {                  //   3.we have to create a method of WebElement..                                                "  (name="value")
		return edit_serchbox;
		                                              //WebElement is a keyword from selenium
	}                                                 //each and every webelement we have to create method

	@FindBy(id = "nav-search-submit-button")
	WebElement click_searchbutton;         
        public WebElement searchbutton() {                     
		return click_searchbutton;
		
	}//method and attribute we r looking for

}
