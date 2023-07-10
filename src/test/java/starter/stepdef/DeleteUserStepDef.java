package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;

public class DeleteUserStepDef {

    @Steps
    ReqresAPI reqresAPI;


    @Given("Delete user with valid id {int}")
    public void deleteUserWithValidId(int id) {
        reqresAPI.deleteUsers(id);
    }

    @When("Send request delete user")
    public void sendRequestDeleteUser() {
        SerenityRest.when().delete(ReqresAPI.DELETE_USER);
    }

    @Then("Code should be {int} No Content")
    public void codeShouldBeNoContent(int noContent) {
        SerenityRest.then().statusCode(noContent);
    }
}
