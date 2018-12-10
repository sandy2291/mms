package com.ey.mms.pageobjects.mmsLocators;

import org.openqa.selenium.By;

public class MMS_HomepageLocator {

	// Locators for Home Page
	public static final String CONFIGURATION_DROPDOWNMENU_LOCATOR = "link_Configuration";
	public static final String UPLOAD_DROPDOWNMENU_LOCATOR = "link_Upload";
	public static final String UPLOAD_DROPMENU_LIST = "xpath_.//*[@id='Nav_Upload']/ul/li/a";
	public static final String HOME_MENU_LOCATOR = "link_Home";
	public static final String BILLING_DROPDOWNMENU_LOCATOR = "link_Billing";
	public static final String FLEETS_SUBMENU_LOCATOR = "xpath_//li[@id='Nav_Configuration']/ul[@class='dropdown-menu']/li/a";
	public static final String FLEETLIST_FLEETSUBMENU_LOCATOR = "xpath_//li[@id='Nav_Configuration']/ul[@class='dropdown-menu']/li[a[contains(text(),'Fleets')]]/ul/li/a";
	public static final String INVOICE_HISTORY_SUBMENU_LOCATOR = "link_Invoice History";
	public static final String INVOICING_SUBMENU_LOCATOR = "link_Invoicing";
	public static final String INVOICE_DROPMENU_LOCATOR = "link_Invoices";
	public static final String INVOICE_DROPMENU_LIST = "xpath_.//*[@id='Nav_Invoices']/ul/li/a";
	public static final String CONFIGURATION_DROPMENU_LIST = "xpath_.//*[@id='Nav_Configuration']/ul/li/a";
	public static final String EXCEPTIONS_SUBMENU_LOCATOR = "xpath_//li[@id='Nav_Invoices']/ul[@class='dropdown-menu']/li/a";
	public static final String COMBINEDBILLING_SUBMENU_LOCATOR = "xpath_//li[@id='Nav_Billing']/ul[@class='dropdown-menu']/li/a";
	public static final String EXCEPTIONS_EXCEPTIONSUBMENU_LOCATOR = "xpath_//li[@id='Nav_Invoices']/ul[@class='dropdown-menu']/li[a[contains(text(),'Exceptions')]]/ul/li/a";
	public static final String COMBINEDBILLING_COMBINEDBILLINGSUBMENU_LOCATOR = "xpath_//li[@id='Nav_Billing']/ul[@class='dropdown-menu']/li[a[contains(text(),'Combined Billing')]]/ul/li/a";
	public static final String SYSTEM_SYSTEMUBMENU_LOCATOR = "xpath_//li[@id='Nav_Configuration']/ul[@class='dropdown-menu']/li[a[contains(text(),'System')]]/ul/li/a";
	public static final String LEASE_SYSTEMUBMENU_LOCATOR = "xpath_//li[@id='Nav_Configuration']/ul[@class='dropdown-menu']/li[a[contains(text(),'Leases')]]/ul/li/a";
	public static final String INVOICES_DROPDOWNMENU_LOCATOR = "xpath_//div[@id='navbar']/ul/li/a[contains(text(),'Invoices')]";
	public static final String INVOICES_REPAIR_DETAILS_SUBMENU = "xpath_//li[@id='Nav_Invoices']/a/following-sibling::ul/li[2]/a[text()='Repair Details']";

	// Locator for View Leases Home Page
	public static final String LEASES_VIEWLEASES_LOCATOR = "xpath_//li[@id='Nav_Configuration']/ul[@class='dropdown-menu']/li[a[contains(text(),'Leases')]]/ul/li/a";

	// Locators for Home Page for Invoice Review
	public static final String INVOICE_DROPDOWN_LOCATOR = "xpath_//li[@id='Nav_Invoices']/a/i";
	public static final String INVOICREVIEW_SUBMENU_LOCATOR = "xpath_//li[@id='Nav_Invoices']/ul/li[1]/a";

	// Locators for Home Page LEASES ASSIGNMENT
	public static final String LEASES_SUBMENU_LOCATOR = "xpath_//li[@id='Nav_Configuration']/ul/li/a";
	public static final String LEASESLIST_LEASEASSIGNMENTSUBMENU_LOCATOR = "xpath_//li[@id='Nav_Configuration']/ul[@class='dropdown-menu']/li[a[contains(text(),'Leases')]]/ul/li/a";
	
	//progress window
	public static final String PROGRESS_WINDOW = "xpath_//*[text()[contains(.,'Processing')]]";
}
