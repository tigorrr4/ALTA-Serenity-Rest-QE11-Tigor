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

public class PostLoginSuccessfulStepDef {
    @Steps
    ReqresAPI reqresAPI;
    @Given("Post login user successful with valid data json")
    public void postLoginUserSuccessfulWithValidDataJson() {
        File json = new File(Constants.REQ_BODY+ "/PostLoginWithValidData.json");
        reqresAPI.postLoginUser(json);
    }
    @When("Send request post login")
    public void sendRequestPostLogin() {
        SerenityRest.when().post(ReqresAPI.POST_LOGIN);
    }

    @And("Response body contain token {}")
    public void responseBodyContainToken(String Token) {
        SerenityRest.and()
                .body(ReqresResponses.TOKEN,equalTo(Token));
    }


    @And("Validate post login user Successful with valid data json schema validator")
    public void validatePostLoginUserSuccessfulWithValidDataJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA + "/PostLoginSuccessfulWithValidDataSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

}

