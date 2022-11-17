package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinationclass {
	
	WebDriver driver;
	
	@Given("user navigates to facebook application")
	public void user_navigates_to_facebook_application() {
		System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");

	       driver = new ChromeDriver();
	       driver.get("https://www.facebook.com/");
		
		// Write code here that turns the phrase above into concrete actions
	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
		
		driver.findElement(By.id("email")).sendKeys("gupta_priya15@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("Monika@86");
		driver.findElement(By.name("login")).click();
	    // Write code here that turns the phrase above into concrete actions
	    }

	@Then("display user logged in successfully")
	public void user_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Logged in to facebook Successfully");
	}

	
	@When("user enters invalid credentials")
	public void user_enters_invalid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys("test@test.com");
		driver.findElement(By.id("pass")).sendKeys("Password");
		driver.findElement(By.name("login")).click();
	}

	@Then("display user will not be logged in successfully")
	public void user_will_not_be_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cannot log into facebook");
	}
	
	@Then("Close browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	}
	

}
