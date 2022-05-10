package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopPage extends Utility {
    public void inIt() {
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopFiled;
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buidYourOwnComputerLink;

    public  String getTextfromDesktopFiled(){
        return getTextfromDesktopFiled();
    }
    public void clickOnBuildYoueOwnComputer(){
        clickOnElement(buidYourOwnComputerLink);

    }
}
