package com.ey.mms.cucumberStepsThemeLevel;

import com.ey.mms.pageobjects.MMS_Locators;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.serenitystepsThemelevel.MMS_InvoiceTheme_SerenitySteps;
import com.ey.mms.util.EY_FW_Utility;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class InvoiceThemes_StepDefs {
	String invoicenumber;

	@Steps
	MMS_InvoiceTheme_SerenitySteps mmsinvoicestheme;

	@Given("the user enters the username '(.*)'")
	public void user_is_logged_in_with_username_kcsadmin(String username) {
		mmsinvoicestheme.opensMMSLoginPage();
		mmsinvoicestheme.enterUserId(username);

	}

	@And("User enter password '(.*)'")
	public void enters_password_admin(String password) throws Throwable {
		mmsinvoicestheme.enterPassword(password);
	}

	@And("User Click on Login Button")
	public void clcik_login_button() throws Throwable {
		mmsinvoicestheme.clickLoginButton();
	}

	@When("User Selects Invoice Review Submenu from Invoice Mainmenu")
	public void user_Selects_Invoice_Review_Submenu_from_Invoice_Mainmenu() throws Throwable {
		mmsinvoicestheme.clickInvoiceMainMenu();
		mmsinvoicestheme.clickInvoiceReviewSubmenu();
	}

	@Then("User lands to Invoice Review Page")
	public void user_lands_to_Invoice_Review_Page() throws Throwable {
		mmsinvoicestheme.verifyInvoiceReviewPagetitle();
	}

	@Given("^User Selects Invoice Number '(.*)'$")
	public void user_Selects_Invoice_Number(String invNo) throws Throwable {
		mmsinvoicestheme.clickInvoiceCheckBox(invNo);
	}

	@When("^User Clicks on View Details under Action coulumn$")
	public void user_Clicks_on_View_Details_under_Action_coulumn() throws Throwable {
		mmsinvoicestheme.clickInvoiceReviewAction();
		mmsinvoicestheme.clickInvoiceActionViewDetails();
	}

	@Then("^User Lands to Invoice Details Page with Same Invoice Number$")
	public void user_Lands_to_Invoice_Details_Page_with_Same_Invoice_Number() throws Throwable {
		mmsinvoicestheme.verifyInvoiceDetailsPageTitle();
	}

	@Then("^User Can Verify Details Of Invoice with Same Invoice Number in the Grid$")
	public void user_Can_Verify_Details_Of_Invoice_with_Same_Invoice_Number_in_the_Grid() throws Throwable {
		// EY_FW_Utility.doWait(10000);
	}

	@Given("^User is on Invoice Review Page\\.$")
	public void user_is_already_on_Invoice_Review_Page() throws Throwable {
		mmsinvoicestheme.clickInvoiceNumberClose();
		mmsinvoicestheme.clickInvoiceMainMenu();
		mmsinvoicestheme.clickInvoiceReviewSubmenu();
	}

	@Given("^User selects the already Created Invoice Number\\.$")
	public void user_selects_the_already_Created_Invoice_Number() throws Throwable {
		mmsinvoicestheme.clickInvoiceCheckBox(invoicenumber);

	}

	@When("^User clicks on filter of invoice review\\.$")
	public void user_clicks_on_filter_of_invoice_review() throws Throwable {
		mmsinvoicestheme.clcikInvoiceFilter();
	}

	@When("^User Enter the Invoice Number '(.*)' and '(.*)'$")
	public void user_Enter_the_Invoice_Number_and(String startNumber, String endNumber) throws Throwable {
		mmsinvoicestheme.enterInvoiceStartNumber(startNumber);
		mmsinvoicestheme.enterInvoiceEndNumber(endNumber);
		invoicenumber = startNumber;
	}

	// User selects payment status as 'Unpaid'
	@When("^User selects payment status as '(.*)'$")
	public void user_selects_payment_status_as(String paymentStatus) throws Throwable {
		mmsinvoicestheme.selectPaymentStatus(paymentStatus);
	}

	@When("^Click on Save$")
	public void click_on_Save() throws Throwable {
		mmsinvoicestheme.clickInvoiceReviewSave();
	}	
	
	@Then("^User can verify the Invoice number details in the Grid\\.$")
	public void user_can_verify_the_Invoice_number_details_in_the_Grid() throws Throwable {
		mmsinvoicestheme.verifyFilterInvoiceDetail();
	}

	@Given("^User is already on Invoice Review Page\\.$")
	public void user_on_Invoice_Review_Page() throws Throwable {
		mmsinvoicestheme.clickInvoiceMainMenu();
		mmsinvoicestheme.clickInvoiceReviewSubmenu();
	}

	@When("^User Selects already Created Invoice Number\\.$")
	public void user_Selects_already_Created_Invoice_Number() throws Throwable {
		mmsinvoicestheme.clickInvoiceCheckBox(invoicenumber);
	}

	@When("^User Clicks on Generate Report Button\\.$")
	public void user_Clicks_on_Generate_Report_Button() throws Throwable {
		mmsinvoicestheme.clickInvoiceGenerateReport();
	}

	@When("^User can view Report Download Window of invoice review\\.$")
	public void user_can_view_Report_Download_Window_of_invoice_review() throws Throwable {

	}

	@When("^User Clicks on Download Under Action Column\\.$")
	public void user_Clicks_on_Download_Under_Action_Column() throws Throwable {
		mmsinvoicestheme.clickInvoiceReportDownloadActio();
		mmsinvoicestheme.clickInvoiceeEportActionDownload();
	}

	@Then("^User Can verify the Report generated successfully\\.$")
	public void user_Can_verify_the_Report_generated_successfully() throws Throwable {

	}

	@Given("^User views Invoice Review Page\\.$")
	public void user_views_Invoice_Review_Page() throws Throwable {
		mmsinvoicestheme.clickInvoiceMainMenu();
		mmsinvoicestheme.clickInvoiceReviewSubmenu();
	}

	@Given("^User selects created Invoice number\\.$")
	public void user_selects_created_Invoice_number() throws Throwable {
		mmsinvoicestheme.clickInvoiceUnpaid();
	}

	@When("^User Clicks on Approve for Payemnt\\.$")
	public void user_Clicks_on_Approve_for_Payemnt() throws Throwable {
		mmsinvoicestheme.clickInvoiceApprovePayment();
	}

	@When("^User Click on Ok\\.$")
	public void user_Click_on_Ok() throws Throwable {
		mmsinvoicestheme.clickInvoiceApproveOk();
	}

	@Then("^User can Verify the Payemnt Status as Approved in the Grid for Created Invoice Number\\.$")
	public void user_can_Verify_the_Payemnt_Status_as_Approved_in_the_Grid_for_Created_Invoice_Number()
			throws Throwable {
		mmsinvoicestheme.verifyInvoiceApprovePaymentStatus();
	}

	@Then("^User can verify Payment Status as Unpaid in the Grid for the Invoice\\.$")
	public void User_can_verify_Payment_Status_as_Unpaid_in_the_Grid_for_the_Invoice()
			throws Throwable {
		mmsinvoicestheme.verifyInvoiceUnpaidPaymentStatus();
	}
	
	@Then("^User can verify Payment Status as Rejected in the Grid for the Invoice\\.$")
	public void User_can_verify_Payment_Status_as_Rejected_in_the_Grid_for_the_Invoice()
			throws Throwable {
		mmsinvoicestheme.verifyInvoiceRejectedPaymentStatus();
	}
	
	@Given("^User lands on Invoice Review Page\\.$")
	public void user_lands_on_Invoice_Review_Page() throws Throwable {
		mmsinvoicestheme.clickInvoiceMainMenu();
		mmsinvoicestheme.clickInvoiceReviewSubmenu();
	}

	@Given("^User selects Created Invoice number\\.$")
	public void user_selects_Created_Invoice_number() throws Throwable {
		mmsinvoicestheme.clickInvoiceCheckBox(invoicenumber);
	}

	@When("^User Clicks on Mark Paid\\.$")
	public void user_Clicks_on_Mark_Paid() throws Throwable {
		mmsinvoicestheme.clickInvoiceMarKPaid();
	}

	@When("^User clicks on Ok of popup\\.$")
	public void user_clicks_on_Ok_of_popup() throws Throwable {
		mmsinvoicestheme.clickInvoiceApproveOk();
	}

	@Then("^User can verify the Payemnt Status as Paid in the Grid for Created Invoice Number\\.$")
	public void user_can_verify_the_Payemnt_Status_as_Paid_in_the_Grid_for_Created_Invoice_Number() throws Throwable {

	}

	@Given("^User is already on Invoice Review Page$")
	public void user_reached_Invoice_Review_Page() throws Throwable {
		mmsinvoicestheme.clickInvoiceMainMenu();
		mmsinvoicestheme.clickInvoiceReviewSubmenu();
	}

	@Given("^User selects the created Invoice Number$")
	public void user_selects_the_created_Invoice_Number() throws Throwable {
		mmsinvoicestheme.clickInvoicePaidCheckbox();
	}

	@Given("^User Clicks Filter$")
	public void user_Clicks_Filter() throws Throwable {
		mmsinvoicestheme.clcikInvoiceFilter();
	}

	@Given("User Search for Invoice Number '(.*)' and '(.*)'")
	public void User_search_Invoice_Number_and(String startNumber, String endNumber) throws Throwable {
		mmsinvoicestheme.enterInvoiceStartNumber(startNumber);
		mmsinvoicestheme.enterInvoiceEndNumber(endNumber);
	}

	@Given("^Clicks Save$")
	public void clicks_Save() throws Throwable {
		mmsinvoicestheme.clickInvoiceReviewSave();
	}

	@When("^User select the Row$")
	public void user_select_the_Row() throws Throwable {
		mmsinvoicestheme.clickInvoicePaidCheckbox();
		mmsinvoicestheme.clickInvoiceMarKPaid();
	}

	@When("^User Clicks Ok$")
	public void user_Clicks_Ok() throws Throwable {
		mmsinvoicestheme.clickInvoiceApproveOk();
	}

	@Then("^User gets Error message \"([^\"]*)\"\\.$")
	public void user_gets_Error_message(String message) throws Throwable {
		mmsinvoicestheme.verifyMarkPaidErrorMessage();
		//mmsinvoicestheme.clickInvoiceMarkPaidClose();
	}

	@Given("^User Is already on Invoice Review Page$")
	public void user_Is_already_on_Invoice_Review_Page() throws Throwable {
		mmsinvoicestheme.clickInvoiceMainMenu();
		mmsinvoicestheme.clickInvoiceReviewSubmenu();
	}

	@Given("^User selects row with Invoice Number Whoes Payment Status is Approved$")
	public void user_selects_row_with_Invoice_Number_Whoes_Payment_Status_is_Approved() throws Throwable {
		mmsinvoicestheme.clickInvoiceUnpaid();
	}

	@Given("^User Clicks on Filter$")
	public void user_Click_on_Filter() throws Throwable {
		mmsinvoicestheme.clcikInvoiceFilter();
	}

	@Given("^Search for Invoice Number '(.*)' and '(.*)'")
	public void search_Invoice_Number_I_and_I(String startNumber, String endNumber) throws Throwable {
		mmsinvoicestheme.enterInvoiceStartNumber(startNumber);
		mmsinvoicestheme.enterInvoiceEndNumber(endNumber);
	}

	@Given("^Click Save$")
	public void click_Save() throws Throwable {
		mmsinvoicestheme.clickInvoiceReviewSave();
	}

	@When("^User selects the Row$")
	public void user_selects_the_Row() throws Throwable {
		mmsinvoicestheme.clickInvoicePaidCheckbox();
	}

	@When("^User Click Ok$")
	public void user_Click_Ok() throws Throwable {
		mmsinvoicestheme.clickInvoiceApprovePayment();
		mmsinvoicestheme.clickInvoiceApproveOk();
	}

	@Then("^User gets Error message\"([^\"]*)\"$")
	public void user_verify_Error_message(String message) throws Throwable {

	}

}
