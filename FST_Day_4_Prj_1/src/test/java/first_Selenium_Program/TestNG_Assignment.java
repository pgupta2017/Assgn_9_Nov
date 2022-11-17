package first_Selenium_Program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Assignment {
	WebDriver driver;
@Test
public void LaunchFB()
{
	
	driver.findElement(By.id("email")).sendKeys("testmail.com");
	driver.findElement(By.id("pass")).sendKeys("test1234");	
}

@BeforeMethod
public void Credentials()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\035852744\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}

@AfterMethod
public void closebrowser()

{
	
driver.close();

}
}