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

import com.ey.mms.pageobjects.mmsLocators.MMS_FleetListPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_UploadFleetPageLocator;
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

public class UploadFleetPage extends PageObject {

	private Logger APP_LOGS = null;

	private Logger setLogger() {
		if (APP_LOGS == null)
			APP_LOGS = LogManager.getLogger(UploadFleetPage.class.getName());
		return APP_LOGS;
	}

	/*
	 * public void verifyUploadFleetPageTitle() { try { setLogger().
	 * info("[MMS_UploadFleetPage : verifyFleetListPageTitle] Verifying Fleet List Page Title as "
	 * + MMS_ExpectedResult.UPLOADFLEET_PAGE_TITLE);
	 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.UPLOADFLEET_PAGE_TITLE)); } catch (Exception
	 * e) { setLogger().
	 * error("[MMS_UploadFleetPage : verifyUploadFleetPageTitle] Exception thrown -- "
	 * + EY_FW_Utility.getStackTrace(e)); Assert.assertTrue(false,
	 * e.getMessage()); } catch (AssertionError e) { setLogger().
	 * error("[MMS_UploadFleetPage : verifyUploadFleetPageTitle] Assert Failure -- "
	 * + EY_FW_Utility.getStackTrace(e)); Assert.assertTrue(false,
	 * e.getMessage()); } }
	 */

	public void clickRefresh() {
		try {
			setLogger().info("click on refresh");
			EY_FW_Utility.findElementByLocator(MMS_UploadFleetPageLocator.REFRESH).click();
		} catch (Exception e) {
			setLogger().error(
					"[MMS_UploadFleetPage : clickRefresh] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void checkEmptyTable(){ WebElement wb = EY_FW_Utility
	 * .getAnyElementByAnyLocator(MMS_FleetListPageLocator.
	 * FLEET_ACTION_FILTER_DELETEINVOICE_VERIFY_LOCATOR); String errormsg =
	 * wb.getText(); MatcherAssert.assertThat(errormsg,
	 * equalTo(MMS_ExpectedResult.FLEETLIST_CARHISTORY_DELETE_INVOICE)); }
	 */

}
