package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import pages.DashboardPage;

public class DashboardStep extends BaseStep {


    public DashboardStep(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void addProject() {
        DashboardPage dashboardPage = new DashboardPage(browsersService);
        dashboardPage.addProjectButtonDash.click();
    }

    @Step
    public void enterProject(){
        DashboardPage dashboardPage = new DashboardPage(browsersService);
        dashboardPage.nameProjectButton.click();
    }
}
