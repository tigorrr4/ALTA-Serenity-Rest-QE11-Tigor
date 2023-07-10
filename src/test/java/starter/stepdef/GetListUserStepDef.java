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

public class GetListUserStepDef {
    @Steps
    ReqresAPI reqresAPI;
    @Given("Get list user with parameter page {int}")
    public void getListUserWithParameterPage(int page) {
        reqresAPI.getListUsers(page);
    }

    @When("Send request get list users")
    public void sendRequestGetListUsers() {
        SerenityRest.when().get(ReqresAPI.GET_LIST_USERS);
    }

    @Then("Status code should return {int} OK")
    public void statusCodeShouldReturnOK(int ok) {
        SerenityRest.then().statusCode(ok);
    }

    @And("Response body page value should be {int}")
    public void responseBodyPageShouldBe(int page) {
        SerenityRest.and().body(ReqresResponses.PAGE,equalTo(page));

    }

    @Given("Get list user with special character {}")
    public void getListUserWithSpecialCharacter(String character) {
        reqresAPI.getListUsersWithChar(character);
    }

    @When("Send request get list user char")
    public void sendRequestGetListUserChar() {
        SerenityRest.when().get(ReqresAPI.GET_LIST_USERS_CHAR);
    }

    @Given("Get list user with special alphabet {}")
    public void getListUserWithParameterPage(String alphabet) {
        reqresAPI.getListUsersWithalphabet(alphabet);
    }

    @When("Send request get list with alphabet")
    public void sendRequestGetListWithAlphabet() {
        SerenityRest.when().get(ReqresAPI.GET_LIST_USERS_ALPHABET);

    }

    @And("Validate get list user with valid parameter page json schema validator")
    public void validateGetListUserWithValidParameterPageJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA + "/GetListUserSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }


    @Given("Get list with invalid parameter page {}")
    public void getListWithInvalidParameterPage(int page) {
        reqresAPI.getListUsers(page);
    }

    @When("Send request get list user with parameter page")
    public void sendRequestGetListUserWithParameterPage() {
        SerenityRest.when().get(ReqresAPI.GET_LIST_USERS);
    }
}
