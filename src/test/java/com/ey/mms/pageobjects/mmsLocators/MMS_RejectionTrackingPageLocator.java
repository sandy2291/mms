package com.ey.mms.pageobjects.mmsLocators;

public class MMS_RejectionTrackingPageLocator {

	//Filter Invoice Section
	public static final String Rejection_Tracking_Filter = "xpath_.//*[@id='_FilterActiveCriteria']/div/div/button[1]";
	public static final String Rejection_Tracking_Grid = "xpath_.//*[@id='DataTables_Table_0']/thead/tr";
	public static final String Rejection_Status_NotClosed="xpath_.//*[@id='_FilterActiveCriteria']/div/div/a[1]";
	public static final String Rejection_Tracking_Actions="xpath_.//*[@id='DataTables_Table_0']/thead/tr/th[12]";
	public static final String Invoice_No_Label = "xpath_.//*[@id='filterCriteriaForm']/fieldset/div[3]/div/div[1]/span[1]/div/label";
	public static final String Invoicing_Party_Label = "xpath_.//*[@id='filterCriteriaForm']/fieldset/div[3]/div/div[2]/span[1]/div/label";
	public static final String Invoice_Date_Label = "xpath_.//*[@id='filterCriteriaForm']/fieldset/div[3]/div/div[3]/span[1]/div/label";
	public static final String Inv_From_Textbox = "id_RejectionLetterInvoiceFilterModel_InvoiceNumber_Start";
	public static final String Inv_To_Textbox = "id_RejectionLetterInvoiceFilterModel_InvoiceNumber_End";
	public static final String Invoice_Party_Textbox  = "id_ExceptionLetterFilterModel_InvoicingParty";
	public static final String Invoice_StartDate_Textbox = "id_ExceptionLetterFilterModel_InvoiceDate_StartDate";
	public static final String Invoice_EndDate_Textbox = "id_ExceptionLetterFilterModel_InvoiceDate_EndDate";	
	public static final String Rejection_Number_Label = "xpath_.//*[@id='filterCriteriaForm']/fieldset/div[5]/div/div[1]/span[1]/div/label";
	public static final String Rejection_Date_Label = "xpath_.//*[@id='filterCriteriaForm']/fieldset/div[5]/div/div[2]/span[1]/div/label";
	public static final String Resubmitted_Inv_No_Label = "xpath_.//*[@id='filterCriteriaForm']/fieldset/div[5]/div/div[3]/span[1]/div/label";
	public static final String Rejection_Reason_Label = "xpath_.//*[@id='filterCriteriaForm']/fieldset/div[5]/div/div[4]/span[1]/div/label";
	public static final String Rejection_Status_Label = "xpath_.//*[@id='filterCriteriaForm']/fieldset/div[5]/div/div[5]/span[1]/div/label";
	public static final String Rejection_Number_From_Textbox = "id_RejectionLetterRejectionFilterModel_InvoiceNumber_Start";
	public static final String Rejection_Number_To_Textbox = "id_RejectionLetterRejectionFilterModel_InvoiceNumber_End";
	public static final String Rejection_StartDate_Textbox= "id_RejectionLetterRejectionFilterModel_InvoiceDate_StartDate";
	public static final String Rejection_EndDate_Textbox = "id_RejectionLetterRejectionFilterModel_InvoiceDate_EndDate";
	public static final String Resubmitted_Inv_No_From_Textbox = "id_RejectionLetterRejectionFilterModel_ResubmittedInvoiceNumber_Start";
	public static final String Resubmitted_Inv_No_To_Textbox = "id_RejectionLetterRejectionFilterModel_ResubmittedInvoiceNumber_End";
	public static final String Rejection_Reason_Dropdown = "id_RejectionLetterRejectionFilterModel_RejectionReason";
	public static final String Rejection_Status_Dropdown = "id_RejectionLetterRejectionFilterModel_RejectionStatus";
	public static final String Cancel_Button = "id_Cancel";
	public static final String Save_Button = "id_Save";
	public static final String Unreject_Button = "id_hlinkUnreject";
	public static final String Email_Button = "id_hlinkSendEmail";
	public static final String Sendmail_Button = "id_btnRejectionEmailModalSend";
	public static final String NODATA = "xpath_.//*[@id='DataTables_Table_0']/tbody/tr/td";
	public static final String Actions = "xpath_.//*[@id='DataTables_Table_0']/tbody/tr/td[12]/div/button";
	public static final String contacttable = "xpath_.//*[@id='DataTables_Table_0']/tbody/tr";
	public static final String actionlist1 = "div/ul/li[a[contains(.,'";
	public static final String actionlist2 = "')]]";
	public static final String Status_Dropdown = "id_RejectionStatusList";
	public static final String Resubmitted_Invoice_Number = "id_ResubmittedInvoiceNumber";

	public static final String Rejection_Status_Save_Button = "xpath_//*[@id='modal-popup']/div[3]/button[2]";
	public static final String Rejection_Number = "id_RejectionNumber";
	public static final String Rejection_Reason_Radio_button= "xpath_//input[contains(@id,'radio2')]";
	public static final String Rejection_Message= "xpath_//textarea[contains(@id,'rejectionMessage')]";
	public static final String Generate_Rejection_Letter_Save= "xpath_//textarea[contains(@id,'rejectionMessage')]";
	public static final String Save_Generate_Rejection_Letter = "xpath_//div[@class='tab-content']/div[1]/div[2]/div/button[2]";
	public static final String Reject_Invoice_Button = "xpath_//button[contains(., 'Reject Invoice(s)')]";
	public static final String Email_Confirmation_Popup = "xpath_//igr-modal//span";
	public static final String Email_Confirmation_Popup_Button1 = "xpath_//igr-modal//button[contains(text(),'No, I will send it Later')]";
	public static final String Email_Confirmation_Popup_Button2 = "xpath_//igr-modal//button[contains(text(),'Yes, send it now')]";
	public static final String Generate_Rejection_Letter_Header= "xpath_//div[@id='dialogboxinner']//h2";

	
	public static final String EmailRejectionLetterPopup = "xpath_.//*[@id='emaildialogboxinner']/div/div[1]/h2";
	public static final String UpdatedStatus = "xpath_.//*[@id='DataTables_Table_0']/tbody/tr[1]/td[9]";
	public static final String CCCheckbox = "xpath_.//*[@id='DataTables_Table_0']/tbody/tr[1]/td[9]";

	
}
