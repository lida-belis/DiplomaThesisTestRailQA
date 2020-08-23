package uiTests.positive;

import baseEntity.BaseTest;
import org.testng.annotations.Test;
import steps.LoginStep;

public class SmokeTest1 extends BaseTest {
    @Test
    public void login(){
        LoginStep loginStep = new LoginStep(browsersService);
        loginStep.login(user);
    }
}

