package base;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.ModalInfo;
import model.SignUpInfo;
import selenium.modals.EnrollMeModal;
import selenium.pages.LoginPage;
import selenium.pages.SignUpPage;

import java.io.File;
import java.io.IOException;

public class SignUpBaseTest extends BaseTest {

    protected ModalInfo expectedModalData;

    public EnrollMeModal initSignUpTest() throws IOException {
        logger.info("Go to SignUp page");
        SignUpPage signUpPage = goToSignUpPage();

        logger.info("Get the data to be entered from JSON file");
        ObjectMapper objectMapper = new ObjectMapper();
        SignUpInfo signUpInfo = objectMapper.readValue(new File("src\\test\\resources\\jsons\\inputs\\signUpData.json"), SignUpInfo.class);

        logger.info("Get the standard data");
        expectedModalData = objectMapper.readValue(new File("src\\test\\resources\\jsons\\tests\\modalData.json"), ModalInfo.class);

        logger.info("Fill the form");
        return signUpPage.fillForm(signUpInfo);
    }
}
