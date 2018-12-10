/**
 * @Copyright Copyright (C) 2016 General Electric Company. All rights reserved.
 */

package com.ey.mms.pageobjects.mmsLocators;

/**
 * <h1>Expected Result Class</h1> MMS Expected Result Class containing Expected
 * Results across multiple pages of Application.
 * 
 * @author Ankur Chaudhry
 * @version 1.1
 * @since 2016-07-17
 */

public class MMS_ExpectedResult {

	// Expected Results for Home Page
	public static final String HOME_PAGE_TITLE = "Home Page - EY MMS";

	
	// Expected Results for Invoice History Page
	public static final String INVOICE_HISTORY_PAGE_TITLE = "Invoice History - EY MMS";
	public static final String INVOICING = "Invoicing - EY MMS";

	// Expected Results for EXCEPTION REVIEW Page
	public static final String EXCEPTIONREVIEW_PAGE_TITLE = "Exception Review - Invoice List - EY MMS";
	public static final String EXCEPTIONTRACKING_PAGE_TITLE = "Exception Tracking - EY MMS";
	public static final String AMOUNTFIELDREQUIRED = "The Amount field is required.";
	public static final String AMOUNTNOMORETHAN = "The Exception Amount No more than the amount of Car";
	public static final String EXCEPTIONFIELDREQUIRED = "The Exception Letter Number field is required";
	public static final String EMPTYTABLE = "No data available in table";
	public static final String REBUTTAL_PAGE_TITLE = "Rebuttal Billing - Invoice List - EY MMS";
	public static final String REBUTTAL_PAGE_CAR_LIST_TITLE = "Rebuttal Billing - Car List - EY MMS";
	public static final String COMPANY_INFO_PAGE_TITLE = "My Company Information - EY MMS";
	public static final String USER_MANAGER_PAGE_TITLE = "User Manager - EY MMS";
	public static final String C2CA_PAGE_TITLE = "Car To Customer Associations - EY MMS";
	public static final String ADDUSER_PAGE_TITLE = "Add User - EY MMS";
	public static final String EDITUSER_PAGE_TITLE = "Edit User - EY MMS";
	public static final String USERProfile_PAGE_TITLE = "My User Profile - EY MMS";
	public static final String Billing_Contacts_PAGE_TITLE = "Contact List - EY MMS";
	public static final String Maintenace_Responsibility_Groups_Page_Title = "Maintenance Responsibility Groups - EY MMS";
	public static final String ADDGROUP_PAGE_TITLE = "Add Group - EY MMS";
	public static final String EDITGROUP_PAGE_TITLE = "Edit Group - EY MMS";

	// Expected Results for Invoice Review
	public static final String INVOICES_INVOICEREVIEW_PAGETITLE = "Invoice Review - EY MMS";
	public static final String INVOICES_INVOICEREVIEW_DETAILS_PAGETITLE = "Invoice Details: IAIS118531 - EY MMS";
	public static final String INVOICES_INVOICEREVIEW_MARKPAID_ERROR = "Invoice 104087 is already marked paid.";
	public static final String INVOICES_INVOICEREVIEW_UNPAIDINVOICE_PAYMENTSTATUS = "Approved";
	public static final String INVOICES_INVOICEREVIEW_FILTER_INVOICEDETAIL = "104286";

	// Expected Report For Report History
	public static final String REPORTHISTORY_PAGE_TITLE = "Report History - EY MMS";
	public static final String REPORTHISTORY_REPORTDOWNLOAD_POPUP = "Report Download - EY MMS";
	public static final String REPORTHISTORY_FILTER_GRID_DESCRIPTION = "Invoice for vdad33";
	public static final String DATEEXPECTED = "9/15/2016 5:39 PM";
	public static final String DATEUNEXPECTED = "9/15/2050 5:39 PM";

	// Expected Results for Lease Assignment & View Leases
	public static final String LEASES_VIEWLEASE_PAGETITLE = "View Leases - EY MMS";
	public static final String LEASES_VIEWLEASE_LEASEINFORMATION = "Lease Information";
	public static final String LEASES_VIEWLEASE_ADDLEASE_PAGETITLE = "Add Lease - EY MMS";
	public static final String LEASEASSIGNMENT_UNASSIGN_ERROR = "End date for lease assignment for one of the cars you selected is already set";
	public static final String UPLOAD_LEASES_PAGETITLE = "Upload Leases - EY MMS";
	
	// Expected Results for Fleet List Page
	public static final String FLEETLIST_PAGE_TITLE = "Fleet - EY MMS";
	public static final String FLEETLIST_FLEET_SEARCH_RESULT = "AOKRR";;
	public static final String FLEETLIST_DEACTIVATE_ERROR_MSG = "End date for car AOK 013782 is already set";
	public static final String FLEETLIST_DEACTIVATE_NOENDDATE_ERROR_MSG = "Provided end date of 1/1/2007 is before the car start date of 2/1/2007 for car AOK 013792";
	public static final String FLEETLIST_CARHISTORY_PAGE_TITLE = "Car Details: AOK 013782 - EY MMS";
	public static final String FLEETLIST_CARHISTORY_DELETE_INVOICE = "No data available in table";


