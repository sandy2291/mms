/**
 * @Copyright Copyright (C) 2016 General Electric Company. All rights reserved.
 */
package com.ey.mms.pageobjects;

/**
 * <h1>Locators Class</h1> MMS Locators Class containing Path Locators values
 * across multiple pages of Application.
 * 
 * @author Ankur Chaudhry
 * @version 1.1
 * @since 2016-07-17
 */

public class MMS_Locators {
	/*
	 * // Locators for Login Page public static final String
	 * USERNAME_INPUTFIELD_LOCATOR = "id_Username"; public static final String
	 * PASSWORD_INPUTFIELD_LOCATOR = "name_PlaintextPassword"; public static
	 * final String SUBMIT_BUTTON_LOCATOR = "xpath_//input[@type='submit']";
	 * 
	 * // Locators for Home Page public static final String
	 * CONFIGURATION_DROPDOWNMENU_LOCATOR ="link_Configuration";//
	 * "xpath_//li[@id='Nav_Configuration']/a[1]"; public static final String
	 * UPLOAD_DROPDOWNMENU_LOCATOR =
	 * "link_Upload";;//"xpath_.//*[@id='Nav_Upload']/a"; public static final
	 * String UPLOAD_DROPMENU_LIST = "xpath_.//*[@id='Nav_Upload']/ul/li/a";
	 * public static final String HOME_MENU_LOCATOR =
	 * "link_Home";//"xpath_.//*[@id='Nav_Home']/a"; public static final String
	 * BILLING_DROPDOWNMENU_LOCATOR =
	 * "link_Billing";//"xpath_.//*[@id='Nav_Billing']/a"; public static final
	 * String FLEETS_SUBMENU_LOCATOR =
	 * "xpath_//li[@id='Nav_Configuration']/ul[@class='dropdown-menu']/li/a";
	 * public static final String FLEETLIST_FLEETSUBMENU_LOCATOR =
	 * "xpath_//li[@id='Nav_Configuration']/ul[@class='dropdown-menu']/li[a[contains(text(),'Fleets')]]/ul/li/a";
	 * public static final String INVOICE_HISTORY_SUBMENU_LOCATOR =
	 * "link_Invoice History";//"xpath_.//*[@id='Nav_Billing']/ul/li[2]/a";//
	 * xpath_.//a[text()='Invoice History']; public static final String
	 * INVOICING_SUBMENU_LOCATOR =
	 * "link_Invoicing";//"xpath_.//*[@id='Nav_Billing']/ul/li[1]/a"; public
	 * static final String INVOICE_DROPMENU_LOCATOR =
	 * "link_Invoices";//"xpath_//li[@id='Nav_Invoices']/a"; public static final
	 * String INVOICE_DROPMENU_LIST = "xpath_.//*[@id='Nav_Invoices']/ul/li/a";
	 * public static final String CONFIGURATION_DROPMENU_LIST =
	 * "xpath_.//*[@id='Nav_Configuration']/ul/li/a"; public static final String
	 * EXCEPTIONS_SUBMENU_LOCATOR =
	 * "xpath_//li[@id='Nav_Invoices']/ul[@class='dropdown-menu']/li/a"; public
	 * static final String COMBINEDBILLING_SUBMENU_LOCATOR =
	 * "xpath_//li[@id='Nav_Billing']/ul[@class='dropdown-menu']/li/a"; public
	 * static final String EXCEPTIONS_EXCEPTIONSUBMENU_LOCATOR =
	 * "xpath_//li[@id='Nav_Invoices']/ul[@class='dropdown-menu']/li[a[contains(text(),'Exceptions')]]/ul/li/a";
	 * public static final String COMBINEDBILLING_COMBINEDBILLINGSUBMENU_LOCATOR
	 * =
	 * "xpath_//li[@id='Nav_Billing']/ul[@class='dropdown-menu']/li[a[contains(text(),'Combined Billing')]]/ul/li/a"
	 * ; public static final String SYSTEM_SYSTEMUBMENU_LOCATOR =
	 * "xpath_//li[@id='Nav_Configuration']/ul[@class='dropdown-menu']/li[a[contains(text(),'System')]]/ul/li/a";
	 * public static final String LEASE_SYSTEMUBMENU_LOCATOR =
	 * "xpath_//li[@id='Nav_Configuration']/ul[@class='dropdown-menu']/li[a[contains(text(),'Leases')]]/ul/li/a";
	 * public static final String INVOICES_DROPDOWNMENU_LOCATOR =
	 * "xpath_//div[@id='navbar']/ul/li/a[contains(text(),'Invoices')]"; public
	 * static final String INVOICES_REPAIR_DETAILS_SUBMENU =
	 * "xpath_//li[@id='Nav_Invoices']/a/following-sibling::ul/li[2]/a[text()='Repair Details']"
	 * ;
	 * 
	 * 
	 * // Locators for Fleet List Page public static final String
	 * FLEET_BUTTON_LOCATOR = "xpath_//button[contains(text(),'Filter')]";
	 * public static final String FLEET_CARINITIAL_INPUTBOX_LOCATOR =
	 * "id_Car_Initial";//"css_input[id='Car_Initial']"; public static final
	 * String FLEET_FILTER_SAVE_BUTTON_LOCATOR =
	 * "id_Save";//"css_button[id='Save']"; public static final String
	 * FLEET_FILTER_RESULTS_LIST_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td"; public static
	 * final String FLEET_FILTER_RESULTS_CARINTIAL_LIST_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[2]";
	 * 
	 * // Locators for Invoice History Page public static final String
	 * INVOICE_DATE_FILTER =
	 * "xpath_.//*[@id='_FilterActiveCriteria']/div/div/a[2]"; public static
	 * final String VOID_STATUS_FILTER =
	 * "xpath_.//*[@id='_FilterActiveCriteria']/div/div/a[4]/i"; public static
	 * final String TABLE_ELEMENT = "xpath_.//*[@id='DataTables_Table_0']";
	 * public static final String TABLE_ROWS =
	 * "id('DataTables_Table_0')/tbody/tr"; public static final String
	 * COLUMN_TWO = "td[2]"; public static final String COLUMN_SIX = "td[6]";
	 * public static final String COLUMN_THREE = "td[3]"; public static final
	 * String SENDTOCOMBINEDBILLINGBUTTON = "link_Send to Combined Billing";//
	 * "xpath_.//*[@id='InvoiceHistory_ButtonGroup']/a[1]"; public static final
	 * String CONFIRMCOMBINEDBILLING =
	 * "id_confirm";//"xpath_.//*[@id='confirm']"; public static final String
	 * RESTORE_DEFAULT_INV_HISTORY = "id_InvoiceHistory_RestoreDefaultSort";//
	 * "xpath_.//*[@id='InvoiceHistory_RestoreDefaultSort']"; public static
	 * final String BULKBILLINGSUMMARY = "link_Bulk Billing Summary";//
	 * "xpath_.//*[@id='InvoiceHistory_ButtonGroup']/a[3]"; public static final
	 * String FILTERBUTTON = "xpath_//button[contains(text(),'Filter')]";//
	 * "xpath_.//*[@id='_FilterActiveCriteria']/div/div/button[1]"; public
	 * static final String FROMINVOICENUMBER =
	 * "id_InvoiceHistory_InvoiceNumber_Start";//
	 * "xpath_.//*[@id='InvoiceHistory_InvoiceNumber_Start']"; public static
	 * final String SAVEBUTTON = "id_Save";//"xpath_.//*[@id='Save']"; public
	 * static final String STARTDATE_INV =
	 * "id_InvoiceHistory_InvoiceDateRange_StartDate";//
	 * "xpath_.//*[@id='InvoiceHistory_InvoiceDateRange_StartDate']"; public
	 * static final String END_INVNO = "id_InvoiceHistory_InvoiceNumber_End";//
	 * "xpath_.//*[@id='InvoiceHistory_InvoiceNumber_End']"; public static final
	 * String INV_STATUS_DROPDOWN = "id_InvoiceHistory_VoidStatus";//
	 * "xpath_.//*[@id='InvoiceHistory_VoidStatus']"; public static final String
	 * VOI_STATUS_FILTER =
	 * "xpath_.//*[@id='_FilterActiveCriteria']/div/div/a[4]";
	 * 
	 * // Invoicing public static final String filter =
	 * "xpath_.//*[@id='_FilterActiveCriteria']/div/div/button[1]"; public
	 * static final String Rmark =
	 * "id_Customer_ReportingMark";//"xpath_.//*[@id='Customer_ReportingMark']";
	 * public static final String Invoice_type_Dropdown =
	 * "id_Invoice_TypeSelectList";//"xpath_.//*[@id='Invoice_TypeSelectList']";
	 * public static final String CarInitial =
	 * "id_Car_CarInitial";//"xpath_.//*[@id='Car_CarInitial']"; public static
	 * final String FromCarNumber =
	 * "id_Car_CarNumber_Start";//"xpath_.//*[@id='Car_CarNumber_Start']";
	 * public static final String ToCarNumber =
	 * "id_Car_CarNumber_End";//"xpath_.//*[@id='Car_CarNumber_End']"; public
	 * static final String SaveFilter = "id_Save";//"xpath_.//*[@id='Save']";
	 * public static final String CancelFilter =
	 * "id_Cancel";//"xpath_.//*[@id='Cancel']"; public static final String
	 * TABLE_ELEMENT3 =
	 * "xpath_.//*[@data-table-name='InvoicingCarAmount']/tbody/tr"; public
	 * static final String Inv_Cancel =
	 * "id_Cancel";//"xpath_.//*[@id='Cancel']"; public static final String
	 * Invoice = "xpath_.//*[@id='Invoices_"; public static final String
	 * Invoice_BC = "xpath_.//*[@id='Invoices["; public static final String
	 * Inv_Number = "id_Invoices_0__InvoiceNumber";//
	 * "xpath_.//*[@id='Invoices_0__InvoiceNumber']"; public static final String
	 * Inv_StartDate = "id_Invoices_0__InvoiceDate";//
	 * "xpath_.//*[@id='Invoices_0__InvoiceDate']"; public static final String
	 * Inv_DueDate =
	 * "id_Invoices_0__DueDate";//"xpath_.//*[@id='Invoices_0__DueDate']";
	 * public static final String Inv_BillingContact =
	 * "id_Invoices[0]_BillingContact";//
	 * "xpath_.//*[@id='Invoices[0]_BillingContact']"; public static final
	 * String Inv_GenerateButton =
	 * "id_GenerateInvoices";//"xpath_.//*[@id='GenerateInvoices']"; public
	 * static final String FirstRow =
	 * "xpath_.//*[@id='DataTables_Table_0']/tbody/tr/td[1]/input"; public
	 * static final String Generate_Invoice =
	 * "link_Generate Invoice";//"xpath_.//*[@id='Invoicing_ButtonGroup']/a";
	 * public static final String Notification =
	 * "id_notification-icon";//"xpath_.//*[@id='notification-icon']/i"; public
	 * static final String NotificationAlert =
	 * "class_notification-alert";//"xpath_//*[@class='notification-alert']";
	 * public static final String NotificationAlertMessage =
	 * "xpath_//*[@class='notification-alert']/div/span"; public static final
	 * String EmptyReports =
	 * "id_empty-reports";//"xpath_.//*[@id='empty-reports']"; public static
	 * final String ERROR_Message =
	 * "class_message-text";//"xpath_//*[@class='message-text']"; public static
	 * final String POPUP_MSG =
	 * "xpath_.//*[@id='_GenerateInvoicesPopup']/div/ul/li"; public static final
	 * String CANCEL_INVOICE = "id_Cancel";//"xpath_.//*[@id='Cancel']"; //
	 * public static final String Inv_startDate
	 * 
	 * // Invoice List public static final String INVOICELISTFILTERBUTTON =
	 * "xpath_.//*[@id='_FilterActiveCriteria']/div/div/button[1]"; public
	 * static final String INVOICELISTCARINITIAL =
	 * "id_ExceptionInvoiceCarFilterModel_Initial";//
	 * "xpath_.//*[@id='ExceptionInvoiceCarFilterModel_Initial']"; public static
	 * final String INVOICELISTFROMCARNUMBER =
	 * "id_ExceptionInvoiceCarFilterModel_CarNumber_Start";//
	 * "xpath_.//*[@id='ExceptionInvoiceCarFilterModel_CarNumber_Start']";
	 * public static final String INVOICELISTENDCARNUMBER =
	 * "id_ExceptionInvoiceCarFilterModel_CarNumber_End";//
	 * "xpath_.//*[@id='ExceptionInvoiceCarFilterModel_CarNumber_End']"; public
	 * static final String INVOICELISTSAVEBUTTON =
	 * "id_Save";//"xpath_.//*[@id='Save']"; public static final String
	 * EXCEPTIONLETTERNUMBER = "id_ExceptionLetters_0__ExceptionLetterNumber";//
	 * "xpath_.//*[@id='ExceptionLetters_0__ExceptionLetterNumber']"; public
	 * static final String generateexceptionimage =
	 * "src/test/resources/images/generateexception.PNG"; public static final
	 * String filtersaveimage = "src/test/resources/images/filtersave.PNG";
	 * public static final String ReportHistorySaveimage =
	 * "src/test/resources/images/ReportHistorySave.PNG"; public static final
	 * String generateexceptionletter =
	 * "xpath_.//*[@id='Exceptions_ButtonGroup']/a[2]"; public static final
	 * String Exceptionletterfieldrequired =
	 * "xpath_.//*[@id='GenerateExceptionLetter']/section/div[1]/ul/li[1]";
	 * 
	 * // Exception Review Car List public static final String
	 * EXCEPTIONCONTACT_DROPDOWN = "id_ExceptionLetters[0]_ExceptionContact";//
	 * "xpath_.//*[@id='ExceptionLetters[0]_ExceptionContact']"; public static
	 * final String EDITEXCEPTIONAMOUNT_LOCATOR =
	 * "id_Exception_ExceptionAmount";//
	 * "xpath_.//*[@id='Exception_ExceptionAmount']"; public static final String
	 * SAVEEXCEPTIONAMOUNT = "id_Save";//"xpath_.//*[@id='Save']"; public static
	 * final String NOTES_LOCATORBUTTON =
	 * "id_Exception_Notes";//"xpath_.//*[@id='Exception_Notes']"; public static
	 * final String Saveimage = "src/test/resources/images/save.PNG"; public
	 * static final String Cancelimage = "src/test/resources/images/cancel.PNG";
	 * public static final String choosecompanyimage =
	 * "src/test/resources/images/choose_company.PNG"; public static final
	 * String AMOUNTFIELDREQUIRED_LOCATOR =
	 * "xpath_.//*[@id='EditException']/div[1]/ul/li"; public static final
	 * String REMOVEREPAIRSAVEBUTTON =
	 * "id_confirm";//"xpath_.//*[@id='confirm']"; public static final String
	 * AUDITRESULTSTABLE_ELEMENT =
	 * "id_DataTables_Table_2";//"xpath_.//*[@id='DataTables_Table_2']"; public
	 * static final String AUDITRESULTSTABLE_ROWS =
	 * "xpath_.//*[@id='DataTables_Table_2']/tbody/tr"; public static final
	 * String COLUMN_FOUR = "td[4]";
	 * 
	 * // Exception Tracking public static final String CBASTATUS_DROPDOWN =
	 * "id_ExceptionLetterFilterModel_Status";//
	 * "xpath_.//*[@id='ExceptionLetterFilterModel_Status']"; public static
	 * final String RESPONSE_DROPDOWN =
	 * "id_ResponseType";//"xpath_.//*[@id='ResponseType']"; public static final
	 * String INVOICENUMBERSTART =
	 * "id_ExceptionLetterFilterModel_InvoiceNumber_Start";//
	 * "xpath_.//*[@id='ExceptionLetterFilterModel_InvoiceNumber_Start']";
	 * public static final String INVOICENUMBEREND =
	 * "id_ExceptionLetterFilterModel_InvoiceNumber_End";//
	 * "xpath_.//*[@id='ExceptionLetterFilterModel_InvoiceNumber_End']"; public
	 * static final String EXCEPTIONTRACKING_ACTIONS =
	 * "xpath_//*[@id='DataTables_Table_0']/tbody/tr[1]/td[12]/div/ul/li/a";
	 * public static final String CHECKBOX =
	 * "xpath_.//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]/input"; public
	 * static final String EXCEPTIONRESPONSECOMMENT =
	 * "id_Comment";//"xpath_.//*[@id='Comment']"; public static final String
	 * RESPONSESTATUS =
	 * "xpath_.//*[@id='DataTables_Table_0']/tbody/tr[1]/td[10]"; public static
	 * final String EXCEPTIONTRACKER =
	 * "xpath_.//*[@id='ExceptionTracking_ButtonGroup']/a[1]"; public static
	 * final String CONFIRMEXCEPTIONTRACKER =
	 * "id_confirm";//"xpath_.//*[@id='confirm']"; public static final String
	 * FINALIZE =
	 * "link_Finalize";//"xpath_.//*[@id='ExceptionTracking_ButtonGroup']/a[3]";
	 * public static final String DELETE =
	 * "link_Delete";//"xpath_.//*[@id='ExceptionTracking_ButtonGroup']/a[2]";
	 * public static final String EMPTYTABLE =
	 * "xpath_.//*[@id='modal-popup']/div[1]/div/div/h2/span"; public static
	 * final String DELETEERROR = "xpath_.//*[@id='modal-popup']/div[2]/ol/li";
	 * public static final String CLOSE =
	 * "xpath_.//*[@id='modal-popup']/div[3]/button"; public static final String
	 * NODATA = "xpath_.//*[@id='DataTables_Table_0']/tbody/tr/td";
	 * 
	 * // Rebuttal Billing public static final String REBUTTAL_DROPDOWN =
	 * "id_Rebuttal_RebuttalStatus";//
	 * "xpath_.//*[@id='Rebuttal_RebuttalStatus']"; public static final String
	 * INVOICE_NUMBER_START = "id_Invoice_InvoiceNumber_Start";//
	 * "xpath_.//*[@id='Invoice_InvoiceNumber_Start']"; public static final
	 * String INVOICE_NUMBER_END = "id_Invoice_InvoiceNumber_End";//
	 * "xpath_.//*[@id='Invoice_InvoiceNumber_End']"; public static final String
	 * REBUTTAL_STATUS_DROPDOWN =
	 * "id_Invoice_RebuttalStatus";//"xpath_.//*[@id='Invoice_RebuttalStatus']";
	 * public static final String REBUTTALS_ACTIONS =
	 * "xpath_.//*[@id='DataTables_Table_0']/tbody/tr/td[15]/div/button"; public
	 * static final String MARK_INVOICES_REVIEWED =
	 * "link_ Mark Invoices Reviewed";//
	 * "xpath_.//*[@id='RebuttalBillingInvoices_ButtonGroup']/a[1]"; public
	 * static final String FINALIZE_INVOICES = "link_ Finalize Invoices";//
	 * "xpath_.//*[@id='RebuttalBillingInvoices_ButtonGroup']/a[2]";
	 * 
	 * // Rebuttal Billing Car list public static final String
	 * MARK_CARS_REVIEWED = "link_Mark Cars Reviewed";//
	 * "xpath_.//*[@id='RebuttalInvoiceCars_ButtonGroup']/a[1]"; public static
	 * final String MARK_INVOICE_REVIEWED = "link_Mark Invoice Reviewed";//
	 * "xpath_.//*[@id='RebuttalInvoiceCars_ButtonGroup']/a[2]"; public static
	 * final String BULK_REBUTTAL = "link_Bulk Rebuttal";//
	 * "xpath_.//*[@id='RebuttalInvoiceCars_ButtonGroup']/a[3]"; public static
	 * final String CAR_STATUS =
	 * "xpath_.//*[@id='DataTables_Table_0']/tbody/tr/td[11]"; public static
	 * final String CAR_ACTIONS =
	 * "xpath_.//*[@id='DataTables_Table_0']/tbody/tr/td[12]/div/button";
	 * 
	 * // Bulk Rebuttal dialogue/popup public static final String BILEE_DROPDOWN
	 * = "id_CompanyId";//"xpath_.//*[@id='CompanyId']"; public static final
	 * String CONTACT_DROPDOWN =
	 * "id_CompanyContactId";//"xpath_.//*[@id='CompanyContactId']"; public
	 * static final String LEASE_DROPDOWN =
	 * "id_LeaseId";//"xpath_.//*[@id='LeaseId']"; public static final String
	 * NOTES = "id_Notes";//"xpath_.//*[@id='Notes']"; public static final
	 * String SAVE_REBUTTAL =
	 * "id_SaveRebuttal";//"xpath_.//*[@id='SaveRebuttal']"; public static final
	 * String CANCEL = "id_Cancel";//"xpath_.//*[@id='Cancel']"; public static
	 * final String OVERWRITE_REBUTTAL =
	 * "id_OverwriteRebuttal";//"xpath_.//*[@id='OverwriteRebuttal']"; public
	 * static final String REPRICE =
	 * "id_IsReprice";//"xpath_.//*[@id='IsReprice']"; public static final
	 * String BULK_UNASSIGN =
	 * "id_BulkUnassign";//"xpath_.//*[@id='BulkUnassign']"; public static final
	 * String STATUS =
	 * "xpath_.//*[@id='DataTables_Table_0']/tbody/tr[1]/td[14]"; public static
	 * final String CONFIRMBULKUNASSIGN =
	 * "id_confirm";//"xpath_.//*[@id='confirm']";
	 * 
	 * // Repair list public static final String BULK_REBUTTAL_REPAIRLIST =
	 * "id_RebuttalCarRepairs_ButtonGroup";//
	 * "xpath_.//*[@id='RebuttalCarRepairs_ButtonGroup']/a"; public static final
	 * String popupok = "src/test/resources/images/popupok.PNG"; public static
	 * final String RESTORE_DEFAULT =
	 * "id_RebuttalCarRepairs_RestoreDefaultSort";//
	 * "xpath_.//*[@id='RebuttalCarRepairs_RestoreDefaultSort']";
	 * 
	 * // MyCompanyInfo public static final String EDITBUTTON =
	 * "xpath_.//*[@id='_ViewCompanyDetails']/div/button"; public static final
	 * String DISPLYEDIINFO_LIST =
	 * "xpath_.//*[@id='_ViewCompanyDetails']/dl/dd";
	 * 
	 * public static final String DISPLYEDIINFO_LIST1 =
	 * "xpath_.//*[@id='_ViewCompanyDetails']/dl/dd[1]"; public static final
	 * String DISPLYEDIINFO_LIST2 =
	 * "xpath_.//*[@id='_ViewCompanyDetails']/dl/dd[2]"; public static final
	 * String DISPLYEDIINFO_LIST3 =
	 * "xpath_.//*[@id='_ViewCompanyDetails']/dl/dd[3]"; public static final
	 * String DISPLYEDIINFO_LIST4 =
	 * "xpath_.//*[@id='_ViewCompanyDetails']/dl/dd[4]"; public static final
	 * String DISPLYEDIINFO_LIST5 =
	 * "xpath_.//*[@id='_ViewCompanyDetails']/dl/dd[5]";
	 * 
	 * public static final String EDITCOMPANYPOPUP =
	 * "xpath_.//*[@id='modal-popup']/div[1]/div/div/h2/span"; public static
	 * final String MARK =
	 * "id_ReportingMark";//"xpath_.//*[@id='ReportingMark']"; public static
	 * final String NAME = "id_Name";//"xpath_.//*[@id='Name']"; public static
	 * final String APNUMBER = "id_ApNumber";//"xpath_.//*[@id='ApNumber']";
	 * public static final String ARNUMBER =
	 * "id_ArNumber";//"xpath_.//*[@id='ArNumber']"; public static final String
	 * TAXPAYERID = "id_TaxpayerId";//"xpath_.//*[@id='TaxpayerId']"; public
	 * static final String CANCELBUTTON =
	 * "id_Cancel";//"xpath_.//*[@id='Cancel']"; public static final String
	 * EDITSAVEBUTTON = "id_Save";//"xpath_.//*[@id='Save']"; public static
	 * final String ADDCONTACT = "id_CompayContactDataTablesGrid_ButtonGroup";//
	 * "xpath_.//*[@id='CompayContactDataTablesGrid_ButtonGroup']/a"; public
	 * static final String CONTACTNAME =
	 * "id_Contact_Name";//"xpath_.//*[@id='Contact_Name']"; public static final
	 * String TITLE = "id_Contact_Title";//"xpath_.//*[@id='Contact_Title']";
	 * public static final String PHONE =
	 * "id_Contact_Phone";//"xpath_.//*[@id='Contact_Phone']"; public static
	 * final String FAX = "id_Contact_Fax";//"xpath_.//*[@id='Contact_Fax']";
	 * public static final String EMAIL =
	 * "id_Contact_Email";//"xpath_.//*[@id='Contact_Email']"; public static
	 * final String COUNTRYCODE_DROPDOWN =
	 * "id_Contact_CountryCode";//"xpath_.//*[@id='Contact_CountryCode']";
	 * public static final String TYPE_SELECTID =
	 * "id_Contact_Types_SelectedIDs";//
	 * "xpath_.//*[@id='Contact_Types_SelectedIDs']"; public static final String
	 * ADDRESS1 = "id_Contact_Street1";//"xpath_.//*[@id='Contact_Street1']";
	 * public static final String CITY =
	 * "id_Contact_City";//"xpath_.//*[@id='Contact_City']"; public static final
	 * String STATE = "id_Contact_State";//"xpath_.//*[@id='Contact_State']";
	 * public static final String zipcode =
	 * "id_Contact_ZipCode";//"xpath_.//*[@id='Contact_ZipCode']"; public static
	 * final String contacttable =
	 * "xpath_.//*[@id='DataTables_Table_0']/tbody/tr"; public static final
	 * String infotable = "xpath_.//*[@id='DataTables_Table_0_info']/tbody/tr";
	 * public static final String CONTACT_ACTIONS =
	 * "xpath_.//*[@id='DataTables_Table_0']/tbody/tr[1]/td[6]/div/button";
	 * public static final String CONTACT_ACTIONS_LIST =
	 * "xpath_.//*[@id='DataTables_Table_0']/tbody/tr[1]/td[6]/div/ul/li/a";
	 * public static final String CANCEL_DISABLECONTACTS =
	 * "xpath_.//*[@id='modal-popup']/div[3]/button[1]"; public static final
	 * String POPUPHEADING =
	 * "xpath_.//*[@id='modal-popup']/div[1]/div/div/h2/span"; public static
	 * final String ENABLEDTEXT =
	 * "xpath_.//*[@id='DataTables_Table_0']/tbody/tr[1]/td[4]"; public static
	 * final String POPUPTEXT = "xpath_.//*[@id='modal-popup']/div[2]"; public
	 * static final String CONFIRMDISABLESAVE =
	 * "id_Save";//"xpath_.//*[@id='Save']"; public static final String
	 * CONFIRMSAVE = "id_confirm";//"xpath_.//*[@id='confirm']"; public static
	 * final String SAVECONTACT = "id_Save";//"xpath_.//*[@id='Save']";
	 * 
	 * // user manager public static final String User_Manager_Filter =
	 * "xpath_.//*[@id='_FilterActiveCriteria']/div/div/button[1]"; public
	 * static final String Add_User =
	 * "link_Add User";//"xpath_.//*[@id='UserManager_ButtonGroup']/a[1]";
	 * public static final String Disable_Users =
	 * "link_Disable Users";//"xpath_.//*[@id='UserManager_ButtonGroup']/a[2]";
	 * public static final String Enable_Users =
	 * "link_Enable Users";//"xpath_.//*[@id='UserManager_ButtonGroup']/a[3]";
	 * public static final String Actions_userManager =
	 * "xpath_.//*[@id='DataTables_Table_0']/tbody/tr[1]/td[8]/div/button";
	 * public static final String divison = "div/button"; public static final
	 * String actionlist1 = "div/ul/li[a[contains(.,'"; public static final
	 * String actionlist2 = "')]]"; // filter public static final String
	 * FilterUserName =
	 * "id_UserManager_Username";//"xpath_.//*[@id='UserManager_Username']";
	 * public static final String FilterRoles_DROPDOWN =
	 * "id_UserManager_Roles";//"xpath_.//*[@id='UserManager_Roles']"; public
	 * static final String FilterApprovalTiers_DROPDOWN =
	 * "id_UserManager_ApprovalTier";//
	 * "xpath_.//*[@id='UserManager_ApprovalTier']"; public static final String
	 * FilterEnabled_DROPDOWN =
	 * "id_UserManager_Enabled";//"xpath_.//*[@id='UserManager_Enabled']";
	 * public static final String FilterSave =
	 * "id_Save";//"xpath_.//*[@id='Save']"; public static final String
	 * FilterCancel = "id_Cancel";//"xpath_.//*[@id='Cancel']"; public static
	 * final String CANCEL_EDITUSER =
	 * "xpath_.//*[@id='saveUserForm']/section/div/div/button[1]";
	 * 
	 * // Add User public static final String UserName =
	 * "id_Username";//"xpath_.//*[@id='Username']"; public static final String
	 * FirstName = "id_FirstName";//"xpath_.//*[@id='FirstName']"; public static
	 * final String LastName = "id_LastName";//"xpath_.//*[@id='LastName']";
	 * public static final String Email =
	 * "id_Email";//"xpath_.//*[@id='Email']"; public static final String
	 * SaveUser = "xpath_.//*[@id='saveUserForm']/section/div/div/button[2]";
	 * public static final String CancelUser =
	 * "xpath_.//*[@id='saveUserForm']/section/div/div/button[1]";
	 * 
	 * public static final String SELECTALL =
	 * "id_UserManager_SelectAll";//"xpath_.//*[@id='UserManager_SelectAll']";
	 * public static final String CONFIRM =
	 * "id_confirm";//"xpath_.//*[@id='confirm']";
	 * 
	 * // C2CA public static final String C2CA_Filter =
	 * "id_FilterActiveCriteria";//
	 * "xpath_.//*[@id='_FilterActiveCriteria']/div/div/button[1]"; public
	 * static final String ASSOC_CARINITIAL =
	 * "id_Association_CarInitial";//"xpath_.//*[@id='Association_CarInitial']";
	 * public static final String ASSOC_CARNUMBER =
	 * "id_Association_CarNumber_Start";//
	 * "xpath_.//*[@id='Association_CarNumber_Start']"; public static final
	 * String ASSOC_CAREND = "id_Association_CarNumber_End";//
	 * "xpath_.//*[@id='Association_CarNumber_End']"; public static final String
	 * ASSOC_CUSTOMER =
	 * "xpath_.//*[@id='filterCriteriaForm']/fieldset/div[3]/div/div[3]/span[2]/div/div/input[2]";
	 * public static final String ASSOC_ENABLED =
	 * "id_Association_Enabled";//"xpath_.//*[@id='Association_Enabled']";
	 * public static final String ASSOC_SAVE =
	 * "id_Save";//"xpath_.//*[@id='Save']"; public static final String
	 * ASSOC_CANCEL = "id_Cancel";//"xpath_.//*[@id='Cancel']"; public static
	 * final String ADD_ASSOCIATION =
	 * "xpath_.//*[@id='CarToCompAssocGrid_ButtonGroup']/a"; public static final
	 * String ASSOC_ACTIONS =
	 * "xpath_.//*[@id='DataTables_Table_0']/tbody/tr[1]/td[6]/div/button";
	 * public static final String okdisable =
	 * "id_confirm";//"xpath_.//*[@id='confirm']";
	 * 
	 * // car assoc poup public static final String ASSOC_INITIAL =
	 * "id_Association_Initial";//"xpath_.//*[@id='Association_Initial']";
	 * public static final String BEGINRANGE =
	 * "id_Association_BeginRangeNumber";//
	 * "xpath_.//*[@id='Association_BeginRangeNumber']"; public static final
	 * String ENDRANGE = "id_Association_EndRangeNumber";//
	 * "xpath_.//*[@id='Association_EndRangeNumber']"; public static final
	 * String SAVEPOPUP = "id_Save";//"xpath_.//*[@id='Save']"; public static
	 * final String CUSTOMER_DROPDOWN =
	 * "id_Association_Company";//"xpath_.//*[@id='Association_Company']";
	 * public static final String CANCELPOPUP =
	 * "id_Cancel";//"xpath_.//*[@id='Cancel']"; public static final String
	 * EDIT_C2CATITLE = "xpath_.//*[@id='modal-popup']/div[1]/div/div/h2/span";
	 * public static final String C2CATITLE =
	 * "xpath_.//*[@id='modal-popup']/div[1]/div/div/h2/span";
	 * 
	 * 
	 * // user profile public static final String up_UserName =
	 * "id_Username";//"xpath_.//*[@id='Username']"; public static final String
	 * up_FirstName = "id_FirstName";//"xpath_.//*[@id='FirstName']"; public
	 * static final String up_LastName =
	 * "id_LastName";//"xpath_.//*[@id='LastName']"; public static final String
	 * email = "id_Email";//"xpath_.//*[@id='Email']"; public static final
	 * String Change_pwd =
	 * "id_changePasswordLink";//"xpath_.//*[@id='changePasswordLink']"; public
	 * static final String oldpwd =
	 * "id_Password_OldPassword";//"xpath_.//*[@id='Password_OldPassword']";
	 * public static final String newpwd =
	 * "id_Password_NewPassword";//"xpath_.//*[@id='Password_NewPassword']";
	 * public static final String confirmpwd = "id_Password_ConfirmPassword";//
	 * "xpath_.//*[@id='Password_ConfirmPassword']"; public static final String
	 * save_pwd = "xpath_.//*[@id='saveUserForm']/section/div/div/button[2]";
	 * public static final String cancelpwd =
	 * "xpath_.//*[@id='saveUserForm']/section/div/div/button[1]"; public static
	 * final String msg = "xpath_.//*[@id='saveUserForm']/div/div[1]"; public
	 * static final String UP_Admin =
	 * "id_SelectedRoles_Ids9";//"xpath_.//*[@id='SelectedRoles_Ids9']"; public
	 * static final String UP_User =
	 * "id_SelectedRoles_Ids10";//"xpath_.//*[@id='SelectedRoles_Ids10']";
	 * public static final String UP_UserEditor =
	 * "id_SelectedRoles_Ids11";//"xpath_.//*[@id='SelectedRoles_Ids11']";
	 * public static final String ROLES =
	 * "name_SelectedRoles.Ids";//"xpath_.//input[@name='SelectedRoles.Ids']";
	 * public static final String TOPRIGHT =
	 * "xpath_.//*[@id='notification-main']/div[1]/div[1]/div/div/div[1]/button";
	 * public static final String LOGOUT =
	 * "xpath_.//*[@id='notification-main']/div[1]/div[1]/div/div/div[1]/ul/li/a";
	 * 
	 * // billing contacts public static final String Add_Company =
	 * "id_CompaniesTable_ButtonGroup";//
	 * "xpath_.//*[@id='CompaniesTable_ButtonGroup']/a"; public static final
	 * String popuptitle =
	 * "xpath_.//*[@id='modal-popup']/div[1]/div/div/h2/span"; public static
	 * final String mark =
	 * "id_ReportingMark";//"xpath_.//*[@id='ReportingMark']"; public static
	 * final String Name = "id_Name";//"xpath_.//*[@id='Name']"; public static
	 * final String APNo = "id_ApNumber";//"xpath_.//*[@id='ApNumber']"; public
	 * static final String ARNo = "id_ArNumber";//"xpath_.//*[@id='ArNumber']";
	 * public static final String Save = "id_Save";//"xpath_.//*[@id='Save']";
	 * public static final String Cancel =
	 * "id_Cancel";//"xpath_.//*[@id='Cancel']";
	 * 
	 * public static final String rmark =
	 * "id_Company_ReportingMark";//"xpath_.//*[@id='Company_ReportingMark']";
	 * public static final String cname =
	 * "id_Company_Name";//"xpath_.//*[@id='Company_Name']"; public static final
	 * String apno =
	 * "id_Company_ApNumber";//"xpath_.//*[@id='Company_ApNumber']"; public
	 * static final String arno =
	 * "id_Company_ArNumber";//"xpath_.//*[@id='Company_ArNumber']"; public
	 * static final String companyenabled_dropdown =
	 * "id_Company_Enabled";//"xpath_.//*[@id='Company_Enabled']"; public static
	 * final String Contactenabled =
	 * "id_Contact_Enabled";//"xpath_.//*[@id='Contact_Enabled']"; public static
	 * final String cancelbutton = "id_Cancel";//"xpath_.//*[@id='Cancel']";
	 * public static final String savebutton =
	 * "id_Save";//"xpath_.//*[@id='Save']"; public static final String Actions
	 * = "xpath_.//*[@id='DataTables_Table_0']/tbody/tr/td[6]/div/button";
	 * 
	 * public static final String cancel =
	 * "xpath_.//*[@id='modal-popup']/div[3]/button[1]"; public static final
	 * String ok = "id_confirm";//"xpath_.//*[@id='confirm']"; public static
	 * final String Contact_subtable =
	 * "xpath_.//*[@data-table-name='CompanyContactsTable']/tbody/tr"; public
	 * static final String plus = "src/test/resources/images/plus.PNG"; public
	 * static final String subtable_actions =
	 * "xpath_.//*[@data-table-name='CompanyContactsTable']/tbody/tr/td[6]/div/button";
	 * public static final String Name_Displayed =
	 * "xpath_.//*[@id='_CompanyContactDetail']/div[2]/div[1]/div/span[1]";
	 * public static final String Title_Displayed =
	 * "xpath_.//*[@id='_CompanyContactDetail']/div[2]/div[2]/div/span[1]";
	 * public static final String companycantsave =
	 * "xpath_.//*[@id='_CompanyDetail']/div[1]/span"; public static final
	 * String duplicatecompany = "xpath_.//*[@id='modal-popup']/div[2]/ol/li";
	 * public static final String close =
	 * "id_Close";//"xpath_.//*[@id='Close']";
	 * 
	 * 
	 * // Maintenance Responsibility Groups public static final String AddGroup
	 * = "id_MaintenanceResponsibilityGroups_ButtonGroup";//
	 * "xpath_.//*[@id='MaintenanceResponsibilityGroups_ButtonGroup']/a"; public
	 * static final String MRG_ENABLED =
	 * "id_MaintenanceResponsibilityGroup_Enabled";//
	 * "xpath_.//*[@id='MaintenanceResponsibilityGroup_Enabled']"; public static
	 * final String MRG_NAME = "id_MaintenanceResponsibilityGroup_Name";//
	 * "xpath_.//*[@id='MaintenanceResponsibilityGroup_Name']"; public static
	 * final String MRG_SAVE = "id_Save";//"xpath_.//*[@id='Save']"; public
	 * static final String MRG_CANCEl =
	 * "id_Cancel";//"xpath_.//*[@id='Cancel']"; public static final String
	 * MRG_FILTER = "xpath_.//*[@id='_FilterActiveCriteria']/div/div/button[1]";
	 * 
	 * // Add Group public static final String AddGroup_Name =
	 * "id_Name";//"xpath_.//*[@id='Name']"; public static final String
	 * AddGroup_Desc = "id_Description";//"xpath_.//*[@id='Description']";
	 * public static final String SaveGroup =
	 * "xpath_.//*[@id='editRuleForm']/div/div[3]/button[2]"; public static
	 * final String CancelGroup =
	 * "xpath_.//*[@id='editRuleForm']/div/div[3]/button[1]"; public static
	 * final String jobcodes_part1 = "//*[@id='CriteriaRows["; public static
	 * final String jobcodes_part2 = "]_JobCodesSpecified']"; public static
	 * final String jobcodetext_part1 = ".//*[@id='CriteriaRows_"; public static
	 * final String jobcodetext_part2 = "__JobCodes']"; public static final
	 * String qualifiercode_part2 = "]_QualifierCodesSpecified']"; public static
	 * final String qualifiercodetext_part2 = "__QualifierCodes']"; public
	 * static final String WMC_part2 = "]_WhyMadeCodesSpecified']"; public
	 * static final String WMCtext_part2 = "__WhyMadeCodes']"; public static
	 * final String Add_NewLine =
	 * "xpath_.//*[@id='_MaintenanceResponsibilityGroupRowEditor']/div[3]/a";
	 * public static final String Error_Message =
	 * "xpath_.//*[@id='_MaintenanceResponsibilityGroupEditor']/section/div/ul/li";
	 * public static final String DELETE_ICON =
	 * "xpath_.//*[@id='_MaintenanceResponsibilityGroupRowEditor']/div[2]/div/div[4]/div[3]/div/div[3]/span";
	 * public static final String Maintenance_Group_line =
	 * "class_maintenanceGroupLine";//
	 * "xpath_//*[@class='maintenanceGroupLine']"; public static final String
	 * confirm_popup = "id_confirm";//"xpath_.//*[@id='confirm']"; public static
	 * final String cancelpopup =
	 * "xpath_.//*[@id='modal-popup']/div[3]/button[1]";
	 * 
	 * // Locator for Invoice Review
	 * 
	 * public static final String INVOICE_CHECKBOX_FOR_UNPAID_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr[1]/td[1]/input"; public
	 * static final String INVOICE_CHECKBOX_LOCATOR1 =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr["; public static final
	 * String INVOICE_CHECKBOX_LOCATOR2 = "]/td[1]/input"; public static final
	 * String INVOICEREVIEW_ACTION_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr[3]/td[15]/div/button";
	 * public static final String INVOICEREVIEW_ACTION_DETAILS_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr[3]/td[15]/div/ul/li/a";
	 * public static final String INVOICEREVIEW_FILTER_LOCATOR =
	 * "xpath_.//*[@id='_FilterActiveCriteria']/div/div/button[1]"; public
	 * static final String INVOICEREVIEW_FILTTER_INVOICENUMBERSTART_LOCATOR =
	 * "id_Invoice_InvoiceNumber_Start";//
	 * "xpath_//input[@id='Invoice_InvoiceNumber_Start']"; public static final
	 * String INVOICEREVIEW_FILTER_INVOICENUMBEREND_LOCATOR =
	 * "id_Invoice_InvoiceNumber_End";//
	 * "xpath_//input[@id='Invoice_InvoiceNumber_End']"; public static final
	 * String INVOICEREVIEW_FILTER_SAVE_LOCATOR =
	 * "id_Save";//"xpath_//button[@id='Save']"; public static final String
	 * INVOICEREVIEW_INVOICENUMBER_CLOSE_LOCATOR =
	 * "xpath_//div[@id='_FilterActiveCriteria']/div/div/a[2]"; public static
	 * final String INVOICEREVIEW_GENERATEREPORT_LOCATOR =
	 * "xpath_//div[@id='ViewInvocies_ButtonGroup']/a[1]"; public static final
	 * String INVOICEREVIEW_REPORTDOWNLOAD_ACTION_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_1']/tbody/tr/td[3]/div/button";
	 * public static final String INVOICEREVIEW_REPORTDOWNLOAD_DOWNLOAD_LOCATOR
	 * = "xpath_//table[@id='DataTables_Table_1']/tbody/tr/td[3]/div/ul/li/a";
	 * public static final String INVOICEREVIEW_APPROVE_PAYMENT_LOCATOR =
	 * "xpath_//div[@id='ViewInvocies_ButtonGroup']/a[2]"; public static final
	 * String INVOICEREVIEW_APPROVE_PAYMENT_OK_LOCATOR =
	 * "id_confirm";//"xpath_//button[@id='confirm']"; public static final
	 * String INVOICEREVIEW_MARKPAID_LOCATOR =
	 * "xpath_//div[@id='ViewInvocies_ButtonGroup']/a[3]"; public static final
	 * String INVOICEREVIEW_MARKPAID_OK_LOCATOR =
	 * "id_confirm";//"xpath_//button[@id='confirm']"; public static final
	 * String INVOICEREVIEW_MARKPAID_ERROR_LOCATOR =
	 * "xpath_//div[@id='modal-popup']/div[2]/ol"; public static final String
	 * INVOICEREVIEW_MARKPAID_CLOSE_LOCATOR =
	 * "xpath_//div[@id='modal-popup']/div[3]/button"; public static final
	 * String INVOICEREVIEW_PAID_CHECKBOX_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr[1]/td[1]/input"; public
	 * static final String INVOICEREVIEW_FILTER_CHECKBOX_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[1]/input"; public
	 * static final String INVOICEREVIEW_APPROVED_CHECKBOX_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr[2]/td[1]/input"; public
	 * static final String INVOICEREVIEW_APPROVE_PAYMENTSTATUS =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr[1]/td[14]"; public
	 * static final String INVOICEREVIEW_FILTERDATA_VERIFY_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr[1]/td[6]"; public
	 * static final String PAID_STATUS =
	 * "xpath_//select[@id='Invoice_PaymentStatus']";
	 * 
	 * // Locators for Home Page for Invoice Review public static final String
	 * INVOICE_DROPDOWN_LOCATOR = "xpath_//li[@id='Nav_Invoices']/a/i"; public
	 * static final String INVOICREVIEW_SUBMENU_LOCATOR =
	 * "xpath_//li[@id='Nav_Invoices']/ul/li[1]/a";
	 * 
	 * 
	 * // Locators for Report History public static final String
	 * REPORTHISTORY_MENUBAR_LOCATOR =
	 * "link_Report History";//"xpath_//li[@id='Nav_ReportHistory']/a"; public
	 * static final String REPORTHISTORY_PAGETITLE_LOCATOR =
	 * "xpath_//div[@id='notification-main']/div[2]/div/div[1]/h1"; public
	 * static final String REPORTHISTORY_ACTION_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr[1]/td[4]/div/button";
	 * public static final String REPORTHISTORY_ACTION_DOWNLOAD_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr[1]/td[4]/div/ul/li/a";
	 * public static final String REPORTHISTORY_REPORTDOWNLOAD_POPUP_LOCATOR =
	 * "xpath_//div[@id='modal-popup']/div[1]/div/div/h2/span"; public static
	 * final String REPORTHISTORY_REPORTDOWLOAD_ACTION_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_1']/tbody/tr[1]/td[3]/div/button";
	 * public static final String
	 * REPORTHISTORY_REPORTDOWNLOAD_ACTION_DOWNLOAD_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_1']/tbody/tr[1]/td[3]/div/ul/li/a";
	 * public static final String REPORTHISTORY_FILTER_LOCATOR =
	 * "xpath_//div[@id='_FilterActiveCriteria']/div/div/button[1]"; public
	 * static final String REPORTHISTORY_FILTER_CREATEDATE_LOCATOR =
	 * "id_ReportFilter_CreateDate_StartDate";//
	 * "xpath_//input[@id='ReportFilter_CreateDate_StartDate']"; public static
	 * final String REPORTHISTORY_FILTER_ENDDATE_LOCATOR =
	 * "id_ReportFilter_CreateDate_EndDate";//
	 * "xpath_//input[@id='ReportFilter_CreateDate_EndDate']"; public static
	 * final String REPORTHISTORY_FILTER_SAVE_LOCATOR =
	 * "xpath_//button[text()='Save']"; public static final String
	 * REPORTHISTORY_FILTER_GRID_DESCRIPTION_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr[2]/td[3][text()='Invoice for vdad33']"
	 * ;
	 * 
	 * 
	 * // Locator for View Leases Home Page public static final String
	 * LEASES_VIEWLEASES_LOCATOR =
	 * "xpath_//li[@id='Nav_Configuration']/ul[@class='dropdown-menu']/li[a[contains(text(),'Leases')]]/ul/li/a";
	 * 
	 * // Locator for View Leases Page public static final String
	 * VIEWLEASES_ADDLEASE_BUTTON_LOCATOR =
	 * "id_ViewLeasesDataTablesGrid_ButtonGroup";//
	 * "xpath_.//*[@id='ViewLeasesDataTablesGrid_ButtonGroup']/a[1]"; public
	 * static final String VIEWLEASES_SELECT_RELATIONSHIP_LOCATOR =
	 * "xpath_//select[@id='Relationship']/option[3]"; public static final
	 * String VIEWLEASES_SELECT_TYPE_LOCATOR =
	 * "xpath_//select[@id='Type']//option[2]"; public static final String
	 * VIEWLEASE_ENTERNUMBER_LOCATOR = "id_Number";//"xpath_.//*[@id='Number']";
	 * public static final String VIEWLEASES_ENTERTITLE_LOCATOR =
	 * "id_Title";//"xpath_.//*[@id='Title']"; public static final String
	 * VIEWLEASES_ENTERSTART_DATE_LOCATOR =
	 * "id_StartDate";//"xpath_.//*[@id='StartDate']"; public static final
	 * String VIEWLEASES_ENTEREND_DATE_LOCATOR =
	 * "id_EndDate";//"xpath_.//*[@id='EndDate']"; public static final String
	 * VIEWLEASES_SELECTLESSOR_LOCATOR =
	 * "xpath_//select[@id='LessorLeaseeSelect']"; public static final String
	 * VIEWLEASES__SELECTLESSOR_CONTACT_LOCATOR =
	 * "id_LessorLeaseeContactSelect";//
	 * "xpath_.//*[@id='LessorLeaseeContactSelect']"; public static final String
	 * VIEWLEASES_ENTER_CARCOUNT_LOCATOR =
	 * "id_MaximumCarCount";//"xpath_.//*[@id='MaximumCarCount']"; public static
	 * final String VIEWLEASES_SAVEGROUP_BUTTON_LOCATOR =
	 * "xpath_.//*[@id='editLeaseForm']/section[2]/div/div/button[2]"; public
	 * static final String VIEWLEASES_LEASEINFORMATION_LOCATOR =
	 * "xpath_//div[@id='_EditLeaseEditor']/section/header/h3";
	 * 
	 * // Locators for Lease Assignment Page public static final String
	 * UPLOADCSV_BUTTON_LOCATOR =
	 * "xpath_//div[@id='Lease_Assignment_ButtonGroup']/a[1]"; public static
	 * final String UPLOADFILE_BUTTON_LOCATOR =
	 * "xpath_//form[@id='LeaseUploader']/span[@id='LeaseUploader_wrapper']/input[@id='attachments']";
	 * public static final String UPLOAD_PROGRESSBAR_LOCATOR =
	 * "xpath_//div[@id='progressWrapper']/div[@id='progressText']"; public
	 * static final String LEASE_UPLOAD_STATUS_LOCATOR =
	 * "xpath_//tbody/tr[1]/td[2]"; public static final String
	 * FILTER_BUTTON_LOCATOR = "xpath_//button[text()='Filter']"; public static
	 * final String CAR_INITIAL_EDITBOX_LOCATOR =
	 * "id_LeaseAssignment_CarInitial";//
	 * "xpath_//input[@id='LeaseAssignment_CarInitial']"; public static final
	 * String CAR_NUMBERFROM_EDITBOX_LOCATOR =
	 * "id_LeaseAssignment_CarNumber_Start";//
	 * "xpath_//input[@id='LeaseAssignment_CarNumber_Start']"; public static
	 * final String CAR_NUMBERTO_EDITBOX_LOCATOR =
	 * "id_LeaseAssignment_CarNumber_End";//
	 * "xpath_//input[@id='LeaseAssignment_CarNumber_End']"; public static final
	 * String LEASE_SAVE_BUTTON_LOCATOR =
	 * "id_Save";//"xpath_//button[@id='Save']"; public static final String
	 * CAR_LOADED_LOCATOR =
	 * "xpath_//div[@id='DataTables_Table_0_wrapper']/table[@id='DataTables_Table_0']/tbody/tr/td/following-sibling::td[1]";
	 * public static final String CAR_INITIAL_CHECKBOX_LOCATOR =
	 * "xpath_//table[@data-table-name='Lease Assignment']/tbody/tr[1][td[3][contains(text(),'013782')]]/td[1]"
	 * ; public static final String UNASSIGN_BUTTON_LOCATOR =
	 * "xpath_//div[@id='Lease_Assignment_ButtonGroup']/a[2]"; public static
	 * final String UNASSIGN_SAVE_BUTTON_LOCATOR =
	 * "xpath_//button[text()='Save']"; public static final String
	 * UNASSIGN_ERROR_TEXT_LOCATOR =
	 * "xpath_//div[@id='modal-popup']/div[2]/div[@id='UnassignCars']/div[@class='validation-summary-errors']/ul";
	 * public static final String UNASSIGN_CANCEL_BUTTON_LOCATOR =
	 * "id_//Cancel"; public static final String
	 * UNASSIGN_ENDDATE_EDITBOX_LOCATOR =
	 * "id_EndDate";//"xpath_//input[@id='EndDate']"; public static final String
	 * ACTION_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[span[text()='Complete']]/following-sibling::td[4]";
	 * public static final String VIEWLOG_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[span[text()='Complete']]/following-sibling::td[4]/div/ul/li[1]/a";
	 * public static final String DELETE_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[span[text()='Complete']]/following-sibling::td[4]/div/ul/li[2]/a";
	 * public static final String TEXT_TABLE_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/thead/tr/th[5]"; public static
	 * final String LEASES_CAR_INITIAL_CLOSE_LOCATOR =
	 * "xpath_//div[@id='_FilterActiveCriteria']/div/div/a[2]/i"; public static
	 * final String LEASES_CAR_NUMBER_CLOSE_LOCATOR =
	 * "xpath_//div[@id='_FilterActiveCriteria']/div/div/a[4]/i";
	 * 
	 * // Locators for Home Page LEASES ASSIGNMENT public static final String
	 * LEASES_SUBMENU_LOCATOR = "xpath_//li[@id='Nav_Configuration']/ul/li/a";
	 * public static final String LEASESLIST_LEASEASSIGNMENTSUBMENU_LOCATOR =
	 * "xpath_//li[@id='Nav_Configuration']/ul[@class='dropdown-menu']/li[a[contains(text(),'Leases')]]/ul/li/a";
	 * 
	 * // Locators for Fleet List Page
	 * 
	 * public static final String FLEET_FILTER_BUTTON_LOCATOR =
	 * "xpath_//button[text()='Filter']"; public static final String
	 * FLEET_CAR_INITIAL_CHECKBOX_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr[1]/td[1]/input"; public
	 * static final String FLEET_ACTION_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[8]/div/button";
	 * public static final String
	 * FLEET_ACTION_FILTER_DELETEINVOICE_VERIFY_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td"; public static
	 * final String FLEET_ACTION_DELETEINVOICE_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr[7]/td[8]/div/button";
	 * public static final String FLEET_ACTION_DETAILS_DELETEINVOICE_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr[7]/td[8]/div/ul/li/a";
	 * public static final String FLEET_CHECKBOX_DELETEINVOICE_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[text()='013792']";
	 * public static final String FLEET_ACTION_DETAILS_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[8]/div/ul/li/a";
	 * public static final String FLEET_CARHISTORY_ACTION_LOCATOR =
	 * "xpath_//tbody/tr/td[5]/div/button"; public static final String
	 * FLEET_CARHISTORY_ACTION_EDIT_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[5]/div/ul/li[1]/a";
	 * public static final String FLEET_EDITHISTORY_INITIAL_INPUT_LOCATOR =
	 * "id_Initial";//"xpath_//input[@id='Initial']"; public static final String
	 * FLEET_CAR_INITIAL_CLOSE_LOCATOR =
	 * "xpath_//div[@id='_FilterActiveCriteria']/div/div/a[2]/i"; public static
	 * final String FLEET_CARHISTORY_EDITHISTORY_ENDDATE_LOCATOR =
	 * "id_EndDate";//"xpath_//input[@id='EndDate']"; public static final String
	 * FLEET_CARHISTORY_ACTION_DELETE_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[5]/div/ul/li[2]/a";
	 * public static final String FLEET_DEACTIVATE_BUTTON_LOCATOR =
	 * "xpath_//div[@id='FleetListGrid_ButtonGroup']/a[1]"; public static final
	 * String FLEET_DEACTIVATE_SAVE_BUTTON_LOCATOR =
	 * "id_Save";//"xpath_//button[@id='Save']"; public static final String
	 * FLEET_DEACTIVATE_ENDDATE_INPUTFIELD_LOCATOR =
	 * "xpath_//div[@id='EndDate_wrapper']/input[@id='EndDate']"; public static
	 * final String FLEET_DEACTIVATE_ERROR_MSG_LOCATOR =
	 * "xpath_//div[@id='DeactivateCars']/div/ul/li"; public static final String
	 * FLEET_DEACTIVATE_NOEND_CHECKBOX_LOCATOR =
	 * "xpath_//table[@id='DataTables_Table_0']/tbody/tr[6]/td[1]/input"; public
	 * static final String FLEET_DEACTIVATE_NOENDDATE_ERROR_LOCATOR =
	 * "xpath_//div[@id='DeactivateCars']/div[1]/ul/li";
	 * 
	 * // combine invoices public static final String COMBINE_INVOICES =
	 * "id_CombineInvoices_ButtonGroup";//
	 * "xpath_.//*[@id='CombineInvoices_ButtonGroup']/a"; public static final
	 * String CONFIRM_COMBINEINVOICE =
	 * "id_confirm";//"xpath_.//*[@id='confirm']"; public static final String
	 * FROM_INVOICE_NO = "id_CombinedDxFileFilter_InvoiceNumber_Start";//
	 * "xpath_.//*[@id='CombinedDxFileFilter_InvoiceNumber_Start']"; public
	 * static final String TO_INVOICE_NO =
	 * "id_CombinedDxFileFilter_InvoiceNumber_End";//
	 * "xpath_.//*[@id='CombinedDxFileFilter_InvoiceNumber_End']"; public static
	 * final String CLICK_FILTER =
	 * "xpath_.//*[@id='_FilterActiveCriteria']/div/div/button[1]"; public
	 * static final String SAVE_BUTTON = "id_Save";//"xpath_.//*[@id='Save']";
	 * 
	 * // merge filter public static final String MERGE_FromINVOICE =
	 * "id_InvoiceToCombineFilter_InvoiceNumber_Start";//
	 * "xpath_.//*[@id='InvoiceToCombineFilter_InvoiceNumber_Start']"; public
	 * static final String MERGE_TOINVOICE =
	 * "id_InvoiceToCombineFilter_InvoiceNumber_End";//
	 * "xpath_.//*[@id='InvoiceToCombineFilter_InvoiceNumber_End']"; public
	 * static final String MERGE_BILLEDPARTY =
	 * "id_InvoiceToCombineFilter_BilledParty";//
	 * "xpath_.//*[@id='InvoiceToCombineFilter_BilledParty']"; public static
	 * final String MERGE_BILLINGPARTY =
	 * "id_InvoiceToCombineFilter_BillingParty";//
	 * "xpath_.//*[@id='InvoiceToCombineFilter_BillingParty']"; public static
	 * final String GENERATE_DX_FILE_BUTTON = "id_CombinedDxFile_ButtonGroup";//
	 * "xpath_.//*[@id='CombinedDxFile_ButtonGroup']/a"; public static final
	 * String COMBINED_DX_START_INV =
	 * "id_CombinedDxFileFilter_InvoiceNumber_Start";//
	 * "xpath_.//*[@id='CombinedDxFileFilter_InvoiceNumber_Start']"; public
	 * static final String COMBINED_DX_END_INV =
	 * "id_CombinedDxFileFilter_InvoiceNumber_End";//
	 * "xpath_.//*[@id='CombinedDxFileFilter_InvoiceNumber_End']";
	 * 
	 * public static final String Pr0cess_Created_Notification =
	 * "xpath_.//*[@id='modal-popup']/div[1]/div/div/h2/span"; public static
	 * final String Process_Notification_Text =
	 * "xpath_.//*[@id='modal-popup']/div[2]/div"; // Your invoices are being
	 * created, however this may take several minutes. // You will find your
	 * report in Combined Billing History momentarily. You // may continue to
	 * use the site normally as your reports are being // generated. public
	 * static final String Close_Notification =
	 * "id_Close";//"xpath_.//*[@id='Close']"; public static final String
	 * REMOVE_FILTER = "xpath_.//*[@id='_FilterActiveCriteria']/div/div/a[2]";
	 * public static final String ACTIONS_POPUP =
	 * "xpath_.//*[@id='DataTables_Table_1']/tbody/tr/td[3]/div/button"; public
	 * static final String DOWNLOAD_popup =
	 * "xpath_.//*[@id='DataTables_Table_1']/tbody/tr/td[3]/div/ul/li/a";
	 * 
	 * // Locators for Repair Detail Page public static final String
	 * REPAIR_DETAIL_FILTER_BUTTON_LOCATOR =
	 * "xpath_//button[contains(.,'Filter')]"; public static final String
	 * REPAIR_DETAIL_INVOICENUMBERSTART_EDITBOX_LOCATOR =
	 * "id_Invoice_InvoiceNumber_Start"; public static final String
	 * REPAIR_DETAIL_INVOICENUMBEREND_EDITBOX_LOCATOR =
	 * "id_Invoice_InvoiceNumber_End"; public static final String
	 * REPAIR_DETAIL_SAVE_BUTTON = "id_Save";//"xpath_.//*[@id='Save']"; public
	 * static final String REPAIR_DETAIL_REMOVEFILTER_LINK =
	 * "xpath_.//*[@id='_FilterActiveCriteria']/div/div/a[2]"; public static
	 * final String CarsTab = "xpath_.//*[@id='DataTables_Table_1']/tbody/tr";
	 * public static final String InvoicesTab =
	 * "xpath_.//*[@id='DataTables_Table_2']/tbody/tr"; public static final
	 * String Table3 = "xpath_.//*[@id='DataTables_Table_3']/tbody/tr"; public
	 * static final String RepairTab1 =
	 * "id_tabRepairs";//"xpath_.//*[@id='tabRepairs']"; public static final
	 * String CarsTab1 = "id_tabCars";//"xpath_.//*[@id='tabCars']"; public
	 * static final String InvoicesTab1 =
	 * "id_tabInvoices";//"xpath_.//*[@id='tabInvoices']"; public static final
	 * String AUDIT_TAB =
	 * "xpath_.//*[@id='DataTables_Table_0']/tbody/tr[1]/td[18]/div/span";
	 * public static final String CAR_Audit_Tab =
	 * "xpath_.//*[@id='DataTables_Table_1']/tbody/tr/td[13]/div/span";
	 * 
	 * // upload leases public static final String FIRST_ROW_ACTION =
	 * "xpath_.//*[@id='DataTables_Table_0']/tbody/tr[1]/td[6]/div/button";
	 * 
	 * // Upload fleet public static final String REFRESH =
	 * "id_UploadFleetGrid_RestoreDefaultSort";//
	 * "xpath_.//*[@id='UploadFleetGrid_RestoreDefaultSort']";
	 * 
	 * // Upload DX public static final String REFRESH_DX =
	 * "id_ProcessStatus_RestoreDefaultSort";//
	 * "xpath_.//*[@id='ProcessStatus_RestoreDefaultSort']";
	 */
}
