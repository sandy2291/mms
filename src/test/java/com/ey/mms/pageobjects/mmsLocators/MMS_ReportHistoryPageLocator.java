package com.ey.mms.pageobjects.mmsLocators;

public class MMS_ReportHistoryPageLocator {

	// Locators for Report History
	public static final String REPORTHISTORY_MENUBAR_LOCATOR = "link_Report History";// "xpath_//li[@id='Nav_ReportHistory']/a";
	public static final String REPORTHISTORY_PAGETITLE_LOCATOR = "xpath_//div[@id='notification-main']/div[2]/div/div[1]/h1";
	public static final String REPORTHISTORY_ACTION_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr[1]/td[4]/div/button";
	public static final String REPORTHISTORY_ACTION_DOWNLOAD_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr[1]/td[4]/div/ul/li/a";
	public static final String REPORTHISTORY_REPORTDOWNLOAD_POPUP_LOCATOR = "xpath_//div[@id='modal-popup']/div[1]/div/div/h2/span";
	public static final String REPORTHISTORY_REPORTDOWLOAD_ACTION_LOCATOR = "xpath_//table[@id='DataTables_Table_1']/tbody/tr[1]/td[3]/div/button";
	public static final String REPORTHISTORY_REPORTDOWNLOAD_ACTION_DOWNLOAD_LOCATOR = "xpath_//table[@id='DataTables_Table_1']/tbody/tr[1]/td[3]/div/ul/li/a";
	public static final String REPORTHISTORY_FILTER_LOCATOR = "xpath_//div[@id='_FilterActiveCriteria']/div/div/button[1]";
	public static final String REPORTHISTORY_FILTER_CREATEDATE_LOCATOR = "id_ReportFilter_CreateDate_StartDate";// "xpath_//input[@id='ReportFilter_CreateDate_StartDate']";
	public static final String REPORTHISTORY_FILTER_ENDDATE_LOCATOR = "id_ReportFilter_CreateDate_EndDate";// "xpath_//input[@id='ReportFilter_CreateDate_EndDate']";
	public static final String REPORTHISTORY_FILTER_SAVE_LOCATOR = "xpath_//button[text()='Save']";
	public static final String REPORTHISTORY_FILTER_GRID_DESCRIPTION_LOCATOR = "xpath_//table[@id='DataTables_Table_0']/tbody/tr[2]/td[3][text()='Invoice for vdad33']";

	public static final String ReportHistoryDownloadOk = "src/test/resources/images/ReportHistoryDownloadOk.PNG";
	public static final String ReportHistorySave = "src/test/resources/images/ReportHistorySave.PNG";
	public static final String ReportHistoryFilterCancel = "src/test/resources/images/ReportHistoryFilterCancel.PNG";
	public static final String ReportDownloadClose = "src/test/resources/images/ReportHistoryFilterCancel.PNG";
	
	public static final String ReportClose = "id_Close";
	public static final String FILTERSAVE = "id_Save";
	public static final String FILTERCANCEL = "id_Cancel";
}
