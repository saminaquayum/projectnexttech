package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;//webdriver and chromedriver import from selenium library
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageObjectModel.AmazonsearchPOM;

import cucumber.api.java.en.Given; //given when import from cucumber library,,gerkin=cucumber
import cucumber.api.java.en.Then;

public class Amazonsearch {

	WebDriver driver;//this driver here is global driver(variable) means inside the web/internet
	

	@Given("^user visit amazon home page$")
	public void user_visit_amazon_home_page() throws Throwable {
        // how to open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();//creating new object
		// implicit wait syncronization //soft wait
		 
		 //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicit wait use in between browser and url open
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// how to max the window to get all web elements visible
		// driver.manage().window().maximize();
		
		
		// how to open the URL
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	 ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollby(0,3000)");
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,5000)", "");
		
		
		Thread.sleep(5000);
	}

	@Given("^user search by \"([^\"]*)\"$")
	public void user_search_by(String arg1) throws Throwable {
		AmazonsearchPOM AS = new AmazonsearchPOM(driver);//this driver is global driver 
		AS.Searchbox().sendKeys(arg1);
		//Explicit wait syncronization **explicit wait also known as WebDriverWait //soft wait
		// WebDriverWait wait = new WebDriverWait(driver,20);  //explicit wait use in between web element,object of the application
		
		// Thread.sleep(5000);  //hard wait
		
		
	}

	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
		AmazonsearchPOM AS = new AmazonsearchPOM(driver);//this driver is global 
		AS.searchbutton().click();
		
		// WebDriverWait wait = new WebDriverWait(driver,20); //explicit wait //soft wait
		
		driver.quit();
		// Thread.sleep(10000);// hard wait
	}

}
