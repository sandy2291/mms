package com.ey.mms.cucumberStepsThemeLevel;

import com.ey.mms.pageobjects.mmsLocators.MMS_BillingContactsPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.serenitystepsThemelevel.MMS_BillingContactsTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_CarAssociationTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_ExceptionsTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_FleetTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_SystemTheme_SerenitySteps;
import com.ey.mms.util.EY_FW_Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BillingContactsThemes_StepDefs {

	public String mark, name, apno, arno;
	@Steps
	MMS_BillingContactsTheme_SerenitySteps billingcontacts;

	@Steps
	MMS_FleetTheme_SerenitySteps configtheme;
	@Steps
	MMS_CarAssociationTheme_SerenitySteps carassociationtheme;

	@Steps
	MMS_ExceptionsTheme_SerenitySteps exceptiontheme;
	@Steps
	MMS_SystemTheme_SerenitySteps systemtheme;

	@When("^User Selects Billing Contacts Submenu from Configuration Mainmenu\\.$")
	public void user_Selects_Billing_Contacts_Submenu_from_Configuration_Mainmenu() throws Throwable {
		configtheme.clickConfigurationLink();
		// EY_FW_Utility.doWait(2000);
		billingcontacts.clickContacts();

		// EY_FW_Utility.doWait(3000);
	}

	@Then("^User lands to contact list Page\\.$")
	public void user_lands_to_contact_list_Page() throws Throwable {
		// EY_FW_Utility.waitTillPageLoad(3);
		billingcontacts.verifyBillingContactsPageTitle();

	}

	@Given("^User is on the Contact List page$")
	public void user_is_on_the_Contact_List_page() throws Throwable {
		// EY_FW_Utility.waitTillPageLoad(3);
		billingcontacts.verifyBillingContactsPageTitle();
	}

	@Given("^has clicked on the Add Company button to land on the \"([^\"]*)\" Pop Up$")
	public void has_clicked_on_the_Add_Company_button_to_land_on_the_Pop_Up(String popupTitle) throws Throwable {
		billingcontacts.clickAddCompany();
		billingcontacts.verifyPopupTitle(popupTitle);
		// EY_FW_Utility.doWait(2000); //verification
		// assertThat(EY_FW_Utility.getAnyElementByAnyLocator(MMS_BillingContactsPageLocator.popuptitle).getText(),
		// equalTo(arg1));
	}

	@When("^User enters data in fields like \"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enters_data_in_fields_like(String markText, String nameText, String apNumberText, String arNumberText) throws Throwable {
		mark = markText;
		name = nameText;
		apno = apNumberText;
		arno = arNumberText;
		billingcontacts.enterMark(markText);
		billingcontacts.enterName(nameText);
		billingcontacts.enterAPNO(apNumberText);
		billingcontacts.enterARNO(arNumberText);
	}

	@When("^clicks on the \"([^\"]*)\" Button$")
	public void clicks_on_the_Button(String buttonTitle) throws Throwable {
		// billingcontacts.clicksave();
		carassociationtheme.clickPopupSave();
		EY_FW_Utility.waitForProgressWindowToDisappear(10);
		// EY_FW_Utility.doWait(4000);
	}

	@Then("^User can see the newly added Company in the Grid$")
	public void user_can_see_the_newly_added_Company_in_the_Grid() throws Throwable {
		billingcontacts.verifyNewlyAddedCompany(mark);
		// EY_FW_Utility.verifyTableColumnContains(MMS_MyCompanyInfoPageLocator.contacttable,
		// 2, mark);
	}

	@When("^clicks on the cancel button\\.$")
	public void clicks_on_the_cancel_button() throws Throwable {
		carassociationtheme.clickPopupCancel();
	}

	@Then("^User cannot see the newly added Company in the Grid$")
	public void user_cannot_see_the_newly_added_Company_in_the_Grid() throws Throwable {
		billingcontacts.verifyCancelAddCompany(mark);
		// EY_FW_Utility.doWait(2000);//verification
		// EY_FW_Utility.verifyTableColumnDoesntContains(MMS_MyCompanyInfoPageLocator.contacttable,
		// 2, mark);
	}

	@Given("^enters reporting mark as \"([^\"]*)\"$")
	public void enters_reporting_mark_as(String rmark) throws Throwable {
		billingcontacts.enterRmark(rmark);
	}

	@Given("^clicks on save filter$")
	public void clicks_on_save_filter() throws Throwable {
		billingcontacts.clicksave();
		// EY_FW_Utility.doWait(5000); //check
	}

	@Given("^User has clicked on the Arrow button in the Actions column$")
	public void user_has_clicked_on_the_Arrow_button_in_the_Actions_column() throws Throwable {
		billingcontacts.clickActions();

	}

	@Given("^User has clicked on the \"([^\"]*)\" button to land on the \"([^\"]*)\" Pop Up$")
	public void user_has_clicked_on_the_button_to_land_on_the_Pop_Up(String buttonText, String popupTitle) throws Throwable {
		billingcontacts.clickActionList(buttonText);
		billingcontacts.verifyPopupTitle(popupTitle);
		// EY_FW_Utility.doWait(2000);
		// assertThat(EY_FW_Utility.getAnyElementByAnyLocator(MMS_BillingContactsPageLocator.popuptitle).getText(),
		// equalTo(arg2));
	}

	@Given("^User has clicked on the \"([^\"]*)\" button$")
	public void user_has_clicked_on_the_button(String button) throws Throwable {
		billingcontacts.clickActionList(button);
		// EY_FW_Utility.doWait(5000);
		// assertThat(EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.popuptitle).getText(),
		// equalTo(arg2));
	}

	@Then("^User can see the newly edited Company in the Grid$")
	public void user_can_see_the_newly_edited_Company_in_the_Grid() throws Throwable {
		billingcontacts.verifyNewlyEditedCompany(mark, name);
		// EY_FW_Utility.doWait(2000); // verification
		// EY_FW_Utility.verifyTableColumnContains(MMS_MyCompanyInfoPageLocator.contacttable,
		// 2, mark);
		// EY_FW_Utility.verifyTableColumnContains(MMS_MyCompanyInfoPageLocator.contacttable,
		// 3, name);
	}

	@Then("^User cannot see the newly edited Company in the Grid$")
	public void user_cannot_see_the_newly_edited_Company_in_the_Grid() throws Throwable {
		// EY_FW_Utility.verifyTableColumnDoesntContains(MMS_Locators.contacttable,
		// 2, mark);
		billingcontacts.verifyNewlyEditedCancelCompany(name);
		// EY_FW_Utility.verifyTableColumnDoesntContains(MMS_MyCompanyInfoPageLocator.contacttable,
		// 3, name);
	}

	@Given("^has selected Company Enabled filter as \"([^\"]*)\"$")
	public void has_selected_Company_Enabled_filter_as(String enabledFilter) throws Throwable {
		billingcontacts.selectCompanyEnabled(enabledFilter);
	}

	@Given("^has selected Contact Enabled filter as \"([^\"]*)\"$")
	public void has_selected_Contact_Enabled_filter_as(String contactEnabled) throws Throwable {
		billingcontacts.selectContactEnabled(contactEnabled);
	}

	@Then("^can see the \"([^\"]*)\" column shows \"([^\"]*)\"$")
	public void can_see_the_column_shows(String enabledColumn, String status) throws Throwable {
		billingcontacts.verifyEnabledColumn(MMS_MyCompanyInfoPageLocator.contacttable, status, 5);
		// EY_FW_Utility.doWait(2000); // verification
		// EY_FW_Utility.verifyTableColumnContains(MMS_MyCompanyInfoPageLocator.contacttable,
		// 5, arg2);
	}

	@When("^clicks on the ok Button$")
	public void clicks_on_the_ok_Button() throws Throwable {
		billingcontacts.clickok();
		// EY_FW_Utility.doWait(3000);
	}

	@When("^clicks on the Cancel button.$")
	public void clicks_on_the_Cancel_button() throws Throwable {
		billingcontacts.clickcancel();
		// EY_FW_Utility.doWait(3000);
	}

	@When("^user clicks on plus sign$")
	public void user_clicks_on_plus_sign() throws Throwable {
		// EY_FW_Utility.doWait(3000);
		billingcontacts.clickplus();
		// EY_FW_Utility.doWait(3000);
	}

	@When("^User clicks on the Actions column of a Contact$")
	public void user_clicks_on_the_Actions_column_of_a_Contact() throws Throwable {
		billingcontacts.clickactionssubtable();
	}

	@When("^clicks on the \"([^\"]*)\" button of that contact$")
	public void clicks_on_the_button_of_that_contact(String button) throws Throwable {
		billingcontacts.clickactionssubtablelist(button);
		// EY_FW_Utility.doWait(2000);
	}

	@Then("^does not see any modifications in the Contacts$")
	public void does_not_see_any_modifications_in_the_Contacts() throws Throwable {

	}

	@Then("^Enabled column shows \"([^\"]*)\" for the Contact in sub grid$")
	public void enabled_column_shows_for_the_Contact_in_sub_grid(String status) throws Throwable {
		billingcontacts.verifyEnabledColumn(MMS_BillingContactsPageLocator.Contact_subtable, status, 5);
		// EY_FW_Utility.doWait(2000);
		// EY_FW_Utility.verifyTableColumnContains(MMS_BillingContactsPageLocator.Contact_subtable,
		// 5, arg1);
	}

	@Then("^Enabled column doesnt shows \"([^\"]*)\" for any Contact in sub grid$")
	public void enabled_column_doesnt_shows_for_any_Contact_in_sub_grid(String status) throws Throwable {
		billingcontacts.verifyEnabledColumnDoesntcontain(MMS_BillingContactsPageLocator.Contact_subtable, status, 5);
		// EY_FW_Utility.doWait(2000);
		// EY_FW_Utility.verifyTableColumnDoesntContains(MMS_BillingContactsPageLocator.Contact_subtable,
		// 5, arg1);
	}
	
	
	@Then("^table will be empty with no contacts$")
	public void table_will_be_empty_with_no_contacts(){
		EY_FW_Utility.waitForProgressWindowToDisappear(30);
		billingcontacts.checkemptyTable();
	}

	@Then("^User can see the name as \"([^\"]*)\" and title as \"([^\"]*)\"$")
	public void user_can_see_the_name_as_and_title_as(String name, String title) throws Throwable {
		billingcontacts.verifyNameandTitle(name, title);
		// EY_FW_Utility.doWait(2000);
		// assertThat(EY_FW_Utility.getAnyElementByAnyLocator(MMS_BillingContactsPageLocator.Name_Displayed).getText(),
		// equalTo(arg1));
		// assertThat(EY_FW_Utility.getAnyElementByAnyLocator(MMS_BillingContactsPageLocator.Title_Displayed).getText(),
		// equalTo(arg2));
	}

	@Then("^clicks on cancel$")
	public void clicks_on_cancel() {
		carassociationtheme.clickPopupCancel();

	}

	@Then("^User gets Error message as \"([^\"]*)\"$")
	public void user_gets_Error_message_as(String errorMessage) throws Throwable {
		billingcontacts.companyCantSaveErrorMessage(errorMessage);
		// assertThat(EY_FW_Utility.getAnyElementByAnyLocator(MMS_BillingContactsPageLocator.companycantsave).getText(),
		// equalTo(arg1));

	}

	@Then("User gets the Error Pop Up '(.*)'")
	public void user_gets_the_Error_Pop_Up(String popupError) throws Throwable {
		billingcontacts.duplicateCompanyErrorPopup(popupError);
		// assertThat(EY_FW_Utility.getAnyElementByAnyLocator(MMS_BillingContactsPageLocator.duplicatecompany).getText(),
		// equalTo(arg1));
		exceptiontheme.clickCloseButton();
	}
	/*
	 * @Then("^User gets the Error Pop Up \"([^\"]*)\"$") public void
	 * user_gets_the_Error_Pop_Up(String arg1) throws Throwable {
	 * assertThat(EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.
	 * duplicatecompany).getText(), equalTo(arg1));
	 * exceptiontheme.clickclosebutton(); }
	 */
}
