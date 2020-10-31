package TestPages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.PurchasePage;
import Pages.ReservePage;
import Pages.TestBase;

public class ReservePageTest extends TestBase {

	ReservePageTest(){
		super();
	}
	
	HomePage homepg;
	ReservePage resevpage;
	PurchasePage purpage;
	
	@BeforeTest
	public void setupp(){
		TestBase.initialize();
		homepg = new HomePage();
		homepg.flightSelection();
			
		
	}
	
	@Test(priority=1)
	public void ReserveFlights()
	{
		resevpage = new ReservePage();
		String reserTitle= resevpage.gettitleofReservePage();
		System.out.println("title of reserve page = "+reserTitle);
		resevpage.SelectFlight();
		
		
	}
	
}
