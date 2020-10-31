package TestPages;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.ReservePage;
import Pages.TestBase;
import Pages.VacationsPage;

public class HomePageTest extends TestBase {

	HomePageTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	HomePage homepg;
	ReservePage resevpage;
	
	@BeforeTest
	public void setupp(){
		TestBase.initialize();
		homepg = new HomePage();
//		resevpage = new ReservePage();
	}
	@Test(priority=1)
	public void homepageHeaderValidationTest(){
		String actual = homepg.indexHeader();
	     System.out.println("actual header = "+actual);
	
	}
	
	
	@Test(priority=2)
	public void FlightSelectionTest(){
		homepg.flightSelection();
	}

}
