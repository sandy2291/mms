/**
 * @Copyright Copyright (C) 2016 General Electric Company. All rights reserved.
 * @author  Ankur Chaudhry
 * @version 1.0
 * @since   2016-07-12
 * @description MMS Serenity Steps Class for Configuration Theme
 */

package com.ey.mms.serenitystepsThemelevel;

import static org.hamcrest.CoreMatchers.equalTo;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.testng.Assert;

import com.ey.mms.pageobjects.MMS_ExpectedResult;
import com.ey.mms.pageobjects.FleetListPage;
import com.ey.mms.pageobjects.HomePage;
import com.ey.mms.pageobjects.LoginPage;
import com.ey.mms.pageobjects.UploadFleetPage;
import com.ey.mms.pageobjects.mmsLocators.MMS_FleetListPageLocator;
import com.ey.mms.serenitystepsThemelevel.expectedData.FleetList;
import com.ey.mms.serenitystepsThemelevel.expectedData.Home;
import com.ey.mms.serenitystepsThemelevel.expectedData.UploadFleet;
import com.ey.mms.util.EY_FW_Utility;

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;

public class MMS_FleetTheme_SerenitySteps {

	@ManagedPages
	LoginPage mmsloginpage;

	@ManagedPages
	HomePage mmshomepage;

	@ManagedPages
	FleetListPage mmsfleetlistpage;

	@ManagedPages
	UploadFleetPage mmsuploadfleetpage;

	@Step
	public void opensMMSLoginPage() {
		mmsloginpage.openURL();
	}

	@Step
	public void enterUserId(String userid) {
		mmsloginpage.enterUserId(userid);
	}

	@Step
	public void enterPassword(String password) {
		mmsloginpage.enterPassword(password);
	}

	@Step
	public void clickLoginButton() {
		mmsloginpage.clickLoginButton();
	}

