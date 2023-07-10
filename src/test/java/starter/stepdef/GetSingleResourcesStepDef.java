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

public class GetSingleResourcesStepDef {

    @Steps
    ReqresAPI reqresAPI;
    @Given("Get single resource with valid id {}")
    public void getSingleResourceWithValidId(int id) {
        reqresAPI.getSingleResourcesWithValidId(id);

    }
    @Given("Send request get single resource user with valid id")
    public void sendRequestGetSingleResourceUserWithValidId() {
        SerenityRest.when().get(ReqresAPI.GET_SINGLE_RESOURCE);
    }

    @And("Response body should be contain {} {} {} {}")
    public void responseBodyShouldBeContain(String name, int year, String color, String pantone_value) {
        SerenityRest.then()
                .body(ReqresResponses.NAME_GET_SINGLE_RESOURCE, equalTo(name))
                .body(ReqresResponses.YEAR, equalTo(year))
                .body(ReqresResponses.COLOR, equalTo(color))
                .body(ReqresResponses.PANTONE_VALUE, equalTo(pantone_value));}

    @When("Send request get single resource user with invalid id")
    public void sendRequestGetSingleResourceUserWithInvalidId() {
        SerenityRest.when().get(ReqresAPI.GET_SINGLE_RESOURCE);
    }

    @Given("Get single resource with invalid id {}")
    public void getSingleResourceWithInvalidId(int id) {
        reqresAPI.getSingleResourcesWithValidId(id);
    }

    @Given("Get single resource with SpecialCharacter {}")
    public void getSingleResourceWithSpecialCharacter(String character) {
        reqresAPI.getSingleResourcesWithSpecialCharacter(character);
    }

    @When("Send request get single resource user with invalid character")
    public void sendRequestGetSingleResourceUserWithInvalidCharacter() {
        SerenityRest.when().get(ReqresAPI.GET_SINGLE_RESOURCE_CHAR);
    }

    @And("Validate get single resource  with valid parameter page json schema validator")
    public void validateGetSingleResourceWithValidParameterPageJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA + "/GetSingleResourcesSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @And("Validate get single resource  with invalid parameter page json schema validator")
    public void validateGetSingleResourceWithInvalidParameterPageJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA + "/GetSingleResourcesWithInvalidSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get single resource with alphabet {}")
    public void getSingleResourceWithAlphabet(String alphabet) {
        reqresAPI.getSingleResourcesWithAlphabet(alphabet);
    }

    @When("Send request get single resource user with alphabet")
    public void sendRequestGetSingleResourceUserWithAlphabet() {
        SerenityRest.when().get(ReqresAPI.GET_SINGLE_RESOURCE_ALP);
    }
}
