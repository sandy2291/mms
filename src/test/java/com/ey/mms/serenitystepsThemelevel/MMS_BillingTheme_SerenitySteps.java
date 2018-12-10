package com.ey.mms.serenitystepsThemelevel;

//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObject.*;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.ey.mms.pageobjects.VoidingPage;
import com.ey.mms.pageobjects.MMS_ExpectedResult;
import com.ey.mms.pageobjects.HomePage;
import com.ey.mms.pageobjects.InvoiceHistoryPage;
import com.ey.mms.pageobjects.InvoicingPage;
import com.ey.mms.pageobjects.UploadDXFilePage;
import com.ey.mms.pageobjects.mmsLocators.MMS_BillingContactsPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_InvoiceHistoryPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_InvoicingPageLocator;
import com.ey.mms.serenitystepsThemelevel.expectedData.InvoiceHistory;
import com.ey.mms.serenitystepsThemelevel.expectedData.UploadDX;
import com.ey.mms.util.EY_FW_Utility;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;

public class MMS_BillingTheme_SerenitySteps extends PageObject {

	@ManagedPages
	HomePage mmshomepage;

	@ManagedPages
	InvoiceHistoryPage mmsinvoicehistorypage;

	@ManagedPages
	InvoicingPage mmsinvoicing;

	@ManagedPages
	UploadDXFilePage uploaddxpage;
	
	@ManagedPages
	VoidingPage mmsvoidfirstoption;

	
	
	@Step
	public void clickHomePage() {
		// mmshomepage.clickHome_Page();
	}

	@Step
	public void clickBillingPage() {
		mmsinvoicehistorypage.clickBilling();
	}

	@Step
	public void clickInvoices(String s) {
		mmshomepage.clickUploadInvoices(s);
	}

	@Step
	public void clickUpload() {
		mmshomepage.clickUpload();
	}

	@Step
	public void clickInvoiceHistoryPage() {
		mmsinvoicehistorypage.clickInvoiceHistory();
	}

	@Step
	public void clickInvoicingPage() {
		mmsinvoicehistorypage.clickInvoicing();
	}