	@Step
	public void verifyHomePageTitle() {
		// mmshomepage.verifyHomePageTitle();
		try {
			System.out.println("[MMS_HomePage : verifyHomePageTitle] Verifying Home Page title as "
					+ Home.HOME_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), equalTo(Home.HOME_PAGE_TITLE));

		} catch (AssertionError e) {

			System.out.println(
					"[MMS_HomePage : verifyHomePageTitle] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void clickConfigurationLink() {
		mmshomepage.clickConfiguration();
	}

	@Step
	public void moveToFleetsSubmenuItem() {
		mmshomepage.selectFleetsSubMenu();
	}

	@Step
	public void clickFleets_FleetListSubmenu(String s) {
		mmshomepage.selectFleet_FleetListSubmenu(s);
	}

	@Step
	public void verifyFleetListPageTitle() {
		// mmsfleetlistpage.verifyFleetListPageTitle();
		try {
			System.out.println("[MMS_FleetListPage : verifyFleetListPageTitle] Verifying Fleet List Page Title as "
					+ FleetList.FLEETLIST_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
					equalTo(FleetList.FLEETLIST_PAGE_TITLE));
		} catch (Exception e) {
			System.out.println("[MMS_FleetListPage : verifyFleetListPageTitle] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void clickFleetFilterButton() {
		mmsfleetlistpage.clickFleetFilterButton();
	}

	@Step
	public void enterFleetCarIntial(String s) {
		mmsfleetlistpage.enterFleetCarInital(s);

	}

	@Step
	public void checkEmptyTable() {
		EY_FW_Utility.doWait(3000); // verification
		// mmsuploadfleetpage.checkEmptyTable();
		WebElement wb = EY_FW_Utility
				.findElementByLocator(MMS_FleetListPageLocator.FLEET_ACTION_FILTER_DELETEINVOICE_VERIFY_LOCATOR);
		String errormsg = wb.getText();
		MatcherAssert.assertThat(errormsg, equalTo(FleetList.FLEETLIST_CARHISTORY_DELETE_INVOICE));
	}

	@Step
	public void clickFilterSaveButton() {
		mmsfleetlistpage.clickFleetFilterSaveButton();
	}

	@Step
	public void verifyFilterResults() {
		mmsfleetlistpage.verifyListOfResults();

	}

	/*
	 * @ManagedPages MMS_LoginPage mmsloginpage;
	 * 
	 * @ManagedPages MMS_HomePage mmshomepage;
	 * 
	 * @ManagedPages MMS_FleetListPage mmsfleetlistpage;
	 * 
	 * @Step public void opensMMSLoginPage() { mmsloginpage.openURL(); }
	 * 
	 * @Step public void enterUserId(String userid) {
	 * mmsloginpage.enterUserId(userid); }
	 * 
	 * @Step public void enterPassword(String password) {
	 * mmsloginpage.enterPassword(password); }
	 * 
	 * @Step public void clickLoginButton() { mmsloginpage.clickLoginButton(); }
	 * 
	 * @Step public void verifyHomePage() { mmshomepage.verifyHomePageTitle(); }
	 * 
	 * @Step public void clickConfigurationLink() {
	 * mmshomepage.clickConfiguration(); }
	 * 
	 * @Step public void moveToFleetsSubmenuItem() {
	 * mmshomepage.selectFleetsSubMenu(); }
	 * 
	 * @Step public void clickFleets_FleetListSubmenu() {
	 * mmshomepage.selectFleet_FleetListSubmenu(); }
	 * 
	 * @Step public void verifyFleetListPageName() {
	 * mmsfleetlistpage.verifyFleetListPageTitle(); }
	 */

	@Step
	public void verifyFleetCarHistoryPageName() {
		EY_FW_Utility.doWait(4000);
		//EY_FW_Utility.waitTillPageLoad(4);
		// mmsfleetlistpage.verifyCarHistoryPage();
		try {
			System.out.println("[MMS_FleetListPage : verifyCarHistoryPage] Verifying Car History Page Title as "
					+ FleetList.FLEETLIST_CARHISTORY_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
					equalTo(FleetList.FLEETLIST_CARHISTORY_PAGE_TITLE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * @Step public void clickFleetFilterButton() {
	 * mmsfleetlistpage.clickFleetFilterButton(); }
	 */

	@Step
	public void clickFleetcheckbox() {
		mmsfleetlistpage.clickCarCheckbox();
	}

	@Step
	public void clickFleetAction() {
		mmsfleetlistpage.clickAction();
	}

	@Step
	public void clickCarHistoryAction() {
		mmsfleetlistpage.clickCarHistoryAction();
		EY_FW_Utility.doWait(2000);
	}

	@Step
	public void clickActionDetails() {
		mmsfleetlistpage.clickActionDetail();
	}

	/*
	 * @Step public void enterFleetCarIntial(String carInitial) {
	 * mmsfleetlistpage.enterFleetCarInital(carInitial); }
	 */
	/*
	 * @Step public void clickFilterSaveButton() {
	 * mmsfleetlistpage.clickFleetFilterSaveButton(); }
	 * 
	 * 
	 * 
	 * @Step public void verifyFilterResults() {
	 * mmsfleetlistpage.verifyListOfResults();
	 * 
	 * }
	 */
	@Step
	public void clickFleetCarInitialClose() {
		mmsfleetlistpage.clickCloseCarInitial();
	}

	@Step
	public void fleetActionDetails() {
		mmsfleetlistpage.clickActionDetail();
	}

	@Step
	public void fleetClickInvoiceCheckBoxDelete() {
		mmsfleetlistpage.clickInvoiceDelete();
	}

	@Step
	public void fleetInvoiceActionDelete() {
		mmsfleetlistpage.clickInvoiceActionDelete();
	}

	@Step
	public void fleetInvoiceActionDetailsDelete() {
		mmsfleetlistpage.clickInvoiceActionDetailDelete();
	}

	@Step
	public void fleetInvoiceActionDeleteOk() {
		mmsfleetlistpage.clickFleetListDeleteInvoiceOK();
		EY_FW_Utility.doWait(3000);
	}

	@Step
	public void verifyFleetFilterDeleteInvoice() {
		EY_FW_Utility.doWait(3000); // verification
		// mmsfleetlistpage.verifyFleetFilterDeleteInvoice();
		try {
			System.out.println(
					"[MMS_ReportHistoryPage : verifyFleetFilterDeleteInvoice] Verifying The data in Grid after deleteing the selected Invoice "
							+ FleetList.FLEETLIST_CARHISTORY_DELETE_INVOICE);
			WebElement wb = EY_FW_Utility.findElementByLocator(
					MMS_FleetListPageLocator.FLEET_ACTION_FILTER_DELETEINVOICE_VERIFY_LOCATOR);
			String errormsg = wb.getText();
			MatcherAssert.assertThat(errormsg, equalTo(FleetList.FLEETLIST_CARHISTORY_DELETE_INVOICE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	@Step
	public void fleetCarHistoryAction() {
		mmsfleetlistpage.clickCarHistoryAction();
	}

	@Step
	public void fleetCarHistoryActionEdit() {
		mmsfleetlistpage.clcikCarHistoryActionEdit();
	}

	@Step
	public void entereditHistoryInitial(String carInitial) {
		mmsfleetlistpage.enterEditHistoryInitial(carInitial);
	}

	@Step
	public void enterFleetEditHistoryEndDate(String endDate) {
		mmsfleetlistpage.enterEditHistoryEndDate(endDate);
	}

	@Step
	public void fleetclickcarHistoryDelete() {
		mmsfleetlistpage.clickCarHistoryActionDelete();
	}

	@Step
	public void fleetClickDeactivate() {
		mmsfleetlistpage.clickDeactivate();
		EY_FW_Utility.doWait(2000);
	}

	@Step
	public void fleetEnterDeactivateEndDate(String deactivateendDate) {
		mmsfleetlistpage.enterDeactivateEndDate(deactivateendDate);
	}

	@Step
	public void fleetDeactivateSave() throws FindFailed {
		mmsfleetlistpage.clickDeactivateSaveButton();
	}

	@Step
	public void getErrorMessage() {
		EY_FW_Utility.doWait(3000); // verification
		// mmsfleetlistpage.getErrorMessage();
		try {
			System.out.println("[MMS_ReportHistoryPage : verifyErrormsg] Verifying Error Message "
					+ FleetList.FLEETLIST_DEACTIVATE_ERROR_MSG);
			WebElement wb = EY_FW_Utility
					.findElementByLocator(MMS_FleetListPageLocator.FLEET_DEACTIVATE_ERROR_MSG_LOCATOR);
			String errormsg = wb.getText();
			MatcherAssert.assertThat(errormsg, equalTo(FleetList.FLEETLIST_DEACTIVATE_ERROR_MSG));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void fleetListDeactivateCancel() {
		mmsfleetlistpage.fleetListDeactivateCancel();
	}

	@Step
	public void fleetClickDeactivateInvoiceNumberEndDate() {
		mmsfleetlistpage.clickDeactivateNumberEndDateCheckBox();
	}

	@Step
	public void verifyDeactivateNoEndDateError() {
		EY_FW_Utility.doWait(3000); // verification
		MatcherAssert.assertThat(mmsfleetlistpage.getDeactivateNoEndDateError(), equalTo(FleetList.FLEETLIST_DEACTIVATE_NOENDDATE_ERROR_MSG));
		
	}

	@Step
	public void verifyUploadFleetPageTitle() {
		// mmsuploadfleetpage.verifyUploadFleetPageTitle();
		try {
			System.out.println("[MMS_UploadFleetPage : verifyFleetListPageTitle] Verifying Fleet List Page Title as "
					+ UploadFleet.UPLOADFLEET_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
					equalTo(UploadFleet.UPLOADFLEET_PAGE_TITLE));
		} catch (Exception e) {
			System.out.println("[MMS_UploadFleetPage : verifyUploadFleetPageTitle] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void clickRefresh() {
		mmsuploadfleetpage.clickRefresh();
	}
}
