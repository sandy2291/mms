@Rejection
Feature: Rejection Work Flow

@Rejection0
Scenario: Navigate to Rejection Tracking 
Given User is logged in as 'kcsadmin' and 'admin' as password.
And User is on Home Page.
When User Selects Exception Review Submenu from Invoice Mainmenu.
Then User is on Exceptions and Rejections - Invoice List Page

@ValidateErrorMessageForFinalizedInvoiceWhileGeneratingRejectionLetter
Scenario: Validate Error Message For Finalized Invoice While Generating Rejection Letter
Given User is on Exceptions and Rejections - Invoice List Page
When user clicks on filter button
And User enters the from Invoice Number as "I001501" 
And User enters the to Invoice Number as "I001501"
And User selects Exception Status as "All" 
And User selects has exception as "All" 
And Click on Save
And User Selects Invoice 
|I001501|
And User clicks on Generate Rejection Letter button
Then User is on "Invoice rejection validation failure." popup
And User gets prompted with error message "Invoice(s) # I001501/KCS can't be rejected as it/they is/are already Finalized" 
And clicks on ok
And User is on Exception Review Page
And following invalid invoice gets deselected in grid
|I001501|

@ValidateErrorMessageForPaidInvoiceWhileGeneratingRejectionLetter
Scenario: Validate Error Message For Paid Invoice While Generating Rejection Letter
Given User is on Exceptions and Rejections - Invoice List Page
When user clicks on filter button
And User enters the from Invoice Number as "204956" 
And User enters the to Invoice Number as "204956"
And User selects Exception Status as "All" 
And User selects has exception as "All" 
And Click on Save
And User Selects Invoice 
|204956|
And User clicks on Generate Rejection Letter button
Then User is on "Invoice rejection validation failure." popup
And User gets prompted with error message "Invoice(s) # 204956/KCS can't be rejected as it/they is/are already Paid" 
And clicks on ok
And User is on Exception Review Page
And following invalid invoice gets deselected in grid
|204956|

@ValidateErrorMessageForPaidandFinalizedInvoiceWhileGeneratingRejectionLetter
Scenario: Validate Error Message For Paid and Finalized Invoice While Generating Rejection Letter
Given User is on Exceptions and Rejections - Invoice List Page
When user clicks on filter button
And User enters the from Invoice Number as "I001203" 
And User enters the to Invoice Number as "I001203"
And User selects Exception Status as "All" 
And User selects has exception as "All" 
And Click on Save
And User Selects Invoice 
|I001203|
And User clicks on Generate Rejection Letter button
Then User is on "Invoice rejection validation failure." popup
And popup displays generates error message "Invoice(s) # I001203/KCS can't be rejected as it/they is/are already Finalized"
And popup displays another error message "Invoice(s) # I001203/KCS can't be rejected as it/they is/are already Paid"
And clicks on ok
And User is on Exception Review Page
And following invalid invoice gets deselected in grid
|I001203|

@ValidateErrorMessageForApprovedInvoiceWhileGeneratingRejectionLetter
Scenario: Validate Error Message For Approved Invoice While Generating Rejection Letter
Given User is on Exceptions and Rejections - Invoice List Page
When user clicks on filter button
And User enters the from Invoice Number as "204957" 
And User enters the to Invoice Number as "204957"
And User selects Exception Status as "All" 
And User selects has exception as "All" 
And Click on Save
And User Selects Invoice 
|204957|
And User clicks on Generate Rejection Letter button       
Then User gets prompted with error message "Invoice(s) # 204957/KCS can't be rejected as it/they is/are already Approved"
And clicks on ok
And User is on Exception Review Page
And following invalid invoice gets deselected in grid
|204957|

