package pages;

import baseEntity.BasePageFactory;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MilestonesPage extends BasePageFactory {

    // Проверка, что milestones с названием 'MilestoneDiploma' отобразился на странице
    @FindBy(xpath = "//a[text()='Cool']")
    public WebElement stonesNameField;

    // Нажатие на кнопку Edit
    @FindBy(xpath = "//a[text()='Edit']")
    public WebElement editStonesButton;

    @FindBy(className = "sidebar-button")
    public WebElement addMilestoneButton;


    public MilestonesPage(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
//        return stonesNameField.isDisplayed();
        return addMilestoneButton.isDisplayed();
    }
}
