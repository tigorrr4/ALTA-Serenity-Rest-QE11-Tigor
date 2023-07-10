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

public class GetSingleUserStepDef {
    @Steps
    ReqresAPI reqresAPI;



    @Given("Get list single user with parameter id {}")
    public void getListSingleUserWithParameterPage(int id) {
        reqresAPI.getSingleUser(id);
    }
    @When("Send request get single list users")
    public void sendRequestGetSingleListUsers() {
        SerenityRest.when().get(ReqresAPI.GET_SINGLE_USER);
    }


    @And("Response body page value will be {}")
    public void responseBodyPageValueWillBe(int id) {
        SerenityRest.and().body(ReqresResponses.ID1,equalTo(id));
    }

    @And("Response body contain {} {} {} {}")
    public void responseBodyContain(String email, String first_name, String last_name, String avatar) {
        SerenityRest.then()
                .body(ReqresResponses.EMAIL, equalTo(email))
                .body(ReqresResponses.FIRST_NAME, equalTo(first_name))
                .body(ReqresResponses.LAST_NAME, equalTo(last_name))
                .body(ReqresResponses.AVATAR, equalTo(avatar));
    }

    @Given("Get list single user with special character{}")
    public void getListSingleUserWithSpecialCharacter(String character) {
       reqresAPI.getSingleUsersWithSpecialCharacter(character);
    }

    @When("Send request get single list users with character")
    public void sendRequestGetSingleListUsersWithCharacter() {
        SerenityRest.when().get(ReqresAPI.GET_SINGLE_USER_SPECIAL_CHAR);
    }

    @Given("Get list single user with alphabet{}")
    public void getListSingleUserWithAlphabet(String alphabet) {
        reqresAPI.getSingleUsersWithAlphabet(alphabet);
    }

    @When("Send request get single list users with alphabet")
    public void sendRequestGetSingleListUsersWithAlphabet() {
        SerenityRest.when().get(ReqresAPI.GET_SINGLE_USER_SPECIAL_ALP);
    }

    @And("Validate get single user with valid parameter id json schema validator")
    public void validateGetSingleUserWithValidParameterIdJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA + "/GetSingleUserSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}
