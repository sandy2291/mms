package com.ey.mms.serenitystepsThemelevel;

import static org.hamcrest.CoreMatchers.equalTo;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.ey.mms.pageobjects.VoidingPage;
import com.ey.mms.pageobjects.MMS_ExpectedResult;
import com.ey.mms.pageobjects.HomePage;
import com.ey.mms.pageobjects.InvoiceReviewPage;
import com.ey.mms.pageobjects.LoginPage;
import com.ey.mms.pageobjects.mmsLocators.MMS_InvoiceReviewPageLocator;
import com.ey.mms.serenitystepsThemelevel.expectedData.InvoiceReview;
import com.ey.mms.util.EY_FW_Utility;

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;

public class MMS_InvoiceTheme_SerenitySteps {

	@ManagedPages
	LoginPage mmsloginpage;

	@ManagedPages
	HomePage mmshomepage;

	@ManagedPages

	InvoiceReviewPage mmsinvoicereviewPage;
	
	@ManagedPages
	VoidingPage mmsvoidfirstoption;

	@Step
	public void opensMMSLoginPage() {
		System.out.println("------=================-------- " + mmsloginpage);
		mmsloginpage.openURL();
		// mmsloginpage.enterUserId("kcsadmin");
	}

	@Step
	public void enterUserId(String userid) {
		mmsloginpage.enterUserId(userid);
	}

	@Step
	public void enterPassword(String input) {
		mmsloginpage.enterPassword(input);
		// mmsloginpage.enterUserId("kcsadmin");

	}

	@Step
	public void clickLoginButton() {
		mmsloginpage.clickLoginButton();
		// mmsloginpage.enterUserId("kcsadmin");

	}

	@Step
	public void clickInvoiceMainMenu() {
		mmshomepage.clickInvoicesMainMenu();
	}

