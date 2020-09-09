package pages;

import baseEntity.BasePage;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends BasePage {

    @FindBy(id = "sidebar-milestones-add")
    public WebElement addMilestonesButtonOver;

    @FindBy(id = "navigation-milestones")
    public WebElement milestonesButton;

    public OverviewPage(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return addMilestonesButtonOver.isDisplayed();
    }
}
