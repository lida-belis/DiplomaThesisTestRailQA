package pages;

import baseEntity.BasePage;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MilestonesPage extends BasePage {

    @FindBy(xpath = "//a[text()='Edit']")
    public WebElement editStonesButton;

    @FindBy(className = "sidebar-button")
    public WebElement addMilestoneButton;


    public MilestonesPage(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return addMilestoneButton.isDisplayed();
    }
}
