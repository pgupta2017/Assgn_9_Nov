package first_Selenium_Program;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Methods {
	
		@Test
		public void printName()
		{	
		System.out.println("Print1");
	}
		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("BeforeMethod");
			
		}
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("AfterMethod");
			
		}
		@BeforeClass
		public void beforeclass()
		{
			System.out.println("BeforeClass");
			
		}

		@AfterClass
		public void afterclass()
		{
			System.out.println("AfterClass");
			
		}
		
}
