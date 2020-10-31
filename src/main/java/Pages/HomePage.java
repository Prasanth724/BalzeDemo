package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends TestBase{

	
	WebElement VacationsLink = driver.findElement(By.xpath("//a[contains(text(),'destination of the week! The Beach!')]"));
	WebElement indexPageHeader =driver.findElement(By.xpath("//h1[contains(text(),'Welcome to the Simple Travel Agency!')]"));
	WebElement depatureCity =driver.findElement(By.cssSelector("body:nth-child(2) div.container form:nth-child(2) > select.form-inline:nth-child(1)"));
	WebElement mexicoCity =driver.findElement(By.xpath("//option[contains(text(),'Mexico City')]"));
	WebElement londonCity =driver.findElement(By.xpath("//option[contains(text(),'London')]"));
	WebElement destinationCity =driver.findElement(By.cssSelector("body:nth-child(2) div.container form:nth-child(2) > select.form-inline:nth-child(4)"));
	WebElement findFlightBtn =driver.findElement(By.tagName("input"));
	
	
	public String indexHeader(){
		return indexPageHeader.getText();
	}
	
	public ReservePage flightSelection(){
		 depatureCity.click();
		 Select sc = new Select(depatureCity);
		 sc.selectByVisibleText("Mexico City");
		System.out.println("selecting mexico city");
		depatureCity.click();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 destinationCity.click();
		 Select s2= new Select(destinationCity);
		 s2.selectByVisibleText("London");
		 System.out.println("click on london city");
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 destinationCity.click();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 findFlightBtn.click();
		 System.out.println("click on button");
		 
		 return new ReservePage();
	}
	
	public VacationsPage navigateToVacationsPage(){
		VacationsLink.click();
		return new VacationsPage();
	}
	
}
