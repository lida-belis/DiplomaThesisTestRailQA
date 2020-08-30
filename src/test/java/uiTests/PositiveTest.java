package uiTests;

import baseEntity.BaseTest;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import steps.*;

public class PositiveTest extends BaseTest {

    @Test
    public void dialogBoxAndFileUploadTest() {
        User user = new User.Builder()
                .withEmail("atrostyanko+master@gmail.com")
                .withPassword("QqtRK9elseEfAk6ilYcJ")
                .build();
        LoginStep loginStep = new LoginStep(browsersService);
        loginStep.login(user);

        DashboardStep dashboardStep = new DashboardStep(browsersService);
        dashboardStep.enterProject();

        MilestonesStep milestonesStep = new MilestonesStep(browsersService);
        milestonesStep.dialogBoxAndFileUpload();
    }

    @Test
    public void edgeValueTest() {
        User user = new User.Builder()
                .withEmail("atrostyanko+master@gmail.com")
                .withPassword("QqtRK9elseEfAk6ilYcJ")
                .build();
        LoginStep loginStep = new LoginStep(browsersService);
        loginStep.login(user);

        DashboardStep dashboardStep = new DashboardStep(browsersService);
        dashboardStep.enterProject();

        MilestonesStep milestonesStep = new MilestonesStep(browsersService);
        milestonesStep.edgeValue();
        Assert.assertEquals(milestonesStep.getErrorMessage(), "Field Name is a required field.\n" +
                "Field Start Date is not in a valid date format.");
        milestonesStep.edgeValue2();
        Assert.assertEquals(milestonesStep.getErrorMessage2(), "Field Name is a required field.");
    }

    @Test
    public void limitValueTest() {
        User user = new User.Builder()
                .withEmail("atrostyanko+master@gmail.com")
                .withPassword("QqtRK9elseEfAk6ilYcJ")
                .build();
        LoginStep loginStep = new LoginStep(browsersService);
        loginStep.login(user);

//        DashboardPage dashboardPage = new DashboardPage(browsersService);

        AddCustomStep addCustomStep = new AddCustomStep(browsersService);
        addCustomStep.limitingValues();

        Assert.assertEquals(addCustomStep.getErrorMessage(), "An Error Occurred");
    }
}
