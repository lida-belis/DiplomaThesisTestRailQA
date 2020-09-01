package pages;

import baseEntity.BasePageFactory;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditMilestonesPage extends BasePageFactory {

    @FindBy(xpath = "//a[text()='Delete this milestone']")
    public WebElement deleteStonesButton;

    public EditMilestonesPage(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return deleteStonesButton.isDisplayed();
    }
}
