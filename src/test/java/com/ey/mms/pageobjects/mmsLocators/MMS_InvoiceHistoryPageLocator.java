package com.ey.mms.pageobjects.mmsLocators;

public class MMS_InvoiceHistoryPageLocator {


		// Locators for Invoice History Page
		public static final String INVOICE_DATE_FILTER = "xpath_.//*[@id='_FilterActiveCriteria']/div/div/a[2]";
		public static final String VOID_STATUS_FILTER = "xpath_.//*[@id='_FilterActiveCriteria']/div/div/a[4]/i";
		public static final String TABLE_ELEMENT = "xpath_.//*[@id='DataTables_Table_0']";
		public static final String TABLE_ROWS = "id('DataTables_Table_0')/tbody/tr";
		public static final String COLUMN_TWO = "td[2]";
		public static final String COLUMN_SIX = "td[6]";
		public static final String COLUMN_THREE = "td[3]";
		public static final String SENDTOCOMBINEDBILLINGBUTTON = "link_Send to Combined Billing";
		public static final String CONFIRMCOMBINEDBILLING = "id_confirm";
		public static final String RESTORE_DEFAULT_INV_HISTORY = "id_InvoiceHistory_RestoreDefaultSort";
		public static final String BULKBILLINGSUMMARY = "link_Bulk Billing Summary";
		public static final String FILTERBUTTON = "xpath_//button[contains(text(),'Filter')]";
		public static final String FROMINVOICENUMBER = "id_InvoiceHistory_InvoiceNumber_Start";
		public static final String SAVEBUTTON = "id_Save";
		public static final String STARTDATE_INV = "id_InvoiceHistory_InvoiceDateRange_StartDate";
		public static final String END_INVNO = "id_InvoiceHistory_InvoiceNumber_End";
		public static final String INV_STATUS_DROPDOWN = "id_InvoiceHistory_VoidStatus";
		public static final String VOI_STATUS_FILTER = "xpath_.//*[@id='_FilterActiveCriteria']/div/div/a[4]";
	
		public static final String Remove_From_CB = "id_hlinkRemoveFromCb";
		public static final String Send_To_CB = "id_hlinkSendToCb";
	
	
	   //Locator for New Implementation of Invoice History Screen
		public static final String BILLING_MAIN_MENU_LOCATOR="xpath_//li[@id='Nav_Billing']/a";
		public static final String BILLING_INVOICEHISTORY_SUBMENU_LOCATOR="xpath_//li[@id='Nav_Billing']/ul/li[2]/a";
		public static final String BILLING_DROPDOWNMENU_LOCATOR="id_Nav_Billing";
		public static final String INVOICE_HISTORY_SUBMENU_LOCATOR="xpath_//a[text()='Invoice History']";
		public static final String INVOICEHISTORY_VOID_BUTTON_LOCATOR="id_hlinkVoidInvoice";
		public static final String INVOICEHISTORY_UNVOID_BUTTON_LOCATOR="id_hlinkUnVoidInvoice";
		
