package org.stepdefinition;

import org.bas.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AddToCart extends BaseClass {
	
	
	
	@Given("the user is on the homepage")
	public void the_user_is_on_the_homepage() {
		launchBrowser();
		launchUrl("https://lh.inmakesedu.com/");
		windowMaximize();
	   
	}

	@When("the user clicks the search box")
	public void the_user_clicks_the_search_box() throws InterruptedException {
		Thread.sleep(3000);
		WebElement searchBox = driver.findElement(By.name("query"));
		searchBox.click();
	    
	}

	@When("searches for {string}")
	public void searches_for(String courseName) {
		WebElement searchBox = driver.findElement(By.name("query"));
		searchBox.sendKeys("Software Testing");
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).perform();
		
	   
	}

	@When("clicks on {string} for the Software Testing Internship course")
	public void clicks_on_for_the_Software_Testing_Internship_course(String buttonText) throws InterruptedException {
	
		WebElement element = driver.findElement(By.xpath("//h5[text()='Software Testing Master ']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.id("btn_cart_39"));
		button.click();
	    
	}

	@Then("the button should change to {string}")
	public void the_button_should_change_to(String expectedText) {
		
		WebElement button = driver.findElement(By.id("btn_cart_38"));
		String actualText = button.getText();
		if (actualText.equals(expectedText)) {
			System.out.println("The buttton remains same...");
			
		} 
		else {
			System.out.println("The button changed from 'add to cart' to 'remove cart'..");
			

		}
		
		closeEntireBrowser();
		
		
		
		
	   
	}



}
