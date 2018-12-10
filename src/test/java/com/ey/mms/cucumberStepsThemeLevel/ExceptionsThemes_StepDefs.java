package com.ey.mms.cucumberStepsThemeLevel;

import com.ey.mms.pageobjects.MMS_Locators;
import com.ey.mms.pageobjects.mmsLocators.MMS_BillingContactsPageLocator;
import com.ey.mms.serenitystepsThemelevel.MMS_ExceptionsTheme_SerenitySteps;
import com.ey.mms.util.EY_FW_Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ExceptionsThemes_StepDefs {

	@Steps
	MMS_ExceptionsTheme_SerenitySteps exceptiontheme;

	@When("^User Selects Exception Review Submenu from Invoice Mainmenu\\.$")
	public void user_Selects_Exception_Review_Submenu_from_Invoice_Mainmenu() throws Throwable {
		exceptiontheme.clickInvoices();
		exceptiontheme.SelectExceptions();
		exceptiontheme.selectExceptionReview();;
	}

	@Then("^User is on Exception Review Page\\.$")
	public void user_is_on_Exception_Review_Page() throws Throwable {
		exceptiontheme.verifyExceptionReviewPageTitle();
	}

	@Given("^User selects View under the Action Column for the Invoice Number \"([^\"]*)\" having Exception Amount\\.$")
	public void user_selects_View_under_the_Action_Column_for_the_Invoice_Number_having_Exception_Amount(String invNumber)
			throws Throwable {
         
		exceptiontheme.clickView(invNumber);
		// EY_FW_Utility.doWait(10000);
	}

	@When("^User Selects Edit Exception under the Action Column Repair for the Car \"([^\"]*)\"\\.$")
	public void user_Selects_View_under_the_Action_Column_Repair_for_the_Car(String actionList) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.clickEditException(actionList);
		// EY_FW_Utility.doWait(5000);
	}

	String amount;

	@When("^User Edit the Exception Amount to \"([^\"]*)\"\\.$")
	public void user_Edit_the_Exception_Amount_to(String exceptionAmount) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.clickEditAmount(exceptionAmount);
		amount = exceptionAmount;

	}

	@Then("^User Can verify the Edited Amount for the Total Exception Amount in the Grid\\.$")
	public void user_Can_verify_the_Edited_Amount_for_the_Total_Exception_Amount_in_the_Grid() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// EY_FW_Utility.doWait(5000); // verification , more time as of
		// processing
		exceptiontheme.verifyamount(amount);
	}

	@When("^User leaves the Exception Amount to blank\\.$")
	public void user_leaves_the_Exception_Amount_to_blank() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.clickEditAmount("");
	}

	@Then("^User Can verify the Error Message \"([^\"]*)\" in the Current Window\\.$")
	public void user_Can_verify_the_Error_Message_in_the_Current_Window(String message) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// EY_FW_Utility.doWait(3000); // verification
		exceptiontheme.verifyAmountFieldRequiredMessage();
	}

	@Given("^User is already on Exception Review Page\\.$")
	public void user_is_already_on_Exception_Review_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		user_Selects_Exception_Review_Submenu_from_Invoice_Mainmenu();
	}

	@Then("^User Can verify the Error Message as \"([^\"]*)\" in the Current Window\\.$")
	public void user_Can_verify_the_Error_Message_as_in_the_Current_Window(String message) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.verifyErrorMessage();

	}

	@Given("^User clicks on Filter Button\\.$")
	public void user_clicks_on_Filter_Button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// EY_FW_Utility.doWait(3000); // unrecognized exception
		exceptiontheme.clickFilter();
	}

	@Given("^User enters car intial \"([^\"]*)\" car number from and to as \"([^\"]*)\" and \"([^\"]*)\"\\.$")
	public void user_enters_car_intial_car_number_from_and_to_as_and(String carInitial, String fromCarNo, String toCarNo)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.enterDetails(carInitial, fromCarNo, toCarNo);
	}

	@Given("^User Selects Remove Exception under the Action Column Repair for the Car \"([^\"]*)\"\\.$")
	public void user_Selects_Remove_Exception_under_the_Action_Column_Repair_for_the_Car(String car) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.clickRemoveException(car);
		exceptiontheme.confirmRemoveRepair();
	}

	@Then("^User verify No Exception Amount Available for Car Number \"([^\"]*)\"\\.$")
	public void user_verify_No_Exception_Amount_Available_for_Car_Number(String carNumber) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.isRemoved();

	}

	@Then("^User verify Exception Amount, Audit reduces for the Invoice Number \"([^\"]*)\";$")
	public void user_verify_Exception_Amount_Audit_reduces_for_the_Invoice_Number(String carNumber) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		EY_FW_Utility.doWait(4000);

	}

	@When("^User Selects Audit for Car Number \"([^\"]*)\"\\.$")
	public void user_Selects_Audit_for_Car_Number(String carNo) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.selectAudit();

	}

	@Then("^User Can Verify Message \"([^\"]*)\" in Audit Result Window\\.$")
	public void user_Can_Verify_Message_in_Audit_Result_Window(String carNo) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		EY_FW_Utility.doWait(3000);
		exceptiontheme.checkMessage(carNo);
		EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.close).click();
		EY_FW_Utility.doWait(3000);

	}

	@Given("^User Selects a row having Invoice Number \"([^\"]*)\"\\.$")
	public void user_Selects_a_row_having_Invoice_Number(String invNumber) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.selectRow(invNumber);
	}

	@When("^User Selects the Generate Exception Letter\\.$")
	public void user_Selects_the_Generate_Exception_Letter() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.clickGenerateLetterButton();
		// EY_FW_Utility.doWait(10000);

	}

	@When("^User Enters Exception Letter \"([^\"]*)\"$")
	public void user_Enters_Exception_Letter(String exceptionLetter) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		exceptiontheme.enterLetterNumber(exceptionLetter);
		// EY_FW_Utility.doWait(2000);
		exceptiontheme.clicksave();
	}

	@When("^User selects Exception Contact as \"([^\"]*)\"\\.$")
	public void user_selects_Exception_Contact_as(String exceptionContact) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.selectExceptionContact(exceptionContact);
	}

	@When("^User Clicks Download under Action Column\\.$")
	public void user_Clicks_Download_under_Action_Column() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^User Can Verify Exception Letter Generated Sucessfully in the Current Window\\.$")
	public void user_Can_Verify_Exception_Letter_Generated_Sucessfully_in_the_Current_Window() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^User Can Verify Error Message \"([^\"]*)\" in the Current Window\\.$")
	public void user_Can_Verify_Error_Message_in_the_Current_Window(String errorMessage) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.verifyGenrateExceptionLetter(errorMessage);
	}

	@When("^User Selects Exception Tracking Submenu from Invoice Mainmenu\\.$")
	public void user_Selects_Exception_Tracking_Submenu_from_Invoice_Mainmenu() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		exceptiontheme.clickInvoices();

		exceptiontheme.SelectExceptions();
		// EY_FW_Utility.doWait(2000);

		// EY_FW_Utility.doWait(2000);
		exceptiontheme.selectExceptionTracking();
		// EY_FW_Utility.doWait(10000);
		// EY_FW_Utility.waitTillPageLoad(10);
	}

	@Then("^User is on Exception Tracking Page\\.$")
	public void user_is_on_Exception_Tracking_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// EY_FW_Utility.waitTillPageLoad(10);
		exceptiontheme.verifyExceptionTrackingPageTitle();
	}

	@Given("^User enters Invoice Number \"([^\"]*)\" and Status as \"([^\"]*)\"\\.$")
	public void user_selects_Invoice_Number_with_Status_as(String invNo, String status) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.enterInvoice(invNo);
		exceptiontheme.selectStatus(status);
		exceptiontheme.clickSaveButton();
		EY_FW_Utility.doWait(6000);// for refreshment
		exceptiontheme.clickCheckbox();
	}

	@When("^User selects Enter Response under Action Column\\.$")
	public void user_selects_Enter_Response_under_Action_Column() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.clickAction("Enter Response");
		// EY_FW_Utility.doWait(4000);
		// EY_FW_Utility.waitTillPageLoad(4);
	}

	@When("^User Enters the Response \"([^\"]*)\"\\.$")
	public void user_Enters_the_Response(String response) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		exceptiontheme.enterResponse(response);
	}
	
	@Then("^User enters cba number as \"([^\"]*)\"$")
	public void user_enters_cba_number_as(String cbaNo){
		exceptiontheme.enterCBA(cbaNo);
	}

	@When("^Clicks on Save\\.$")
	public void clicks_on_Save() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.saveResponse();
		// EY_FW_Utility.doWait(5000);
	}

	@Then("^User Can verify Invoice Number \"([^\"]*)\" with Status as \"([^\"]*)\"\\.$")
	public void user_Can_verify_Invoice_Number_with_Status_as(String invNumber, String status) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// EY_FW_Utility.doWait(2000);
		exceptiontheme.verifyResponse(status);
	}

	@When("^User clicks on Generate Exception Tracer\\.$")
	public void user_clicks_on_Generate_Exception_Tracer() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.clickExceptionTracker();
		// EY_FW_Utility.doWait(3000);
	}

	@When("^User clicks on Ok\\.$")
	public void user_clicks_on_Ok() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.confirm();
		// EY_FW_Utility.doWait(3000); // loading else other ele's receive click
	}

	@When("^User can see Report Download Window\\.$")
	public void user_can_see_Report_Download_Window() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^User Clicks Download Under Action Column in the Grid\\.$")
	public void user_Clicks_Download_Under_Action_Column_in_the_Grid() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^User Can verify Exception Tracer Downloaded Sucessfully in the Current Window\\.$")
	public void user_Can_verify_Exception_Tracer_Downloaded_Sucessfully_in_the_Current_Window() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^User Clicks on Finalize$")
	public void user_Clicks_on_Finalize() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.clickFinalizeButton();
		// EY_FW_Utility.doWait(3000);

	}

	@When("^User Clicks on Delete$")
	public void user_Clicks_on_Delete() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.clickDeleteButton();
		// exceptiontheme.verifyemptytable();
	}

	@Then("^User Can not See the Invoice deleted in the Grid\\.$")
	public void user_Can_not_See_the_Invoice_deleted_in_the_Grid() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// exceptiontheme.verifydelete();
		// EY_FW_Utility.doWait(3000); //verification
		exceptiontheme.verifyEmptyTable();

	}

	@Then("^User can verify Error Message as \"([^\"]*)\"$")
	public void user_can_verify_Error_Message_as(String errorMessage) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.verifyDeleteError(errorMessage);
		// EY_FW_Utility.doWait(2000);
		exceptiontheme.clickCloseButton();
	}

	@When("^User selects Unfinalizeunder Action Column\\.$")
	public void user_selects_Unfinalizeunder_Action_Column() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.clickAction("Unfinalize");
	}

	@When("^User Selects Response as \"([^\"]*)\"$")
	public void user_Selects_Response_as(String response) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.selectResponse(response);
	}

	@Then("^User cannot see the Invoice number \"([^\"]*)\" details in the Grid\\.$")
	public void user_cannot_see_the_Invoice_number_details_in_the_Grid(String invNumber) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		exceptiontheme.verifyEmptyTable();

	}

}