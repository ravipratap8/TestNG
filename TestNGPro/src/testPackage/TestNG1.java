package testPackage;

import java.sql.Date;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@AfterTest
	public void TestCleanup()
	{
		System.out.println("This method should run in the end");
	}
	@BeforeSuite
	@Test
	public void show()
	{
		System.out.println("show Method on TestNG1 Class");
	}
	
	@Test (groups= {"Smoke"})
	public void dateandTime()
	{
			
		System.out.println("TestNG1> Test2");
	}

}