	public static final String REPAIRDETAIL_PAGE_TITLE = "Repair Detail - EY MMS";
	//Upload Fleet
	public static final String UPLOADFLEET_PAGE_TITLE = "Upload Fleet - EY MMS";
    // Upload DX
	public static final String Upload_dx_page_Title = "Upload DX File - EY MMS";
	
	 //Expected Results for Invoice History
    public static final String INVOICEHISTORY_PAGE_TITLE= "Invoice History - EY MMS";
    public static final String INVOICEHISTORY_VOIDINVOICE_BUTTON ="Void Invoice";
    public static final String INVOICEHISTORY_UNVOIDINVOICE_BUTTON ="Unvoid Invoice";
    public static final String INVOICEHISTORY_VOIDINVOICE_POPUP="Void Invoice";
    public static final String INVOICEHISTORY_VOID_STATUS="Void Status";
    public static final String INVOICEHISTORY_FIRSTOPTIONMSG="I'm correcting this invoice.It has not been processed by Railinc or submitted to anyone and I will be reusing the same invoice number.";
    public static final String INVOICEHISTORY_SECONDOPTIONMSG="I'm resubmitting this invoice. I have already sent it to the Data exchange or my customer and need to submit a revised invoice with the same invoice number.";
    public static final String INVOICEHISTORY_THIRDOPTIONMSG="I'm resubmitting this invoice. I have already sent it to the Data exchange or my customer and need to submit a revised invoice with a new invoice number.";
    public static final String INVOICEHISTORY_VOIDINVOICE_CANCEL="Cancel";
    public static final String INVOICEHISTORY_VOIDINVOICE="Save";
    public static final String INVOICEHISTORY_VOIDSUCCESS_MSG="Invoice # vda4651 voided successfully.";
    public static final String INVOICEHISTORY_VOIDSTATUS_FIRSTOPTION="Voided for correction";
    public static final String INVOICEHISTORY_INVOICE_COMBINEDBILLING_ERROR="Invoice # DEMO123 can't be voided as it is already sent to combined billing. To void it, please use Remove from combined billing button.";
    public static final String INVOICEHISTORY_INVOICENUMBER="DEMO123";
    public static final String INVOICEHISTORY_VOIDSTATUS_THIRDOPTION="Voided For Resubmittal with Same Invoice Number";
    
    //Expected RESULTS for Editable of Invoices
    public static final String BILLING_INVOICNG_CUSTOMER="A005";
    public static final String BILLING_INVOICING_CUSTOMER_AMOUNT="$2,550.85";
    public static final String BILLING_INVOICING_DAILOUGEBOX="Invoice for A005";
    public static final String BILLING_INVOICING_SUCCESS_MSG="SUCCESS";
    public static final String BILLING_EDITEDINVOICE="A2323";
    public static final String BILLING_VOIDSTATUS_FOREDITED_INVOICE="Voided for Correction and corrected";
    public static final String BILLING_INVOICNG_CUSTOMER_FORSECONDOPT="A001";
    public static final String BILLING_INVOICNG_BILLEDPARTY_AMOUNT_FORSECONDOPT="$4,639.56";
    public static final String BILLING_INVOICING_DAILOUGEBOX_FORSECONDOPT="Invoice for A001";
    
    //Expected results for Popup related Unvoifing of Invoice verification for Invoice History Screen
    public static final String POPUP_SINGLE_INVOICE_STATUS_UNVOID_ERROR="Invoice(s) # Automatea1 can't be unvoided as it is not voided";
    public static final String POPUP_MULTIPLE_INVOICE_STATUS_UNVOID_ERROR="Invoice(s) # Automatea1,Automateb1,Automationc1 can't be unvoided as it is not voided";
    public static final String POPUP_COMBINED_INVOICE_STATUS_UNVOID_ERROR="Invoice(s) # Automatea1,Automateb1,Automationc1 can't be unvoided as it is not voided";
    public static final String BILLING_INVOICEHISTORY_333333INVOICE_VOIDSTATUS="";
    
    
       //Exception and rejections page
		public static final String EXCEPTION_REJECTION_PAGETITLE="Exceptions and Rejections - Invoice List - EY MMS";
		public static final String EXCEPTION_REJECTIONS_LINKTXT="Exceptions and Rejections";
		public static final String EXCEPTION_GENERATE_REJECTION_LETTER="Generate Rejection Letter";
		
		
		//Expected Results for Voiding Voided Invoices
		public static final String BILLING_INVOICE_HISTORY_PAGE_TITLE = "Invoice History - EY MMS"; 
		public static final String POP_UP_ERROR_SINGLE_INVOICE_VOID="Invoice(s) # Testaa1 can't be voided as it is already voided";
		public static final String POP_UP_ERROR_MULTIPLE_INVOICE_VOID="Invoice(s) # Testaa1,Testbb1,Testdd1 can't be voided as it is already voided"; 
		public static final String POP_UP_ERROR_COMBI_INVOICE_VOID="Invoice(s) # Testaa1,Testbb1,Testdd1 can't be voided as it is already voided";

}
