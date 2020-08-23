package pages;

import baseEntity.BasePageFactory;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePageFactory {

    @FindBy(id = "sidebar-projects-add")
    public WebElement addProjectButton;

    @FindBy(className = "content-header-title page_title")
    public WebElement pageIdentifier;

    public DashboardPage(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return pageIdentifier.getText().equalsIgnoreCase("All Projects");
    }
}
