/*   TESTNGBASIC.JAVA    */


package testNgPackage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testNgBasic {

	/*  Framework:  
	 * 
	 * 	-TestNg: Unit testing framework.Used to control 
	 *   your test cases. out of 400 I want to run 200 as smoke and 200 as regression.
	 * 
	 * 	-Data driven testing: best practise to drive data from external resources.
	 * 
	 *  -Maven: Build Management Tool.
	 *  
	 *  -Jenkins: Continuous Integration
	 *  
	 *  -Reports: Reports for framework tests
	 *  
	 *  -Log4j: Logging framework generates Logs
	 *  
	 *  -Page Object Mechanism: Design Pattern for Tests Development
	 * 
	 * */
	
	/* 
	 * 	TestNg: Unit testing framework.Used to control 
	 *   your test cases. out of 400 I want to run 200 as smoke and 200 as regression.
	 * 	
	 * 	TestNg can acts as a java compiler for u, executes all ur test cases.
	 * TestNg itself depend on java on back end. No PSVM(){} is required.
	 * 
	 */
	
	//We can create multiple test cases in a single file
	
	//TestNg dependsOnMethods Attribute:-
	
	/* @Test(dependsOnMethods={"testMethod2", "Method2", "Method3"}): Tweak the order of execution: so after executing these 3 methods this method will execute */
	
	/* if we want to run a method after a particular method, to change its order of alphabetical order, we use dependsOnMethods Argument */

	@Test(dependsOnMethods={"testMethod2"}) //testNg Annotation treat following method as a test case, no PSVM(){} is required, it will run as a testNg test.
	public void testMethod1() {   //1st test case
		System.out.println("TestNg method1!");
	
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Executes!");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class Executes!");
	}
	
	@Test(groups= {"smoke"}) 
	public void testMethod2() {   //2nd test case
		
		System.out.println("TestNg method2!");
	
	}
	
	/*
	 * TestNg.xml file is the heart of TestNg.
	 * 
	 * To create Right click on project > convert to TestNg > testng.xml file will be created for u.
	 * 
	 * Order of Test cases execution in testNg will be in alphabetical order of methods (Test cases).
	 * 
	 */
		
	/*
	 * Usage of Groups Functionality in TestNg:- 
	 * 
	 * Run custom test cases like 1 from each class, random test cases.
	 * 
	 */
	
	
}
