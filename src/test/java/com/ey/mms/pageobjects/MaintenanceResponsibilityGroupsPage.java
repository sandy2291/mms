package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.MMS_MaintResGroupsPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_UserManagerPageLocator;
import com.ey.mms.util.EY_FW_Utility;

import net.serenitybdd.core.pages.PageObject;

public class MaintenanceResponsibilityGroupsPage extends PageObject {

	private Logger APP_LOGS = null;

	private Logger setLogger() {
		if (APP_LOGS == null)
			APP_LOGS = LogManager.getLogger(MaintenanceResponsibilityGroupsPage.class.getName());
		return APP_LOGS;
	}

	/*
	 * public void verifyMaintenanceResponsibilityGroupPageTitle() { try {
	 * setLogger()
	 * .info("[MMS_Maintenance_Responsibility_Groups : verifyMaintenanceResponsibilityGroupPageTitle] Verifying Maintenace responsibility group title as "
	 * + MMS_ExpectedResult.Maintenace_Responsibility_Groups_Page_Title);
	 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.Maintenace_Responsibility_Groups_Page_Title));
	 * } catch (Exception e) { setLogger()
	 * .error("[MMS_Maintenance_Responsibility_Groups : verifyMaintenanceResponsibilityGroupPageTitle] Exception thrown -- "
	 * + EY_FW_Utility.getStackTrace(e)); Assert.assertTrue(false,
	 * e.getMessage()); } }
	 */

	public void enterFilterGroupName(String groupName) {
		try {
			setLogger().info("[MMS_Maintenance_Responsibility_Groups : enterfilterGroupName]");
			EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.MRG_NAME).clear();
			EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.MRG_NAME).sendKeys(groupName);
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : enterfilterGroupName] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickAddGroup() {
		try {
			setLogger().info("[MMS_Maintenance_Responsibility_Groups : clickAddGroup ]");
			EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.AddGroup).click();
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : clickAddGroup ] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickFilter() {
		try {
			setLogger().info("[MMS_Maintenance_Responsibility_Groups : clickFilter ]");
			EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.MRG_FILTER).click();
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : clickFilter ] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterName(String name) {
		try {
			setLogger().info("[MMS_Maintenance_Responsibility_Groups : enterName ]");
			EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.MRG_NAME).clear();
			EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.MRG_NAME).sendKeys(name);
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : enterName ] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectEnable(String enable) {
		try {
			setLogger().info("[MMS_Maintenance_Responsibility_Groups : selectEnable ]");
			WebElement enabled = EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.MRG_ENABLED);
			Select dropdown = new Select(enabled);
			dropdown.selectByVisibleText(enable);
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : selectEnable ] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void saveFilter() {
		try {
			setLogger().info("[MMS_Maintenance_Responsibility_Groups : saveFilter ]");
			EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.MRG_SAVE).click();
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : saveFilter ] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void cancelFilter() {
		try {
			setLogger().info("[MMS_Maintenance_Responsibility_Groups : cancelFilter ]");
			EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.MRG_CANCEl).click();
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : cancelFilter ] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	int rowno = 0;

	public void clickActions(String actions) {
		try {
			setLogger().info("[MMS_Maintenance_Responsibility_Groups : clickActions ]");
			rowno = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 1, actions);
			EY_FW_Utility.clickMMSActions(MMS_MyCompanyInfoPageLocator.contacttable, MMS_UserManagerPageLocator.divison,
					rowno, 4);
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : clickActions ] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickActionList(String actionList) {
		try {
			EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
			setLogger().info("[MMS_Maintenance_Responsibility_Groups : clickActionList ]");
			EY_FW_Utility.clickMMSActionList(MMS_MyCompanyInfoPageLocator.contacttable,
					MMS_UserManagerPageLocator.actionlist1, MMS_UserManagerPageLocator.actionlist2, rowno, 4, actionList);
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : clickActionList ] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void verifyEnabledColumText(String s1,String s2){ setLogger().
	 * info("[MMS_Maintenance_Responsibility_Groups : clickActions ]"); rowno =
	 * EY_FW_Utility.getRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 1,
	 * s2);
	 * assertThat(EY_FW_Utility.getTextofField(MMS_MyCompanyInfoPageLocator.
	 * contacttable, rowno,3), equalTo(s1)); }
	 */

	public void confirmPopup() {
		try {
			setLogger().info("[MMS_Maintenance_Responsibility_Groups : confirmpopup]");
			EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.confirm_popup).click();
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : confirmpopup] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void cancelPopup() {
		try {
			setLogger().info("[MMS_Maintenance_Responsibility_Groups : cancelpopup]");
			EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.cancelpopup).click();
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : cancelpopup] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

}
