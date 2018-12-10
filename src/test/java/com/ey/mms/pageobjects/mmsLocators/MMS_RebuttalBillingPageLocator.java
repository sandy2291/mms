package com.ey.mms.pageobjects.mmsLocators;

public class MMS_RebuttalBillingPageLocator {

	// Rebuttal Billing
	public static final String REBUTTAL_DROPDOWN = "id_Rebuttal_RebuttalStatus";
	public static final String INVOICE_NUMBER_START = "id_Invoice_InvoiceNumber_Start";
	public static final String INVOICE_NUMBER_END = "id_Invoice_InvoiceNumber_End";
	public static final String REBUTTAL_STATUS_DROPDOWN = "id_Invoice_RebuttalStatus";
	public static final String REBUTTALS_ACTIONS = "xpath_.//*[@id='DataTables_Table_0']/tbody/tr/td[15]/div/button";
	public static final String MARK_INVOICES_REVIEWED = "link_Mark Invoices Reviewed";// "xpath_.//*[@id='RebuttalBillingInvoices_ButtonGroup']/a[1]
	public static final String FINALIZE_INVOICES = "link_Finalize Invoices";
	public static final String REBUTTAL_POPUP = "xpath_.//*[@id='modal-popup']/div[1]/div/div/h2/span";
}
