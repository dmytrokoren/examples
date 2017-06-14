package com.google.automation.automationTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by DiMA on 6/14/17.
 */
public class findNumOfTextInWeb {

    WebDriver driver = null;

    @BeforeMethod
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(7, SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void countTheWord() {
        // get the text of the body element
        driver.navigate().to("https://www.barnesandnoble.com");

        WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();

        // count occurrences of the string
        int count = 0;

        // search for the String within the text
        while (bodyText.contains("About")) {

            // when match is found, increment the count
            count++;

            // continue searching from where you left off
            String bodyText1 = bodyText = bodyText.substring(bodyText.indexOf("About") + "About".length());
            System.out.println(bodyText1);
        }
    }
}