@ValidateErrorMessageForFinalzedandApprovedInvoiceWhileGeneratingRejectionLetter
Scenario: Validate Error Message For Finalzed and Approved Invoice While Generating Rejection Letter
Given User is on Exceptions and Rejections - Invoice List Page
When user clicks on filter button
And User enters the from Invoice Number as "204958" 
And User enters the to Invoice Number as "204958"
And User selects Exception Status as "All" 
And User selects has exception as "All" 
And Click on Save
And User Selects Invoice 
|204958|
And User clicks on Generate Rejection Letter button
Then User is on "Invoice rejection validation failure." popup
And popup displays generates error message "Invoice(s) # 204958/KCS can't be rejected as it/they is/are already Finalized"
And popup displays another error message "Invoice(s) # 204958/KCS can't be rejected as it/they is/are already Approved"
And clicks on ok
And User is on Exception Review Page
And following invalid invoice gets deselected in grid
|204958|


@VerifyFieldsPresentInGenerateRejectionLetterWindow
Scenario: Click Generate Rejection Letter and after successful validation
Given User is on Exceptions and Rejections - Invoice List Page
And user has selected a invoice which is not finalized neither approved nor paid but is over the threshold value (any of the 10%, 7.5% ,5%)
|Invoice#|TEST2001KCS|
And User enters the from Invoice Number as "TEST2001KCS"
And User enters the to Invoice Number as "TEST2001KCS"
And Click on Save
And User Selects Invoice 
|TEST2001KCS|
When clicks on Generate Rejection Letter button
#And clicks on ok button 
Then User is on Generate Rejection Letter Page
#And User can see To Dropdown having a default value
And User can see read-only From field with default value
And Radio button is selected by default for the first option as the invoice is over the threshold 
And User can see Rejection Number Editbox
And User can see Rejection Message editbox 
And User can see Rejection Letter button

@MandatoryFieldValidationInGenerateRejectionLetterWindow
Scenario: Client side validation after save and continue
Given User is on Generate Rejection Letter Page
When user fills the Rejection number (Random ,arbitary)
And User selects the Rejection Reason outside of AAR Rule radio button
But forgets to enter the Rejection reason 
And clicks on the save and continue 
Then a message should appear regarding the missing mandatory field.
And Reject Invoice(s) is still not enabled 

@PassingValueToAllFieldsInGenerateRejectionLetterWindow
Scenario: Events that occur after clicking Reject invoice(s)-Confirmation box
Given User is on Generate Rejection Letter Page
When User selects To option as "prateeksha.srivastava@ge.com" 
And User clicks on cc checkbox
And User enters "piyush.paawan@ge.com;saunak.tarafdar@ge.com" as cc emailId
And User provides "Reject 2001 KCS" as Rejection Number
And User selects Manual radio button
And User enters "Rejected" as message in Rejection Message text area
And User clicks on Save button on the Generate Rejection Letter form
And User clicks on Reject Invoice button
Then User is on E-mail confirmation pop-up
And The popup-up should have two buttons- No, I will send it Later and Yes, send it now

@RejectInvoiceAndSendEmailFromGenerateRejectionLetter
Scenario: Events that occur after clicking Reject invoice(s) - PDF generation and sending email
Given User is on E-mail confirmation pop-up
When User clicks on Yes, send it now button
Then User is on Exceptions and Rejections - Invoice List Page 
#And User will see a notification on the top right corner.
#And on Clicking the notification, panel opens to show the success message.

@VerifyInvoiceNotPresentInExceptionsAndRejectionsPageAfterRejection
Scenario: Verify Invoice Not Present In Exceptions And Rejections Page
Given User is on Exceptions and Rejections - Invoice List Page 
When user clicks on filter button
And User enters the from Invoice Number as "TEST2001KCS" 
And User enters the to Invoice Number as "TEST2001KCS"
And User selects Exception Status as "All" 
And User selects has exception as "All" 
And Click on Save
Then user can not see the Rejected invoice in the Grid

@VerifyInvoiceNotPresentInRebuttalPageAfterRejection
Scenario: Verify Invoice Not Present In Rebuttal Page
Given User is on Exceptions and Rejections - Invoice List Page
When User Selects Rebuttal Submenu from Invoice Mainmenu.
And User lands to Rebuttal Billing Page.
And User Clicks on Filter.
And User Enters Invoice Number "TEST2001KCS" to "TEST2001KCS" and Rebuttal Status as "All"
And User Clicks on Save button
Then user can not see the Rejected invoice in the Grid

