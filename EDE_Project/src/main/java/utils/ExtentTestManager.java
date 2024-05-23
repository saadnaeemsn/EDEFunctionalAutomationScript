package utils;

import java.util.HashMap;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import utils.ExtentManager;

public class ExtentTestManager {
	public static String name;
	static HashMap<Long, ExtentTest> extentTestMap = new HashMap<Long, ExtentTest>();
	static ExtentReports extent = ExtentManager.getReporter();

	@SuppressWarnings("unlikely-arg-type")
	public static synchronized ExtentTest getTest() {
		return (ExtentTest) extentTestMap.get(Thread.currentThread().getId());
	}

	public static synchronized ExtentTest createTest(String testName, String desc) {
		name=testName;
		ExtentTest test = extent.createTest(testName, desc);
		extentTestMap.put(Thread.currentThread().getId(), test);
		return test;
	}

	@SuppressWarnings("unlikely-arg-type")
	public static synchronized void endTest() {
		extent.removeTest(((ExtentTest) extentTestMap.get(Thread.currentThread().getId())));
		extentTestMap.remove(Thread.currentThread().getId());
	}

	public static void assignCategory(String... category) {
		getTest().assignCategory(category);
	}

	public static void assignAuthor(String... author) {
		getTest().assignAuthor(author);
	}

	public static void info(String str) {
		getTest().log(Status.INFO, str);
	}

	public static void debug(String str) {
		getTest().log(Status.DEBUG, str);
	}

	public static void error(String str) {
		getTest().log(Status.ERROR, str);
	}

	public static void warning(String str) {
		getTest().log(Status.WARNING, str);
	}

	public static void pass(String str) {
		getTest().log(Status.PASS, str);
	}

	public static void skip(String str) {
		getTest().log(Status.SKIP, str);
	}

	public static void fail(String str) {
		getTest().log(Status.FAIL, str);
	}

	public static void fatal(String str) {
		getTest().log(Status.FATAL, str);
	}
}