		public static final String INVOICEHISTORY_VOIDSTATUS_TAB_LOCATOR="xpath_//table[@id='DataTables_Table_0']/thead/tr/th[7]";
		public static final String INVOICEHISTORY_CHECKBOX_LOCATOR="xpath_//td[contains(text(),'VOIDOPT1')]/preceding-sibling::td/input[@type='checkbox']";
		public static final String INVOICEHISTORY_VOIDINVOICE_TITLE_LOCATOR="xpath_//div[@id='modal-popup']/div[1]/div/div/h2/span";
		public static final String INVOICEHISTORY_VOIDINVOICE_FIRSTOPTION_RADIO_LOCATOR="xpath_//div[@id='_InvoiceVoid']/div[3]/input[1]";
		//public static final String INVOICEHISTORY_VOIDINVOICE_FIRSTOPTION_LOCATOR="xpath_//div[@id='_InvoiceVoid']/div[3]/input[1]";
		public static final String INVOICEHISTORY_VOIDINVOICE_SECONDOPTION_RADIO_LOCATOR="xpath_//div[@id='_InvoiceVoid']/div[4]/input[1]";
		public static final String INVOICEHISTORY_VOIDINVOICE_THIRDOPTION_RADIO_LOCATOR="xpath_//div[@id='_InvoiceVoid']/div[5]/input[1]";
		public static final String INVOICEHISTORY_VOIDINVOICE_CLOSEBUTTON_LOCATOR="xpath_//form[@id='PopupWindowForm']/div[@id='modal-popup']/div[@class='modal-footer']/button[@id='Cancel']";
		public static final String INVOICEHISTORY_VOIDINVOICE_BUTTON_LOCATOR="xpath_//form[@id='PopupWindowForm']/div[@id='modal-popup']/div[@class='modal-footer']/button[@id='Save']";
		public static final String INVOICEHISTORY_INVOICEDATE_BUTTONCLOSE_LOCATOR="xpath_//div[@id='_FilterActiveCriteria']/div/div/a[2]/i";
		public static final String INVOICEHISTORY_VOIDSTATUS_BUTTONCLOSE_LOCATOR="xpath_//div[@id='_FilterActiveCriteria']/div/div/a[4]";
		public static final String INVOICEHISTORY_FILTER_BUTTON_LOCATOR="xpath_//div[@id='_FilterActiveCriteria']/div/div/button[1]";
		public static final String INVOICEHISTORY_INVOICESSTART_EDITBOX_LOCATOR="xpath_//input[@id='InvoiceHistory_InvoiceNumber_Start']";
		public static final String INVOICEHISTORY_INVOICEEND_EDITBOX_LOCATOR="xpath_//input[@id='InvoiceHistory_InvoiceNumber_End']";
		public static final String INVOICEHISTORY_INVOICESAVE_BUTTON_LOCATOR="id_Save";
		public static final String INVOICEHISTORY_FIRSTOPTION_MSG_LOCATOR="xpath_//div[@id='_InvoiceVoid']/div[3]";
		public static final String INVOICEHISTORY_SECONDOPTION_MSG_LOCATOR="xpath_//div[@id='_InvoiceVoid']/div[4]";
		public static final String INVOICEHISTORY_THIRDOPTION_MSG_LOCATOR="xpath_//div[@id='_InvoiceVoid']/div[5]";
		public static final String INVOICEHISTORY_VOIDINVOICE_CHECKBOX_FIRSTOPTION="xpath_//table[@id='DataTables_Table_0']/tbody/tr[4]/td[1]/input";
		public static final String INVOICEHISTORY_NOTIFICATION_LOCATOR="id_activity-icon";//"xpath_//a[@id='activity-icon']/i";
		public static final String INVOICEHISTORY_NOTIFICATION_CLOSE_LOCATOR="xpath_.//*[@id='activity-icon']/i";
		public static final String INVOICEHISTORY_SUCCESSVOID_MSG_LOCATOR="xpath_//li[@id='d74f3b89-d96b-4fed-af3c-8422442ca2d7']/div/div[2]";
		public static final String INVOICEHISTORY_FIRSTOPTION_STATUS_LOCATOR="xpath_//td/input[@id='hdnUnVoidStatus']/following-sibling::span[contains(text(),'Voided for correction')]";
		public static final String INVOICEHISTORY_INVOICE_SENTTO_COMBINEDBILLING_LOCATOR="xpath_//td[contains(text(),'DEMO123')]/preceding-sibling::td/input[@type='checkbox']";
		public static final String INVOICEHISTORY_SEND_COMBINEDBILLING_BUTTON_LOCATOR="xpath_//div[@id='InvoiceHistory_ButtonGroup']/a[1]";
		public static final String INVOICEHISTORY_ALLREADY_SENT_COMBINEDBILLING_ERROR_LOCATOR="xpath_//div[@id='_InvoiceVoiding']/ol/li";
		public static final String INVOICEHISTORY_INVOICENUMBER_LOCATOR="xpath_//td[contains(text(),'DEMO123')]";
		public static final String INVOICEHISTORY_MULTIPLEINVOICE_FIRST_LOCATOR="xpath_//td[contains(text(),'VOIDOPT1')]/preceding-sibling::td/input[@type='checkbox']";
		public static final String INVOICEHISTORY_MULTIPLEINVOICE_SECOND_LOCATOR="xpath_xpath_//td[contains(text(),'DEMO123')]/preceding-sibling::td/input[@type='checkbox']";
		public static final String INVOICEHISTORY_INVOICE_CHECKBOX_THIRDOPTION_LOCATOR="xpath_//table[@id='DataTables_Table_0']/tbody/tr[24]/td[1]/input";
		public static final String INVOICEHISTORY_VOIDSTATUS_FORTHIRD_OPTION_LOCATOR="xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[7]/span";
	    public static final String INVOICE_DEMO_LOCATOR="xpath_//div[@id='InvoiceHistory_ButtonGroup']/a[3]";
	    public static final String INVOICE_COMBINED_BILLING_INVOICE_VOID_ERROR_LOCATOR="xpath_//div[@id='modal-popup']/div[2]/button[text()='Ok']";
	    public static final String Validation_error_Confirm = "xpath_.//*[@id='modal-popup']/div[2]/button";
	    public static final String Validation_error_Confirm_Single = "xpath_.//*[@id='modal-popup']/div[3]/button";
	    public static final String INVOICEHISTORY_VOIDINVOICE_SAVE_DAILOUGEBOX_LOCATOR="xpath_//form[@id='PopupWindowForm']/div[@id='modal-popup']/div[@class='modal-footer']/button[@id='Save']";
	    public static final String INVOICEHISTORY_VOIDINVOICE_CANCEL_DIALOUGEBOX_LOCATOR="xpath_//form[@id='PopupWindowForm']/div[@id='modal-popup']/div[@class='modal-footer']/button[@id='Cancel']";
	    
