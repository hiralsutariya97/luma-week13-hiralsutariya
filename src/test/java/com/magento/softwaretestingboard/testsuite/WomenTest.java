package com.magento.softwaretestingboard.testsuite;

import com.magento.softwaretestingboard.pages.WomenPage;
import com.magento.softwaretestingboard.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {

    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        //Mouse Hover on women menu
        Thread.sleep(2000);
        womenPage.mouseHoverOnWomenMenu();

        //Mouse Hover on tops
        Thread.sleep(2000);
        womenPage.mouseHoverOnTops();

        //click on jackets
        Thread.sleep(2000);
        womenPage.clickOnJackets();

        // Storing jackets names in list
        List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());

            //* Select Sort By filter Product Name
            womenPage.sortByFilter("Product Name");

            //* Verify the products name display in alphabetical order
            jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
            List<String> jacketsNameListAfter = new ArrayList<>();
            Thread.sleep(1000);
            for (WebElement value1 : jacketsElementsList) {
                jacketsNameListAfter.add(value1.getText());
            }
            // Sort the before name list into Ascending Order
            jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
            // Verify the products name display in alphabetical order
            Assert.assertEquals(jacketsNameListBefore, jacketsNameListAfter);
        }
    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        //Mouse Hover on women menu
        Thread.sleep(2000);
        womenPage.mouseHoverOnWomenMenu();

        //Mouse Hover on tops
        Thread.sleep(2000);
        womenPage.mouseHoverOnTops();

        //click on jackets
        Thread.sleep(2000);
        womenPage.clickOnJackets();

        // Storing jackets price in list
        List<WebElement> jacketsPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }

        // Select Sort By filter Price
        womenPage.sortByFilter("Price");
        Thread.sleep(1000);

        // After Sorting Products by Price
        jacketsPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }

        // Sort the jacketPriceListBefore to Ascending Order
        Collections.sort(jacketsPriceListBefore);

        // Verify the products price display in Low to High
        Assert.assertEquals(jacketsPriceListAfter, jacketsPriceListBefore);

    }
}