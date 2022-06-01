package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.nexttechITC.PageObjectModel.DellActionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction {
	
	WebDriver driver;
	
	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//soft wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//how to maximize the browser
		driver.manage().window().maximize();

		//how to open url driver.get method
		driver.get("https://www.dell.com/en-us");
		//Thread.sleep(10000);
		

	}

	@When("^user go to Solutions dropdown menu and able to see View All Solutions$")
	public void user_go_to_Solutions_dropdown_menu_and_able_to_see_View_All_Solutions() throws Throwable {
	    
		Actions act =new Actions (driver);
		DellActionPOM obj =new DellActionPOM (driver);
		//act.moveToElement(obj.Solutions()).build().perform();
		act.moveToElement(obj.Solutions()).build().perform();
		obj.AllSolutions().click();
		WebDriverWait wait=new WebDriverWait(driver,20);
	}

	@Then("^user redirects to solution portfolio$")
	public void user_redirects_to_solution_portfolio() throws Throwable {
	    boolean verification =  driver.findElement(By.xpath("//h1[text()=\"Solutions Portfolio\"]")).isDisplayed();
	     Assert.assertTrue(verification);
	     
	     
	     driver.quit();
	     
	}
	


	
	
	
	
	
	
	
	

}
