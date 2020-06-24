/*   TESTNGBASIC3.JAVA    */


package testNgPackage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class testNgBasic3 {
	
	
	@BeforeMethod //will execute before any method starts executing in this class, specific to class only
	public void beforeMethod() {
		System.out.println("Before method executed!");
	}
	
	@AfterMethod //will execute after any method finished execution in this class, specific to class only
	public void afterMethod() {
		System.out.println("after method executed!");
	}
	
	//wait for 4 seconds before u throw any error
	@Test(timeOut=4000) //if test case is taking more time to execute , then use timeOuts attribute to tell testNg to wait for this seconds before throwing any error
	public void testMethod5() {   //5th test case
		
		System.out.println("TestNg method5!");
	
	}
	
	@Parameters({"url"})
	@Test 
	public void MobiletestMethod6(String input) {   //6th 1 test case
		
		System.out.println("Mobile first TestNg method6! " + input);
	
	}
	
	@SuppressWarnings("deprecation")
	@Test 
	public void Mobile2testMethod6() {   //6th 2 test case
		
		System.out.println("Mobile second TestNg method6!");
		Assert.assertTrue(false);
	}
	
	@Test(groups= {"smoke"}) 
	public void testMethod7() {   //7th test case
		
		System.out.println("TestNg method7!");
	
	}	
	
}
