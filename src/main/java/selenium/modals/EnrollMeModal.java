package selenium.modals;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
@Setter
public class EnrollMeModal {

    @FindBy(id = "studentName")
    private WebElement username;

    @FindBy(id = "emailAddr")
    private WebElement email;

    @FindBy(id = "courseName")
    private WebElement chosenCourse;

    @FindBy(id = "level")
    private WebElement chosenLevel;

    private WebDriver webDriver;

    public EnrollMeModal(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }


}
