package uiTests;

import baseEntity.BaseTest;
import models.User;
import org.testng.annotations.Test;
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
}
