package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import pages.MilestonesEditPage;
import pages.MilestonesPage;

public class MilestonesEditStep extends BaseStep {

    public MilestonesEditStep(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void deleteMilestones() {
        MilestonesPage milestonesPage = new MilestonesPage(browsersService);
        milestonesPage.editStonesButton.click();

        MilestonesEditPage milestonesEditPage = new MilestonesEditPage(browsersService);
        milestonesEditPage.deleteStonesButton.click();
        milestonesEditPage.deleteStonesButtonV.click();
        milestonesEditPage.deleteStonesButtonOk.click();
    }
}
