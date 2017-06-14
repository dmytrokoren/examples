package com.google.automation.automationTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by DiMA on 6/14/17.
 */
public class FindAllLinks {

    WebDriver driver = null;

    @BeforeMethod
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.get("https://www.barnesandnoble.com/");
    }
    @Test
    public void Testing(){
        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for (int i = 0; i <= links.size(); i++) {

            System.out.println(links.get(i));

        }
    }
}