package com.google.automation.automationTest;

import com.google.automation.framework.ScriptBase;
import com.google.automation.pageObject.searchProduct;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by dkorenkov on 6/9/2017.
 */
public class eBayTest extends ScriptBase {

    @Test(priority = 3)
    public void searchForElectricGuitar() {
        searchProduct.goToEbay(driver);
        searchProduct.searchBar(driver).sendKeys("electric guitar");
        searchProduct.search(driver).click();
        try{
            searchProduct.viewSearchLink(driver).click();
        }
        catch (Exception e){
            searchProduct.buyItNowBtn(driver).click();
        }
        searchProduct.clickProduct(driver).click();

        //Console Print
        WebElement productPrice = driver.findElement(By.xpath(".//*[@id='prcIsum']"));
        String text = productPrice.getText();
        System.out.println("Price: " + text);
    }
}