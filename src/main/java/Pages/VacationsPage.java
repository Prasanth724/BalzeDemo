package Pages;

public class VacationsPage extends TestBase {

	
	public String verifyTitle(){
		return driver.getTitle();
		
	}
	
	public void navigateToIndexPage(){
	    driver.navigate().back();	
	}
	
}
