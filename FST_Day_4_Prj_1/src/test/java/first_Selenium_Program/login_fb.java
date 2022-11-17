package first_Selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_fb {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\035852744\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("testmail.com");
		driver.findElement(By.id("pass")).sendKeys("test1234");
		driver.findElement(By.name("login")).click();
		
	}
	
	
	
}
