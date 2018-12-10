@MMSEXCEPTIONREVIEW
Feature: Exception Tracking

  @MMSEXCEPTIONTRACKING-001
  Scenario: Navigate to Exception Review.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    And User is on Home Page.
    When User Selects Exception Tracking Submenu from Invoice Mainmenu.
    Then User is on Exception Tracking Page.

  @MMSEXCEPTIONTRACKING-002
  Scenario: Check for CBA Status as Awaiting CBA to Response Recieved
    Given User is on Exception Tracking Page.
    And user clicks on filter button
    And User enters Invoice Number "I001501" and Status as "Awaiting Response".
    When User selects Enter Response under Action Column.
    And User Enters the Response "response".
    And Clicks on Save.
    And user clicks on filter button
    And User enters Invoice Number "I001501" and Status as "Response Received".

  #Then User Can verify Invoice Number "104286" with Status as "Response Received".
  @MMSEXCEPTIONTRACKING-004
  Scenario: Check to Finalize of Invoice having Status as Response Recieved
    Given User is on Exception Tracking Page.
    And user clicks on filter button
    And User enters Invoice Number "I001501" and Status as "Response Received".
    When User Clicks on Finalize
    And User clicks on Ok.
    And user clicks on filter button
    And User enters Invoice Number "I001501" and Status as "Finalized".
    Then User Can verify Invoice Number "I001501" with Status as "Finalized".

  @MMSEXCEPTIONTRACKING-005
  Scenario: Check for Delete Exception Letter
    Given User is on Exception Tracking Page.
    And user clicks on filter button
    And User enters Invoice Number "I001503" and Status as "Awaiting Response".
    When User Clicks on Delete
    And User clicks on Ok.
    Then User Can not See the Invoice deleted in the Grid.

  @MMSEXCEPTIONTRACKING-006
  Scenario: Check for Delete Exception Letter error
    Given User is on Exception Tracking Page.
    And user clicks on filter button
    And User enters Invoice Number "I001501" and Status as "Finalized".
    When User Clicks on Delete
    And User clicks on Ok.
    Then User can verify Error Message as "Finalized invoice I001501 cannot be deleted."

  @MMSEXCEPTIONTRACKING-007
  Scenario: Check for Generate Exception Tracer for Invoice having Status as Finalized
    Given User is on Exception Tracking Page.
    And user clicks on filter button
    And User enters Invoice Number "I001501" and Status as "Finalized".
    When User clicks on Generate Exception Tracer.
    And User clicks on Ok.
    Then User can verify Error Message as "Tracer cannot be generated for finalized invoices I001501"

  @MMSEXCEPTIONTRACKING-008
  Scenario: Check for Invoice to Changes Status from Finalize to Unfinalize
    Given User is on Exception Tracking Page.
    And user clicks on filter button
    And User enters Invoice Number "I001501" and Status as "Finalized".
    When User selects Unfinalizeunder Action Column.
    And User clicks on Ok.
    And user clicks on filter button
    And User enters Invoice Number "I001501" and Status as "Response Received".
    Then User Can verify Invoice Number "I001501" with Status as "Response Received".

  @MMSEXCEPTIONTRACKING-009
  Scenario: Filter the Invoice Number to Enter Response as All Exception where disallowed
    Given User is on Exception Tracking Page.
    And user clicks on filter button
    And User enters Invoice Number "I001505" and Status as "Awaiting Response".
    When User selects Enter Response under Action Column.
    When User Selects Response as "All exceptions were disallowed"
    And User Enters the Response "verified".
    And Clicks on Save.
    Then User cannot see the Invoice number "I001505" details in the Grid.

  @MMSEXCEPTIONTRACKING-0010
  Scenario: Filter Invoice Number to Enter  Response as All exception where allowed
    Given User is on Exception Tracking Page.
    And user clicks on filter button
    And User enters Invoice Number "I001509" and Status as "Awaiting Response".
    When User selects Enter Response under Action Column.
    When User Selects Response as "All exceptions were allowed"
    And User Enters the Response "verified".
    And User enters cba number as "CBA"
    And Clicks on Save.
    Then User cannot see the Invoice number "I001509" details in the Grid.
