@UploadDXFile
Feature: Upload Dx

@NavigatetoDX
Scenario: Navigate to Invoice History.
Given User is logged in as 'kcsadmin' and 'admin' as password.
And User is on Home Page.
When User Selects Invoices Submenu from Upload Mainmenu.
Then User lands to Upload DX File Page

@UploadDX1
Scenario: Upload DX file
Given User is on Upload DX File Page
When User clicks on Upload File
And browse the file "upload_DX.txt"
#Then User will see a progress bar as "In progress"
Then User will see a progress bar as "Upload Completed."
#And In the grid user will notice Pending in grey, for that file
And user clicks on refresh button
And In the grid user will notice complete in green, for that file


@ViewLogsDXUpload
Scenario: View Logs for Dx Upload 
Given User is on Upload DX File Page
And User has uploaded a Dx File
When User clicks on the Arrow button in Actions column for "DX Upload"
And selects "View Log" from action list
Then User lands on to the "Process Log for DX Upload upload_DX.txt - EY MMS" page
And message will be shown as "File Received"
And message will be shown as "Started process"
And message will be shown as "Finished process"

@ViewLogsRebuttalBillingAssignment
Scenario: View Logs for Dx Upload rebuttal billing assignment 
Given User is on Upload DX File Page
And User has uploaded a Dx File
When User clicks on the Arrow button in Actions column for "Rebuttal Billing Assignment"
And selects "View Log" from action list
Then User lands on to the "Process Log for Rebuttal Billing Assignment Rebuttal Request for Audit Request for upload_DX.txt DX Upload DX Upload - EY MMS" page
And message will be shown as "File Received"
And message will be shown as "Started process"
And message will be shown as "Finished process"

@DXUploadAudit
Scenario: View Logs for Dx Upload  audit
Given User is on Upload DX File Page
And User has uploaded a Dx File
When User clicks on the Arrow button in Actions column for "DX Upload Audit"
And selects "View Log" from action list
Then User lands on to the "Process Log for DX Upload Audit Audit Request for upload_DX.txt DX Upload - EY MMS" page                           
And message will be shown as "File Received"
And message will be shown as "Started process"
And message will be shown as "Finished process"
