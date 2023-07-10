Feature:POST Register - API Automation Testing ALTA QE Batch 11

  @Tugas @NegativeCase @Post_Register_Unsuccessfull
  Scenario: Post Register User Unsuccessful with Invalid Email Json
    Given Post register user unsuccessful invalid email
    When  Send request post register user
    Then  Status will return 400 Bad Request
    And   Response body will containing "Missing password"
    And   Validate post register user Unsuccessful with invalid email json schema validator



  @Tugas @PositiveCase @Post_Register_Succesfull
  Scenario: Post Register User Successful with Valid Json
    Given Post register user successful
    When Send request post register user
    Then Status code should return 200 OK
    And  Response body containing 4 and QpwL5tke4Pnpja7X4
    And  Validate post register user successful json schema


  @Tugas @NegativeCase @Post_Register_Unsuccessfull
  Scenario: Post Register User Unsuccessful with empty email and valid password Json
    Given Post register user unsuccessful with empty email and valid password
    When  Send request post register user
    Then  Status will return 400 Bad Request
    And   Response body will show containing "Missing email or username"
    And  Validate post register user successful with empty email json schema validator


  @Tugas @NegativeCase @Post_Register_Unsuccessfull
  Scenario: Post Register User Unsuccessful with valid email and empty password Json
    Given Post register user unsuccessful with valid email and empty password
    When  Send request post register user
    Then  Status will return 400 Bad Request
    And   Response body will containing "Missing password"
    And  Validate post register user successful with empty password json schema validator


  @Tugas @NegativeCase @Post_Register_Unsuccessfull
  Scenario: Post Register User Unsuccessful with invalid email and invalid password Json
    Given Post register user unsuccessful with invalid email and invalid password
    When  Send request post register user
    Then  Status will return 400 Bad Request
    And   Response body will containing "Note: Only defined users succeed registration"



