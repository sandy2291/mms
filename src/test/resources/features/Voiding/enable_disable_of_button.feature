@EnableDisableButtonOfInvoiceHistory
Feature: Enable Disable Of Button

  @Login1
  Scenario: Login into MMS application.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    When User Clicks on MMS Login Button.
    Then User navigates to mms home page.

  @EnableofButtons
  Scenario: Voiding button state
    Given User is already logged in MMS home page
    And User has clicked on Billing
    When user clicks on the "Invoice history" sub menu
    Then user will find the voiding button enabled by default
    And user will find the unvoiding button enabled by default
    And user will find the bulk billing button enabled by default
    And user will find the remove from combined Billing button enabled by default
    And user will find the send to combined Billing button enabled by default
