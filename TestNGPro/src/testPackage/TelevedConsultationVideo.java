package testPackage;

import org.testng.annotations.Test;
import com.beust.jcommander.Parameters;

public class TelevedConsultationVideo {
	
	
	@Test
	public void AppointmentVideo()
	{
		System.out.println("Testing Video Consultency");
	}
	
	@Test(groups={"Smoke"})
	public void AppointmentCanceVideo()
	{
		System.out.println("Cancel Video Appointment");
	}
   
	
	@Test(enabled=true)
	public void AppointmentNextDayVid()
	{
		System.out.println("Check Next Day Appointment");
	}
	
	
	@Test(timeOut=4000)
	public void LoginandgotoAppointmentPage()
	{
		System.out.println("dependsOnMethods -Login and Go To Appointment Page");
	}
	
	@Test (dependsOnMethods={"LoginandgotoAppointmentPage"})
	public void verifyAppointmentPage()
	{
		System.out.println("Verify Appointment Page");
	}
	
	@Test (dependsOnMethods= {"LoginandgotoAppointmentPage"})
	public void ChangeDoctoronAppointmentPage()
	{
		System.out.println(" Change Doctor on Appointment Page");
	}
	
	
}
