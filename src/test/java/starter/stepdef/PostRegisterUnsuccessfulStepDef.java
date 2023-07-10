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

public class PostRegisterUnsuccessfulStepDef {

    @Steps
    ReqresAPI reqresAPI;
    @Given("Post register user unsuccessful invalid email")
    public void postRegisterUserUnsuccessfulInvalidEmail() {
        File json = new File(Constants.REQ_BODY+ "/PostRegisterUserUnsuccessfulWithInvalidEmail.json");
        reqresAPI.postRegisterUserSuccesful(json);
    }

    @Then("Status will return {int} Bad Request")
    public void statusWillReturnBadRequest(int Bad_Request) {
        SerenityRest.then().statusCode(Bad_Request);
    }



////////////////////////////////SCENARIO 2
    @Given("Post register user unsuccessful with empty email")
    public void postRegisterUserUnsuccessfulWithEmptyEmail() {
        File json = new File(Constants.REQ_BODY + "/PostRegisterUnsuccessfulWithEmptyEmail.json");
        reqresAPI.postRegisterUserSuccesful(json);
    }

    @When("Send request post register user successful")
    public void sendRequestPostRegisterUserSuccessful() {
        SerenityRest.when().post(ReqresAPI.POST_REGISTER_USER);
    }

    @And("Response body will be contain {string}")
    public void responseBodyWillBeContain(String error) {
        SerenityRest.then().body(ReqresResponses.Missing_email_or_password, equalTo(error));}

    @And("Validate post register user Unsuccessful with invalid email json schema validator")
    public void validatePostRegisterUserUnsuccessfulWithInvalidEmailJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA + "/PostRegisterUserWithInvalidEmailSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

}

