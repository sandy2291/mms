package com.ey.mms.pageobjects;


import static org.hamcrest.CoreMatchers.equalTo;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import com.ey.mms.pageobjects.mmsLocators.MMS_CarConfigurationPageLocator;
import com.ey.mms.serenitystepsThemelevel.expectedData.Carconfiguration;
import com.ey.mms.pageobjects.mmsLocators.*;
import com.ey.mms.serenitystepsThemelevel.expectedData.Carconfiguration;
import com.ey.mms.serenitystepsThemelevel.expectedData.FleetList;
import com.ey.mms.serenitystepsThemelevel.expectedData.InvoiceHistory;
import com.ey.mms.serenitystepsThemelevel.expectedData.InvoiceReview;
import com.ey.mms.util.EY_FW_Utility;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

/**
 * <h1>Fleet List Page Class</h1> MMS FleetListPage Class containing Page
 * Functions for Fleet List.
 * 
 * @author Ankur Chaudhry
 * @version 1.1
 * @since 2016-07-17
 */


public class CarConfigpage extends PageObject {
	
	private Logger APP_LOGS = null;

	private Logger setLogger() {
		if (APP_LOGS == null)
			APP_LOGS = LogManager.getLogger(CarConfigpage.class.getName());
		return APP_LOGS;
	}

