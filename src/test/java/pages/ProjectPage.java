package pages;

import baseEntity.BasePageFactory;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectPage  extends BasePageFactory {

    @FindBy(className = "message message-success")
    public WebElement pageIdentifier;

    @FindBy(id = "navigation-dashboard")
    public WebElement dashboardButton;

    public ProjectPage(BrowsersService browsersService, boolean openPageByUrl) {
        super(browsersService, openPageByUrl);
    }

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return pageIdentifier.isDisplayed();
    }
}
