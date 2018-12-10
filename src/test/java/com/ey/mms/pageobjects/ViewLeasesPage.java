package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.List;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.ey.mms.pageobjects.MMS_ExpectedResult;
import com.ey.mms.pageobjects.MMS_Locators;
import com.ey.mms.pageobjects.mmsLocators.MMS_ViewLeasePageLocator;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.EY_GettersSetters;

import net.serenitybdd.core.pages.PageObject;

public class ViewLeasesPage extends PageObject {

	/*
	 * public void verifyViewLeasePageTItle(){ System.out.
	 * println("[MMS_View_LeasesPage : verifyViewLeasePageTItle] Verifying View Leases Page Title as "
	 * + MMS_ExpectedResult.LEASES_VIEWLEASE_PAGETITLE);
	 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.LEASES_VIEWLEASE_PAGETITLE));
	 * //EY_FW_Utility.doWait(2000); }
	 */
	/*
	 * public void verifyViewLeaseAddLeasePageTitle(){ System.out.
	 * println("[MMS_View_LeasesPage : verifyViewLeaseAddLeasePageTitle] Verifying Add Leases Page Title as "
	 * + MMS_ExpectedResult.LEASES_VIEWLEASE_ADDLEASE_PAGETITLE);
	 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.LEASES_VIEWLEASE_ADDLEASE_PAGETITLE));
	 * //EY_FW_Utility.doWait(2000); }
	 */

	public void clickViewLeaseAddLease() {
		try {
			System.out.println(
					"[MMS_View_LeasesPage : clickViewLeaseAddLease] clicking on Add Leases Button in View Leases Page");
			EY_FW_Utility.findElementByLocator(MMS_ViewLeasePageLocator.VIEWLEASES_ADDLEASE_BUTTON_LOCATOR)
					.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void selectViewLeasesRelationShip() {
		try {

			System.out.println(
					"[MMS_View_LeasesPage : selectViewLeasesRelationShip] selecting a Value from Relationship Dropdown");
			// EY_FW_Utility.doWait(5000);
			List<WebElement> allConfigItems = EY_FW_Utility
					.getElementListByLocator(MMS_ViewLeasePageLocator.VIEWLEASES_SELECT_RELATIONSHIP_LOCATOR);
			for (WebElement we : allConfigItems) {
				if (we.getText().equals("I am leasing these cars to someone")) {
					Actions a = new Actions(EY_GettersSetters.getDriver());
					a.moveToElement(we).perform();
					a.click(we).perform();
					// EY_FW_Utility.doWait(2000);
					break;
				}
			}

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectViewLeasesType() {
		try {
			System.out
					.println("[MMS_View_LeasesPage : selectViewLeasesType] Selecting a value from Lease Type Dropdown");

			// EY_FW_Utility.doWait(5000);
			List<WebElement> allConfigItems = EY_FW_Utility
					.getElementListByLocator(MMS_ViewLeasePageLocator.VIEWLEASES_SELECT_TYPE_LOCATOR);
			for (WebElement we : allConfigItems) {
				if (we.getText().equals("Full")) {
					Actions a = new Actions(EY_GettersSetters.getDriver());
					a.moveToElement(we).perform();
					a.click(we).perform();
					// EY_FW_Utility.doWait(2000);
					break;
				}
			}

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterViewLeaseNumber(String num) {
		try {
			System.out.println("[MMS_View_LeasesPage : enterNumber] Entering '" + num + "' Lease Information Number");
			WebElement wb = EY_FW_Utility
					.findElementByLocator(MMS_ViewLeasePageLocator.VIEWLEASE_ENTERNUMBER_LOCATOR);
			wb.sendKeys(num);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterViewLeasesTitle(String leaseTitle) {
		try {
			System.out.println("[MMS_View_LeasesPage : leaseTitle] Entering '" + leaseTitle + "' Lease Title ");
			WebElement wb = EY_FW_Utility
					.findElementByLocator(MMS_ViewLeasePageLocator.VIEWLEASES_ENTERTITLE_LOCATOR);
			wb.sendKeys(leaseTitle);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterViewLeasesStartDate(String startDate) {

		try {
			System.out.println("[MMS_View_LeasesPage : enterStartDate] Entering '" + startDate + "' Lease end Date");
			WebElement wb = EY_FW_Utility
					.findElementByLocator(MMS_ViewLeasePageLocator.VIEWLEASES_ENTERSTART_DATE_LOCATOR);
			wb.sendKeys(startDate);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterViewLeasesEndDate(String endDate) {
		try {
			System.out.println("[MMS_View_LeasesPage : enterEndDate] Entering '" + endDate + "' Lease end Date");
			WebElement wb = EY_FW_Utility
					.findElementByLocator(MMS_ViewLeasePageLocator.VIEWLEASES_ENTEREND_DATE_LOCATOR);
			wb.sendKeys(endDate);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void selectViewLeasesLessor() {
		try {
			System.out.println(
					"[MMS_View_LeasesPage : selectViewLeasesLessor] Selecting a value from Lease Lessor Dropdown");
			// lessor="A014";
			// EY_FW_Utility.clickAnyElementFromListOptions(MMS_Locators.VIEWLEASES_SELECT_TYPE_LOCATOR,
			// lessor);
			List<WebElement> allConfigItems = EY_FW_Utility
					.getElementListByLocator(MMS_ViewLeasePageLocator.VIEWLEASES_SELECT_TYPE_LOCATOR);
			for (WebElement we : allConfigItems) {
				if (we.getText().equals("A014")) {
					Actions a = new Actions(EY_GettersSetters.getDriver());
					a.moveToElement(we).perform();
					break;
				}
			}

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectViewLeasesContact(String contact) {
		try {
			System.out.println(
					"[MMS_View_LeasesPage : selectViewLeasesContact] Selecting a value from Lease Contact Dropdown");
			contact = "A014";
			EY_FW_Utility.clickElementFromListOfElements(MMS_ViewLeasePageLocator.VIEWLEASES_SELECT_TYPE_LOCATOR,
					contact);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterViewLeasesCarCount(String carCount) {
		try {
			System.out
					.println("[MMS_View_LeasesPage : enterViewLeasesCarCount] Entering '" + carCount + "' Car Count ");
			WebElement wb = EY_FW_Utility
					.findElementByLocator(MMS_ViewLeasePageLocator.VIEWLEASES_ENTER_CARCOUNT_LOCATOR);
			wb.sendKeys(carCount);
		}

		catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void clickViewLeasesSaveGroup() {
		try {
			System.out.println(
					"[MMS_View_LeasesPage : clickViewLeasesSaveGroup] clicking on Save Group Button in View Leases Page");
			EY_FW_Utility.findElementByLocator(MMS_ViewLeasePageLocator.VIEWLEASES_SAVEGROUP_BUTTON_LOCATOR)
					.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}
	/*
	 * public void verifyViewLeasesLeaseInformation(){ System.out.
	 * println("[MMS_View_LeasesPage : verifyViewLeasesLeaseInformation] Verifying Add Leases Information TAb as "
	 * + MMS_ExpectedResult.LEASES_VIEWLEASE_LEASEINFORMATION); WebElement wb
	 * =EY_FW_Utility.getAnyElementByAnyLocator(MMS_ViewLeasePageLocator.
	 * VIEWLEASES_LEASEINFORMATION_LOCATOR); String tab=wb.getText();
	 * MatcherAssert.assertThat(tab,
	 * equalTo(MMS_ExpectedResult.LEASES_VIEWLEASE_LEASEINFORMATION));
	 * //EY_FW_Utility.doWait(2000);
	 * 
	 * 
	 * 
	 * }
	 */

}
