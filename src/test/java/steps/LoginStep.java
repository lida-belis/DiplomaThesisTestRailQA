package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import models.User;
import pages.LoginPage;

public class LoginStep extends BaseStep {

    public LoginStep(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void login(User user) {
        LoginPage loginPage = new LoginPage(browsersService);

        loginPage.emailField.sendKeys(user.getEmail());
        loginPage.passwordField.sendKeys(user.getPassword());
        loginPage.loginButton.click();
    }
}
