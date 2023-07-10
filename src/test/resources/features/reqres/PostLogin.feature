Feature:Post Login Successful with valid data json


  @Tugas @PositiveCase @Post_Login_Successful
  Scenario: Post Login Successful with valid data json
    Given Post login user successful with valid data json
    When  Send request post login
    Then  Status code should return 200 OK
    And   Response body contain token QpwL5tke4Pnpja7X4
    And   Validate post login user Successful with valid data json schema validator

  @Tugas @NegativeCase @Post_Login_Unsuccessful
  Scenario: Post Login user Unsuccessful with empty password json
    Given Post register user unsuccessful with empty password
    When  Send request post register user successful
    Then  Status will return 400 Bad Request
    And   Response body will containing "Missing password"
    And   Validate post login user Unsuccessful with empty email json schema validator


  @Tugas @NegativeCase @Post_Login_Unsuccessful
  Scenario: Post Login User Unsuccessful with empty email json
    Given Post Login user unsuccessful with empty email and valid password
    When  Send request post login user Unsuccessful
    Then  Status will return 400 Bad Request
    And   Response body will show containing "Missing email or username"
    And   Validate post login user Unsuccessful with empty email json schema validator


  @Tugas @NegativeCase @Post_Login_Unsuccessful
  Scenario: Post Login User Unsuccessful with empty email and empty password Json
    Given Post Login user unsuccessful with empty email and empty password
    When Send request post login user Unsuccessful
    Then Status will return 400 Bad Request
    And  Response body will show containing "Missing email or username"
    And  Validate post login user Unsuccessful with empty email and empty password json schema validator


  @Tugas @NegativeCase @Post_Login_Unsuccessful
  Scenario: Post Login Unsuccessful with Empty Password Value Json
    Given Post login user unsuccessful with empty password json
    When  Send request post login unsuccessful with empty password
    Then  Status will return 400 Bad Request
    And   Response body will containing "Missing password"
    And   Validate post login user Unsuccessful with empty password json schema validator



