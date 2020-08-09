package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	WebDriver driver;
	
	@BeforeClass

	public void launch() {
	System.setProperty("webdriver.gecko.driver", "/Users/sumathiselvakumar/Desktop/geckodriver");
	driver = new FirefoxDriver();
	driver.get("http://yahoo.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void Quit() {
		driver.quit();
	}

}
