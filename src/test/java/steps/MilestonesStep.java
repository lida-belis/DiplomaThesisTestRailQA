package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import pages.AddMilestonesPage;
import pages.EditMilestonesPage;
import pages.MilestonesPage;
import pages.OverviewPage;

import java.io.File;

public class MilestonesStep extends BaseStep {

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
    public void dialogBoxAndFileUpload() {
        OverviewPage overviewPage = new OverviewPage(browsersService);
        overviewPage.milestonesButton.click();
        MilestonesPage milestonesPage = new MilestonesPage(browsersService);
        milestonesPage.editStonesButton.click();
        AddMilestonesPage addMilestonesPage = new AddMilestonesPage(browsersService);
        addMilestonesPage.dialogBox.click();

        String path = "src/test/resources/zoub1wL7Zo0-3.jpg";

        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        addMilestonesPage.fileUpload.sendKeys(absolutePath);
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
        addMilestonesPage.nameMilestonesField.click();
        addMilestonesPage.addMilestoneButton.click();
    }

    @Step
    public void edgeValue() {
        OverviewPage overviewPage = new OverviewPage(browsersService);
        overviewPage.milestonesButton.click();
        MilestonesPage milestonesPage = new MilestonesPage(browsersService);
        milestonesPage.editStonesButton.click();
        AddMilestonesPage addMilestonesPage = new AddMilestonesPage(browsersService);
        addMilestonesPage.startDateField.sendKeys("31/12/1969");
        addMilestonesPage.nameMilestonesField.click();
        addMilestonesPage.nameMilestonesField.clear();
        addMilestonesPage.addMilestoneButton.click();

    }

    @Step
    public void edgeValue2() {
        AddMilestonesPage addMilestonesPage = new AddMilestonesPage(browsersService);
        addMilestonesPage.startDateField.clear();
        addMilestonesPage.startDateField.sendKeys("1/1/1970");
        addMilestonesPage.nameMilestonesField.click();
        addMilestonesPage.addMilestoneButton.click();

    }

    @Step
    public String getErrorMessage() {
        AddMilestonesPage addMilestonesPage = new AddMilestonesPage(browsersService);
        WebElement errorMessage = addMilestonesPage.errorMessage;
        return errorMessage.getText();
    }

    @Step
    public String getErrorMessage2() {
        AddMilestonesPage addMilestonesPage2 = new AddMilestonesPage(browsersService);
        WebElement errorMessage2 = addMilestonesPage2.errorMessage2;
        return errorMessage2.getText();
    }
}
