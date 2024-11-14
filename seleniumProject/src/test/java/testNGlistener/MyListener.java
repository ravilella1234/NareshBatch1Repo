package testNGlistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import seleniumBrowser.BaseTest;

public class MyListener extends BaseTest implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		System.out.println(testName + " has started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		System.out.println(testName + " Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		System.out.println(testName + " Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		System.out.println(testName + " skipped");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		System.out.println(testName + " Failed with timeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName() + " Started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName() + " Finished");
	}
	
}
