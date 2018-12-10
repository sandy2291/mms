package com.ey.mms.serenitystepsThemelevel;

//import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.equalTo;


import java.util.List;

import java.util.List;

import org.hamcrest.MatcherAssert;
import org.hamcrest.text.IsEmptyString;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.testng.Assert;

import com.ey.mms.pageobjects.MMS_ExpectedResult;
import com.ey.mms.pageobjects.CarConfigpage;
import com.ey.mms.pageobjects.FleetListPage;
import com.ey.mms.pageobjects.HomePage;
import com.ey.mms.pageobjects.LoginPage;
import com.ey.mms.pageobjects.UploadFleetPage;
import com.ey.mms.pageobjects.mmsLocators.MMS_CarConfigurationPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_FleetListPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_InvoiceHistoryPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_InvoiceReviewPageLocator;
import com.ey.mms.serenitystepsThemelevel.expectedData.Carconfiguration;
import com.ey.mms.serenitystepsThemelevel.expectedData.FleetList;
import com.ey.mms.serenitystepsThemelevel.expectedData.Home;
import com.ey.mms.serenitystepsThemelevel.expectedData.InvoiceReview;
import com.ey.mms.serenitystepsThemelevel.expectedData.UploadFleet;
import com.ey.mms.util.EY_FW_Utility;

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;


public class MMS_CarConfigTheme_SerenitySteps {
	
	@ManagedPages
	CarConfigpage carconfigpage;
	
	
	@Step
	public void clickConfigurationLink() {
		carconfigpage.clickcarConfiguration();
	}
	
	@Step
	public void clickAddButton() {
		carconfigpage.clickAddButton();
	}
	
