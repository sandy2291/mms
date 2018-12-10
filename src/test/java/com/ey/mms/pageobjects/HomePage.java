/**
 * @Copyright Copyright (C) 2016 General Electric Company. All rights reserved.
 */
package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.*;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.EY_GettersSetters;

import net.serenitybdd.core.pages.PageObject;

/**
 * <h1>Home Page Class</h1> MMS HomePage Class containing Page Functions for
 * Home.
 * 
 * @author Ankur Chaudhry
 * @version 1.1
 * @since 2016-07-17
 */

public class HomePage extends PageObject {
	private Logger APP_LOGS = null;

	private Logger setLogger() {
		if (APP_LOGS == null)
			APP_LOGS = LogManager.getLogger(HomePage.class.getName());
		return APP_LOGS;
	}

	public void clickConfiguration() {
		try {
			setLogger().info("[MMS_HomePage : clickConfiguration] Clicking Configuration ");
			// EY_FW_Utility.doWait(5000);
			EY_FW_Utility.findElementByLocator(MMS_HomepageLocator.CONFIGURATION_DROPDOWNMENU_LOCATOR).click();
		} catch (Exception e) {
			setLogger()
					.error("[MMS_HomePage : clickConfiguration] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickUpload() {
		try {
			setLogger().info("[MMS_HomePage : clickUpload] Clicking Configuration ");
			// EY_FW_Utility.doWait(5000);
			EY_FW_Utility.findElementByLocator(MMS_HomepageLocator.UPLOAD_DROPDOWNMENU_LOCATOR).click();
		} catch (Exception e) {
			setLogger()
					.error("[MMS_HomePage : clickConfiguration] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectFleetsSubMenu() {
		try {
			setLogger().info("[MMS_HomePage : selectFleetsSubMenu] Selecting Fleets Sub Menu ");
			// EY_FW_Utility.doWait(5000);
			List<WebElement> allConfigItems = EY_FW_Utility
					.getElementListByLocator(MMS_HomepageLocator.FLEETS_SUBMENU_LOCATOR);
			for (WebElement we : allConfigItems) {
				if (we.getText().equals("Fleets")) {
					Actions a = new Actions(EY_GettersSetters.getDriver());
					a.moveToElement(we).perform();
					break;
				}
			}
		} catch (Exception e) {
			setLogger().error(
					"[MMS_HomePage : selectFleetsSubMenu] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectFleet_FleetListSubmenu(String submenu) {
		try {
			setLogger().info(
					"[MMS_HomePage : selectFleet_FleetListSubmenu] Selecting Fleets List Sub Menu item Fleet List ");
			// EY_FW_Utility.doWait(5000);
			List<WebElement> allConfigItems = EY_FW_Utility
					.getElementListByLocator(MMS_HomepageLocator.FLEETLIST_FLEETSUBMENU_LOCATOR);
			for (WebElement we : allConfigItems) {
				if (we.getText().equals(submenu)) {
					Actions a = new Actions(EY_GettersSetters.getDriver());
					a.moveToElement(we).perform();
					a.click(we).perform();
					break;
				}
			}
		} catch (Exception e) {
			setLogger().error("[MMS_HomePage : selectFleet_FleetListSubmenu] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void verifyHomePageTitle() { try { setLogger().
	 * info("[MMS_HomePage : verifyHomePageTitle] Verifying Home Page title as "
	 * + MMS_ExpectedResult.HOME_PAGE_TITLE);
	 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.HOME_PAGE_TITLE)); } catch (Exception e) {
	 * setLogger().error(
	 * "[MMS_HomePage : verifyHomePageTitle] Exception thrown -- " +
	 * EY_FW_Utility.getStackTrace(e)); Assert.assertTrue(false,
	 * e.getMessage()); } catch (AssertionError e) { setLogger()
	 * .error("[MMS_HomePage : verifyHomePageTitle] Assert Failure -- " +
	 * EY_FW_Utility.getStackTrace(e)); Assert.assertTrue(false,
	 * e.getMessage()); } }
	 */

	public void clickRebuttals() {
		try {
			EY_FW_Utility.clickElementFromListOfElements(MMS_HomepageLocator.INVOICE_DROPMENU_LIST, "Rebuttals");
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickCarToCustomerAssociation() {
		try {
			EY_FW_Utility.clickElementFromListOfElements(MMS_HomepageLocator.CONFIGURATION_DROPMENU_LIST,
					"Car to Customer Associations");
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickBillingContacts() {
		try {
			EY_FW_Utility.clickElementFromListOfElements(MMS_HomepageLocator.CONFIGURATION_DROPMENU_LIST,
					"Billing Contacts");
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickHome_Page() {
		try {
			System.out.println("Clicking on home page");
			// EY_FW_Utility.doWait(5000);
			EY_FW_Utility.findElementByLocator(MMS_HomepageLocator.HOME_MENU_LOCATOR).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickInvoices() {
		try {
			EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
			System.out.println("[MMS_HomePage : clickInvoices] Clicking Invoices");
			EY_FW_Utility.findElementByLocator(MMS_HomepageLocator.INVOICE_DROPMENU_LOCATOR).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectExceptionsSubMenu(String submenu) {
		try {
			System.out.println("[MMS_HomePage : selectExceptionsSubMenu] Selecting Exceptions Sub Menu ");
			List<WebElement> allConfigItems = EY_FW_Utility
					.getElementListByLocator(MMS_HomepageLocator.EXCEPTIONS_SUBMENU_LOCATOR);
			for (WebElement we : allConfigItems) {
				if (we.getText().equals(submenu)) {
					Actions a = new Actions(EY_GettersSetters.getDriver());
					a.moveToElement(we).perform();
					break;
				}
			}
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectExceptions_ExceptionsSubmenu(String submenu) {
		try {
			System.out.println(
					"[MMS_HomePage : selectExceptions_ExceptionsSubmenu] Selecting Fleets List Sub Menu item Fleet List ");
			List<WebElement> allConfigItems = EY_FW_Utility
					.getElementListByLocator(MMS_HomepageLocator.EXCEPTIONS_EXCEPTIONSUBMENU_LOCATOR);
			for (WebElement we : allConfigItems) {

				if (we.getText().equals(submenu)) {
					Actions a = new Actions(EY_GettersSetters.getDriver());
					a.moveToElement(we).perform();
					a.click(we).perform();
					break;
				}
			}
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectSystemSubMenu(String submenu) {
		try {
			System.out.println("[MMS_HomePage : selectSystemSubMenu] Selecting System Sub Menu ");
			// EY_FW_Utility.doWait(3000);
			List<WebElement> allConfigItems = EY_FW_Utility
					.getElementListByLocator(MMS_HomepageLocator.FLEETS_SUBMENU_LOCATOR);
			for (WebElement we : allConfigItems) {
				if (we.getText().equals(submenu)) {
					Actions a = new Actions(EY_GettersSetters.getDriver());
					a.moveToElement(we).perform();
					break;
				}
			}
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectSystemSubmenu(String submenu) {
		try {
			System.out.println(
					"[MMS_HomePage : selectSystem_SystemSubmenu] Selecting Company Info Sub Menu item from System ");
			// EY_FW_Utility.doWait(5000);
			List<WebElement> allConfigItems = EY_FW_Utility
					.getElementListByLocator(MMS_HomepageLocator.SYSTEM_SYSTEMUBMENU_LOCATOR);
			for (WebElement we : allConfigItems) {

				if (we.getText().equals(submenu)) {
					Actions a = new Actions(EY_GettersSetters.getDriver());
					a.moveToElement(we).perform();
					a.click(we).perform();
					break;
				}
			}
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectSystemLeaseSubmenu(String submenu) {
		try {
			System.out.println(
					"[MMS_HomePage : selectSystem_LeaseSubmenu] Selecting Company Info Sub Menu item from System ");
			// EY_FW_Utility.doWait(5000);
			List<WebElement> allConfigItems = EY_FW_Utility
					.getElementListByLocator(MMS_HomepageLocator.LEASE_SYSTEMUBMENU_LOCATOR);
			for (WebElement we : allConfigItems) {

				if (we.getText().equals(submenu)) {
					Actions a = new Actions(EY_GettersSetters.getDriver());
					a.moveToElement(we).perform();
					a.click(we).perform();
					break;
				}
			}
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickInvoicesMainMenu() {
		try {
			System.out.println("[MMS_HomePage : clickInvoicesMainMenu] Select Invoices Main Menu");
			EY_FW_Utility.findElementByLocator(MMS_HomepageLocator.INVOICE_DROPDOWN_LOCATOR).click();
			// EY_FW_Utility.doWait(1000);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void ClickInvoiceReviewSubMenu() {
		try {
			System.out.println("[MMS_HomePage : ClickInvoiceReviewSubMenu] Select Invoices Review Sub Menu");
			EY_FW_Utility.findElementByLocator(MMS_HomepageLocator.INVOICREVIEW_SUBMENU_LOCATOR).click();
			// EY_FW_Utility.doWait(1000);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectLeasesSubMenu() {
		try {
			System.out.println("[MMS_HomePage : selectLeasesSubMenu] Selecting Leases Sub Menu ");
			// EY_FW_Utility.doWait(5000);
			List<WebElement> allConfigItems = EY_FW_Utility
					.getElementListByLocator(MMS_HomepageLocator.LEASES_SUBMENU_LOCATOR);
			for (WebElement we : allConfigItems) {
				if (we.getText().equals("Leases")) {
					Actions a = new Actions(EY_GettersSetters.getDriver());
					a.moveToElement(we).perform();
					break;
				}
			}
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	// Scenario for selection Lease Assignment from Leases Submenu from
	// Configuration Main Menu

	public void clickLeases_LeaseAssignmentSubmenu(String submenu) {
		try {
			System.out.println(
					"[MMS_HomePage : selectLeases_LeaseAssignmentSubmenu] Selecting Lease Assignment Sub Menu item from Leases Sub Menu ");
			// EY_FW_Utility.doWait(5000);
			List<WebElement> allConfigItems = EY_FW_Utility
					.getElementListByLocator(MMS_HomepageLocator.LEASESLIST_LEASEASSIGNMENTSUBMENU_LOCATOR);
			for (WebElement we : allConfigItems) {
				if (we.getText().equals(submenu)) {
					Actions a = new Actions(EY_GettersSetters.getDriver());
					a.moveToElement(we).perform();
					a.click(we).perform();
					// EY_FW_Utility.doWait(4000);
					break;
				}
			}
		}

		catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void clickLeases_ViewLeases() {
		try {
			System.out.println(
					"[MMS_HomePage : selectLeases_LeaseAssignmentSubmenu] Selecting Lease Assignment Sub Menu item from Leases Sub Menu ");
			// EY_FW_Utility.doWait(5000);
			List<WebElement> allConfigItems = EY_FW_Utility
					.getElementListByLocator(MMS_HomepageLocator.LEASES_VIEWLEASES_LOCATOR);
			for (WebElement we : allConfigItems) {
				if (we.getText().equals("View Leases")) {
					Actions a = new Actions(EY_GettersSetters.getDriver());
					a.moveToElement(we).perform();
					a.click(we).perform();
					// EY_FW_Utility.doWait(4000);
					break;
				}
			}

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void clickBilling() {
		try {
			System.out.println("[MMS_HomePage : clickBilling] Clicking Billing ");
			// EY_FW_Utility.doWait(5000);
			EY_FW_Utility.findElementByLocator(MMS_HomepageLocator.BILLING_DROPDOWNMENU_LOCATOR).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectCombinedBillingSubMenu(String submenu) {
		try {
			System.out.println("[MMS_HomePage : selectCombinedBillingSubMenu] Selecting combined Billing Sub Menu ");
			// EY_FW_Utility.doWait(3000);
			List<WebElement> allConfigItems = EY_FW_Utility
					.getElementListByLocator(MMS_HomepageLocator.COMBINEDBILLING_SUBMENU_LOCATOR);
			for (WebElement we : allConfigItems) {
				if (we.getText().equals(submenu)) {
					Actions a = new Actions(EY_GettersSetters.getDriver());
					a.moveToElement(we).perform();
					break;
				}
			}
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectCombinedBilling_CombinedBillingSubmenu(String submenu) {
		try {
			System.out.println(
					"[MMS_HomePage : selectCombinedBilling_CombinedBillingSubmenu] Selecting combined billing options Sub Menu item Fleet List ");
			// EY_FW_Utility.doWait(5000);
			List<WebElement> allConfigItems = EY_FW_Utility
					.getElementListByLocator(MMS_HomepageLocator.COMBINEDBILLING_COMBINEDBILLINGSUBMENU_LOCATOR);
			for (WebElement we : allConfigItems) {

				if (we.getText().equals(submenu)) {
					Actions a = new Actions(EY_GettersSetters.getDriver());
					a.moveToElement(we).perform();
					a.click(we).perform();
					break;
				}
			}
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickInvoicesMenu() {
		try {
			System.out.println("[MMS_HomePage : clickInvoices] Clicking Configuration ");
			EY_FW_Utility.findElementByLocator(MMS_HomepageLocator.INVOICES_DROPDOWNMENU_LOCATOR).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void selectRepairDetailsSubMenu() {
		try {
			System.out.println("[MMS_HomePage : clickRepairDetails] Clicking Configuration ");
			// EY_FW_Utility.doWait(2000);
			EY_FW_Utility.findElementByLocator(MMS_HomepageLocator.INVOICES_REPAIR_DETAILS_SUBMENU).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickUploadInvoices(String upload) {
		try {
			// EY_FW_Utility.doWait(5000);
			System.out.println("[MMS_HomePage : clickUploadInvoices] Clicking Invoice History ");
			EY_FW_Utility.clickElementFromListOfElements(MMS_HomepageLocator.UPLOAD_DROPMENU_LIST, upload);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

}