	@Step
	public void verifyInvoiceReviewPagetitle() {
		// mmsinvoicereviewPage.verifyInvoiceReviewPageTitle();
		System.out.println(
				"[MMS_Invoice_ReviewPage : verifyInvoiceReviewPageTitle] Verifying Invoice Review Page Title as "
						+ InvoiceReview.INVOICES_INVOICEREVIEW_PAGETITLE);
		MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
				equalTo(InvoiceReview.INVOICES_INVOICEREVIEW_PAGETITLE));
	}

	@Step
	public void clickInvoiceReviewSubmenu() {
		mmshomepage.ClickInvoiceReviewSubMenu();
	}

	@Step
	public void clickInvoiceCheckBox(String s) {
		mmsinvoicereviewPage.clickInvoiceCheckbox(s);

	}

	@Step
	public void clickInvoiceReviewAction() {
		mmsinvoicereviewPage.clickInvoiceReviewAction();
	}

	@Step
	public void clickInvoiceActionViewDetails() {
		mmsinvoicereviewPage.clickInvoiceReviewActionViewDetails();
	}

	@Step
	public void verifyInvoiceDetailsPageTitle() {
		// mmsinvoicereviewPage.verifyInvoiceDetailsPageTitle();
		System.out.println(
				"[MMS_Invoice_ReviewPage : verifyInvoiceDetailsPageTitle] Verifying Invoice Details Page Title as "
						+ InvoiceReview.INVOICES_INVOICEREVIEW_DETAILS_PAGETITLE);
		MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
				equalTo(InvoiceReview.INVOICES_INVOICEREVIEW_DETAILS_PAGETITLE));
	}

	@Step
	public void clcikInvoiceFilter() {
		mmsinvoicereviewPage.clickInvoiceReviewFilter();
	}

	@Step
	public void enterInvoiceStartNumber(String startNumber) {
		mmsinvoicereviewPage.enterStartInvoiceNumber(startNumber);
	}

	@Step
	public void enterInvoiceEndNumber(String endNumber) {
		mmsinvoicereviewPage.enterEndInvoiceNumber(endNumber);
	}

	@Step
	public void verifyFilterInvoiceDetail() {
		// mmsinvoicereviewPage.verifyInvoiceDetailsAfterFilter();
		try {
			System.out.println(
					"[MMS_Invoice_ReviewPage : verifyInvoiceDetailsAfterFilter] Verifying Invoice Detail in the Grid after Filter "
							+ InvoiceReview.INVOICES_INVOICEREVIEW_FILTER_INVOICEDETAIL);
			WebElement wb = EY_FW_Utility
					.findElementByLocator(MMS_InvoiceReviewPageLocator.INVOICEREVIEW_FILTERDATA_VERIFY_LOCATOR);
			String errormsg = wb.getText();
			MatcherAssert.assertThat(errormsg, equalTo(InvoiceReview.INVOICES_INVOICEREVIEW_FILTER_INVOICEDETAIL));
		}

		catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void clickInvoiceReviewSave() {
		mmsinvoicereviewPage.clickInvoiceReviewSave();

		
	}

	@Step
	public void clickInvoiceNumberClose() {
		mmsinvoicereviewPage.clickInvoiceNumberClose();
	}

	@Step
	public void clickInvoiceGenerateReport() {
		mmsinvoicereviewPage.clickInvoiceReviewGenerateReport();
	}

	@Step
	public void clickInvoiceReportDownloadActio() {
		mmsinvoicereviewPage.clickReportDownloadAction();
	}

	@Step
	public void clickInvoiceeEportActionDownload() {
		mmsinvoicereviewPage.clickReportActionDownload();
	}

	@Step
	public void clickInvoiceApprovePayment() {
		//ey
		mmsinvoicereviewPage.clickInvoiceApprovePayment();
	}

	@Step
	public void clickInvoiceApproveOk() {
		mmsinvoicereviewPage.clickInvoiceReviewApprovePaymentOk();
		EY_FW_Utility.doWait(3000);
	}

	@Step
	public void selectPaymentStatus(String s) {
		mmsinvoicereviewPage.selectPaymentStatus(s);
	}

	@Step
	public void clickInvoicePaidCheckbox() {
		mmsinvoicereviewPage.clickInvoiceReviewPaidCheckBox();
	}

	@Step
	public void clickInvoiceMarKPaid() {
		mmsinvoicereviewPage.clickInvoiceReviewMarkPaid();
	}

	@Step
	public void verifyMarkPaidErrorMessage() {
		// mmsinvoicereviewPage.verifyMarKPaidErrorMessage();
		System.out.println("[MMS_Invoice_ReviewPage : verifyMarKPaidErrormsg] Verifying Mark Paid Error Message "
				+ InvoiceReview.INVOICES_INVOICEREVIEW_MARKPAID_ERROR);
		WebElement wb = EY_FW_Utility
				.findElementByLocator(MMS_InvoiceReviewPageLocator.INVOICEREVIEW_MARKPAID_ERROR_LOCATOR);
		String errormsg = wb.getText();
		MatcherAssert.assertThat(errormsg, equalTo(InvoiceReview.INVOICES_INVOICEREVIEW_MARKPAID_ERROR));
	}

	@Step
	public void clickInvoiceMarkPaidClose() {
		mmsinvoicereviewPage.clickInvoiceReviewMarkPaidClose();
	}

	@Step
	public void clickInvoiceUnpaid() {
		mmsinvoicereviewPage.clickInvoiceReviewUnpaidCheckBox();

	}

	@Step
	public void verifyInvoiceApprovePaymentStatus() {
		EY_FW_Utility.doWait(3000);
		// mmsinvoicereviewPage.verifyApproveInvoiceStatus();
		System.out.println(
				"[MMS_Invoice_ReviewPage : verifyApproveInvoiceStatus] Verifying Approve Payment status for Invoice "
						+ InvoiceReview.INVOICES_INVOICEREVIEW_UNPAIDINVOICE_PAYMENTSTATUS);
		WebElement wb = EY_FW_Utility
				.findElementByLocator(MMS_InvoiceReviewPageLocator.INVOICEREVIEW_APPROVE_PAYMENTSTATUS);
		String paymentstatus = wb.getText();
		MatcherAssert.assertThat(paymentstatus,
				equalTo(InvoiceReview.INVOICES_INVOICEREVIEW_UNPAIDINVOICE_PAYMENTSTATUS));
	}
	
	@Step
	public void verifyInvoiceUnpaidPaymentStatus() {
		EY_FW_Utility.waitForProcessingNotificationToAppear(5);
		EY_FW_Utility.waitForProcessingNotificationToDisappear(20);
		System.out.println(
				"[MMS_Invoice_ReviewPage : verifyUnpaidInvoiceStatus] Verifying Unpaid Payment status for Invoice "
						+ InvoiceReview.INVOICES_INVOICEREVIEW_UNPAIDINVOICE_STATUS);
		WebElement wb = EY_FW_Utility
				.findElementByLocator(MMS_InvoiceReviewPageLocator.INVOICEREVIEW_UNPAID_PAYMENTSTATUS);
		String paymentstatus = wb.getText();
		MatcherAssert.assertThat(paymentstatus,
				equalTo(InvoiceReview.INVOICES_INVOICEREVIEW_UNPAIDINVOICE_STATUS));
	}

	public void verifyInvoiceRejectedPaymentStatus() {
		EY_FW_Utility.doWait(3000);
		System.out.println(
				"[MMS_Invoice_ReviewPage : verifyUnpaidInvoiceStatus] Verifying Unpaid Payment status for Invoice "
						+ InvoiceReview.INVOICES_INVOICEREVIEW_REJECTEDINVOICE_STATUS);
		WebElement wb = EY_FW_Utility
				.findElementByLocator(MMS_InvoiceReviewPageLocator.INVOICEREVIEW_REJECTED_PAYMENTSTATUS);
		String paymentstatus = wb.getText();
		MatcherAssert.assertThat(paymentstatus,
				equalTo(InvoiceReview.INVOICES_INVOICEREVIEW_REJECTEDINVOICE_STATUS));
		
	}
}
