package uiTests;

import baseEntity.BaseTest;
import models.User;
import org.testng.annotations.Test;
import steps.AdministrationStep;
import steps.LoginStep;

public class FinishTest extends BaseTest {

    @Test
    public void deleteProjectTest() {
        User user = new User.Builder()
                .withEmail("atrostyanko+master@gmail.com")
                .withPassword("QqtRK9elseEfAk6ilYcJ")
                .build();
        LoginStep loginStep = new LoginStep(browsersService);
        loginStep.login(user);

        AdministrationStep administrationStep = new AdministrationStep(browsersService);
        administrationStep.deleteProjectStep();
    }
}
