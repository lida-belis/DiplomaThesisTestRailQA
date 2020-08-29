package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import pages.AddMilestonesPage;
import pages.EditMilestonesPage;
import pages.MilestonesPage;
import pages.OverviewPage;

public class MilestonesStep extends BaseStep {

//    OverviewPage overviewPage = new OverviewPage(browsersService);
//    AddMilestonesPage addMilestonesPage = new AddMilestonesPage(browsersService);
//    MilestonesPage milestonesPage = new MilestonesPage(browsersService);

    public MilestonesStep(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void addMilestonesStep() {
        OverviewPage overviewPage = new OverviewPage(browsersService);
        overviewPage.addMilestonesButtonOver.click();
        AddMilestonesPage addMilestonesPage = new AddMilestonesPage(browsersService);
        addMilestonesPage.nameMilestonesField.sendKeys("Cool");
        addMilestonesPage.addMilestoneButton.click();
    }

    @Step
    public void deleteMilestones() {
        MilestonesPage milestonesPage = new MilestonesPage(browsersService);
        milestonesPage.editStonesButton.click();

        EditMilestonesPage milestonesEditPage = new EditMilestonesPage(browsersService);
        milestonesEditPage.deleteStonesButton.click();
        milestonesEditPage.deleteStonesButtonV.click();
        milestonesEditPage.deleteStonesButtonOk.click();
    }

    @Step
    public void dialogBoxAndFileUpload() {
        OverviewPage overviewPage = new OverviewPage(browsersService);
        overviewPage.milestonesButton.click();
        MilestonesPage milestonesPage = new MilestonesPage(browsersService);
        milestonesPage.editStonesButton.click();
        AddMilestonesPage addMilestonesPage = new AddMilestonesPage(browsersService);
        addMilestonesPage.dialogBox.click();
        addMilestonesPage.fileUpload.sendKeys("D:/zoub1wL7Zo0-3");
        addMilestonesPage.addImages.click();
        addMilestonesPage.addMilestoneButton.click();
    }

    @Step
    public void incorrectDataUsage() {
        OverviewPage overviewPage = new OverviewPage(browsersService);
        overviewPage.milestonesButton.click();
        MilestonesPage milestonesPage = new MilestonesPage(browsersService);
        milestonesPage.editStonesButton.click();
        AddMilestonesPage addMilestonesPage = new AddMilestonesPage(browsersService);
        addMilestonesPage.startDateField.sendKeys("///");
        addMilestonesPage.addMilestoneButton.click();
    }

    @Step
    public String getErrorMessage() {
        AddMilestonesPage addMilestonesPage = new AddMilestonesPage(browsersService);
        WebElement errorMessage = addMilestonesPage.errorMessage;
        return errorMessage.getText();
    }
}