	@Step
	public void verifyInvoiceHistoryPageTitle() {
		// mmsinvoicehistorypage.verifyInvoiceHistoryPageTitle();
		System.out.println(
				"[MMS_InvoiceHistoryPage : verifyInvoiceHistoryPageTitle] Verifying Invoice History Page title as "
						+ InvoiceHistory.INVOICE_HISTORY_PAGE_TITLE);
		MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
				equalTo(InvoiceHistory.INVOICE_HISTORY_PAGE_TITLE));
	}

	@Step
	public void verifyInvoicingPageTitle() {
		// mmsinvoicehistorypage.verifyInvoicingPageTitle();
		System.out.println(
				"[MMS_InvoiceHistoryPage : verifyInvoiceHistoryPageTitle] Verifying Invoice History Page title as "
						+ InvoiceHistory.INVOICING);
		MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), equalTo(InvoiceHistory.INVOICING));
	}

	@Step
	public void removeFilters() {
		mmsinvoicehistorypage.removeFilter();
	}

	@Step
	public void selectInvoiceNumber(String s, int i) throws InterruptedException {
		//mmsinvoicehistorypage.searchTableandClick(s, i);
		 mmsinvoicehistorypage.selectInvoice(s);
	}

	@Step
	public void clickSendtoCombinedBillingButton() {
		
		mmsinvoicehistorypage.clickSendToCombinedBilling();
		EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.popup_title);
	}

	@Step
	public void clickOKCombinedBilling() {
		mmsinvoicehistorypage.clickOKCombinedBilling();
		EY_FW_Utility.waitForProgressWindowToDisappear(15);
	}

	@Step
	public void clickRestoreDefault() {
		mmsinvoicehistorypage.clickRestoreDefault();
	}

	@Step
	public void verifyCombinedBilling() {
		EY_FW_Utility.doWait(3000); // verification
		mmsinvoicehistorypage.verifyLastsenttoCombinedBillingDate(); // can't
																		// move
																		// as of
																		// list
	}

	@Step
	public void clickBulkBilling() {
		mmsinvoicehistorypage.clickBulkBillingSummary();
	}

	@Step
	public void clickFilter() {
		mmsinvoicehistorypage.clickFilterButton();
	}

	@Step
	public void enterfromInvoice(String s) {
		mmsinvoicehistorypage.enterFromInvoiceNumber(s);
	}

	@Step
	public void enterEndInvoice(String s) {
		mmsinvoicehistorypage.enterEndInvoiceNumber(s);
	}

	@Step
	public void enterInvHistoryStartDate(String s) {
		mmsinvoicehistorypage.enterInvStartDate(s);
	}

	@Step
	public void entervoidStatus(String s) {
		mmsinvoicehistorypage.voidstatus(s);
	}

	@Step
	public void clickSave() {
		mmsinvoicehistorypage.clickSaveButton();
		EY_FW_Utility.doWait(2000);
	}

	@Step
	public void clickactions() {
		mmsinvoicing.clickaction();
	}

	@Step
	public void clickactionList(String s) {
		mmsinvoicing.clickactionlist(s);
	}

	@Step
	public void verifyCar_Billing(String billing, String party, String amount) {
		EY_FW_Utility.verifyTableColumnContain(MMS_InvoicingPageLocator.TABLE_ELEMENT3, 4, billing);
		EY_FW_Utility.verifyTableColumnContain(MMS_InvoicingPageLocator.TABLE_ELEMENT3, 5, party);
		EY_FW_Utility.verifyTableColumnContain(MMS_InvoicingPageLocator.TABLE_ELEMENT3, 8, amount);
		EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.close).click();
		EY_FW_Utility.waitTillPageLoad(3);
	}

	@Step
	public void selecttype(String s) {
		mmsinvoicing.selectType(s);
	}

	@Step
	public void enterRmark(String s) {
		mmsinvoicing.enterRmark(s);
	}

	@Step
	public void SelectFirstRow() {
		mmsinvoicing.selectFirstRow();
	}

	@Step
	public void clickGenerateInvoice() {
		mmsinvoicing.GenerateInvoice();
		EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.popup_title);
		//EY_FW_Utility.doWait(4000);
	}

	@Step
	public void enterInvNumber(String s) {
		mmsinvoicing.enterInvNumber(s);
	}

	@Step
	public void enterInvStartDate(String s) {
		mmsinvoicing.enterInvStartDate(s);
	}

	@Step
	public void eneterInvDueDate(String s) {
		mmsinvoicing.enterInvDueDate(s);
	}

	@Step
	public void selectBillingContacts(String s) {
		mmsinvoicing.selectBillingContacts(s);
	}

	@Step
	public void ClickGenerateInvPopup() {
		mmsinvoicing.clickGenerateInvoiceButtonpopup();
		EY_FW_Utility.doWait(15000);
	}

	@Step
	public void enterInvDate(String s) {
		mmsinvoicing.enterInvoiceStartDate(s);
		//EY_FW_Utility.doWait(1000);
	}

	@Step
	public void enterInvNo(String s) {
		mmsinvoicing.enterInvoiceNumber(s);
		//EY_FW_Utility.doWait(1000);
	}

	@Step
	public void enterInvDueDate(String s) {
		mmsinvoicing.enterInvoiceDueDate(s);
		//EY_FW_Utility.doWait(1000);
	}

	@Step
	public void selectBillingContactsInv(String s) {
		mmsinvoicing.selectInvoiceBC(s);
		//EY_FW_Utility.doWait(1000);
	}

	@Step
	public void selectCustomer(String s) {
		mmsinvoicing.selectCustomer(s);
	}

	@Step
	public void countNotification() {
		EY_FW_Utility.doWait(30000); // verification
		// mmsinvoicing.countNotification();
		try {
			EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.Notification).click();
	//		MatcherAssert.assertThat(EY_FW_Utility.getElementListByLocator(MMS_InvoicingPageLocator.NotificationAlert).size(),
		//			equalTo(1));// equalTo(invcount));
			// EY_FW_Utility.doWait(3000);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void checkNotificationMessage() {
		EY_FW_Utility.doWait(30000); // verification
		// mmsinvoicing.checkNotificationMessage();
		try {
			List<WebElement> l = EY_FW_Utility
					.getElementListByLocator(MMS_InvoicingPageLocator.NotificationAlertMessage);
			for (WebElement e : l) {
				MatcherAssert.assertThat(e.getText(), equalTo("SUCCESS"));
				// EY_FW_Utility.doWait(2000);
			}
			EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.Notification).click();
			// EY_FW_Utility.doWait(3000);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void checkpopupErrorMessage(String s) {
		EY_FW_Utility.doWait(2000);
		// mmsinvoicing.checkPopupErrorMessage(s);
		try {
			MatcherAssert.assertThat(s,
					equalTo(EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.POPUP_MSG).getText()));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	@Step
	public void checkpopupSecondErrorMessage(String s) {
		EY_FW_Utility.doWait(2000);
		// mmsinvoicing.checkPopupErrorMessage(s);
		try {
			MatcherAssert.assertThat(s,
					equalTo(EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.POPUP_MSG2).getText()));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void checkVerificationErrorMessage(String s) {
		// mmsinvoicing.checkVerificationErrorMessage(s);
		try {
			String text = EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.ERROR_Message).getText();
			System.out.println(text);
			MatcherAssert.assertThat(s, containsText(text));
			EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.EmptyReports).click();
			// EY_FW_Utility.doWait(3000);
			EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.Notification).click();
			// EY_FW_Utility.doWait(2000);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void clickCancelInvoice() {
		mmsinvoicing.Cancel_Invoice();
	}

	@Step
	public void VerifyUploadDxPageTitle() {
		// uploaddxpage.verifyUploadDXPageTitle();
		System.out.println("[MMS_UploadDXPage : verifyUploadDXPageTitle] Verifying Invoice History Page title as "
				+ UploadDX.Upload_dx_page_Title);
		MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), equalTo(UploadDX.Upload_dx_page_Title));
	}

	@Step
	public void clickRefresh() {
		uploaddxpage.clickRefresh();
	}
	
	
	
}