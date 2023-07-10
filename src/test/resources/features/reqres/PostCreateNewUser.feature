Feature:POST Create New User - API Automation Testing ALTA QE Batch 11

  @Latihan @PositiveCase
  Scenario: Post create new user with valid JSON
    Given Post create new user with valid json
    When  Send request post create new user
    Then  Status code should be 201 created
    And   Response body name was "Rolando Tigor" and job was "QA Engineer"
    And   Validate post create new user with valid data json schema validator

  @Tugas @NegativeCase
    #BUG ON REQRES.IN IT SHOULD BE 404 NOT FOUND
  Scenario: Post create new user with empty name
    Given Post create new user with empty name
    When  Send request post create new user
    Then  Status code should return 404 not found


  @Tugas @NegativeCase
    #BUG ON REQRES.IN IT SHOULD BE 404 NOT FOUND
  Scenario: Post create new user with empty job
    Given Post create new user with empty job
    When  Send request post create new user
    Then  Status code should return 404 not found

  @Tugas @NegativeCase
    #BUG ON REQRES.IN IT SHOULD BE 404 NOT FOUND
  Scenario: Post create new user with empty name and empty job
    Given  Post create new user with empty name and empty job
    When   Send request post create new user
    Then   Status code should return 404 not found
