package TestPages;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ConfirmationPage;
import Pages.HomePage;
import Pages.PurchasePage;
import Pages.ReservePage;
import Pages.TestBase;

public class ConfirmationPageTest extends TestBase{

	ConfirmationPageTest(){
		super();
	}
	
	HomePage homepg;
	ReservePage resevpage;
	PurchasePage purpage;
	ConfirmationPage cnfrmpage;
	@BeforeTest
	public void start(){
		TestBase.initialize();
		homepg = new HomePage();
		homepg.flightSelection();
		
	}
	
	@Test(priority=1)
	public void md(){
		resevpage = new ReservePage();
		resevpage.SelectFlight();
		purpage = new PurchasePage();
		purpage.ClickonPurchseFlitBtn();
		
	}
	
	@Test(priority=2)
	public void md2(){
		cnfrmpage = new ConfirmationPage();
	    String confTitle=cnfrmpage.confirmationPageTilte();
	   System.out.println("confirmation page tilte"+confTitle);
	  String coid= cnfrmpage.confirmid();
       System.out.println("id = "+coid);
	}
	
	@AfterTest
	public void teardown(){
		driver.quit();
	}
	
}
