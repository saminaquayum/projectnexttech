package com.nexttechITC.Stepdefs;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.nexttechITC.PageObjectModel.DellSolutionsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellSolutions {

	WebDriver driver;

	@Given("^user visit Dell homepage$")
	public void user_visit_Dell_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// soft wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// how to maximize the browser
		driver.manage().window().maximize();

		// how to open url driver.get method
		driver.get("https://www.dell.com/en-us");
		// Thread.sleep(10000);

	}

	@When("^user go to Solutions menu$")
	public void user_go_to_Solutions_menu() throws Throwable {
     Actions Sl = new Actions(driver);
     DellSolutionsPOM obj = new DellSolutionsPOM (driver);
		Sl.moveToElement(obj.mouseover()).build().perform();
	    Thread.sleep(1000);
		
     
	}

	@When("^user mouse over cloud solutions$")
	public void user_mouse_over_cloud_solutions() throws Throwable {
     Actions cs = new Actions(driver);
     DellSolutionsPOM obj = new DellSolutionsPOM (driver);
     cs.moveToElement(obj.cloudSolutions()).build().perform();
     Thread.sleep(1000);
     
	}

	@Then("^user click on multi cloud data services$")
	public void user_click_on_multi_cloud_data_services() throws Throwable {
		DellSolutionsPOM obj = new DellSolutionsPOM (driver);
		obj.multiCloudDataServices().click();
	    Thread.sleep(1000);
	}

	@Then("^user  able to redirect to multi cloude data services page$")
	public void user_able_to_redirect_to_multi_cloude_data_services_page() throws Throwable {
		DellSolutionsPOM obj = new DellSolutionsPOM (driver);
		obj.multiCloudePage();
		
		// boolean result= driver.findElement(By.xpath("//*[@id=\"tt-content\"]/div[1]/div/ul/li/div/div/div/div[2]/div[1]/div/div/h1[2]")).isDisplayed();
     //Assert.assertTrue(result);
		
     driver.quit();
	}

}
