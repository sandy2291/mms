package com.ey.mms.cucumberStepsThemeLevel;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.List;

import javax.swing.SortingFocusTraversalPolicy;

import org.hamcrest.MatcherAssert;
import org.jruby.RubyProcess.Sys;
import org.testng.Assert;

import com.ey.mms.pageobjects.LoginPage;
import com.ey.mms.serenitystepsThemelevel.MMS_CarConfigTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_FleetTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.MMS_LeaseTheme_SerenitySteps;
import com.ey.mms.util.EY_FW_Utility;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;

public class CarConfigThemes_StepDefs {

	
	List<List<String>> data;

	@Steps
	MMS_CarConfigTheme_SerenitySteps mmscarconfigtheme;

	@When("^User selects Car configuration$")
	public void User_selects_Car_configuration() throws Throwable {
		mmscarconfigtheme.clickConfigurationLink();
	}
	
	@Then("^User is on Car Configuration wizard$")
	public void user_is_on_Car_Configuration_wizard() throws Throwable {
		mmscarconfigtheme.verifyCarconfigurationPageTitle();
	}
	
	@Then("^By default the user should see the tab Car Details Fields opened$")
	public void by_default_the_user_should_see_the_tab_Car_Details_Fields_opened() throws Throwable {
		mmscarconfigtheme.verifyCarDetailsFieldsTabOpened();
		
	}
	
	@Then("^User should see Grid with three columns$")
	public void user_should_see_Grid_with_three_columns(DataTable arg1) throws Throwable {
	    mmscarconfigtheme.verifyGridPresent();
	}
	
	@Then("^above the grid , there should be three buttons -Add, Edit, Delete$")
	public void above_the_grid_there_should_be_three_buttons_Add_Edit_Delete() throws Throwable {
	   mmscarconfigtheme.verifyButtonsPresent();
	}

	@Then("^there are other two tabs - Fleet Grid Fields, Define Custom Fields$")
	public void there_are_other_two_tabs_Fleet_Grid_Fields_Define_Custom_Fields() throws Throwable {
	   mmscarconfigtheme.verifyTabsPresent();
	}
	
	
	@Given("^User was on Configure- Details page once he landed$")
	public void user_was_on_Configure_Details_page_once_he_landed() throws Throwable {
	   mmscarconfigtheme.verifyCarconfigurationPageTitle();
	}

	@Given("^two other tabs were present Select- Grid, Define -custom$")
	public void two_other_tabs_were_present_Select_Grid_Define_custom() throws Throwable {
	    mmscarconfigtheme.verifyTabsPresent();
	}

	@When("^user cicks on the Define-custom tab$")
	public void user_cicks_on_the_Define_custom_tab() throws Throwable {
	    mmscarconfigtheme.clickDefineCustomField();
	    EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
	}

	/*@Then("^User will land to the Define-custom page$")
	public void user_will_land_to_the_Define_custom_page() throws Throwable {
	    
	}*/

	@Then("^it will have a grid with three columns - checkbox control, Field Name and Data type with a search panel tagged to the column$")
	public void it_will_have_a_grid_with_three_columns_checkbox_control_Field_Name_and_Data_type_with_a_search_panel_tagged_to_the_column() throws Throwable {
	    mmscarconfigtheme.verifyCustomGridColumn();
	}

	@Then("^There will be three buttons - Add, Edit, Delete over the grid$")
	public void there_will_be_three_buttons_Add_Edit_Delete_over_the_grid() throws Throwable {
	    mmscarconfigtheme.verifyButtonsPresent();
	}

	@Then("^Grid will just say \"([^\"]*)\" as there was no data initially$")
	public void grid_will_just_say_as_there_was_no_data_initially(String arg1) throws Throwable {
	    mmscarconfigtheme.verifydefinecustomGrid();
	}

	@Then("^Grid should show paginations and page size limits drop down$")
	public void grid_should_show_paginations_and_page_size_limits_drop_down() throws Throwable {
	   mmscarconfigtheme.verifypaginationDropDown();
	}
	
	
	@Then("^User can see CustomField EditBox text as \"([^\"]*)\"$")
	public void user_can_see_CustomField_EditBox_text_as(String message) throws Throwable {
		mmscarconfigtheme.verifyTextInCustomFieldEditBox(message);
	}

		
	@When("^User clicks the tab Fleet Grid Fields$")
	public void user_clicks_the_tab_Fleet_Grid_Fields() throws Throwable {
		mmscarconfigtheme.clickFleetGridTab();
	}
	
