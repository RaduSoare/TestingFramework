package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import selenium.pages.LoginPage;


public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        navigateToPage("http://school-for-automation.tech/");
        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.login("tester", "test1234");

        WebElement getStartedButton = new WebDriverWait(getWebDriver(), 3)
                .until(ExpectedConditions.elementToBeClickable(By.id("get-started")));
        Assert.assertTrue(getStartedButton.isDisplayed());
    }

}
