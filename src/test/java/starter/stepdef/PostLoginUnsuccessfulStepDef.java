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

public class PostLoginUnsuccessfulStepDef {
    @Steps
    ReqresAPI reqresAPI;
    //


    @Given("Post login user unsuccessful with empty password json")
    public void postLoginUserUnsuccessfulWithEmptyPasswordJson() {
        File json = new File(Constants.REQ_BODY+ "/PostLoginUnsuccessfulWithEmptyPassword.json");
        reqresAPI.postLoginUser(json);
    }

    @When("Send request post login unsuccessful with empty password")
    public void sendRequestPostLoginUnsuccessfulWithEmptyPassword() {
        SerenityRest.when().post(ReqresAPI.POST_LOGIN);
    }

///////////////////////////////////SCENARIO2
    @Given("Post register user unsuccessful with empty password")
    public void postRegisterUserUnsuccessfulWithEmptyPassword() {
        File json = new File(Constants.REQ_BODY+ "/PostLoginUserUnsuccessfulWithValidEmailAndEmptyPassword.json");
        reqresAPI.postLoginUser(json);
    }
    ///////////////////////////////////SCENARIO3
    @Given("Post Login user unsuccessful with empty email and valid password")
    public void postLoginUserUnsuccessfulWithEmptyEmailAndValidPassword() {
        File json = new File(Constants.REQ_BODY+ "/PostLoginUserUnsuccessfulWithEmptyEmailAndValidPassword.json");
        reqresAPI.postLoginUser(json);
    }

    @When("Send request post login user Unsuccessful")
    public void sendRequestPostLoginUserUnsuccessful() {
        SerenityRest.when().post(ReqresAPI.POST_LOGIN);
    }

    @And("Response body will show containing {string}")
    public void responseBodyWillShowContaining(String error) {
        SerenityRest.then().body(ReqresResponses.Missing_email_or_username, equalTo(error));
    }
    ///////////////////////////////////SCENARIO4
    @Given("Post Login user unsuccessful with empty email and empty password")
    public void postLoginUserUnsuccessfulWithEmptyEmailAndEmptyPassword() {
        File json = new File(Constants.REQ_BODY+ "/PostLoginUserUnsuccessfulWithEmptyEmailAndEmptyPassword.json");
        reqresAPI.postLoginUser(json);
    }

    @And("Validate post login user Unsuccessful with empty password json schema validator")
    public void validatePostLoginUserUnsuccessfulWithEmptyPasswordJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA + "/PostLoginUnsuccessfulWithEmptyPasswordSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    @And("Validate post login user Unsuccessful with empty email json schema validator")
    public void validatePostLoginUserUnsuccessfulWithEmptyEmailJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA + "/PostLoginUnsuccessfulWithEmptyEmailSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));

    }
    @And("Validate post login user Unsuccessful with empty email and empty password json schema validator")
    public void validatePostLoginUserUnsuccessfulWithEmptyEmailAndEmptyPasswordJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA + "/PostLoginUnsuccessfulWithEmptyEmailAndEmptyPasswordSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}
