package com.ey.mms.pageobjects.mmsLocators;

public class MMS_LeaseAssignmentPageLocator {

	// Locators for Lease Assignment Page
	public static final String UPLOADCSV_BUTTON_LOCATOR = "xpath_//div[@id='Lease_Assignment_ButtonGroup']/a[1]";
	public static final String UPLOADFILE_BUTTON_LOCATOR = "xpath_//form[@id='LeaseUploader']/span[@id='LeaseUploader_wrapper']/input[@id='attachments']";
	public static final String UPLOAD_PROGRESSBAR_LOCATOR = "xpath_//div[@id='progressWrapper']/div[@id='progressText']";
	public static final String LEASE_UPLOAD_STATUS_LOCATOR = "xpath_//tbody/tr[1]/td[2]";
	public static final String FILTER_BUTTON_LOCATOR = "xpath_//button[text()='Filter']";
	public static final String CAR_INITIAL_EDITBOX_LOCATOR = "id_LeaseAssignment_CarInitial";// "xpath_//input[@id='LeaseAssignment_CarInitial']";
	public static final String CAR_NUMBERFROM_EDITBOX_LOCATOR = "id_LeaseAssignment_CarNumber_Start";// "xpath_//input[@id='LeaseAssignment_CarNumber_Start']";
	public static final String CAR_NUMBERTO_EDITBOX_LOCATOR = "id_LeaseAssignment_CarNumber_End";// "xpath_//input[@id='LeaseAssignment_CarNumber_End']";
	public static final String LEASE_SAVE_BUTTON_LOCATOR = "id_Save";// "xpath_//button[@id='Save']";
	public static final String CAR_LOADED_LOCATOR = "xpath_//div[@id='DataTables_Table_0_wrapper']/table[@id='DataTables_Table_0']/tbody/tr/td/following-sibling::td[1]";
	public static final String CAR_INITIAL_CHECKBOX_LOCATOR = "xpath_//table[@data-table-name='Lease Assignment']/tbody/tr[1][td[3][contains(text(),'000470')]]/td[1]";
	public static final String UNASSIGN_BUTTON_LOCATOR = "xpath_//div[@id='Lease_Assignment_ButtonGroup']/a[2]";
	public static final String UNASSIGN_SAVE_BUTTON_LOCATOR = "xpath_//button[text()='Save']";
	public static final String UNASSIGN_ERROR_TEXT_LOCATOR = "xpath_//div[@id='modal-popup']/div[2]/div[@id='UnassignCars']/div[@class='validation-summary-errors']/ul";
	public static final String UNASSIGN_CANCEL_BUTTON_LOCATOR = "id_//Cancel";
	public static final String UNASSIGN_ENDDATE_EDITBOX_LOCATOR = "id_EndDate";// "xpath_//input[@id='EndDate']";
	public static final String ACTION_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[span[text()='Complete']]/following-sibling::td[4]";
	public static final String VIEWLOG_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[span[text()='Complete']]/following-sibling::td[4]/div/ul/li[1]/a";
	public static final String DELETE_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr/td[span[text()='Complete']]/following-sibling::td[4]/div/ul/li[2]/a";
	public static final String TEXT_TABLE_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/thead/tr/th[5]";
	public static final String LEASES_CAR_INITIAL_CLOSE_LOCATOR = "xpath_//div[@id='_FilterActiveCriteria']/div/div/a[2]/i";
	public static final String LEASES_CAR_NUMBER_CLOSE_LOCATOR = "xpath_//div[@id='_FilterActiveCriteria']/div/div/a[4]/i";

	public static final String UploadButton = "src/test/resources/images/UploadButton.PNG";
	public static final String SaveButton = "src/test/resources/images/SaveButton.PNG";
	public static final String CancelButton = "src/test/resources/images/CancelButton.PNG";
	public static final String UPLOAD_BUTTON = "id_attachments";
	public static final String Unassign_Save = "xpath_(.//*[@id='Save'])[2]";
	public static final String Unassign_Cancel = "xpath_(.//*[@id='Cancel'])[2]";
}