	    //Billing (Check for Editable for Invoices for First Option)
	    public static final String BILLING_INVOICEHISTORY_CHECKBOX_LOCATOR="xpath_//td[contains(text(),'A002')]/preceding-sibling::td/input[@type='checkbox']";
	    public static final String BILLING_INVOICING_INVOICENUM_LOCATOR="xpath_//td[contains(text(),'A002')]";
	    public static final String BILLING_INVOICING_VIEW_AMOUNT_LOCATOR="xpath_//table[@id='DataTables_Table_1']/tbody/tr/td[8]";
	    public static final String BILLING_INVOICING_ACTION_LOCATOR="xpath_//td[contains(text(),'A002')]/following-sibling::td/div/button";
	    public static final String BILLING_INVOICING_ACTION_VIEWDETAIL_LOCATOR="xpath_//td[contains(text(),'A002')]/following-sibling::td/div/ul/li/a/i";
	  //div[@class='btn-group actions open']/button[@class='btn dropdown-toggle action-btn']/following-sibling::ul[@class='dropdown-menu pull-right']/li/a
	    public static final String BILLING_INVOICING_VIEWDETAILS_CLOSE_LOCATOR="xpath_//form[@id='PopupWindowForm']/div[@id='modal-popup']/div[@class='modal-footer']/button[@id='Close']";
	    public static final String BILLING_INVOICING_SUBMENU_LOCATOR="xpath_//li[@id='Nav_Billing']/ul/li[1]/a";
	    public static final String BILLING_INVOICING_GENERATEINVOICE_LOCATOR="xpath_//div[@id='Invoicing_ButtonGroup']/a";
	    public static final String BILLING_INVOICENUM_EDITBOX_LOCATOR="xpath_//input[@id='Invoices_0__InvoiceNumber']";
	    public static final String BILLING_INVOICNG_GENERATEDAILOGEBOX_LOCATOR="xpath_//div[@id='_GenerateInvoicesPopup']/section/header/h3";
	    public static final String BILLING_INVOICNG_GENERATEINVOICES_BUTTON_LOCATOR="xpath_//button[@id='GenerateInvoices']";
	    public static final String BILLING_INVOICING_GENERATEINVOICES_POPUP_CANCEL_LOCATOR="xpath_//form[@id='PopupWindowForm']/div[@id='modal-popup']/div[@class='modal-footer']/button[@id='Cancel']";
	    public static final String BILLING_NOTIFICATION_SUCCESS = "xpath_//ul[@id='accordion']/li/div[2]/ul/li/span";
	    public static final String BILLING_EDITEDINVOICE_LOCATOR="xpath_//td[contains(text(),'VOIDOPT2')]";
	    public static final String BILLING_EDITABLEINVOICE_VOIDSTATUS_LOCATOR="xpath_//td[contains(text(),'VOIDOPT1')]/following-sibling::td/span";
	    
	    
	    
	    
	    //Billing (Check for Editable of Invoice for second Option)
	    public static final String BILLING_INVOICEHISTORY_CHECKBOX_EDIT_FORSECONDOPT_LOCATOR="xpath_//td[contains(text(),'CSXT')]/preceding-sibling::td/input[@type='checkbox']";
	    public static final String BILLING_INVOICING_INVOICENUM_FORSECONDOPT_LOCATOR="xpath_//td[contains(text(),'CSXT')]";
	    public static final String BILLING_INVOICNG_GENERATEDAILOGEBOX_FORSECONDOPT_LOCATOR="xpath_//div[@id='_GenerateInvoicesPopup']/section/header/h3";
	    public static final String BILLING_INVOICING_VIEW_AMOUNT_FORSECONDOPT_LOCATOR="xpath_//table[@id='DataTables_Table_1']/tbody/tr/td[8]";
	    public static final String BILLING_INVOICING_ACTION_FORSECONDOPT_LOCATOR="xpath_//td[contains(text(),'CSXT')]/following-sibling::td/div/button";
	    public static final String BILLING_INVOICING_ACTION_VIEWDETAIL_FORSECONDOPT_LOCATOR="xpath_//td[contains(text(),'CSXT')]/following-sibling::td/div/ul/li/a";
	    public static final String BILLING_EDITABLEINVOICE_VOIDSTATUS_FOR_SECOND_OPT_LOCATOR="xpath_//td[contains(text(),'DEMO567')]/following-sibling::td/span";
	    public static final String BILLING_GENERATEDINVOICE_VOIDSTATUS_FOR_SECOND_OPT_LOCATOR="xpath_//td[contains(text(),'DEMO568')]/following-sibling::td/span";
	    public static final String BILLING_EDITED_INVOICENUM_FOR_SECOND_OPT_LOCATOR="xpath_//td[contains(text(),'DEMO568')]";
	    public static final String BILLING_INVOICING_ACTION_VIEWDETAIL_LOCATOR_FOR_SECOND_OPTION_LOCATOR="xpath_//td[contains(text(),'CSXT')]/following-sibling::td/div/ul/li/a/i";
	    
