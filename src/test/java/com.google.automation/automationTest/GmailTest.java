package com.google.automation.automationTest;

import com.google.automation.framework.ScriptBase;
import com.google.automation.pageObject.signIn_Page;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by dkorenkov on 6/9/2017.
 */
public class GmailTest extends ScriptBase {

    @Test
    public void validEmail_validPassword(){

        signIn_Page.goToGmail(driver);
        signIn_Page.gMail_user(driver).sendKeys("seleniummlb@gmail.com");
        signIn_Page.nextBtn_user(driver).click();
        signIn_Page.gMail_password(driver).sendKeys("Mlb123@@");
        delayFor(1000);
        signIn_Page.nextBtn_password(driver).click();

        //Test Validation
        if(driver.findElement(By.cssSelector(".gb_8a.gbii")).isDisplayed()){
            System.out.println("User successfully signed in");
        }
        else {
            System.out.println("User not signed in");
        }
    }

    @Test(priority = 1)
    public void invalidEmail_validPassword(){

        signIn_Page.goToGmail(driver);
        signIn_Page.gMail_user(driver).sendKeys("Xseleniummlb@gmail.com");
        signIn_Page.nextBtn_user(driver).click();

        //Test Validation
        WebElement errUser = driver.findElement(By.xpath(".//*[@id='view_container']/form//div[2]/div[contains(text(),'Google Account')]"));
        String text = errUser.getText();
        Assert.assertEquals("Couldn't find your Google Account", text);
    }

    @Test(priority = 2)
    public void validEmail_invalidPassword(){

        signIn_Page.goToGmail(driver);
        signIn_Page.gMail_user(driver).sendKeys("seleniummlb@gmail.com");
        signIn_Page.nextBtn_user(driver).click();
        signIn_Page.gMail_password(driver).sendKeys("Mlb123");
        delayFor(1000);
        signIn_Page.nextBtn_password(driver).click();
        delayFor(1000);

        //Test Validation
        WebElement errPass = driver.findElement(By.cssSelector(".dEOOab.RxsGPe"));
        String text = errPass.getText();
        Assert.assertEquals("Wrong password. Try again.", text);
    }
}