	@Then("^User is on Fleet Grid Fields tab$")
	public void user_is_on_Fleet_Grid_Fields_tab() throws Throwable {
		mmscarconfigtheme.verifyFleetGridFieldsTabOpened();
	}
	
	@Then("^User can see list all the categories on Left panel$")
	public void user_can_see_list_all_the_categories_on_Left_panel() throws Throwable {
		mmscarconfigtheme.verifyCategoriesPresent();
	}
	
	@Then("^User can see a container showing Selected Fields on the right$")
	public void user_can_see_a_container_showing_Selected_Fields_on_the_right() throws Throwable {
		mmscarconfigtheme.verifySelectedFieldsPanelPresent();
	}
	
	@Then("^User see Add Selected, Reset button between the panels$")
	public void user_see_Add_Selected_Reset_button_between_the_panels() throws Throwable {
		mmscarconfigtheme.verifyAddSelectedAndResetButtonPresent();
	}
	
	@Then("^User can see Save button at the right corner below the selected fields panel$")
	public void user_can_see_Save_button_at_the_right_corner_below_the_selected_fields_panel() throws Throwable {
		mmscarconfigtheme.verifySaveButtonPresent();
	}
	
	@Then("^User can see Cancel button next to Save button below the selected fields panel$")
	public void user_can_see_Cancel_button_next_to_Save_button_below_the_selected_fields_panel() throws Throwable {
		mmscarconfigtheme.verifyCancelButtonPresentBelowSelectedFields();
	}
	
	@When("^User clicks the Category Others for Custom Fields$")
	public void user_clicks_the_Category_Others_for_Custom_Fields() throws Throwable {
		EY_FW_Utility.waitTillPageLoad(15);
		mmscarconfigtheme.clickOtherCategories();
	}

	@Then("^User see below custom fields present$")
	public void user_see_below_custom_fields_present(DataTable customfields) throws Throwable {
	    data=customfields.raw();
	    mmscarconfigtheme.customfieldsPresentUnderAvailableFields(data);
		}
	
	@Then("^User see below custom fields present under category$")
	public void user_see_below_custom_fields_present_under_category(DataTable customfields) throws Throwable {
	    data=customfields.raw();
	    mmscarconfigtheme.customfieldsPresentUnderCategory(data);
		}
	
	@Then("^User can see an option to select all on the top$")
	public void user_can_see_an_option_to_select_all_on_the_top() throws Throwable {
		mmscarconfigtheme.verifySelectAllPresent();
	}
	
	@Then("^User can see an option to select all on the top under category$")
	public void user_can_see_an_option_to_select_all_on_the_top_under_category() throws Throwable {
		mmscarconfigtheme.verifySelectAllPresentUnderCategory();
	}
	
	@When("^User selects below fields Under Car Details Fields$")
	public void user_selects_below_fields_Under_Car_Details_Fields(DataTable customfields) throws Throwable {
		data=customfields.raw();
		 mmscarconfigtheme.selectCustomfieldsFromAvailableFieldsCarDetailsFields(data);
	}
	
	@When("^User selects below fields$")
	public void user_selects_below_fields(DataTable customfields) throws Throwable {
		data=customfields.raw();
		 mmscarconfigtheme.selectCustomfieldsFromAvailableFields(data);
	}
	
	@When("^User clicks on Add selected$")
	public void user_clicks_on_Add_selected() throws Throwable {
		mmscarconfigtheme.addSelected();
	}
	
	@Then("^User can see below fields under Selected Fields$")
	public void user_can_see_below_fields_under_Selected_Fields(DataTable customfields) throws Throwable {
		data=customfields.raw();
	    mmscarconfigtheme.customfieldsPresentUnderSelectedFields(data);
	}
	
	@Then("^User can see below fields under Selected Fields of Car Details Fields$")
	public void user_can_see_below_fields_under_Selected_Fields_of_Car_Details_Fields(DataTable customfields) throws Throwable {
		data=customfields.raw();
	    mmscarconfigtheme.customfieldsPresentUnderCarDetailsFieldsSelectedFields(data);
	}
	
	@Then("^User cannot see below fields under Available Fields of Car Details Fields$")
	public void user_cannot_see_below_fields_under_Available_Fields_of_Car_Details_Fields(DataTable customfields) throws Throwable {
		data=customfields.raw();
		mmscarconfigtheme.customfieldsRemovedFromAvailableFieldsofCarDetailsFields(data);
	}
	
