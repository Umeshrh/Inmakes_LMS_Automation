package org.stepdefinition;

import org.bas.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BottomPageLinks extends BaseClass {
	
	@Given("to launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
		
	    
	}

	@When("to launch the url of the Inmakes home page")
	public void to_launch_the_url_of_the_Inmakes_home_page() {
		launchUrl("https://lh.inmakesedu.com/");
	    
	}

	@When("to verify the presence of the bottom links")
	public void to_verify_the_presence_of_the_bottom_links() {
		WebElement element = driver.findElement(By.xpath("//a[text()='Home']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)" , element);
		WebElement homePage = driver.findElement(By.xpath("//a[text()='Home']"));
		System.out.println(homePage.isDisplayed() + " the 'Home' link is located");
		WebElement allCourses = driver.findElement(By.xpath("(//a[text()='All course'])[2]"));
		System.out.println(allCourses.isDisplayed() + " the 'All courses' link is located");
		WebElement login = driver.findElement(By.xpath("(//a[text()='Login'])[2]"));
		System.out.println(login.isDisplayed() + " the 'Login' link is located");
		WebElement userAgreement = driver.findElement(By.xpath("//a[text()='User agreement']"));
		System.out.println(userAgreement.isDisplayed() + " the 'User Agreement' link is located");
		WebElement privacyPolicy = driver.findElement(By.xpath("//a[text()='Privacy policy']"));
		System.out.println(privacyPolicy.isDisplayed() + " the 'Privacy policy' link is located");
	    
	}

	@When("to click each link one by one and verify navigation")
	public void to_click_each_link_one_by_one_and_verify_navigation() {
		WebElement element = driver.findElement(By.xpath("//a[text()='Home']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)" , element);
		WebElement homePage = driver.findElement(By.xpath("//a[text()='Home']"));
		homePage.click();
		WebElement allCourses = driver.findElement(By.xpath("(//a[text()='All course'])[2]"));
		allCourses.click();
		WebElement login = driver.findElement(By.xpath("(//a[text()='Login'])[2]"));
		login.click();
		WebElement userAgreement = driver.findElement(By.xpath("//a[text()='User agreement']"));
		userAgreement.click();
		WebElement privacyPolicy = driver.findElement(By.xpath("//a[text()='Privacy policy']"));
		privacyPolicy.click();
	    
	}
	
	@Then("To close the entire browser")
	public void to_close_the_entire_browser() {
		closeEntireBrowser();
	    
	}





}
