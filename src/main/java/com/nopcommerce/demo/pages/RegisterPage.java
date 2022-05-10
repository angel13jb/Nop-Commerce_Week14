package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    public void inIt(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerTextField;
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement femalradioButton;
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameField;
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameField;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dayDropDownField;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthDropDwonField;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearDropDwonField;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passWordField;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassowordField;
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButtonField;
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement fNameErrorMessageField;
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lNameErrorMessageField;
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailErrorMessageField;
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordErrorMessageField;
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordErrorMessageField;


    public String getTextFromRegisterFiled(){
        return getTextFromElement(registerTextField);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButtonField);
    }
    public String geTextFromFNameErrorMessageField(){
        return getTextFromElement(fNameErrorMessageField);
    }public String geTextFromlNameErrorMessageField(){
        return getTextFromElement(lNameErrorMessageField);
    }public String geTextFromEmailErrorMessageField(){
        return getTextFromElement(emailErrorMessageField);
    }public String geTextFromPasswordErrorMessageField(){
        return getTextFromElement(passwordErrorMessageField);
    }public String geTextFromConfirmPasswordErrorMessageField(){
        return getTextFromElement(confirmPasswordErrorMessageField);
    }
    public void clickOnFemaleRadioButton(){
        clickOnElement(femalradioButton);
    }
    public void enterFirstName(String fName){
        sendTextToElement(firstNameField,fName);
    }
    public void enterLastName(String lName){
        sendTextToElement(lastNameField,lName);

    }
    public void selectDay(String text){
        selectByVisibleTextFromDropDown(dayDropDownField,text);
    }
    public  void selectMonth(String text){
        selectByVisibleTextFromDropDown(monthDropDwonField,text);

    }
    public void selectYear(String text){
        selectByVisibleTextFromDropDown(yearDropDwonField,text);
    }
    public void enterEmail(String email){
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passWordField,password);
    }
    public void confirmPassword(String confirmpasword){
        sendTextToElement(confirmPassowordField,confirmpasword);
    }


}
