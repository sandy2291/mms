package com.ey.mms.pageobjects.mmsLocators;

public class MMS_ExceptionTrackingPageLocator {

	// Exception Tracking
	public static final String CBASTATUS_DROPDOWN = "id_ExceptionLetterFilterModel_Status";
	public static final String RESPONSE_DROPDOWN = "id_ResponseType";
	public static final String INVOICENUMBERSTART = "id_ExceptionLetterFilterModel_InvoiceNumber_Start";
	public static final String INVOICENUMBEREND = "id_ExceptionLetterFilterModel_InvoiceNumber_End";
	public static final String EXCEPTIONTRACKING_ACTIONS = "xpath_//*[@id='DataTables_Table_0']/tbody/tr[1]/td[12]/div/ul/li/a";
	public static final String CHECKBOX = "xpath_.//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]/input";
	public static final String EXCEPTIONRESPONSECOMMENT = "id_Comment";
	public static final String CBACOMMENT = "id_CbaNumber";
	public static final String RESPONSESTATUS = "xpath_.//*[@id='DataTables_Table_0']/tbody/tr[1]/td[10]";
	public static final String EXCEPTIONTRACKER = "xpath_.//*[@id='ExceptionTracking_ButtonGroup']/a[1]";
	public static final String CONFIRMEXCEPTIONTRACKER = "id_confirm";
	public static final String FINALIZE = "link_Finalize";
	public static final String DELETE = "link_Delete";
	public static final String EMPTYTABLE = "xpath_.//*[@id='modal-popup']/div[1]/div/div/h2/span";
	public static final String DELETEERROR = "xpath_.//*[@id='modal-popup']/div[2]/ol/li";
	public static final String CLOSE = "xpath_.//*[@id='modal-popup']/div[3]/button";
	public static final String NODATA = "xpath_.//*[@id='DataTables_Table_0']/tbody/tr/td";
}
