package pages;

import baseEntity.BasePageFactory;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddMilestonesPage extends BasePageFactory {

    @FindBy(id = "name")
    public WebElement nameMilestonesField;

    @FindBy(id = "start_on")
    public WebElement startDateField;

    @FindBy(className = "icon-markdown-image")
    public WebElement dialogBox;

    @FindBy(xpath = "/html/body/input[2]")
    public WebElement fileUpload;

    @FindBy(id = "attachmentSubmit")
    public WebElement addImages;

    @FindBy(id = "accept")
    public WebElement addMilestoneButton;

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
