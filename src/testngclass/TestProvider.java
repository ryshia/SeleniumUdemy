package testngclass;

//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestProvider {
	/*
	@DataProvider(name="testDataProvider")
	Object[][] getData(){
		return new Object[][] {
				{"BMW","m3"},
				{"Audi","a6"},
				{"Benz","c300"},
		};
	}
	*/
  @Test (dataProvider = "testDataProvider", dataProviderClass = TestData.class)
  public void Test1(String t1, String t2) {
	  System.out.println("Input 1: "+ t1);
	  System.out.println("Input 2: "+ t2);
  }
  
}
