package Pkg_extent;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Exportstests {
    private static ExtentReports extent;
    private static ExtentTest test;

    public static void initExtentReport(String reportFilePath) {
        // Initialize Extent Reports with ExtentSparkReporter
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportFilePath);
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
    }

    public static void createTest(String testName) {
        // Create a new test
        test = extent.createTest(testName);
    }

    public static void logInfo(String message) {
        // Log an informational message
        test.log(Status.INFO, message);
    }

    public static void logPass(String message) {
        // Log a pass status message
        test.log(Status.PASS, message);
    }

    public static void logFail(String message) {
        // Log a fail status message
        test.log(Status.FAIL, message);
    }

    public static void logFail(String message, String errorMessage) {
        // Log a fail status message with an error message
        test.log(Status.FAIL, message + "<br>Error: " + errorMessage);
    }

    public static void finalizeReport() {
        // Finalize the report
        extent.flush();
    }
}
