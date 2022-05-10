package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {
    HomePage homePage;
    ComputerPage computerPage;
    DesktopPage desktopPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    @Test(groups = {"sanity","smoke", "regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        homePage.clickOnComputerLink();
        String actualText = computerPage.gettextFromComputerField();
        String expactedtext = "Computers";
        Assert.assertEquals(actualText, expactedtext, "displayed message is wrong");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.clickOnComputerLink();
        computerPage.clickOndeskTop();
        String actualtext = desktopPage.getTextfromDesktopFiled();
        String expactedtext = "Desktops";
        Assert.assertEquals(actualtext, expactedtext, "displyed message is wrong");
    }

    @Test(dataProvider = "addCart", dataProviderClass = TestData.class,groups = {"regression"})
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) {
        homePage.clickOnComputerLink();
        computerPage.clickOndeskTop();
        desktopPage.clickOnBuildYoueOwnComputer();
        buildYourOwnComputerPage.selectProcessorFromDropDown( processor);
        buildYourOwnComputerPage.selectRamFromDropDown(ram);
        buildYourOwnComputerPage.clickOnHddFormRadioButton(hdd);
        buildYourOwnComputerPage.clickOnOsFormRadioButton(os);
        buildYourOwnComputerPage.selectSoftwareCheckBox(software);
        buildYourOwnComputerPage.clickOnAddToCartButton();
        String actualtext=buildYourOwnComputerPage.getVerifyAddToCartText();
        String expactedtext="The product has been added to your shopping cart";
        Assert.assertEquals(actualtext,expactedtext,"displayed messages is wrong ");
    }
}
