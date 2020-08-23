package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import pages.AddProjectPage;

public class AddProjectStep extends BaseStep {

    public AddProjectStep(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void addNewProject(String name, String type) {
        AddProjectPage addProjectPage = new AddProjectPage(browsersService);
        addProjectPage.nameField.sendKeys(name);

        switch (type) {
            case "Use a single repository for all cases (recommended)":
                addProjectPage.suiteModeSingleOption.click();
                break;
            case "Use a single repository with baseline support":
                addProjectPage.suiteModeSingleBaselineOption.click();
                break;
            case "Use multiple test suites to manage cases":
                addProjectPage.suiteModeMultiSelectorOption.click();
                break;
        }
    }
}
