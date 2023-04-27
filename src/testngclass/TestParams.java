package testngclass;

import org.testng.annotations.Test;

import basictest.GenericMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestParams {
	
	  WebDriver driver;
	  String baseUrl;

	  @BeforeClass
	  @Parameters({"browser", "platform"})
	  public void setUp(String browser1, String platform1) {	  
		  System.out.println(" TestParams-> Before Class");
		  System.out.println(" TestParams-> param value from .xml file 2: " + browser1);
		  System.out.println(" TestParams-> param value from .xml file 1: " + platform1);
		  
		  baseUrl="https://courses.letskodeit.com/practice";
		  if (browser1.equalsIgnoreCase("firefox"))
		  {
			  driver= new FirefoxDriver();
		  }
		  else if (browser1.equalsIgnoreCase("chrome"))
		  {
			  driver= new ChromeDriver();
		  }		  
		  driver.get(baseUrl);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				 
	  }
  
	@Test
	@Parameters({"response"})
	 public void test1(String response1) {
		  String[] array=response1.split(",");
		  System.out.println(" TestParams-> Test 1");
		  System.out.println(" TestParams-> param value from .xml file 3: " + response1);
		  System.out.println(" TestParams-> param value 1 from array .xml file 3: " + array[0]);
		  System.out.println(" TestParams-> param value 2 from array .xml file 3: " + array[1]);
		  driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
		  
	  }
  

}
