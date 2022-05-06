package listeners;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.asserts.Assertion;

public class TestNgListeners implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success");
		ITestListener.super.onTestSuccess(result);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failure");
		ITestListener.super.onTestFailure(result);
	}
	

}
