package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class stepdefinationclass {
	
	WebDriver driver;
	
	@Given("User navigates to the upskills site")
	public void user_navigates_to_the_upskills_site() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\035852744\\Downloads\\chromedriver_win32\\chromedriver.exe");

	       driver = new ChromeDriver();
	       driver.get("http://elearningm1.upskills.in/index.php");
	}

	@When("User clicks on sign up option")
	public void user_clicks_on_sign_up_option() {
	   
	driver.findElement(By.xpath("//*[@id=\"login_block\"]/div/ul/li/a")).click();
	}

	@When("User enters First Name AND Last Name")
	public void user_enters_First_Name_AND_Last_Name() {

		driver.findElement(By.name("firstname")).sendKeys("Priya");
		driver.findElement(By.name("lastname")).sendKeys("Gupta");
	    
	}

	@When("User enters email")
	public void user_enters_email() {
		driver.findElement(By.name("email")).sendKeys("gupta_priya15@gmail.com");	    
	}

	@When("User enters Username")
	public void user_enters_Username() {
		driver.findElement(By.name("username")).sendKeys("pgupta");
	}

	@When("User enters pass")
	public void user_enters_pass() {
		driver.findElement(By.name("pass1")).sendKeys("Test@1234");
	}

	@When("User enters confirm password")
	public void user_enters_confirm_passwors() {
		driver.findElement(By.name("pass2")).sendKeys("Test@1234");
	}

	@When("User clicks on Register button")
	public void user_clicks_on_Register_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("User will be successfully signed up")
	public void user_will_be_successfully_signed_up() {
		driver.findElement(By.xpath("//*[@id=\"logout_button\"]"));
		driver.close();
	    System.out.println("Registration complete successfully");
		
	}
	
	@Given("User logins to upskill site")
	public void user_logins_to_upskill_site() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\035852744\\Downloads\\chromedriver_win32\\chromedriver.exe");

	       driver = new ChromeDriver();
	       driver.get("http://elearningm1.upskills.in/index.php");
	       driver.manage().window().maximize();
	       driver.findElement(By.name("login")).sendKeys("pgupta");
	       driver.findElement(By.name("password")).sendKeys("Test@1234");
	       driver.findElement(By.name("submitAuth")).click();
	}

	@When("User navigates to Inbox")
	public void user_navigates_to_Inbox() {
	    driver.findElement(By.xpath("//*[@id=\"profileCollapse\"]/div/ul/li[1]/a")).click();
	}

	@When("User clicks on compose message")
	public void user_clicks_on_compose_message() {
		driver.findElement(By.xpath("//*[@id=\"toolbar\"]/div/div[1]/a[1]/img")).click();
	}

	@When("User enters Send to deatils")
	public void user_enters_Send_to_deatils() {
		driver.findElement(By.xpath("//*[@id=\"compose_message\"]/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys("ami");
		driver.findElement(By.xpath("//*[@id=\"select2-users-results\"]/li[4]")).click();
	}

	@When("User enters Subject")
	public void user_enters_Subject() {
	    driver.findElement(By.name("title")).sendKeys("Test Mail");
	}

	@When("User clicks on Send Message")
	public void user_clicks_on_Send_Message() {
	    driver.findElement(By.name("compose")).click();
	}

	@Then("User will be able to send mail successfully")
	public void user_will_be_able_to_send_mail_successfully() {
		String ActualTitle = driver.getTitle();
	    String ExpectedTitle = "The message has been sent to Amit xyz";
	        Assert.assertEquals(ActualTitle,ExpectedTitle);
	        System.out.println("Assert passed");
	        
	}

}
