package com.ey.mms.pageobjects.mmsLocators;

public class MMS_CarConfigurationPageLocator {

	// C2CA
	public static final String CarConfiguration_LOCATOR = "xpath_.//*[@id='Nav_Configuration']/ul/li[3]/a";
	public static final String CarDetailsFieldsTab_LOCATOR = "id_tab-selectbyid1";
	public static final String CarDetailsFieldsGrid_LOCATOR = "id_gridSection";
	
	/*public static final String CarConfiguration_LOCATOR = "xpath_.//*[@id='Nav_Configuration']/ul/li[3]/a";
	public static final String CarDetailsFieldsTab_LOCATOR = "id_tab-selectbyid1";
	public static final String CarDetailsFieldsGrid_LOCATOR = "xpath_.//*[@id='gridSection']/div";*/
	
	public static final String CARCONFIGUARTION_SUBMENU = "xpath_//a[text()='Car configuration']";
	public static final String DEFINECUSTOM_TAB = "id_tab-selectbyid3";
	public static final String FLEETGRIDFIELD_TAB="id_tab-selectbyid2";
	public static final String CARCONFIGUARTION_PAGETITLE="xpath_//h1[Contains(text(),'Car Configuration')]";
	public static final String ADD_BUTTON="id_btnAddNew";
	public static final String EDIT_BUTTON="id_btnEdit";
	public static final String DELETE_BUTTON="id_btnDelete";
	//public static final String DEFINECUSTOMFIELD_NODATA="xpath_//div[Contains(text(),'Please Add Custom Fields')]";
	public static final String DEFINECUSTOMFIELD_NODATA="xpath_//div[@id='defineGridSection']/div/div[2]/div";
	public static final String CUSTOM_CHECKBOX="xpath_//div[@id='defineGridSection']/div/div[1]/div[1]/input";
	public static final String SEARCH_FIELDNAME="id_searchCustomFields";
	public static final String SEARCH_DATATYPE="id_searchDataType";
	public static final String CARDETAILFIELDS_TAB="id_tab-selectbyid1";
	public static final String CARDETAILS_CHECKBOX="xpath_//div[@id='gridSection']/div/div/div[1]/input";
	public static final String CARKIND_HEADER="xpath_//div[text()='car kind']";
	public static final String SELECTEDFIELD_HEADER="xpath_//div[text()='selected fields']";
	public static final String PAGINATION_DROPDOWN="xpath_//div[@id='tab-selectbyid3-panel']/app-define/div/div[3]/div[1]/label/select";
	public static final String DATATYPE_DEFINECUSTOMFIELD="id_field-data-type";
	public static final String FIELDNAME_DEFINECUSTOMFIELD="xpath_//div[@id='defineGridSection']/div/div[2]/div[1]/div[2]/input";
    public static final String SAVE_DEFINECUSTOMFIELD="xpath_.//*[@id='btnSave']";
	//public static final String SAVE_DEFINECUSTOMFIELD="xpath_//button[@id='btnSave']";
    public static final String CANCEL_DEFINECUSTOMFIELD="id_btnEdit";
    public static final String ACTIVITYSUMMARYPANNEL_DEFINECUSTOMFIELD="xpath_.//*[@id='accordion']/li[1]/div[2]";
    public static final String DEFINECUSTOMFIELD_NOTIFICATION_LOCATOR="id_activity-icon";
    public static final String RECORDSIN_DEFINECUSTOMFIELD="xpath_//div[@id='defineGridSection']/div/div[2]";
    public static final String CHECKBOXAVAILBLE_FOREACHRECORDINTHEGRID="xpath_//div[@id='defineGridSection']/div/div[2]/div/div/input";
    public static final String ERRORMSG_FOR_DUPLICATE_CUSTOMFIELD="xpath_//h5[text()='This field name already exists. Please use a different name.']";
	public static final String POPUP_OK_BUTTON="xpath_//button[text()='OK']";
	public static final String CUSTOMFIELD_CROSS_BUTTON="xpath_//div[@id='defineGridSection']/div/div[2]/div[1]/div[3]/div[2]/i";
	public static final String POPUP_CANCEL_BUTTON="xpath_html/body/ngb-modal-window/div/div/div[3]/div/button[1]";
	public static final String ERRORMSG_FOR_DELETE_CUSTOMFIELD="xpath_//h5[text()='Are you sure to delete this/these item ? This/These will be removed from the system .']";
	public static final String ERRORMSG_FOR_TWO_OPERATION_AT_SAME_TIMNE="xpath_//h5[text()='Only one operation is allowed at a time. Please complete/cancel this Add operation']";
	public static final String CUSTOMFIELD_FIRSTCHECKBOX="xpath_//div[@id='defineGridSection']/div/div[2]/div[1]/div[1]/input";
	public static final String CUSTOMFIELD_EDITBOX="xpath_//div[@id='defineGridSection']/div/div[2]/div/div[2]/input";
	
	
	//---------------------Fleet List Tab---------------------
	
	
	public static final String CarDetailsFieldsAboveGrid_LOCATOR = "xpath_.//*[@id='gridSection']/parent::div/div[1]";
	public static final String Carconfigurationgridcheckbox_LOCATOR = "xpath_.//*[@id='gridSection']/div/div/div[1]/input";
	public static final String CarconfigurationgridCarKind_LOCATOR = "xpath_.//*[@id='gridSection']/div/div/div[2]";
	public static final String Carconfigurationgridfields_LOCATOR = "xpath_.//*[@id='gridSection']/div/div/div[3]";
	public static final String CarconfigurationAddbutton_LOCATOR = "id_btnAddNew";
	public static final String CarconfigurationEditbutton_LOCATOR = "id_btnEdit";
	public static final String CarconfigurationDeletebutton_LOCATOR = "id_btnDelete";
	public static final String CarconfigurationFleetGridFields_LOCATOR = "xpath_.//a[@id='tab-selectbyid2']";
	public static final String CarconfigurationCarDetailsFields_LOCATOR = "id_tab-selectbyid1";
	public static final String SelectAllFieldCheckbox_LOCATOR = "xpath_//*[@id='tab-selectbyid2-panel']/app-select/div/div/div[2]/div/ul[1]/li[1]/label/input";
	public static final String FleetGridFieldsCategories_LOCATOR = "xpath_.//span[contains(text(),'Categories')]/parent::div/div";
	public static final String FleetGridFieldsSelectedFields_LOCATOR = "xpath_.//span[contains(text(),'Selected Fields')]/parent::div/following-sibling::div[1]";
	public static final String FleetGridFieldsAddSelectedbutton_LOCATOR = "xpath_.//button[contains(text(),'Add Selected')]";
	public static final String FleetGridFieldsResetbutton_LOCATOR = "xpath_.//button[contains(text(),'Reset')]";
	public static final String Savebutton_LOCATOR = "id_btnSave";
	public static final String Cancelbutton_LOCATOR = "id_btnCancel";
	public static final String FleetGridFieldsOtherCategories_LOCATOR = "xpath_.//*[contains(text(),'Others')]";
	public static final String FleetGridFieldsOtherCategoriesCustomField1_LOCATOR = "xpath_.//*[@id='tab-selectbyid2-panel']/app-select/div/div/div[2]/div/ul[1]/li[2]";
	public static final String FleetGridFieldsOtherCategoriesCustomField2_LOCATOR = "xpath_.//*[@id='tab-selectbyid2-panel']/app-select/div/div/div[2]/div/ul[1]/li[3]/label";
	public static final String FleetGridFieldsOtherCategoriesCustomField3_LOCATOR = "xpath_.//*[@id='tab-selectbyid2-panel']/app-select/div/div/div[2]/div/ul[1]/li[4]/label";
	public static final String SelectAllCheckbox_LOCATOR = "xpath_.//*[@id='tab-selectbyid2-panel']/app-select/div/div/div[2]/div/ul[1]/li[1]/label/input";
	public static final String FleetGridFieldsAddSelectedButton_LOCATOR = "xpath_.//*[contains(text(),'Add Selected')]";
	public static final String FleetGridFieldsSelectedFieldsCustomField1_LOCATOR = "xpath_.//*[@id='tab-selectbyid2-panel']/app-select/div/div/div[4]/div/div[2]/ul/li[1]/div[1]/span[1]";
	public static final String FleetGridFieldsSelectedFieldsCustomField2_LOCATOR = "xpath_.//*[@id='tab-selectbyid2-panel']/app-select/div/div/div[4]/div/div[2]/ul/li[2]/div[1]/span[1]";
	public static final String ReorderIcon_LOCATOR = "xpath_.//*[@id='tab-selectbyid2-panel']/app-select/div/div/div[4]/div/div[2]/ul/li[2]/div[1]/span[2]/i";
	public static final String CancelIcon_LOCATOR = "xpath_.//*[@id='tab-selectbyid2-panel']/app-select/div/div/div[4]/div/div[2]/ul/li[1]/div[2]/span/i";
	public static final String NODATAGRID_LOCATOR = "xpath_.//*[@id='gridSection']/div/div[2]/div";
	public static final String NOFIELDSUNDERCATEGORY_LOCATOR = "xpath_.//*[contains(text(),'Currently No Available Fields For Selected Category')]";
	public static final String CarKindLabel_LOCATOR = "xpath_.//*[contains(text(),'Car Kind')]";
	public static final String CarKindDropdown_LOCATOR = "id_carKind";
	public static final String CarDetailsFieldsOtherCategoriesCustomField1_LOCATOR = "xpath_.//*[@id='selectRegion']/div/app-select/div/div[2]/div[2]/div/ul[1]/li[2]/label";
	public static final String CarDetailsFieldsOtherCategoriesCustomField2_LOCATOR = "xpath_.//*[@id='selectRegion']/div/app-select/div/div[2]/div[2]/div/ul[1]/li[3]/label";
	public static final String CarDetailsFieldsOtherCategoriesCustomField3_LOCATOR = "xpath_.//*[@id='selectRegion']/div/app-select/div/div[2]/div[2]/div/ul[1]/li[4]/label";
	public static final String CarDetailsFieldsSelectAllCheckbox_LOCATOR = "xpath_.//*[@id='selectRegion']/div/app-select/div/div[2]/div[2]/div/ul[1]/li[1]/label/input";
	public static final String CarDetailsFieldsReorderIcon_LOCATOR = "xpath_.//*[@id='selectRegion']/div/app-select/div/div[2]/div[4]/div/div[2]/ul/li/div[1]/span[2]/i";
	public static final String CarDetailsFieldsCancelIcon_LOCATOR = "xpath_.//*[@id='selectRegion']/div/app-select/div/div[2]/div[4]/div/div[2]/ul/li/div[2]/span/i";
	public static final String CarDetailsFieldsSelectedFieldsCustomField1_LOCATOR = "xpath_.//*[@id='selectRegion']/div/app-select/div/div[2]/div[4]/div/div[2]/ul/li[1]/div[1]/span[1]";
	public static final String CarDetailsFieldsSelectedFieldsCustomField2_LOCATOR = "xpath_.//*[@id='selectRegion']/div/app-select/div/div[2]/div[4]/div/div[2]/ul/li[2]/div[1]/span[1]";
	public static final String CarDetailsFieldsCarKindRowInGrid_LOCATOR = "xpath_.//*[@id='gridSection']/div/div[2]";
	public static final String CarDetailsFieldsCarKindValueInGrid_LOCATOR = "xpath_.//*[@id='gridSection']/div/div[2]/div[2]";
	public static final String CarDetailsFieldsSelectedFieldsValueInGrid_LOCATOR = "xpath_.//*[@id='gridSection']/div/div[2]/div[3]";
	public static final String CarDetailsFieldsCarKindAlertMessage_LOCATOR = "xpath_.//*[contains(text(),'Please Select Car Kind')]";
	public static final String CarKindcheckbox_LOCATOR = "xpath_.//div[contains(text(),'Box')]/preceding-sibling::div/input";
	public static final String CarDetailsFieldsDeleteAlertMessage_LOCATOR = "xpath_.//*[contains(text(),'Are you sure to delete this item')]";
	public static final String PopupOKButton_LOCATOR = "xpath_//button[@class='btn btn-primary' and contains(text(),'OK')]";
	public static final String PopupCancelButton_LOCATOR = "xpath_//button[@class='btn btn-primary cncl-btn' and contains(text(),'Cancel')]";

	
	
	}
