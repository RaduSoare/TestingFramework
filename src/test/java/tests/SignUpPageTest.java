package tests;

import base.SignUpBaseTest;
import model.ModalInfo;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.modals.EnrollMeModal;

import java.io.IOException;

public class SignUpPageTest extends SignUpBaseTest {

    @Test
    public void signUpPageTest() throws IOException {

        EnrollMeModal enrollMeModal = initSignUpTest();

        ModalInfo actualModalData = new ModalInfo(enrollMeModal);

        logger.info("Test if datas displayed equal expected data");
        Assert.assertTrue(actualModalData.equals(expectedModalData));

    }
}
