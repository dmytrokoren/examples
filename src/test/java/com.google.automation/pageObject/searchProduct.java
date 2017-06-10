package com.google.automation.pageObject;

import com.google.automation.framework.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by dkorenkov on 6/9/2017.
 */
public class searchProduct extends ScriptBase{

    private static WebElement element = null;

    public static WebElement goToEbay (WebDriver driver){
        driver.navigate().to("http://www.ebay.com");
        return element;
    }

    public static WebElement searchBar (WebDriver driver){
        element = driver.findElement(By.xpath(".//*[@id='gh-ac']"));
        return element;
    }

    public static WebElement search (WebDriver driver) {
        element = driver.findElement(By.xpath(".//*[@id='gh-btn']"));
        return element;
    }

    public static WebElement viewSearchLink (WebDriver driver) {
        element = driver.findElement(By.xpath(".//*[@id='mainContent']/section[1]/div/a/span"));
        return element;
    }

    public static WebElement buyItNowBtn (WebDriver driver) {
        element = driver.findElement(By.xpath(".//*[@id='cbelm']/div[1]/div[2]/a[2]"));
        return element;
    }

    public static WebElement clickProduct (WebDriver driver){
        element = driver.findElement(By.xpath(".//div/w-root/div/div/ul/li[1]/h3/a"));
        return element;
    }
}
