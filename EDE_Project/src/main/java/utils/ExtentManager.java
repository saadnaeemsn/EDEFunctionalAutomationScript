package utils;

import java.util.Date;

import java.io.File;
import java.util.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import pages.LoginPage;

public class ExtentManager {
	
	private static ExtentReports extent;
    private static String reportFileName = "EDE-QA_"+ESTTimeZone.getCurrentDate("dd_MM_yyyy_HH_mm_ss_ms")+".html";
    private static String fileSeparator = System.getProperty("file.separator");
    private static String reportFilePath = System.getProperty("user.dir") + fileSeparator + "reports" + fileSeparator + new Date().toString().replace(":", "_").replace(" ", "_") + fileSeparator;
    private static String reportFileLocation = reportFilePath + reportFileName;

    private ExtentManager() {
    }

    public synchronized static ExtentReports getReporter() {
        if (extent == null) {
            createInstance();
        }
        return extent;
    }

    /**
     * Creates and return instance of ExtentReport
     *
     * @return {@link ExtentReports}
     */
    private static ExtentReports createInstance() {
        String fileName = getReportPath(reportFilePath);

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle(reportFileName);
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName(reportFileName);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        // Set environment details
        extent.setSystemInfo("OS", "Windows");
        extent.setSystemInfo("AUT", "QA");

        return extent;
    }

    // Create the report path
    private static String getReportPath(String path) {
        File testDirectory = new File(path);
        if (!testDirectory.exists()) {
            if (testDirectory.mkdirs()) {
                return reportFileLocation;
            } else {
                return System.getProperty("user.dir");
            }
        }
        return reportFileLocation;
    }
}
