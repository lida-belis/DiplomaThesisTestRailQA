package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import pages.MilestonesPage;

public class MilestonesStep extends BaseStep {

    public MilestonesStep(BrowsersService browsersService){
        super(browsersService);
    }

    @Step
    public void milestones(){
        MilestonesPage milestonesPage = new MilestonesPage(browsersService);

        milestonesPage.editStonesButton.click();
    }

}
