package browserprofiles;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class ProfileDemo {

	public static void main(String[] args) {
	
		
		//baseUrl="https://letskodeit.teachable.com";
		String baseUrl="https://courses.letskodeit.com/practice";
		
		/*** For Firefox ***
		ProfilesIni pf =new ProfilesIni();
		FirefoxProfile ffProfile = pf.getProfile("automationprofile");
		FirefoxOptions ffOp = new FirefoxOptions();
		ffOp.setProfile(ffProfile);		
		WebDriver driver= new FirefoxDriver(ffOp);
		
		**/
		
		//For Chrome
		
		ChromeOptions copt = new ChromeOptions();
	
		copt.addExtensions(new File ("\\Users\\ryshi\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\cifnddnffldieaamihfkhkdgnbhfmaci\\11.0.0.0_0.crx"));
		
		WebDriver driver= new ChromeDriver(copt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(baseUrl);
		
		
	}

}
