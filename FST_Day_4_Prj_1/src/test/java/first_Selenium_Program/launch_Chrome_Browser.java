package first_Selenium_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_Chrome_Browser {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\035852744\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	
	
}
