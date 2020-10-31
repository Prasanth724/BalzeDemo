package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReservePage extends TestBase {

	WebElement chooseFlight= driver.findElement(By.cssSelector("tr:nth-child(1) .btn"));
	
	public String gettitleofReservePage(){
		return driver.getTitle();
	}
	
	public PurchasePage SelectFlight(){
		chooseFlight.click();
		return new PurchasePage();
	}
	
}
