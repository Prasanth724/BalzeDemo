package TestPages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.TestBase;
import Pages.VacationsPage;

public class VacationsPageTest extends TestBase {

	VacationsPageTest(){
		super();
	}
	
	HomePage homepg;
	VacationsPage vacpage;  
	
	@BeforeTest
	public void seet(){
		TestBase.initialize();
		homepg = new HomePage();
		vacpage = new VacationsPage();
	}
	
	@Test
	public void movetoVacationPage(){
		homepg.navigateToVacationsPage();
		String VacTitle= vacpage.verifyTitle();
		System.out.println("vacations page title = "+VacTitle);
		 vacpage.navigateToIndexPage();
		System.out.println("navigated to home page");
	}
	
}
