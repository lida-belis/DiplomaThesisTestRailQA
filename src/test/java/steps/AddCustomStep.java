package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import pages.AddCustomField;
import pages.AddMilestonesPage;

public class AddCustomStep extends BaseStep {

    public AddCustomStep(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void limitingValues() {
        AddCustomField addCustomField = new AddCustomField(browsersService);
        addCustomField.addCaseField.click();
        addCustomField.labelField.sendKeys("Hi");
        addCustomField.systemNameField.sendKeys("qwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopasdfghj");
        addCustomField.addFieldButton.click();
    }

    @Step
    public String getErrorMessage() {
        AddCustomField addCustomField = new AddCustomField(browsersService);
        WebElement errorMessage = addCustomField.messageError;
        return errorMessage.getText();
    }
}
