package utils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.*;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseClass;

public class ScreenshotListener extends BaseClass implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File dest = new File("./Screenshots/" + result.getName() + ".png");

            Files.copy(src.toPath(), dest.toPath(),
                    StandardCopyOption.REPLACE_EXISTING);

            ExtentManager.test.fail("Screenshot: ")
                    .addScreenCaptureFromPath(dest.getPath());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
