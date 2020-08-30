package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import pages.AdministrationPage;
import pages.ProjectPage;

public class AdministrationStep extends BaseStep {

    public AdministrationStep(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void deleteProjectStep() {
        AdministrationPage administrationPage = new AdministrationPage(browsersService, true);
        administrationPage.projectButton.click();
        ProjectPage projectPage = new ProjectPage(browsersService);
        projectPage.deleteProjectButton.click();
        projectPage.deleteProjectButtonV.click();
        projectPage.deleteProjectButtonOk.click();
    }
}
