Feature:Get list single user with valid parameter id

  @Latihan

  Scenario Outline: Get list single user with valid parameter id
    Given Get list single user with parameter id <id>
    When  Send request get single list users
    Then  Status code should return 200 OK
    And   Response body page value will be <id>
    And   Validate get single user with valid parameter id json schema validator
    Examples:
        | id |
        | 2  |


  @Tugas @PositiveCase
  Scenario Outline: Get Single User With Valid Id
    Given Get list single user with parameter id <id>
    When Send request get single list users
    Then Status code should return 200 OK
    And  Response body contain <email> <first_name> <last_name> <avatar>
    And  Validate get single user with valid parameter id json schema validator
    Examples:
      | id | email                    | first_name | last_name | avatar                                   |
      | 1  | george.bluth@reqres.in   | George     | Bluth     | https://reqres.in/img/faces/1-image.jpg  |
      | 4  | eve.holt@reqres.in       | Eve        | Holt      | https://reqres.in/img/faces/4-image.jpg  |
      | 7  | michael.lawson@reqres.in | Michael    | Lawson    | https://reqres.in/img/faces/7-image.jpg  |
      | 9  | tobias.funke@reqres.in   | Tobias     | Funke     | https://reqres.in/img/faces/9-image.jpg  |
      | 12 | rachel.howell@reqres.in  | Rachel     | Howell    | https://reqres.in/img/faces/12-image.jpg |



  @Tugas  @NegativeCase
  Scenario Outline: Get Single User with Invalid Id
    Given Get list single user with parameter id <id>
    When  Send request get single list users
    Then  Status code should return 404 not found
    Examples:
      | id |
      | 17 |
      | 18 |


  @Tugas  @NegativeCase
  Scenario Outline: Get Single User with Special Character
    Given Get list single user with special character<character>
    When  Send request get single list users with character
    Then  Status code should return 404 not found
    Examples:
      |character|
      |@@@      |
      |$#%@     |


  @Tugas  @NegativeCase
  Scenario Outline: Get Single User with Alphabet
    Given Get list single user with alphabet<alphabet>
    When  Send request get single list users with alphabet
    Then  Status code should return 404 not found
    Examples:
      | alphabet |
      | asdfg    |

