package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class PostCreateNewUserStepDef {

    @Steps
    ReqresAPI reqresAPI;

    @Given("Post create new user with valid json")
    public void postCreateNewUserWithValidJson() {
        File json = new File(Constants.REQ_BODY +"/PostCreateUserWithValidData.json");
        reqresAPI.postCreateNewUsers(json);
    }

    @When("Send request post create new user")
    public void sendRequestPostCreateNewUser() {
        SerenityRest.when().post(ReqresAPI.POST_CREATE_USERS);
    }

    @Then("Status code should be {int} created")
    public void statusCodeShouldBeCreated(int created) {
        SerenityRest.then().statusCode(created);
    }
    @And("Response body name was {string} and job was {string}")
    public void responseBodyNameWasAndJobWas(String name, String job) {
        SerenityRest.then()
                .body(ReqresResponses.NAME,equalTo(name))
                .body(ReqresResponses.JOB,equalTo(job));

    }
////////////////////////////SCENARIO2
    @Given("Post create new user with empty name")
    public void postCreateNewUserWithEmptyName() {
        File json = new File(Constants.REQ_BODY +"/PostCreateNewUserWithEmptyName.json");
        reqresAPI.postCreateNewUsers(json);
    }
    ////////////////////////////SCENARIO3
    @Given("Post create new user with empty job")
    public void postCreateNewUserWithEmptyJob() {
        File json = new File(Constants.REQ_BODY +"/PostCreateNewUserWithEmptyJob.json");
        reqresAPI.postCreateNewUsers(json);
    }
    ////////////////////////////SCENARIO4
    @Given("Post create new user with empty name and empty job")
    public void postCreateNewUserWithEmptyNameAndEmptyJob() {
        File json = new File(Constants.REQ_BODY +"/PostCreateNewUserWithEmptyJobAndEmptyName.json");
        reqresAPI.postCreateNewUsers(json);
    }

    @And("Validate post create new user with valid data json schema validator")
    public void validatePostCreateNewUserWithValidDataJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA + "/PostCreateUserWithValidDataSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}
