package testPackage;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class ParamData {
	
	
	@Parameters({"URL"})	
	@Test
	public void printURL(String URLname)
	{
		System.out.println("URL Name is:--" +URLname);
	}
	
	@Parameters({"UserName","Password","User1","User2"})
	@Test
	public void LoginToDemoPortal(String username, String password, String user1,String user2)
	{
		System.out.println(username);
		System.out.println(password);
		System.out.println(user1);
		System.out.println(user2);
	}

}
