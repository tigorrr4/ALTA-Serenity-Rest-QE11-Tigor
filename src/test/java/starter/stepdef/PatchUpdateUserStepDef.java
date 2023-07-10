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

public class PatchUpdateUserStepDef {

    @Steps
    ReqresAPI reqresAPI;


    @Given("Patch user data json")
    public void patchUserDataJson() {
        File json = new File(Constants.REQ_BODY+ "/PatchUpdateUser.json");
        reqresAPI.patchUserDataJson(json);
    }

    @When("Send request patch user data")
    public void sendRequestPatchUserData() {
        SerenityRest.when().patch(ReqresAPI.PATCH_USER);
    }

    @And("Response body will contain {} and {}")
    public void responseBodyWillContainAstaAndDevilCatcher(String name, String job) {
        SerenityRest.and()
                .body(ReqresResponses.NAME,equalTo(name))
                .body(ReqresResponses.JOB,equalTo(job));
    }
////////////////////////////SCENARIO 2
    @Given("Patch user data with empty name")
    public void patchUserDataWithEmptyName() {
        File json = new File(Constants.REQ_BODY+ "/PatchUpdateUserWithEmptyName.json");
        reqresAPI.patchUserDataJson(json);
    }
    ////////////////////////////SCENARIO 3
    @Given("Patch user data with empty job")
    public void patchUserDataWithEmptyJob() {
        File json = new File(Constants.REQ_BODY+ "/PatchUpdateUserWithEmptyJob.json");
        reqresAPI.patchUserDataJson(json);
    }
    ////////////////////////////SCENARIO 4
    @Given("Patch user data with empty name and empty job")
    public void patchUserDataWithEmptyNameAndEmptyJob() {
        File json = new File(Constants.REQ_BODY+ "/PatchUpdateUserWithEmptyNameAndEmptyJob.json");
        reqresAPI.patchUserDataJson(json);
    }

    @And("Validate patch update user with valid data json schema validator")
    public void validatePatchUpdateUserWithValidDataJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA + "/PatchUpdateUserSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}

