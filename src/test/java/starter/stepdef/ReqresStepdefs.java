package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;



public class ReqresStepdefs {
    @Steps
    ReqresAPI reqresAPI;
/////////////////////GET LIST USER
//    @Given("Get list user with parameter page {int}")
//    public void getListUserWithParameterPage(int page) {
//        reqresAPI.getListUsers(page);
//    }
//
//    @When("Send request get list users")
//    public void sendRequestGetListUsers() {
//        SerenityRest.when().get(ReqresAPI.GET_LIST_USERS);
//    }
//
//    @Then("Status code should return {int} OK")
//    public void statusCodeShouldReturnOK(int ok) {
//        SerenityRest.then().statusCode(ok);
//    }
//
//    @And("Response body page should be {int}")
//    public void responseBodyPageShouldBe(int page) {
//        SerenityRest.and().body(ReqresResponses.PAGE,equalTo(page));
//
//    }
//////////////// POST CREATE USER
//    @Given("Post create new user with valid json")
//    public void postCreateNewUserWithValidJson() {
//        File json = new File(Constants.REQ_BODY +"/Users.json");
//        reqresAPI.postCreateNewUsers(json);
//    }
//
//    @When("Send request post create new user")
//    public void sendRequestPostCreateNewUser() {
//        SerenityRest.when().post(ReqresAPI.POST_CREATE_USERS);
//    }
//
//    @Then("Status code should be {int} created")
//    public void statusCodeShouldBeCreated(int created) {
//        SerenityRest.then().statusCode(created);
//    }
//    @And("Response body name was {string} and job was {string}")
//    public void responseBodyNameWasAndJobWas(String name, String job) {
//        SerenityRest.then()
//                .body(ReqresResponses.NAME,equalTo(name))
//                .body(ReqresResponses.JOB,equalTo(job));
//
//    }

