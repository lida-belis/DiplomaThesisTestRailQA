package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import pages.MilestonesAddPage;
import pages.OverviewPage;

public class AddMilestonesStep extends BaseStep {

    public AddMilestonesStep(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void addMilestones(){
        OverviewPage overviewPage = new OverviewPage(browsersService);
        overviewPage.addMilestonesButton.click();

        MilestonesAddPage milestonesAddPage = new MilestonesAddPage(browsersService);
        milestonesAddPage.nameMilestonesField.sendKeys("Cool");
        milestonesAddPage.addMilestoneButton.click();
    }
}
