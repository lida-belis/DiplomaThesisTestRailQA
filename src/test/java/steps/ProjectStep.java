package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import pages.ProjectPage;

public class ProjectStep extends BaseStep {

    public ProjectStep(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void clickDashboard(){
        ProjectPage projectPage = new ProjectPage(browsersService);
//        projectPage.dashboardButton.click();
    }
}
