@MMSBILLINGCONTACTS
Feature: Billing Contacts

  @MMSBILLINGCONTACTS-001 @PRIORITY1
  Scenario: Navigate to Car to customer association page.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    And User is on Home Page.
    When User Selects Billing Contacts Submenu from Configuration Mainmenu.
    Then User lands to contact list Page.

  @MMSBILLINGCONTACTS-002
  Scenario: Add Company
    Given User is on the Contact List page
    And has clicked on the Add Company button to land on the "Add Company" Pop Up
    When User enters data in fields like "T001" ,"tname","tapno","tarno"
    And clicks on the "Save" Button
    And user clicks on filter button
    And enters reporting mark as "T001"
    And clicks on save filter
    Then User lands to contact list Page.
    And User can see the newly added Company in the Grid

  @MMSBILLINGCONTACTS-003
  Scenario: Cancel Add Company
    Given User is on the Contact List page
    And has clicked on the Add Company button to land on the "Add Company" Pop Up
    When User enters data in fields like "DEF" ,"tname","tapno","tarno"
    And clicks on the cancel button.
    Then User lands to contact list Page.
    And User cannot see the newly added Company in the Grid

  @MMSBILLINGCONTACTS-004
  Scenario: Edit Company
    Given User is on the Contact List page
    And user clicks on filter button
    And enters reporting mark as "T001"
    And clicks on save filter
    And User has clicked on the Arrow button in the Actions column
    And User has clicked on the "Edit" button to land on the "Edit Company" Pop Up
    When User enters data in fields like "T001" ,"tname1","tapno1","tarno1"
    And clicks on the "Save" Button
    Then User lands to contact list Page.
    And User can see the newly edited Company in the Grid

  @PRIORITY1 @MMSBILLINGCONTACTS-005
  Scenario: Cancel Edit Company
    Given User is on the Contact List page
    And user clicks on filter button
    And enters reporting mark as "T001"
    And clicks on save filter
    And User has clicked on the Arrow button in the Actions column
    And User has clicked on the "Edit" button to land on the "Edit Company" Pop Up
    When User enters data in fields like "T001" ,"tname2","tapno","tarno"
    And clicks on the cancel button.
    Then User lands to contact list Page.
    And User cannot see the newly edited Company in the Grid

  @MMSBILLINGCONTACTS-007
  Scenario: Cancel Disable a Company
    Given User is on the Contact List page
    And user clicks on filter button
    And enters reporting mark as "T001"
    And has selected Company Enabled filter as "All"
    And clicks on save filter
    And User has clicked on the Arrow button in the Actions column
    And User has clicked on the "Disable" button to land on the "Are You Sure?" Pop Up
    When clicks on the Cancel button.
    Then User lands to contact list Page.
    And can see the "Enabled" column shows "Yes"

  @MMSBILLINGCONTACTS-006
  Scenario: Disable a Company
    Given User is on the Contact List page
    And user clicks on filter button
    And enters reporting mark as "T001"
    And has selected Company Enabled filter as "All"
    And clicks on save filter
    And User has clicked on the Arrow button in the Actions column
    And User has clicked on the "Disable" button to land on the "Are You Sure?" Pop Up
    When clicks on the ok Button
    Then User lands to contact list Page.
    And can see the "Enabled" column shows "No"

  @MMSBILLINGCONTACTS-008
  Scenario: Enable a Company
    Given User is on the Contact List page
    And user clicks on filter button
    And enters reporting mark as "T001"
    And has selected Company Enabled filter as "All"
    And clicks on save filter
    And User has clicked on the Arrow button in the Actions column
    And User has clicked on the "Enable" button
    Then User lands to contact list Page.
    And can see the "Enabled" column shows "Yes"

  @MMSBILLINGCONTACTS-009
  Scenario: add contacts
    Given User is on the Contact List page
    And user clicks on filter button
    And enters reporting mark as "T001"
    And has selected Company Enabled filter as "All"
    And clicks on save filter
    When User has clicked on the Arrow button in the Actions column
    And User has clicked on the "Add Contact" button
    And User can see the "Add Company Contact" Pop Up
    When User enters details in the fields like "Name ok","Title ok1","Phone","Fax","Email","CA - Canada","Billed Party","Street Address Line 1","BLR","KA","560048"
    And clicks on the "Save" Button
    Then User lands to contact list Page.
    And user clicks on plus sign
    And can see the contacts in the Contacts sub Grid

  @MMSBILLINGCONTACTS-011
  Scenario: Verify  Edit "Save" for newly Added Contact
    Given User is on the Contact List page
    And user clicks on filter button
    And enters reporting mark as "T001"
    And has selected Company Enabled filter as "All"
    And clicks on save filter
    When user clicks on plus sign
    When User clicks on the Actions column of a Contact
    And clicks on the "Edit" button of that contact
    When User enters details in the fields like "abcdefg1","ok1","one","ax","ail","US - United States","Billed Party","Street Address Lin","BLr","kA","5960048"
    And clicks on the "Save" Button
    When user clicks on plus sign
    And can see the contacts in the Contacts sub Grid

  @MMSBILLINGCONTACTS-010
  Scenario: Verify  Edit "Cancel" for newly Added Contact
    Given User is on the Contact List page
    And user clicks on filter button
    And enters reporting mark as "T001"
    And has selected Company Enabled filter as "All"
    And clicks on save filter
    When user clicks on plus sign
    When User clicks on the Actions column of a Contact
    And clicks on the "Edit" button of that contact
    When User enters details in the fields like "defg","ok1","one","ax","ail","US - United States","Exceptions","Street Address Lin","BLr","kA","5960048"
    And User clicks on the "Cancel" Button
    Then User lands to contact list Page.
    And cannot see the contacts in the Contacts sub Grid

  @MMSBILLINGCONTACTS-012
  Scenario: Verify  Disable "Cancel" for newly Added Contact
    Given User is on the Contact List page
    And user clicks on filter button
    And enters reporting mark as "T001"
    And has selected Company Enabled filter as "All"
    And has selected Contact Enabled filter as "Enabled Only"
    And clicks on save filter
    When user clicks on plus sign
    And User clicks on the Actions column of a Contact
    And clicks on the "Disable" button of that contact
    When User clicks on the "Cancel" Button
    Then User lands to contact list Page.
    And Enabled column shows "Yes" for the Contact in sub grid

  @MMSBILLINGCONTACTS-013
  Scenario: Verify  Disable "Save" for newly Added Contact
    Given User is on the Contact List page
    And user clicks on filter button
    And enters reporting mark as "T001"
    And has selected Company Enabled filter as "Enabled Only"
    And has selected Contact Enabled filter as "Enabled Only"
    And clicks on save filter
    When user clicks on plus sign
    And User clicks on the Actions column of a Contact
    And clicks on the "Disable" button of that contact
    And clicks on the save Button
    Then User lands to contact list Page.
    And user clicks on plus sign
    #And Enabled column doesnt shows "No" for any Contact in sub grid
    And table will be empty with no contacts

  @MMSBILLINGCONTACTS-014
  Scenario: Verify  Enable "Save" for newly Added Contact
    Given User is on the Contact List page
    And user clicks on filter button
    And enters reporting mark as "T001"
    And has selected Company Enabled filter as "Enabled Only"
    And has selected Contact Enabled filter as "Disabled Only"
    And clicks on save filter
    When user clicks on plus sign
    And User clicks on the Actions column of a Contact
    And clicks on the "Enable" button of that contact
    #And clicks on the save Button
    And user clicks on plus sign
    Then User lands to contact list Page.
    And table will be empty with no contacts

  #And Enabled column doesnt shows "Yes" for any Contact in sub grid
  @MMSBILLINGCONTACTS-015
  Scenario: cancel add contacts
    Given User is on the Contact List page
    And user clicks on filter button
    And enters reporting mark as "T001"
    And has selected Company Enabled filter as "All"
    And clicks on save filter
    When User has clicked on the Arrow button in the Actions column
    And User has clicked on the "Add Contact" button
    And User can see the "Add Company Contact" Pop Up
    When User enters details in the fields like "testqwe","test23","Phone","Fax","Email","CA - Canada","Billed Party","Street Address Line 1","BLR","KA","560048"
    And clicks on the cancel button
    Then User lands to contact list Page.
    And user clicks on plus sign
    And cannot see the contacts in the Contacts Grid

  @MMSBILLINGCONTACTS-016
  Scenario: Verify  View for old Contact
    Given User is on the Contact List page
    And user clicks on filter button
    And enters reporting mark as "A001"
    And has selected Company Enabled filter as "All"
    And has selected Contact Enabled filter as "All"
    And clicks on save filter
    When user clicks on plus sign
    And User clicks on the Actions column of a Contact
    And clicks on the "View" button of that contact
    Then User can see the "View Company Contact" Pop Up
    And User can see the name as "ATTN: ACCOUNTS PAYABLE" and title as "MANAGER"
    And clicks on cancel

  @MMSBILLINGCONTACTS-017
  Scenario: Add Empty company
    Given User is on the Contact List page
    And has clicked on the Add Company button to land on the "Add Company" Pop Up
    #When User enters data in fields like "ABC" ,"tname","tapno","tarno"
    And clicks on the "Save" Button
    Then User gets Error message as "The company could not be saved!"
    And clicks on the cancel button.
    And User lands to contact list Page.

  @MMSBILLINGCONTACTS-018
  Scenario: Add duplicate company
    Given User is on the Contact List page
    And has clicked on the Add Company button to land on the "Add Company" Pop Up
    When User enters data in fields like "T001" ,"tname","tapno","tarno"
    And clicks on the "Save" Button
    Then User gets the Error Pop Up 'The reporting mark "T001" is already in use.'