@VerifyInvoiceStatusInInvoiceReviewPageAfterRejection
Scenario: Verify Invoice Status In Invoice Review Page
Given User is on Rebuttal Billing Page.
And User Selects Invoice Review Submenu from Invoice Mainmenu
And User lands to Invoice Review Page
When user clicks on filter button
And User Enter the Invoice Number 'TEST2001KCS' and 'TEST2001KCS' 
And User selects payment status as 'All'
And Click on Save
Then User can verify Payment Status as Rejected in the Grid for the Invoice.

@ValidateErrorMessageForRejectedInvoiceWhileMakingPaymentStatusasApproved
Scenario: Error Message Validation For Rejected Invoice Making Payment Status as Approved 
Given User is already on Invoice Review Page
And User clicks on filter of invoice review.
And User Enter the Invoice Number 'TEST2001KCS' and 'TEST2001KCS'
And User selects payment status as 'Rejected'
And Click on Save
And User selects created Invoice number.
When User Clicks on Approve for Payemnt.
Then User is on "Invoice review validation failure." popup
And popup displays generates error message "Invoice(s) # TEST2001KCS/DEMO can't be Approved as it/they is/are already Rejected."
And clicks on ok
And User is on Invoice Review Page.
And following invalid invoice gets deselected in grid
|TEST2001KCS|

@ValidateErrorMessageForRejectedInvoiceWhileMakingPaymentStatusasPaid
Scenario: Error Message Validation For Rejected Invoice Making Payment Status as Paid 
Given User is already on Invoice Review Page
And User clicks on filter of invoice review.
And User Enter the Invoice Number 'TEST2001KCS' and 'TEST2001KCS'
And User selects payment status as 'Rejected'
And Click on Save
And User selects created Invoice number.
When User Clicks on Mark Paid.
Then User is on "Invoice review validation failure." popup
And popup displays generates error message "Invoice(s) # TEST2001KCS/DEMO can't be Paid as it/they is/are already Rejected."
And clicks on ok
And User is on Invoice Review Page.
And following invalid invoice gets deselected in grid
|TEST2001KCS|

@RejectionTrackingPageNavigationAndLayout
Scenario: Rejection Tracking page Navigation and layout
Given User is on Invoice Review Page.
When User Selects Rejection Tracking Submenu from Invoice Mainmenu.
Then User is on Rejection Tracking Page
And page is divided into two sections -Filter and Grid
And the Grid should show the Rejected invoices 
And the grid should have an action column

@SendEmailFromRejectionTrackingPage
Scenario: Send a E-mail Manually through the Grid
Given User is on Rejection Tracking Page
When user clicks on filter button
And user enters Invoice Number from in Rejection Tracking page as "TEST2001KCS" 
And user enters Invoice Number To in Rejection Tracking page as "TEST2001KCS" 
And Click on Save
And User Selects below Invoice in Rejection Tracking page
|TEST2001KCS|
And user clicks on Email button over the grid
And user is on "Email Rejection Letter(s)" popup of Rejection Tracking page
And user clicks on Send mail button of Email Rejection Letter popup
Then User is on Rejection Tracking Page
#And User will see a notification on the top right corner.
#And on Clicking the notification, panel opens to show the success message.

@UpdateStatusToGeneratedFromRejectionTrackingPage
Scenario: Update status of invoice to Generated
Given User is on Rejection Tracking Page
When user clicks on filter button
And user enters Invoice Number from in Rejection Tracking page as "TEST2001KCS" 
And user enters Invoice Number To in Rejection Tracking page as "TEST2001KCS" 
And Click on Save
And user clicks on the Arrow button in Actions column
And user has clicked on the "Update Status" button
And user selects Status as "Generated"
And user clicks on Save button of Update Rejection Status popup
Then User is on Rejection Tracking Page
And user can see Invoice Number "TEST2001KCS" with Status as "Generated".

