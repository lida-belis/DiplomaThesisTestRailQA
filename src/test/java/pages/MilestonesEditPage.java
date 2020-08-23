package pages;

import baseEntity.BasePageFactory;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MilestonesEditPage extends BasePageFactory {

    //Поле StartDate
    @FindBy(id = "start_on")
    public WebElement startDateField;

    //Поле EndDate
    @FindBy(id = "due_on")
    public WebElement endDateField;

    //Кнопка "Delete this milestones"
    @FindBy(xpath = "//a[text()='Delete this milestone']")
    public WebElement deleteStonesButton;

    public MilestonesEditPage(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return false;
    }
}
