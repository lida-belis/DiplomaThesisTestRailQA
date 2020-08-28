package uiTests;

import baseEntity.BaseTest;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.*;

public class NegativeTest extends BaseTest {

    @Test
    public void incorrectDataUsageTest() {
        User user = new User.Builder()
                .withEmail("atrostyanko+master@gmail.com")
                .withPassword("QqtRK9elseEfAk6ilYcJ")
                .build();
        LoginStep loginStep = new LoginStep(browsersService);
        loginStep.login(user);

        DashboardStep dashboardStep = new DashboardStep(browsersService);
        dashboardStep.enterProject();

        MilestonesStep milestonesStep = new MilestonesStep(browsersService);
        milestonesStep.incorrectDataUsage();
        Assert.assertEquals(milestonesStep.getErrorMessage(), "Field Start Date is not in a valid date format.");
    }

    @Test
    public void defectTest() {
        User user = new User.Builder()
                .withEmail("atrostyanko+master@gmail.com")
                .withPassword("QqtRK9elseEfAk6i")
                .build();
        LoginStep loginStep = new LoginStep(browsersService);
        loginStep.login(user);

        DashboardStep dashboardStep = new DashboardStep(browsersService);
        dashboardStep.enterProject();
    }
}
