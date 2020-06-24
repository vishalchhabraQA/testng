/*   TESTNGBASIC4.JAVA    */



package testNgPackage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNgBasic4 {
	
	
	@BeforeSuite //will execute before a <suite></suite> starts executing
	public void beforeSuite() {
		System.out.println("before Suite executed!");
	}
	
	@AfterSuite //will execute after a <suite></suite> starts executed
	public void afterSuite() {
		System.out.println("after suite executed!");
	}
	
	@Test
	public void testMethod8() {   //8th test case
		
		System.out.println("TestNg method8!");
	
	}
	
	@Test(groups= {"smoke"}) 
	public void testMethod9() {   //9th test case
		
		System.out.println("TestNg method9!");
	
	}
	
	/* data driven testing is done in two ways in testng: 1) <parameter> from testng.xml 2) DataProvider Annotation
	/* DataProvider Annotation: parameterizing with multiple data sets by running tests with multiple combination. It is independent of testng.xml file */
	/* this test need multiple test data */
	/* This test will run three times */
	@Test(dataProvider="getDataProvider") 
	public void testMethod10(String username, String password) {   //10th test case
		
		System.out.println("TestNg method10!");
		System.out.println("username: " + username + " password " + password);
	
	}
	
	@DataProvider()
	public Object[][] getDataProvider() {
		
		Object[][] d = new Object[3][2];
		d[0][0] = "u1";
		d[0][1] = "p1";
		d[1][0] = "u2";
		d[1][1] = "p2";
		d[2][0] = "u3";
		d[2][1] = "p3";
		
		return d;
	}
	
	
}