	@Then("^User cannot see below fields under Available Fields$")
	public void user_cannot_see_below_fields_under_Available_Fields(DataTable customfields) throws Throwable {
		data=customfields.raw();
		mmscarconfigtheme.customfieldsRemovedFromAvailableFields(data);
	}
	
	@Then("^User can see Remove and Order icon for custom fields at the right$")
	public void user_can_see_Remove_and_Order_icon_for_custom_fields_at_the_right() throws Throwable {
		mmscarconfigtheme.verifyReorderIconPresent();
	}
	
	@Then("^User can see Remove and Order icon for custom fields at the right of Car Details Fields$")
	public void user_can_see_Remove_and_Order_icon_for_custom_fields_at_the_right_of_Car_Details_Fields() throws Throwable {
		mmscarconfigtheme.verifyReorderIconPresentInCarDetailsFields();
	}
	
	@Then("^User can see Save button as enabled$")
	public void user_can_see_Save_button_as_enabled() throws Throwable {
		mmscarconfigtheme.verifySaveButtonEnabled();
	}
	
	@When("^User clicks on Save$")
	public void user_clicks_on_Save() throws Throwable {
		mmscarconfigtheme.clickSaveButton();
	}
	
	@Then("^Selected fields are saved$")
	public void selected_fields_are_saved(DataTable customfields) throws Throwable {
		data=customfields.raw();
	    mmscarconfigtheme.customfieldsPresentUnderSelectedFields(data);
	}
	
	@Then("^User can see Save button as disabled$")
	public void user_can_see_Save_button_as_disabled() throws Throwable {
		mmscarconfigtheme.verifySaveButtonDisabled();
	}
	
	@Given("^User navigates to Car Details Fields tab$")
	public void user_navigates_to_Car_Details_Fields_tab() throws Throwable {
		EY_FW_Utility.waitTillPageLoad(10);
		mmscarconfigtheme.clickCarDetailsFieldsTab();
	}
	
	@When("^User selects All checkbox from Available category$")
	public void user_selects_All_checkbox_from_Available_category() throws Throwable {
		mmscarconfigtheme.clickSelectAllcheckbox();
	}
	
	@Then("^User clicks on OK button of popup$")
	public void user_clicks_on_OK_button_of_popup() throws Throwable {
		mmscarconfigtheme.clickPopupOkButton();
	}


	@When("^User clicks on Reset button$")
	public void user_clicks_on_Reset_button() throws Throwable {
		mmscarconfigtheme.clickResetButton();
	}
	
	@Then("^User can see All checkbox under Available category$")
	public void user_can_see_All_checkbox_under_Available_category() throws Throwable {
		mmscarconfigtheme.verifySelectAllPresent();
	}
	
	@Then("^User can see \"([^\"]*)\"$")
	public void user_can_see(String arg1) throws Throwable {
		EY_FW_Utility.waitTillPageLoad(3);
		mmscarconfigtheme.verifyNoDataInGrid();
	}
	
	@When("^User clicks on Add button over the grid$")
	public void User_clicks_on_Add_button_over_the_grid() throws Throwable {
		mmscarconfigtheme.clickAddButton();
	}

	@Then("^User will land to the configure wizard with a car kind label and drop down with the list of all car kinds$")
	public void User_will_land_to_the_configure_wizard_with_a_car_kind_label_and_drop_down_with_the_list_of_all_car_kinds() throws Throwable {
		mmscarconfigtheme.verifyCarDetailsFieldsAddWizard();
	}
	
	@When("^User can see \"([^\"]*)\" under Available fields$")
	public void user_can_see_under_Available_fields(String arg1) throws Throwable {
		mmscarconfigtheme.verifyNoCustomFieldsUnderCategorySelected();
	}
	
	@When("^User selects car kind \"([^\"]*)\"$")
	public void user_selects_car_kind(String carkind) throws Throwable {
		mmscarconfigtheme.selectCarKind(carkind);
	}

	@Then("^User can see new row added to the grid$")
	public void user_can_see_new_row_added_to_the_grid() throws Throwable {
		mmscarconfigtheme.carKindAddedInCarDetailsFieldsGrid();
	}

	@Then("^User can see column car kind as \"([^\"]*)\"$")
	public void user_can_see_column_car_kind_as(String carkind) throws Throwable {
		mmscarconfigtheme.verifyCarKindValue(carkind);
	}

