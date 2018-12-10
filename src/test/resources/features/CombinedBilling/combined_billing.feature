@COMBINEDBILLING
Feature: Combined Billing

@COMBINEDBILLING-001
Scenario: Navigate to Invoice History.
Given User is logged in as 'kcsadmin' and 'admin' as password.
And User is on Home Page.
And User navigate through Billing.
When User Selects "Merge CRB and MMS Invoice Data" Submenu from Combined Billing.
Then User is on "Merge CRB and MMS Invoice Data - EY MMS" Page


@COMBINEDBILLING-002
Scenario: Check for Removing Invoices 
Given User is on "Merge CRB and MMS Invoice Data - EY MMS" Page
And User clicks on filter button
And enters from invoice number as "234"
And to invoice number as "234"
And clicks on save button
When User clicks on action button of invoice "234"
And clicks on "Remove" option
And clicks on ok button
Then User is on "Merge CRB and MMS Invoice Data - EY MMS" Page
And invoice "234" disappear from page

@COMBINEDBILLING-003
Scenario: Check for billed party using filter 
Given User is on "Merge CRB and MMS Invoice Data - EY MMS" Page
And User clicks on filter button
And enters from invoice number as ""
And to invoice number as ""
And enters billed party as "A001"
And clicks on save button
Then User can verify number of Invoices Attached to selected Billed Party "A001".


@COMBINEDBILLING-004
Scenario: Verify for Sending Invoices to Combine Billing
Given User is on "Merge CRB and MMS Invoice Data - EY MMS" Page
And User clicks on filter button
And enters from invoice number as ""
And to invoice number as ""
And enters billed party as ""
And clicks on save button
And User clicks on MMS invoice number "45632"
And User clicks on CRB invoice number "543"
And clicks on combine invoice button
And clicks on ok button
And User navigate through Billing.
And User Selects "Generate DX File and Invoices" Submenu from Combined Billing.
Then User is on "Generate DX File and Invoices - EY MMS" Page
And User can verify the Invoice Number "45632", Billed Party "A001" and Billing Party "KCS" in the Grid.
And User can verify the Invoice Number "543", Billed Party "KCS" and Billing Party "KCS" in the Grid.

#@COMBINEDBILLING-005
#Scenario: Check for Generating Multiple Combined DX File
#Given User navigate through Billing.
#And User Selects "Generate DX File and Invoices" Submenu from Combined Billing.
#And User is on "Generate DX File and Invoices - EY MMS" Page
#And User clears filters
#When User selects Invoice "45632"
#And User selects Invoice "543"
#And clicks on generate dx file button
#And clicks on ok button
#Then User is on "Generate DX File and Invoices - EY MMS" Page
#And User navigate through Billing.
#And User Selects "Combined Billing History" Submenu from Combined Billing.
#And User is on "Combined Billing History - EY MMS" Page
#And User can verify number of Invoices selected to Generate DX File

@COMBINEDBILLING-006
Scenario: Check for spitting invoice
Given User navigate through Billing.
And User Selects "Generate DX File and Invoices" Submenu from Combined Billing.
And User is on "Generate DX File and Invoices - EY MMS" Page
And User clicks on filter button
And enters start invoice number as "62134"
And enters end invoice number as "62134"
And clicks on save button
When User clicks on actions button of invoice "62134"
And clicks on "Split Invoices" options
And clicks on ok button
Then User is on "Generate DX File and Invoices - EY MMS" Page
And page shows empty table

@COMBINEDBILLING-007
Scenario: Check for Generating Dx File message
Given User navigate through Billing.
And User Selects "Generate DX File and Invoices" Submenu from Combined Billing.
And User is on "Generate DX File and Invoices - EY MMS" Page
And User clears filters
When User selects Invoice "TESTQA"
And User selects Invoice "TEST23"
And clicks on generate dx file button
Then User is on "Are You Sure?" popup
And clicks on ok button
Then User is on "Process Created Notification" popup
And message is "Your invoices are being created, however this may take several minutes. You will find your report in Combined Billing History momentarily. You may continue to use the site normally as your reports are being generated."
And clicks on close button of process notification

# @Manual 
#@COMBINEDBILLING-008
#Scenario: Check for download a Generate DX File in Combined History Page
#Given User navigate through Billing.
#And User Selects "Combined Billing History" Submenu from Combined Billing.
#And User is on "Combined Billing History - EY MMS" Page
#When User clicks on actions of generated file name
#And clicks "Download" option of file
#Then User can verify file downloaded in the window


@COMBINEDBILLING-009
Scenario: Check for bulk email status
Given User navigate through Billing.
And User Selects "Combined Billing History" Submenu from Combined Billing.
And User is on "Combined Billing History - EY MMS" Page
When User clicks on actions of generated file name
And clicks "Bulk Email Invoices" option of file
And User is on "Are You Sure?" popup
And clicks on ok button
Then user can verify bulk email status as "Sent"

 #@Manual
#@COMBINEDBILLING-010
#Scenario: Check for Bulk Billing Detailed Download
#Given User navigate through Billing.
#And User Selects "Combined Billing History" Submenu from Combined Billing.
#And User is on "Combined Billing History - EY MMS" Page
#When User clicks on actions of generated file name
#And clicks "Bulk Billing Summary" option of file
#And User is on "Report Download" popup
#And User clicks on action of popup
#And User clicks on download of popup
#Then User can verify file downloaded in the window
#And clicks on close button
#And User is on "Combined Billing History - EY MMS" Page