	public void clickcarConfiguration() {
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickCarconfiguration] Clicking Carconfiguration ");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.CarConfiguration_LOCATOR).click();
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}

	public void clickAddButton() {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : clickCarDetailsFieldsAddButton] Clicking clickCarDetailsFieldsAddButton ");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.CarconfigurationAddbutton_LOCATOR).click();
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}

	public void verifyCarDetailsFieldsTabOpened() {
		try {
			setLogger().info("[MMS_CarconfigurationPage : CarDetailsFieldsTabOpened] verify CarDetailsFieldsTabOpened");
			String voidTabOpen = EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.CarDetailsFieldsTab_LOCATOR)
					.getAttribute("aria-expanded");
			EY_FW_Utility.doWait(2000);
			Assert.assertTrue(true, voidTabOpen);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void verifyFleetGridFieldsTabOpened() {
		try {
			EY_FW_Utility.doWait(2000);
			setLogger().info(
					"[MMS_CarconfigurationPage : verifyFleetGridFieldsTabOpened] verify verifyFleetGridFieldsTabOpened");
			String voidTabOpen = EY_FW_Utility
					.findElementByLocator(MMS_CarConfigurationPageLocator.CarconfigurationFleetGridFields_LOCATOR)
					.getAttribute("aria-expanded");
			Assert.assertTrue(true, voidTabOpen);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	public void verifyTabOpen(){
		try{
			setLogger().info("[MMS_CarconfigurationPage : verifyTabEnabled] verify for tab enabled");
			String voidTabOpen=EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.CarDetailsFieldsTab_LOCATOR).getAttribute("aria-expanded");
	} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public boolean verifyCategoriesPresent() {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifyCategoriesPresence] Verifying Fleet Grid Fields Categories are present in the Page");
			boolean FleetGridFieldsCategories = EY_FW_Utility
					.isElementPresent(MMS_CarConfigurationPageLocator.FleetGridFieldsCategories_LOCATOR);
			return (FleetGridFieldsCategories);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}

	public boolean verifySelectedFieldsPanelPresent() {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifySelectedFieldPanelPresence] Verifying Selected fields panel are present in the Page");
			boolean FleetGridFieldsSelectedFields = EY_FW_Utility
					.isElementPresent(MMS_CarConfigurationPageLocator.FleetGridFieldsSelectedFields_LOCATOR);
			return (FleetGridFieldsSelectedFields);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}

	public boolean verifyAddSelectedAndResetButtonPresent() {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifyAddSelectedAndResetPresence] Verifying Add selected and Reset are present in the Page");
			boolean FleetGridFieldsAddSelectedButton = EY_FW_Utility
					.isElementPresent(MMS_CarConfigurationPageLocator.FleetGridFieldsAddSelectedbutton_LOCATOR);
			boolean FleetGridFieldsResetButton = EY_FW_Utility
					.isElementPresent(MMS_CarConfigurationPageLocator.FleetGridFieldsResetbutton_LOCATOR);
			return (FleetGridFieldsAddSelectedButton && FleetGridFieldsResetButton);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}

	public boolean verifySaveButtonPresent() {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifySaveButtonPresence] Verifying Save button present in the Page");
			boolean FleetGridFieldsSaveButton = EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.Savebutton_LOCATOR);
			return (FleetGridFieldsSaveButton);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}

	public boolean verifyCancelButtonPresentBelowSelectedFields() {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifyCancelButtonPresenceBelowSelectedCategory] Verifying Cancel button present below selected fields");
			boolean CancelButton = EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.Cancelbutton_LOCATOR);
			return (CancelButton);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}

	public boolean verifySaveButtonEnabled() {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifySaveButtonEnabled] Verifying Save button enabled in the Page");
			boolean FleetGridFieldsSaveButton = EY_FW_Utility
					.verifyElementIsEnabled(MMS_CarConfigurationPageLocator.Savebutton_LOCATOR);
			return (FleetGridFieldsSaveButton);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}

	public boolean verifySaveButtonDisabled() {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifySaveButtonDisabled] Verifying Save button disabled in the Page");
			boolean FleetGridFieldsSaveButton = EY_FW_Utility
					.verifyElementIsDisabled(MMS_CarConfigurationPageLocator.Savebutton_LOCATOR);
			return (FleetGridFieldsSaveButton);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}

	public void clickSaveButton() {
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickSaveButton] Clicking Save button in the Page");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.Savebutton_LOCATOR).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public boolean verifyGridAndColumnsPresent() {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifyCarConfigurationGridPresence] Verifying Carconfiguration grid is Displayed in the Page");
			boolean carconfigurationgrid = EY_FW_Utility
					.isElementPresent(MMS_CarConfigurationPageLocator.CarDetailsFieldsGrid_LOCATOR);
			boolean carconfigurationgridcheckbox = EY_FW_Utility
					.isElementPresent(MMS_CarConfigurationPageLocator.Carconfigurationgridcheckbox_LOCATOR);
			boolean carconfigurationgridCarKind = EY_FW_Utility
					.isElementPresent(MMS_CarConfigurationPageLocator.CarconfigurationgridCarKind_LOCATOR);
			boolean carconfigurationgridfields = EY_FW_Utility
					.isElementPresent(MMS_CarConfigurationPageLocator.Carconfigurationgridfields_LOCATOR);
			return (carconfigurationgrid && carconfigurationgridcheckbox && carconfigurationgridCarKind
					&& carconfigurationgridfields);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}

	public boolean verifyButtonsAboveGrid() {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifyCarConfigurationButtonsAboveGridPresence] Verifying buttons above Carconfiguration grid is Displayed in the Page");
			boolean carconfigurationAboveGrid = EY_FW_Utility
					.isElementPresent(MMS_CarConfigurationPageLocator.CarDetailsFieldsGrid_LOCATOR);
			boolean carconfigurationAddbutton = EY_FW_Utility
					.isElementPresent(MMS_CarConfigurationPageLocator.CarDetailsFieldsGrid_LOCATOR);
			boolean carconfigurationEditbutton = EY_FW_Utility
					.isElementPresent(MMS_CarConfigurationPageLocator.Carconfigurationgridcheckbox_LOCATOR);
			boolean carconfigurationDeletebutton = EY_FW_Utility
					.isElementPresent(MMS_CarConfigurationPageLocator.CarconfigurationgridCarKind_LOCATOR);
			return (carconfigurationAddbutton && carconfigurationEditbutton && carconfigurationDeletebutton
					&& carconfigurationAboveGrid);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}

	public void clickFleetGridTab() {
		try {
			EY_FW_Utility.waitTillPageLoad(5);
			setLogger().info("[MMS_CarconfigurationPage : clickFleetGridFieldstab] Clicking FleetGridFields tab ");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.CarconfigurationFleetGridFields_LOCATOR).click();
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}

	public void clickCarDetailsFieldsTab() {
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickCarDetailsFieldsTab] Clicking CarDetailsFieldsTab ");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.CarconfigurationCarDetailsFields_LOCATOR).click();
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}

	public void clickSelectAllcheckbox() {
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickSelectAllcheckbox] Clicking Select All checkbox ");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.SelectAllFieldCheckbox_LOCATOR).click();
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}

	public void clickResetButton() {
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickResetButton] Clicking Reset button ");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.FleetGridFieldsResetbutton_LOCATOR).click();
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}
	
	
public void clickOtherCategories() {
		try {
			EY_FW_Utility.waitTillPageLoad(5);
			setLogger().info(
					"[MMS_CarconfigurationPage : clickFleetGridFieldsOtherCategories] Clicking FleetGridFields Other Categories ");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.FleetGridFieldsCategories_LOCATOR).click();
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}

	public void customfieldsPresentUnderAvailableFields(List<List<String>> data) {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifyFleetListGridCustomfieldsPresent] verify Fleet List Grid Custom fields Present ");
			String customfield1 = EY_FW_Utility
					.findElementByLocator(MMS_CarConfigurationPageLocator.FleetGridFieldsOtherCategoriesCustomField1_LOCATOR)
					.getText();
			String customfield2 = EY_FW_Utility
					.findElementByLocator(MMS_CarConfigurationPageLocator.FleetGridFieldsOtherCategoriesCustomField2_LOCATOR)
					.getText();
			String customfield3 = EY_FW_Utility
					.findElementByLocator(MMS_CarConfigurationPageLocator.FleetGridFieldsOtherCategoriesCustomField3_LOCATOR)
					.getText();
			if (customfield1.equalsIgnoreCase(data.get(0).get(0)) && customfield2.equalsIgnoreCase(data.get(1).get(0))
					&& customfield3.equalsIgnoreCase(data.get(2).get(0))) {
				Assert.assertTrue(true, "custom fields presence");
			} else {
				Assert.assertTrue(false, "custom fields not same");
			}

		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}

	public void customfieldsPresentUnderCategory(List<List<String>> data) {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifyCarDetailsFieldsCustomfieldsPresent] verify Car Details fields Custom fields Present ");
			String customfield1 = EY_FW_Utility
					.findElementByLocator(MMS_CarConfigurationPageLocator.CarDetailsFieldsOtherCategoriesCustomField1_LOCATOR)
					.getText();
			String customfield2 = EY_FW_Utility
					.findElementByLocator(MMS_CarConfigurationPageLocator.CarDetailsFieldsOtherCategoriesCustomField2_LOCATOR)
					.getText();
			String customfield3 = EY_FW_Utility
					.findElementByLocator(MMS_CarConfigurationPageLocator.CarDetailsFieldsOtherCategoriesCustomField3_LOCATOR)
					.getText();
			if (customfield1.equalsIgnoreCase(data.get(0).get(0)) && customfield2.equalsIgnoreCase(data.get(1).get(0))
					&& customfield3.equalsIgnoreCase(data.get(2).get(0))) {
				Assert.assertTrue(true, "custom fields presence");
			} else {
				Assert.assertTrue(false, "custom fields not same");
			}

		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}

	public boolean verifySelectAllPresent() {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifySelectAllUnderAvailableFields] Verifying SelectAll under Available Fields");
			boolean FleetGridFieldsSelectAllCheckbox = EY_FW_Utility
					.isElementPresent(MMS_CarConfigurationPageLocator.SelectAllCheckbox_LOCATOR);
			return (FleetGridFieldsSelectAllCheckbox);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}

	public boolean verifySelectAllPresentUnderCategory() {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifySelectAllPresentUnderCategory] Verifying SelectAll under Available Fields Under  Catrgory");
			boolean CarDetailsFieldsSelectAllCheckbox = EY_FW_Utility
					.isElementPresent(MMS_CarConfigurationPageLocator.CarDetailsFieldsSelectAllCheckbox_LOCATOR);
			return (CarDetailsFieldsSelectAllCheckbox);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}

	public boolean verifyCarDetailsFieldsAddWizard() {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifyCarDetailsFieldsAddWizard] Verifying Car Details Fields AddWizard");
			boolean CarKindLabel = EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.CarKindLabel_LOCATOR);
			boolean CarKindDropdown = EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.CarKindDropdown_LOCATOR);
			return (CarKindLabel && CarKindDropdown);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}

	public void selectCustomfieldsFromAvailableFields(List<List<String>> customfields) {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : selectCustomfieldsFromAvailableFields] select Custom fields from Available Fields ");
			for (int i = 0; i < customfields.get(0).size(); i++) {
				EY_FW_Utility
						.findElementByLocator(MMS_CarConfigurationPageLocator.FleetGridFieldsOtherCategoriesCustomField1_LOCATOR)
						.click();
			}
			for (int i = 0; i < customfields.get(1).size(); i++) {
				EY_FW_Utility
						.findElementByLocator(MMS_CarConfigurationPageLocator.FleetGridFieldsOtherCategoriesCustomField2_LOCATOR)
						.click();
			}
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}

	public void selectCustomfieldsFromAvailableFieldsCarDetailsFields(List<List<String>> customfields) {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : selectCustomfieldsFromAvailableFields] select Custom fields from Available Fields ");
			for (int i = 0; i < customfields.get(0).size(); i++) {
				EY_FW_Utility
						.findElementByLocator(MMS_CarConfigurationPageLocator.CarDetailsFieldsOtherCategoriesCustomField1_LOCATOR)
						.click();
			}
			for (int i = 0; i < customfields.get(1).size(); i++) {
				EY_FW_Utility
						.findElementByLocator(MMS_CarConfigurationPageLocator.CarDetailsFieldsOtherCategoriesCustomField2_LOCATOR)
						.click();
			}
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}

	public void addSelected() {
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickAddSelectedButton] click on Add Selected button ");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.FleetGridFieldsAddSelectedButton_LOCATOR).click();
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
		}
	}

	public void customfieldsPresentUnderSelectedFields(List<List<String>> data) {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifyFleetListGridCustomfieldsPresent] verify Fleet List Grid Custom fields Present ");
			String customfield1 = EY_FW_Utility
					.findElementByLocator(MMS_CarConfigurationPageLocator.FleetGridFieldsSelectedFieldsCustomField1_LOCATOR)
					.getText();
			String customfield2 = EY_FW_Utility
					.findElementByLocator(MMS_CarConfigurationPageLocator.FleetGridFieldsSelectedFieldsCustomField2_LOCATOR)
					.getText();
			if (customfield1.contains(data.get(0).get(0)) && customfield2.contains(data.get(1).get(0))) {
				Assert.assertTrue(true, "custom fields present under selected fields");
			} else {
				Assert.assertTrue(false, "custom fields not present under selected fields");
			}

		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
		}
	}

	public void customfieldsPresentUnderCarDetailsFieldsSelectedFields(List<List<String>> data) {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : customfieldsPresentUnderCarDetailsFieldsSelectedFields] verify Car Details Fields Custom fields Present ");
			String customfield1 = EY_FW_Utility
					.findElementByLocator(MMS_CarConfigurationPageLocator.CarDetailsFieldsSelectedFieldsCustomField1_LOCATOR)
					.getText();
			String customfield2 = EY_FW_Utility
					.findElementByLocator(MMS_CarConfigurationPageLocator.CarDetailsFieldsSelectedFieldsCustomField2_LOCATOR)
					.getText();
			if (customfield1.contains(data.get(0).get(0)) && customfield2.contains(data.get(1).get(0))) {
				Assert.assertTrue(true, "custom fields present under selected fields");
			} else {
				Assert.assertTrue(false, "custom fields not present under selected fields");
			}

		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
		}
	}

	public void customfieldsRemovedFromAvailableFields(List<List<String>> data) {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifyFleetListGridCustomfieldsRemovedFromAvailableFields] verify Fleet List Grid Custom fields Removed ");
			String customfield1 = EY_FW_Utility
					.findElementByLocator(MMS_CarConfigurationPageLocator.FleetGridFieldsOtherCategoriesCustomField3_LOCATOR)
					.getText();
			if (!customfield1.equalsIgnoreCase(data.get(0).get(0))
					&& customfield1.equalsIgnoreCase(data.get(1).get(0))) {
				Assert.assertTrue(true, "custom fields removed");
			}
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}

	public void customfieldsRemovedFromAvailableFieldsofCarDetailsFields(List<List<String>> data) {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : customfieldsRemovedFromAvailableFieldsofCarDetailsFields] verify Car Details Fields Custom fields Removed ");
			String customfield1 = EY_FW_Utility
					.findElementByLocator(MMS_CarConfigurationPageLocator.CarDetailsFieldsOtherCategoriesCustomField3_LOCATOR)
					.getText();
			if (!customfield1.equalsIgnoreCase(data.get(0).get(0))
					&& customfield1.equalsIgnoreCase(data.get(1).get(0))) {
				Assert.assertTrue(true, "custom fields removed");
			}
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}

	public boolean verifyReorderandCancelIconPresent() {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifyReorderIconUnderSelectedFields] Verifying Reorder icon under Selected Fields");
			boolean ReorderIcon = EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.ReorderIcon_LOCATOR);
			boolean CancelIcon = EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.CancelIcon_LOCATOR);
			return (ReorderIcon && CancelIcon);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}
	
	public boolean verifyPopupButtons() {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifyPopupButtons] Verifying Popup buttons");
			boolean PopupOkbutton = EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.PopupOKButton_LOCATOR);
			boolean PopupCancelbutton = EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.PopupCancelButton_LOCATOR);
			return (PopupOkbutton && PopupCancelbutton);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}

	public boolean verifyReorderIconPresentInCarDetailsFields() {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifyReorderIconPresentInCarDetailsFields] Verifying Reorder icon under Selected Fields of Car Details page");
			boolean ReorderIcon = EY_FW_Utility
					.isElementPresent(MMS_CarConfigurationPageLocator.CarDetailsFieldsReorderIcon_LOCATOR);
			boolean CancelIcon = EY_FW_Utility
					.isElementPresent(MMS_CarConfigurationPageLocator.CarDetailsFieldsCancelIcon_LOCATOR);
			return (ReorderIcon && CancelIcon);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}

	@Step
	public void verifyNoDataInGrid() {
		EY_FW_Utility.doWait(3000);
		try {
			setLogger()
					.info("[MMS_CarconfigurationPage : verifyNoDataAvaiableInTable] verify NO DATA AVAILABLE IN GRID ");
			WebElement wb = EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.NODATAGRID_LOCATOR);
			String data = wb.getText();
			MatcherAssert.assertThat(data, equalTo(Carconfiguration.CARCONFIGURATION_CARDETAILSFIELDS_NODATA_TEXT));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void verifyNoCustomFieldsUnderCategorySelected() {
		EY_FW_Utility.doWait(3000);
		try {
			setLogger()
					.info("[MMS_CarconfigurationPage : verifyNoFieldsUnderCategory] verify NO FIELDS UNDER CATEGORY ");
			WebElement wb = EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.NOFIELDSUNDERCATEGORY_LOCATOR);
			String data = wb.getText();
			MatcherAssert.assertThat(data, equalTo(Carconfiguration.CARCONFIGURATION_NOFIELDSUNDERCATEGORY_TEXT));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	@Step
	public void selectCarKind(String carkind) {
		try {
			setLogger().info("[MMS_CarconfigurationPage : selectCarKind] Select Car Kind ");
			EY_FW_Utility.selectDropDownElementByValue(MMS_CarConfigurationPageLocator.CarKindDropdown_LOCATOR, carkind);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public boolean carKindAddedInCarDetailsFieldsGrid() {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : carKindAddedInCarDetailsFieldsGrid] Verifying Car Kind added to grid");
			boolean carkindrow = EY_FW_Utility
					.isElementPresent(MMS_CarConfigurationPageLocator.CarDetailsFieldsCarKindRowInGrid_LOCATOR);
			return (carkindrow);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}

	public void verifyCarKindValue(String carkind) {
		try {
			setLogger().info("[MMS_CarconfigurationPage : verifyCarKindValueInGrid] verify Car Kind value in grid ");
			String carKindColumnvalue = EY_FW_Utility
					.findElementByLocator(MMS_CarConfigurationPageLocator.CarDetailsFieldsCarKindValueInGrid_LOCATOR).getText();
			if (carKindColumnvalue.equalsIgnoreCase(carkind)) {
				Assert.assertTrue(true, "ExpectedcCar kind added to Grid");
			}
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}

	public void verifySelectedfieldsValue(String selectedfields) {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifyselectedfieldsValueInGrid] verify selectedfields value in grid ");
			String carselectedfieldsvalue = EY_FW_Utility
					.findElementByLocator(MMS_CarConfigurationPageLocator.CarDetailsFieldsSelectedFieldsValueInGrid_LOCATOR)
					.getText();
			if (carselectedfieldsvalue.equalsIgnoreCase(selectedfields)) {
				Assert.assertTrue(true, "Expected selected fields added to Grid");
			}
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}

	public void verifyAlertMessageForCarKind(String alertmessage) {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifyAlertMessageForCarKind] verify Alert Message For Car Kind");
			String carKindalertmessage = EY_FW_Utility
					.findElementByLocator(MMS_CarConfigurationPageLocator.CarDetailsFieldsCarKindAlertMessage_LOCATOR).getText();
			if (carKindalertmessage.equalsIgnoreCase(alertmessage)) {
				Assert.assertTrue(true, "Expected Car Kind alert message");
			}
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}
	
	public void verifyDeleteConfirmationMessage(String alertmessage) {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifyDeleteConfirmationMessage] verify Delete Confirmation Message");
			String carKindalertmessage = EY_FW_Utility
					.findElementByLocator(MMS_CarConfigurationPageLocator.CarDetailsFieldsDeleteAlertMessage_LOCATOR).getText();
			if (carKindalertmessage.equalsIgnoreCase(alertmessage)) {
				Assert.assertTrue(true, "Expected Delele confirmation message");
			}
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}
	
	public void selectCarKindCheckbox() {
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickFleetGridFieldstab] Clicking FleetGridFields tab ");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.CarKindcheckbox_LOCATOR).click();
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}
	
	public void clickEditButtonOfCarDetailsFields() {
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickEditButtonOfCarDetailsFields] Clicking Edit Button Of Car Details Fields tab ");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.CarconfigurationEditbutton_LOCATOR).click();
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}
	
	public void clickDeleteButtonOfCarDetailsFields() {
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickDeleteButtonOfCarDetailsFields] Clicking Delete Button Of Car Details Fields tab ");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.CarconfigurationDeletebutton_LOCATOR).click();
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}
	
	public void clickOkButtonOfDeletePopup() {
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickOkButtonOfDeletePopup] Clicking Ok Button Of confirmation popup ");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.PopupOKButton_LOCATOR).click();
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}
	
	public void clickOkButtonOfCarKindPopup() {
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickOkButtonOfDeletePopup] Clicking Ok Button Of confirmation popup ");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.PopupOKButton_LOCATOR).click();
		} catch (Exception e) {
			setLogger().error("[MMS_CarconfigurationPage : clickCarconfiguration] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));

		}
	}
	
	public boolean verifyCarKindDropdownDisabled() {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : verifyCarKindDropdownDisabled] Verifying CarKind Dropdown Disabled in the Page");
			boolean CarKindDropdown = EY_FW_Utility
					.verifyElementIsDisabled(MMS_CarConfigurationPageLocator.CarKindDropdown_LOCATOR);
			return (CarKindDropdown);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}
	
	public void clickSelectAllcheckboxfromAvialableCategory() {
		try {
			setLogger().info(
					"[MMS_CarconfigurationPage : clickSelectAllcheckboxfromAvialableCategory] click SelectAll checkbox from Avialable Category in the Page");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.CarDetailsFieldsSelectAllCheckbox_LOCATOR).click();
			
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		
	}

	public boolean verifyGridPresent(){
		   try{
			   setLogger().info("[MMS_CarconfigurationPage : verifyCarConfigurationGridPresence] Verifying Carconfiguration grid is Displayed in the Page" );
			   boolean  carconfigurationgrid= EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.CarDetailsFieldsGrid_LOCATOR);
			   boolean  carconfigurationgrid1= EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.CarDetailsFieldsGrid_LOCATOR);
			   boolean  carconfigurationgrid2= EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.CarDetailsFieldsGrid_LOCATOR);
			   
			   return (carconfigurationgrid && carconfigurationgrid1 && carconfigurationgrid2) ;
		   }
		   catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
		    }
			return false;
	   }

	
	public boolean verifyButtonsPresent(){
		   try{
			   setLogger().info("[MMS_CarconfigurationPage : verifyButtonsPresent] Verifying buttons present above the Grid" );
			   boolean  addButton= EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.ADD_BUTTON);
			   boolean  editButton= EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.EDIT_BUTTON);
			   boolean  deleteButton= EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.DELETE_BUTTON);
			   
			   return (addButton && editButton && deleteButton) ;
		   }
		   catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
		    }
			return false;
	   }
	
	public boolean verifyTabsPresent(){
		 try{
			   setLogger().info("[MMS_CarconfigurationPage : verifyTabsPresent] Verifying Tabs present above the Grid" );
			   boolean  fleetGridFields= EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.FLEETGRIDFIELD_TAB);
			   boolean  defineCustomFields= EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.DEFINECUSTOM_TAB);
			   //boolean  deleteButton= EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.DELETE_BUTTON).isDisplayed();
			   
			   return (fleetGridFields && defineCustomFields) ;
		   }
		   catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
		    }
			return false;
	}
	
	public void clickDefineCustomField(){
		
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickDefineCustomField] Clicking Define Custom Field Tab ");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.DEFINECUSTOM_TAB).click();
		} catch (Exception e) {
			setLogger()
					.error("[MMS_CarconfigurationPage : clickDefineCustomField] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));
			
		}
	}
	
	public boolean verifyCustomGridColumn(){
		try{
			   setLogger().info("[MMS_CarconfigurationPage : verifyCustomGridColumn] Verifying Grid colum of Define Custom Field" );
			   boolean  customCheckBox= EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.CUSTOM_CHECKBOX);
			   boolean  searchFieldName= EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.SEARCH_FIELDNAME);
			   boolean  searchDataType= EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.SEARCH_DATATYPE);
			   
			   return (customCheckBox && searchFieldName && searchDataType) ;
		   }
		   catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
		    }
			return false;
	}
	
	public void verifyDefineCustomFieldWithNoData() {
		try {
			System.out.println(
					"[MMS_CarconfigurationPage : defineCustomFieldWithNodata] Verifying define custom field with no data "+Carconfiguration.DEFINECUSTOMGRID_NODATA);
			
			WebElement wb = EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.DEFINECUSTOMFIELD_NODATA);
			String gridWithNodata = wb.getText();
			//System.out.println(gridWithNodata);
			
			MatcherAssert.assertThat(gridWithNodata, equalTo(Carconfiguration.DEFINECUSTOMGRID_NODATA));
		}

		catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

    }
	
	public boolean verifyPaginationDropDown(){
		try{
			   setLogger().info("[MMS_CarconfigurationPage : verifyPaginationDropDown] Verifying Pagination Dropdown is displayed" );
			   boolean  paginationDropdown= EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.PAGINATION_DROPDOWN).isDisplayed();
			   
			   return paginationDropdown;
		   }
		   catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
		    }
			return false;
	}
	
	
	public void addButtoninDefineCustomField(){
			
			try {
				
				setLogger().info("[MMS_CarconfigurationPage : addButtoninDefineCustomField] Clicking Add Button in Define Custom Page");
				EY_FW_Utility.doWait(8000);
				EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.ADD_BUTTON).click();
			} catch (Exception e) {
				setLogger()
						.error("[MMS_CarconfigurationPage : addButtoninDefineCustomField] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));
				
			}
		}

	public void enterFieldName(String text) {
	      try {
	    	    setLogger().info("[MMS_CarconfigurationPage : enterFieldName] Enter Field Name in the TextBox");
				//EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.FIELDNAME_DEFINECUSTOMFIELD);
				
				EY_FW_Utility.enterText(MMS_CarConfigurationPageLocator.FIELDNAME_DEFINECUSTOMFIELD, text);
				
				} catch (Exception e) {
				
				MatcherAssert.assertThat(e.getMessage(), false);
				  }
			}

	public void selectDataType(String data) {
	      try {
	    	    setLogger().info("[MMS_CarconfigurationPage : selectDataType] Select Data Type in the Dropdown");
				
				EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.DATATYPE_DEFINECUSTOMFIELD).click();
				EY_FW_Utility.doWait(2000);
				
				EY_FW_Utility.selectDropDownElementByVisibleText(MMS_CarConfigurationPageLocator.DATATYPE_DEFINECUSTOMFIELD, data);
				EY_FW_Utility.doWait(2000);
				EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.DATATYPE_DEFINECUSTOMFIELD).click();
	    	    
				} catch (Exception e) {
				
				MatcherAssert.assertThat(e.getMessage(), false);
			}
		}
	public void clickDefineSaveButton(){
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickSaveButton] Clicking on Save Button");
			EY_FW_Utility.doWait(5000);
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.SAVE_DEFINECUSTOMFIELD).click();
			EY_FW_Utility.waitForModalBackgroundFadeToDisappear(6);
		} catch (Exception e) {
			setLogger()
					.error("[MMS_CarconfigurationPage : clickSaveButton] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));
			
		}
	}
	
	public void clickNotificationArea(){
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickNotificationArea] Clicking on Activity History Notification Area");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.DEFINECUSTOMFIELD_NOTIFICATION_LOCATOR).click();
			EY_FW_Utility.doWait(5000);
		} catch (Exception e) {
			setLogger()
					.error("[MMS_CarconfigurationPage : clickSaveButton] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));
			
		}
		
		
	}
	
	public boolean recordsInDefineCustomField(){
		try{
			   setLogger().info("[MMS_CarconfigurationPage : recordsInDefineCustomField] Verifying Records Added are availbale in the Grid" );
			   
			   boolean recordsInGrid= EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.RECORDSIN_DEFINECUSTOMFIELD).isDisplayed();
			   
			   return recordsInGrid ;
		   }
		   catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
		    }
			return false;
	}
	
	public boolean checkboxAvailableBesideEachRecord(){
		try{
			   setLogger().info("[MMS_CarconfigurationPage : checkboxAvailableBesideEachRecord] Verifying Checkbbox Availabe after each record in the Grid" );  
			   boolean recordsInGrid= EY_FW_Utility.verifyElementIsNotPresent(MMS_CarConfigurationPageLocator.CHECKBOXAVAILBLE_FOREACHRECORDINTHEGRID);
			   return recordsInGrid ;
		   }
		   catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
		    }
			return false;
	}
	
	public boolean isSaveButtonNotPresent() {
	    try {
	    	setLogger().info("[MMS_CarconfigurationPage : isSaveButtonPresent] Verifying Save Button is not Present in the Grid" );
	    	EY_FW_Utility.verifyElementIsNotPresent(MMS_CarConfigurationPageLocator.SAVE_DEFINECUSTOMFIELD);
	    	return true;
	    } catch (Exception e) {
	    	setLogger()
			.error("[MMS_CarconfigurationPage : isSaveButtonNotPresent] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));
	    	return false;
	    }
	}
	
	public boolean isCancelButtonNotPresent() {
	    try {
	    	setLogger().info("[MMS_CarconfigurationPage : isCancelButtonPresent] Verifying Cancel Button is not Present in the Grid" );
	    	EY_FW_Utility.verifyElementIsNotPresent(MMS_CarConfigurationPageLocator.CANCEL_DEFINECUSTOMFIELD);
	    	return true;
	    } catch (Exception e) {
	    	setLogger()
			.error("[MMS_CarconfigurationPage : isCancelButtonNotPresent] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));
	    	return false;
	    }
	}
	
	public void clickOkButton(){
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickOkButton] Clicking on Ok button in the POPUP");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.POPUP_OK_BUTTON).click();
			
		} catch (Exception e) {
			setLogger()
					.error("[MMS_CarconfigurationPage : clickOkButton] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));
			
		}
		
		
	}
	
	public void clickCustomFieldCrossButton(){
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickCustomFieldCrossButton] Click on Custom Field Cross Button");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.CUSTOMFIELD_CROSS_BUTTON).click();
			
		} catch (Exception e) {
			setLogger()
					.error("[MMS_CarconfigurationPage : clickCustomFieldCrossButton] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));
			
		}
	}
	
	public void clickCheckbox(){
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickCheckbox] Click on Checkbox to delete");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.CUSTOM_CHECKBOX).click();
			
		} catch (Exception e) {
			setLogger()
					.error("[MMS_CarconfigurationPage : clickCheckbox] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));
			
		}
	}
	
	public void clickDeleteButton(){
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickDeleteButton] Click on Delete Button");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.DELETE_BUTTON).click();
			
		} catch (Exception e) {
			setLogger()
					.error("[MMS_CarconfigurationPage : clickCheckbox] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));
			
		}
	}
	
	public boolean isOKButtonPresent() {
	    try {
	    	setLogger().info("[MMS_CarconfigurationPage : isOKButtonPresent] Verifying Ok Button in the Popup" );
	        boolean OkButtonPresent=EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.POPUP_OK_BUTTON);
	    	return OkButtonPresent;
	    } catch (org.openqa.selenium.TimeoutException e) {
	        
	    	Assert.assertTrue(false, e.getMessage());
	    }
	    
	    return false;
	}
	
	public boolean isCancelButtonPresentInPopup() {
	    try {
	    	setLogger().info("[MMS_CarconfigurationPage : isCancelButtonPresentInPopup] Verifying Cancel Button in Popup" );
	    	boolean cancelButtonPresent=EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.POPUP_CANCEL_BUTTON);
	    	return cancelButtonPresent;
	    } catch (org.openqa.selenium.TimeoutException e) {
	        
	    	Assert.assertTrue(false, e.getMessage());
	    }
	    
	    return false;
	}
	
	public void clickFirstCheckboxInDefineCustomField(){
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickFirstCheckboxInDefineCustomField] Select First Checkbox in Define CustomField To Edit");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.CUSTOMFIELD_FIRSTCHECKBOX).click();
			
		} catch (Exception e) {
			setLogger()
					.error("[MMS_CarconfigurationPage : clickFirstCheckboxInDefineCustomField] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));
			
		}
	}
	
	public void clickEditButton(){
		try {
			setLogger().info("[MMS_CarconfigurationPage : clickEditButton] Click on Edit Button of Define Custom Field");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.EDIT_BUTTON).click();
			
		} catch (Exception e) {
			setLogger()
					.error("[MMS_CarconfigurationPage : clickEditButton] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));
			
		}
	}
	
	public void editCustomField(String customField) {
		try {
			setLogger().info("[MMS_CarconfigurationPage : editCustomField] Edit Customfield Name");
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.CUSTOMFIELD_EDITBOX).clear();
			EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.CUSTOMFIELD_EDITBOX).sendKeys(customField);
			// EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.Inv_Number).sendKeys(Keys.TAB);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	
	public boolean isTextBoxEditable() {
	    try {
	    	setLogger().info("[MMS_CarconfigurationPage : isCancelButtonPresentInPopup] Verifying Cancel Button in Popup" );
	    	EY_FW_Utility.findElementByLocator(MMS_CarConfigurationPageLocator.CUSTOMFIELD_EDITBOX).getAttribute("readonly");
	    	return true;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        
	    	return false;
	    }
	}
	
	public boolean isSaveButtonIsEnabled(){
		try{
			   setLogger().info("[MMS_CarconfigurationPage : isSaveButtonIsEnabled] Verifying Save button is Enabled" );
			   boolean  saveButtonIsEnabled= EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.SAVE_DEFINECUSTOMFIELD);
			 
			   
			   return saveButtonIsEnabled;
		   }
		   catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
		    }
			return false;
	}
	
	
	public boolean isCancelButtonIsEnabled(){
		try{
			   setLogger().info("[MMS_CarconfigurationPage : isCancelButtonIsEnabled] Verifying Save button is Enabled" );
			   boolean  cancelButtonIsEnabled= EY_FW_Utility.isElementPresent(MMS_CarConfigurationPageLocator.CANCEL_DEFINECUSTOMFIELD);
			 
			   
			   return cancelButtonIsEnabled;
		   }
		   catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
		    }
			return false;
	}

}
