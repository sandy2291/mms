package com.ey.mms.cucumberStepsThemeLevel;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;

import com.ey.mms.pageobjects.MMS_Locators;
import com.ey.mms.pageobjects.mmsLocators.MMS_CombineBillingPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.serenitystepsThemelevel.MMS_CombinedBillingTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_InvoiceTheme_SerenitySteps;
import com.ey.mms.util.EY_FW_Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CombinedBillingThemes_Stepdefs {
	public static int count = 0;
	@Steps
	MMS_CombinedBillingTheme_SerenitySteps combinedBillintheme;

	@Steps
	MMS_InvoiceTheme_SerenitySteps mmsinvoicestheme;
	
	@Given("^User navigate through Billing\\.$")
	public void user_navigate_through_Billing() throws Throwable {
		combinedBillintheme.clickBilling();
	}

	@When("^User Selects \"([^\"]*)\" Submenu from Combined Billing\\.$")
	public void user_Selects_Submenu_from_Combined_Billing(String subMenu) throws Throwable {
		combinedBillintheme.movetoCombineBilling("Combined Billing");
		combinedBillintheme.clickCombinedBillingOptions(subMenu);
	}

	@Then("^User is on \"([^\"]*)\" Page$")
	public void user_is_on_Page(String pageTitle) throws Throwable {
		// EY_FW_Utility.waitTillPageLoad(3);
		combinedBillintheme.verifyCombinedBillingOptionsPageTitle(pageTitle);
	}

	@Then("^page shows empty table$")
	public void page_shows_empty_table() {
		combinedBillintheme.verify_empty_table();
	}

	@Given("^User clicks on MMS invoice number \"([^\"]*)\"$")
	public void user_clicks_on_MMS_invoice_number(String mmsInvoice) throws Throwable {
		combinedBillintheme.selectInvoice(mmsInvoice);
	}

	@Given("^User clicks on CRB invoice number \"([^\"]*)\"$")
	public void user_clicks_on_CRB_invoice_number(String crbInvoice) throws Throwable {
		combinedBillintheme.selectInvoice(crbInvoice);
	}

	@Given("^clicks on combine invoice button$")
	public void clicks_on_combine_invoice_button() throws Throwable {
		combinedBillintheme.clickCombinedInvoices();
	}

	@Given("^clicks on ok button$")
	public void clicks_on_ok_button() throws Throwable {
		combinedBillintheme.confirmCombinedInvoice();
		// EY_FW_Utility.doWait(4000);
	}

	@Then("^User can verify the Invoice Number \"([^\"]*)\", Billed Party \"([^\"]*)\" and Billing Party \"([^\"]*)\" in the Grid\\.$")
	public void user_can_verify_the_Invoice_Number_Billed_Party_and_Billing_Party_in_the_Grid(String invNumber, String billedParty,
			String billingParty) throws Throwable {
		combinedBillintheme.clickFilter();
		combinedBillintheme.enterfromInvoice(invNumber);
		combinedBillintheme.entertoInvoiceNO(invNumber);
		combinedBillintheme.clickSave();
		// EY_FW_Utility.doWait(4000);
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 3, billedParty);
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 4, billingParty);
	}
	
	
	@Given("^User clears filters$")
	public void user_clears_filters(){
		combinedBillintheme.clickFilter();
		combinedBillintheme.enterfromInvoice("");
		combinedBillintheme.entertoInvoiceNO("");
		combinedBillintheme.clickSave();
	}
	@Given("^enters from invoice number as \"([^\"]*)\"$")
	public void enters_from_invoice_number_as(String fromInvNo) throws Throwable {
		combinedBillintheme.entermergefromInvoice(fromInvNo);
	}

	@Given("^to invoice number as \"([^\"]*)\"$")
	public void to_invoice_number_as(String toInvNo) throws Throwable {
		combinedBillintheme.enterMergetoInvoiceNO(toInvNo);
	}

	@Given("^enters start invoice number as \"([^\"]*)\"$")
	public void enters_start_invoice_number_as(String startInvNo) throws Throwable {
		combinedBillintheme.enterCombinedDXfromInvoice(startInvNo);
	}

	@Given("^enters end invoice number as \"([^\"]*)\"$")
	public void enters_end_number_as(String endNumber) throws Throwable {
		combinedBillintheme.enterCombinedDXtoInvoiceNO(endNumber);
	}

	@Given("^clicks on save button$")
	public void clicks_on_save_button() throws Throwable {
		combinedBillintheme.clickSave();
		//combinedBillintheme.clickSave();
		// EY_FW_Utility.doWait(4000); // required for refreshing
	}

	@When("^User clicks on action button of invoice \"([^\"]*)\"$")
	public void user_clicks_on_action_button_of_invoice(String actionList) throws Throwable {
		combinedBillintheme.clickActions(actionList);
		// EY_FW_Utility.doWait(2000);
	}

	@When("^User clicks on actions button of invoice \"([^\"]*)\"$")
	public void user_clicks_on_actions_button_of_invoice(String action) throws Throwable {
		combinedBillintheme.clickActionsCombineDX(action);
		// EY_FW_Utility.doWait(2000);
	}

	@When("^clicks on \"([^\"]*)\" option$")
	public void clicks_on_option(String option) throws Throwable {
		combinedBillintheme.clickActionList(option);
		// EY_FW_Utility.doWait(4000);
	}

	@When("^clicks on \"([^\"]*)\" options$")
	public void clicks_on_options(String invOption) throws Throwable {
		combinedBillintheme.clickActionListCombineDX(invOption);
		// EY_FW_Utility.doWait(4000);
	}

	@Then("^invoice \"([^\"]*)\" disappear from page$")
	public void invoice_disappear_from_page(String invNo) throws Throwable {
		combinedBillintheme.invoice_disappear(invNo);
		
	}

	@Given("^enters billed party as \"([^\"]*)\"$")
	public void enters_billed_party_as(String billedParty) throws Throwable {
		combinedBillintheme.enterMergeBilledParty(billedParty);
	}

	@Then("^User can verify number of Invoices Attached to selected Billed Party \"([^\"]*)\"\\.$")
	public void user_can_verify_number_of_Invoices_Attached_to_selected_Billed_Party(String invoices) throws Throwable {
		combinedBillintheme.verify_inv_attached(invoices);
		/*
		 * EY_FW_Utility.doWait(3000);
		 * EY_FW_Utility.verifyTableColumnContains(MMS_MyCompanyInfoPageLocator.
		 * contacttable, 3, arg1);
		 */
	}

	@When("^User selects Invoice \"([^\"]*)\"$")
	public void user_selects_Invoice(String invoice) throws Throwable {
		combinedBillintheme.selectInvoice(invoice);
	}

	@When("^clicks on generate dx file button$")
	public void clicks_on_generate_dx_file_button() throws Throwable {
		combinedBillintheme.clickGenerateDXButton();
		// EY_FW_Utility.doWait(4000);
	}

	@Then("^User can verify number of Invoices selected to Generate DX File$")
	public void user_can_verify_number_of_Invoices_selected_to_Generate_DX_File() throws Throwable {
		// EY_FW_Utility.doWait(4000);
		combinedBillintheme.getRowsCount();
	}

	@Then("^User is on \"([^\"]*)\" popup$")
	public void user_is_on_popup(String popupTitle) throws Throwable {
		combinedBillintheme.verify_popup_title(popupTitle);
		/*
		 * EY_FW_Utility.doWait(3000); // wait to get text (load) WebElement e =
		 * EY_FW_Utility.getAnyElementByAnyLocator(MMS_CombineBillingPageLocator
		 * .Pr0cess_Created_Notification); MatcherAssert.assertThat(e.getText(),
		 * equalTo(arg1));
		 */
	}

	@Then("^message is \"([^\"]*)\"$")
	public void message_is(String message) throws Throwable {
		combinedBillintheme.verify_msg(message);
		/*
		 * WebElement e =
		 * EY_FW_Utility.getAnyElementByAnyLocator(MMS_CombineBillingPageLocator
		 * .Process_Notification_Text); MatcherAssert.assertThat(e.getText(),
		 * equalTo(arg1));
		 */
	}

	@Then("^clicks on close button$")
	public void clicks_on_close_button() throws Throwable {
		combinedBillintheme.closeNotification();
		// EY_FW_Utility.doWait(3000);
		// EY_FW_Utility.waitTillPageLoad(3);
	}
	
	@Then("^clicks on close button of process notification$")
	public void clicks_on_close_button_of_process_notification() throws Throwable {
		combinedBillintheme.closeProcessNotification();
		// EY_FW_Utility.doWait(3000);
		// EY_FW_Utility.waitTillPageLoad(3);
	}

	@When("^User clicks on actions of generated file name$")
	public void user_clicks_on_actions_of_file_name() throws Throwable {
		/*
		 * if(count==0){
		 * 
		 * combinedBillintheme.clickRemoveFilter(); EY_FW_Utility.doWait(16000);
		 * } count++;
		 */
		combinedBillintheme.clickFileActions("");
		// EY_FW_Utility.doWait(2000);
	}

	@When("^clicks \"([^\"]*)\" option of file$")
	public void clicks_option_of_file(String options) throws Throwable {
		combinedBillintheme.clickFileActionList(options);
		// EY_FW_Utility.doWait(15000); // depends on time to validate by
		// service
	}

	@Then("^User can verify file downloaded in the window$")
	public void user_can_verify_file_downloaded_in_the_window() throws Throwable {
		//combinedBillintheme.closeReportDownloadpopup();
	}

	@Then("^user can verify bulk email status as \"([^\"]*)\"$")
	public void user_can_verify_bulk_email_status_as(String status) throws Throwable {
		combinedBillintheme.getBulkEmailStatus(status);
	}

	@When("^User clicks on action of popup$")
	public void user_clicks_on_action_of_popup() throws Throwable {
		combinedBillintheme.clickactionpopup();
		// EY_FW_Utility.doWait(2000);
	}

	@When("^User clicks on download of popup$")
	public void user_clicks_on_download_of_popup() throws Throwable {
		combinedBillintheme.clickDownloadpopup();
		// EY_FW_Utility.doWait(5000);
	}

}
