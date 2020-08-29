package apiTests;

import baseEntity.BaseTestApi;
import io.restassured.mapper.ObjectMapperType;
import models.MilestonesApi;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class apiTest extends BaseTestApi {

    @Test
    public void getMilestone1() {
        String endpoint = "index.php?/api/v2/get_milestones/114";

        given()
                .when()
                .get(endpoint)
                .then().log().body()
//                .body("id", equalTo(27))
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void getMilestone2() {
        String endpoint = "index.php?/api/v2/get_milestones/1";

        given()
                .when()
                .get(endpoint)
                .then().log().body()
                .statusCode(HttpStatus.SC_BAD_REQUEST);
    }

    @Test
    public void getMilestone3() {
        String endpoint = "index.php?/api/v2/get_milestones/113";

        given()
                .when()
                .get(endpoint)
                .then().log().body()
                .statusCode(HttpStatus.SC_FORBIDDEN);
    }

    @Test
    public void addMilestones() {
        String endpoint = "index.php?/api/v2/add_milestone/114";

        MilestonesApi project = new MilestonesApi.Builder()
                .withName("Lida")
                .build();

        given()
                .body(project, ObjectMapperType.GSON)
                .when()
                .post(endpoint)
                .then().log().body()
                .statusCode(HttpStatus.SC_OK);
    }

}
