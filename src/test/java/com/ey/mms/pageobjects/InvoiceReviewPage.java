package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import com.ey.mms.pageobjects.MMS_ExpectedResult;
import com.ey.mms.pageobjects.MMS_Locators;
import com.ey.mms.pageobjects.mmsLocators.MMS_InvoiceReviewPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.util.EY_FW_Utility;
import com.opera.core.systems.scope.protos.ExecProtos.ActionList.Action;

import net.serenitybdd.core.pages.PageObject;

public class InvoiceReviewPage extends PageObject {
	/*
	 * public void verifyInvoiceReviewPageTitle() { System.out.
	 * println("[MMS_Invoice_ReviewPage : verifyInvoiceReviewPageTitle] Verifying Invoice Review Page Title as "
	 * + MMS_ExpectedResult.INVOICES_INVOICEREVIEW_PAGETITLE);
	 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.INVOICES_INVOICEREVIEW_PAGETITLE));
	 * //EY_FW_Utility.doWait(2000); }
	 * 
	 * public void verifyInvoiceDetailsPageTitle(){ System.out.
	 * println("[MMS_Invoice_ReviewPage : verifyInvoiceDetailsPageTitle] Verifying Invoice Details Page Title as "
	 * + MMS_ExpectedResult.INVOICES_INVOICEREVIEW_DETAILS_PAGETITLE);
	 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.INVOICES_INVOICEREVIEW_DETAILS_PAGETITLE));
	 * //EY_FW_Utility.doWait(2000); }
	 */
	int rowno;

