package com.magento.softwaretestingboard.pages;

import com.magento.softwaretestingboard.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {

    //1  Find and Locate
    By menMenu = By.xpath("//span[normalize-space()='Men']");
    By bottoms = By.xpath("//a[@id='ui-id-18']");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By cronusYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size32 = By.xpath("(//div[@class='swatch-option text'])[1]");
    By blackColour = By.xpath("(//div[@class='swatch-option color'])[1]");
    By addToCartButton = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By cronusYogaPant1 = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By addToCartButton1 = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By cronusShoppingCartText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLinkIntoMessage = By.xpath("//a[normalize-space()='shopping cart']");
    By shoppingCartText = By.xpath("//span[@class='base']");
    By cronusYogaPantText = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By productSize32 = By.xpath("//dd[contains(text(),'32')]");
    By blackText = By.xpath("//dd[contains(text(),'Black')]");

    //2 create separate methods

    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottoms() {
        mouseHoverToElement(bottoms);
    }

    public void mouseHoverOnPantsAndClick() {
        mouseHoverToElementAndClick(pants);
    }

    public void mouseHoverToCronusYogaPant() {
        mouseHoverToElement(cronusYogaPant);
    }

    public void mouseHoverToCronusYogaPantAndCLickSize32() {
        mouseHoverToElementAndClick(size32);
    }

    public void mouseHoverToCronusYogaPantAndClickBlackColour() {
        mouseHoverToElementAndClick(blackColour);
    }

    public void mouseHoverToCronusAndClickOnAddToCartButton() {
        mouseHoverToElementAndClick(addToCartButton);
    }

    public void mouseHoverToCronusYogaPant1() {
        mouseHoverToElementAndClick(cronusYogaPant1);
    }

    public void mouseHoverToCronusAndClickOnAddToCartButton1() {
        mouseHoverToElementAndClick(addToCartButton1);
    }

    public String getTextFromAddedCronusPantInYourShoppingCart() {
        return getTextFromElement(cronusShoppingCartText);
    }

    public void clickOnShoppingCartLinkIntoMessage() {
        clickOnElement(shoppingCartLinkIntoMessage);
    }

    public String verifyShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    public String verifyCronusYogaPantText() {
        return getTextFromElement(cronusYogaPantText);
    }

    public String verifyProductSize32Text() {
        return getTextFromElement(productSize32);
    }

    public String verifyBlackColourText() {
        return getTextFromElement(blackText);
    }
}
