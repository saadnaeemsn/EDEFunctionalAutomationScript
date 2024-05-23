package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import basetest.BaseTest;
import listeners.TestListener;
import utils.ExtentManager;
import utils.ExtentTestManager;
import utils.LogUtil;
import utils.Utility;

public class TestListener implements ITestListener{
	public void onTestStart(ITestResult result) {
		ExtentManager.getReporter();
		LogUtil.getLoggerInstance().info(TestListener.class.getName() + " onTestStart");
	}

	public void onTestSuccess(ITestResult result) {
		ExtentTestManager.getTest().log(Status.PASS, result.getName() + " passed successfully");
		LogUtil.getLoggerInstance().info(TestListener.class.getName() + " onTestSuccess");
		
	}

	public void onTestFailure(ITestResult result) {
		
		String message = " failed \n\r" + (result.getThrowable() != null ? result.getThrowable().getMessage() : "");
		ExtentTestManager.getTest().log(Status.FAIL, result.getName() + message);
		LogUtil.getLoggerInstance().info(TestListener.class.getName() + " onTestFailure");
		
	}

	public void onTestSkipped(ITestResult result) {
		
		ExtentTestManager.getTest().log(Status.SKIP, result.getName() + " skipped");
		LogUtil.getLoggerInstance().info(TestListener.class.getName() + " onTestSkipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		ExtentTestManager.getTest().log(Status.FAIL, result.getName() + " failed but was within success percentage");
		LogUtil.getLoggerInstance().info(TestListener.class.getName() + " onTestFailedButWithinSuccessPercentage");
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
		String message = " failed due to timeout \n\r" + result.getThrowable() != null ? result.getThrowable().getMessage() : "";
		ExtentTestManager.getTest().log(Status.FAIL, result.getName() + message);
		LogUtil.getLoggerInstance().info(TestListener.class.getName() + " onTestFailedWithTimeout");
		
	}

	public void onStart(ITestContext context) {
		LogUtil.getLoggerInstance().info(TestListener.class.getName() + " onStart");
		//WebSetup.getInstance().initDriver();
	}

	public void onFinish() {
		
	}
}
