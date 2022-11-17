package first_Selenium_Program;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Launch_Firefox {

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\035852744\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");  
		
		
	WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	} }

	