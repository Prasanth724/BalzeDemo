package TestPages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.PurchasePage;
import Pages.ReservePage;
import Pages.TestBase;

public class PurchasePageTest extends TestBase {

	PurchasePageTest(){
		super();
	}
	
	HomePage homepg;
	ReservePage resevpage;
	PurchasePage purpage;
	
	@BeforeTest
	public void start(){
		TestBase.initialize();
		homepg = new HomePage();
		homepg.flightSelection();
	}
	
	
	@Test(priority=1)
	public void m1(){
		resevpage = new ReservePage();
		resevpage.SelectFlight();
		
		
	}
	
	@Test(priority=2)
	public void m2(){
		purpage = new PurchasePage();
	String purchasepatitle=	purpage.PurchasePageTitle();
	System.out.println("purchase page title = "+purchasepatitle);
	purpage.ClickonPurchseFlitBtn();
	}
	
	
}
