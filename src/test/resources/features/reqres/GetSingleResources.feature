Feature: GET Single Resources - API Automation Testing ALTA QE Batch 11

  @Tugas
  Scenario Outline: Get Single Resource with Valid ID
    Given Get single resource with valid id <id>
    When  Send request get single resource user with valid id
    Then  Status code should return 200 OK
    And   Validate get single resource  with valid parameter page json schema validator
    Examples:
      | id |
      | 2  |


  @Tugas  @PositiveCase
  Scenario Outline: Get Single Resource with Valid ID
    Given Get single resource with valid id <id>
    When  Send request get single resource user with valid id
    Then  Status code should return 200 OK
    And   Response body should be contain <name> <year> <color> <pantone_value>
    And   Validate get single resource  with valid parameter page json schema validator

    Examples:
      |id|    name       |  year    | color   | pantone_value   |
      |1 | cerulean      |  2000    |#98B2D1  |    15-4020      |
      |2 | fuchsia rose  |  2001    |#C74375  |    17-2031      |
      |3 | true red      |  2002    |#BF1932  |    19-1664      |
      |4 | aqua sky      |  2003    |#7BC4C4  |    14-4811      |
      |5 | tigerlily     |  2004    |#E2583E  |    17-1456      |
      |6 | blue turquoise|  2005    |#53B0AE  |    15-5217      |


  @Tugas  @NegativeCase
  Scenario Outline: Get Single Resource with Invalid ID
    Given Get single resource with invalid id <id>
    When  Send request get single resource user with invalid id
    Then  Status code should return 404 not found
    Examples:
      | id |
      | 19 |
      | 20 |

  @Tugas  @NegativeCase
  Scenario Outline: Get list user with special character
    Given Get single resource with SpecialCharacter <character>
    When  Send request get single resource user with invalid character
    Then  Status code should return 404 not found
    Examples:
      | character   |
      | *&^*^*^*^*% |

  @Tugas  @NegativeCase
  Scenario Outline: Get list user with alphabet
    Given Get single resource with alphabet <alphabet>
    When  Send request get single resource user with alphabet
    Then  Status code should return 404 not found
    Examples:
      | alphabet |
      | akukeren |