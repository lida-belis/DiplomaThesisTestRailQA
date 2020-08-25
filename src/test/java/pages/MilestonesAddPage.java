package pages;

import baseEntity.BasePageFactory;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MilestonesAddPage extends BasePageFactory {

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

    @FindBy(id = "attachmentDropzone")
    public WebElement fileUpload;

    @FindBy(id = "attachmentSubmit")
    public WebElement addImages;

    //Кнопка "Add Milestone"
    @FindBy(xpath = "//button[@id='accept']")
    public WebElement addMilestoneButton;

    //Error
    @FindBy(xpath = "//div[text()='Field Start Date is not in a valid date format.']")
    public WebElement errorMessage;

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
