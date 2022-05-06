package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDay5 {

	@Test(groups = {"Smoke"})
	public void testcase1() {
		System.out.println("This is test cases- 1");
	}
	
	@Test
	public void testcase2() {
		System.out.println("This is test cases- 2");
	}
	@Test(groups = {"Smoke"})
	public void testcase3() {
		System.out.println("This is test cases- 3");
	}
	@Test(dependsOnMethods = {"testcase2","testcase3"})
	public void testcase4() {
		System.out.println("This is test cases- 4");
	}
	@Test(enabled = false)
	public void testcase5() {
		System.out.println("This is test cases- 5");
	} 
	@Test(timeOut = 3000)
	public void testcase6() {
		System.out.println("This is test cases- 6");
	}
	@Test
	public void testcase7() {
		System.out.println("This is test cases- 7");
	}
	
	
	
	@BeforeTest
	public void prerequsite() {
		System.out.println("Always to be run before test class/ test cases");
	}
	@AfterTest
	public void postrequiste() {
		System.out.println("Always run after a test cases completes");
	}
	
	@BeforeSuite
	public void firstTobeRun() {
		System.out.println("I will execute before the start of any suite");
	}
	@AfterSuite
	public void lastTobeRun() {
		System.out.println("I will execute after any suite");
	}
}
