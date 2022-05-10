package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends Utility {
    public void inIt() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailFiled;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement logInButton;
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeSignInMessage;
    @FindBy(xpath = "//li[normalize-space()='No customer account found']")
    WebElement errorMessageField;


    public void enterEmail(String email) {
        sendTextToElement(emailFiled, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public String getTextFromWelcomeField() {
        return getTextFromElement(welcomeSignInMessage);
    }
    public void clickOnLoginButton(){
        clickOnElement(logInButton);
    }
    public  String getTextFromErrorMessage(){
        return  getTextFromElement(errorMessageField);
    }
}
