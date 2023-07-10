Feature: GET Single Resources Not Found - API Automation Testing ALTA QE Batch 11


 @Tugas  @NegativeCase
  Scenario Outline: Get Single Resource Not Found with Invalid Id
    Given Get single resource not found with id <id>
    When  Send request get single resource not found
    Then  Status code should return 404 not found
        Examples:
          | id |
          | 21 |

  @Tugas  @NegativeCase
  Scenario Outline: Get Single Resource Not Found with special character
    Given Get single resource not found with special character <character>
    When  Send request get single resource not found with special character
    Then  Status code should return 404 not found
    Examples:
      | character |
      | @@@@@@@@  |
      | ********  |

  @Tugas  @NegativeCase
  Scenario Outline: Get Single Resource Not Found with Alphabet
    Given Get single resource not found with alphabet <alphabet>
    When  Send request get single resource not found with alphabet
    Then  Status code should return 404 not found
    Examples:
      | alphabet   |
      | akuganteng |

