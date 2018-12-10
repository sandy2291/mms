package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;

import org.hamcrest.MatcherAssert;
import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.MMS_UploadDXPageLocator;
import com.ey.mms.util.EY_FW_Utility;

import net.serenitybdd.core.pages.PageObject;

public class UploadDXFilePage extends PageObject {

	/*
	 * public void verifyUploadDXPageTitle(){ System.out.println(
	 * "[MMS_UploadDXPage : verifyUploadDXPageTitle] Verifying Invoice History Page title as "
	 * + MMS_ExpectedResult.Upload_dx_page_Title);
	 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.Upload_dx_page_Title));
	 * 
	 * }
	 */
	public void clickRefresh() {
		try {

			EY_FW_Utility.findElementByLocator(MMS_UploadDXPageLocator.REFRESH_DX).click();
			EY_FW_Utility.doWait(5000);
		} catch (Exception e) {

			Assert.assertTrue(false, e.getMessage());
		}
	}
}
