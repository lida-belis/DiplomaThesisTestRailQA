package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import pages.AddCustomFieldPage;
import pages.ErrorPage;

public class AddCustomStep extends BaseStep {

    public AddCustomStep(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void limitingValues() {
        AddCustomFieldPage addCustomField = new AddCustomFieldPage(browsersService, true);
        addCustomField.addCaseField.click();
        addCustomField.labelField.sendKeys("Hi");
        addCustomField.systemNameField.sendKeys("qwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopasdfghjq");
        addCustomField.addFieldButton.click();
    }

    @Step
    public String getErrorMessage() {
        ErrorPage errorPage = new ErrorPage(browsersService);
        WebElement messageError = errorPage.messageError;
        return messageError.getText();
    }
}