@EditRejectedInvoiceFromRejectionTrackingPage
Scenario: Edit Rejected Invoice From Rejection Tracking Page
Given User is on Rejection Tracking Page
When user clicks on filter button
And user enters Invoice Number from in Rejection Tracking page as "TEST2001KCS" 
And user enters Invoice Number To in Rejection Tracking page as "TEST2001KCS" 
And Click on Save
And user clicks on the Arrow button in Actions column
And user has clicked on the "Edit" button
And User is on "Are You Sure?" popup
And clicks on ok button 
Then User is on Generate Rejection Letter Page
And User can see To Dropdown having a "prateeksha.srivastava@ge.com" value
#And User clicks on cc checkbox
And User can see "piyush.paawan@ge.com;saunak.tarafdar@ge.com" as cc emailId
And User can see read-only From field with default value
And User can see Rejection Number as non-editable textbox with value "Reject 2001 KCS"
#And Radio button is selected by default for the first option as the invoice is over the threshold 
And User can see Rejection Message as "Rejected" 
And User can see Rejection Letter button

@UpdateCCAndRejectionMessageFromEditWindowOfRejectionTrackingPage
Scenario: Update cc and Rejection Message From Edit Window Of Rejection Tracking Page
Given User is on Generate Rejection Letter Page
#And User clicks on cc checkbox
When User enters "saunak.tarafdar@ge.com" as cc emailId
And User enters "Rejected from Rejection Tracking Page" as message in Rejection Message text area
And User clicks on Save button on the Generate Rejection Letter form
And User clicks on Reject Invoice button
Then User is on E-mail confirmation pop-up
And The popup-up should have two buttons- No, I will send it Later and Yes, send it now
And User clicks on Yes, send it now button
And User is on Rejection Tracking Page


@UnrejectInvoiceFromRejectionTrackingPage
Scenario: Unrejecting an invoice 
Given User is on Rejection Tracking Page
When user clicks on filter button
And user enters Invoice Number from in Rejection Tracking page as "TEST2001KCS" 
And user enters Invoice Number To in Rejection Tracking page as "TEST2001KCS" 
And Click on Save
And User Selects below Invoice in Rejection Tracking page
|TEST2001KCS|
And user clicks on unreject button over the grid
And User is on "Are You Sure?" popup
And clicks on ok button
Then User is on Rejection Tracking Page
And user can not see the Rejected invoice in the Grid
#And User will see a notification on the top right corner.
#And on Clicking the notification, panel opens to show the success message.


@VerifyInvoiceRestoredInExceptionsAndRejectionsPageAfterUnreject
Scenario: Verify Invoice Restored In Exceptions and Rejections Page
Given User is on Rejection Tracking Page
And User Selects Exception Review Submenu from Invoice Mainmenu.
And User is on Exceptions and Rejections - Invoice List Page
When user clicks on filter button
And User enters the from Invoice Number as "TEST2001KCS" 
And User enters the to Invoice Number as "TEST2001KCS"
And User selects Exception Status as "All" 
And User selects has exception as "All" 
And Click on Save
Then user can see below invoice in grid
|TEST2001KCS|

@VerifyInvoiceStatusInRebuttalPageAfterUnreject
Scenario: Verify Invoice Status In Rebuttal Page
Given User is on Exceptions and Rejections - Invoice List Page
When User Selects Rebuttal Submenu from Invoice Mainmenu.
And User lands to Rebuttal Billing Page.
And User Clicks on Filter.
And User Enters Invoice Number "TEST2001KCS" to "TEST2001KCS" and Rebuttal Status as "All"
And User Clicks on Save button
Then User can Verify the Status as "New" in the Grid

@VerifyInvoiceStatusInInvoiceReviewPageAfterUnreject
Scenario: Verify Invoice Status In Invoice Review Page
Given User is on Rebuttal Billing Page.
And User Selects Invoice Review Submenu from Invoice Mainmenu
And User lands to Invoice Review Page
When user clicks on filter button
And User Enter the Invoice Number 'TEST2001KCS' and 'TEST2001KCS' 
And User selects payment status as 'All'
And Click on Save
Then User can verify Payment Status as Unpaid in the Grid for the Invoice.
