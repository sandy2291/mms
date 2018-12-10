package com.ey.mms.pageobjects;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.greaterThan;
import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.MMS_CombineBillingPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_UserManagerPageLocator;
import com.ey.mms.util.EY_FW_Utility;

import net.serenitybdd.core.pages.PageObject;

public class MergeCRBandMMSInvoiceDataPage extends PageObject {
	/*
	 * public void verifyCombinedBillingOptionsPageTitle(String s) { try {
	 * System.out.println(
	 * "[MMS_COMBINED BILLING : verifyCombinedBillingOptionsPageTitle] Verifying verifyCombinedBillingOptionsPageTitle Page Title as "
	 * ); MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(s)); } catch (Exception e) { Assert.assertTrue(false,
	 * e.getMessage()); } }
	 */
	/*public void getCountRows() {
		WebElement e = EY_FW_Utility.getAnyElementByAnyLocator(MMS_MyCompanyInfoPageLocator.contacttable);
		int size = EY_FW_Utility.getAllElementsByAnyLocator(MMS_MyCompanyInfoPageLocator.contacttable).size();
		MatcherAssert.assertThat(size, greaterThan(0));
		if (size == 1)
			MatcherAssert.assertThat(e.getText(), not(equalTo("No data available in table")));
	}
*/
	public static int rowNumber = 1;

