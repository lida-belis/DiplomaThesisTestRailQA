package pages;

import baseEntity.BasePageFactory;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomField extends BasePageFactory {

    @FindBy(xpath = "//a[@href='index.php?/admin/fields/add/1']")
    public WebElement addCaseField;

    @FindBy(id = "accept")
    public WebElement addFieldButton;

    @FindBy(id = "label")
    public WebElement labelField;

    @FindBy(id = "name")
    public WebElement systemNameField;

    @FindBy(xpath = "//h1[text()='An Error Occurred']")
    public WebElement messageError;

    public AddCustomField(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() {
        browsersService.getDriver().get(browsersService.getBaseUrl() + "index.php?/admin/custom/overview");
    }

    @Override
    public boolean isPageOpened() {
        return addFieldButton.isDisplayed();
    }
}
