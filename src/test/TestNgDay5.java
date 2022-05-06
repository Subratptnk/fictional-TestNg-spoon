package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
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
		Assert.assertTrue(false);
	}
	@Parameters({"URL"})
	@Test(enabled = false)
	public void testcase8(String urlName) {
		System.out.println("This is test cases- 8");
		System.out.println("The Parameter name is "+urlName);
	}
	@Test(dataProvider = "getData")
	public void testcase9(String username,String password) {
		System.out.println("My Data provider");
		System.out.println("My username is "+username);
		System.out.println("My password is "+password);
		
	}
	
	
	@DataProvider
	@Test
	public Object[][] getData() {
		//System.out.println("This is test cases- 9");
		
		//1st - combination -- using one set of username and password.
		//2nd - Combination -- using 2nd set of username and password.
		// 3rd - Combination
		
		Object[][]data = new Object[3][2]; // Object[number of combinations][on each combination how many values are passing]
		// couloumns in the row are nothing but values for that particualar combination(row)
		//set=1
		data[0][0] = "FirstSetUserName";
		data[0][1] = "password1";
		
		//set = 2
		data[1][0] = "SecondSetUserName";
		data[1][1] = "password2";
		
		//set=3
		data[2][0] = "ThirdSetUserName";
		data[2][1] = "password3";
		
		return data;
		
		
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
