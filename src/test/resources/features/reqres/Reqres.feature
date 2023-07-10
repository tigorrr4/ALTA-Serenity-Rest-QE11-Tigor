#Feature: API Automation Testing ALTA QE Batch 111
##  @Latihan
##  Scenario Outline: Get list user with valid parameter page
##    Given Get list user with parameter page <page>
##    When  Send request get list users
##    Then  Status code should return 200 OK
##    And Response body page should be <page>
##    Examples:
##      | page |
##      | 1    |
##      | 2    |
##@Latihan
##  Scenario: Post create new user with valid JSON
##    Given Post create new user with valid json
##    When Send request post create new user
##    Then Status code should be 201 created
##    And  Response body name was "Rolando Tigor" and job was "QA Engineer"
#
#
##  @Tugas
###                      (GET SINGLE USER )
##  Scenario Outline: Get list single user with valid parameter page
##    Given Get list single user with parameter page <id>
##    When  Send request get single list users
##    Then  Status code should return 200 OK
##    And   Response body page should be <id>
##    Examples:
##      | id |
##      | 2  |
#
#
#  @Tugas
###                (GET SINGLE USER NOT FOUND)
##  Scenario Outline: Get list single user with invalid id
##    Given Get single list user with invalid <id>
##    When  Send request get single list users
##    Then  Status code should return 404 not found
###    And Response body page should be empty
##    Examples:
##      | id |
##      | 23 |
#
#  @Tugas @NegativeCase
#  Scenario Outline: Get List User with Special Character
#    Given Get list user with special character <character>
#    When Send request get list user char
#    Then Status code should return 404 not found
#    Examples:
#      | character |
#      | %%%%%%%%  |
#      | ^^^^^^^^  |
#
##                 (GET LIST <RESOURCES>)
#
##@Tugas
###                 (GET SINGLE <RESOURCES>)
##  Scenario Outline: Get Single Resource with Valid ID
##    Given Get single resource with valid id <id>
##    When Send request get single resource user with valid id
##    Then Status code should return 200 OK
##  Examples:
##    | id |
##    | 2  |
#
#  @tUGAS
###                   (GET SINGLE <RESOURCES>NOT FOUND)
##  Scenario Outline: Get Single Resource Not Found with Invalid Id
##    Given Get single resource not found with id <id>
##    When Send request get single resource not found
##    Then Status code should return 404 not found
##    Examples:
##      | id |
##      | 21 |
#
##  @Tugas
###                       (REGISTER UCCESSFUL)
##Scenario: Post Register User Successful with Valid Json
##  Given Post register user successful
##  When Send request post register user
##  Then Status code should return 200 OK
##  And Response body containing 4 and QpwL5tke4Pnpja7X4
#
##  @Tugas
###                    (REGISTER UNSUCCESSFUL)
##  Scenario: Post Register User Unsuccessful with Invalid Email Json
##    Given Post register user unsuccessful invalid email
##    When Send request post register user
##    Then Status will return 400 Bad Request
#
##
##  @Tugas
##
###                   (LOGIN SUCCESSFULL)
##  Scenario: Post Login Successful with valid data json
##    Given Post login user successful with valid data json
##    When Send request post login
##    Then Status code should return 200 OK
##    And Response body contain token QpwL5tke4Pnpja7X4
#
#
##  @Tugas
####             (LOGIN UNSUCCESSFULL)
##  Scenario: Post Login Unsuccessful with Empty Password Value Json
##    Given Post login user unsuccessful with empty password json
##    When Send request post login unsuccessful empty password
##    Then  Status will return 400 Bad Request
###    And Response body will be "Missing password"
#
#
##  @Latihan
##  Scenario Outline: Put update user with valid parameter id and json
##    Given Put update user with valid id <id> and json
##    When Send request put update user
##    Then Status code should return 200 OK
##    And  Response body name was "Rolando Tigor Edit" and job was "QA Engineer Edit"
##    Examples:
##      | id |
##      | 1  |
##      | 2  |
##
##  @Latihan
##  Scenario Outline: Delete user with valid parameter id
##    Given Delete user with valid id <id>
##    When Send request delete user
##    Then Should code should be 204 No Content
##     Examples:
##       | id |
##       | 1  |
##       | 2  |
##       | 3  |
#
#
