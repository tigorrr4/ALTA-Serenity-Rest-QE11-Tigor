Feature:Delete user with valid parameter id

  @Latihan
  Scenario Outline: Delete user with valid parameter id
    Given Delete user with valid id <id>
    When  Send request delete user
    Then  Code should be 204 No Content
    Examples:
      | id |
      | 1  |
      | 2  |
      | 3  |

