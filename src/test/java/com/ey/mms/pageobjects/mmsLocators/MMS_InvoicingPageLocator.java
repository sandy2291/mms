package com.ey.mms.pageobjects.mmsLocators;

public class MMS_InvoicingPageLocator {

	// Invoicing
	public static final String filter = "xpath_.//*[@id='_FilterActiveCriteria']/div/div/button[1]";
	public static final String Rmark = "id_Customer_ReportingMark";
	public static final String Invoice_type_Dropdown = "id_Invoice_TypeSelectList";
	public static final String CarInitial = "id_Car_CarInitial";
	public static final String FromCarNumber = "id_Car_CarNumber_Start";
	public static final String ToCarNumber = "id_Car_CarNumber_End";
	public static final String SaveFilter = "id_Save";
	public static final String CancelFilter = "id_Cancel";
	public static final String TABLE_ELEMENT3 = "xpath_.//*[@data-table-name='InvoicingCarAmount']/tbody/tr";
	public static final String Inv_Cancel = "id_Cancel";
	public static final String Invoice = "xpath_.//*[@id='Invoices_";
	public static final String Invoice_BC = "xpath_.//*[@id='Invoices[";
	public static final String Inv_Number = "id_Invoices_0__InvoiceNumber";
	public static final String Inv_StartDate = "id_Invoices_0__InvoiceDate";
	public static final String Inv_DueDate = "id_Invoices_0__DueDate";
	public static final String Inv_BillingContact = "id_Invoices[0]_BillingContact";
	public static final String Inv_GenerateButton = "id_GenerateInvoices";
	public static final String FirstRow = "xpath_.//*[@id='DataTables_Table_0']/tbody/tr/td[1]/input";
	public static final String Generate_Invoice = "link_Generate Invoice";
	//public static final String Notification = "xpath_.//*[@id='notification-icon']/i";// "id_notification-icon";
	public static final String Notification = "xpath_.//*[@id='activity-icon']/i";
	public static final String NotificationAlert = "xpath_//*[@class='notification-alert']";// "class_notification-alert";
	//public static final String NotificationAlertMessage = "xpath_//*[@class='notification-alert']/div/span";
	public static final String NotificationAlertMessage = "xpath_//div[@id='today']/ul/li[1]/div[2]/ul/li/span";
	public static final String EmptyReports = "xpath_.//*[@id='empty-reports']";// "id_empty-reports";
	public static final String ERROR_Message = "xpath_//*[@class='message-text']";// "class_message-text";
	public static final String POPUP_MSG = "xpath_.//*[@id='_GenerateInvoicesPopup']/div/ul/li";
	public static final String POPUP_MSG2 = "xpath_.//*[@id='_GenerateInvoicesPopup']/div/ul/li[2]";
	public static final String CANCEL_INVOICE = "xpath_(.//*[@id='Cancel'])[2]";
	public static final String popup_title = "xpath_.//*[@id='modal-popup']/div[1]/div/div/h2/span";
}
