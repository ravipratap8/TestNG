package testPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {
	
	@DataProvider
	@Test
	public Object[][] getData()
	{
		Object[][] dataSet=new Object[3][2];
		
		// First Data Set
		dataSet[0][0]="UserName1";
		dataSet[0][1]="Password1";
		
		// Second Data Set
		dataSet[1][0]="UserName2";
		dataSet[1][1]="Password2";
		
		// Third Data Set
		dataSet[2][0]="UserName3";
		dataSet[2][1]="Password3";
		
		return dataSet;
	}
	
	@Test(dataProvider="getData")
	public void LoginwithDifferentUserName(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	
	
	

}
