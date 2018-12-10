package com.ey.mms.pageobjects.mmsLocators;

public class MMS_CombineBillingPageLocator {

	// combine invoices
	public static final String COMBINE_INVOICES = "id_CombineInvoices_ButtonGroup";// "xpath_.//*[@id='CombineInvoices_ButtonGroup']/a";
	public static final String CONFIRM_COMBINEINVOICE = "id_confirm";// "xpath_.//*[@id='confirm']";
	public static final String FROM_INVOICE_NO = "id_CombinedDxFileFilter_InvoiceNumber_Start";// "xpath_.//*[@id='CombinedDxFileFilter_InvoiceNumber_Start']";
	public static final String TO_INVOICE_NO = "id_CombinedDxFileFilter_InvoiceNumber_End";// "xpath_.//*[@id='CombinedDxFileFilter_InvoiceNumber_End']";
	public static final String CLICK_FILTER = "xpath_.//*[@id='_FilterActiveCriteria']/div/div/button[1]";
	public static final String SAVE_BUTTON = "id_Save";// "xpath_.//*[@id='Save']";

	// merge filter
	public static final String MERGE_FromINVOICE = "id_InvoiceToCombineFilter_InvoiceNumber_Start";// "xpath_.//*[@id='InvoiceToCombineFilter_InvoiceNumber_Start']";
	public static final String MERGE_TOINVOICE = "id_InvoiceToCombineFilter_InvoiceNumber_End";// "xpath_.//*[@id='InvoiceToCombineFilter_InvoiceNumber_End']";
	public static final String MERGE_BILLEDPARTY = "id_InvoiceToCombineFilter_BilledParty";// "xpath_.//*[@id='InvoiceToCombineFilter_BilledParty']";
	public static final String MERGE_BILLINGPARTY = "id_InvoiceToCombineFilter_BillingParty";// "xpath_.//*[@id='InvoiceToCombineFilter_BillingParty']";
	public static final String GENERATE_DX_FILE_BUTTON = "id_CombinedDxFile_ButtonGroup";// "xpath_.//*[@id='CombinedDxFile_ButtonGroup']/a";
	public static final String COMBINED_DX_START_INV = "id_CombinedDxFileFilter_InvoiceNumber_Start";// "xpath_.//*[@id='CombinedDxFileFilter_InvoiceNumber_Start']";
	public static final String COMBINED_DX_END_INV = "id_CombinedDxFileFilter_InvoiceNumber_End";// "xpath_.//*[@id='CombinedDxFileFilter_InvoiceNumber_End']";

	public static final String Process_Created_Notification = "xpath_.//*[@id='modal-popup']/div[1]/div/div/h2/span";
	public static final String Process_Notification_Text = "xpath_.//*[@id='modal-popup']/div[2]/div";
	// Your invoices are being created, however this may take several minutes.
	// You will find your report in Combined Billing History momentarily. You
	// may continue to use the site normally as your reports are being
	// generated.
	public static final String Close_Notification = "id_Close";// "xpath_.//*[@id='Close']";
	public static final String Close_Process_Notification = "xpath_.//*[@id='modal-popup']/div[2]/button";
	public static final String REMOVE_FILTER = "xpath_.//*[@id='_FilterActiveCriteria']/div/div/a[2]";
	public static final String ACTIONS_POPUP = "xpath_.//*[@id='DataTables_Table_1']/tbody/tr/td[3]/div/button";
	public static final String DOWNLOAD_popup = "xpath_.//*[@id='DataTables_Table_1']/tbody/tr/td[3]/div/ul/li/a";
	
	public static final String REFRESH = "id_CombinedInvoiceHistory_RestoreDefaultSort";
	public static final String  downloadpopupclose = "src/test/resources/images/downloadpopupclose.PNG";

}
