package pages;

import baseEntity.BasePageFactory;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MilestonesAddPage extends BasePageFactory {

    //Поле Name*
    @FindBy(xpath = "//label[@for='name']/../input[@id='name']")
    public WebElement nameMilestonesField;

    //Кнопка "Add Milestone"
    @FindBy(xpath = "//button[@id='accept']")
    public WebElement addMilestoneButton;

    public MilestonesAddPage(BrowsersService browsersService) {
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
