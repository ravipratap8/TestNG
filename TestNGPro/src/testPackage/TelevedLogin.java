package testPackage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class TelevedLogin {
	
	
	@AfterSuite
	@Test
	public void LaunchandLogin()
	{
		System.out.println("-After Suite- TelevedLogin> Test3(LaunchandLogin)");
	}
	
	

}
