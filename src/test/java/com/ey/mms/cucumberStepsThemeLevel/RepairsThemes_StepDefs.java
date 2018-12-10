package com.ey.mms.cucumberStepsThemeLevel;

import static org.hamcrest.Matchers.greaterThan;

import org.hamcrest.MatcherAssert;
import org.testng.Assert;

import com.ey.mms.pageobjects.MMS_Locators;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_RepairDetailPageLocator;
import com.ey.mms.serenitystepsThemelevel.MMS_RepairsTheme_SerenitySteps;
import com.ey.mms.util.EY_FW_Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RepairsThemes_StepDefs {

	@Steps
	MMS_RepairsTheme_SerenitySteps mmsrepairstheme;

	@When("^User Selects Repair Details Submenu from Invoice Mainmenu$")
	public void user_Selects_Repair_Details_Submenu_from_Invoice_Mainmenu() throws Throwable {
		mmsrepairstheme.clickOnInvoicesMainMenu();
		mmsrepairstheme.clickOnRepairDetailsSubMenu();
	}

	@Then("^User lands to Repair Detail Page$")
	public void user_lands_to_Repair_Detail_Page() throws Throwable {
		// EY_FW_Utility.waitTillPageLoad(3);
		mmsrepairstheme.verifyRepairDetailsPageTitle();
	}

	@Given("^User is already on Repair Detail Page$")
	public void user_is_already_on_Repair_Detail_Page() throws Throwable {
		// EY_FW_Utility.waitTillPageLoad(3);
		mmsrepairstheme.verifyRepairDetailsPageTitle();

	}

	@Given("^User clicks on filter of repair page$")
	public void user_clicks_on_Filter_of_repair_page() throws Throwable {
		mmsrepairstheme.clickOnFilterButton();

	}

	@Given("^Enters the Invoice Number \"([^\"]*)\" to \"([^\"]*)\"$")
	public void enters_the_Invoice_Number_to(String invNumStart, String invNumEnd) throws Throwable {
		mmsrepairstheme.enterStartAndEndInvoiceNumbers(invNumStart, invNumEnd);
		// EY_FW_Utility.doWait(3000);

	}

	@When("^User Clicks on Save$")
	public void user_Clicks_on_Save() throws Throwable {
		mmsrepairstheme.clickSaveButtonAfterEnteringInvoiceNumbers();
		// EY_FW_Utility.doWait(3000);
	}

	@When("^User clicks on Cars tab$")
	public void user_clicks_on_Cars_tab() throws Throwable {
		mmsrepairstheme.clickTab(MMS_RepairDetailPageLocator.CarsTab1);
		/*
		 * try {
		 * EY_FW_Utility.getAnyElementByAnyLocator(MMS_RepairDetailPageLocator.
		 * CarsTab1).click(); //EY_FW_Utility.doWait(3000); } catch (Exception
		 * e) { Assert.assertTrue(false, e.getMessage()); }
		 */
	}

	@When("^User clicks on Repairs tab$")
	public void user_clicks_on_Repairs_tab() throws Throwable {
		mmsrepairstheme.clickTab(MMS_RepairDetailPageLocator.RepairTab1);
		/*
		 * try {
		 * EY_FW_Utility.getAnyElementByAnyLocator(MMS_RepairDetailPageLocator.
		 * RepairTab1).click(); //EY_FW_Utility.doWait(3000); } catch (Exception
		 * e) { Assert.assertTrue(false, e.getMessage()); }
		 */
	}

	@When("^User clicks on Invoices tab$")
	public void user_clicks_on_Invoices_tab() throws Throwable {
		mmsrepairstheme.clickTab(MMS_RepairDetailPageLocator.InvoicesTab1);
		/*
		 * try {
		 * EY_FW_Utility.getAnyElementByAnyLocator(MMS_RepairDetailPageLocator.
		 * InvoicesTab1).click(); //EY_FW_Utility.doWait(3000); } catch
		 * (Exception e) { Assert.assertTrue(false, e.getMessage()); }
		 */
	}

	@Then("^User can view a grid below under the Repair Tab$")
	public void user_can_view_a_grid_below_under_the_Repair_Tab() throws Throwable {
		mmsrepairstheme.viewGrid(MMS_MyCompanyInfoPageLocator.contacttable);
		/*
		 * try { int size =
		 * EY_FW_Utility.getAllElementsByAnyLocator(MMS_MyCompanyInfoPageLocator
		 * .contacttable).size(); MatcherAssert.assertThat(size,
		 * greaterThan(0)); } catch (Exception e) { Assert.assertTrue(false,
		 * e.getMessage()); }
		 */
	}

	@Then("^User can view a grid below under the Cars Tab$")
	public void user_can_view_a_grid_below_under_the_Cars_Tab() throws Throwable {
		mmsrepairstheme.viewGrid(MMS_RepairDetailPageLocator.CarsTab);
		/*
		 * try { int size =
		 * EY_FW_Utility.getAllElementsByAnyLocator(MMS_RepairDetailPageLocator.
		 * CarsTab).size(); MatcherAssert.assertThat(size, greaterThan(0)); }
		 * catch (Exception e) { Assert.assertTrue(false, e.getMessage()); }
		 */
	}

	@Then("^User can view a grid below under the Invoices Tab$")
	public void user_can_view_a_grid_below_under_the_Invoices_Tab() throws Throwable {
		mmsrepairstheme.viewGrid(MMS_RepairDetailPageLocator.InvoicesTab);
		/*
		 * try { int size =
		 * EY_FW_Utility.getAllElementsByAnyLocator(MMS_RepairDetailPageLocator.
		 * InvoicesTab).size(); MatcherAssert.assertThat(size, greaterThan(0));
		 * } catch (Exception e) { Assert.assertTrue(false, e.getMessage()); }
		 */
	}

	@Then("^User can verify the the Car Initial as \"(.*)\" and Car Number as \"(.*)\"$")
	public void user_can_verify_the_the_Car_Initial_as_and_Car_Number_as(String carInitial, String carNumber) throws Throwable {

		EY_FW_Utility.verifyTableColumnContain(MMS_RepairDetailPageLocator.CarsTab, 1, carInitial);
		EY_FW_Utility.verifyTableColumnContain(MMS_RepairDetailPageLocator.CarsTab, 2, carNumber);
	}

	@Then("^User can verify the Description for the Particular Car as \"(.*)\"$")
	public void user_can_verify_the_Description_for_the_Particular_Car_as(String description) throws Throwable {
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 9, description);

	}

	@Then("^User can verify total Amount for the Invoice as \"(.*)\"$")
	public void user_can_verify_total_Amount_for_the_Invoice_as(String amount) throws Throwable {
		// EY_FW_Utility.doWait(2000); // verification
		EY_FW_Utility.verifyTableColumnContain(MMS_RepairDetailPageLocator.InvoicesTab, 11, amount);

	}

	@When("^User Click on Audit Tab in the Grid\\.$")
	public void user_Click_on_Audit_Tab_in_the_Grid() throws Throwable {
		mmsrepairstheme.clickAudit();
		// EY_FW_Utility.doWait(4000);
	}

	@Then("^User can Verify the Number of Repair as \"([^\"]*)\"$")
	public void user_can_Verify_the_Number_of_Repair_as(String number) throws Throwable {
		EY_FW_Utility.verifyTableColumnContain(MMS_RepairDetailPageLocator.Table3, 1, number);
	}

	@Then("^User Can verify the description for the Repair under Message as \"([^\"]*)\"$")
	public void user_Can_verify_the_description_for_the_Repair_under_Message_as(String message) throws Throwable {
		EY_FW_Utility.verifyTableColumnContain(MMS_RepairDetailPageLocator.Table3, 4, message);
	}

	@When("^User clicks on Audits Tab in the Grid\\.$")
	public void user_clicks_on_Audits_Tab_in_the_Grid() throws Throwable {
		mmsrepairstheme.clickCarAudit();
		// EY_FW_Utility.doWait(3000);
	}

	@Then("^User can verify Invoice number as \"(.*)\"$")
	public void user_can_verify_Inv_no_as(String invNo) {
		EY_FW_Utility.verifyTableColumnContain(MMS_RepairDetailPageLocator.InvoicesTab, 5, invNo);
	}

}