	@Then("^User can see column selected fields as \"([^\"]*)\" in tabs$")
	public void user_can_see_column_selected_fields_as_in_tabs(String selectedfields) throws Throwable {
		mmscarconfigtheme.verifySelectedfieldsValue(selectedfields);
	}
	
	@Then("^User gets alert  message \"([^\"]*)\"$")
	public void user_gets_alert_message(String alertmessage) throws Throwable {
		mmscarconfigtheme.verifyAlertMessageForCarKind(alertmessage);
	}

	@When("^User selects checkbox for \"([^\"]*)\" car kind$")
	public void user_selects_checkbox_for_car_kind(String carkindcheckbox) throws Throwable {
		mmscarconfigtheme.selectCarKindCheckbox(carkindcheckbox);
	}

	@When("^User clicks on Edit button over the grid$")
	public void user_clicks_on_Edit_button_over_the_grid() throws Throwable {
		mmscarconfigtheme.clickEditButtonOfCarDetailsFields();
	}

	@Then("^User can see Car Kind dropdown as READ Only$")
	public void user_can_see_Car_Kind_dropdown_as_READ_Only() throws Throwable {
		mmscarconfigtheme.verifyCarKindDropdownDisabled();
	}

	@When("^User selects All fields from Available field$")
	public void user_selects_All_fields_from_Available_field() throws Throwable {
		mmscarconfigtheme.clickSelectAllcheckboxfromAvialableCategory();
	}
	
	@When("^User clicks on Delete button present on the top of the grid$")
	public void user_clicks_on_Delete_button_present_on_the_top_of_the_grid() throws Throwable {
		mmscarconfigtheme.clickDeleteButtonOfCarDetailsFields();
	}

	@Then("^user will get a confirmation box \"([^\"]*)\"$")
	public void user_will_get_a_confirmation_box(String confirmationmsg) throws Throwable {
		mmscarconfigtheme.verifyDeleteConfirmationMessage(confirmationmsg);
	}

	@Then("^User can see Cancel,Ok button$")
	public void user_can_see_Cancel_Ok_button() throws Throwable {
		mmscarconfigtheme.verifyPopupButtons();
	}

	@Then("^User clicks on Ok button$")
	public void user_clicks_on_Ok_button() throws Throwable {
		mmscarconfigtheme.clickOkButtonOfDeletePopup();
	}

	@Then("^Save /Cancel button should  be enabled$")
	public void save_Cancel_button_should_be_enabled() throws Throwable {
	   mmscarconfigtheme.verifySaveButtonIsEnabled();
	   mmscarconfigtheme.verifyCancelButtonIsEnabled();
	   mmscarconfigtheme.clickCrossButton();
	}
	
	@Given("^User has clicked the Add button over Custom fields grid$")
	public void user_has_clicked_the_Add_button_over_Custom_fields_grid() throws Throwable {
	   
		mmscarconfigtheme.clickAddButtoninDefineCustomPage();
	}

	
	
	@When("^User enters Field Name ([^\"]*)$")
	public void user_enters_Field_Name(String text) throws Throwable {
		mmscarconfigtheme.enterFieldName(text);
	}
	
	
	@When("^User selects Data Type ([^\"]*)$")
	public void user_selects_Data_Type_Boolean(String data) throws Throwable {
	    mmscarconfigtheme.selectDataType(data);
	}

	@When("^clicks on Save$")
	public void clicks_on_Save() throws Throwable {
	    mmscarconfigtheme.clickSaveButton();
	}

	@Then("^Record should be successfully added on the grid$")
	public void record_should_be_successfully_added_on_the_grid() throws Throwable {
	   mmscarconfigtheme.verifyRecordsAvailableInGrid();
	}

	@Then("^the Activity summary should show a alert in Green and message on the box$")
	public void the_Activity_summary_should_show_a_alert_in_Green_and_message_on_the_box() throws Throwable {
	    
	}

	@Then("^the grid should should number of records as per the pagination message$")
	public void the_grid_should_should_number_of_records_as_per_the_pagination_message() throws Throwable {
	    
	}

	@Then("^Checkbox should appear beside the record added$")
	public void checkbox_should_appear_beside_the_record_added() throws Throwable {
	   mmscarconfigtheme.verifyCheckBoxBesideRecords();
	}

	@Then("^Save and Cancel button should not be present$")
	public void save_and_Cancel_button_should_not_be_present() throws Throwable {
	   mmscarconfigtheme.verifySaveButtonNotPresent();
	   mmscarconfigtheme.verifyCancelButtonNotPresent();
	}

