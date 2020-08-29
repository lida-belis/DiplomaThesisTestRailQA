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

    OverviewPage overviewPage = new OverviewPage(browsersService);
    AddMilestonesPage addMilestonesPage = new AddMilestonesPage(browsersService);
    MilestonesPage milestonesPage = new MilestonesPage(browsersService);

    public MilestonesStep(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void addMilestonesStep() {
//        overviewPage.milestonesButton.click();
        overviewPage.addMilestonesButtonOver.click();
//        milestonesPage.addMilestoneButton.click();
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
        overviewPage.milestonesButton.click();
        milestonesPage.editStonesButton.click();
        addMilestonesPage.dialogBox.click();
        addMilestonesPage.fileUpload.sendKeys("D:/zoub1wL7Zo0-3");
        addMilestonesPage.addImages.click();
        addMilestonesPage.addMilestoneButton.click();
    }

    @Step
    public void incorrectDataUsage() {
        overviewPage.milestonesButton.click();
        milestonesPage.editStonesButton.click();
        addMilestonesPage.startDateField.sendKeys("///");
        addMilestonesPage.addMilestoneButton.click();
    }

    @Step
    public String getErrorMessage() {
        WebElement errorMessage = addMilestonesPage.errorMessage;
        return errorMessage.getText();
    }
}
