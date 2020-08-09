package testscript;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pages.YahooPage;



public class YahooTest extends BaseClass {
	
	@Test

	public void yahooNames() throws FileNotFoundException, InterruptedException{
		YahooPage yahooPage = new YahooPage(driver);
		yahooPage.printNames(); 
		}

}
