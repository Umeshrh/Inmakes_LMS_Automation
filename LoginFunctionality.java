package org.stepdefinition;

import static org.junit.Assert.assertEquals;

import org.bas.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginFunctionality extends BaseClass{
	
	@Given("user launches the login page")
	public void user_launches_the_login_page() {
		launchBrowser();
		launchUrl("https://lh.inmakesedu.com/");
		windowMaximize();
	    
	}

	@Then("the page title should be {string}")
	public void the_page_title_should_be(String expectedTitle) {
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Page title is " + actualTitle);
			
		} 
		else {
			System.out.println("page title differs....");

		}
		closeEntireBrowser();
		
		
	    
	}

	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
	    
	}

	@When("to launch the url of Inmakes home page")
	public void to_launch_the_url_of_Inmakes_home_page() {
		launchUrl("https://lh.inmakesedu.com/");
		WebElement Login = driver.findElement(By.xpath("(//a[text()='Login'])[1]"));
		Login.click();
	    
	}

	@When("user has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String string) {
		WebElement emailBox = driver.findElement(By.name("email"));
		emailBox.sendKeys(string);
	    
	}

	@When("user has to pass the data {string}in password field")
	public void user_has_to_pass_the_data_in_password_field(String string) {
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(string);
	    
	}

	@When("user has to click the login button")
	public void user_has_to_click_the_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login']"));
		loginBtn.click();
	    
	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	    
	}



}
