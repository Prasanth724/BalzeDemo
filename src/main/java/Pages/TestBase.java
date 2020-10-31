package Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static FileInputStream fis;
	public static String fileLocation="C:\\Users\\Abdul Rajik shaik\\Desktop\\Abdul\\BlazeDemoNaveenAssignment\\src\\main\\java\\Config.properties";
	public static Properties prop;
	public static WebDriver driver;
	
    
    
	protected TestBase(){
		prop= new Properties();
		try {
			fis= new FileInputStream(fileLocation);
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initialize(){
		String homepageUrl =prop.getProperty("url");
	    String browserName = prop.getProperty("browser");
		
		System.out.println("browser name "+browserName);
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			System.out.println("launching chrome driver");
		}
		driver.manage().window().maximize();
		System.out.println("maximize the window");
		driver.manage().deleteAllCookies();
		System.out.println("deleting all cookies");
		driver.get(homepageUrl);
		System.out.println("the url is "+homepageUrl);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("waiting for 10 seconds");
		
	}
}
