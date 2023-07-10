Feature:Get list single user with invalid id


  @Tugas  @NegativeCase
  Scenario Outline: Get list single user not found with invalid id
    Given Get single resource not found with invalid <id>
    When  Send request get single users not found
    Then  Status code should return 404 not found
    Examples:
      | id |
      | 23 |

  @Tugas  @NegativeCase
  Scenario Outline: Get Single user Not Found with special character
    Given Get single user not found with special character <character>
    When  Send request get single user not found with special character
    Then  Status code should return 404 not found
    Examples:
      | character |
      | ^^^^^^^   |
      | #######   |