    //GET LIST USER WITH INVALID DATA SPECIAL CHAR
//    @Given("Get list user with special character {}")
//    public void getListUserWithSpecialCharacter(String character) {
//        reqresAPI.getListUsersWithChar(character);
//    }
//
//    @When("Send request get list user char")
//    public void sendRequestGetListUserChar() {
//        SerenityRest.when().get(ReqresAPI.GET_SINGLE_USER_SPECIAL_CHAR);
//    }

/////////////////Get list single user with invalid id
//    @Given("Get single list user with invalid {}")
//    public void getListUserWithInvalid(int id) {
//        reqresAPI.getSingleUser(id);
//    }
//    @When("Send request get single list users")
//    public void sendRequestGetsSingleListUsers() {
//        SerenityRest.when().get(ReqresAPI.GET_SINGLE_USER);
//    }


///////////////Post Register User Successful with Valid Json
//    @Given("Post register user successful")
//    public void postRegisterUserSuccessful() {
//        File json = new File(Constants.REQ_BODY+ "/PostRegisterUserSuccesful.json");
//        reqresAPI.postRegisterUserSuccesful(json);
//    }
//
//    @When("Send request post register user")
//    public void sendRequestPostRegisterUser() {
//        SerenityRest.when().post(ReqresAPI.POST_REGISTER_USER);
//    }
//
//
//    @And("Response body containing {} and {}")
//    public void responseBodyContainingIdAndToken(int id, String Token) {
//                SerenityRest.then()
//                .body(ReqresResponses.ID,equalTo(id))
//                .body(ReqresResponses.TOKEN,equalTo(Token));
//
//
//    }
///////////////////////// Post Register User Unsuccessful with Invalid Email Json
//    @Given("Post register user unsuccessful invalid email")
//    public void postRegisterUserUnsuccessfulInvalidEmail() {
//        File json = new File(Constants.REQ_BODY+ "/PostRegisterUserUnsuccessfulWithInvalidEmail.json");
//        reqresAPI.postRegisterUserUnsuccessfulInvalidEmail(json);
//    }
//
//    @Then("Status will return {int} Bad Request")
//    public void statusWillReturnBadRequest(int Bad_Request) {
//        SerenityRest.then().statusCode(Bad_Request);
//    }
//////////////////////////////////Post Login Successful with valid data json
//    @Given("Post login user successful with valid data json")
//    public void postLoginUserSuccessfulWithValidDataJson() {
//        File json = new File(Constants.REQ_BODY+ "/PostLoginWithValidData.json");
//        reqresAPI.postLoginUser(json);
//    }
//
//    @When("Send request post login")
//    public void sendRequestPostLogin() {
//        SerenityRest.when().post(ReqresAPI.POST_LOGIN);
//    }
//
//    @And("Response body contain token {}")
//    public void responseBodyContainToken(String Token) {
//                SerenityRest.then()
//                .body(ReqresResponses.TOKEN,equalTo(Token));
//    }
////////////////////////////////////Post Login Unsuccessful with Empty Password Value Json
//    @Given("Post login user unsuccessful with empty password json")
//    public void postLoginUserUnsuccessfulWithEmptyPasswordJson() {
//        File json = new File(Constants.REQ_BODY+ "/PostLoginUnsuccessfulWithEmptyPassword.json");
//        reqresAPI.postLoginUser(json);
//    }
//
//    @When("Send request post login unsuccessful empty password")
//    public void sendRequestPostLoginUnsuccessfulEmptyPassword() {
//        SerenityRest.when().post(ReqresAPI.POST_LOGIN);
//    }
//////////////////////////Get Single Resource Not Found with Invalid Id
//    @Given("Get single resource not found with id {}")
//    public void getSingleResourceNotFoundWithId(int id) {
//        reqresAPI.getSingleResourcesNotFound(id);
//    }


//    @Given("Get single resource with valid id {}")
//    public void getSingleResourceWithValidId(int id) {
//        reqresAPI.getSingleUser(id);
//
//    }
//////////////////////Get Single Resource Not Found with Invalid Id
//    @Given("Send request get single resource user with valid id")
//    public void sendRequestGetSingleResourceUserWithValidId() {
//        SerenityRest.when().get(ReqresAPI.GET_SINGLE_RESOURCE);
//    }

//    @When("Send request get single resource not found")
//    public void sendRequestGetSingleResourceNotFound() {
//        SerenityRest.when().get(ReqresAPI.GET_SINGLE_RESOURCE_NOT_FOUND);
//    }
//    @Then("Status code should return {int} not found")
//    public void statusWillReturnNotFound(int Not_Found) {
//        SerenityRest.then().statusCode(Not_Found);
//    }
/////////////////////////Put update user with valid parameter id and json
//    @Given("Put update user with valid id {int} and json")
//    public void putUpdateUserWithValidIdAndJson(int id) {
//        File json = new File(Constants.REQ_BODY+"/UpdateUser.json");
//        reqresAPI.putUpdateUsers(id,json);
//    }
//
//    @When("Send request put update user")
//    public void sendRequestPutUpdateUser() {
//        SerenityRest.when().put(ReqresAPI.PUT_UPDATE_USER);
//    }




    ///////////////////////////////Delete user with valid id
//    @Given("Delete user with valid id {int}")
//    public void deleteUserWithValidId(int id) {
//        reqresAPI.deleteUsers(id);
//    }
//
//    @When("Send request delete user")
//    public void sendRequestDeleteUser() {
//        SerenityRest.when().delete(ReqresAPI.DELETE_USER);
//    }
//
//    @Then("Should code should be {int} No Content")
//    public void shouldCodeShouldBeNoContent(int noContent) {
//        SerenityRest.then().statusCode(noContent);
//    }








///////////////////////////////
//    @Given("Get list single user with parameter page {int}")
//    public void getListSingleUserWithParameterPage(int id) {
//        reqresAPI.getSingleUser(id);
//    }


}
