package first_Selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercie2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\035852744\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("cage")).clear();
		driver.findElement(By.id("cage")).sendKeys("30");
		driver.findElement(By.id("cheightmeter")).clear();
		driver.findElement(By.id("cheightmeter")).sendKeys("165");
		driver.findElement(By.id("ckg")).clear();
		driver.findElement(By.id("ckg")).sendKeys("55");
		//driver.findElement(By.xpath("//src[@Attribute='d26tpo4cm8sb6k.cloudfront.net/img/svg/calculate.svg']")).click();
	}
	
	
	
}