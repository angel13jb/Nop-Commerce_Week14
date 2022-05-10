package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {
    public void inIt(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourComputerTextField;
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropDownField;
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramDropDownField;
    @FindBy(xpath = "//dd[@id='product_attribute_input_3']/descendant::li/child::label")
    List<WebElement> hddRadioButtonField;
    @FindBy(xpath = "//dd[@id='product_attribute_input_4']/descendant::li/child::label")
    List<WebElement> osRadioButtonField;
    @FindBy(xpath = "//dd[@id='product_attribute_input_5']/descendant::li")
    List<WebElement> softwareCheckBoxField;
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButtonField;
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement addToCartTextField;

    public String getVerifyBuildYourComputerText(){
        return getTextFromElement(buildYourComputerTextField);
    }

    public void selectProcessorFromDropDown(String processor){
        selectByVisibleTextFromDropDown(processorDropDownField,processor);
    }

    public void selectRamFromDropDown(String ram){
        selectByVisibleTextFromDropDown(ramDropDownField,ram);
    }
    public void clickOnHddFormRadioButton(String hdd){
        for(WebElement element : hddRadioButtonField){
            if(element.getText().equalsIgnoreCase(hdd)){
                element.click();
                break;
            }
        }
    }

    public void clickOnOsFormRadioButton(String os){
        for(WebElement element : osRadioButtonField){
            if(element.getText().equalsIgnoreCase(os)){
                element.click();
                break;
            }
        }
    }

    public void selectSoftwareCheckBox(String software) {
        for (WebElement element : softwareCheckBoxField)
            if (element.getText().equalsIgnoreCase(software)) {
                element.click();
                break;
            }
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButtonField);
    }
    public String getVerifyAddToCartText(){
        return getTextFromElement(addToCartTextField);
    }
}
