package selenium.pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
@Setter
public class HomePage extends BasePage {

    private WebElement getStartedButton;

    private WebElement bannerText;

    public HomePage(WebDriver webDriver) {
        super(webDriver);

        getStartedButton = new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.elementToBeClickable(By.id("get-started")));
        bannerText = webDriver.findElement(By.xpath("//*[@id=\"get-started-container\"]/h1"));
    }

    public SignUpPage goToSignUpPage() {
        getStartedButton.click();

        return new SignUpPage(getWebDriver());
    }


}
