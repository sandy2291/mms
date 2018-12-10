package com.ey.mms.cucumberStepsThemeLevel;

import java.util.List;

import com.ey.mms.pageobjects.mmsLocators.MMS_BillingContactsPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.serenitystepsThemelevel.MMS_BillingContactsTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_CarAssociationTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_ExceptionsTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_FleetTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_RejectionTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_SystemTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_VoidingTheme_SerenitySteps;
import com.ey.mms.util.EY_FW_Utility;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RejectionThemes_StepDefs {

	@Steps
	MMS_RejectionTheme_SerenitySteps rejectiontheme;
	
	@Steps
	MMS_CarAssociationTheme_SerenitySteps carassociationtheme;
	
		List<List<String>> data;

	@When("^User Selects Rejection Tracking Submenu from Invoice Mainmenu\\.$")
	public void user_Selects_Rejection_Tracking_Submenu_from_Invoice_Mainmenu() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		rejectiontheme.clickInvoices();
		rejectiontheme.SelectExceptions();
		rejectiontheme.selectRejectionTracking();
	}

	@Then("^User is on Rejection Tracking Page$")
	public void user_is_on_Rejection_Tracking_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		rejectiontheme.verifyRejectionReviewPageTitle();
	}

	@Then("^page is divided into two sections -Filter and Grid$")
	public void page_is_divided_into_two_sections_Filter_and_Grid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rejectiontheme.verifyRejectionReviewPageSections();
	}

	@Then("^the Grid should show the Rejected invoices$")
	public void the_Grid_should_show_the_Rejected_invoices() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rejectiontheme.verifyDefaultStatus();
	}
	
	@Then("^the grid should have an action column$")
	public void the_grid_should_have_an_action_column() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rejectiontheme.verifyActionsCoulmn();
	}
	
	@Then("^the below invoice should be the top row$")
	public void the_below_invoice_should_be_the_top_row(DataTable arg1) throws Throwable {
	   
	}
	
	@Then("^user verifies Invoice Section$")
	public void user_verifies_Invoice_Section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		rejectiontheme.verifyInvoiceFilterSection();
	}

	@Then("^user verifies Rejection Section$")
	public void user_verifies_Rejection_Section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		rejectiontheme.verifyRejectionFilterSection();
	}

	@Then("^filter button collapses$")
	public void filter_button_collapses() {
		rejectiontheme.filterCollapsed();
	}

	@Then("^User is on Exception Review Page$")
	public void user_is_on_Exception_Review_Page() throws Throwable {
		rejectiontheme.verifyExceptionReviewPageTitle();
	}

	@Given("^User enters the from Invoice Number as \"([^\"]*)\"$")
	public void user_enters_the_from_Invoice_Number_as(String fromInvoiceNo) throws Throwable {
		rejectiontheme.enterFromInvoiceNo(fromInvoiceNo);
	}
	
	@Given("^user enters Invoice Number from in Rejection Tracking page as \"([^\"]*)\"$")
	public void user_enters_Invoice_Number_from_as(String InvoiceNofrom) throws Throwable {
		rejectiontheme.enterFromInvoiceNoInRejectionTracking(InvoiceNofrom);
	}
	
	@Given("^user enters Invoice Number To in Rejection Tracking page as \"([^\"]*)\"$")
	public void user_enters_Invoice_Number_To_in_Rejection_Tracking_page_as(String InvoiceNoTo) throws Throwable {
		rejectiontheme.enterToInvoiceNoInRejectionTracking(InvoiceNoTo);
	}

	@Given("^User enters the to Invoice Number as \"([^\"]*)\"$")
	public void user_enters_the_to_Invoice_Number_as(String toInvoiceNo) throws Throwable {
		rejectiontheme.enterTovoiceNo(toInvoiceNo);
	}

	@Given("^User selects Exception Status as \"([^\"]*)\"$")
	public void user_selects_Exception_Status_as(String status) throws Throwable {
		rejectiontheme.selectExceptionStatus(status);
	}
	
	@Given("^User selects has exception as \"([^\"]*)\"$")
	public void user_selects_has_exception_as(String status) throws Throwable {
		rejectiontheme.selectHasException(status);
	}
	
	@Given("^User is on Exceptions and Rejections - Invoice List Page$")
	public void user_is_on_Exceptions_and_Rejections_Page() throws Throwable {
		rejectiontheme.verifyExceptionReviewPageTitle();
		
	}

	@Then("^User can verify the Invoice number \"([^\"]*)\" details in the Grid\\.$")
	public void user_can_verify_the_Invoice_number_details_in_the_Grid(String invNo) throws Throwable {
		rejectiontheme.verifyInvoiceNumber(invNo);
	}
	
	@When("^User Selects Invoice$")
	public void user_Selects_Invoice(DataTable invoices) throws Throwable {
		data = invoices.raw();
			for (List<String> tabledata : data) {
			rejectiontheme.selectInvNo(tabledata.get(0));
		}
	}
	
	@When("^User Selects below Invoice in Rejection Tracking page$")
	public void User_Selects_below_Invoice_in_Rejection_Tracking_page(DataTable invoices) throws Throwable {
		data = invoices.raw();
			for (List<String> tabledata : data) {
			rejectiontheme.selectInvNoInRejectionTrackingPage(tabledata.get(0));
		}
	}
	
	@When("^User clicks on Generate Rejection Letter button$")
	public void user_clicks_on_Generate_Rejection_Letter_button() throws Throwable {
		rejectiontheme.clickGenerateRejectionLetterButton();
	}
	
	@Then("^following invalid invoice gets deselected in grid$")
	public void following_invalid_invoice_gets_deselected_in_grid(DataTable invoices) throws Throwable {
		data = invoices.raw();
		for (List<String> tabledata : data) {
			rejectiontheme.invoicesNotSelectedInGrid(tabledata.get(0));
		}
	}

	@When("^following valid invoices are selected in the grid$")
	public void following_valid_invoices_are_selected_in_the_grid(DataTable invoices) throws Throwable {
		data = invoices.raw();
		for (List<String> tabledata : data) {
			rejectiontheme.verifyInvoicesSelectedInGrid(tabledata.get(0));
		}
	}

	@Then("^User gets prompted with error message \"([^\"]*)\"$")
	public void user_gets_prompted_with_error_message(String message) throws Throwable {
		rejectiontheme.invoiceValidationErrorpopupMessageFirst(message);
	}
	
	@Then("^invoice gets deselected in grid$")
	public void invoice_gets_deselected_in_grid() {
		for (List<String> tabledata : data) {
			rejectiontheme.isInvoiceNotSelected(tabledata.get(0));
		}		
	}
	
	@When("^user clicks on unreject button over the grid$")
	public void user_clicks_on_unreject_button_over_the_grid() throws Throwable {
		rejectiontheme.clickUnreject();
	}
	
	@When("^user clicks on Email button over the grid$")
	public void user_clicks_on_Email_button_over_the_grid() throws Throwable {
		rejectiontheme.clickEmailButton();
	}

	@When("^user clicks on Send mail button of Email Rejection Letter popup$")
	public void user_clicks_on_Send_mail_button_of_Email_Rejection_Letter_popup() throws Throwable {
		rejectiontheme.clickSendmailButton();
	}

	@When("^user is on \"([^\"]*)\" popup of Rejection Tracking page$")
	public void user_is_on_popup_of_Rejection_Tracking_page(String popupTitle) throws Throwable {
		rejectiontheme.verify_popup_title(popupTitle);
	}
	
	
	@Then("^user can not see the Rejected invoice in the Grid$")
	public void user_can_not_see_the_Rejected_invoice_in_the_Grid() {
		rejectiontheme.verifyEmptyTable();
		
	}
	
	@Then("^user can not see Closed invoice in the Grid$")
	public void user_can_not_see_Closed_invoice_in_the_Grid() {
		rejectiontheme.verifyEmptyTable();
	}
	
	@Then("^user can see below invoice in grid$")
	public void user_can_see_below_invoice_in_grid(DataTable invoices) throws Throwable {
		data = invoices.raw();
		for (List<String> tabledata : data) {
			rejectiontheme.invoicesPresentInGrid(tabledata.get(0));
		}
		
	}
	
	@Given("^user clicks on the Arrow button in Actions column$")
	public void user_clicks_on_the_Arrow_button_in_Actions_column() throws Throwable {
		rejectiontheme.clickActions();

	}
	@Given("^user has clicked on the \"([^\"]*)\" button$")
	public void user_has_clicked_on_the_button(String button) throws Throwable {
		rejectiontheme.clickactionlistInRejectionTrackingPage(button);
	}
	
	@When("^user selects Status as \"([^\"]*)\"$")
	public void user_selects_Status_as(String status) throws Throwable {
		rejectiontheme.selectStatus(status);
	}
	@When("^user enters Resubmitted Invoice as \"([^\"]*)\"\\.$")
	public void user_enters_Resubmitted_Invoice_as(String invoice) throws Throwable {
		rejectiontheme.enterResubmittedInvoice(invoice);
	}
	
	@Then("^User can see To Dropdown having a \"([^\"]*)\" value$")
	public void user_can_see_To_Dropdown_having_a_value(String toemailid) throws Throwable {
		rejectiontheme.verifyRejectionLetterTODropdownHasDefaultValue(toemailid);
	}
	@When("^user clicks on Save button of Update Rejection Status popup$")
	public void user_clicks_on_Save_button_of_Update_Rejection_Status_popup() throws Throwable {
		rejectiontheme.clickSaveStatus();
		EY_FW_Utility.doWait(3000); 
	}
	@Then("^user can see Invoice Number \"([^\"]*)\" with Status as \"([^\"]*)\"\\.$")
	public void user_can_see_Invoice_Number_with_Status_as(String invNumber, String status) throws Throwable {
		rejectiontheme.verifyResponse(status);
	}

	
	@When("^User Selects Exception and Rejection Submenu from Invoice Mainmenu\\.$")
	public void user_Selects_Exception_and_Rejection_Submenu_from_Invoice_Mainmenu() throws Throwable {
		rejectiontheme.clickInvoices();
		rejectiontheme.SelectExceptions();
		rejectiontheme.selectExceptionReview();
	}

	@Then("^User is on Exception and Rejection Page\\.$")
	public void user_is_on_Exception_and_Rejection_Page() throws Throwable {
		rejectiontheme.verifyExceptionReviewPageTitle();
	}

	/*@Given("^User is on Exceptions and Rejections - Invoice List Page$")
	public void user_is_on_Exceptions_and_Rejections_Invoice_List_Page() throws Throwable {
	    
	}*/

	@Given("^user has selected a invoice which is not finalized neither approved nor paid but is over the threshold value \\(any of the (\\d+)%, (\\d+)\\.(\\d+)% ,(\\d+)%\\)$")
	public void user_has_selected_a_invoice_which_is_not_finalized_neither_approved_nor_paid_but_is_over_the_threshold_value_any_of_the(int arg1, int arg2, int arg3, int arg4, DataTable arg5) throws Throwable {
		carassociationtheme.clickFilter();
		
		
	}

	@When("^user selects that invoice row$")
	public void user_selects_that_invoice_row() throws Throwable {
	    
	}

	@When("^clicks on Generate Rejection Letter button$")
	public void clicks_on_Generate_Rejection_Letter_button() throws Throwable {
		rejectiontheme.clickGenerateRejectionLetterButton();
		
	}

	@Then("^After the succesfull validation , confirmation box pops up$")
	public void after_the_succesfull_validation_confirmation_box_pops_up() throws Throwable {
		//exceptionandrejectiontheme.verifyGenerateRejectionLetterTitle();
	}
	
	/*@Then("^User can see To Dropdown having a default value$")
	public void user_can_see_To_Dropdown_having_a_default_value() throws Throwable {
		rejectiontheme.verifyRejectionLetterTODropdownHasDefaultValue();
	}*/

	
	@Then("^User can see Rejection Number Editbox$")
	public void user_can_see_Rejection_Number_Editbox() throws Throwable {
		rejectiontheme.verifyRejectionNumberEditBoxIsPresent();
	}
	
	@Then("^User can see Rejection Message editbox$")
	public void user_can_see_Rejection_Message_editbox() throws Throwable {
        rejectiontheme.verifyRejectionMessageEditBoxIsPresent();
	}

	@Then("^User can see Rejection Letter button$")
	public void user_can_see_Rejection_Letter_button() throws Throwable {
        rejectiontheme.verifyRejectionInvoiceButtonIsPresent();
	}

	
	@Then("^User clicks on Cancel button$")
	public void user_clicks_on_Cancel_button() throws Throwable {
        rejectiontheme.clickCancelButton();
	}

	@Given("^Radio button is selected by default for the first option as the invoice is over the threshold$")
	public void radio_button_is_selected_by_default_for_the_first_option_as_the_invoice_is_over_the_threshold() throws Throwable {
	    rejectiontheme.verifyAARRadioButtonIsChecked();
	}

	@When("^user fills the Rejection number \\(Random ,arbitary\\)$")
	public void user_fills_the_Rejection_number_Random_arbitary() throws Throwable {
		rejectiontheme.enterRejectionNumber("1234");
	}
	
	@When("^User selects the Rejection Reason outside of AAR Rule radio button$")
	public void user_selects_the_Rejection_Reason_outside_of_AAR_Rule_radio_button() throws Throwable {
		rejectiontheme.clickManualReasonRadionButton();
	}

	@When("^forgets to enter the Rejection reason$")
	public void forgets_to_enter_the_Rejection_reason() throws Throwable {
		rejectiontheme.enterRejectionMessage("");	    
	}

	@When("^clicks on the save and continue$")
	public void clicks_on_the_save_and_continue() throws Throwable {
		rejectiontheme.clickOnSaveButtonOnGenerateRejectionLetterForm();
	}


	@Then("^a message should appear regarding the missing mandatory field\\.$")
	public void a_message_should_appear_regarding_the_missing_mandatory_field() throws Throwable {
		rejectiontheme.verifyGenerateRejectionErrorMessage();
	}

	@Then("^Reject Invoice\\(s\\) is still not enabled$")
	public void reject_Invoice_s_is_still_not_enabled() throws Throwable {
	    rejectiontheme.verifyRejectInvoiceButtonIsDisabled();
	}
	
	
	
	@Given("^User is on Generate Rejection Letter Page$")
	public void user_is_on_Generate_Rejection_Letter_Page() throws Throwable {
	  rejectiontheme.verifyGenerateRejectionPageTitle(); 
	}

	@When("^User provides \"([^\"]*)\" as Rejection Number$")
	public void user_provides_as_Rejection_Number(String rejectionNumber) throws Throwable {
		rejectiontheme.enterRejectionNumber(rejectionNumber);
	}

	@When("^User selects Manual radio button$")
	public void user_selects_Manual_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@When("^User selects To option as \"([^\"]*)\"$")
	public void User_selects_To_option_as(String toemailid) throws Throwable {
		rejectiontheme.selectToOption(toemailid);
	}

	@When("^User enters \"([^\"]*)\" as message in Rejection Message text area$")
	public void user_enters_as_message_in_Rejection_Message_text_area(String rejectionMessage) throws Throwable {
		rejectiontheme.enterRejectionMessage(rejectionMessage);
	}
	
	@When("^User enters \"([^\"]*)\" as cc emailId$")
	public void user_enters_as_cc_emailId(String ccEmailId) throws Throwable {
		rejectiontheme.enterCCEmailId(ccEmailId);
	}
	
	@When("^User clicks on Save button on the Generate Rejection Letter form$")
	public void user_clicks_on_Save_button_on_the_Generate_Rejection_Letter_form() throws Throwable {
		rejectiontheme.clickOnSaveButtonOnGenerateRejectionLetterForm();
	}
	
	@When("^User clicks on Reject Invoice button$")
	public void user_clicks_on_Reject_Invoice_button() throws Throwable {
		rejectiontheme.clickOnRejectInvoiceButton();
	}
	
	@When("^User clicks on cc checkbox$")
	public void User_clicks_on_cc_checkbox() throws Throwable {
		rejectiontheme.clickOnCCCheckbox();
	}
	
	
	@Then("^User is on E-mail confirmation pop-up$")
	public void user_is_on_E_mail_confirmation_pop_up() throws Throwable {
		rejectiontheme.verifyEmailConfirmationPopupIsDisplayed();
	}

	
	@When("^User clicks on Yes, send it now button$")
	public void user_clicks_on_Yes_send_it_now_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rejectiontheme.clickOnYesSendItNowButton();
	}
	
	@Then("^User can see \"([^\"]*)\" as cc emailId$")
	public void user_can_see_as_cc_emailId(String ccemailid) throws Throwable {
		rejectiontheme.verifyRejectionLetterCcEmailId(ccemailid);
	}

	@Then("^The popup-up should have two buttons- No, I will send it Later and Yes, send it now$")
	public void the_popup_up_should_have_two_buttons_No_I_will_send_it_Later_and_Yes_send_it_now() throws Throwable {
		rejectiontheme.verifyEmailConfirmationPopupButtonsAreDisplayed();;
	}
	@Then("^User can see read-only From field with default value$")
	public void user_can_see_read_only_From_field_with_default_value() throws Throwable {
		rejectiontheme.verifyFromFieldValue();
	}
	@Then("^User can see Rejection Number as non-editable textbox with value \"([^\"]*)\"$")
	public void user_can_see_Rejection_Number_as_non_editable_textbox_with_value(String rejectionnumber) throws Throwable {
		rejectiontheme.verifyRejectionNumberInEditBox(rejectionnumber);
	}
	@Then("^User can see Rejection Message as \"([^\"]*)\"$")
	public void User_can_see_Rejection_Message_as(String rejectionmsg) throws Throwable {
		rejectiontheme.verifyRejectionMessageInEditBox(rejectionmsg);
	}
}
