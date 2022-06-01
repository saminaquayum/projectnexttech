package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.nexttechITC.PageObjectModel.AmazonBestsellersPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonBestsellers {
	WebDriver driver;

	@Given("^user visits amazon URL$")
	public void user_visits_amazon_URL() throws Throwable {
		// how to open the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		// how to open the URL
		driver.get("https://www.amazon.com/");

	}

	@When("^user click bestseller option$")
	public void user_click_bestseller_option() throws Throwable {
   AmazonBestsellersPOM obj = new AmazonBestsellersPOM (driver);
   obj.bestsellers().click();
	}

	@Then("^user will be able to redirect to the page$")
	public void user_will_be_able_to_redirect_to_the_page() throws Throwable {
		//AmazonBestsellersPOM obj1 = new AmazonBestsellersPOM (driver);

       driver.quit();
		


	}

}
