package testngclass;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name="testDataProvider")
	public Object[][] getData(){
		return new Object[][] {
				{"BMW","m3"},
				{"Audi","a6"},
				{"Benz","c300"},
		};
	}

}
