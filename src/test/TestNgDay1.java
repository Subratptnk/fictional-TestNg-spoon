package test;

import org.testng.annotations.Test;

public class TestNgDay1 {

	//Test is one kind of annotation under testNg library which create a method/function as a test case
	
	@Test 
	public void demo() {
		System.out.println("Hello TestNg");
	}
	
	@Test
	public void secondTestCase() {
		System.out.println("This is second test cases ");
	}
}
