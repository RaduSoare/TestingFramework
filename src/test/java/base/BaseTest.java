package base;

import lombok.Getter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.pages.HomePage;
import selenium.pages.LoginPage;
import selenium.pages.SignUpPage;

@Getter
public class BaseTest {

    private WebDriver webDriver;

    protected static Logger logger = LogManager.getLogger(SignUpBaseTest.class);

    @BeforeTest
    public void initTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    public void navigateToPage(String pageURL) {
        webDriver.get(pageURL);
    }

    public void goToLandingPage() {
        navigateToPage("http://school-for-automation.tech/");
    }

    public HomePage goToHomePage() {
        goToLandingPage();
        return new LoginPage(getWebDriver())
                .login("tester", "test1234") ;
    }

    public SignUpPage goToSignUpPage() {
        return goToHomePage().goToSignUpPage();
    }

    @AfterTest
    public void tearDown() {
        webDriver.close();
    }

}
