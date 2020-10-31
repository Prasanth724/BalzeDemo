package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ConfirmationPage extends TestBase{

	public String confirmationPageTilte(){
		return driver.getTitle();
	}
	
	WebElement id =driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(2)"));
	
	public String confirmid(){
	return	id.getText();
	}
}
