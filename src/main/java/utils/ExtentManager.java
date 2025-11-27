package utils;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static ExtentReports extent;
    public static ExtentTest test;

    public static ExtentReports getInstance() {

        if (extent == null) {
            ExtentSparkReporter reporter =
                    new ExtentSparkReporter("Report/AutomationReport.html");
            extent = new ExtentReports();
            extent.attachReporter(reporter);
        }

        return extent;
    }

    public static void startTest(String testName) {
        test = getInstance().createTest(testName);
    }
}

