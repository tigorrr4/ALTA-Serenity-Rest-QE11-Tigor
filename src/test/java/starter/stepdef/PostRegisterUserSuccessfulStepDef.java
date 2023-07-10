package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class PostRegisterUserSuccessfulStepDef {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Post register user successful")
    public void postRegisterUserSuccessful() {
        File json = new File(Constants.REQ_BODY + "/PostRegisterUserSuccesful.json");
        reqresAPI.postRegisterUserSuccesful(json);
    }

    @When("Send request post register user")
    public void sendRequestPostRegisterUser() {
        SerenityRest.when().post(ReqresAPI.POST_REGISTER_USER);
    }


    @And("Response body containing {} and {}")
    public void responseBodyContainingIdAndToken(int id, String Token) {
        SerenityRest.then()
                .body(ReqresResponses.ID, equalTo(id))
                .body(ReqresResponses.TOKEN, equalTo(Token));
    }
    //////////////////////////SCENARIO 2
    @Given("Post register user unsuccessful with empty email and valid password")
    public void postRegisterUserUnsuccessfulWithEmptyEmailAndValidPassword() {
        File json = new File(Constants.REQ_BODY + "/PostRegisterUserUnsuccessfulWithEmptyEmailAndValidPassword.json");
        reqresAPI.postRegisterUserSuccesful(json);
    }


///////////////////////////////////////////////////SCENARIO 3
    @Given("Post register user unsuccessful with valid email and empty password")
    public void postRegisterUserUnsuccessfulWithValidEmailAndEmptyPassword() {
        File json = new File(Constants.REQ_BODY + "/PostRegisterUserUnsuccessfulWithValidEmailAndEmptyPassword.json");
        reqresAPI.postRegisterUserSuccesful(json);
    }

    @And("Response body will containing {string}")
    public void responseBodyWillContaining(String error) {
        SerenityRest.then().body(ReqresResponses.Missing_password, equalTo(error));

    }
    ///////////////////////////////////////////////////SCENARIO 4
    @Given("Post register user unsuccessful with invalid email and invalid password")
    public void postRegisterUserUnsuccessfulWithInvalidEmailAndInvalidPassword() {
        File json = new File(Constants.REQ_BODY + "/PostRegisterUserUnsuccessfulWithInvalidEmailAndInvalidPassword.json");
        reqresAPI.postRegisterUserSuccesful(json);
    }

    @And("Response body will containing  {string}")
    public void responseBodyWillContainingNote(String error) {
        SerenityRest.then().body(ReqresResponses.Only_defined_users_succeed_registration, equalTo(error));
    }

    @And("Validate post register user successful json schema")
    public void validatePostRegisterUserSuccessfulJsonSchema() {
        File json = new File(Constants.JSON_SCHEMA + "/PostRegisterUserWithValidDataSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @And("Validate post register user successful with empty email json schema validator")
    public void validatePostRegisterUserSuccessfulWithEmptyEmailJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA + "/PostRegisterUserWithEmptyEmailSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @And("Validate post register user successful with empty password json schema validator")
    public void validatePostRegisterUserSuccessfulWithEmptyPasswordJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA + "/PostRegisterUserWithEmptyPasswordSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}





