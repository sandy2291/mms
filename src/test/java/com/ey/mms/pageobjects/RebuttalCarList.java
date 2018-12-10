package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_RebuttalBillingCarListPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_UserManagerPageLocator;
import com.ey.mms.util.EY_FW_Utility;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class RebuttalCarList extends PageObject {
	/*
	 * public void verifyRebuttalBillingPageTitle() { try { System.out.println(
	 * "[MMS_Rebuttal Car List : verifyRebuttalBillingPageTitle] Verifying Rebuttal Billing Car List Page Title as "
	 * + MMS_ExpectedResult.REBUTTAL_PAGE_CAR_LIST_TITLE);
	 * assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.REBUTTAL_PAGE_CAR_LIST_TITLE)); } catch
	 * (Exception e) { Assert.assertTrue(false, e.getMessage()); } }
	 */

	public void clickMarkCarsReviewed() {
		try {
			System.out.println("[MMS_RebuttalCar List : clickMarkCarsReviewed ] Clicking on mark cars reviewed");
			// EY_FW_Utility.doWait(1000);
			EY_FW_Utility.findElementByLocator(MMS_RebuttalBillingCarListPageLocator.MARK_CARS_REVIEWED).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void verifyCarStatus(String s){ try { System.out.println(
	 * "[MMS_Rebuttal Billing Car List : verifyCarStatus] Verifying Car status "
	 * ); assertThat(EY_FW_Utility.getAnyElementByAnyLocator(
	 * MMS_RebuttalBillingCarListPageLocator.CAR_STATUS).getText(), equalTo(s));
	 * } catch (Exception e) { Assert.assertTrue(false, e.getMessage()); } }
	 */

	/*
	 * public void verifyInvoicePrevStatus(String s){ try { System.out.println(
	 * "[MMS_Rebuttal Billing Car List : verifyInvoicePrevStatus] Verifying invoice previous status "
	 * ); assertThat(MMS_Rebuttal.InvoiceStatus, equalTo(s)); } catch (Exception
	 * e) { Assert.assertTrue(false, e.getMessage()); } }
	 */

	public void clickCarActions(String actions) {
		try {
			System.out.println("[MMS_RebuttalInvoice List : clickcaractions], clicking on actions");

			EY_FW_Utility.findElementByLocator(MMS_RebuttalBillingCarListPageLocator.CAR_ACTIONS).click();
			EY_FW_Utility.clickMMSActionList(MMS_MyCompanyInfoPageLocator.contacttable,
					MMS_UserManagerPageLocator.actionlist1, MMS_UserManagerPageLocator.actionlist2, 1, 12, actions);
			/*getDriver()
					.findElement(By.xpath(
							".//*[@id='DataTables_Table_0']/tbody/tr/td[12]/div/ul/li[a[contains(.,'" + s + "')]]"))
					.click();*/

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
}
