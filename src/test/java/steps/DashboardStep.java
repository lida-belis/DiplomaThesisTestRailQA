package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import pages.DashboardPage;

public class DashboardStep extends BaseStep {
    DashboardPage dashboardPage = new DashboardPage(browsersService);

    public DashboardStep(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void addProject() {
        dashboardPage.addProjectButton.click();
    }

    @Step
    public void enterProject(){
        dashboardPage.nameProjectButton.click();
    }
}
