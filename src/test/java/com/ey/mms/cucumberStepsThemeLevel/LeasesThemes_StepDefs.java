package com.ey.mms.cucumberStepsThemeLevel;

import org.sikuli.script.FindFailed;

import com.ey.mms.pageobjects.mmsLocators.MMS_MaintResGroupsPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.serenitystepsThemelevel.MMS_LeaseTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_SystemTheme_SerenitySteps;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.PropertyReader;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LeasesThemes_StepDefs {
	String groupname, desc, filtername;
	@Steps
	MMS_SystemTheme_SerenitySteps systemtheme;

	@Steps
	MMS_LeaseTheme_SerenitySteps leasetheme;

	@Before("@MAINTENANCERESPONSIBILITYGROUPS")
	public void beforeScenario() {
		System.out.println("Inside before");
		//String path1 = System.getProperty("user.dir") + "\\target\\logs\\";
		String loggerfilename = new PropertyReader().readProperty("logger");
		String path2 = EY_FW_Utility.getConfigProperty(loggerfilename, "logfile2");
		System.setProperty("logfile.name",path2 + ".html");
		//System.out.println("value is     "+System.getProperty("logfile.name"));
	}

	@When("^User selects Leases and clicks maintenance responsibility groups$")
	public void user_selects_Leases_and_clicks_maintenance_responsibility_groups() throws Throwable {
		systemtheme.selectSystem("Leases");
		systemtheme.selectLeasesublist("Maintenance Responsibility Groups");
		// EY_FW_Utility.doWait(5000);
	}

	@Then("^User is on maintenance responsibility groups page$")
	public void user_is_on_maintenance_responsibility_groups_page() throws Throwable {
		// EY_FW_Utility.doWait(3000);
		leasetheme.verifyMaintenanceResponsibilityGroupPageTitle();
	}

	@Then("^User is on edit group page$")
	public void user_is_on_edit_group_page() throws Throwable {
		leasetheme.verifyEditGroupPageTitle();
	}

	@Given("^User has clicked Add Groups button$")
	public void user_has_clicked_Add_Groups_button() throws Throwable {
		leasetheme.clickAddGroup();
		// EY_FW_Utility.doWait(5000);
	}

	@Given("^User is on the Add Group Page$")
	public void user_is_on_the_Add_Group_Page() throws Throwable {
		// EY_FW_Utility.doWait(5000);
		leasetheme.verifyAddGroupPageTitle();
	}

	@Given("^And User has entered name as \"([^\"]*)\"$")
	public void and_User_has_entered_name_as(String name) throws Throwable {
		leasetheme.enterName(name);
		groupname = name;
	}

	@Given("^User has entered description as \"([^\"]*)\"$")
	public void user_has_entered_description_as(String description) throws Throwable {
		leasetheme.enterDesc(description);
		desc = description;
	}

	@Given("^User has entered Job Code as \"([^\"]*)\"$")
	public void user_has_entered_Job_Code_as(String jobCode) throws Throwable {
		leasetheme.selectJobcode(jobCode);
		// EY_FW_Utility.doWait(2000);
	}

	@Given("^User has entered Job Code text as \"([^\"]*)\"$")
	public void user_has_entered_Job_Code_text_as(String jobCodeText) throws Throwable {
		leasetheme.enterJobCodeText(jobCodeText);
	}

	@Given("^User has entered Qualifier Codes as \"([^\"]*)\"$")
	public void user_has_entered_Qualifier_Codes_as(String qualifierCode) throws Throwable {
		leasetheme.selectQC(qualifierCode);
		// EY_FW_Utility.doWait(2000);
	}

	@Given("^User has entered Qualifier Codes text as \"([^\"]*)\"$")
	public void user_has_entered_Qualifier_Codes_text_as(String qualifierCodeText) throws Throwable {
		leasetheme.enterQCText(qualifierCodeText);
	}

	@Given("^User has entered why made code as \"([^\"]*)\"$")
	public void user_has_entered_why_made_code_as(String whyMadeCode) throws Throwable {
		leasetheme.selectWMC(whyMadeCode);
		// EY_FW_Utility.doWait(2000);
	}

	@Given("^User has entered why made code text as \"([^\"]*)\"$")
	public void user_has_entered_why_made_code_text_as(String whyMadeCodeText) throws Throwable {
		leasetheme.enterWMCText(whyMadeCodeText);
	}

	@When("^User clicks on the Cancel button$")
	public void user_clicks_on_the_Cancel_button() throws Throwable {
		leasetheme.clickCancelGroup();
		// EY_FW_Utility.doWait(5000);
	}

	@Then("^does not see the newly added Group in the Grid$")
	public void does_not_see_the_newly_added_Group_in_the_Grid() throws Throwable {
		EY_FW_Utility.verifyTableColumnDoesntContains(MMS_MyCompanyInfoPageLocator.contacttable, 1, groupname);
		// EY_FW_Utility.verifyTableColumnDoesntContains(MMS_Locators.contacttable,
		// 2, desc);
	}

	@When("^User clicks on the save group button$")
	public void user_clicks_on_the_save_group_button() throws Throwable {
		leasetheme.clickSaveGroup();
		// EY_FW_Utility.doWait(5000);
	}

	@Then("^User gets an Red error message box against the Name field indicating its a mandatory field$")
	public void user_gets_an_Red_error_message_box_against_the_Name_field_indicating_its_a_mandatory_field()
			throws Throwable {
		leasetheme.verifyLightRedColor(MMS_MaintResGroupsPageLocator.AddGroup_Name);
	}

	@Then("^User gets an Red error message stating \"([^\"]*)\"$")
	public void user_gets_an_Red_error_message_stating(String message) throws Throwable {
		// EY_FW_Utility.doWait(3000);
		leasetheme.verifyErrorMessage(message);
		leasetheme.verifyColor(MMS_MaintResGroupsPageLocator.Error_Message);
	}

	@When("^user clicks on add new line$")
	public void user_clicks_on_add_new_line() throws Throwable {
		leasetheme.clickAddline();
		// EY_FW_Utility.doWait(2000);
	}

	@Then("^a line item with fields Job Codes,Qualifier Codes and Why Made Codes gets added in the Repair Criteria$")
	public void a_line_item_with_fields_Job_Codes_Qualifier_Codes_and_Why_Made_Codes_gets_added_in_the_Repair_Criteria()
			throws Throwable {
		leasetheme.checkLinescount();
	}

	@When("^user clicks on delte icon$")
	public void user_clicks_on_delte_icon() throws Throwable {
		leasetheme.clickDeleteIcon();
		// EY_FW_Utility.doWait(2000);
	}

	@Then("^the Line Item gets deleted from the Repair Criteria$")
	public void the_Line_Item_gets_deleted_from_the_Repair_Criteria() throws Throwable {
		leasetheme.checkLinescount();
	}

	@Then("^User can see the newly added Group in the Grid$")
	public void user_can_see_the_newly_added_Group_in_the_Grid() throws Throwable {
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 1, groupname);
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 2, desc);
	}

	@Then("^user gets error message as \"([^\"]*)\"$")
	public void user_gets_error_message_as(String message) throws Throwable {
		// EY_FW_Utility.doWait(2000);
		leasetheme.verifyErrorMessage(message);
	}

	@Given("^User clicks on Filter button$")
	public void user_clicks_on_Filter_button() throws Throwable {
		leasetheme.clickFilter();
		// EY_FW_Utility.doWait(5000);
	}

	@Given("^Selects enabled as \"([^\"]*)\"$")
	public void selects_enabled_as(String enabled) throws Throwable {
		leasetheme.selectEnabled(enabled);
	}

	@Given("^enters name as \"([^\"]*)\"$")
	public void enters_name_as(String name) throws Throwable {
		leasetheme.enterFilterGroupName(name);
		filtername = name;
	}

	@Given("^clicks on save button of filter$")
	public void clicks_on_save_button_of_filter() throws Throwable {
		leasetheme.clickSave();
		// EY_FW_Utility.doWait(3000); // for refreshment
	}

	@Then("^user can see the row$")
	public void user_can_see_the_row() throws Throwable {
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 1, filtername);
		// EY_FW_Utility.doWait(3000);
	}

	@When("^User clicks on arrow button of \"([^\"]*)\" record$")
	public void user_clicks_on_arrow_button_of_record(String record) throws Throwable {
		leasetheme.clickActions(record);
		// EY_FW_Utility.doWait(2000);
	}

	@When("^User clicks on \"([^\"]*)\" from action list$")
	public void user_clicks_on_from_action_list(String actionList) throws Throwable {
		leasetheme.clickActionList(actionList);
		// EY_FW_Utility.doWait(3000);
		// EY_FW_Utility.waitTillPageLoad(3);
	}

	@When("^User clicks on cancel of poup$")
	public void user_clicks_on_cancel_of_poup() throws Throwable {
		leasetheme.cancelPopup();
		// EY_FW_Utility.doWait(3000);
	}

	@When("^User clicks on save of poup$")
	public void user_clicks_on_save_of_poup() throws Throwable {
		leasetheme.confirmPopup();
		// EY_FW_Utility.doWait(3000);
	}

	@Then("^enabled column shows \"([^\"]*)\" for \"([^\"]*)\" record$")
	public void enabled_column_shows_for_record(String status, String record) throws Throwable {
		// EY_FW_Utility.doWait(2000);
		leasetheme.verifyEnabledText(status, record);
	}

	@Given("the user enter the username '(.*)'")
	public void user_is_logged_in_with_username_kcsadmin(String username) {
		leasetheme.opensMMSLoginPage();
		// mmsconfigtheme.opensMMSLoginPage();
		leasetheme.enterUserId(username);

	}

	@And("User enters password '(.*)'")
	public void enters_password_admin(String password) throws Throwable {
		leasetheme.enterPassword(password);

	}

	@And("User Clicks on Login Button")
	public void clcik_login_button() throws Throwable {
		leasetheme.clickLoginButton();

	}

	@When("User clicks Lease Assignment Submenu from Configuration Mainmenu")
	public void user_Selects_Exception_Review_Submenu_from_Invoice_Mainmenu() throws Throwable {
		leasetheme.clickConfigurationMainMenu();
		leasetheme.leasesSubMenu();
		leasetheme.leasesAssignmentSubMenu("Lease Assignment");
	}

	@Then("navigates to Lease Assignement Page")
	public void user_lands_to_Exception_Review_Invoice_List_Page() throws Throwable {
		EY_FW_Utility.waitTillPageLoad(6);
		leasetheme.getPageTitle();

	}

	@Given("the user is already on Lease Assignment Page")
	public void user_already_LeaseAssignment_Page() {
		// already on lease Assignment Page
	}

	@When("user clicks on Upload CSV")
	public void click__on_upload_CSV() {
		leasetheme.uploadCsv();

	}

	@Then("user will navigate to Upload Lease assignment page")
	public void user_lands_to_Upload_Lease_Assignment_Page() {
		EY_FW_Utility.waitTillPageLoad(6);
		leasetheme.getPageTitle();
	}

	@Given("user is already in Lease Assignment Page")
	public void user_reached_to_Lease_Assignment_Page() {
		// already on Lease Assignment page
	}

	@When("User clicks on Upload File")
	public void user_clicks_Upload_File() throws FindFailed, InterruptedException {
		leasetheme.uploadFile();
	}

	@And("browse the file \"(.*)\"")
	public void browse_file(String file) throws InterruptedException {
		
		leasetheme.browseFile(file);
		// EY_FW_Utility.doWait(20000); // depends on service response

	}
	/*
	 * @Then("User will see a progress bar") public void user_can_progress_bar()
	 * { leasetheme.uploadProgressBar(); }
	 */

	@And("In the grid user will notice Pending in grey, for that file")
	public void user_will_notice_pending_in_grey() {
		leasetheme.verify_Upload_Status("PENDING");
		/*
		 * try {
		 * 
		 * // leasetheme.uploadStatus(); MatcherAssert.assertThat("PENDING",
		 * equalTo(leasetheme.uploadStatus())); } catch (Exception e) {
		 * Assert.assertTrue(false, e.getMessage()); }
		 */
	}

	@And("In the grid user will notice complete in green, for that file")
	public void user_will_notice_complete_in_green() {
		leasetheme.verify_Upload_Status("COMPLETE");
		/*
		 * try { MatcherAssert.assertThat("COMPLETE",
		 * equalTo(leasetheme.uploadStatus()));
		 * 
		 * } catch (Exception e) { Assert.assertTrue(false, e.getMessage()); }
		 */
	}

	@And("In the grid user will notice error in red, for that file")
	public void user_will_notice_error_in_green() {
		leasetheme.verify_Upload_Status("ERROR");
		/*
		 * try { MatcherAssert.assertThat("ERROR",
		 * equalTo(leasetheme.uploadStatus()));
		 * 
		 * } catch (Exception e) { Assert.assertTrue(false, e.getMessage()); }
		 */
	}

	@Given("user reached to Lease Assignment Page")
	public void user_is_on_Lease_Assignment_page() {
		leasetheme.clickConfigurationMainMenu();
		leasetheme.leasesSubMenu();
		leasetheme.leasesAssignmentSubMenu("Lease Assignment");
	}

	@When("User clicks on Filter")
	public void user_clicks_on_Filter() {
		leasetheme.Filter();

	}

	@And("User Enters Car Initial '(.*)'")
	public void user_enters_car_Initial(String Initial) {
		leasetheme.carInitial(Initial);
	}

	@And("Car Number range from '(.*)' to '(.*)'")
	public void user_enters_car_Number(String from, String to) {
		leasetheme.carNumber(from);
		leasetheme.carTo(to);
		leasetheme.filterSave();

	}

	@Then("User will get the cars on the grid as per the data loaded")
	public void user_get_Car_in_Grid() {
		leasetheme.carLoaded();
	}

	@Given("User is viewing Lease Assignment page")
	public void user_is_viewing_Lease_Assignment_Page() {
		leasetheme.clickConfigurationMainMenu();
		leasetheme.leasesSubMenu();
		leasetheme.leasesAssignmentSubMenu("Lease Assignment");

	}

	@When("User selects the row with an end date")
	public void user_selects_row_with_end_Date() {
		leasetheme.selectCarCheckBox();

	}

	@And("Clicks on Un-Assign")
	public void click_on_un_Assign() {
		leasetheme.unAssign();

	}

	@And("Enters the End date '(.*)'")
	public void enters_the_End_date(String date) throws Throwable {
		leasetheme.unAssignDate(date);

	}

	@And("Clicks on Save unassign")
	public void clicks_on_save_unassign() throws Throwable {
		leasetheme.unAssignSave();
		// EY_FW_Utility.doWait(50000);

	}

	@Then("User will get an error stating the end date is already set")
	public void user_get_error() {

		leasetheme.unAssignError();

	}

	@Given("User lands to Lease Assignment page")
	public void user_lands_to_Lease_Assignment_page() {
		leasetheme.unAssignCancel();
		//leasetheme.leaseCloseCarInitial();
		//leasetheme.leasesCloseCarNumber();
		//EY_FW_Utility.doWait(3000);
		leasetheme.clickConfigurationMainMenu();
		leasetheme.leasesSubMenu();
		leasetheme.leasesAssignmentSubMenu("Lease Assignment");

	}

	@When("User selects the successfull row")
	public void user_selects_sucessfull_row() {
		leasetheme.selectCarCheckBox();
		leasetheme.uploadCsv();
	}

	@And("Clicks on View log under Actions column")
	public void click_view_log_under_Action_column() throws Throwable {
		leasetheme.clickAction();
		leasetheme.viewLog();
	}

	@Then("User will land to the process log with a grid")
	public void user_land_process_log() {
		leasetheme.getPageTitle();
	}

	@And("Grid will have 3 rows stating File received, Started Process and Finished Process")
	public void verify_rows() {
		leasetheme.getTableText();
	}

	@Given("^User has clicked on Configuration tab and Leases has appeared on the menu list\\.$")
	public void user_has_clicked_on_Configuration_tab_and_Leases_has_appeared_on_the_menu_list() throws Throwable {
		leasetheme.clickConfigurationMainMenu();

	}

	@When("^User clicks on the Leases and Selects View Leases\\.$")
	public void user_clicks_on_the_Leases_and_Selects_View_Leases() throws Throwable {
		leasetheme.leasesSubMenu();
		leasetheme.leasesViewLeaseSubMenu();
	}

	@Then("^User will navigate to the View Leases page\\.$")
	public void user_will_navigate_to_the_View_Leases_page() throws Throwable {
		//EY_FW_Utility.waitTillPageLoad(3);
		leasetheme.verifyViewLeasePageTitle();
	}

	@Given("^User is on the View leases page\\.$")
	public void user_is_on_the_View_leases_page() throws Throwable {

	}

	@When("^User clicks on Add Lease button\\.$")
	public void user_clicks_on_Add_Lease_button() throws Throwable {
		leasetheme.leaseViewLeasesAddLeases();
		// EY_FW_Utility.doWait(2000);
	}

	@Then("^User will land to Add Lease page\\.$")
	public void user_will_land_to_Add_Lease_page() throws Throwable {
		//EY_FW_Utility.waitTillPageLoad(3);
		leasetheme.leaseVerifyViewLeaseAddLeasePageTitle();
	}

	@Given("^User is on the Add Lease page\\.$")
	public void user_is_on_the_Add_Lease_page() throws Throwable {

	}

	@When("User selects Lease Type as Full and Lease Relationship as I am leasing these cars to someone.")
	public void user_selects_Lease_Type_as_Full_and_Lease_Relationship_as_I_am_leasing_these_cars_to_someone()
			throws Throwable {
		leasetheme.leaseViewLeaseselectRelationship();
		leasetheme.leaseViewLeaseSelectType();

	}

	@Then("^User will see a new section added below Lease parameters as Lease information\\.$")
	public void user_will_see_a_new_section_added_below_Lease_parameters_as_Lease_information() throws Throwable {
		leasetheme.verifyLeaseInformation();

	}

	@When("User clicks upload leases Submenu from Configuration Mainmenu")
	public void user_clicks_upload_leases_submenu_from_configuration_main_menu() throws Throwable {
		leasetheme.clickConfigurationMainMenu();
		leasetheme.leasesSubMenu();
		leasetheme.leasesAssignmentSubMenu("Upload Leases");
		// EY_FW_Utility.doWait(3000);
	}

	@Then("User is on Upload Leases Page")
	public void user_is_on_upload_lease_page() throws Throwable {
		// EY_FW_Utility.waitTillPageLoad(3);
		leasetheme.verifyUploadLeasePageTitle();
	}
	
	@Given("^selects \"([^\"]*)\" from action list$")
	public void selects_from_action_list(String actionList) throws Throwable {
		leasetheme.clickActionlist1(actionList);
		// EY_FW_Utility.doWait(4000);
	}

	@Given("User is already on Upload Leases Page")
	public void user_is_already_on_upload_lease_page() throws Throwable {
		leasetheme.clickConfigurationMainMenu();
		leasetheme.leasesSubMenu();
		leasetheme.leasesAssignmentSubMenu("Upload Leases");
		// EY_FW_Utility.doWait(3000);
		// EY_FW_Utility.waitTillPageLoad(3);
		leasetheme.verifyUploadLeasePageTitle();
	}
	
	@Then("^clicks on refresh lease$")
	public void clicks_on_refresh_lease(){
		leasetheme.clickRefreshLease();
	}

	@Then("User will see a progress bar as \"(.*)\"$")
	public void user_will_see_a_progress_bar_as(String progress) {
		leasetheme.uploadProgressBar(progress);
	}

	@Given("^user clicks on Action arrow$")
	public void user_clicks_on_Action_arrow() throws Throwable {
		leasetheme.clickActionsUploadLease();
	}

	@Given("^selects \"([^\"]*)\" from list$")
	public void selects_from_list(String actionList) throws Throwable {
		leasetheme.clickActionlist(actionList);
		// EY_FW_Utility.doWait(4000);
	}
	
	@Given("^User has uploaded a Dx File$")
	public void user_has_uploaded_a_dx_file(){
		//EY_FW_Utility.doWait(5000);
		leasetheme.verify_Upload_Status("COMPLETE");
	}
	
	@Then("^User lands on to the \"([^\"]*)\" page$")
	public void user_lands_on_to_the_page(String pageTitle) throws Throwable {
		leasetheme.verifyHeading(pageTitle);
		EY_FW_Utility.doWait(5000);
	}
	
	@Given("^User clicks on the Arrow button in Actions column for \"([^\"]*)\"$")
	public void click_on_arrow(String rowName){
		leasetheme.clickAction(rowName);
	}
	@Then("^User is on \"([^\"]*)\" page$")
	public void user_is_on_page(String pageTitle) throws Throwable {
		leasetheme.verify_User_Page(pageTitle);
		/*
		 * try { EY_FW_Utility.waitTillPageLoad(5);
		 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
		 * containsString(arg1)); } catch (Exception e) {
		 * Assert.assertTrue(false, e.getMessage()); }
		 */
	}

	@Then("^level will be shown as \"([^\"]*)\"$")
	public void level_will_be_shown_as(String level) throws Throwable {
		leasetheme.show_Level(level);
		/*
		 * try {
		 * EY_FW_Utility.verifyTableColumnContains(MMS_MyCompanyInfoPageLocator.
		 * contacttable, 1, arg1); } catch (Exception e) {
		 * Assert.assertTrue(false, e.getMessage()); }
		 */

	}

	@Then("^message will be shown as \"([^\"]*)\"$")
	public void message_will_be_shown_as(String message) throws Throwable {
		EY_FW_Utility.doWait(5000);
		leasetheme.verify_Message(message);
		/*
		 * try {
		 * EY_FW_Utility.verifyTableColumnContains(MMS_MyCompanyInfoPageLocator.
		 * contacttable, 5, arg1); } catch (Exception e) {
		 * Assert.assertTrue(false, e.getMessage()); }
		 */
	}

}
