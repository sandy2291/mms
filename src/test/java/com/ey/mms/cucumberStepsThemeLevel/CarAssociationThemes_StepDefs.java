package com.ey.mms.cucumberStepsThemeLevel;

import com.ey.mms.pageobjects.MMS_Locators;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.serenitystepsThemelevel.MMS_CarAssociationTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_FleetTheme_SerenitySteps;
import com.ey.mms.util.EY_FW_Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CarAssociationThemes_StepDefs {

	@Steps
	MMS_CarAssociationTheme_SerenitySteps carassociationtheme;

	@Steps
	MMS_FleetTheme_SerenitySteps configtheme;

	String initial, startno, endno, customer;

	@When("^User Selects Car to Customer Associations Submenu from Configuration Mainmenu\\.$")
	public void user_Selects_Car_to_Customer_Associations_Submenu_from_Configuration_Mainmenu() throws Throwable {
		configtheme.clickConfigurationLink();
		EY_FW_Utility.doWait(1000);
		carassociationtheme.clickCarToCustomerAssociation();
		// EY_FW_Utility.doWait(2000);
	}

	@Then("^User lands to Car to Customer Associations Page\\.$")
	public void user_lands_to_Car_to_Customer_Associations_Page() throws Throwable {
		// EY_FW_Utility.waitTillPageLoad(3);
		carassociationtheme.verifyCarToCustomerAssociationPageTitle();
	}

	@Given("^User is on the Car To Customer Associations page$")
	public void user_is_on_the_Car_To_Customer_Associations_page() throws Throwable {
		// EY_FW_Utility.waitTillPageLoad(3);
		carassociationtheme.verifyCarToCustomerAssociationPageTitle();
	}

	@When("^User clicks on the Add Association button$")
	public void user_clicks_on_the_Add_Association_button() throws Throwable {
		carassociationtheme.clickAddAssoc();
		// EY_FW_Utility.doWait(3000);
		// EY_FW_Utility.waitTillPageLoad(3);
	}

	@Then("^User can see the Text box for fields like \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",save and cancel buttons$")
	public void user_can_see_the_Text_box_for_fields_like_save_and_cancel_buttons(String initial, String startnumber, String customer)
			throws Throwable {
		// EY_FW_Utility.doWait(2000);
		carassociationtheme.verifyDisplay();
	}

	@Then("^User can see the Text box for fields like \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_can_see_the_Text_box_for_fields_like(String carInitial, String carNo, String carEnd) throws Throwable {
		// EY_FW_Utility.doWait(2000);
		carassociationtheme.verifydisplay1();
	}

	@Then("^User enters data in fields like \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enters_data_in_fields_like(String initialtext, String beginRange, String endRange, String customerName) throws Throwable {
		carassociationtheme.enterAddAssoc(initialtext, beginRange, endRange, customerName);
		initial = initialtext;
		startno = beginRange;
		endno = endRange;
		customer = customerName;
	}

	@Then("^cannot see the Association added$")
	public void cannot_see_the_Association_added() throws Throwable {
		carassociationtheme.user_cant_see_assoc(initial, startno, endno);
	}

	@Then("^clicks on the cancel button$")
	public void clicks_on_the_cancel_button() throws Throwable {
		carassociationtheme.clickPopupCancel();
		// EY_FW_Utility.doWait(2000);
	}


	@Then("^clicks on the cancel button of popup$")
	public void clicks_on_the_cancel_button_of_popup() throws Throwable {
		carassociationtheme.clickPopupCancelButton();
		// EY_FW_Utility.doWait(2000);
	}
	
	@Then("^clicks on the Save button$")
	public void clicks_on_the_Save_button() throws Throwable {
		carassociationtheme.clickPopupSave();
		// EY_FW_Utility.doWait(5000);
	}

	@Then("^can see the Association added$")
	public void can_see_the_Association_added() throws Throwable {
		carassociationtheme.user_Can_see_assoc_added(initial, startno, endno, customer);
	}

	@When("^User clicks on the Arrow button in the Actions column for a Company$")
	public void user_clicks_on_the_Arrow_button_in_the_Actions_column_for_a_Company() throws Throwable {
		carassociationtheme.clickactions();
	}

	@When("^clicks on \"([^\"]*)\" Button$")
	public void clicks_on_Button(String button) throws Throwable {
		carassociationtheme.clickActionList(button);
		// EY_FW_Utility.doWait(2000);
	}

	@Then("^User can see the cancel and save buttons$")
	public void user_can_see_the_cancel_and_save_buttons() throws Throwable {

	}

	@Then("^\"([^\"]*)\" column shows \"([^\"]*)\"$")
	public void column_shows(String column, String status) throws Throwable {

	}

	@When("^user clicks on filter button$")
	public void user_clicks_on_filter_button() throws Throwable {
		carassociationtheme.clickFilter();
	}

	@When("^enters \"([^\"]*)\" as car initial$")
	public void enters_as_car_initial(String carInitial) throws Throwable {
		carassociationtheme.enterCarInitial(carInitial);
	}

	@When("^selects \"([^\"]*)\" for enabled$")
	public void selects_for_enabled(String enabled) throws Throwable {
		carassociationtheme.selectEnabled(enabled);

	}

	@When("^clicks on the Save filter$")
	public void clicks_on_the_Save_filter() throws Throwable {
		carassociationtheme.clickSaveFilter();
		// EY_FW_Utility.doWait(2000); // to refresh data
	}

	@Then("^clicks on the ok button$")
	public void clicks_on_the_ok_button() throws Throwable {
		carassociationtheme.clickOkDisable();
		// EY_FW_Utility.doWait(3000);
	}

}
