package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.pages.HomePage;
import selenium.pages.LoginPage;

public class HomePageTest extends BaseTest {


    @Test
    public void homePageTest() {
        goToLandingPage();
        HomePage homePage = new LoginPage(getWebDriver()).login("tester", "test1234");
        Assert.assertEquals(homePage.getBannerText().getText(), "School for Automation");
    }
}