	public void clickInvoiceCheckbox(String boxText) {
		try {

			rowno = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 6, boxText);
			System.out.println("[MMS_Invoice_ReviewPage : clickInvoiceCheckbox] Clicking on Invoice CheckBox");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceReviewPageLocator.INVOICE_CHECKBOX_LOCATOR1 + rowno
					+ MMS_InvoiceReviewPageLocator.INVOICE_CHECKBOX_LOCATOR2).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickInvoiceReviewAction() {
		try {
			System.out.println(
					"[MMS_Invoice_ReviewPage : clickInvoiceReviewAction] Clicking on Action for selected Invoice in Invoice Review Page");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceReviewPageLocator.INVOICEREVIEW_ACTION_LOCATOR).click();

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickInvoiceReviewActionViewDetails() {
		try {
			System.out
					.println("[MMS_Invoice_ReviewPage : clickInvoiceReviewActionViewDetails] Clicking on view Details");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceReviewPageLocator.INVOICEREVIEW_ACTION_DETAILS_LOCATOR)
					.click();

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickInvoiceReviewFilter() {
		try {
			System.out.println(
					"[MMS_Invoice_ReviewPage : clickInvoiceReviewFilter] Clicking on Filter in Invoice Review Page");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceReviewPageLocator.INVOICEREVIEW_FILTER_LOCATOR).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterStartInvoiceNumber(String startNumber) {
		try {
			System.out.println("[MMS_Invoice_ReviewPage : enterStartInvoiceNumber] Entering '" + startNumber
					+ "' Starting Invoice Number ");
			WebElement wb = EY_FW_Utility.findElementByLocator(
					MMS_InvoiceReviewPageLocator.INVOICEREVIEW_FILTTER_INVOICENUMBERSTART_LOCATOR);
			wb.clear();
			wb.sendKeys(startNumber);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void enterEndInvoiceNumber(String endNumber) {
		try {
			System.out.println("[MMS_Invoice_ReviewPage : enterEndInvoiceNumber] Entering '" + endNumber
					+ "' End Invoice Number ");
			WebElement wb = EY_FW_Utility.findElementByLocator(
					MMS_InvoiceReviewPageLocator.INVOICEREVIEW_FILTER_INVOICENUMBEREND_LOCATOR);
			wb.clear();
			wb.sendKeys(endNumber);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickInvoiceReviewSave() {
		try {
			System.out.println(
					"[MMS_Invoice_ReviewPage : clickInvoiceReviewSave] Clicking on Filter Save Button in Invoice review Page");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceReviewPageLocator.FILTER_SAVE).submit();
			EY_FW_Utility.waitForProcessingNotificationToAppear(5);
			EY_FW_Utility.waitForProcessingNotificationToDisappear(20);
			/*Screen s = new Screen();
			String path = System.getProperty("user.dir");
			Pattern p = new Pattern(path+"/"+MMS_InvoiceReviewPageLocator.InvoiceReviewFilterSave);
			s.click(p);*/
			/*
			 * System.out.
			 * println("[MMS_Invoice_ReviewPage : clickInvoiceReviewSave] Clicking on Filter Save Button in Invoice review Page"
			 * ); EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.
			 * INVOICEREVIEW_FILTER_SAVE_LOCATOR).click();
			 */
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	/*
	 * public void verifyInvoiceDetailsAfterFilter() { try{ System.out.
	 * println("[MMS_Invoice_ReviewPage : verifyInvoiceDetailsAfterFilter] Verifying Invoice Detail in the Grid after Filter "
	 * + MMS_ExpectedResult.INVOICES_INVOICEREVIEW_FILTER_INVOICEDETAIL);
	 * WebElement
	 * wb=EY_FW_Utility.getAnyElementByAnyLocator(MMS_InvoiceReviewPageLocator.
	 * INVOICEREVIEW_FILTERDATA_VERIFY_LOCATOR); String errormsg=wb.getText();
	 * MatcherAssert.assertThat(errormsg,
	 * equalTo(MMS_ExpectedResult.INVOICES_INVOICEREVIEW_FILTER_INVOICEDETAIL));
	 * }
	 * 
	 * catch(Exception e){ Assert.assertTrue(false, e.getMessage()); } }
	 */

	public void clickInvoiceNumberClose() {
		try {
			System.out.println(
					"[MMS_Invoice_ReviewPage : clickInvoiceNumberClose] Clicking Close Invoice Number Number Button");
			EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
			EY_FW_Utility
					.findElementByLocator(MMS_InvoiceReviewPageLocator.INVOICEREVIEW_INVOICENUMBER_CLOSE_LOCATOR)
					.click();

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void clickInvoiceReviewGenerateReport() {
		try {
			System.out.println(
					"[MMS_Invoice_ReviewPage : clickInvoiceReviewGenerateReport] Clicking on Generate Report in Invoice Review");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceReviewPageLocator.INVOICEREVIEW_GENERATEREPORT_LOCATOR)
					.click();

		}

		catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void clickReportDownloadAction() {
		try {
			System.out.println(
					"[MMS_Invoice_ReviewPage : clickReportDownloadAction] Clicking on Action in Report Download Page");
			EY_FW_Utility
					.findElementByLocator(MMS_InvoiceReviewPageLocator.INVOICEREVIEW_REPORTDOWNLOAD_ACTION_LOCATOR)
					.click();

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickReportActionDownload() {
		try {
			System.out.println(
					"[MMS_Invoice_ReviewPage : clickReportActionDownload] Clicking on Download Under Action in Report Download Page");
			EY_FW_Utility.findElementByLocator(
					MMS_InvoiceReviewPageLocator.INVOICEREVIEW_REPORTDOWNLOAD_DOWNLOAD_LOCATOR).click();
			// EY_FW_Utility.doWait(2000);
			Screen s = new Screen();
			String path = System.getProperty("user.dir");
			/*Pattern p = new Pattern(path+"/"+MMS_InvoiceReviewPageLocator.InvoiceReview_Report_DownloadClose);
			s.click(p);*/
			/*Pattern p1 = new Pattern(path+"/"+MMS_InvoiceReviewPageLocator.ReportDownloadClose);

			// EY_FW_Utility.doWait(2000);
			s.click(p1);*/
			EY_FW_Utility.findElementByLocator(MMS_InvoiceReviewPageLocator.CLOSE_BUTTON).click();
			/*
			 * Actions action = new Actions(getDriver());
			 * action.sendKeys(Keys.ESCAPE);
			 */
			// EY_FW_Utility.doWait(2000);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickInvoiceApprovePayment() {
		try {
			System.out.println(
					"[MMS_Invoice_ReviewPage : clickInvoiceApprovePayment] Clicking on Approve Payment in Invoice Review page");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceReviewPageLocator.INVOICEREVIEW_APPROVE_PAYMENT_LOCATOR)
					.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickInvoiceReviewApprovePaymentOk() {
		try {
			System.out.println(
					"[MMS_Invoice_ReviewPage : clickInvoiceReviewApprovePaymentOk] Clicking Ok in Approve Payment Page of Invoice Review");
			EY_FW_Utility
					.findElementByLocator(MMS_InvoiceReviewPageLocator.INVOICEREVIEW_APPROVE_PAYMENT_OK_LOCATOR)
					.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickInvoiceReviewMarkPaid() {
		try {
			System.out.println(
					"[MMS_Invoice_ReviewPage : clickInvoiceReviewApprovePaymentOk] Clicking on Mark Paid in Invoice Review Page");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceReviewPageLocator.INVOICEREVIEW_MARKPAID_LOCATOR)
					.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void clickInvoiceReviewMarKPaidErrorLocator() {
		try {
			System.out.println(
					"[MMS_Invoice_ReviewPage : clickInvoiceReviewMarKPaidErrorLocator] Getting the Error Messagge");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceReviewPageLocator.INVOICEREVIEW_MARKPAID_ERROR_LOCATOR);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickInvoiceReviewMarkPaidClose() {
		try {
			System.out.println(
					"[MMS_Invoice_ReviewPage : clickInvoiceReviewMarkPaidClose] Clicking on Close for Mark Paid Window");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceReviewPageLocator.INVOICEREVIEW_MARKPAID_CLOSE_LOCATOR)
					.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectPaymentStatus(String status) {
		try {
			WebElement e = EY_FW_Utility.findElementByLocator(MMS_InvoiceReviewPageLocator.PAID_STATUS);
			Select dropdown = new Select(e);
			dropdown.selectByVisibleText(status);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickInvoiceReviewPaidCheckBox() {
		try {
			System.out.println(
					"[MMS_Invoice_ReviewPage : clickInvoiceReviewPaidCheckBox] Clicking on Checkbox having Status as Paid");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceReviewPageLocator.INVOICEREVIEW_PAID_CHECKBOX_LOCATOR)
					.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void verifyMarKPaidErrorMessage(){ System.out.
	 * println("[MMS_Invoice_ReviewPage : verifyMarKPaidErrormsg] Verifying Mark Paid Error Message "
	 * + MMS_ExpectedResult.INVOICES_INVOICEREVIEW_MARKPAID_ERROR); WebElement
	 * wb=EY_FW_Utility.getAnyElementByAnyLocator(MMS_InvoiceReviewPageLocator.
	 * INVOICEREVIEW_MARKPAID_ERROR_LOCATOR); String errormsg=wb.getText();
	 * MatcherAssert.assertThat(errormsg,
	 * equalTo(MMS_ExpectedResult.INVOICES_INVOICEREVIEW_MARKPAID_ERROR));
	 * //EY_FW_Utility.doWait(2000); }
	 */

	public void clickInvoiceReviewUnpaidCheckBox() {
		try {
			System.out.println(
					"[MMS_Invoice_ReviewPage : clickInvoiceReviewApprovedCheckBox] Clicking on Checkbox having Status as Approved");
			WebElement e = EY_FW_Utility
					.findElementByLocator(MMS_InvoiceReviewPageLocator.INVOICE_CHECKBOX_FOR_UNPAID_LOCATOR);
			if (!e.isSelected()) {
				e.click();
			}
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	/*
	 * public void verifyApproveInvoiceStatus(){ System.out.
	 * println("[MMS_Invoice_ReviewPage : verifyApproveInvoiceStatus] Verifying Approve Payment status for Invoice "
	 * + MMS_ExpectedResult.INVOICES_INVOICEREVIEW_UNPAIDINVOICE_PAYMENTSTATUS);
	 * WebElement
	 * wb=EY_FW_Utility.getAnyElementByAnyLocator(MMS_InvoiceReviewPageLocator.
	 * INVOICEREVIEW_APPROVE_PAYMENTSTATUS); String paymentstatus=wb.getText();
	 * MatcherAssert.assertThat(paymentstatus, equalTo(MMS_ExpectedResult.
	 * INVOICES_INVOICEREVIEW_UNPAIDINVOICE_PAYMENTSTATUS));
	 * //EY_FW_Utility.doWait(2000); }
	 */

}
