package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;

import org.hamcrest.MatcherAssert;

import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_UploadLeasePageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_UserManagerPageLocator;
import com.ey.mms.util.EY_FW_Utility;

import net.serenitybdd.core.pages.PageObject;

public class UploadLeasesPage extends PageObject {

	/*
	 * public void verifyUploadLeasePageTItle(){ System.out.
	 * println("[MMS_Upload_LeasesPage : verifyUploadLeasePageTItle] Verifying Upload Leases Page Title as "
	 * + MMS_ExpectedResult.LEASES_VIEWLEASE_PAGETITLE);
	 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.UPLOAD_LEASES_PAGETITLE));
	 * //EY_FW_Utility.doWait(2000); }
	 */

	public void clickActionsFirstRow() {
		EY_FW_Utility.findElementByLocator(MMS_UploadLeasePageLocator.FIRST_ROW_ACTION).click();
		EY_FW_Utility.doWait(2000);
	}

	public void clickActionList(String actionList) {
		EY_FW_Utility.clickMMSActionList(MMS_MyCompanyInfoPageLocator.contacttable, MMS_UserManagerPageLocator.actionlist1,
				MMS_UserManagerPageLocator.actionlist2, 1, 6, actionList);
	}
}
