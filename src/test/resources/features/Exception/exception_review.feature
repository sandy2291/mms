@MMSEXCEPTIONREVIEW
Feature: Exception Review

  @PRIORITY1 @MMSEXCEPTIONREVIEW-001
  Scenario: Navigate to Exception Review.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    And User is on Home Page.
    When User Selects Exception Review Submenu from Invoice Mainmenu.
    Then User is on Exception Review Page.

  @MMSEXCEPTIONREVIEW-002
  Scenario: Check for Edit Exception
    Given User is on Exception Review Page.
    And User selects View under the Action Column for the Invoice Number "I001501" having Exception Amount.
    When User Selects Edit Exception under the Action Column Repair for the Car "001501".
    And User Edit the Exception Amount to "13.00".
    Then User Can verify the Edited Amount for the Total Exception Amount in the Grid.

  @PRIORITY1 @MMSEXCEPTIONREVIEW-003
  Scenario: Check for Edit Exception with Amount as Blank.
    Given User is already on Exception Review Page.
    And User selects View under the Action Column for the Invoice Number "I001501" having Exception Amount.
    When User Selects Edit Exception under the Action Column Repair for the Car "001501".
    And User leaves the Exception Amount to blank.
    Then User Can verify the Error Message "The Amount Field is required" in the Current Window.

  @MMSEXCEPTIONREVIEW-004
  Scenario: Check for Edit Amount more that Exception Amount.
    Given User is already on Exception Review Page.
    And User selects View under the Action Column for the Invoice Number "I001501" having Exception Amount.
    When User Selects Edit Exception under the Action Column Repair for the Car "001501".
    And User Edit the Exception Amount to "43443.00".
    Then User Can verify the Error Message as "The Exception Amount No more than the amount of Car:$43443.00" in the Current Window.

  @MMSEXCEPTIONREVIEW-005
  Scenario: Check for Remove Exception
    Given User is already on Exception Review Page.
    And user clicks on filter button
    And User enters car intial "AS" car number from and to as "001501" and "001501".
    And User selects View under the Action Column for the Invoice Number "I001501" having Exception Amount.
    And User Selects Remove Exception under the Action Column Repair for the Car "001501".
    Then User verify No Exception Amount Available for Car Number "001501".
    And User verify Exception Amount, Audit reduces for the Invoice Number "I001501";

  @MMSEXCEPTIONREVIEW-006
  Scenario: Verify Audit Message for Car
    Given User is already on Exception Review Page.
    And User selects View under the Action Column for the Invoice Number "I001501" having Exception Amount.
    When User Selects Audit for Car Number "001501".
    Then User Can Verify Message "does not exist in the Fleet" in Audit Result Window.

  #@MMSEXCEPTIONREVIEW-007
  #Scenario: Check for Generate Exception Letter
  #Given User is already on Exception Review Page.
  #And User Selects a row having Invoice Number "I001501".
  #When User Selects the Generate Exception Letter.
  #And User selects Exception Contact as "Colleen Nichols".
  #And User Enters Exception Letter "check letter"
  #And User Clicks Download under Action Column.
  #Then User Can Verify Exception Letter Generated Sucessfully in the Current Window.
  @MMSEXCEPTIONREVIEW-008
  Scenario: Check for blank Exception Letter
    Given User is already on Exception Review Page.
    And User Selects a row having Invoice Number "I001501".
    When User Selects the Generate Exception Letter.
    And User Enters Exception Letter ""
    And User Clicks Download under Action Column.
    Then User Can Verify Error Message "The Exception Letter Number field is required" in the Current Window.