	    //Locators for PopUp message for unvoiding a Invoice in the Invoice History Screen
	    public static final String BILLING_INVOICEHISTORY_Autoamtea1CHECKNBOX_LOCATOR="xpath_//td[contains(text(),'DEMO234')]/preceding-sibling::td/input[@type='checkbox']";
	    public static final String BILLING_INVOICEHISTORY_Autoamteb1CHECKNBOX_LOCATOR="xpath_//td[contains(text(),'DEMO345')]/preceding-sibling::td/input[@type='checkbox']";
	    public static final String BILLING_INVOICEHISTORY_Autoamationc1CHECKNBOX_LOCATOR="xpath_//td[contains(text(),'Automationc1')]/preceding-sibling::td/input[@type='checkbox']";
	    public static final String BILLING_INVOICEHISTORY_TestCC1CHEKBOX_LOCATOR="xpath_//td[contains(text(),'DEMO567')]/preceding-sibling::td/input[@type='checkbox']";
	    public static final String BILLING_INVOICEHISTORY_SINGLEINVOICE_UNVOID_ERROR_LOCATOR="xpath_//div[@id='modal-popup']/div[2]";
	    public static final String BILLING_INVOICEHISTORY_MULTIPLEINVOICE_UNVOID_ERROR_LOCATOR="xpath_//div[@id='modal-popup']/div[2]";
	    public static final String BILLING_INVOICEHISTORY_COMBINED_UNVOID_ERROR_LOCATOR="xpath_//div[@id='modal-popup']/div[2]";
	    public static final String BILLING_INVOICEHISTORY_333333CHECKBOX_LOCATOR="xpath_//td[contains(text(),'VOIDOPT1')]/preceding-sibling::td/input[@type='checkbox']";
	    public static final String BILLING_INVOICEHISTORY_333333_VOIDSTATUS_LOCATOR="xpath_//td[contains(text(),'VOIDOPT1')]/following-sibling::td/input[@id='hdnVoidStatus']";
	    public static final String BILLING_INVOICEHISTORY_333333_UNVOIDSTATUS_LOCATOR="xpath_//td[contains(text(),'VOIDOPT1')]/following-sibling::td[5]";
	    public static final String INVOICEHISTORY_UNVOID_POPUP_OK_BUTTON_LOCATOR="xpath_//div[@id='modal-popup']/div[3]/button[text()='Ok']";
	    public static final String INVOICEHISTORY_VOID_POPUP_OK_BUTTON_LOCATOR="xpath_//div[@id='modal-popup']/div[@class='modal-footer']/button[2]";
	    
