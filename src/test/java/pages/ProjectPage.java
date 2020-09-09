package pages;

import baseEntity.BasePage;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectPage extends BasePage {

    @FindBy(id = "navigation-dashboard")
    public WebElement dashboardButton;

    @FindBy(xpath = "//a[text()='Lida_Vladimir']/ancestor::tr//div[@class='icon-small-delete']")
    public WebElement deleteProjectButton;

    @FindBy(xpath = "//span[@class='dialog-confirm-busy']/../input")
    public WebElement deleteProjectButtonV;

    @FindBy(xpath = "//div[@id='deleteDialog']" +
            "/div[@class='button-group dialog-buttons-highlighted']/a")
    public WebElement deleteProjectButtonOk;

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
