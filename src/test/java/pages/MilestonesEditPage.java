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

    //Поставить галочку в диалоговом окне
    @FindBy(xpath = "//span[@class='dialog-confirm-busy']/../input")
    public WebElement deleteStonesButtonV;

    //Нажать ОК в диалоговом окне
    @FindBy(xpath = "//div[@id='dialog-ident-deleteDialog']/div[@id='deleteDialog']" +
            "/div[@class='button-group dialog-buttons-highlighted']/a")
    public WebElement deleteStonesButtonOk;

    public MilestonesEditPage(BrowsersService browsersService) {
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