	    //INVOICEHISTORY New Implementation
	    public static final String BILLING_LINK_LOCATOR="xpath_//li[@id='Nav_Billing']/a";
	    public static final String INVOICEHISTORY_SENDTO_COMBINED_BILLING_BUTTON="xpath_//div[@id='InvoiceHistory_ButtonGroup']/a[1]";
	    public static final String INVOICEHISTORY_REMOVE_FROM_COMBINED_BILLING_BUTTON_LOCATOR="xpath_//div[@id='InvoiceHistory_ButtonGroup']/a[2]";
	    public static final String INVOICEHISTORY_BULKBILING_BUTTON_LOCATOR="xpath_//div[@id='InvoiceHistory_ButtonGroup']/a[3]";
	    //public static final String INVOICEHISTORY_VOIDINVOICE_BUTTON_LOCATOR="xpath_//div[@id='InvoiceHistory_ButtonGroup']/a[4]";
	    public static final String INVOICEHISTORY_UNVOIDINVOICE_BUTTON_LOCATOR="xpath_//div[@id='InvoiceHistory_ButtonGroup']/a[5]";
	    public static final String INVOICE_HISTORY_LINK_LOCATOR="xpath_//li[@id='Nav_Billing']/ul/li[2]/a";
	    
	    //Voiding Voided messages
	    public static final String BILLING_INVOICEHISTORY_VOID_BUTTON_LOCATOR="xpath_//a[@id='hlinkVoidInvoice']";
	    public static final String BILLING_INVOICEHISTORY_UNVOID_BUTTON_LOCATOR="xpath_//a[@id='hlinkUnVoidInvoice']";
	    public static final String BILLING_INVOICEHISTORY_Testaa1_CHKBOX_LOCATOR="xpath_//td[contains(text(),'DEMO567')]/preceding-sibling::td/input[@type='checkbox']";
	    public static final String BILLING_INVOICEHISTORY_Testbb1_CHKBOX_LOCATOR="xpath_//td[contains(text(),'VOIDOPT1')]/preceding-sibling::td/input[@type='checkbox']";
	    public static final String BILLING_INVOICEHISTORY_Testdd1_CHKBOX_LOCATOR="xpath_//td[contains(text(),'Testdd1')]/preceding-sibling::td/input[@type='checkbox']";
	    public static final String BILLING_INVOICEHISTORY_Testee1_CHKBOX_LOCATOR="xpath_//td[contains(text(),'DEMO234')]/preceding-sibling::td/input[@type='checkbox']";
	    public static final String BILLING_INVOICEHISTORY_Single_Invoice_VoidError_Locator="xpath_//div[@id='modal-popup']/div[2]";
	    public static final String BILLING_INVOICEHISTORY_MULTIPLEINVOICE_VOID_ERROR_LOCATOR="xpath_//div[@id='modal-popup']/div[2]";
	    public static final String BILLING_INVOICEHISTORY_COMBINED_VOID_ERROR_LOCATOR="xpath_//div[@id='modal-popup']/div[2]";
	    public static final String BILLING_INVOICEHISTORY_CLOSE_VOIDSTATUS_LOCATOR="xpath_//div[@id='_FilterActiveCriteria']/div/div/a[4]";

	// Locators for Invoice History Page

	public static final String SAVE_BUTTON = "id_Save";
	public static final String popup_title = "xpath_.//*[@id='modal-popup']/div[1]/div/div/h2/span";
	
	//pop up error
	public static final String Popup_Error_List = "xpath_.//*[@id='accordion']/li";
	public static final String Popup_Error_Div_Button = "xpath_.//*[@id='accordion']/li[1]/div[1]";
	public static final String Popup_Error_Div_Button_Message = "xpath_.//*[@id='accordion']/li[1]/div[2]";
	
	//filter button 
	public static final String From_InvDate = "id_InvoiceHistory_InvoiceDateRange_StartDate";
	public static final String VoidstatusDropdown = "id_InvoiceHistory_VoidStatus";
	
	//popup
	public static final String popup_msg1 = "xpath_.//*[@id='modal-popup']/div[2]/ul/li[1]";
	public static final String popup_msg2 = "xpath_.//*[@id='modal-popup']/div[2]/ul/li[2]";
	public static final String failed_unvoid_inv_msg = "xpath_.//*[@id='_InvoiceVoiding']/ol/li";
	
	//void button
	public static final String Void_Button = "id_hlinkVoidInvoice";
	public static final String Unvoid_Button = "id_hlinkUnVoidInvoice";
	public static final String BulkBilling_Button = "xpath_.//*[@id='InvoiceHistory_ButtonGroup']/a[3]";
	public static final String RemovefromCB_Button = "id_hlinkRemoveFromCb";
	public static final String SendtoCB_Button = "id_hlinkSendToCb";
	public static final String STATUS_DATE = "xpath_.//*[@id='DataTables_Table_0']/tbody/tr[1]/td[8]";

}
