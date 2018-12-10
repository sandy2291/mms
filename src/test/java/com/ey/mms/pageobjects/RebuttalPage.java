package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.*;
import com.ey.mms.util.EY_FW_Utility;

import static org.junit.Assert.assertThat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class RebuttalPage extends PageObject {
	public static String InvoiceStatus;
	/*
	 * public void verifyRebuttalBillingPageTitle() { try { System.out.println(
	 * "[MMS_Rebuttal Billing Invoice List : verifyExceptionReviewPageTitle] Verifying Rebuttal Billing Invoice List Page Title as "
	 * + MMS_ExpectedResult.REBUTTAL_PAGE_TITLE);
	 * assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.REBUTTAL_PAGE_TITLE)); } catch (Exception e) {
	 * Assert.assertTrue(false, e.getMessage()); } }
	 */

	public void selectRebuttal(String rebuttalName) {
		try {
			System.out.println("[MMS_REBUTTAL_BILLING : selectrebuttal], Selecting rebuttal");
			WebElement rebuttal = EY_FW_Utility
					.findElementByLocator(MMS_RebuttalBillingPageLocator.REBUTTAL_DROPDOWN);
			Select dropdown = new Select(rebuttal);
			dropdown.selectByVisibleText(rebuttalName);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectRebuttalStatus(String status) {
		try {
			System.out.println("[MMS_REBUTTAL_BILLING : selectrebuttalstatus], Selecting rebuttal status");
			WebElement rebuttal = EY_FW_Utility
					.findElementByLocator(MMS_RebuttalBillingPageLocator.REBUTTAL_STATUS_DROPDOWN);
			Select dropdown = new Select(rebuttal);
			dropdown.selectByVisibleText(status);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterInvoicenumberStart(String invNo) {
		WebElement start = EY_FW_Utility.findElementByLocator(MMS_RebuttalBillingPageLocator.INVOICE_NUMBER_START);
		start.clear();
		start.sendKeys(invNo);
	}

	public void enterInvoicenumberEnd(String invNo) {
		WebElement end = EY_FW_Utility.findElementByLocator(MMS_RebuttalBillingPageLocator.INVOICE_NUMBER_END);
		end.clear();
		end.sendKeys(invNo);
	}

	public void clickActions(String actions) {
		try {
			System.out.println("[MMS_RebuttalInvoice List : clickactions], clicking on actions");

			EY_FW_Utility.findElementByLocator(MMS_RebuttalBillingPageLocator.REBUTTALS_ACTIONS).click();
			EY_FW_Utility.clickMMSActionList(MMS_MyCompanyInfoPageLocator.contacttable,
					MMS_UserManagerPageLocator.actionlist1, MMS_UserManagerPageLocator.actionlist2, 1, 15, actions);
/*			getDriver()
					.findElement(By.xpath(
							".//*[@id='DataTables_Table_0']/tbody/tr/td[15]/div/ul/li[a[contains(.,'" + s + "')]]"))
					.click();*/

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickSaveButton() {
		try {
			System.out.println("[MMS_RebuttalInvoice List : clickSaveButton ] Clicking on Save Button");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.SAVEBUTTON).click();
			EY_FW_Utility.waitForProcessingNotificationToAppear(5);
			EY_FW_Utility.waitForProcessingNotificationToDisappear(20);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectFirstRow() {
		try {
			System.out.println("[MMS_REBUTTAL INVOICE LIST : Select First row] Selecting first row");
			WebElement checkbox = EY_FW_Utility.findElementByLocator(MMS_ExceptionTrackingPageLocator.CHECKBOX);//.click();
			if(!checkbox.isSelected()){
				checkbox.click();
				EY_FW_Utility.doWait(2000);
			}
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickMarkInvoicesReviewed() {
		try {
			System.out.println(
					"[MMS_RebuttalInvoice List : clickMarkInvoicesReviewed ] Clicking on mark invoices reviewed");
			// EY_FW_Utility.doWait(1000);
			EY_FW_Utility.findElementByLocator(MMS_RebuttalBillingPageLocator.MARK_INVOICES_REVIEWED).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void verifyStatus(String s){ try { System.out.println(
	 * "[MMS_Rebuttal Billing Invoice List : verifyStatus] Verifying Rebuttal status "
	 * ); InvoiceStatus =
	 * EY_FW_Utility.getAnyElementByAnyLocator(MMS_BulkRebuttalDialogueLocator.
	 * STATUS).getText(); assertThat(InvoiceStatus, equalTo(s)); } catch
	 * (Exception e) { Assert.assertTrue(false, e.getMessage()); } }
	 */

	public void clickFinalizeInvoices() {
		try {
			System.out.println("[MMS_RebuttalInvoice List : clickFinalizeInvoices ] Clicking on finalize invoices");
			// EY_FW_Utility.doWait(1000);
			EY_FW_Utility.findElementByLocator(MMS_RebuttalBillingPageLocator.FINALIZE_INVOICES).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
}
