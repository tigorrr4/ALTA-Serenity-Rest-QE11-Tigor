package starter.reqres;


import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

import java.io.File;



public class ReqresAPI {
    public static String GET_LIST_USERS = Constants.BASE_URL + "/api/users?page={page}";
    public static String GET_LIST_USERS_CHAR = Constants.BASE_URL + "/api/users?page={character}";
    public static String GET_LIST_USERS_ALPHABET = Constants.BASE_URL + "/api/users?page={alphabet}";
    public static String GET_SINGLE_USER = Constants.BASE_URL + "/api/users/{id}";
    public static String GET_SINGLE_USER_SPECIAL_CHAR = Constants.BASE_URL + "/api/users/{character}";
    public static String GET_SINGLE_USER_SPECIAL_ALP = Constants.BASE_URL + "/api/users/{alphabet}";
    public static String GET_SINGLE_USER_NOT_SPECIAL = Constants.BASE_URL + "/api/users/{character}";
    public static String GET_SINGLE_RESOURCE = Constants.BASE_URL + "/api/unknown/{id}";
    public static String GET_SINGLE_RESOURCE_CHAR = Constants.BASE_URL + "/api/unknown/{character}";
    public static String GET_SINGLE_RESOURCE_ALP = Constants.BASE_URL + "/api/unknown/{alphabet}";
    public static String GET_SINGLE_RESOURCE_NOT_FOUND = Constants.BASE_URL + "/api/unknown/{id}";
    public static String GET_SINGLE_RESOURCE_NOT_CHAR = Constants.BASE_URL + "/api/unknown/{character}";
    public static String GET_SINGLE_RESOURCE_NOT_ALP = Constants.BASE_URL + "/api/unknown/{alphabet}";
    public static String POST_CREATE_USERS = Constants.BASE_URL + "/api/users";
    public static String PUT_UPDATE_USER = Constants.BASE_URL + "/api/users/{id}";
    public static String PATCH_USER = Constants.BASE_URL + "/api/users/";
    public static String POST_REGISTER_USER = Constants.BASE_URL + "/api/register";
    public static String POST_LOGIN = Constants.BASE_URL + "/api/login";
    public static String DELETE_USER = Constants.BASE_URL + "/api/users/{id}";



    @Step("Get list users")
    public void  getListUsers(int page){
        SerenityRest.given().pathParam("page",page);
    }
    @Step("Get list users with special char")
    public void  getListUsersWithChar(String character){
        SerenityRest.given().pathParam("character",character);
    }
    @Step("Get list users with alphabet")
    public void  getListUsersWithalphabet(String alphabet){
        SerenityRest.given().pathParam("alphabet",alphabet);
    }

    @Step("Get Single User")
    public void getSingleUser(int id) {
        SerenityRest.given().pathParam("id", id);
    }
    @Step("Get single user with special character")
    public void getSingleUsersWithSpecialCharacter(String character) {
        SerenityRest.given().pathParam("character", character);
    }

    @Step("Get single user with alphabet")
    public void getSingleUsersWithAlphabet(String alphabet) {
        SerenityRest.given().pathParam("alphabet", alphabet);
    }

    @Step("Get single resource with valid id")
    public void  getSingleResourcesWithValidId(int id){
        SerenityRest.given().pathParam("id",id);
    }
    @Step("Get single resource with special character")
    public void  getSingleResourcesWithSpecialCharacter(String character){
        SerenityRest.given().pathParam("character",character);
    }
    @Step("Get single resource with alphabet")
    public void  getSingleResourcesWithAlphabet(String alphabet){
        SerenityRest.given().pathParam("alphabet",alphabet);
    }
    @Step("Get single resource not found")
    public void getSingleResourcesNotFound(int id) {
        SerenityRest.given().pathParam("id", id);
    }

    @Step("Get single resource not found with alphabet")
    public void getSingleResourceNotFoundWithalphabet(String alphabet) {
        SerenityRest.given().pathParam("alphabet", alphabet);
    }
    @Step("Get single resource not found with special character")
    public void getSingleResourceNotFoundWithSpecialCharacter(String character) {
        SerenityRest.given().pathParam("character", character);
    }
    @Step("Post create users")
    public void postCreateNewUsers(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("Post register user succesful")
    public void postRegisterUserSuccesful(File json) {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("Post login user ")
    public void postLoginUser(File json) {
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }
    @Step("Put Update users")
    public void  putUpdateUsers(int id, File json ){
        SerenityRest.given()
                .pathParam("id",id)
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("Patch user data json")
    public void patchUserDataJson(File json) {
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }

    @Step("Delete users")
    public void deleteUsers(int id) {
        SerenityRest.given().pathParam("id", id);
    }

}
