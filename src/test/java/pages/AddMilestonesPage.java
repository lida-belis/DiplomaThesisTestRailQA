package pages;

import baseEntity.BasePageFactory;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddMilestonesPage extends BasePageFactory {

    //Поле Name*
    @FindBy(id = "name")
    public WebElement nameMilestonesField;

    //Поле StartDate
    @FindBy(id = "start_on")
    public WebElement startDateField;

    //Поле EndDate
    @FindBy(id = "due_on")
    public WebElement endDateField;

    @FindBy(className = "icon-markdown-image")
    public WebElement dialogBox;

    @FindBy(className = "icon-markdown-help")
    public WebElement upMessage;

    @FindBy(id = "attachmentDropzone")
    public WebElement fileUpload;

    @FindBy(id = "attachmentSubmit")
    public WebElement addImages;

    //Кнопка "Add Milestone"
    @FindBy(id = "accept")
    public WebElement addMilestoneButton;

    //Error
    @FindBy(xpath = "//div[text()='Field Start Date is not in a valid date format.']")
    public WebElement errorMessage;

    @FindBy(xpath = "//div[text()='Field Name is a required field.']")
    public WebElement errorMessage2;

    public AddMilestonesPage(BrowsersService browsersService) {
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
