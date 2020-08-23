package pages;

import baseEntity.BasePageFactory;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectPage extends BasePageFactory {

    @FindBy(id = "navigation-dashboard")
    public WebElement dashboardButton;

    public ProjectPage(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return browsersService.getDriver().getTitle().equalsIgnoreCase("Projects - TestRail");
    }
}
