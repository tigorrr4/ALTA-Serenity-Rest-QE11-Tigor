package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;

public class GetSingleResourcesNotFoundStepDef {

    @Steps
    ReqresAPI reqresAPI;
    @Given("Get single resource not found with id {}")
    public void getSingleResourceNotFoundWithId(int id) {
        reqresAPI.getSingleResourcesNotFound(id);
    }
    @When("Send request get single resource not found")
    public void sendRequestGetSingleResourceNotFound() {
        SerenityRest.when().get(ReqresAPI.GET_SINGLE_RESOURCE_NOT_FOUND);
    }

    @Given("Get single resource not found with special character {}")
    public void getSingleResourceNotFoundWithSpecialCharacter(String character) {
        reqresAPI.getSingleResourceNotFoundWithSpecialCharacter(character);
    }

    @When("Send request get single resource not found with special character")
    public void sendRequestGetSingleResourceNotFoundWithSpecialCharacter() {
        SerenityRest.when().get(ReqresAPI.GET_SINGLE_RESOURCE_NOT_CHAR);
    }

    @Given("Get single resource not found with alphabet {}")
    public void getSingleResourceNotFoundWithAlphabet(String alphabet) {
        reqresAPI.getSingleResourceNotFoundWithalphabet(alphabet);
    }

    @When("Send request get single resource not found with alphabet")
    public void sendRequestGetSingleResourceNotFoundWithAlphabet() {
        SerenityRest.when().get(ReqresAPI.GET_SINGLE_RESOURCE_NOT_ALP);
    }
}
