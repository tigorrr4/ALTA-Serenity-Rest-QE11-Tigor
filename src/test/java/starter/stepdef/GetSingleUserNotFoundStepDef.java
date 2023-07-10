package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;

public class GetSingleUserNotFoundStepDef {

    @Steps
    ReqresAPI reqresAPI;
    @Given("Get single resource not found with invalid {}")
    public void getSingleResourceNotFoundWithInvalid(int id) {
        reqresAPI.getSingleUser(id);
    }
    @When("Send request get single users not found")
    public void sendRequestGetsSingleListUsers() {
        SerenityRest.when().get(ReqresAPI.GET_SINGLE_USER);
    }

    @Then("Status code should return {int} not found")
    public void statusWillReturnNotFound(int Not_Found) {
        SerenityRest.then().statusCode(Not_Found);
    }

    @Given("Get single user not found with special character {}")
    public void getSingleUserNotFoundWithSpecialCharacter(String character ) {
        reqresAPI.getListUsersWithChar(character);
    }

    @When("Send request get single user not found with special character")
    public void sendRequestGetSingleUserNotFoundWithSpecialCharacter() {
        SerenityRest.when().get(ReqresAPI.GET_SINGLE_USER_NOT_SPECIAL);
    }
}