	public void selectInvoice(String invoice) {
		try {
			rowNumber = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 2, invoice);
			EY_FW_Utility.clickMMSActions(MMS_MyCompanyInfoPageLocator.contacttable, "input", rowNumber, 1);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickCombinedInvoice() {
		try {
			System.out.println(
					"[MMS_Combined Billing : clickCombinedInvoice] Verifying verifyCombinedBillingOptionsPageTitle Page Title as ");
			EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.COMBINE_INVOICES).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void confirmCombinedInvoice() {
		try {
			System.out.println(
					"[MMS_Combined Billing : clickCombinedInvoice] Verifying verifyCombinedBillingOptionsPageTitle Page Title as ");
			EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.CONFIRM_COMBINEINVOICE).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickFilter() {
		try {
			System.out.println(
					"[MMS_Combined Billing : clickCombinedInvoice] Verifying verifyCombinedBillingOptionsPageTitle Page Title as ");
			EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.CLICK_FILTER).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterFromInvoiceNo(String invNo) {
		try {
			System.out.println(
					"[MMS_Combined Billing : clickCombinedInvoice] Verifying verifyCombinedBillingOptionsPageTitle Page Title as ");
			WebElement e = EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.FROM_INVOICE_NO);
			e.clear();
			e.sendKeys(invNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterToInvoiceNo(String invNo) {
		try {
			System.out.println(
					"[MMS_Combined Billing : clickCombinedInvoice] Verifying verifyCombinedBillingOptionsPageTitle Page Title as ");
			WebElement e = EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.TO_INVOICE_NO);
			e.clear();
			e.sendKeys(invNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickSaveButton() {
		try {
			System.out.println(
					"[MMS_Combined Billing : clickCombinedInvoice] Verifying verifyCombinedBillingOptionsPageTitle Page Title as ");
			WebElement e = EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.SAVE_BUTTON);
			//e.click();
			e.submit();

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterMergeFromInvoiceNo(String invNo) {
		try {
			System.out.println(
					"[MMS_Combined Billing : clickCombinedInvoice] Verifying verifyCombinedBillingOptionsPageTitle Page Title as ");
			WebElement e = EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.MERGE_FromINVOICE);
			e.clear();
			e.sendKeys(invNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterMergeToInvoiceNo(String invNo) {
		try {
			System.out.println(
					"[MMS_Combined Billing : clickCombinedInvoice] Verifying verifyCombinedBillingOptionsPageTitle Page Title as ");
			WebElement e = EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.MERGE_TOINVOICE);
			e.clear();
			e.sendKeys(invNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterMergeBilledParty(String billedParty) {
		try {
			System.out.println(
					"[MMS_Combined Billing : clickCombinedInvoice] Verifying verifyCombinedBillingOptionsPageTitle Page Title as ");
			WebElement e = EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.MERGE_BILLEDPARTY);
			e.clear();
			e.sendKeys(billedParty);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterMergeBillingParty(String billingParty) {
		try {
			System.out.println(
					"[MMS_Combined Billing : clickCombinedInvoice] Verifying verifyCombinedBillingOptionsPageTitle Page Title as ");
			WebElement e = EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.MERGE_BILLINGPARTY);
			e.clear();
			e.sendKeys(billingParty);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickActions(String actions1) {
		rowNumber = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 2, actions1);
		EY_FW_Utility.clickMMSActions(MMS_MyCompanyInfoPageLocator.contacttable, MMS_UserManagerPageLocator.divison,
				rowNumber, 9);
	}

	public void clickActionList(String actionList) {
		EY_FW_Utility.clickMMSActionList(MMS_MyCompanyInfoPageLocator.contacttable, MMS_UserManagerPageLocator.actionlist1,
				MMS_UserManagerPageLocator.actionlist2, rowNumber, 9, actionList);
	}

	public void clickGenerateDxButton() {
		EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.GENERATE_DX_FILE_BUTTON).click();
	}

	public void enterCombinedDXFromInvoiceNo(String invNo) {
		try {
			System.out.println(
					"[MMS_Combined Billing : clickCombinedInvoice] Verifying verifyCombinedBillingOptionsPageTitle Page Title as ");
			WebElement e = EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.COMBINED_DX_START_INV);
			e.clear();
			e.sendKeys(invNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterCombinedDXToInvoiceNo(String invNo) {
		try {
			System.out.println(
					"[MMS_Combined Billing : clickCombinedInvoice] Verifying verifyCombinedBillingOptionsPageTitle Page Title as ");
			WebElement e = EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.COMBINED_DX_END_INV);
			e.clear();
			e.sendKeys(invNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickActionsCombineDX(String actions) {
		rowNumber = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 2, actions);
		EY_FW_Utility.clickMMSActions(MMS_MyCompanyInfoPageLocator.contacttable, MMS_UserManagerPageLocator.divison,
				rowNumber, 8);
	}

	public void clickActionListCombineDX(String actionList) {
		EY_FW_Utility.clickMMSActionList(MMS_MyCompanyInfoPageLocator.contacttable, MMS_UserManagerPageLocator.actionlist1,
				MMS_UserManagerPageLocator.actionlist2, rowNumber, 8, actionList);
	}

	public void clickclose() {
		EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.Close_Notification).click();
	}
	
	public void clickcloseProcessNotification() {
		EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.Close_Process_Notification).click();
	}
	
	

	public void clickactionspopup() {
		EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.ACTIONS_POPUP).click();
	}

	public void clickDownloadpopup() {
		EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.DOWNLOAD_popup).click();
	}

	public void clickFileActions(String actions) {
		rowNumber = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 1, actions);
		EY_FW_Utility.clickMMSActions(MMS_MyCompanyInfoPageLocator.contacttable, MMS_UserManagerPageLocator.divison,
				1, 4);
	}

	public void clickFileActionList(String actionList) {
		EY_FW_Utility.clickMMSActionList(MMS_MyCompanyInfoPageLocator.contacttable, MMS_UserManagerPageLocator.actionlist1,
				MMS_UserManagerPageLocator.actionlist2, 1, 4, actionList);
	}

	/*public void getBulkEmailStatusText(String s) {
		String text = EY_FW_Utility.getTextofField(MMS_MyCompanyInfoPageLocator.contacttable, rowNumber, 3);
		//MatcherAssert.assertThat(text, equalTo(s));
	}*/

	public void clickRemoveFilter() {
		EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.REMOVE_FILTER).click();
	}
	
/*	public void clickCloseDownloadpopup() throws FindFailed{
		Screen s = new Screen();
		String path = System.getProperty("user.dir");
		Pattern p = new Pattern(path+"/"+MMS_CombineBillingPageLocator.downloadpopupclose);
		s.click(p);
	}*/
}
