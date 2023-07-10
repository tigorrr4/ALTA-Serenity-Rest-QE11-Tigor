Feature:  PATCH Update User - API Automation Testing ALTA QE Batch 11

  @Tugas @PositiveCase
  Scenario: Patch user data with valid value json
    Given Patch user data json
    When  Send request patch user data
    Then  Status code should return 200 OK
    And   Response body will contain asta and devil catcher
    And   Validate patch update user with valid data json schema validator

  @Tugas @NegativeCase
    #BUG ON REQRES.IN IT SHOULD BE 404 NOT FOUND
  Scenario: Patch user data with empty name
    Given Patch user data with empty name
    When  Send request patch user data
    Then  Status will return 400 Bad Request

  @Tugas @NegativeCase
    #BUG ON REQRES.IN IT SHOULD BE 404 NOT FOUND
  Scenario: Patch user data with empty job
    Given Patch user data with empty job
    When  Send request patch user data
    Then  Status will return 400 Bad Request

  @Tugas @NegativeCase
    #BUG ON REQRES.IN IT SHOULD BE 404 NOT FOUND
  Scenario: Patch user data with empty name and empty job
    Given Patch user data with empty name and empty job
    When  Send request patch user data
    Then  Status will return 400 Bad Request

