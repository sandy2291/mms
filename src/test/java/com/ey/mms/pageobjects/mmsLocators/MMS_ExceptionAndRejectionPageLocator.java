package com.ey.mms.pageobjects.mmsLocators;

public class MMS_ExceptionAndRejectionPageLocator {
	
	//public static final String EXCEPTIONS_AND_REJECTION_LOCATOR = "xpath_//li[@id='Nav_Invoices']/ul[@class='dropdown-menu']/li[a[contains(text(),'Exceptions')]]/ul/li[1]/a";
	public static final String GENERATE_REJECTION_POPUP_OK_BUTTON="xpath_//form[@id='PopupWindowForm']//button[@id='confirm']";
	public static final String TO_DROPDOWN="xpath_//select[contains(@id,'toAdress')]";
	public static final String GENERATE_REJECTION_NUMBER_EDITBOX="id_RejectionNumber";
	public static final String GENERATE_REJECTION_RESON_AAR_RADIO="xpath_//input[contains(@id,'radio1')]";
	public static final String GENERATE_REJECTION_RESON_MANUAL_RADIO="xpath_//input[contains(@id,'radio2')]";
	public static final String GENERATE_REJECTION_MESSAGE_EDITBOX="xpath_//textarea[contains(@id,'rejectionMessage')]";
	public static final String GENERATE_REJECTION_RESET_BUTTON="xpath_//div[2]/div/button[1]";
	public static final String GENERATE_REJECTION_SAVE="xpath_//div[2]/div/button[2]";
	public static final String GENERATE_REJECTION_REJECT_INVOICE_BUTTON="xpath_//button[contains(., 'Reject Invoice(s)')]";
	//public static final String GENERATE_REJECTION_CANCEL_BUTTON="xpath_//button[contains(., 'Cancel')]";
	public static final String GENERATE_REJECTION_CANCEL_BUTTON="xpath_//div[@id='dialogboxbody']/my-app/igr/div/div[3]/div/button[1]";
	public static final String GENERATE_REJECTION_LETTER_BUTTON="xpath_//div[@id='notification-main']/div[2]/div/section/div/button";
	public static final String GENERATE_REJECTION_HEADER="xpath_//h2[@class='RejectionModalHeader']";
	public static final String Rejection_Number = "id_RejectionNumber";
	public static final String Rejection_Reason_Radio_button= "xpath_//input[contains(@id,'radio2')]";
	public static final String Rejection_Message= "xpath_//textarea[contains(@id,'rejectionMessage')]";
	public static final String Generate_Rejection_Letter_Save= "xpath_//textarea[contains(@id,'rejectionMessage')]";
	public static final String Save_Generate_Rejection_Letter = "xpath_//div[@class='tab-content']/div[1]/div[2]/div/button[2]";
	public static final String GENERATE_REJECTION_CLICK_SAVE_ERROR="xpath_//span[contains(text(),'Rejection message is required')]";
	public static final String Reject_Invoice_Button = "xpath_//button[contains(., 'Reject Invoice(s)')]";
	public static final String Email_Confirmation_Popup = "xpath_//igr-modal//span";
	public static final String Email_Confirmation_Popup_Button1 = "xpath_//igr-modal//button[contains(text(),'No,I will send it Later')]";
	public static final String Email_Confirmation_Popup_Button2 = "xpath_//igr-modal//button[contains(text(),'Yes, send it now')]";
	public static final String Generate_Rejection_Letter_Header= "xpath_//div[@id='dialogboxinner']//h2";
	public static final String CCCheckbox= "xpath_//input[contains(@class,'ccCheckBox')]";
	public static final String CCTextbox= "xpath_//input[contains(@class,'ccTextBox')]";
	public static final String FromTextbox= "xpath_//input[contains(@name,'email')]";
}