	@Then("^User gets popup stating as \"([^\"]*)\"$")
	public void user_gets_popup_stating(String message) throws Throwable {
	    mmscarconfigtheme.popUpMessageForDuplicateField(message);
	}

	@Then("^User click on OK Button$")
	public void user_click_on_OK_Button() throws Throwable {
	   mmscarconfigtheme.clickOkButton();
	   mmscarconfigtheme.clickCrossButton();
	}

	@Then("^the field name text box should be highlighted$")
	public void the_field_name_text_box_should_be_highlighted() throws Throwable {
	  
	}
	
	
	@Given("^User is on the define custom fields tab$")
	public void user_is_on_the_define_custom_fields_tab() throws Throwable {
	    
	    mmscarconfigtheme.verifyTabsPresent();
	}

	@When("^user selects few of the rows on the grid$")
	public void user_selects_few_of_the_rows_on_the_grid() throws Throwable {
	    mmscarconfigtheme.clickCheckBoxToDelete();
	}

	@When("^clicks on Delete$")
	public void clicks_on_Delete() throws Throwable {
	    EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
		mmscarconfigtheme.clickDeleteButton();
	}

	@Then("^User will get a confirmation box stating \"([^\"]*)\"$")
	public void user_will_get_a_confirmation_box_stating(String message) throws Throwable {
		 mmscarconfigtheme.popUpMessageToDelete(message);
	}

	@Then("^There will be two buttons Ok and Cancel$")
	public void there_will_be_two_buttons_Yes_and_No() throws Throwable {
	   mmscarconfigtheme.verifyCancelButtonInPopUp();
	   mmscarconfigtheme.verifyOkButtonInPopup();
	}

	@When("^user clicks on Ok$")
	public void user_clicks_on_Yes() throws Throwable {
	   mmscarconfigtheme.clickOkButton();
	}

	@Then("^the data will be removed$")
	public void the_data_will_be_removed() throws Throwable {
	   EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
		mmscarconfigtheme.verifydefinecustomGrid();
	}

	@Given("^User selects a row from the Custom Field Grid$")
	public void user_slects_a_row_from_in_the_Custom_Field_Grid() throws Throwable {
	    mmscarconfigtheme.clickFirstChecboxInDefineCustomFieldGrid();
	}

	@Given("^User has clicked the Edit button over Custom fields grid$")
	public void user_has_clicked_the_Edit_button_over_Custom_fields_grid() throws Throwable {
	    mmscarconfigtheme.clickEditButton();
	}

	@Given("^has already changed the values for the CustomFieldone as \"([^\"]*)\"$")
	public void has_already_changed_the_values_for_the_CustomFieldone_as(String customField) throws Throwable {
	    mmscarconfigtheme.editCustomField(customField);
	}

	@Given("^selects data type as \"([^\"]*)\"$")
	public void selects_data_type_as(String data) throws Throwable {
	   mmscarconfigtheme.selectDataType(data);
	}

	@When("^user clicks on save$")
	public void user_clicks_on_save() throws Throwable {
	   mmscarconfigtheme.clickDefineSaveButton();
	}

	@Then("^Record should be successfully updated on the grid$")
	public void record_should_be_successfully_updated_on_the_grid() throws Throwable {
	    
	}

	
	@Given("^User is on define custom fields tab$")
	public void user_is_on_define_custom_fields_tab() throws Throwable {
	    mmscarconfigtheme.verifyTabsPresent();
	}

	@When("^user can see Textbox and Datatype in write mode as \"([^\"]*)\"$")
	public void user_can_see_Textbox_and_Datatype_in_write_mode(String data) throws Throwable {
	    mmscarconfigtheme.textBoxIsEditable();
	    mmscarconfigtheme.selectDataType(data);
	}
	
	@Then("^User will get a confirmation box stating as \"([^\"]*)\"$")
	public void user_will_get_a_confirmation_box_stating_as(String message) throws Throwable {
		 mmscarconfigtheme.popUpMessageToPerformTwoOperationAtSameTime(message);
	}


	@Then("^user can see OK Button$")
	public void user_can_see_OK_Button() throws Throwable {
	   mmscarconfigtheme.verifyOkButtonInPopup();
	}

	@Then("^on click of Ok user is on Define Custom fields tab$")
	public void on_click_of_Ok_user_is_on_Define_Custom_fields_tab() throws Throwable {
	    mmscarconfigtheme.clickOkButton();
	    mmscarconfigtheme.clickCrossButton();
	}
	
}
