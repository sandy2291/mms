package com.ey.mms.serenitystepsThemelevel;

import com.ey.mms.pageobjects.MMS_ExpectedResult;
import com.ey.mms.pageobjects.HomePage;
import com.ey.mms.pageobjects.LoginPage;
import com.ey.mms.pageobjects.ReportHistoryPage;
import com.ey.mms.pageobjects.mmsLocators.MMS_ReportHistoryPageLocator;
import com.ey.mms.serenitystepsThemelevel.expectedData.Home;
import com.ey.mms.serenitystepsThemelevel.expectedData.ReportHistory;
import com.ey.mms.util.EY_FW_Utility;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;
import org.testng.Assert;
import static org.hamcrest.CoreMatchers.equalTo;

public class MMS_ReportsTheme_SerenitySteps {

	@ManagedPages
	LoginPage mmsloginpage;

	@ManagedPages
	HomePage mmshomepage;

	@ManagedPages
	ReportHistoryPage mmsreporthistorypage;

	@Step
	public void opensMMSLoginPage() {
		System.out.println("------=================-------- " + mmsloginpage);
		mmsloginpage.openURL();
		// mmsloginpage.enterUserId("kcsadmin");
	}

	@Step
	public void enterUserId(String userid) {
		mmsloginpage.enterUserId(userid);
	}

	@Step
	public void enterPassword(String input) {
		mmsloginpage.enterPassword(input);
		// mmsloginpage.enterUserId("kcsadmin");

	}

	@Step
	public void clickLoginButton() {
		mmsloginpage.clickLoginButton();
		// mmsloginpage.enterUserId("kcsadmin");

	}

	@Step
	public void verifyHomePageTitle() {
		// mmshomepage.verifyHomePageTitle();
		try {
			System.out.println("[MMS_HomePage : verifyHomePageTitle] Verifying Home Page title as "
					+ Home.HOME_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), equalTo(Home.HOME_PAGE_TITLE));
		} catch (Exception e) {
			System.out.println(
					"[MMS_HomePage : verifyHomePageTitle] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void reportclickReportHistoryMenuBar() {
		mmsreporthistorypage.clickReportHistoryMenuBar();

	}

	@Step
	public void verifyReportHistoryPageTitle() {
		EY_FW_Utility.doWait(3000);
		//EY_FW_Utility.waitTillPageLoad(3);
		// mmsreporthistorypage.verifyReportHistoryPageTitle();
		System.out.println("[MMS_ReportHistoryPage : verifyReportHistoryPageTitle] Verifying Report History Page Title"
				+ ReportHistory.REPORTHISTORY_PAGE_TITLE);
		MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
				equalTo(ReportHistory.REPORTHISTORY_PAGE_TITLE));
	}

	@Step
	public void reportclickReportHistoryAction() {

		mmsreporthistorypage.clickReportHistoryAction();
	}

	@Step
	public void reportclickReportHistoryActionDownload() {
		mmsreporthistorypage.clickReportHistoryReportDownload();

	}

	@Step
	public void reportClickReportDownloadAction() {
		mmsreporthistorypage.clickReportDownloadAction();
	}

	@Step
	public void reportclickReportDownloadActionDownload() {
		mmsreporthistorypage.clickReportDownloadActionDownload();
		 EY_FW_Utility.doWait(3000);
	}

	@Step
	public void verifyReportDownloadPopUp() {
		// mmsreporthistorypage.verifyReportHistoryPageTitle();
		System.out.println("[MMS_ReportHistoryPage : verifyReportHistoryPageTitle] Verifying Report History Page Title"
				+ ReportHistory.REPORTHISTORY_PAGE_TITLE);
		MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
				equalTo(ReportHistory.REPORTHISTORY_PAGE_TITLE));
	}

	@Step
	public void reportClickCloseReportDownLoadPopUp() throws Throwable {
		EY_FW_Utility.doWait(3000); // wait for clickability
		mmsreporthistorypage.clickCloseReportDownloadPopUp();
	}

	@Step
	public void reportclickFilter() {
		mmsreporthistorypage.clickReportHistoryFilter();
	}

	@Step
	public void reportEnterCreateDate(String createDate) {
		mmsreporthistorypage.enterCreateDateReportHistory(createDate);
	}

	@Step
	public void reportClickFilterSave() {
		mmsreporthistorypage.clickReportHistoryFilterSave();

	}

	@Step
	public void reportClickFilterCancel() {
		mmsreporthistorypage.clickReportHistoryFilterCancel();
	}

	@Step
	public void reportVerifyGridDescription() {
		// mmsreporthistorypage.verifyReportHistoryFilterDescription();
		try {
			System.out.println(
					"[MMS_ReportHistoryPage : verifyReportHistoryFilterDescription] Verifying The data in Grid after Filter with Create Date "
							+ ReportHistory.REPORTHISTORY_FILTER_GRID_DESCRIPTION);
			WebElement wb = EY_FW_Utility.findElementByLocator(
					MMS_ReportHistoryPageLocator.REPORTHISTORY_FILTER_GRID_DESCRIPTION_LOCATOR);
			String errormsg = wb.getText();
			MatcherAssert.assertThat(errormsg, equalTo(ReportHistory.REPORTHISTORY_FILTER_GRID_DESCRIPTION));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

}
