package basictest;

import static org.junit.Assert.*;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import pages.SearchPage;
import pages.SearchPageFactory;

public class PageObjectModel {
	WebDriver driver;
	String baseUrl;
	SearchPageFactory spf;

	@Before
	public void setUp() throws Exception {
		System.out.println("Before method executed...");
		driver= new FirefoxDriver();	
		baseUrl="https://courses.letskodeit.com/practice";	
		
		//baseUrl="https://expedia.com";	
		spf=new SearchPageFactory(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(baseUrl);
	}
		
		
	//@Test
	public void Test2() throws InterruptedException {
		spf.enterName("Thao abc");
		spf.clickAlert();
				
		
	}	
	
	//@Test
	public void Test1() throws InterruptedException {
		SearchPage.enterName(driver, "Thao abc");
		SearchPage.clickAlert(driver);
				
		
	}	
	@After
	public void tearDown() throws Exception {
		System.out.println("After method done...");
		Thread.sleep(5000);
		driver.quit();
		
	}

}
