/*   TESTNGBASIC2.JAVA    */

package testNgPackage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNgBasic2 {
	/*
	 * TestNg Annotations:- 
	 * 
	 * 
	 * 
	 */
	
	@BeforeTest //it will run before any <test> </test> starts //used when need to do some prerequiste before a test starts like cleaning of data
	public void beforeTest() {
		System.out.println("Before Test Executes!");
	}
	
	@Test(groups= {"smoke"})
	public void testMethod3() {   //3rd test case
		
		System.out.println("TestNg method3!");
	
	}
	
	@Test(enabled=false) //disable a test, as it has known issue or bug. TestNg will skip this test. Is used to off a test case.
	public void testMethod4() {   //4th test case
		
		System.out.println("TestNg method4!");
	
	}
	
	@AfterTest //it will run after any <test> </test> ends //like to delete cookies
	public void afterTest() {
		System.out.println("After Test Executes!");
	}
}
