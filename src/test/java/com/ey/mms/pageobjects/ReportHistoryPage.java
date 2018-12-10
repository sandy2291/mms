package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import com.ey.mms.pageobjects.MMS_ExpectedResult;
import com.ey.mms.pageobjects.MMS_Locators;
import com.ey.mms.pageobjects.mmsLocators.MMS_ReportHistoryPageLocator;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.EY_GettersSetters;

import net.serenitybdd.core.pages.PageObject;

public class ReportHistoryPage extends PageObject {

	FirefoxProfile p = new FirefoxProfile();

	public void clickReportHistoryMenuBar() {
		try {
			System.out
					.println("[MMS_ReportHistoryPage : clickReportHistoryMenuBar] Clicking on Report History Menu Bar");
			EY_FW_Utility.findElementByLocator(MMS_ReportHistoryPageLocator.REPORTHISTORY_MENUBAR_LOCATOR).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void verifyReportHistoryPageTitle(){ System.out.
	 * println("[MMS_ReportHistoryPage : verifyReportHistoryPageTitle] Verifying Report History Page Title"
	 * + MMS_ExpectedResult.REPORTHISTORY_PAGE_TITLE);
	 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.REPORTHISTORY_PAGE_TITLE)); }
	 */

	public void clickReportHistoryAction() {
		try {

			System.out.println("[MMS_ReportHistoryPage : clickReportHistoryAction] click on Action for Line Item");
			EY_FW_Utility.findElementByLocator(MMS_ReportHistoryPageLocator.REPORTHISTORY_ACTION_LOCATOR).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void clickReportHistoryReportDownload() {
		try {
			System.out.println(
					"[MMS_ReportHistoryPage : clickReportHistoryReportDownLoad] click on Report Download under Action");
			EY_FW_Utility.findElementByLocator(MMS_ReportHistoryPageLocator.REPORTHISTORY_ACTION_DOWNLOAD_LOCATOR)
					.click();
			// EY_FW_Utility.doWait(3000);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickReportDownloadAction() {
		try {
			System.out.println(
					"[MMS_ReportHistoryPage : clickReportDownloadAction] click on Action in Report Download Pop up");
			EY_FW_Utility
					.findElementByLocator(MMS_ReportHistoryPageLocator.REPORTHISTORY_REPORTDOWLOAD_ACTION_LOCATOR)
					.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickReportDownloadActionDownload() {
		try {
			System.out.println(
					"[MMS_ReportHistoryPage : clickReportDownloadActionDownload] click on Download under Action column in Report Download Pop up");
			EY_FW_Utility.findElementByLocator(
					MMS_ReportHistoryPageLocator.REPORTHISTORY_REPORTDOWNLOAD_ACTION_DOWNLOAD_LOCATOR).click();
			// EY_FW_Utility.doWait(5000);

			/*Screen s = new Screen();
			String path = System.getProperty("user.dir");
			Pattern p = new Pattern(path+"/"+MMS_ReportHistoryPageLocator.ReportHistoryDownloadOk);
			s.click(p);*/

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*public void verifyReportDownloadPopup() {
		try {
			System.out
					.println("[MMS_ReportHistoryPage : verifyReportDownloadPopup] Verifying Report Download Page Title "
							+ MMS_ExpectedResult.REPORTHISTORY_REPORTDOWNLOAD_POPUP);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
					equalTo(MMS_ExpectedResult.REPORTHISTORY_REPORTDOWNLOAD_POPUP));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}*/

	public void clickCloseReportDownloadPopUp() throws Throwable {
		try {
			System.out.println(
					"[MMS_ReportHistoryPage : clickCloseReportDownloadPopUp] click on Close For Report Downlaod Pop Up");
			
			EY_FW_Utility.findElementByLocator(MMS_ReportHistoryPageLocator.ReportClose).click();/*Screen s = new Screen();
			String path = System.getProperty("user.dir");
			Pattern p = new Pattern(path+"/"+MMS_ReportHistoryPageLocator.ReportDownloadClose);
			s.click(p); */
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void clickReportHistoryFilter() {

		try {
			System.out.println(
					"[MMS_ReportHistoryPage : clickReportHistoryFilter] click on Filter in the Report History");
			EY_FW_Utility.findElementByLocator(MMS_ReportHistoryPageLocator.REPORTHISTORY_FILTER_LOCATOR).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterCreateDateReportHistory(String createDate) {
		try {
			System.out.println("[MMS_ReportHistoryPage : enterCreateDateReportHistory] Entering '" + createDate
					+ "' in Create Date Edit box");
			WebElement wb = EY_FW_Utility
					.findElementByLocator(MMS_ReportHistoryPageLocator.REPORTHISTORY_FILTER_CREATEDATE_LOCATOR);
			wb.clear();
			wb.sendKeys(createDate);
			WebElement wb1 = EY_FW_Utility
					.findElementByLocator(MMS_ReportHistoryPageLocator.REPORTHISTORY_FILTER_ENDDATE_LOCATOR);
			wb1.clear();
			wb1.sendKeys(createDate);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void clickReportHistoryFilterSave() {
		try {
			EY_FW_Utility.findElementByLocator(MMS_ReportHistoryPageLocator.FILTERSAVE).click();
			/*System.out
					.println("[MMS_ReportHistoryPage : clickReportHistoryFilterSave] click on Save for Filter Button");
			Screen s = new Screen();
			String path = System.getProperty("user.dir");
			Pattern p = new Pattern(path+"/"+MMS_ReportHistoryPageLocator.ReportHistorySave);
			s.click(p);*/
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void clickReportHistoryFilterCancel() {
		try {
			System.out.println(
					"[MMS_ReportHistoryPage : clickReportHistoryFilterCancel] click on Cancel button for Filter Button");
			EY_FW_Utility.findElementByLocator(MMS_ReportHistoryPageLocator.FILTERCANCEL).click();
			/*Screen s = new Screen();
			String path = System.getProperty("user.dir");
			Pattern p = new Pattern(path+"/"+MMS_ReportHistoryPageLocator.ReportHistoryFilterCancel);
			s.click(p);*/
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	/*
	 * public void verifyReportHistoryFilterDescription(){ try{ System.out.
	 * println("[MMS_ReportHistoryPage : verifyReportHistoryFilterDescription] Verifying The data in Grid after Filter with Create Date "
	 * + MMS_ExpectedResult.REPORTHISTORY_FILTER_GRID_DESCRIPTION); WebElement
	 * wb=EY_FW_Utility.getAnyElementByAnyLocator(MMS_ReportHistoryPageLocator.
	 * REPORTHISTORY_FILTER_GRID_DESCRIPTION_LOCATOR); String
	 * errormsg=wb.getText(); MatcherAssert.assertThat(errormsg,
	 * equalTo(MMS_ExpectedResult.REPORTHISTORY_FILTER_GRID_DESCRIPTION)); }
	 * catch(Exception e){ Assert.assertTrue(false, e.getMessage()); }
	 * 
	 * }
	 */

}
