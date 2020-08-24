package pages;

import baseEntity.BasePageFactory;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePageFactory {

    @FindBy(id = "sidebar-projects-add")
    public WebElement addProjectButton;

    @FindBy(xpath = "//div/a[text()='Lida_Vladimir']")
    public WebElement nameProjectButton;

    public DashboardPage(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return addProjectButton.isDisplayed();
    }
}
