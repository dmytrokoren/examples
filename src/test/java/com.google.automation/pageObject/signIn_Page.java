package com.google.automation.pageObject;

import com.google.automation.framework.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by dkorenkov on 6/9/2017.
 */
public class signIn_Page extends ScriptBase {

    private static WebElement element = null;

    public static WebElement goToGmail (WebDriver driver){
        driver.navigate().to("http://www.gmail.com");
        return element;
    }

    public static WebElement gMail_user (WebDriver driver){
        element = driver.findElement(By.name("identifier"));
        return element;
    }

    public static WebElement nextBtn_user (WebDriver driver){
        element = driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span"));
        return element;
    }

    public static WebElement gMail_password(WebDriver driver) {
        element = driver.findElement(By.name("password"));
        return element;
    }

    public static WebElement nextBtn_password (WebDriver driver){
        element = driver.findElement(By.cssSelector(".RveJvd.snByac"));
        return element;
    }
}