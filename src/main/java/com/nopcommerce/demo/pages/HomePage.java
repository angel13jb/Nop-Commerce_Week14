package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public void inIt() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerField;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronicField;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")
    WebElement appearlField;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']")
    WebElement digitalDownloadField;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")
    WebElement bookField;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")
    WebElement jeweleryField;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")
    WebElement giftCardField;
    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement logInLinkField;
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLinkFiled;
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement logo;


    public void clickOnRegisterLink(){
        clickOnElement(registerLinkFiled);
    }
    public void clickOnLogInLink(){
        clickOnElement(logInLinkField);
    }
    public boolean logOutDisplayed(){
        return  logInLinkField.isDisplayed();
    }
    public void clickOnComputerLink(){
        clickOnElement(computerField);
    }

}
