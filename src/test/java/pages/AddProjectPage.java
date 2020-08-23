package pages;

import baseEntity.BasePageFactory;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProjectPage extends BasePageFactory {

    @FindBy(id = "accept")
    public WebElement pageIdentifier;

    @FindBy(id = "name")
    public WebElement nameField;

    @FindBy(id = "suite_mode_single")
    public WebElement suiteModeSingleOption;

    @FindBy(id = "suite_mode_single_baseline")
    public WebElement suiteModeSingleBaselineOption;

    @FindBy(id = "suite_mode_multi")
    public WebElement suiteModeMultiSelectorOption;

    @FindBy(id = "accept")
    public WebElement addProjectButton;

    public AddProjectPage(BrowsersService browsersService) {
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
