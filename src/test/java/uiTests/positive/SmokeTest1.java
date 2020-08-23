package uiTests.positive;

import baseEntity.BaseTest;
import models.User;
import org.testng.annotations.Test;
import pages.LoginPage;
import steps.LoginStep;

public class SmokeTest1 extends BaseTest {
    @Test
    public void login(){
        User user = new User.Builder()
                .withEmail("atrostyanko+master@gmail.com")
                .withPassword("QqtRK9elseEfAk6ilYcJ")
                .build();
        LoginStep loginStep = new LoginStep(browsersService);
        loginStep.login(user);
    }
}

