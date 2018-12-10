@MMSCOMPANYINFO @Phase1 @Regression
Feature: Company Information

  @MMSCOMPANYINFO-001
  Scenario: Navigate to Exception Review.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    And User is on Home Page.
    When User navigate through configuration.
    And User selects System and clicks My Company Information.
    Then User is on My Company Information Page.

  @MMSCOMPANYINFO-002
  Scenario: Edit Company
    Given User is on My Company Information Page.
    And User can see the Company Details displayed such as "Mark","Name","A/P Number","A/R Number" ,"Taxpayer ID"
    When User clicks on the edit Button
    Then User can see the "Edit Company" Pop Up
    And User can see the Text box for fields like "Mark","Name","A/P Number", "A/R Number","Taxpayer ID"
    And User can see the "Cancel" and "Save" buttons
    And User clicks on the Cancel Button

  @MMSCOMPANYINFO-003
  Scenario: Cancel Edit Company
    Given User is on the "Edit Company" Pop Up
    When User edits data in fields like mark as "Mark" ,name as "Name",AP number as "A/P Number",AR number as "A/R Number",taxid as "Taxpayer ID"
    And clicks on the Cancel Button
    Then User is on My Company Information Page.
    And cannot see the changed Details for the Company

  @MMSCOMPANYINFO-004
  Scenario: Save Edit Company
    Given User is on the "Edit Company" Pop Up
    When User edits data in fields like mark as "KCSA" ,name as "Kansas City Southern RaiL",AP number as "A/p test 28",AR number as "A/r test 28",taxid as "444-6000758"
    And clicks on the Save Button
    Then User is on My Company Information Page.
    And User can see the newly edited Company Information in the Company section

  @MMSCOMPANYINFO-005
  Scenario: Add Contacts
    Given User is on My Company Information Page.
    When User clicks on the Add Contact button
    Then User can see the "Add Company Contact" Pop Up
    And User can see the "Cancel" and "Save" buttons

  #And User clicks on the Cancel Button
  @MMSCOMPANYINFO-006
  Scenario: Save "Add Contacts"
    Given User can see the "Add Company Contact" Pop Up
    When User enters details in the fields like "TEST Aut","Title ok1","Phone","Fax","Email","CA - Canada","Remit To","Street Address Line 1","BLR","KA","560048"
    And clicks on the Save Button
    Then User is on My Company Information Page.
    And can see the contacts in the Contacts Grid

  @MMSCOMPANYINFO-007
  Scenario: Cancel "Add Contacts"
    Given User is on Add Company Contact Pop Up
    When User enters details in the fields like "ok","ok1","one","ax","ail","US - United States","Exceptions","Street Address Lin","BLr","kA","5960048"
    And clicks on the Cancel Button
    Then User is on My Company Information Page.
    And cannot see the contacts in the Contacts Grid

  @MMSCOMPANYINFO-008
  Scenario: Disable a Contact
    Given User is on My Company Information Page.
    When User clicks on the Actions column for a Contact "TEST Aut"
    #And clicks on the "Disable" or "Enable" button
    And clicks on the "Disable" button for that contact
    #Then User can see the "Are You Sure?" Pop Up
    Then User is on "Are You Sure?" popup
    And User can see the "Cancel" and "Save" Buttons
    When User clicks on the "Cancel" Button

  @MMSCOMPANYINFO-009
  Scenario: Cancel Disable Company Contact
    Given User is on My Company Information Page.
    When User clicks on the Actions column for a Contact "TEST Aut"
    And clicks on the "Disable" button for that contact
    When User clicks on the "Cancel" Button
    Then User is on My Company Information Page.
    And Enabled column shows "Yes" for the Contact

  @MMSCOMPANYINFO-010
  Scenario: Save Disable Company Contact
    Given User is on My Company Information Page.
    When User clicks on the Actions column for a Contact "TEST Aut"
    And clicks on the "Disable" button for that contact
    When clicks on the save Button of popup
    Then User is on My Company Information Page.
    And Enabled column shows "No" for the Contact

  @MMSCOMPANYINFO-011
  Scenario: Cancel Enable Company Contact
    Given User is on My Company Information Page.
    When User clicks on the Actions column for a Contact "TEST Aut"
    And clicks on the "Enable" button for that contact
    When User clicks on the "Cancel" Button
    Then User is on My Company Information Page.
    And Enabled column shows "No" for the Contact

  @MMSCOMPANYINFO-012
  Scenario: Save Enable Company Contact
    Given User is on My Company Information Page.
    When User clicks on the Actions column for a Contact "TEST Aut"
    And clicks on the "Enable" button for that contact
    When clicks on the save Button of popup
    Then User is on My Company Information Page.
    And Enabled column shows "Yes" for the Contact

  @MMSCOMPANYINFO-013
  Scenario: Edit a Contact
    Given User is on My Company Information Page.
    When User clicks on the Actions column for a Contact "TEST Aut"
    And clicks on the "Edit" button for that contact
    Then User can see the "Edit Company Contact" Pop Up
    And User can see the "Cancel" and "Save" buttons
    And User clicks on the Cancel Button

  @MMSCOMPANYINFO-014
  Scenario: Cancel a Contact
    Given User is on My Company Information Page.
    When User clicks on the Actions column for a Contact "TEST Aut"
    And clicks on the "Edit" button for that contact
    When User enters details in the fields like "ok","ok1","one","ax","ail","US - United States","Exceptions","Street Address Lin","BLr","kA","5960048"
    And User clicks on the "Cancel" Button
    Then User is on My Company Information Page.
    And cannot see the contacts in the Contacts Grid

  @MMSCOMPANYINFO-015
  Scenario: Edit save a Contact
    Given User is on My Company Information Page.
    When User clicks on the Actions column for a Contact "TEST Aut"
    And clicks on the "Edit" button for that contact
    When User enters details in the fields like "TEST ut","ok1","one","ax","ail","US - United States","Remit To","Street Address Lin","BLr","kA","5960048"
    And clicks on the Save Button
    Then User is on My Company Information Page.
    And can see the contacts in the Contacts Grid