	@Step
	public void verifyCarconfigurationPageTitle() {
		try {
			System.out.println("[MMS_CarconfigurationPage : verifyCarconfigurationPageTitle] Verifying Carconfiguration Page Title as "
					+ Carconfiguration.CARCONFIGURATION_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
					equalTo(Carconfiguration.CARCONFIGURATION_PAGE_TITLE));
		} catch (Exception e) {
			System.out.println("[MMS_CarconfigurationPage : verifyCarconfigurationPageTitle] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	@Step
	public void verifyCarDetailsFieldsTabOpened() {
		carconfigpage.verifyCarDetailsFieldsTabOpened();
	}
	
	@Step
	public void verifyFleetGridFieldsTabOpened() {
		carconfigpage.verifyFleetGridFieldsTabOpened();
	}
	
	@Step
	public void verifyCategoriesPresent() {
		carconfigpage.verifyCategoriesPresent();
	}
	
	@Step
	public void verifySelectedFieldsPanelPresent() {
		carconfigpage.verifySelectedFieldsPanelPresent();
	}
	
	@Step
	public void verifyAddSelectedAndResetButtonPresent() {
		carconfigpage.verifyAddSelectedAndResetButtonPresent();
	}
	
	@Step
	public void verifySaveButtonPresent() {
		carconfigpage.verifySaveButtonPresent();
	}
	
	@Step
	public void verifyCancelButtonPresentBelowSelectedFields() {
		carconfigpage.verifyCancelButtonPresentBelowSelectedFields();
	}
	
	
	@Step
	public void verifyGridAndColumnsPresent() {
		carconfigpage.verifyGridAndColumnsPresent();
	}
	
	@Step
	public void verifyGridPresent() {
		carconfigpage.verifyGridPresent();
	}
	
	@Step
	public void verifyButtonsPresent(){
	   carconfigpage.verifyButtonsPresent();
	}
	
	@Step
	public void verifyTabsPresent(){
	   carconfigpage.verifyTabsPresent();
	}
	
	@Step
	public void clickDefineCustomField(){
	  carconfigpage.clickDefineCustomField();
	}
	
	@Step
	public void verifyCustomGridColumn(){
	  carconfigpage.verifyCustomGridColumn();
	}
    
	@Step
	public void verifydefinecustomGrid(){
	  carconfigpage.verifyDefineCustomFieldWithNoData();
	}
	
	@Step
	public void verifypaginationDropDown(){
	  carconfigpage.verifyPaginationDropDown();
	}
	
	@Step
	public void clickAddButtoninDefineCustomPage(){
		carconfigpage.addButtoninDefineCustomField();
	}
	
	@Step
	public void enterFieldName(String text){
		carconfigpage.enterFieldName(text);
	}
	
	@Step
	public void selectDataType(String data){
		carconfigpage.selectDataType(data);
	}
	
	@Step
	public void clickDefineSaveButton(){
		carconfigpage.clickDefineSaveButton();
	}
	
	@Step
	public void clickNotificationArea(){
		carconfigpage.clickNotificationArea();
	}
	
	@Step
	public void verifyRecordsAvailableInGrid(){
		carconfigpage.recordsInDefineCustomField();
	}
	
	@Step
	public void verifyCheckBoxBesideRecords(){
		carconfigpage.checkboxAvailableBesideEachRecord();
	}
	
	@Step
	public void verifySaveButtonNotPresent(){
		carconfigpage.isSaveButtonNotPresent();
	}
	
	@Step
	public void verifyCancelButtonNotPresent(){
		carconfigpage.isCancelButtonNotPresent();
	}
	
	@Step
	public void verifyCustomFieldEditBoxIsEmpty(){
		try{
			
			WebElement statusOfEditBox= EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.CUSTOMFIELD_EDITBOX);
			Assert.assertEquals("Field should be empty", statusOfEditBox.getAttribute("value").isEmpty());
		}catch(Exception e){
		
			Assert.assertTrue(false, e.getMessage()); 
			
	     }
	
	}
	
	@Step
	public void popUpMessageForDuplicateField(String message){
		try{
			List<WebElement> webelementList = EY_FW_Utility.getElementListByLocator(MMS_CarConfigurationPageLocator.ERRORMSG_FOR_DUPLICATE_CUSTOMFIELD);
			WebElement actualtext = webelementList.get(0);
			MatcherAssert.assertThat(actualtext.getText(), equalTo(message));
		}catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
	}
	
	@Step
	public void verifyTextInCustomFieldEditBox(String message){
		try{
			
			WebElement actualtext = EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.CUSTOMFIELD_EDITBOX);
			MatcherAssert.assertThat(actualtext.getAttribute("value"), equalTo(message));
			
		}catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
	}
	
	@Step
	public void clickOkButton(){
		carconfigpage.clickOkButton();
	}
	
	@Step
	public void clickCrossButton(){
		carconfigpage.clickCustomFieldCrossButton();
		
	}
	
	@Step
	public void clickCheckBoxToDelete(){
		carconfigpage.clickCheckbox();
	}
	
	@Step
	public void clickDeleteButton(){
		carconfigpage.clickDeleteButton();
	}
	
	@Step
	public void verifyCancelButtonInPopUp(){
		carconfigpage.isCancelButtonPresentInPopup();
	}
	
	@Step
	public void verifyOkButtonInPopup(){
		carconfigpage.isOKButtonPresent();
	}
	
	@Step
	public void popUpMessageToDelete(String message){
		try{
			List<WebElement> webelementList = EY_FW_Utility.getElementListByLocator(MMS_CarConfigurationPageLocator.ERRORMSG_FOR_DELETE_CUSTOMFIELD);
			WebElement actualtext = webelementList.get(0);
			MatcherAssert.assertThat(actualtext.getText(), equalTo(message));
		}catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
		
	}
	
	@Step
	public void popUpMessageToPerformTwoOperationAtSameTime(String message){
		try{
			List<WebElement> webelementList = EY_FW_Utility.getElementListByLocator(MMS_CarConfigurationPageLocator.ERRORMSG_FOR_TWO_OPERATION_AT_SAME_TIMNE);
			WebElement actualtext = webelementList.get(0);
			MatcherAssert.assertThat(actualtext.getText(), equalTo(message));
		}catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
		
	}
	
	@Step
	public void clickFirstCheckboxInGrid(){
		carconfigpage.clickFirstCheckboxInDefineCustomField();
	}
	
	@Step
	public void clickEditButton(){
		carconfigpage.clickEditButton();
	}
	
	
	@Step
	public void clickFirstChecboxInDefineCustomFieldGrid(){
		carconfigpage.clickFirstCheckboxInDefineCustomField();
	}
	
	@Step
	public void clickonEditButton(){
		carconfigpage.clickEditButton();
	}
	
	@Step
	public void editCustomField(String customField) {
		carconfigpage.editCustomField(customField);
	}

	
	@Step
	public void textBoxIsEditable(){
		carconfigpage.isTextBoxEditable();
	}
	
	@Step
	public void verifySaveButtonIsEnabled(){
		carconfigpage.isSaveButtonIsEnabled();
	}
	
	@Step
	public void verifyCancelButtonIsEnabled(){
		carconfigpage.isCancelButtonIsEnabled();
	}
	
	@Step
	public void clickFleetGridTab() {
		carconfigpage.clickFleetGridTab();
	}
	
	@Step
	public void clickCarDetailsFieldsTab() {
		carconfigpage.clickCarDetailsFieldsTab();
	}
	
	@Step
	public void clickSelectAllcheckbox() {
		carconfigpage.clickSelectAllcheckbox();
	}
	
	@Step
	public void clickPopupOkButton() {
		carconfigpage.clickOkButtonOfCarKindPopup();
	}
	
	@Step
	public void clickResetButton() {
		carconfigpage.clickResetButton();
	}
	
	@Step
	public void clickOtherCategories() {
		carconfigpage.clickOtherCategories();
	}
	
	@Step
	public void customfieldsPresentUnderAvailableFields(List<List<String>> data) {
		carconfigpage.customfieldsPresentUnderAvailableFields(data);
	}
	
	@Step
	public void customfieldsPresentUnderCategory(List<List<String>> data) {
		carconfigpage.customfieldsPresentUnderCategory(data);
	}
	
	@Step
	public void verifySelectAllPresent() {
		carconfigpage.verifySelectAllPresent();
	}
	
	@Step
	public void verifySelectAllPresentUnderCategory() {
		carconfigpage.verifySelectAllPresentUnderCategory();
	}
	
	@Step
	public void verifyCarDetailsFieldsAddWizard() {
		carconfigpage.verifyCarDetailsFieldsAddWizard();
	}
	
	@Step
	public void selectCustomfieldsFromAvailableFields(List<List<String>> customfields) {
		carconfigpage.selectCustomfieldsFromAvailableFields(customfields);
	}
	
	@Step
	public void selectCustomfieldsFromAvailableFieldsCarDetailsFields(List<List<String>> customfields) {
		carconfigpage.selectCustomfieldsFromAvailableFieldsCarDetailsFields(customfields);
	}
	
	@Step
	public void addSelected() {
		carconfigpage.addSelected();
	}
	
	@Step
	public void customfieldsPresentUnderSelectedFields(List<List<String>> customfields) {
		carconfigpage.customfieldsPresentUnderSelectedFields(customfields);
	}
	
	@Step
	public void customfieldsPresentUnderCarDetailsFieldsSelectedFields(List<List<String>> customfields) {
		carconfigpage.customfieldsPresentUnderCarDetailsFieldsSelectedFields(customfields);
	}
	
	@Step
	public void customfieldsRemovedFromAvailableFields(List<List<String>> customfields) {
		carconfigpage.customfieldsRemovedFromAvailableFields(customfields);
	}
	
	@Step
	public void customfieldsRemovedFromAvailableFieldsofCarDetailsFields(List<List<String>> customfields) {
		carconfigpage.customfieldsRemovedFromAvailableFieldsofCarDetailsFields(customfields);
	}
	
	@Step
	public void verifyReorderIconPresent() {
		carconfigpage.verifyReorderandCancelIconPresent();
	}
	

	@Step
	public void verifyReorderIconPresentInCarDetailsFields() {
		carconfigpage.verifyReorderIconPresentInCarDetailsFields();
	}
	
	@Step
	public void verifySaveButtonEnabled() {
		carconfigpage.verifySaveButtonEnabled();
	}
	
	@Step
	public void clickSaveButton() {
		carconfigpage.clickSaveButton();
	}
	
	@Step
	public void verifySaveButtonDisabled() {
		carconfigpage.verifySaveButtonDisabled();
	}
	
	@Step
	public void verifyNoDataInGrid() {
		carconfigpage.verifyNoDataInGrid();
	}
	
	@Step
	public void verifyNoCustomFieldsUnderCategorySelected() {
		carconfigpage.verifyNoCustomFieldsUnderCategorySelected();
	}
	
	@Step
	public void selectCarKind(String carkind) {
		carconfigpage.selectCarKind(carkind);
	}
	
	@Step
	public void carKindAddedInCarDetailsFieldsGrid() {
		carconfigpage.carKindAddedInCarDetailsFieldsGrid();
	}
	
	@Step
	public void verifyCarKindValue(String carkind) {
		carconfigpage.verifyCarKindValue(carkind);
	}
	
	@Step
	public void verifySelectedfieldsValue(String selectedfields) {
		carconfigpage.verifySelectedfieldsValue(selectedfields);
	}
	
	@Step
	public void verifyAlertMessageForCarKind(String alertmessage) {
		carconfigpage.verifyAlertMessageForCarKind(alertmessage);
	}
	
	@Step
	public void verifyDeleteConfirmationMessage(String alertmessage) {
		carconfigpage.verifyDeleteConfirmationMessage(alertmessage);
	}
	
	@Step
	public void verifyPopupButtons() {
		carconfigpage.verifyPopupButtons();
	}
	
	@Step
	public void selectCarKindCheckbox(String carkindcheckbox) {
		carconfigpage.selectCarKindCheckbox();
	}
	
	@Step
	public void clickEditButtonOfCarDetailsFields() {
		carconfigpage.clickEditButtonOfCarDetailsFields();
	}
	
	@Step
	public void clickDeleteButtonOfCarDetailsFields() {
		carconfigpage.clickDeleteButtonOfCarDetailsFields();
	}
	
	@Step
	public void clickOkButtonOfDeletePopup() {
		carconfigpage.clickOkButtonOfDeletePopup();
	}
	
	@Step
	public void verifyCarKindDropdownDisabled() {
		carconfigpage.verifyCarKindDropdownDisabled();
	}
	
	@Step
	public void clickSelectAllcheckboxfromAvialableCategory() {
		carconfigpage.clickSelectAllcheckboxfromAvialableCategory();
	}
}
