package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import pages.MilestonesAddPage;
import pages.OverviewPage;

public class AddMilestonesStep extends BaseStep {
    OverviewPage overviewPage = new OverviewPage(browsersService);
    MilestonesAddPage milestonesAddPage = new MilestonesAddPage(browsersService);

    public AddMilestonesStep(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void addMilestones() {
        overviewPage.addMilestonesButton.click();
        milestonesAddPage.nameMilestonesField.sendKeys("Cool");
        milestonesAddPage.addMilestoneButton.click();
    }

    @Step
    public void incorrectDataUsage() {
        overviewPage.addMilestonesButton.click();
        milestonesAddPage.nameMilestonesField.sendKeys("Interesting");
        milestonesAddPage.startDateField.sendKeys("///");
        milestonesAddPage.addMilestoneButton.click();
    }

    @Step
    public String getErrorMessage() {
        WebElement errorMessage = milestonesAddPage.errorMessage;
        return errorMessage.getText();
    }

    @Step
    public void dialogBoxAndFileUpload() {
        overviewPage.addMilestonesButton.click();
        milestonesAddPage.nameMilestonesField.sendKeys("Maybe");
        milestonesAddPage.dialogBox.click();
        milestonesAddPage.fileUpload.sendKeys("D:/zoub1wL7Zo0-3");
        milestonesAddPage.addImages.click();
        milestonesAddPage.addMilestoneButton.click();
    }
}
