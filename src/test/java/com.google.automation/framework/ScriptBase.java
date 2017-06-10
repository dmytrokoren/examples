package com.google.automation.framework;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by dkorenkov on 6/9/2017.
 */
public class ScriptBase {

    protected WebDriver driver = null;

    @BeforeMethod
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(7, SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    public void delayFor(int timeinMilli) {
        try {
            Thread.sleep(timeinMilli);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
