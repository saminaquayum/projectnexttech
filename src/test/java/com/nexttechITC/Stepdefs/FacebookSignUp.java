package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechITC.PageObjectModel.FacebookSignUpPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookSignUp {

	WebDriver driver;//global driver

	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");

	}

	@When("^user enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		FacebookSignUpPOM obj = new FacebookSignUpPOM(driver);

		obj.firstname().sendKeys(arg1);
		obj.lastname().sendKeys(arg2);
		obj.email().sendKeys(arg3);
		obj.password().sendKeys(arg4);
	}

	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
		FacebookSignUpPOM se1 = new FacebookSignUpPOM(driver);

		Select dropdown = new Select(se1.click_month);
		// dropdown.selectByValue("6");
		//dropdown.selectByIndex(5);
		dropdown.selectByVisibleText("Jun");
		
		Select dropdown1 = new Select(se1.click_day);
		//dropdown1.selectByValue("6");
        //dropdown1.selectByIndex(5);
		dropdown1.selectByVisibleText("4");
		
		Select dropdown2 = new Select(se1.click_year);
		//dropdown2.selectByValue("1999");
		//dropdown2.selectByIndex();
		dropdown2.selectByVisibleText("1999");
		driver.quit();
	}

}
