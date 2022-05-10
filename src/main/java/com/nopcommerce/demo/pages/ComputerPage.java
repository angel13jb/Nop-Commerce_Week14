package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {
    public void inIt(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computerTextField;
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Desktops']")
    WebElement desktopField;
    public String gettextFromComputerField(){
        return  getTextFromElement(computerTextField);
    }
    public void clickOndeskTop(){
        clickOnElement(desktopField);
    }
}
