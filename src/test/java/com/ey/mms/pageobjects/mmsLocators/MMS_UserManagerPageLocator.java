package com.ey.mms.pageobjects.mmsLocators;

public class MMS_UserManagerPageLocator {

	// user manager
	public static final String User_Manager_Filter = "xpath_.//*[@id='_FilterActiveCriteria']/div/div/button[1]";
	public static final String Add_User = "link_Add User";
	public static final String Disable_Users = "link_Disable Users";
	public static final String Enable_Users = "link_Enable Users";
	public static final String Actions_userManager = "xpath_.//*[@id='DataTables_Table_0']/tbody/tr[1]/td[8]/div/button";
	public static final String divison = "div/button";
	public static final String actionlist1 = "div/ul/li[a[contains(.,'";
	public static final String actionlist2 = "')]]";
	// filter
	public static final String FilterUserName = "id_UserManager_Username";
	public static final String FilterRoles_DROPDOWN = "id_UserManager_Roles";
	public static final String FilterApprovalTiers_DROPDOWN = "id_UserManager_ApprovalTier";
	public static final String FilterEnabled_DROPDOWN = "id_UserManager_Enabled";
	public static final String FilterSave = "id_Save";
	public static final String FilterCancel = "id_Cancel";
	public static final String CANCEL_EDITUSER = "xpath_.//*[@id='saveUserForm']/section/div/div/button[1]";
}
