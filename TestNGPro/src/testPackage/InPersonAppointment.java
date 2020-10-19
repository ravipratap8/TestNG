package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class InPersonAppointment {

	
	@BeforeClass
	public void BeforeInPersonAppointmentClass()
	{
		System.out.println("Before InPerson Appointment Class");
	}
	@BeforeMethod
	public void InPersonAptmnt() {
		System.out.println("Before Method InPersonAppointmentVerification");
	}

	@Test(groups={"Smoke"})
	public void CancelInPersonAptmnt() {
		System.out.println("Cancel InPerson Aptmnt");
	}

	@AfterMethod
	public void BookInPersonApntmnt() {
		System.out.println("AfterMethod Code Block Book InPerson Appointment");
	}

	@BeforeTest
	public void Beforanytest() {
		System.out.println("This method will run first");
	}
	
	@AfterClass
	public void AfterClassMethod()
	{
		System.out.println("After Class InPersonAppointment Method");
	}

}
