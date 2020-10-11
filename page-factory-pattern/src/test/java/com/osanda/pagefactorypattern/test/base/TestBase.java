package com.osanda.pagefactorypattern.test.base;

import com.osanda.pagefactorypattern.util.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected static WebDriver driver;

    // Initialize a driver instance of required browser
    @BeforeMethod
    public static void initializeDriver() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    // Close all the driver instances
    @AfterMethod
    public static void closeAllDrivers() {
        if (driver != null) {
            driver.quit();
        }
    }

}