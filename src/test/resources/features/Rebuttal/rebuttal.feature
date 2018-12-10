@MMSREBUTTAL
Feature: Rebuttal

@MMSREBUTTAL-001
Scenario: Navigate to Rebuttal billing page.
Given User is logged in as 'kcsadmin' and 'admin' as password.
And User is on Home Page.
When User Selects Rebuttal Submenu from Invoice Mainmenu.
Then User lands to Rebuttal Billing Page.


@MMSREBUTTAL-002
Scenario: Check the Invoice Status from New to Reviewed.

Given User is already on Rebuttal Billing Page.
When User Clicks on Filter.
And User Enters Invoice Number "I001509" to "I001509" and Rebuttal Status as "New"
And User Clicks on Save button
And User selects a row with the Invoice Number "I001509"
And User Clicks on Mark Invoices Reviewed.
And User clicks on Ok.
And User Clicks on Filter.
And User Enters Invoice Number "I001509" to "I001509" and Rebuttal Status as "Reviewed"
And User Clicks on Save button
Then User can Verify the Status as "Reviewed" in the Grid

@MMSREBUTTAL-003
Scenario: Check for Finalize Invoices
Given User is already on Rebuttal Billing Page.
When User Clicks on Filter.
And User Enters Invoice Number "I001509" to "I001509" and Rebuttal Status as "Reviewed"
And User Clicks on Save button
And User selects a row with the Invoice Number "I001509"
And User Clicks on Finalize Invoices.
And User clicks on Ok.
Then User will not see that customer name in the Invoicing screen

@MMSREBUTTAL-004
Scenario: Check for Invoice as Details
Given User is already on Rebuttal Billing Page.
When User Clicks on Filter.
And User Enters Invoice Number "I001509" to "I001509"
And User Clicks on Save button
And User selects a row with the Invoice Number "I001509"
And User clicks View button Under Action Column.
Then User lands to Rebuttal Billing - car list Page.
And User can verify Car Details associated with the Invoice Number "I001509"

@MMSREBUTTAL-005
Scenario: Check for Status of Car from New to Reviewed.

#Given User is already on Rebuttal Billing - Car List.
Given User is on Rebuttal Billing Page.
When User Clicks on Filter.
And User Enters Invoice Number "I001505" to "I001505" and Rebuttal Status as "New"
And User Clicks on Save button
And User selects a row with the Invoice Number "I001505"
And User clicks View button Under Action Column.
And User selects the row in the Grid.
And User clicks on Mark Car Reviewed.
And User clicks on Ok.
Then User can verify the Status as Reviewed in the Grid for that Car.
And But Status of Invoice "I001505" is Still New.


@MMSREBUTTAL-006
Scenario: Assigned Rebuttal Billees Manually 
Given User is on Rebuttal Billing Page.
And User Clicks on Filter.
And User selects Has Rebuttal Assignments from Rebuttal Dropdown.
And User Enters Invoice Number "I001501" to "I001501"
And User Clicks on Save button
And User selects a row with the Invoice Number "I001501"
And User clicks View button Under Action Column.
And User can view details of car associated with the Invoice Number
And clicks on View under Action Column of Car
And User Selects the Rows in the Grid
And User Clicks on Bulk Rebuttal
And User Can view Bulk Rebuttal Window
And User Selects Billee "A001"
And User Selects Contact "Ron Hessler"
And Clicks on Save Rebuttal button  
#And Click on Ok
And Click on Refresh Button
Then User Can Verify Billee as "A001" from "NATX"   

@MMSREBUTTAL-007
Scenario: To Remove Rebuttal Billing Assigments for a Repair

Given User is on Rebuttal Billing Page.
And User Clicks on Filter.
And User selects Has Rebuttal Assignments from Rebuttal Dropdown.
And User Enters Invoice Number "I001501" to "I001501"
And User Clicks on Save button
And User selects a row with the Invoice Number "I001501"
And User clicks View button Under Action Column.
And User can view details of car associated with the Invoice Number
And clicks on View under Action Column of Car
And User Selects the Rows in the Grid
And User Clicks on Bulk Rebuttal
And User Can view Bulk Rebuttal Window
And User Selects Overwrite existing rebuttals
And Clicks on BulkUnassign  
And Clicks on OK
And Click on Refresh Button
Then User Can verify entire Invoice is removed from the Rebuttal List
   