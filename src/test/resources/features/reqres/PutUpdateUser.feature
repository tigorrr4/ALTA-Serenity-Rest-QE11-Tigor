Feature:PUT Update User - API Automation Testing ALTA QE Batch 11

  @Latihan
  Scenario Outline: Put update user with valid data json
    Given Put update user with valid id <id> and json
    When Send request put update user
    Then Status code should return 200 OK
    And  Response body name was "Rolando Tigor Edit" and job was "QA Engineer Edit"
    And  Validate put update user with valid data json schema validator
    Examples:
      | id |
      | 1  |
      | 2  |

  Scenario Outline: Put update user with Invalid data json
    #BUG ON REQRES.IN IT SHOULD BE 404 NOT FOUND
    Given Put update user with invalid id <id> and json
    When Send request put update user
    Then Status code should return 404 not found
    Examples:
      | id |
      | 20 |


