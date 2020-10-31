package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class PurchasePage extends TestBase {

	JavascriptExecutor js;
	WebElement PurchaseFlightBtn =driver.findElement(By.xpath("//body/div[2]/form[1]/div[11]/div[1]/input[1]"));
	
	WebElement totalCost = driver.findElement(By.cssSelector(" em:nth-child(1)"));
	public String PurchasePageTitle(){
		return driver.getTitle();
	}
	
	public ConfirmationPage ClickonPurchseFlitBtn(){
		String textofTotalCost = totalCost.getText();
		System.out.println("total cost = "+textofTotalCost);
		 js =(JavascriptExecutor)driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		PurchaseFlightBtn.click();
		System.out.println("clicked on purchase flight button");
		return new ConfirmationPage();
	}
	
}
