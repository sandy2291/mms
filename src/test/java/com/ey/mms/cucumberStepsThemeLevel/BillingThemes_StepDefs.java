package com.ey.mms.cucumberStepsThemeLevel;

import org.testng.Assert;

import com.ey.mms.pageobjects.MMS_Locators;
import com.ey.mms.pageobjects.mmsLocators.*;
import com.ey.mms.serenitystepsThemelevel.MMS_BillingTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_FleetTheme_SerenitySteps;
import com.ey.mms.util.EY_FW_Utility;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BillingThemes_StepDefs {
	public static int count = 0;
	@Steps
	MMS_BillingTheme_SerenitySteps mmsbillingtheme;

	@Steps
	MMS_FleetTheme_SerenitySteps mmsconfigtheme;


	@Given("User is on Home Page.")
	public void user_is_on_home_page() throws Throwable {
		mmsconfigtheme.clickLoginButton();
	}

	@When("^User Selects Invoice History Submenu from Billing Mainmenu\\.$")
	public void user_Selects_Invoice_History_Submenu_from_Billing_Mainmenu() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		mmsbillingtheme.clickBillingPage();
		mmsbillingtheme.clickInvoiceHistoryPage();

	}

	@When("^User Selects Invoicing Submenu from Billing Mainmenu\\.$")
	public void user_Selects_Invoicing_Submenu_from_Billing_Mainmenu() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		mmsbillingtheme.clickBillingPage();
		mmsbillingtheme.clickInvoicingPage();

	}

	@When("^User Selects Invoices Submenu from Upload Mainmenu\\.$")
	public void user_Selects_Invoices_Submenu_from_Upload_Mainmenu() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		mmsbillingtheme.clickUpload();
		mmsbillingtheme.clickInvoices("Invoices");

	}

	@Then("^User is on Invoice History Page\\.$")
	public void user_is_on_Invoice_History_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		mmsbillingtheme.verifyInvoiceHistoryPageTitle();

	}

	@Then("^User is on Upload DX File Page$")
	public void user_is_on_upload_dx_file_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// mmsbillingtheme.VerifyUploadDxPageTitle();
		mmsbillingtheme.clickUpload();
		mmsbillingtheme.clickInvoices("Invoices");
	}

	@Then("^User lands to Upload DX File Page$")
	public void user_lands_to_upload_dx_file_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		mmsbillingtheme.VerifyUploadDxPageTitle();

	}

	@Then("^User is on Invoicing Page\\.$")
	public void user_is_on_Invoicing_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		mmsbillingtheme.verifyInvoicingPageTitle();

	}

	@Given("^User is already on Invoicing Page\\.$")
	public void user_is_already_on_Invoicing_Page() throws Throwable {
		mmsbillingtheme.verifyInvoicingPageTitle();
	}

	@When("^type as \"([^\"]*)\"$")
	public void type_as(String type) throws Throwable {
		mmsbillingtheme.selecttype(type);

	}

	@When("^enters rmark as \"([^\"]*)\"$")
	public void enters_rmark_as(String rMark) throws Throwable {
		mmsbillingtheme.enterRmark(rMark);

	}

	@When("^clicks on action column$")
	public void clicks_on_action_column() throws Throwable {
		mmsbillingtheme.clickactions();
		// EY_FW_Utility.doWait(2000);// for list to appear
	}

	@When("^User Selects the \"([^\"]*)\" under Action Column$")
	public void user_Selects_the_under_Action_Column(String actionListText) throws Throwable {
		mmsbillingtheme.clickactionList(actionListText);
		// EY_FW_Utility.doWait(4000);
		EY_FW_Utility.waitTillPageLoad(4);
	}

	@Then("^User can verify Car \"([^\"]*)\",original Billing Party \"([^\"]*)\",Amount \"([^\"]*)\"\\.$")
	public void user_can_verify_Car_original_Billing_Party_Amount(String carNumber, String billingParty, String amount)
			throws Throwable {
		mmsbillingtheme.verifyCar_Billing(carNumber, billingParty, amount);
		/*
		 * EY_FW_Utility.verifyTableColumnContains(MMS_InvoicingPageLocator.
		 * TABLE_ELEMENT3, 4, arg1);
		 * EY_FW_Utility.verifyTableColumnContains(MMS_InvoicingPageLocator.
		 * TABLE_ELEMENT3, 5, arg2);
		 * EY_FW_Utility.verifyTableColumnContains(MMS_InvoicingPageLocator.
		 * TABLE_ELEMENT3, 8, arg3); EY_FW_Utility.getAnyElementByAnyLocator(
		 * MMS_BillingContactsPageLocator.close).click();
		 * EY_FW_Utility.waitTillPageLoad(3);
		 */
		// EY_FW_Utility.doWait(3000);
	}

	@Given("^User Selects Invoice Number \"([^\"]*)\"\\.$")
	public void user_Selects_Invoice_Number(String invoiceNumber) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//mmsbillingtheme.removeFilters();
		// EY_FW_Utility.doWait(10000);
		mmsbillingtheme.selectInvoiceNumber(invoiceNumber, 0);

	}

	@When("^User Selects Send to Combined Billing\\.$")
	public void user_Selects_Send_to_Combined_Billing() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		mmsbillingtheme.clickSendtoCombinedBillingButton();
		// EY_FW_Utility.doWait(5000);
	}

	@When("^Clicks on OK\\.$")
	public void clicks_on_OK() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		mmsbillingtheme.clickOKCombinedBilling();
		// EY_FW_Utility.doWait(10000);
		// mmsbillingtheme.clickRestoreDefault();
		// EY_FW_Utility.doWait(3000);
	}

	@Then("^User can verify Last sent to combine as present date in the grid for Invoice Number \"([^\"]*)\"\\.$")
	public void user_can_verify_Last_sent_to_combine_as_present_date_in_the_grid_for_Invoice_Number(
			String invoiceNumber) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// EY_FW_Utility.doWait(2000); // verification
		mmsbillingtheme.verifyCombinedBilling();

	}

	@Given("^User selects Multiple Invoice Number \"([^\"]*)\", \"([^\"]*)\"\\.$")
	public void user_selects_Multiple_Invoice_Number(String invNumber1, String invNumber2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//mmsbillingtheme.removeFilters();
		mmsbillingtheme.selectInvoiceNumber(invNumber1, 0);
		// EY_FW_Utility.doWait(1000);
		mmsbillingtheme.selectInvoiceNumber(invNumber2, 0);
	}

	@Then("^User can Verify Last Sent to combine as present date in the grid for Multiple Invoice\\.$")
	public void user_can_Verify_Last_Sent_to_combine_as_present_date_in_the_grid_for_Multiple_Invoice()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// EY_FW_Utility.doWait(3000);
		mmsbillingtheme.verifyCombinedBilling();
	}

	@When("^User selects Bulk Billing Summary\\.$")
	public void user_selects_Bulk_Billing_Summary() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		/*
		 * mmsbillingtheme.clickBulkBilling(); EY_FW_Utility.doWait(5000);
		 */

	}

	@When("^User can view Report Download Window\\.$")
	public void user_can_view_Report_Download_Window() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^User selects Download under Action Column in the Grid\\.$")
	public void user_selects_Download_under_Action_Column_in_the_Grid() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^User can verify file downloaded Successfully in the current Window\\.$")
	public void user_can_verify_file_downloaded_Successfully_in_the_current_Window() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("^User Clicks on Filter\\.$")
	public void user_Clicks_on_Filter() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		mmsbillingtheme.clickFilter();
	}

	@Given("^Enters Invoice Number \"([^\"]*)\"$")
	public void enters_Invoice_Number(String invNumber) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		mmsbillingtheme.enterfromInvoice(invNumber);
		mmsbillingtheme.enterEndInvoice(invNumber);
		mmsbillingtheme.clickSave();
		// EY_FW_Utility.doWait(2000);
	}

	@Then("^User Can Verify Last Sent to combine as present date in the grid for Single Invoice\\.$")
	public void user_Can_Verify_Last_Sent_to_combine_as_present_date_in_the_grid_for_Single_Invoice() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// EY_FW_Utility.doWait(3000);
		mmsbillingtheme.verifyCombinedBilling();
	}

	@When("^user selects \"([^\"]*)\"$")
	public void user_selects(String rmakRow) throws Throwable {
		mmsbillingtheme.SelectFirstRow();
	}

	@When("^clicks on generate invoice button$")
	public void clicks_on_generate_invoice_button() throws Throwable {
		mmsbillingtheme.clickGenerateInvoice();
		// EY_FW_Utility.doWait(2000);
	}

	@When("^enters invoice number as \"([^\"]*)\"$")
	public void enters_invoice_number_as(String invNo) throws Throwable {
		mmsbillingtheme.enterInvNumber(invNo);
	}

	@When("^invoice date as \"([^\"]*)\"$")
	public void invoice_date_as(String invDate) throws Throwable {
		mmsbillingtheme.enterInvStartDate(invDate);
	}

	@When("^due date as \"([^\"]*)\"$")
	public void due_date_as(String dueDate) throws Throwable {
		mmsbillingtheme.eneterInvDueDate(dueDate);
	}

	@When("^Billing contact as \"([^\"]*)\"$")
	public void billing_contact_as(String billingContact) throws Throwable {
		mmsbillingtheme.selectBillingContacts(billingContact);
	}

	@When("^clicks on generate invoice button of popup$")
	public void clicks_on_generate_invoice_button_of_popup() throws Throwable {
		mmsbillingtheme.ClickGenerateInvPopup();
		// EY_FW_Utility.doWait(5000);
	}

	@Then("^User Can verify Billed Party \"([^\"]*)\" for Generated Invoice for \"([^\"]*)\" in the Grid\\.$")
	public void user_Can_verify_Billed_Party_for_Generated_Invoice_for_in_the_Grid(String billedParty, String invoiceNo)
			throws Throwable {
		try {
			mmsbillingtheme.clickFilter();
			// EY_FW_Utility.doWait(2000);
			mmsbillingtheme.enterfromInvoice(invoiceNo);
			EY_FW_Utility.doWait(1000);
			mmsbillingtheme.enterEndInvoice(invoiceNo);
			EY_FW_Utility.doWait(1000);
			mmsbillingtheme.enterInvHistoryStartDate(" ");
			EY_FW_Utility.doWait(1000);
			// mmsbillingtheme.entervoidStatus("All");
			// EY_FW_Utility.doWait(2000);
			mmsbillingtheme.clickSave();
			// EY_FW_Utility.doWait(3000);
			if (count == 0) {
				EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.VOI_STATUS_FILTER).click();
				// EY_FW_Utility.doWait(5000);
			}
			count++;
			// EY_FW_Utility.verifyTableColumnContains(MMS_Locators.contacttable,
			// 4, arg1);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Then("^User will see a notification on the top right corner\\.$")
	public void user_will_see_a_notification_on_the_top_right_corner() throws Throwable {
		//EY_FW_Utility.doWait(30000); // verification
		mmsbillingtheme.countNotification();

	}

	@Then("^on Clicking the notification, panel opens to show the success message\\.$")
	public void on_Clicking_the_notification_panel_opens_to_show_the_success_message() throws Throwable {
		//EY_FW_Utility.doWait(30000); // verification
		mmsbillingtheme.checkNotificationMessage();
	}

	@When("^user selects \"([^\"]*)\" customer$")
	public void user_selects_customer(String customer) throws Throwable {
		mmsbillingtheme.selectCustomer(customer);
	}

	@When("^enters invoice number as \"([^\"]*)\" for \"([^\"]*)\" customer$")
	public void enters_invoice_number_as_for_customer(String invNumber, String customer) throws Throwable {
		mmsbillingtheme.enterInvNo(invNumber);
		// EY_FW_Utility.doWait(1000);
	}

	@When("^invoice date as \"([^\"]*)\" for \"([^\"]*)\" customer$")
	public void invoice_date_as_for_customer(String invDate, String cusstomer) throws Throwable {

		mmsbillingtheme.enterInvDate(invDate);
		// EY_FW_Utility.doWait(1000);
	}

	@When("^due date as \"([^\"]*)\" for \"([^\"]*)\" customer$")
	public void due_date_as_for_customer(String dueDate, String customer) throws Throwable {
		mmsbillingtheme.enterInvDueDate(dueDate);
		// EY_FW_Utility.doWait(1000);
	}

	@When("^Billing contact as \"([^\"]*)\" for \"([^\"]*)\" customer$")
	public void billing_contact_as_for_customer(String billingContact, String customer) throws Throwable {
		mmsbillingtheme.selectBillingContactsInv(billingContact);
		// EY_FW_Utility.doWait(1000);
	}

	@Then("^User can Verify Error Message \"([^\"]*)\"$")
	public void user_can_Verify_Error_Message(String message) throws Throwable {
		// EY_FW_Utility.doWait(2000);
		mmsbillingtheme.checkpopupErrorMessage(message);
	}
	
	@Then("^User can Verify Second Error Message \"([^\"]*)\"$")
	public void user_can_Verify_Second_Error_Message(String message) throws Throwable {
		// EY_FW_Utility.doWait(2000);
		mmsbillingtheme.checkpopupSecondErrorMessage(message);
	}

	@Then("^clicks on cancel invoice$")
	public void clicks_on_cancel_invoice() throws Throwable {
		mmsbillingtheme.clickCancelInvoice();
		EY_FW_Utility.waitTillPageLoad(3);
		// EY_FW_Utility.doWait(3000);
	}

	@Then("^User Can verify on Clicking the notification, panel Opens Error message \"([^\"]*)\"$")
	public void user_Can_verify_on_Clicking_the_notification_panel_Opens_Error_message(String messageText)
			throws Throwable {
		mmsbillingtheme.checkVerificationErrorMessage(messageText);
	}

	@Then("^user clicks on refresh button$")
	public void user_clicks_on_refresh_button() {
		mmsbillingtheme.clickRefresh();
		// EY_FW_Utility.doWait(5000);
	}
}
