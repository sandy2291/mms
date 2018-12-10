package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.containsString;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.MMS_MaintResGroupsPageLocator;
import com.ey.mms.util.EY_FW_Utility;

import net.serenitybdd.core.pages.PageObject;
import static org.junit.Assert.assertEquals;

public class AddGroupPage extends PageObject {
	public static int lineCount = 0;
	private Logger APP_LOGS = null;

	private Logger setLogger() {
		if (APP_LOGS == null)
			APP_LOGS = LogManager.getLogger(MaintenanceResponsibilityGroupsPage.class.getName());
		return APP_LOGS;
	}

	/*
	 * public void verifyEditGroupPageTitle() { try { setLogger()
	 * .info("[MMS_Maintenance_Responsibility_Groups : verifyEditGroupPageTitle] Verifying Maintenace responsibility group title as "
	 * + MMS_ExpectedResult.EDITGROUP_PAGE_TITLE);
	 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.EDITGROUP_PAGE_TITLE)); } catch (Exception e)
	 * { setLogger().
	 * error("[MMS_Maintenance_Responsibility_Groups : verifyEditGroupPageTitle] Exception thrown -- "
	 * + EY_FW_Utility.getStackTrace(e)); Assert.assertTrue(false,
	 * e.getMessage()); } }
	 */

	/*
	 * public void verifyAddGroupPageTitle() { try { setLogger()
	 * .info("[MMS_Maintenance_Responsibility_Groups : verifyAddGroupPageTitle] Verifying Maintenace responsibility group title as "
	 * + MMS_ExpectedResult.ADDGROUP_PAGE_TITLE);
	 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.ADDGROUP_PAGE_TITLE)); } catch (Exception e) {
	 * setLogger().
	 * error("[MMS_Maintenance_Responsibility_Groups : verifyAddGroupPageTitle] Exception thrown -- "
	 * + EY_FW_Utility.getStackTrace(e)); Assert.assertTrue(false,
	 * e.getMessage()); } }
	 */

