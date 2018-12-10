package com.ey.mms.pageobjects.mmsLocators;import org.openqa.selenium.WebElement;

import com.ey.mms.serenitystepsThemelevel.expectedData.InvoiceReview;
import com.ey.mms.util.EY_FW_Utility;

public class MMS_InvoiceReviewPageLocator {

	// Locator for Invoice Review

	public static final String INVOICE_CHECKBOX_FOR_UNPAID_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr[1]/td[1]/input";
	public static final String INVOICE_CHECKBOX_LOCATOR1 = "xpath_//table[@id='DataTables_Table_0']/tbody/tr[";
	public static final String INVOICE_CHECKBOX_LOCATOR2 = "]/td[1]/input";
	public static final String INVOICEREVIEW_ACTION_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr[1]/td[15]/div/button";
	public static final String INVOICEREVIEW_ACTION_DETAILS_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr[1]/td[15]/div/ul/li/a";
	public static final String INVOICEREVIEW_FILTER_LOCATOR = "xpath_.//*[@id='_FilterActiveCriteria']/div/div/button[1]";
	public static final String INVOICEREVIEW_FILTTER_INVOICENUMBERSTART_LOCATOR = "id_Invoice_InvoiceNumber_Start";// "xpath_//input[@id='Invoice_InvoiceNumber_Start']";
	public static final String INVOICEREVIEW_FILTER_INVOICENUMBEREND_LOCATOR = "id_Invoice_InvoiceNumber_End";// "xpath_//input[@id='Invoice_InvoiceNumber_End']";
	public static final String INVOICEREVIEW_FILTER_SAVE_LOCATOR = "id_Save";// "xpath_//button[@id='Save']";
	public static final String INVOICEREVIEW_INVOICENUMBER_CLOSE_LOCATOR = "xpath_//div[@id='_FilterActiveCriteria']/div/div/a[2]";
	public static final String INVOICEREVIEW_GENERATEREPORT_LOCATOR = "xpath_//div[@id='ViewInvocies_ButtonGroup']/a[1]";
	public static final String INVOICEREVIEW_REPORTDOWNLOAD_ACTION_LOCATOR = "xpath_//table[@id='DataTables_Table_1']/tbody/tr/td[3]/div/button";
	public static final String INVOICEREVIEW_REPORTDOWNLOAD_DOWNLOAD_LOCATOR = "xpath_//table[@id='DataTables_Table_1']/tbody/tr/td[3]/div/ul/li/a";
	public static final String INVOICEREVIEW_APPROVE_PAYMENT_LOCATOR = "xpath_.//*[@id='hlinkApproveForPayment']";
	public static final String INVOICEREVIEW_APPROVE_PAYMENT_OK_LOCATOR = "id_confirm";// "xpath_//button[@id='confirm']";
	public static final String INVOICEREVIEW_MARKPAID_LOCATOR = "xpath_.//*[@id='hlinkMarkPaid']";
	public static final String INVOICEREVIEW_MARKPAID_OK_LOCATOR = "id_confirm";// "xpath_//button[@id='confirm']";
	public static final String INVOICEREVIEW_MARKPAID_ERROR_LOCATOR = "xpath_//div[@id='modal-popup']/div[2]/ul/li";
	public static final String INVOICEREVIEW_MARKPAID_CLOSE_LOCATOR = "xpath_//div[@id='modal-popup']/div[3]/button";
	public static final String INVOICEREVIEW_PAID_CHECKBOX_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr[1]/td[1]/input";
	public static final String INVOICEREVIEW_FILTER_CHECKBOX_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[1]/input";
	public static final String INVOICEREVIEW_APPROVED_CHECKBOX_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr[2]/td[1]/input";
	public static final String INVOICEREVIEW_APPROVE_PAYMENTSTATUS = "xpath_//table[@id='DataTables_Table_0']/tbody/tr[1]/td[14]";
	public static final String INVOICEREVIEW_UNPAID_PAYMENTSTATUS = "xpath_//table[@id='DataTables_Table_0']/tbody/tr[1]/td[14]";
	public static final String INVOICEREVIEW_FILTERDATA_VERIFY_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr[1]/td[6]";
	public static final String PAID_STATUS = "xpath_//select[@id='Invoice_PaymentStatus']";
	
	public static final String InvoiceReviewFilterSave = "src/test/resources/images/InvoiceReviewFilterSave.PNG";
	public static final String InvoiceReview_Report_DownloadClose = "src/test/resources/images/InvoiceReview_Report_DownloadClose.PNG";
	public static final String ReportDownloadClose = "src/test/resources/images/ReportDownloadClose.PNG";
	public static final String FILTER_SAVE ="id_Save";
	public static final String CLOSE_BUTTON ="id_Close";
	public static final String INVOICEREVIEW_REJECTED_PAYMENTSTATUS = "xpath_//table[@id='DataTables_Table_0']/tbody/tr[1]/td[14]";

}
