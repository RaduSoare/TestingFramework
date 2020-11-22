package selenium.pages;

import lombok.Getter;
import lombok.Setter;
import model.SignUpInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import selenium.modals.EnrollMeModal;

import java.util.List;

@Getter
@Setter
public class SignUpPage extends BasePage {

    @FindBy(name = "radio")
    private List<WebElement> courseRadioButtons;

    @FindBy(id = "slct")
    private WebElement levelSelector;

    @FindBy(name = "name")
    private WebElement nameInput;

    @FindBy(name = "email")
    private WebElement emailInput;

    @FindBy(name = "message")
    private WebElement messageInput;

    @FindBy(xpath = "//*[@id=\"contact\"]/div[1]/button")
    private WebElement enrollMeButton;


    public SignUpPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public EnrollMeModal fillForm(SignUpInfo signUpInfo) {
        chooseCourse(signUpInfo.getCourseIndex());
        chooseLevel(signUpInfo.getLevelIndex());
        fillName(signUpInfo.getName());
        fillEmail(signUpInfo.getEmail());
        fillMessage(signUpInfo.getMessage());
        enrollMeAction();

        return new EnrollMeModal(getWebDriver());

    }

    public void chooseCourse(int index) {
        courseRadioButtons.get(index).click();
    }

    public void chooseLevel(int index) {
        new Select(levelSelector).selectByIndex(index);
    }

    public void fillName(String name) {
        nameInput.sendKeys(name);
    }

    public void fillEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void fillMessage(String mesasge) {
        messageInput.sendKeys(mesasge);
    }

    public void enrollMeAction() {
        enrollMeButton.click();
    }

}
