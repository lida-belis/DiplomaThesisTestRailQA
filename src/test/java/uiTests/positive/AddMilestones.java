package uiTests.positive;

import baseEntity.BaseTest;
import models.User;
import org.testng.annotations.Test;
import pages.MilestonesEditPage;
import steps.*;

public class AddMilestones extends BaseTest {

    @Test
    public void addMilestones() {
        User user = new User.Builder()
                .withEmail("atrostyanko+master@gmail.com")
                .withPassword("QqtRK9elseEfAk6ilYcJ")
                .build();
        LoginStep loginStep = new LoginStep(browsersService);
        loginStep.login(user);

        DashboardStep dashboardStep = new DashboardStep(browsersService);
        dashboardStep.addProject();

        AddProjectStep addProjectStep = new AddProjectStep(browsersService);
        addProjectStep.addNewProject("Lida_Vladimir", "Use a single repository for all cases (recommended)");
        dashboardStep.enterProject();

        AddMilestonesStep addMilestonesStep = new AddMilestonesStep(browsersService);
        addMilestonesStep.addMilestones();

        MilestonesEditStep milestonesEditStep = new MilestonesEditStep(browsersService);
        milestonesEditStep.deleteMilestones();

    }
}

