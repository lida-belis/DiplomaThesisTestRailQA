package pages;

import baseEntity.BasePageFactory;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends BasePageFactory {

    @FindBy(id = "navigation-overview-addmilestones")
    public WebElement addMilestonesButton;

    @FindBy(id = "navigation-overview-addmilestones")
    public WebElement pageIdentifier;

    public OverviewPage(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return pageIdentifier.isDisplayed();
    }
}
