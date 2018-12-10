package com.ey.mms.cucumberStepsThemeLevel;

import com.ey.mms.serenitystepsThemelevel.MMS_BillingTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_ExceptionsTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_RebuttalTheme_SerenitySteps;
import com.ey.mms.util.EY_FW_Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RebuttalThemes_StepDefs {

	@Steps
	MMS_RebuttalTheme_SerenitySteps rebuttaltheme;
	@Steps
	MMS_ExceptionsTheme_SerenitySteps exceptiontheme;
	@Steps
	MMS_BillingTheme_SerenitySteps mmsbillingtheme;

	@When("^User Selects Rebuttal Submenu from Invoice Mainmenu\\.$")
	public void user_Selects_Rebuttal_Submenu_from_Invoice_Mainmenu() throws Throwable {

		exceptiontheme.clickInvoices();
		// EY_FW_Utility.doWait(2000);
		rebuttaltheme.clickRebuttal();
	}

	@Then("^User lands to Rebuttal Billing Page\\.$")
	public void user_lands_to_Rebuttal_Billing_Page() throws Throwable {
		// EY_FW_Utility.waitTillPageLoad(3);
		rebuttaltheme.verifyRebuttalBillingPageTitle();
	}

	@Given("^User is already on Rebuttal Billing Page\\.$")
	public void user_is_already_on_Rebuttal_Billing_Page() throws Throwable {
		// EY_FW_Utility.waitTillPageLoad(3);
		rebuttaltheme.verifyRebuttalBillingPageTitle();
	}

	@When("^User Enters Invoice Number \"([^\"]*)\" to \"([^\"]*)\" and Rebuttal Status as \"([^\"]*)\"$")
	public void user_Enters_Invoice_Number_to_and_Rebuttal_Status_as(String startInvNo, String endInvNo, String invStatus)
			throws Throwable {
		rebuttaltheme.enterStartInvoiceNumber(startInvNo);
		rebuttaltheme.enterInvoiceNumberEnd(endInvNo);
		rebuttaltheme.selectRebuttalStatus(invStatus);
		rebuttaltheme.selectRebuttal("Show All");
	}

	@When("^User Clicks on Save button$")
	public void user_Clicks_on_Save_button() throws Throwable {
		rebuttaltheme.clickSaveButton();
	}

	@When("^User selects a row with the Invoice Number \"([^\"]*)\"$")
	public void user_selects_a_row_with_the_Invoice_Number(String invNo) throws Throwable {
		rebuttaltheme.selectRow();
	}

	@When("^User Clicks on Mark Invoices Reviewed\\.$")
	public void user_Clicks_on_Mark_Invoices_Reviewed() throws Throwable {
		rebuttaltheme.clickMarkInvoicesButton();
		// EY_FW_Utility.doWait(2000);
	}

	@Then("^User can Verify the Status as \"([^\"]*)\" in the Grid$")
	public void user_can_Verify_the_Status_as_in_the_Grid(String status) throws Throwable {
		rebuttaltheme.verifyRebuttalStatus(status);
	}

	@When("^User Clicks on Finalize Invoices\\.$")
	public void user_Clicks_on_Finalize_Invoices() throws Throwable {
		rebuttaltheme.clickFinalizeInvoicesButton();
		// EY_FW_Utility.doWait(3000);
	}

	@Then("^User will not see that customer name in the Invoicing screen$")
	public void user_will_not_see_that_customer_name_in_the_Invoicing_screen() throws Throwable {
		// EY_FW_Utility.doWait(2000); // verification
		exceptiontheme.verifyEmptyTable();
	}

	@When("^User Enters Invoice Number \"([^\"]*)\" to \"([^\"]*)\"$")
	public void user_Enters_Invoice_Number_to(String fromInvNo, String toInvNo) throws Throwable {
		rebuttaltheme.enterStartInvoiceNumber(fromInvNo);
		rebuttaltheme.enterInvoiceNumberEnd(toInvNo);
		rebuttaltheme.selectRebuttalStatus("All");
		rebuttaltheme.selectRebuttal("Show All");
	}

	@When("^User clicks View button Under Action Column\\.$")
	public void user_clicks_View_button_Under_Action_Column() throws Throwable {
		rebuttaltheme.clickActions("View");
		// EY_FW_Utility.doWait(3000);
	}

	@Then("^User lands to Rebuttal Billing - car list Page\\.$")
	public void user_lands_to_Rebuttal_Billing_car_list_Page() throws Throwable {
		// EY_FW_Utility.waitTillPageLoad(3);
		rebuttaltheme.verifyRebuttalInvoiceListPageTitle();
	}

	@Then("^User can verify Car Details associated with the Invoice Number \"([^\"]*)\"$")
	public void user_can_verify_Car_Details_associated_with_the_Invoice_Number(String invNo) throws Throwable {

	}

	@Given("^User is already on Rebuttal Billing - Car List\\.$")
	public void user_is_already_on_Rebuttal_Billing_Car_List() throws Throwable {
		// EY_FW_Utility.waitTillPageLoad(3);
		rebuttaltheme.verifyRebuttalInvoiceListPageTitle();
	}

	@Given("^User selects the row in the Grid\\.$")
	public void user_selects_the_row_in_the_Grid() throws Throwable {
		rebuttaltheme.selectRow();
	}

	@When("^User clicks on Mark Car Reviewed\\.$")
	public void user_clicks_on_Mark_Car_Reviewed() throws Throwable {
		rebuttaltheme.clickMarkCarsButton();
		// EY_FW_Utility.doWait(2000);
	}

	@Then("^User can verify the Status as Reviewed in the Grid for that Car\\.$")
	public void user_can_verify_the_Status_as_Reviewed_in_the_Grid_for_that_Car() throws Throwable {
		// EY_FW_Utility.doWait(2000);
		rebuttaltheme.verifyCarStatus("Reviewed");
	}

	@Then("^But Status of Invoice is Still New\\.$")
	public void but_Status_of_Invoice_is_Still_New() throws Throwable {
		// EY_FW_Utility.doWait(2000);
		rebuttaltheme.verifyInvoicePrevStatus("New");
	}

	@Given("^User is on Rebuttal Billing Page\\.$")
	public void user_is_on_Rebuttal_Billing_Page() throws Throwable {
		exceptiontheme.clickInvoices();
		// EY_FW_Utility.doWait(2000);
		rebuttaltheme.clickRebuttal();
		// EY_FW_Utility.doWait(3000);
		// EY_FW_Utility.waitTillPageLoad(3);
	}

	@Then("^But Status of Invoice \"([^\"]*)\" is Still New\\.$")
	public void but_Status_of_Invoice_is_Still_New(String invNo) throws Throwable {
		exceptiontheme.clickInvoices();
		// EY_FW_Utility.doWait(2000);
		rebuttaltheme.clickRebuttal();
		// EY_FW_Utility.doWait(3000);
		EY_FW_Utility.waitTillPageLoad(5);
		mmsbillingtheme.clickFilter();
		rebuttaltheme.enterStartInvoiceNumber(invNo);
		rebuttaltheme.enterInvoiceNumberEnd(invNo);
		rebuttaltheme.selectRebuttalStatus("All");
		rebuttaltheme.selectRebuttal("Show All");
		rebuttaltheme.clickSaveButton();
		// EY_FW_Utility.doWait(3000);
		rebuttaltheme.verifyRebuttalStatus("New");
	}

	@Given("^User selects Has Rebuttal Assignments from Rebuttal Dropdown\\.$")
	public void user_selects_Has_Rebuttal_Assignments_from_Rebuttal_Dropdown() throws Throwable {
		rebuttaltheme.selectRebuttal("Has Rebuttal Assignments");
	}

	@Given("^User can view details of car associated with the Invoice Number$")
	public void user_can_view_details_of_car_associated_with_the_Invoice_Number() throws Throwable {
		// EY_FW_Utility.doWait(3000);
		rebuttaltheme.verifyRebuttalInvoiceListPageTitle();
	}

	@Given("^clicks on View under Action Column of Car$")
	public void clicks_on_View_under_Action_Column_of_Car() throws Throwable {
		rebuttaltheme.clickCarAction("View");
		// EY_FW_Utility.doWait(3000);
	}

	@Given("^User Selects the Rows in the Grid$")
	public void user_Selects_the_Rows_in_the_Grid() throws Throwable {
		rebuttaltheme.selectRow();
	}

	@Given("^User Clicks on Bulk Rebuttal$")
	public void user_Clicks_on_Bulk_Rebuttal() throws Throwable {
		rebuttaltheme.clickRepairListBulkRebuttal();
		// EY_FW_Utility.doWait(3000);
	}

	@Given("^User Can view Bulk Rebuttal Window$")
	public void user_Can_view_Bulk_Rebuttal_Window() throws Throwable {

	}

	@Given("^User Selects Billee \"([^\"]*)\"$")
	public void user_Selects_Billee(String billee) throws Throwable {
		rebuttaltheme.selectBillee(billee);
		// EY_FW_Utility.doWait(3000);
	}

	@Given("^User Selects Contact \"([^\"]*)\"$")
	public void user_Selects_Contact(String contact) throws Throwable {
		rebuttaltheme.selectContact(contact);
		// EY_FW_Utility.doWait(5000);
	}

	@Given("^Clicks on Save Rebuttal button$")
	public void clicks_on_Save_Rebuttal_button() throws Throwable {
		rebuttaltheme.saveRebuttal();
		// EY_FW_Utility.doWait(2000);
	}

	@Given("^Click on Ok$")
	public void click_on_Ok() throws Throwable {
		rebuttaltheme.confirmRebuttals();
		// EY_FW_Utility.doWait(4000);
	}

	@Given("^Click on Refresh Button$")
	public void click_on_Refresh_Button() throws Throwable {
		rebuttaltheme.clickRefresh();
		// EY_FW_Utility.doWait(2000);
		// EY_FW_Utility.waitTillPageLoad(20);
	}

	@Then("^User Can Verify Billee as \"([^\"]*)\" from \"([^\"]*)\"$")
	public void user_Can_Verify_Billee_as_from(String billee, String fromBillee) throws Throwable {

	}

	@Given("^User Selects Overwrite existing rebuttals$")
	public void user_Selects_Overwrite_existing_rebuttals() throws Throwable {
		rebuttaltheme.selectOverwriteRebuttal();
	}

	@Given("^Clicks on BulkUnassign$")
	public void clicks_on_BulkUnassign() throws Throwable {
		rebuttaltheme.clickBulkUnassign();
		// EY_FW_Utility.doWait(2000);
	}

	@Given("^Clicks on OK$")
	public void click_on_OK() throws Throwable {
		rebuttaltheme.confirmBulkUnassign();
		// EY_FW_Utility.doWait(4000);
	}

	@Then("^User Can verify entire Invoice is removed from the Rebuttal List$")
	public void user_Can_verify_entire_Invoice_is_removed_from_the_Rebuttal_List() throws Throwable {

	}

}
