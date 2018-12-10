/**
 * @Copyright Copyright (C) 2016 General Electric Company. All rights reserved.
 * @author  Ankur Chaudhry
 * @version 1.0
 * @since   2016-07-12
 * @description MMS Given,When,Then Statements Class for Configuration Theme
 */

package com.ey.mms.cucumberStepsThemeLevel;

import static org.hamcrest.CoreMatchers.equalTo;

import javax.swing.SortingFocusTraversalPolicy;

import org.hamcrest.MatcherAssert;
import org.jruby.RubyProcess.Sys;
import org.testng.Assert;

import com.ey.mms.serenitystepsThemelevel.MMS_FleetTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_LeaseTheme_SerenitySteps;
import com.ey.mms.util.EY_FW_Utility;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class FleetThemes_StepDefs {

	@Steps
	MMS_FleetTheme_SerenitySteps mmsfleettheme;

	@Steps
	MMS_LeaseTheme_SerenitySteps leasetheme;

	@Given("User is logged in as '(.*)' and '(.*)' as password.")
	public void user_is_logged_in_as_and_as_password(String username, String password) throws Throwable {
		mmsfleettheme.opensMMSLoginPage();
		mmsfleettheme.enterUserId(username);
		mmsfleettheme.enterPassword(password);
	}

	@When("User Clicks on MMS Login Button.")
	public void user_Clicks_on_MMS_Login_Button() throws Throwable {

		mmsfleettheme.clickLoginButton();
	}

	@Then("User navigates to mms home page.")
	public void user_navigates_to_mms_home_page() throws Throwable {
		mmsfleettheme.verifyHomePageTitle();
	}

	@Given("User navigate through configuration.")
	public void user_navigate_through_configuration() throws Throwable {
		mmsfleettheme.clickConfigurationLink();
	}

	@When("User selects fleets and clicks fleets list.")
	public void user_selects_fleets_and_clicks_fleets_list() throws Throwable {
		mmsfleettheme.moveToFleetsSubmenuItem();
		mmsfleettheme.clickFleets_FleetListSubmenu("Fleet List");
	}

	@Then("User navigates to fleets list page.")
	public void user_navigates_to_fleets_list_page() throws Throwable {
		mmsfleettheme.verifyFleetListPageTitle();
	}

	@Given("User clicks on filter button.")
	public void user_clicks_on_filter_button() throws Throwable {
		mmsfleettheme.clickFleetFilterButton();
	}

	@When("User enters car initial '(.*)' and click on save.")
	public void user_enters_car_initial_and_click_on_save(String carInitial) throws Throwable {
		mmsfleettheme.enterFleetCarIntial(carInitial);
		mmsfleettheme.clickFilterSaveButton();
	}

	@Then("^filter should apply and verify results\\.$")
	public void filter_should_apply_and_verify_results() throws Throwable {
		mmsfleettheme.verifyFilterResults();
	}

	@Then("^filter should apply and verify no results\\.$")
	public void filter_should_apply_and_verify_no_results() throws Throwable {
		// EY_FW_Utility.doWait(3000); // verification
		mmsfleettheme.checkEmptyTable();
	}

	/*
	 * @Steps MMS_Fleet_Theme_SerenitySteps mmsconfigtheme;
	 */
	/*
	 * @Given("User is logges in as '(.*)' and '(.*)' as password.") public void
	 * user_is_logged_in_as_and_as_password(String username, String password)
	 * throws Throwable { mmsconfigtheme.opensMMSLoginPage();
	 * mmsconfigtheme.enterUserId(username);
	 * mmsconfigtheme.enterPassword(password); }
	 * 
	 * @When("User Click on MMS Login Button.") public void
	 * user_Clicks_on_MMS_Login_Button() throws Throwable {
	 * 
	 * mmsconfigtheme.clickLoginButton(); }
	 * 
	 * @Then("User navigate to mms home page.") public void
	 * user_navigates_to_mms_home_page() throws Throwable {
	 * mmsconfigtheme.verifyHomePage(); }
	 * 
	 * @Given("User navigates through configuration.") public void
	 * user_navigate_through_configuration() throws Throwable {
	 * mmsconfigtheme.clickConfigurationLink(); }
	 * 
	 * @When("User select fleets and clicks fleets list.") public void
	 * user_selects_fleets_and_clicks_fleets_list() throws Throwable {
	 * mmsconfigtheme.moveToFleetsSubmenuItem();
	 * mmsconfigtheme.clickFleets_FleetListSubmenu(); }
	 * 
	 * @Then("User navigate to fleets list page.") public void
	 * user_navigates_to_fleets_list_page() throws Throwable {
	 * mmsconfigtheme.verifyFleetListPageName(); }
	 * 
	 * @Given("User clicks filter button") public void
	 * user_clicks_on_filter_button() throws Throwable {
	 * mmsconfigtheme.clickFleetFilterButton(); }
	 * 
	 * @When("User enters car initial as '(.*)' and click on save") public void
	 * user_enters_car_initial_and_click_on_save(String carInitial) throws
	 * Throwable { mmsconfigtheme.enterFleetCarIntial(carInitial);
	 * mmsconfigtheme.clickFilterSaveButton(); EY_FW_Utility.doWait(3000);
	 * mmsconfigtheme.clickfleetcarInitialClose(); EY_FW_Utility.doWait(2000); }
	 */

	/*
	 * @Then("filter should apply and verify results") public void
	 * filter_should_apply_and_verify_results() throws Throwable {
	 * mmsconfigtheme.verifyFilterResults();
	 * 
	 * }
	 */

	@Given("^user is already on the Fleet page$")
	public void user_is_already_on_the_Fleet_page() throws Throwable {
		mmsfleettheme.clickFleetCarInitialClose();

		mmsfleettheme.clickConfigurationLink();
		mmsfleettheme.moveToFleetsSubmenuItem();
		mmsfleettheme.clickFleets_FleetListSubmenu("Fleet List");
	}

	@When("^User has selected a fleet with Car initial \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_has_selected_a_fleet_with_Car_initial_and(String carInitial, String carInitial2) throws Throwable {
		mmsfleettheme.clickFleetcheckbox();
	}

	@And("^User clicks on the Details under Action column$")
	public void user_clicks_on_the_Details_under_Action_column() throws Throwable {

		mmsfleettheme.clickFleetAction();
		mmsfleettheme.clickActionDetails();
		// EY_FW_Utility.doWait(4000);
		EY_FW_Utility.waitTillPageLoad(4);
	}

	@Then("user will navigate to the car details page")
	public void user_will_navigate_to_the_car_details_page_with_sections_Car_details_Umler_information_Car_history()
			throws Throwable {
		// EY_FW_Utility.waitTillPageLoad(4);
		mmsfleettheme.verifyFleetCarHistoryPageName();
		// EY_FW_Utility.doWait(2000);

	}

	@Given("User has selected a fleet with Car initial AOK and 013788")
	public void user_selected_Checkbox() {
		mmsfleettheme.clickConfigurationLink();
		mmsfleettheme.moveToFleetsSubmenuItem();
		mmsfleettheme.clickFleets_FleetListSubmenu("Fleet List");
		mmsfleettheme.fleetClickInvoiceCheckBoxDelete();
		mmsfleettheme.fleetInvoiceActionDelete();
		// EY_FW_Utility.doWait(2000);
		mmsfleettheme.fleetInvoiceActionDetailsDelete();
		// EY_FW_Utility.doWait(2000);
	}

	@Given("^user is already on the Car details page$")
	public void user_is_already_on_the_Car_details_page() throws Throwable {

	}

	@When("^User clicks on the delete under Action column of the car history$")
	public void user_clicks_on_the_delete_under_Action_column_of_the_car_history() throws Throwable {
		mmsfleettheme.clickCarHistoryAction();
		// EY_FW_Utility.doWait(2000);
		mmsfleettheme.fleetclickcarHistoryDelete();

	}

	@Then("^confirmation pop up appears$")
	public void confirmation_pop_up_appears() throws Throwable {

		mmsfleettheme.fleetInvoiceActionDeleteOk();
		// EY_FW_Utility.doWait(4000);
		// EY_FW_Utility.waitTillPageLoad(4);

	}

	@Then("^Car history grid is empty \"([^\"]*)\"$")
	public void car_history_grid_is_empty(String message) throws Throwable {
		// EY_FW_Utility.doWait(3000); // verification
		mmsfleettheme.verifyFleetFilterDeleteInvoice();
	}

	@Then("^Finally it disappears from the main fleet list grid as well$")
	public void finally_it_disappears_from_the_main_fleet_list_grid_as_well() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("^user is already on the Fleet list page$")
	public void user_is_already_on_the_Fleet_list_page() throws Throwable {
		mmsfleettheme.clickConfigurationLink();
		mmsfleettheme.moveToFleetsSubmenuItem();
		mmsfleettheme.clickFleets_FleetListSubmenu("Fleet List");
	}

	@When("^User selects few cars$")
	public void user_selects_few_cars() throws Throwable {
		mmsfleettheme.clickFleetcheckbox();
		// mmsconfigtheme.fleetclickInvoiceCheckBoxDelete();
	}

	@When("^clicks on Deactivate$")
	public void clicks_on_Deactivate() throws Throwable {
		mmsfleettheme.fleetClickDeactivate();
		// EY_FW_Utility.doWait(2000);

	}

	@When("clicks on save after providing an end date as '(.*)'")
	public void clicks_on_save_after_providing_an_end_date(String endDate) throws Throwable {
		mmsfleettheme.fleetEnterDeactivateEndDate(endDate);
		mmsfleettheme.fleetDeactivateSave();
		// EY_FW_Utility.doWait(4000);
	}

	@Then("^Error appears stating that the end date is already set$")
	public void error_appears_stating_that_the_end_date_is_already_set() throws Throwable {
		// EY_FW_Utility.doWait(3000); // verification
		mmsfleettheme.getErrorMessage();
		// EY_FW_Utility.doWait(2000);
		mmsfleettheme.fleetListDeactivateCancel();
		EY_FW_Utility.doWait(3000);
	}

	@Given("^user is on the Fleet list page$")
	public void user_is_on_the_Fleet_list_page() throws Throwable {

		mmsfleettheme.clickConfigurationLink();
		mmsfleettheme.moveToFleetsSubmenuItem();
		mmsfleettheme.clickFleets_FleetListSubmenu("Fleet List");
		EY_FW_Utility.waitTillPageLoad(3);
	}

	@Given("^has a car with no end date$")
	public void has_a_car_with_no_end_date() throws Throwable {
		mmsfleettheme.fleetClickDeactivateInvoiceNumberEndDate();
	}

	@When("^User clicks on deactivate$")
	public void user_clicks_on_deactivate() throws Throwable {
		mmsfleettheme.fleetClickDeactivate();
		// EY_FW_Utility.doWait(2000);
	}

	@When("enters the end date as '(.*)' lesser than start date")
	public void enters_the_end_date_as_lesser_than_start_date(String endDate) throws Throwable {
		mmsfleettheme.fleetEnterDeactivateEndDate(endDate);
	}

	@When("^user Click on Save$")
	public void user_Click_on_Save() throws Throwable {
		mmsfleettheme.fleetDeactivateSave();
		// EY_FW_Utility.doWait(5000);
	}

	@Then("^error message appears Car could not be deactivated$")
	public void error_message_appears_Car_could_not_be_deactivated() throws Throwable {
		// EY_FW_Utility.doWait(3000); // verification
		mmsfleettheme.verifyDeactivateNoEndDateError();
	}

	@When("^User selects fleets and clicks upload fleet\\.$")
	public void user_selects_fleets_and_clicks_upload_fleet() throws Throwable {
		// mmsfleettheme.clickConfigurationLink();
		mmsfleettheme.moveToFleetsSubmenuItem();
		mmsfleettheme.clickFleets_FleetListSubmenu("Upload Fleet");
	}

	@Then("^User navigates to upload fleets page\\.$")
	public void user_navigates_to_upload_fleets_page() throws Throwable {
		mmsfleettheme.verifyUploadFleetPageTitle();
	}

	@Given("^User is on upload fleets page$")
	public void user_is_on_upload_fleets_page() throws Throwable {
		mmsfleettheme.clickConfigurationLink();
		mmsfleettheme.moveToFleetsSubmenuItem();
		mmsfleettheme.clickFleets_FleetListSubmenu("Upload Fleet");
		mmsfleettheme.verifyUploadFleetPageTitle();
	}

	@Then("^user clicks on refresh$")
	public void user_clicks_on_refresh() {
		mmsfleettheme.clickRefresh();
		EY_FW_Utility.doWait(5000);
	}

	@Then("^status of file is changed to \"([^\"]*)\"$")
	public void status_of_file_is_changed_to(String status) {
		try {
			// leasetheme.uploadStatus();
			mmsfleettheme.clickConfigurationLink();
			mmsfleettheme.moveToFleetsSubmenuItem();
			mmsfleettheme.clickFleets_FleetListSubmenu("Upload Fleet");
			MatcherAssert.assertThat(status, equalTo(leasetheme.uploadStatus()));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
}
