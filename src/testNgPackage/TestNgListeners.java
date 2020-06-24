package testNgPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListeners implements ITestListener {


	/* TestNg Listeners: there are some listeners which will activate after your test or before your test
	 * Listeners listen to test cases, on failure of test case it will invoke a particular method
	 * For eg. take screenshot on every test failure : testNg will redirect to onTestFailure method of ITestListener
	 *  
	 *  ITestListener Interface is implemented to get testNgListeners
	 *
	 *  Press Alt + shift + s to get unimplemented methods
	 */

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println("onTestStart Executed!");
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("onTestSuccess Executed!");
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//screenshot code
		//response if API is failed
		System.out.println("onTestFailure Executed!" + result.getName()); //will get name of test case failed as well
		//ITestResult containing information about the run test
		//This class describes the result of a test.
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("onTestSkipped Executed!");
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		System.out.println("onTestFailedButWithinSuccessPercentage Executed!");
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

		System.out.println("onTestFailedWithTimeout Executed!");
		
	}

	@Override
	public void onStart(ITestContext context) {

		System.out.println("onStart Executed!");
	
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("onFinish Executed!");
		
	}
	
}
