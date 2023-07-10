package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

import java.io.File;

public class PutUpdateUserStepDef {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Put update user with valid id {int} and json")
    public void putUpdateUserWithValidIdAndJson(int id) {
        File json = new File(Constants.REQ_BODY+"/UpdateUser.json");
        reqresAPI.putUpdateUsers(id,json);
    }

    @When("Send request put update user")
    public void sendRequestPutUpdateUser() {
        SerenityRest.when().put(ReqresAPI.PUT_UPDATE_USER);
    }

    @And("Validate put update user with valid data json schema validator")
    public void validatePutUpdateUserWithValidDataJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA + "/PutUpdateUserSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }


    @Given("Put update user with invalid id {} and json")
    public void putUpdateUserWithInvalidIdAndJson(int id) {
        File json = new File(Constants.REQ_BODY+"/UpdateUserInvalid.json");
        reqresAPI.putUpdateUsers(id,json);
    }
}
