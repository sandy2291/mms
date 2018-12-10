package com.ey.mms.serenitystepsThemelevel;

import static org.hamcrest.CoreMatchers.equalTo;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.testng.Assert;

import com.ey.mms.pageobjects.HomePage;
import com.ey.mms.pageobjects.MergeCRBandMMSInvoiceDataPage;
import com.ey.mms.pageobjects.mmsLocators.MMS_CombineBillingPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.util.EY_FW_Utility;

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.greaterThan;
public class MMS_CombinedBillingTheme_SerenitySteps {

	@ManagedPages
	HomePage mmshomepage;

	@ManagedPages
	MergeCRBandMMSInvoiceDataPage mergeCRBandMMSpage;

	
	@Step
	public void clickBilling() {
		mmshomepage.clickBilling();
	}

	@Step
	public void movetoCombineBilling(String s) {
		mmshomepage.selectCombinedBillingSubMenu(s);
	}

	@Step
	public void clickCombinedBillingOptions(String s) {
		mmshomepage.selectCombinedBilling_CombinedBillingSubmenu(s);
	}

	@Step
	public void verifyCombinedBillingOptionsPageTitle(String s) {
		EY_FW_Utility.waitTillPageLoad(3);
		// mergeCRBandMMSpage.verifyCombinedBillingOptionsPageTitle(s);
		try {
			System.out.println(
					"[MMS_COMBINED BILLING : verifyCombinedBillingOptionsPageTitle] Verifying verifyCombinedBillingOptionsPageTitle Page Title as ");
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), equalTo(s));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void clickCombinedInvoices() {
		mergeCRBandMMSpage.clickCombinedInvoice();
	}

	@Step
	public void selectInvoice(String s) {
		mergeCRBandMMSpage.selectInvoice(s);
	}

