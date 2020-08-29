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
    AddMilestonesPage milestonesAddPage = new AddMilestonesPage(browsersService);
    MilestonesPage milestonesPage = new MilestonesPage(browsersService);

    public MilestonesStep(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void addMilestones() {
//        overviewPage.milestonesButton.click();
        overviewPage.addMilestonesButtonOver.click();
//        milestonesPage.addMilestoneButton.click();
        milestonesAddPage.nameMilestonesField.sendKeys("Cool");
        milestonesAddPage.addMilestoneButton.click();
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
        milestonesAddPage.dialogBox.click();
        milestonesAddPage.fileUpload.sendKeys("D:/zoub1wL7Zo0-3");
        milestonesAddPage.addImages.click();
        milestonesAddPage.addMilestoneButton.click();
    }

    @Step
    public void incorrectDataUsage() {
        overviewPage.milestonesButton.click();
        milestonesPage.editStonesButton.click();
        milestonesAddPage.startDateField.sendKeys("///");
        milestonesAddPage.addMilestoneButton.click();
    }

    @Step
    public String getErrorMessage() {
        WebElement errorMessage = milestonesAddPage.errorMessage;
        return errorMessage.getText();
    }
}
