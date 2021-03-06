package apiTests;

import baseEntity.BaseTestApi;
import io.restassured.mapper.ObjectMapperType;
import models.MilestonesApi;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ApiTest extends BaseTestApi {
    int milestoneID;

    @Test
    public void addMilestone() {
        String endpoint = "index.php?/api/v2/add_milestone/24";

        MilestonesApi project = new MilestonesApi.Builder()
                .withName("Lida")
                .withDescription("Hi, my name is Vladimir")
                .build();

        milestoneID = given()
                .body(project, ObjectMapperType.GSON)
                .when()
                .post(endpoint)
                .then().log().body()
                .body("name", is(project.getName()))
                .body("description", is(project.getDescription()))
                .statusCode(HttpStatus.SC_OK)
                .extract().jsonPath().get("id");
    }

    @Test
    public void getMilestone200() {
        String endpoint = "index.php?/api/v2/get_milestone/{milestone_id}";

        given()
                .pathParam("milestone_id", milestoneID)
                .when()
                .get(endpoint)
                .then().log().body()
                .body("name", is("Lida"))
                .body("description", is("Hi, my name is Vladimir"))
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void getMilestones400() {
        String endpoint = "index.php?/api/v2/get_milestones/1";

        given()
                .when()
                .get(endpoint)
                .then().log().body()
                .body("error", is("Field :project_id is not a valid or accessible project."))
                .statusCode(HttpStatus.SC_BAD_REQUEST);
    }

    @Test
    public void getMilestones403() {
        String endpoint = "index.php?/api/v2/get_milestones/25";

        given()
                .when()
                .get(endpoint)
                .then().log().body()
                .body("error", is("The requested project does not exist or you do not have the permissions to access it."))
                .statusCode(HttpStatus.SC_FORBIDDEN);
    }
}
