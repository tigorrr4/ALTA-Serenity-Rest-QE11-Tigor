Feature:GET List User - API Automation Testing ALTA QE Batch 11


  @Latihan @PositiveCase
  Scenario Outline: Get list user with valid parameter page
    Given Get list user with parameter page <page>
    When  Send request get list users
    Then  Status code should return 200 OK
    And   Response body page value should be <page>
    And   Validate get list user with valid parameter page json schema validator
    Examples:
      | page |
      | 1    |


  @Tugas  @NegativeCase
    #BUG ON REQRES.IN IT SHOULD BE 404 NOT FOUND
  Scenario Outline: Get list user with Invalid parameter page
    Given Get list with invalid parameter page <page>
    When  Send request get list user with parameter page
    Then  Status code should return 404 not found
    Examples:
      | page  |
      | 19 |


  @Tugas @NegativeCase
    #BUG ON REQRES.IN IT SHOULD BE 404 NOT FOUND
  Scenario Outline: Get list user with special character
    Given Get list user with special character <character>
    When  Send request get list user char
    Then  Status code should return 404 not found
    Examples:
      | character   |
      | *&^*^*^*^*% |

  @Tugas @NegativeCase
   #BUG ON REQRES.IN IT SHOULD BE 404 NOT FOUND
  Scenario Outline: Get list user with alphabet
    Given Get list user with special alphabet <alphabet>
    When  Send request get list with alphabet
    Then  Status code should return 404 not found
    Examples:
      | alphabet |
      | abcdder  |


