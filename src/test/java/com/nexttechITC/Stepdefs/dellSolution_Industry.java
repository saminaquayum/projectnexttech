package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dellSolution_Industry {

	WebDriver driver;

	@Given("^user visit dell homepage$")
	public void user_visit_dell_homepage() throws Throwable {

		// System.setProperty("webdriver.chrome.driver", "C:\\Program
		// Files\\chromedriver_win32\\chromedriver.exe");
		// driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.dell.com/en-us");
	}

	@When("^user go to solutions menu and mouse over industry solutions$")
	public void user_go_to_solutions_menu_and_mouse_over_industry_solutions() throws Throwable {

		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/a")))
				.build().perform();
		ac.moveToElement(driver.findElement(By.xpath("//a[text()=\"Industry Solutions\"]"))).build().perform();

	}

	@When("^user click View All Industry Solutions$")
	public void user_click_View_All_Industry_Solutions() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[7]/ul/li[3]/a"))
				.click();
	}

	@Then("^user able to redirect to the derise page succesfully$")
	public void user_able_to_redirect_to_the_derise_page_succesfully() throws Throwable {

		driver.quit();
	}

}
