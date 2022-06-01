package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellActionPOM {
	
	WebDriver driver;
	//constructor is not a method but special type of method.constructor name should be the same name as class name.there is no return type
		public DellActionPOM(WebDriver driver) {
			this.driver = driver;

			PageFactory.initElements(driver, this);
	
		}
	
		@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/a")
		WebElement act_Solutions;
		public WebElement Solutions() {
		return act_Solutions;
		}

		//@FindBy(xpath="/html/body/main/header/div[3]/nav/ul/li[2]/ul/li[1]/a")
		@FindBy(xpath="//a[text()=\"View All Solutions\"]")
		WebElement click_AllSolutions;
		public WebElement AllSolutions() {
		return click_AllSolutions;
		}
		
		

}
