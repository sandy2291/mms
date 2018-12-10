@3rdOption
Feature: Add Column Update Date

@NavigateToInvHistory
Scenario: Navigate to Invoice History.
Given User is logged in as 'kcsadmin' and 'admin' as password.
And User is on Home Page.
When User Selects Invoice History Submenu from Billing Mainmenu.
Then User is on Invoice History Page.

@UpdateDateColumnPresent
Scenario: Status Update date column is present on the grid
Given User is on Invoice History Page.
When clicks on filter button
And enters invoice date as ""
And Void status as "Not Voided"
And clicks on save button
And User selects invoice 
|DEMO4567|
And user click on the "Void invoice" 
And User is on "Void Invoice" popup
When User selects the first option "I'm correcting this invoice.It has not been processed by Railinc or submitted to anyone and I will be reusing the same invoice number"
And clicks on void invoice button
Then system will validate at the backend
And User lands to Invoice History Page.
And there will be notification on the page
And success message will be shown in activity summary panel as "SUCCESS : Invoice(s) # DEMO4567 voided successfully."
And clicks on filter button
And enters invoice date as ""
And Void status as "Voided"
And Enters Invoice Number "DEMO4567"
And User verify status updated date with latest

@UpdateDateColumnPresentFailure
Scenario: Status Update date column is present on the grid on Failure
Given User is on Invoice History Page.
When clicks on filter button
And enters invoice date as ""
And Void status as "Not Voided"
And Enters Invoice Number ""
And User selects invoice 
|DEMO123|
And user click on the "Void invoice" 
And User is on "Void Invoice" popup
When User selects the first option "I'm correcting this invoice.It has not been processed by Railinc or submitted to anyone and I will be reusing the same invoice number"
And clicks on void invoice button
Then system will validate at the backend
And User is on "Failed to Void Invoice(s)" popup
And generates an error message "Invoice(s) # DEMO123 can't be voided as it/they is/are already sent to combined billing. To void it, please use Remove from combined billing button."
And clicks on ok of failed invoice popup
And User lands to Invoice History Page.
And clicks on filter button
And enters invoice date as ""
And Void status as "Not Voided"
And Enters Invoice Number "DEMO123"
And user verify status not populated

