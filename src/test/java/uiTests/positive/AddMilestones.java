package uiTests.positive;

import baseEntity.BaseTest;
import models.User;
import org.testng.annotations.Test;
import steps.*;

public class AddMilestones extends BaseTest {

    @Test
    public void addMilestonesTest() {
        User user = new User.Builder()
                .withEmail("atrostyanko+master@gmail.com")
                .withPassword("QqtRK9elseEfAk6ilYcJ")
                .build();
        LoginStep loginStep = new LoginStep(browsersService);
        loginStep.login(user);

        DashboardStep dashboardStep = new DashboardStep(browsersService);
        dashboardStep.addProject();

        ProjectStep addProjectStep = new ProjectStep(browsersService);
        addProjectStep.addNewProject("Lida_Vladimir", "Use a single repository for all cases (recommended)");
        dashboardStep.enterProject();

        MilestonesStep milestonesStep = new MilestonesStep(browsersService);
        milestonesStep.addMilestones();
    }

    @Test
    public void deleteMilestonesTest() {
        MilestonesStep milestonesStep = new MilestonesStep(browsersService);
        milestonesStep.deleteMilestones();
    }
}