	@Step
	public void verify_empty_table(){
		EY_FW_Utility.doWait(3000);
		WebElement e = EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.contacttable);
		MatcherAssert.assertThat(e.getText(), equalTo("No data available in table"));
	}
	
	@Step
	public void clickFilter() {
		mergeCRBandMMSpage.clickFilter();
	}

	@Step
	public void enterfromInvoice(String s) {
		mergeCRBandMMSpage.enterFromInvoiceNo(s);
	}

	@Step
	public void entertoInvoiceNO(String s) {
		mergeCRBandMMSpage.enterToInvoiceNo(s);
	}

	@Step
	public void clickSave() {
		mergeCRBandMMSpage.clickSaveButton();
		EY_FW_Utility.doWait(4000); // required for refreshing
	}

	@Step
	public void confirmCombinedInvoice() {
		EY_FW_Utility.doWait(2000); // loading and getting enabled
		mergeCRBandMMSpage.confirmCombinedInvoice();
		EY_FW_Utility.doWait(4000); // refreshment
	}

	@Step
	public void entermergefromInvoice(String s) {
		mergeCRBandMMSpage.enterMergeFromInvoiceNo(s);
	}

	@Step
	public void enterMergetoInvoiceNO(String s) {
		mergeCRBandMMSpage.enterMergeToInvoiceNo(s);
	}

	@Step
	public void enterMergeBilledParty(String s) {
		mergeCRBandMMSpage.enterMergeBilledParty(s);
	}

	@Step
	public void enterMergeBillingParty(String s) {
		mergeCRBandMMSpage.enterMergeBillingParty(s);
	}

	@Step
	public void clickActions(String s) {
		mergeCRBandMMSpage.clickActions(s);
		EY_FW_Utility.doWait(2000);
	}

	@Step
	public void clickActionList(String s) {
		mergeCRBandMMSpage.clickActionList(s);
	}

	@Step
	public void clickGenerateDXButton() {
		mergeCRBandMMSpage.clickGenerateDxButton();
	}

	@Step
	public void getRowsCount() {
		EY_FW_Utility.doWait(4000);
		//mergeCRBandMMSpage.getCountRows();
		WebElement e = EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.contacttable);
		int size = EY_FW_Utility.getElementListByLocator(MMS_MyCompanyInfoPageLocator.contacttable).size();
		MatcherAssert.assertThat(size, greaterThan(0));
		if (size == 1)
			MatcherAssert.assertThat(e.getText(), not(equalTo("No data available in table")));
	}

	@Step
	public void verify_popup_title(String popupTitle) {
		EY_FW_Utility.doWait(5000); // wait to get text (load)
		WebElement e = EY_FW_Utility
				.findElementByLocator(MMS_CombineBillingPageLocator.Process_Created_Notification);
		MatcherAssert.assertThat(e.getText(), equalTo(popupTitle));
	}

	@Step
	public void verify_msg(String mesage) {
		WebElement e = EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.Process_Notification_Text);
		MatcherAssert.assertThat(e.getText(), equalTo(mesage));
		EY_FW_Utility.doWait(10000); //wait to generate
	}

	@Step
	public void enterCombinedDXfromInvoice(String s) {
		mergeCRBandMMSpage.enterCombinedDXFromInvoiceNo(s);
	}

	@Step
	public void enterCombinedDXtoInvoiceNO(String s) {
		mergeCRBandMMSpage.enterCombinedDXToInvoiceNo(s);
	}

	@Step
	public void clickActionsCombineDX(String s) {
		mergeCRBandMMSpage.clickActionsCombineDX(s);
		EY_FW_Utility.doWait(2000);
	}

	@Step
	public void clickActionListCombineDX(String s) {
		mergeCRBandMMSpage.clickActionListCombineDX(s);
	}

	@Step
	public void invoice_disappear(String invNo) {
		EY_FW_Utility.waitForLargeProgressWindowToAppear(5);
		EY_FW_Utility.waitForLargeProgressWindowToDisappear(10);
		EY_FW_Utility.waitForProgressWindowToDisappear(5);
		
		WebElement e = EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.contacttable);
		MatcherAssert.assertThat(e.getText(), equalTo("No data available in table"));
		//EY_FW_Utility.verifyTableColumnDoesntContains(MMS_MyCompanyInfoPageLocator.contacttable, 2, invNo);
	}

	@Step
	public void verify_inv_attached(String invoiceNo) {
		//EY_FW_Utility.doWait(3000);
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 3, invoiceNo);
	}

	@Step
	public void closeNotification() {
		mergeCRBandMMSpage.clickclose();
		EY_FW_Utility.waitTillPageLoad(3);
	}
	
	@Step
	public void closeProcessNotification() {
		mergeCRBandMMSpage.clickcloseProcessNotification();
		EY_FW_Utility.waitTillPageLoad(3);
	}

	@Step
	public void clickactionpopup() {
		mergeCRBandMMSpage.clickactionspopup();
	}

	@Step
	public void clickDownloadpopup() {
		mergeCRBandMMSpage.clickDownloadpopup();
	}

	@Step
	public void clickRemoveFilter() {
		mergeCRBandMMSpage.clickRemoveFilter();
	}
	/*
	@Step
	public void closeReportDownloadpopup() throws FindFailed{
		//mergeCRBandMMSpage.clickCloseDownloadpopup();
	}*/

	@Step
	public void clickFileActionList(String s) {
		mergeCRBandMMSpage.clickFileActionList(s);
		EY_FW_Utility.doWait(15000); // depends on time to validate by service
	}

	@Step
	public void clickFileActions(String s) {
		mergeCRBandMMSpage.clickFileActions(s);
		EY_FW_Utility.doWait(2000);
	}

	@Step
	public void getBulkEmailStatus(String s) {
		EY_FW_Utility.doWait(5000); // update
		EY_FW_Utility.findElementByLocator(MMS_CombineBillingPageLocator.REFRESH).click();
		EY_FW_Utility.doWait(2000); // refresh
		//mergeCRBandMMSpage.getBulkEmailStatusText(s);
		//String text = EY_FW_Utility.getTextofField(MMS_MyCompanyInfoPageLocator.contacttable, MergeCRBandMMSInvoiceDataPage.rowNumber, 3);
		String text = EY_FW_Utility.mms_getTextOfField(MMS_MyCompanyInfoPageLocator.contacttable, 1, 3);
		MatcherAssert.assertThat(text, equalTo(s));
	}
}