	public void enterGroupName(String groupName) {
		try {
			setLogger().info("[MMS_Maintenance_Responsibility_Groups : enterGroupName]");
			EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.AddGroup_Name).clear();
			EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.AddGroup_Name).sendKeys(groupName);
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : enterGroupName] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterGroupDesc(String description) {
		try {
			setLogger().info("[MMS_Maintenance_Responsibility_Groups : enterGroupName] ");
			EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.AddGroup_Desc).clear();
			EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.AddGroup_Desc).sendKeys(description);
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : enterGroupName] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectJobcodes(String jobCode) {
		try {

			setLogger().info("[MMS_Maintenance_Responsibility_Groups : selectJobcodes ]");
			WebElement enabled = EY_FW_Utility.findElementByLocator("xpath_"
					+ MMS_MaintResGroupsPageLocator.jobcodes_part1 + lineCount + MMS_MaintResGroupsPageLocator.jobcodes_part2);
			Select dropdown = new Select(enabled);
			dropdown.selectByVisibleText(jobCode);
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : selectJobcodes ] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectQC(String selectQC) {
		try {

			setLogger().info("[MMS_Maintenance_Responsibility_Groups : selectQC ]");
			WebElement enabled = EY_FW_Utility
					.findElementByLocator("xpath_" + MMS_MaintResGroupsPageLocator.jobcodes_part1 + lineCount
							+ MMS_MaintResGroupsPageLocator.qualifiercode_part2);
			Select dropdown = new Select(enabled);
			dropdown.selectByVisibleText(selectQC);
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : selectQC ] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectWMC(String whyMadeCode) {
		try {

			setLogger().info("[MMS_Maintenance_Responsibility_Groups : selectWMC ]");
			WebElement enabled = EY_FW_Utility.findElementByLocator("xpath_"
					+ MMS_MaintResGroupsPageLocator.jobcodes_part1 + lineCount + MMS_MaintResGroupsPageLocator.WMC_part2);
			Select dropdown = new Select(enabled);
			dropdown.selectByVisibleText(whyMadeCode);
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : selectWMC ] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickAddnewLine() {
		try {
			setLogger().info("MMS_Maintenance_Responsibility_Groups : clickAddnewLine");
			EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.Add_NewLine).click();
			lineCount++;
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : clickAddnewLine ] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickDeleteIcon() {
		try {
			setLogger().info("MMS_Maintenance_Responsibility_Groups : clickDeleteIcon");
			EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.DELETE_ICON).click();
			lineCount--;
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : clickDeleteIcon ] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void iseditable(String locator1, int rNo, String locator2) {
		try {
			setLogger().info("MMS_Maintenance_Responsibility_Groups : iseditable");
			WebElement e = EY_FW_Utility.findElementByLocator(locator1 + rNo + locator2);
			String readonly = e.getAttribute("readonly");
			Assert.assertNull(readonly);
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : iseditable ] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void isNoteditable(String locator1, int rNo, String locator2) {
		try {
			setLogger().info("MMS_Maintenance_Responsibility_Groups : isNoteditable");
			WebElement e = EY_FW_Utility.findElementByLocator(locator1 + rNo + locator2);
			String readonly = e.getAttribute("readonly");
			Assert.assertNotNull(readonly);
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : isNoteditable ] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickCancelGroup() {
		try {
			EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.CancelGroup).click();
			setLogger().info("MMS_Maintenance_Responsibility_Groups : clickCancelGroup");
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : clickCancelGroup ] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickSaveGroup() {
		try {
			EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.SaveGroup).click();
			setLogger().info("MMS_Maintenance_Responsibility_Groups : clickSaveGroup");
			EY_FW_Utility.doWait(2000);
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : clickSaveGroup ] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void verifyColor(String s) { String color =
	 * EY_FW_Utility.getAnyElementByAnyLocator(s).getCssValue("color");
	 * 
	 * String[] hexValue = color.replace("rgba(", "").replace(")",
	 * "").split(",");
	 * 
	 * int hexValue1 = Integer.parseInt(hexValue[0]); hexValue[1] =
	 * hexValue[1].trim(); int hexValue2 = Integer.parseInt(hexValue[1]);
	 * hexValue[2] = hexValue[2].trim(); int hexValue3 =
	 * Integer.parseInt(hexValue[2]); String actualColor =
	 * String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
	 * System.out.println("actual color is " + actualColor);
	 * Assert.assertEquals("#ff0000", actualColor); }
	 */

	/*
	 * public void verifyLightRedColor(String s) { String color =
	 * EY_FW_Utility.getAnyElementByAnyLocator(s).getCssValue("color");
	 * 
	 * String[] hexValue = color.replace("rgba(", "").replace(")",
	 * "").split(",");
	 * 
	 * int hexValue1 = Integer.parseInt(hexValue[0]); hexValue[1] =
	 * hexValue[1].trim(); int hexValue2 = Integer.parseInt(hexValue[1]);
	 * hexValue[2] = hexValue[2].trim(); int hexValue3 =
	 * Integer.parseInt(hexValue[2]); String actualColor =
	 * String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
	 * System.out.println("actual color is " + actualColor);
	 * Assert.assertEquals("#5c5f63", actualColor); }
	 */
	/*
	 * public void verifyErrorMessage(String s) { try { setLogger().
	 * info("MMS_Maintenance_Responsibility_Groups : verifyErrorMessage");
	 * MatcherAssert.assertThat(EY_FW_Utility.getAnyElementByAnyLocator(
	 * MMS_MaintResGroupsPageLocator.Error_Message).getText(),
	 * containsString(s));
	 * 
	 * } catch (Exception e) { setLogger().
	 * error("[MMS_Maintenance_Responsibility_Groups : verifyErrorMessage ] Exception thrown -- "
	 * + EY_FW_Utility.getStackTrace(e)); Assert.assertTrue(false,
	 * e.getMessage()); } }
	 */
	public int getLinesCount() {
		try {
			setLogger().info("MMS_Maintenance_Responsibility_Groups : checkLinesCount");
			EY_FW_Utility.doWait(3000);
			/*assertEquals(lineCount + 1, EY_FW_Utility
					.getAllElementsByAnyLocator(MMS_MaintResGroupsPageLocator.Maintenance_Group_line).size());*/
			int size = EY_FW_Utility
					.getElementListByLocator(MMS_MaintResGroupsPageLocator.Maintenance_Group_line).size();
			return size;
			//MatcherAssert.assertThat(lineCount + 1, equalTo(size));
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : checkLinesCount ] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
		return 0;
	}

	public void enterJobCodeText(String jobCode) {
		try {
			setLogger().info("[MMS_Maintenance_Responsibility_Groups : enterjobCodetext]");
			EY_FW_Utility.findElementByLocator("xpath_" + MMS_MaintResGroupsPageLocator.jobcodetext_part1 + lineCount
					+ MMS_MaintResGroupsPageLocator.jobcodetext_part2).clear();
			EY_FW_Utility.findElementByLocator("xpath_" + MMS_MaintResGroupsPageLocator.jobcodetext_part1 + lineCount
					+ MMS_MaintResGroupsPageLocator.jobcodetext_part2).sendKeys(jobCode);
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : enterjobCodetext] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterQCText(String qualifierCode) {
		try {
			setLogger().info("[MMS_Maintenance_Responsibility_Groups : enterQCtext]");
			EY_FW_Utility.findElementByLocator("xpath_" + MMS_MaintResGroupsPageLocator.jobcodetext_part1 + lineCount
					+ MMS_MaintResGroupsPageLocator.qualifiercodetext_part2).clear();
			EY_FW_Utility.findElementByLocator("xpath_" + MMS_MaintResGroupsPageLocator.jobcodetext_part1 + lineCount
					+ MMS_MaintResGroupsPageLocator.qualifiercodetext_part2).sendKeys(qualifierCode);
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : enterQCtext] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterWMCtext(String whyMadeCode) {
		try {
			setLogger().info("[MMS_Maintenance_Responsibility_Groups : enterWMCtext]");
			EY_FW_Utility.findElementByLocator("xpath_" + MMS_MaintResGroupsPageLocator.jobcodetext_part1 + lineCount
					+ MMS_MaintResGroupsPageLocator.WMCtext_part2).clear();
			EY_FW_Utility.findElementByLocator("xpath_" + MMS_MaintResGroupsPageLocator.jobcodetext_part1 + lineCount
					+ MMS_MaintResGroupsPageLocator.WMCtext_part2).sendKeys(whyMadeCode);
		} catch (Exception e) {
			setLogger().error("[MMS_Maintenance_Responsibility_Groups : enterWMCtext] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

}
