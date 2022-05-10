package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LogInHomePage;
import com.nopcommerce.demo.pages.LogInPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInPageTest extends TestBase {
    HomePage homePage;
    LogInPage logInPage;
    LogInHomePage logInHomePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        logInPage = new LogInPage();
        logInHomePage = new LogInHomePage();

    }

    @Test(groups = {"sanity","smoke", "regression"})
    public void userShouldNavigateToLoginPageSuccessFully() {
        homePage.clickOnLogInLink();
        String actualText = logInPage.getTextFromWelcomeField();
        String expactedText = "Welcome, Please Sign In!";
        Assert.assertEquals(actualText, expactedText, "displayed message is wrong ");

    }

    @Test(groups = {"smoke", "regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {
        homePage.clickOnLogInLink();
        logInPage.enterEmail("maya567@gmail.com");
        logInPage.enterPassword("prime1234");
        logInPage.clickOnLoginButton();
        String actualErrorMessage = logInPage.getTextFromErrorMessage();
        Assert.assertTrue(true, actualErrorMessage);

    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        homePage.clickOnLogInLink();
        logInPage.enterEmail("maya123@gmail.com");
        logInPage.enterPassword("prime1234");
        logInPage.clickOnLoginButton();
        Assert.assertTrue(logInHomePage.logOutButonDisplayed());

    }

    @Test(groups = {"regression"})
    public void VerifyThatUserShouldLogOutSuccessFully() {
        homePage.clickOnLogInLink();
        logInPage.enterEmail("maya123@gmail.com");
        logInPage.enterPassword("prime1234");
        logInPage.clickOnLoginButton();
        logInHomePage.clickOnLogOut();
        Assert.assertTrue(homePage.logOutDisplayed());

    }

}
