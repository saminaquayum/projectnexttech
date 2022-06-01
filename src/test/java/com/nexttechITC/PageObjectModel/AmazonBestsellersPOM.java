package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.nexttechITC.Stepdefs.AmazonBestsellersPOM;

public class AmazonBestsellersPOM {
	
	//a[@href="/gp/bestsellers/?ref_=nav_cs_bestsellers"]
	

		WebDriver driver;
	//constructor is not a method but special type of method.constructor name should be the same name as class name.there is no return type
		public AmazonBestsellersPOM  (WebDriver driver) {
			this.driver = driver;

			PageFactory.initElements(driver, this);
		}

		 @FindBy(xpath="//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")
		//@FindBy(name = "field-keywords")
		WebElement click_bestsellers;

		public WebElement bestsellers() {
			return click_bestsellers;
			
			
		}
	
		@FindBy(xpath=" //*[@id=\"zg_banner_text\"]")
		WebElement displayed;
	 
	
	
	
	}

