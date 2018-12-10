package com.ey.mms.pageobjects.mmsLocators;

public class MMS_CartoCustomerAssocPageLocator {

	// C2CA
	public static final String C2CA_Filter = "xpath_.//*[@id='_FilterActiveCriteria']/div/div/button[1]";// "id_FilterActiveCriteria";
	public static final String ASSOC_CARINITIAL = "id_Association_CarInitial";
	public static final String ASSOC_CARNUMBER = "id_Association_CarNumber_Start";
	public static final String ASSOC_CAREND = "id_Association_CarNumber_End";
	public static final String ASSOC_CUSTOMER = "xpath_.//*[@id='filterCriteriaForm']/fieldset/div[3]/div/div[3]/span[2]/div/div/input[2]";
	public static final String ASSOC_ENABLED = "id_Association_Enabled";
	public static final String ASSOC_SAVE = "id_Save";
	public static final String ASSOC_CANCEL = "id_Cancel";
	public static final String ADD_ASSOCIATION = "xpath_.//*[@id='CarToCompAssocGrid_ButtonGroup']/a";
	public static final String ASSOC_ACTIONS = "xpath_.//*[@id='DataTables_Table_0']/tbody/tr[1]/td[6]/div/button";
	public static final String okdisable = "id_confirm";
	public static final String ActionList1 ="xpath_//table[@id='DataTables_Table_0']/tbody/tr[1]/td[6]/div/ul/li[a[contains(.,'";
	public static final String ActionList2 = "')]]";
	
	// car assoc poup
	public static final String ASSOC_INITIAL = "id_Association_Initial";
	public static final String BEGINRANGE = "id_Association_BeginRangeNumber";
	public static final String ENDRANGE = "id_Association_EndRangeNumber";
	public static final String SAVEPOPUP = "id_Save";
	public static final String CUSTOMER_DROPDOWN = "id_Association_Company";
	public static final String CANCELPOPUP = "id_Cancel";
	public static final String EDIT_C2CATITLE = "xpath_.//*[@id='modal-popup']/div[1]/div/div/h2/span";
	public static final String C2CATITLE = "xpath_.//*[@id='modal-popup']/div[1]/div/div/h2/span";
	public static final String Img_Save = "xpath_(.//*[@id='Save'])[2]";//"xpath_//form[@id='filterCriteriaForm']/fieldset/div[@class='pull-right']/button[@id='Save']";
	public static final String Img_Cancel = "xpath_(.//*[@id='Cancel'])[2]";//"xpath_//form[@id='filterCriteriaForm']/fieldset/div[@class='pull-right']/button[@id='Cancel']";
	public static final String popup_cancel = "xpath_.//*[@id='modal-popup']/div[3]/button[1]";
}
