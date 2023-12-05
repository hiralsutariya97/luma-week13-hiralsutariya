package com.magento.softwaretestingboard.testsuite;

import com.magento.softwaretestingboard.pages.MenPage;
import com.magento.softwaretestingboard.testbase.BaseTest;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    MenPage menPage = new MenPage();

    @Test
    public void userShouldAddProductSuccessfullyToShoppingCart() {
        menPage.mouseHoverOnMenMenu();
        menPage.mouseHoverOnBottoms();
        menPage.mouseHoverOnPantsAndClick();
        menPage.mouseHoverToCronusYogaPant();
        menPage.mouseHoverToCronusYogaPantAndCLickSize32();
        menPage.mouseHoverToCronusYogaPantAndClickBlackColour();
        menPage.mouseHoverToCronusAndClickOnAddToCartButton();
        menPage.mouseHoverToCronusYogaPant1();
        menPage.mouseHoverToCronusAndClickOnAddToCartButton1();
        menPage.getTextFromAddedCronusPantInYourShoppingCart();
        menPage.clickOnShoppingCartLinkIntoMessage();
        menPage.verifyShoppingCartText();
        menPage.verifyCronusYogaPantText();
        menPage.verifyProductSize32Text();
        menPage.verifyBlackColourText();
    }
}
