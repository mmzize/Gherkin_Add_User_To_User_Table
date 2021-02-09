Feature: Add Two Users To User Table And Verify


  Scenario: Add First User To User Table And Verify


    Given Application Launched And User List Table Is Displayed


    When Adding First User


    Then User Must Be Displayed On The Table

  Scenario: Add Second User To User Table And Verify


    Given Application Already Launched


    When Adding Second User


    Then Second User Must Be Displayed On The Table