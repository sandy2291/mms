package com.ey.mms.pageobjects.mmsLocators;

public class MMS_FleetListPageLocator {

	// Locators for Fleet List Page
	public static final String FLEET_BUTTON_LOCATOR = "xpath_//button[contains(text(),'Filter')]";
	public static final String FLEET_CARINITIAL_INPUTBOX_LOCATOR = "id_Car_Initial";
	public static final String FLEET_FILTER_SAVE_BUTTON_LOCATOR = "id_Save";
	public static final String FLEET_FILTER_RESULTS_LIST_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td";
	public static final String FLEET_FILTER_RESULTS_CARINTIAL_LIST_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[2]";

	// Locators for Fleet List Page

	public static final String FLEET_FILTER_BUTTON_LOCATOR = "xpath_//button[text()='Filter']";
	public static final String FLEET_CAR_INITIAL_CHECKBOX_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr[1]/td[1]/input";
	public static final String FLEET_ACTION_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[8]/div/button";
	public static final String FLEET_ACTION_FILTER_DELETEINVOICE_VERIFY_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td";
	public static final String FLEET_ACTION_DELETEINVOICE_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr[3]/td[8]/div/button";
	public static final String FLEET_ACTION_DETAILS_DELETEINVOICE_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr[3]/td[8]/div/ul/li/a";
	public static final String FLEET_CHECKBOX_DELETEINVOICE_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[text()='000472']";
	public static final String FLEET_ACTION_DETAILS_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[8]/div/ul/li/a";
	public static final String FLEET_CARHISTORY_ACTION_LOCATOR = "xpath_//tbody/tr/td[5]/div/button";
	public static final String FLEET_CARHISTORY_ACTION_EDIT_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[5]/div/ul/li[1]/a";
	public static final String FLEET_EDITHISTORY_INITIAL_INPUT_LOCATOR = "id_Initial";// "xpath_//input[@id='Initial']";
	public static final String FLEET_CAR_INITIAL_CLOSE_LOCATOR = "xpath_//div[@id='_FilterActiveCriteria']/div/div/a[2]/i";
	public static final String FLEET_CARHISTORY_EDITHISTORY_ENDDATE_LOCATOR = "id_EndDate";// "xpath_//input[@id='EndDate']";
	public static final String FLEET_CARHISTORY_ACTION_DELETE_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[5]/div/ul/li[2]/a";
	public static final String FLEET_DEACTIVATE_BUTTON_LOCATOR = "xpath_//div[@id='FleetListGrid_ButtonGroup']/a[1]";
	public static final String FLEET_DEACTIVATE_SAVE_BUTTON_LOCATOR = "id_Save";// "xpath_//button[@id='Save']";
	public static final String FLEET_DEACTIVATE_ENDDATE_INPUTFIELD_LOCATOR = "xpath_//div[@id='EndDate_wrapper']/input[@id='EndDate']";
	public static final String FLEET_DEACTIVATE_ERROR_MSG_LOCATOR = "xpath_//div[@id='DeactivateCars']/div/ul/li";
	public static final String FLEET_DEACTIVATE_NOEND_CHECKBOX_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr[4]/td[1]/input";
	public static final String FLEET_DEACTIVATE_NOENDDATE_ERROR_LOCATOR = "xpath_//div[@id='DeactivateCars']/div[1]/ul/li";

	public static final String Invoice_DELETE_CONFIRM = "src/test/resources/images/FleetListInvoiceDeleteOK.PNG";
	public static final String FleetlistDeactivateSave = "src/test/resources/images/FleetlistDeactivateSave.PNG";
	public static final String CancelActionDelete = "src/test/resources/images/CancelActionDelete.PNG";
	
	public static final String Confirm_Delete = "id_confirm";
	public static final String Deactivate_Save_Button = "xpath_(.//*[@id='Save'])[2]";
	public static final String Deactivate_Cancel_Button = "xpath_(.//*[@id='Cancel'])[2]";
}
