package com.ey.mms.cucumberStepsThemeLevel;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.testng.AssertJUnit.assertEquals;

import com.ey.mms.pageobjects.MMS_ExpectedResult;
import com.ey.mms.pageobjects.MMS_Locators;
import com.ey.mms.pageobjects.mmsLocators.MMS_BillingContactsPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_ExceptionTrackingPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_UserProfilePageLocator;
import com.ey.mms.serenitystepsThemelevel.MMS_FleetTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_SystemTheme_SerenitySteps;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.EY_MMS_FW_Constants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SystemThemes_StepDefs {
	String mark, name, apno, arno, taxid, Name, title, type, UserName, newpwd;
	@Steps
	MMS_SystemTheme_SerenitySteps systemtheme;

	@Steps
	MMS_FleetTheme_SerenitySteps mmsconfigtheme;

	@When("^User selects System and clicks My Company Information\\.$")
	public void user_selects_System_and_clicks_My_Company_Information() throws Throwable {
		systemtheme.selectSystem("System");
		// EY_FW_Utility.doWait(3000);
		systemtheme.selectSystemsublist("My Company Information");
		// EY_FW_Utility.waitTillPageLoad(3);
	}

	@When("^User selects System and clicks My user profile\\.$")
	public void user_selects_System_and_clicks_My_user_profile() throws Throwable {
		systemtheme.selectSystem("System");
		systemtheme.selectSystemsublist("My User Profile");
		// EY_FW_Utility.doWait(2000);
		// EY_FW_Utility.waitTillPageLoad(3);
	}

	@Then("^User is on My User Profile Page\\.$")
	public void user_is_on_My_User_Profile_Page() throws Throwable {
		systemtheme.selectSystem("System");
		systemtheme.selectSystemsublist("My User Profile");
		// EY_FW_Utility.doWait(2000);
		// EY_FW_Utility.waitTillPageLoad(3);
		systemtheme.verifyUserProfileTitle();
	}

	@Then("^User lands to My User Profile Page\\.$")
	public void user_lands_to_My_User_Profile_Page() throws Throwable {
		systemtheme.selectSystem("System");
		systemtheme.selectSystemsublist("My User Profile");
		// EY_FW_Utility.doWait(2000);
		// EY_FW_Utility.waitTillPageLoad(2);
		systemtheme.verifyUserProfileTitle();
	}

	@Then("^User is on My Company Information Page\\.$")
	public void user_is_on_My_Company_Information_Page() throws Throwable {
		// EY_FW_Utility.waitTillPageLoad(2);
		systemtheme.verifyCompanyInfoTitle();
	}

	@Given("^User can see the Company Details displayed such as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" ,\"([^\"]*)\"$")
	public void user_can_see_the_Company_Details_displayed_such_as(String mark, String name, String apNo, String arNo,
			String taxPayerId) throws Throwable {
		systemtheme.areDetailsDisplayed();
	}

	@When("^User clicks on the edit Button$")
	public void user_clicks_on_the_edit_Button() throws Throwable {
		systemtheme.clickeditButton();
	}

	@Then("^User can see the \"([^\"]*)\" Pop Up$")
	public void user_can_see_the_Pop_Up(String popupTitle) throws Throwable {
		// systemtheme.verifyeditpopup(arg1);
	}

	@Then("^User can see the Text box for fields like \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_can_see_the_Text_box_for_fields_like(String mark, String name, String apNo, String arNo,
			String taxPayerId) throws Throwable {
		systemtheme.verifyEditPopupDetails();
		// systemtheme.clickcancelButton();
		// EY_FW_Utility.doWait(2000);
	}

	@Then("^User can see the \"([^\"]*)\" and \"([^\"]*)\" buttons$")
	public void user_can_see_the_and_buttons(String saveButton, String cancelButton) throws Throwable {
		systemtheme.verifyEditPopupButtons();
		// systemtheme.clickcancelButton();

	}

	@Then("^User clicks on the Cancel Button$")
	public void user_clicks_on_the_Cancel_Button() {
		systemtheme.clickCancelButton();

	}

	@Given("^User is on the \"([^\"]*)\" Pop Up$")
	public void user_is_on_the_Pop_Up(String popupTitle) throws Throwable {
		EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
		systemtheme.clickeditButton();
		//EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.CANCELBUTTON);
		systemtheme.verifyEditPopup(popupTitle);
	}

	@When("^User edits data in fields like mark as \"([^\"]*)\" ,name as \"([^\"]*)\",AP number as \"([^\"]*)\",AR number as \"([^\"]*)\",taxid as \"([^\"]*)\"$")
	public void user_edits_data_in_fields_like_mark_as_name_as_AP_number_as_AR_number_as_taxid_as(String markNo,
			String nameText, String apNumber, String arNumber, String taxpayerId) throws Throwable {
		mark = markNo;
		name = nameText;
		apno = apNumber;
		arno = arNumber;
		taxid = taxpayerId;
		systemtheme.editPopupDetails(markNo, nameText, apNumber, arNumber, taxpayerId);
	}

	@When("^clicks on the Cancel Button$")
	public void clicks_on_the_Cancel_Button() throws Throwable {
		systemtheme.clickCancelButton();
		// EY_FW_Utility.doWait(2000);
	}

	@Then("^cannot see the changed Details for the Company$")
	public void cannot_see_the_changed_Details_for_the_Company() throws Throwable {
		systemtheme.verifyFailDetails(mark, name, apno, arno, taxid);
	}

	@When("^clicks on the Save Button$")
	public void clicks_on_the_Save_Button() throws Throwable {
		systemtheme.clickSaveButton();
		// EY_FW_Utility.doWait(6000);
	}

	@Then("^User can see the newly edited Company Information in the Company section$")
	public void user_can_see_the_newly_edited_Company_Information_in_the_Company_section() throws Throwable {
		systemtheme.verifyTrueDetails(mark, name, apno, arno, taxid);
	}

	@When("^User clicks on the Add Contact button$")
	public void user_clicks_on_the_Add_Contact_button() throws Throwable {
		systemtheme.clickAddContactButton();
		// EY_FW_Utility.doWait(3000);
	}

	@Given("^User is on Add Company Contact Pop Up$")
	public void user_is_on_Add_Company_Contact_Pop_Up() throws Throwable {
		systemtheme.clickAddContactButton();
		// EY_FW_Utility.doWait(3000);
	}

	@When("^User enters details in the fields like \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enters_details_in_the_fields_like(String contactName, String titleText, String phone, String fax, String email,
			String visibleText, String visibleType, String address, String city, String state, String zipcode) throws Throwable {

		Name = contactName;
		title = titleText;
		type = visibleType;
		systemtheme.addContactDetails(contactName, titleText, phone, fax, email, visibleText, visibleType, address, city, state, zipcode);
		// EY_FW_Utility.doWait(4000);

	}

	@Then("^can see the contacts in the Contacts Grid$")
	public void can_see_the_contacts_in_the_Contacts_Grid() throws Throwable {
		EY_FW_Utility.doWait(3000);
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 1, Name);
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 2, title);
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 3, type);
	}

	@Then("^can see the contacts in the Contacts sub Grid$")
	public void can_see_the_contacts_in_the_Contacts_sub_Grid() throws Throwable {
		EY_FW_Utility.doWait(2000);
		EY_FW_Utility.verifyTableColumnContain(MMS_BillingContactsPageLocator.Contact_subtable, 1, Name);
		EY_FW_Utility.verifyTableColumnContain(MMS_BillingContactsPageLocator.Contact_subtable, 2, title);
		EY_FW_Utility.verifyTableColumnContain(MMS_BillingContactsPageLocator.Contact_subtable, 3, type);
	}

	@Then("^cannot see the contacts in the Contacts Grid$")
	public void cannot_see_the_contacts_in_the_Contacts_Grid() throws Throwable {
		// EY_FW_Utility.doWait(2000);
		EY_FW_Utility.verifyTableColumnDoesntContains(MMS_MyCompanyInfoPageLocator.contacttable, 1, Name);
		// EY_FW_Utility.verifyTableColumnDoesntContains(MMS_Locators.contacttable,
		// 2, title);
		// EY_FW_Utility.verifyTableColumnDoesntContains(MMS_Locators.contacttable,
		// 3, type);
	}

	@Then("^cannot see the contacts in the Contacts sub Grid$")
	public void cannot_see_the_contacts_in_the_Contacts_sub_Grid() throws Throwable {
		// EY_FW_Utility.doWait(2000);
		EY_FW_Utility.verifyTableColumnDoesntContains(MMS_BillingContactsPageLocator.Contact_subtable, 1, Name);
		// EY_FW_Utility.verifyTableColumnDoesntContains(MMS_Locators.contacttable,
		// 2, title);
		// EY_FW_Utility.verifyTableColumnDoesntContains(MMS_Locators.contacttable,
		// 3, type);
	}

	@When("^User clicks on the Actions column for a Contact$")
	public void user_clicks_on_the_Actions_column_for_a_Contact() throws Throwable {
		// systemtheme.clickActions(null);
	}

	@When("^User clicks on the Actions column for a Contact \"([^\"]*)\"$")
	public void user_clicks_on_the_Actions_column_for_a_Contact(String contact) throws Throwable {
		EY_FW_Utility.mms_SelectNumberofEntries(50);
		// EY_FW_Utility.doWait(3000);
		systemtheme.clickActions(contact);

	}

	@When("^clicks on the \"([^\"]*)\" or \"([^\"]*)\" button$")
	public void clicks_on_the_or_button(String saveButton, String cancelButton) throws Throwable {
		systemtheme.clickCompanyActionList(saveButton);
		// EY_FW_Utility.doWait(1000);
		systemtheme.clickCompanyActionList(cancelButton);
		// EY_FW_Utility.doWait(3000);
	}

	@Then("^User can see the \"([^\"]*)\" Pop Up with message stating \"([^\"]*)\"$")
	public void user_can_see_the_Pop_Up_with_message_stating(String popupText, String message) throws Throwable {

	}

	@Then("^User can see the \"([^\"]*)\" and \"([^\"]*)\" Buttons$")
	public void user_can_see_the_and_Buttons(String button1, String button2) throws Throwable {
		systemtheme.user_Can_See_Buttons();
		/*
		 * assertEquals(true,
		 * EY_FW_Utility.isElementPresent(MMS_ExceptionTrackingPageLocator.
		 * CONFIRMEXCEPTIONTRACKER) &&
		 * EY_FW_Utility.isElementPresent(MMS_MyCompanyInfoPageLocator.
		 * CANCEL_DISABLECONTACTS));
		 */
	}

	@When("^clicks on the \"([^\"]*)\" button for that contact$")
	public void clicks_on_the_button_for_that_contact(String actionList) throws Throwable {
		systemtheme.clickCompanyActionList(actionList);
		// EY_FW_Utility.doWait(2000);
	}

	@When("^User clicks on the \"([^\"]*)\" Button$")
	public void user_clicks_on_the_Button(String button) throws Throwable {
		if (button.equalsIgnoreCase("cancel"))
			systemtheme.clickCancelContacts();
		else
			systemtheme.clickSaveContacts();
		// EY_FW_Utility.doWait(4000);
	}

	@Then("^Enabled column shows \"([^\"]*)\" for the Contact$")
	public void enabled_column_shows_for_the_Contact(String status) throws Throwable {
		// EY_FW_Utility.doWait(3000); // verification
		systemtheme.verifyEnabledText(status);

	}

	@When("^clicks on the save Button of popup$")
	public void clicks_on_the_save_Button_of_popup() throws Throwable {
		systemtheme.clickSavePopup();
		// EY_FW_Utility.doWait(4000);
	}

	@When("^clicks on the save Button$")
	public void clicks_on_the_save_Button() throws Throwable {

		systemtheme.clickSavePopup();
		// EY_FW_Utility.doWait(4000);
	}

	@When("^User selects System and clicks User Manager\\.$")
	public void user_selects_System_and_clicks_User_Manager() throws Throwable {
		systemtheme.selectSystem("System");
		// EY_FW_Utility.doWait(3000);
		systemtheme.selectSystemsublist("User Manager");

	}

	@Then("^User is on User Manager Page\\.$")
	public void user_is_on_User_Manager_Page() throws Throwable {
		// EY_FW_Utility.waitTillPageLoad(3);
		systemtheme.verifyUserManagerPageTitle();
	}

	@When("^User clicks on the Add User button$")
	public void user_clicks_on_the_Add_User_button() throws Throwable {
		systemtheme.clickAdduser();
		// EY_FW_Utility.doWait(5000);
	}

	@Then("^User lands on the Add User Page$")
	public void user_lands_on_the_Add_User_Page() throws Throwable {
		systemtheme.verifyAddUserPageTitle();
	}

	@Then("^User can see the Text box for fields like Username,First Name,Last Name, Email and Roles check box such as Administrator,User,User_Editor, save and cancel buttons$")
	public void user_can_see_the_Text_box_for_fields_like_Username_First_Name_Last_Name_Email_and_Roles_check_box_such_as_Administrator_User_User_Editor_save_and_cancel_buttons()
			throws Throwable {
		systemtheme.verifyUserDisplayDetails();
		// EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.CANCEL_EDITUSER).click();
		// EY_FW_Utility.doWait(4000);
	}

	@Given("^User is on the Add User Page$")
	public void user_is_on_the_Add_User_Page() throws Throwable {

		mmsconfigtheme.clickConfigurationLink();
		systemtheme.selectSystem("System");
		systemtheme.selectSystemsublist("User Manager");
		// EY_FW_Utility.doWait(2000);
		// EY_FW_Utility.waitTillPageLoad(3);
		systemtheme.clickAdduser();
		// EY_FW_Utility.doWait(3000);

		systemtheme.verifyAddUserPageTitle();
	}

	@When("^User enters data in fields like \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\" and selects \"([^\"]*)\" check boxes$")
	public void user_enters_data_in_fields_like_and_selects_check_boxes(String userName, String firstName, String lastName,
			String email, String role) throws Throwable {
		UserName = userName;
		systemtheme.enterUserDeatisl(userName, firstName, lastName, email, role);

	}

	@When("^User edits data in fields like \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\" and selects \"([^\"]*)\" check boxes$")
	public void user_edits_data_in_fields_like_and_selects_check_boxes(String userName, String firstName, String lastName,
			String role) throws Throwable {
		UserName = userName;
		systemtheme.editUserDeatisl(userName, firstName, lastName, role);

	}

	@When("^clicks on the cancel Button$")
	public void clicks_on_the_cancel_Button() throws Throwable {
		systemtheme.clickCancelUser();
		// EY_FW_Utility.doWait(3000);
	}

	@Then("^User lands on the \"([^\"]*)\" page$")
	public void user_lands_on_the_page(String pageTitle) throws Throwable {
		systemtheme.verifyUserManagerPageTitle();
	}

	@Then("^User cannot see the User added in the grid$")
	public void user_cannot_see_the_User_added_in_the_grid() throws Throwable {
		EY_FW_Utility.verifyTableColumnDoesntContains(MMS_MyCompanyInfoPageLocator.contacttable, 2, UserName);
	}

	@Then("^User can see the User added in the grid$")
	public void user_can_see_the_User_added_in_the_grid() throws Throwable {
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 2, UserName);
	}
	
	@Then("^User can see the User added in the Grid$")
	public void user_can_see_the_User_added_in_the_Grid() throws Throwable {
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 3, UserName);
	}

	@When("^clicks on the save button$")
	public void clicks_on_the_save_button() throws Throwable {
		systemtheme.clickSaveUser();
		// EY_FW_Utility.doWait(5000);
	}

	@When("^User clicks on the Arrow button in the Actions column for a User$")
	public void user_clicks_on_the_Arrow_button_in_the_Actions_column_for_a_User() throws Throwable {
		systemtheme.clickActionsUserManager();
		// EY_FW_Utility.doWait(2000); // for item to display
	}

	@When("^clicks on \"([^\"]*)\" button$")
	public void clicks_on_button(String button) throws Throwable {
		systemtheme.clickActionList(button);
		// EY_FW_Utility.doWait(5000);
	}

	@Then("^User lands on the Edit User page$")
	public void user_lands_on_the_Edit_User_page() throws Throwable {
		// EY_FW_Utility.waitTillPageLoad(3);
		systemtheme.verifyEditUserPageTitle();

	}

	@Given("^User is on the Edit User Page$")
	public void user_is_on_the_Edit_User_Page() throws Throwable {
		mmsconfigtheme.clickConfigurationLink();
		systemtheme.selectSystem("System");
		systemtheme.selectSystemsublist("User Manager");
		// EY_FW_Utility.doWait(2000);
		// EY_FW_Utility.waitTillPageLoad(3);
		systemtheme.clickActionsUserManager();
		// EY_FW_Utility.doWait(1000);
		systemtheme.clickActionList("Edit");
		// EY_FW_Utility.doWait(3000);
		// EY_FW_Utility.waitTillPageLoad(3);
		systemtheme.verifyEditUserPageTitle();
	}

	@Given("^has selected Enabled filter as \"([^\"]*)\"$")
	public void has_selected_Enabled_filter_as(String enabled) throws Throwable {
		systemtheme.enterFilterDetails("<select role>", "<All>", enabled);
		//systemtheme.clickSaveFilter();
	}

	@Given("^has entered Username as \"([^\"]*)\"$")
	public void has_entered_Username_as(String userName) {
		systemtheme.enterFilterUserNameFilter(userName);
	}

	@Then("^User can see that \"([^\"]*)\" column displays \"([^\"]*)\" value for this User$")
	public void user_can_see_that_column_displays_value_for_this_User(String column, String value) throws Throwable {
		// EY_FW_Utility.doWait(4000);
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 7, value);
	}

	@When("^User clicks on filter button$")
	public void user_clicks_on_filter_button() throws Throwable {
		systemtheme.clickFilterButton();
	}

	@When("^username, roles, approval tier and enabled are displayed$")
	public void username_roles_approval_tier_and_enabled_are_displayed() throws Throwable {
		systemtheme.verifyFilter();
	}

	@When("^clicks on save$")
	public void clicks_on_save() throws Throwable {
		systemtheme.clickSaveFilter();
		// EY_FW_Utility.doWait(3000);
	}

	@When("^User selects all enabled User$")
	public void user_selects_all_enabled_User() throws Throwable {
		systemtheme.selectAll();
	}

	@When("^clicks on the disable button available above the User Grid$")
	public void clicks_on_the_disable_button_available_above_the_User_Grid() throws Throwable {
		systemtheme.clickDisableUser();
	}

	@When("^clicks on the enable button available above the User Grid$")
	public void clicks_on_the_enable_button_available_above_the_User_Grid() throws Throwable {
		systemtheme.clickEnableUser();
	}

	@When("^clicks on OK$")
	public void clicks_on_OK() throws Throwable {
		systemtheme.confirm();
		// EY_FW_Utility.doWait(5000);
	}

	@Then("^User can see that Enabled column wont display \"([^\"]*)\" value for all Users$")
	public void user_can_see_that_Enabled_column_wont_display_value_for_all_Users(String value) throws Throwable {
		// EY_FW_Utility.doWait(4000);
		EY_FW_Utility.verifyTableColumnDoesntContains(MMS_MyCompanyInfoPageLocator.contacttable, 7, value);
	}

	@Given("^User can see the User Details displayed such as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_can_see_the_User_Details_displayed_such_as(String userName, String firstName, String lastName, String email,
			String changePassword, String savePassword) throws Throwable {
		systemtheme.verifyUserProfiledetails();
	}

	@Given("^User can see that the field Username is not Editable$")
	public void user_can_see_that_the_field_Username_is_not_Editable() throws Throwable {
		systemtheme.isNoteditable(MMS_UserProfilePageLocator.up_UserName);
	}

	@When("^User makes changes to any of the fields such as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_makes_changes_to_any_of_the_fields_such_as(String firstName, String lastName, String email, String role1,
			String role2) throws Throwable {
		systemtheme.enterFirstName(firstName);
		systemtheme.enterLastName(lastName);
		systemtheme.enterEmail(email);

	}

	@When("^clicks on Cancel option$")
	public void clicks_on_Cancel_option() throws Throwable {
		systemtheme.clickCancelOption();
		// EY_FW_Utility.doWait(3000);
	}

	@Then("^there are no changes to the User Profile$")
	public void there_are_no_changes_to_the_User_Profile() throws Throwable {
		mmsconfigtheme.clickConfigurationLink();
		systemtheme.selectSystem("System");
		systemtheme.selectSystemsublist("My User Profile");
		// EY_FW_Utility.doWait(2000);
		EY_FW_Utility.waitTillPageLoad(6);
	}

	@When("^clicks on Save option$")
	public void clicks_on_Save_option() throws Throwable {
		systemtheme.clickSavePassword();
	}

	@Then("^User can see the \"([^\"]*)\" message in \"([^\"]*)\"$")
	public void user_can_see_the_message_in(String message, String color) throws Throwable {
		systemtheme.verify_Message_in_Color(message);
		/*
		 * assertThat(arg1, equalTo(EY_FW_Utility.getAnyElementByAnyLocator(
		 * MMS_UserProfilePageLocator.msg).getText()));
		 * 
		 * String color =
		 * EY_FW_Utility.getAnyElementByAnyLocator(MMS_UserProfilePageLocator.
		 * msg).getCssValue("color"); String[] numbers = color.replace("rgba(",
		 * "").replace(")", "").split(","); int r =
		 * Integer.parseInt(numbers[0].trim()); int g =
		 * Integer.parseInt(numbers[0].trim()); int b =
		 * Integer.parseInt(numbers[0].trim()); System.out.println("r: " + r +
		 * "g: " + g + "b: " + b); String hex = "#" + Integer.toHexString(r) +
		 * Integer.toHexString(g) + Integer.toHexString(b);
		 * assertThat("#00ff00 ",equalTo(hex));
		 */
	}

	@Then("^User lands to User Manager Page\\.$")
	public void user_lands_to_User_Manager_Page() throws Throwable {
		systemtheme.verifyUserManagerPageTitle();
	}

	@Given("^User has clicked on the Change Password link$")
	public void user_has_clicked_on_the_Change_Password_link() throws Throwable {
		systemtheme.clickChangePassword();
	}

	@Given("^User can see the Editable Text boxes such as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_can_see_the_Editable_Text_boxes_such_as(String oldPassword, String newPassword, String confirmPassword) throws Throwable {
		systemtheme.isEditable(MMS_UserProfilePageLocator.oldpwd);
		systemtheme.isEditable(MMS_UserProfilePageLocator.newpwd);
		systemtheme.isEditable(MMS_UserProfilePageLocator.confirmpwd);
	}

	@When("^User enters \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enters(String oldPassword, String newPassword, String confirmPassword) throws Throwable {
		systemtheme.enterOldPassword(oldPassword);
		systemtheme.enterNewPassword(newPassword);
		newpwd = newPassword;
		systemtheme.enterConfirmPassword(confirmPassword);
	}

	@Then("^there are no changes to the User Password$")
	public void there_are_no_changes_to_the_User_Password() throws Throwable {
		mmsconfigtheme.clickConfigurationLink();
		systemtheme.selectSystem("System");
		systemtheme.selectSystemsublist("My User Profile");
		// EY_FW_Utility.doWait(2000);
		// EY_FW_Utility.waitTillPageLoad(3);
	}

	@Then("^Password is changed$")
	public void password_is_changed() throws Throwable {
		systemtheme.clickLogout();
		mmsconfigtheme.enterUserId("kcsadmin");
		mmsconfigtheme.enterPassword(newpwd);

	}

}
