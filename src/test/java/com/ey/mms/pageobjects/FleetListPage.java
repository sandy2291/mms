/**
 * @Copyright Copyright (C) 2016 General Electric Company. All rights reserved.
 */
package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.*;
import com.ey.mms.serenitystepsThemelevel.expectedData.FleetList;
import com.ey.mms.util.EY_FW_Utility;

import net.serenitybdd.core.pages.PageObject;

/**
 * <h1>Fleet List Page Class</h1> MMS FleetListPage Class containing Page
 * Functions for Fleet List.
 * 
 * @author Ankur Chaudhry
 * @version 1.1
 * @since 2016-07-17
 */

public class FleetListPage extends PageObject {

	private Logger APP_LOGS = null;

	private Logger setLogger() {
		if (APP_LOGS == null)
			APP_LOGS = LogManager.getLogger(FleetListPage.class.getName());
		return APP_LOGS;
	}

	public void clickFleetFilterButton() {
		try {
			setLogger().info("[MMS_FleetListPage : clickFleetFilterButton] Clicking Fleek filter button");
			// EY_FW_Utility.doWait(5000);
			EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.FLEET_BUTTON_LOCATOR).click();
		} catch (Exception e) {
			setLogger().error("[MMS_FleetListPage : clickFleetFilterButton] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void enterFleetCarInital(String s) { try { setLogger().
	 * info("[MMS_FleetListPage : enterFleetCarInital] Entering fleet car initial as AOKR"
	 * ); EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.
	 * FLEET_CARINITIAL_INPUTBOX_LOCATOR).sendKeys(s); } catch (Exception e) {
	 * setLogger().error(
	 * "[MMS_FleetListPage : enterFleetCarInital] Exception thrown -- " +
	 * EY_FW_Utility.getStackTrace(e)); Assert.assertTrue(false,
	 * e.getMessage()); } }
	 */

	public void clickFleetFilterSaveButton() {
		try {
			setLogger().info("[MMS_FleetListPage : clickFleetFilterSaveButton] Clicking Fleet Filter Save Button");
			// EY_FW_Utility.doWait(5000);
			EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.FLEET_FILTER_SAVE_BUTTON_LOCATOR).click();
		} catch (Exception e) {
			setLogger().error("[MMS_FleetListPage : clickFleetFilterSaveButton] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void verifyFleetListPageTitle() { try { setLogger().
	 * info("[MMS_FleetListPage : verifyFleetListPageTitle] Verifying Fleet List Page Title as "
	 * + MMS_ExpectedResult.FLEETLIST_PAGE_TITLE);
	 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.FLEETLIST_PAGE_TITLE)); } catch (Exception e)
	 * { setLogger().
	 * error("[MMS_FleetListPage : verifyFleetListPageTitle] Exception thrown -- "
	 * + EY_FW_Utility.getStackTrace(e)); Assert.assertTrue(false,
	 * e.getMessage()); } catch (AssertionError e) { setLogger().
	 * error("[MMS_FleetListPage : verifyFleetListPageTitle] Assert Failure -- "
	 * + EY_FW_Utility.getStackTrace(e)); Assert.assertTrue(false,
	 * e.getMessage()); } }
	 */

	public void verifyListOfResults() {
		try {
			setLogger().info("[MMS_FleetListPage : verifyListOfResults] Verifying List of results displayed");
			List<WebElement> emptyOrNot = EY_FW_Utility
					.getElementListByLocator(MMS_FleetListPageLocator.FLEET_FILTER_RESULTS_LIST_LOCATOR);
			MatcherAssert.assertThat(emptyOrNot, not(hasSize(1)));
			// EY_FW_Utility.doWait(5000);
			List<WebElement> carInitialsTestDataColumnList = EY_FW_Utility
					.getElementListByLocator(MMS_FleetListPageLocator.FLEET_FILTER_RESULTS_CARINTIAL_LIST_LOCATOR);
			List<String> carInitialsTestDataValuesList = new ArrayList<String>();

			for (WebElement eachCarIntialColumn : carInitialsTestDataColumnList) {
				carInitialsTestDataValuesList.add(eachCarIntialColumn.getText());
			}
			MatcherAssert.assertThat(carInitialsTestDataValuesList,
					hasItem(FleetList.FLEETLIST_FLEET_SEARCH_RESULT));
		} catch (Exception e) {
			setLogger().error(
					"[MMS_FleetListPage : verifyListOfResults] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		} catch (AssertionError e) {
			setLogger().error(
					"[MMS_FleetListPage : verifyListOfResults] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void clickFleetFilterButton() { try { System.out.
	 * println("[MMS_FleetListPage : clickFleetFilterButton] Clicking Fleek filter button"
	 * );
	 * EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.FLEET_BUTTON_LOCATOR
	 * ).click(); } catch (Exception e) { Assert.assertTrue(false,
	 * e.getMessage()); } }
	 */
	public void enterFleetCarInital(String carInitial) {
		try {
			System.out.println("[MMS_FleetListPage : enterFleetCarInital] Entering fleet car initial as AOKR");
			EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.FLEET_CARINITIAL_INPUTBOX_LOCATOR).clear();
			EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.FLEET_CARINITIAL_INPUTBOX_LOCATOR)
					.sendKeys(carInitial);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void clickFleetFilterSaveButton() { try { System.out.
	 * println("[MMS_FleetListPage : clickFleetFilterSaveButton] Clicking Fleet Filter Save Button"
	 * ); EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.
	 * FLEET_FILTER_SAVE_BUTTON_LOCATOR).click(); } catch (Exception e) {
	 * Assert.assertTrue(false, e.getMessage()); } }
	 */
	public void clickCloseCarInitial() {
		try {

			System.out.println("[MMS_FleetListPage : clickcloseCarInitial] Clicking Fleet list Car Initial close");
			EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.FLEET_CAR_INITIAL_CLOSE_LOCATOR).click();

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void verifyFleetListPageTitle() { System.out.
	 * println("[MMS_FleetListPage : verifyFleetListPageTitle] Verifying Fleet List Page Title as "
	 * + MMS_ExpectedResult.FLEETLIST_PAGE_TITLE);
	 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.FLEETLIST_PAGE_TITLE));
	 * EY_FW_Utility.doWait(2000); }
	 */
	/*
	 * public void verifyListOfResults() { try { System.out.
	 * println("[MMS_FleetListPage : verifyListOfResults] Verifying List of results displayed"
	 * ); List<WebElement> emptyOrNot = EY_FW_Utility
	 * .getAllElementsByAnyLocator(MMS_Locators.
	 * FLEET_FILTER_RESULTS_LIST_LOCATOR); MatcherAssert.assertThat(emptyOrNot,
	 * not(hasSize(1))); EY_FW_Utility.doWait(5000); List<WebElement>
	 * carInitialsTestDataColumnList = EY_FW_Utility
	 * .getAllElementsByAnyLocator(MMS_Locators.
	 * FLEET_FILTER_RESULTS_CARINTIAL_LIST_LOCATOR); List<String>
	 * carInitialsTestDataValuesList = new ArrayList<String>();
	 * 
	 * for (WebElement eachCarIntialColumn : carInitialsTestDataColumnList) {
	 * carInitialsTestDataValuesList.add(eachCarIntialColumn.getText()); }
	 * MatcherAssert.assertThat(carInitialsTestDataValuesList,
	 * hasItem(MMS_ExpectedResult.FLEETLIST_FLEET_SEARCH_RESULT));
	 * EY_FW_Utility.doWait(2000); } catch (Exception e) {
	 * Assert.assertTrue(false, e.getMessage()); } }
	 */

	public void clickCarCheckbox() {
		try {
			System.out.println(
					"[MMS_FleetListPage : clickCarCheckbox] select a checkbox with Car Initial And Car Number according to feature file");
			EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.FLEET_CAR_INITIAL_CHECKBOX_LOCATOR)
					.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickAction() {
		try {
			System.out.println("[MMS_FleetListPage : clickAction] clicking on Action");
			EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.FLEET_ACTION_LOCATOR).click();

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickFilter() {
		try {
			System.out.println("[MMS_FleetListPage : clickFilter] clicking on Filter");
			EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.FLEET_FILTER_BUTTON_LOCATOR).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickActionDetail() {
		try {
			System.out.println("[MMS_FleetListPage : clcikActionDetail] clicking on Details under Action");
			EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.FLEET_ACTION_DETAILS_LOCATOR).click();

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickInvoiceDelete() {
		try {
			System.out.println("[MMS_FleetListPage : clcikActionDetail] clicking on Details under Action");
			EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.FLEET_CHECKBOX_DELETEINVOICE_LOCATOR)
					.click();

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void clickInvoiceActionDelete() {
		try {
			System.out
					.println("[MMS_FleetListPage : clickInvoiceActionDelete] clicking on Action for Deleteing Invoice");
			EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.FLEET_ACTION_DELETEINVOICE_LOCATOR)
					.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickInvoiceActionDetailDelete() {
		try {
			System.out.println(
					"[MMS_FleetListPage : clickInvoiceActionDetailDelete] clicking on Details under Action for Deleteing Invoice");
			EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.FLEET_ACTION_DETAILS_DELETEINVOICE_LOCATOR)
					.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickCarHistoryAction() {
		try {
			System.out.println("MMS_FleetListPage : clickCarHistoryAction] clicking on Action in Car History");
			EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.FLEET_CARHISTORY_ACTION_LOCATOR).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clcikCarHistoryActionEdit() {
		try {
			System.out.println(
					"MMS_FleetListPage : clcikCarHistoryActionEdit] clicking on edit Under Action in Car History Grid");
			EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.FLEET_CARHISTORY_ACTION_EDIT_LOCATOR)
					.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterEditHistoryInitial(String carInitial) {
		try {
			System.out.println("[MMS_FleetListPage : enterEditHistoryInitial] Entering '" + carInitial
					+ "' in Lease Car Initial ");
			WebElement editInitial = EY_FW_Utility
					.findElementByLocator(MMS_FleetListPageLocator.FLEET_EDITHISTORY_INITIAL_INPUT_LOCATOR);
			editInitial.sendKeys(carInitial);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterEditHistoryEndDate(String date) {
		try {
			System.out.println("[MMS_FleetListPage : enterEditHistoryInitial] Entering '" + date
					+ "' in End Date in Edit History Page ");
			WebElement edithistoryEndDate = EY_FW_Utility
					.findElementByLocator(MMS_FleetListPageLocator.FLEET_CARHISTORY_EDITHISTORY_ENDDATE_LOCATOR);
			edithistoryEndDate.sendKeys(date);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void clickCarHistoryActionDelete() {
		try {
			System.out.println(
					"MMS_FleetListPage : clickCarHistoryActionDelete] clicking on delete Under Action in Car History Grid");
			EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.FLEET_CARHISTORY_ACTION_DELETE_LOCATOR)
					.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickFleetListDeleteInvoiceOK() {
		try {
			EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.Confirm_Delete).click();
			/*Screen s = new Screen();
			String path = System.getProperty("user.dir");
			Pattern p = new Pattern(path+"/"+MMS_FleetListPageLocator.Invoice_DELETE_CONFIRM);
			s.click(p);*/
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void verifyFleetFilterDeleteInvoice() { try { System.out.println(
	 * "[MMS_ReportHistoryPage : verifyFleetFilterDeleteInvoice] Verifying The data in Grid after deleteing the selected Invoice "
	 * + MMS_ExpectedResult.FLEETLIST_CARHISTORY_DELETE_INVOICE); WebElement wb
	 * = EY_FW_Utility .getAnyElementByAnyLocator(MMS_FleetListPageLocator.
	 * FLEET_ACTION_FILTER_DELETEINVOICE_VERIFY_LOCATOR); String errormsg =
	 * wb.getText(); MatcherAssert.assertThat(errormsg,
	 * equalTo(MMS_ExpectedResult.FLEETLIST_CARHISTORY_DELETE_INVOICE)); } catch
	 * (Exception e) { Assert.assertTrue(false, e.getMessage()); }
	 * 
	 * }
	 */
	public void clickDeactivate() {
		try {
			System.out.println("MMS_FleetListPage : clickDeactivate] clicking on Deactive Button on Fleet List Page");
			EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.FLEET_DEACTIVATE_BUTTON_LOCATOR).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void enterDeactivateEndDate(String deactivateendDate) {
		try {
			System.out.println("[MMS_FleetListPage : enterDeactivateEndDate] Entering '" + deactivateendDate
					+ "' in End Date in Deactivate Page");
			WebElement endDate = EY_FW_Utility
					.findElementByLocator(MMS_FleetListPageLocator.FLEET_DEACTIVATE_ENDDATE_INPUTFIELD_LOCATOR);
			endDate.sendKeys(deactivateendDate);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void clickDeactivateSaveButton() throws FindFailed {
		System.out
				.println("[MMS_FleetListPage : clickDeactivateSaveButton] click on Save button of Deactivated pop up");
		EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.Deactivate_Save_Button).click();
		/*Screen scr = new Screen();
		String path = System.getProperty("user.dir");
		Pattern p = new Pattern(path+"/"+MMS_FleetListPageLocator.FleetlistDeactivateSave);
		scr.click(p);*/
	}

	/*
	 * public void getErrorMessage() { try { System.out.
	 * println("[MMS_ReportHistoryPage : verifyErrormsg] Verifying Error Message "
	 * + MMS_ExpectedResult.FLEETLIST_DEACTIVATE_ERROR_MSG); WebElement wb =
	 * EY_FW_Utility.getAnyElementByAnyLocator(MMS_FleetListPageLocator.
	 * FLEET_DEACTIVATE_ERROR_MSG_LOCATOR); String errormsg = wb.getText();
	 * MatcherAssert.assertThat(errormsg,
	 * equalTo(MMS_ExpectedResult.FLEETLIST_DEACTIVATE_ERROR_MSG)); } catch
	 * (Exception e) { Assert.assertTrue(false, e.getMessage()); } }
	 */

	public void fleetListDeactivateCancel() {
		try {
			System.out.println(
					"[MMS_ReportHistoryPage : fleetListDeactivateClose] Click Close Button in Deactivate Fleet Car Pop up");
			EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.Deactivate_Cancel_Button).click();
			/*Screen s = new Screen();
			String path = System.getProperty("user.dir");
			Pattern p = new Pattern(path+"/"+MMS_FleetListPageLocator.CancelActionDelete);
			EY_FW_Utility.doWait(3000);
			s.click(p);*/
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	/*
	 * public void verifyCarHistoryPage() { try { System.out.
	 * println("[MMS_FleetListPage : verifyCarHistoryPage] Verifying Car History Page Title as "
	 * + MMS_ExpectedResult.FLEETLIST_CARHISTORY_PAGE_TITLE);
	 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.FLEETLIST_CARHISTORY_PAGE_TITLE)); } catch
	 * (Exception e) { Assert.assertTrue(false, e.getMessage()); } }
	 */

	public void clickDeactivateNumberEndDateCheckBox() {
		try {
			System.out.println(
					"[MMS_FleetListPage : clickDeactivatenoendDateCheckBox] clicking on Deactivated CheckBox with no end Date");
			EY_FW_Utility.findElementByLocator(MMS_FleetListPageLocator.FLEET_DEACTIVATE_NOEND_CHECKBOX_LOCATOR)
					.click();

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public String getDeactivateNoEndDateError() {
		try {
			System.out.println("[MMS_FleetListPage : getDeactivateNoEndDateError] Verifying Error Message "
					+ FleetList.FLEETLIST_DEACTIVATE_NOENDDATE_ERROR_MSG);
			WebElement wb = EY_FW_Utility
					.findElementByLocator(MMS_FleetListPageLocator.FLEET_DEACTIVATE_NOENDDATE_ERROR_LOCATOR);
			String errormsg = wb.getText();
			return errormsg;
			//MatcherAssert.assertThat(errormsg, equalTo(MMS_ExpectedResult.FLEETLIST_DEACTIVATE_NOENDDATE_ERROR_MSG));
			/*
			 * System.out.
			 * println("[MMS_FleetListPage : getDeactivateNoEndDateError] Verifying Error Message "
			 * + MMS_ExpectedResult.FLEETLIST_DEACTIVATE_NOENDDATE_ERROR_MSG);
			 * WebElement
			 * wb=EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.
			 * FLEET_DEACTIVATE_NOENDDATE_ERROR_LOCATOR); String
			 * errormsg=wb.getText();
			 * Assert.assertTrue(errormsg.equals(MMS_ExpectedResult.
			 * FLEETLIST_DEACTIVATE_NOENDDATE_ERROR_MSG));
			 */
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return "";
	}

}
