package com.ey.mms.serenitystepsThemelevel;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

import org.hamcrest.MatcherAssert;
import org.testng.Assert;

import com.ey.mms.pageobjects.MMS_ExpectedResult;
import com.ey.mms.pageobjects.HomePage;
import com.ey.mms.pageobjects.RepairDetailsPage;
import com.ey.mms.pageobjects.mmsLocators.MMS_RepairDetailPageLocator;
import com.ey.mms.serenitystepsThemelevel.expectedData.Home;
import com.ey.mms.serenitystepsThemelevel.expectedData.RepairDetail;
import com.ey.mms.util.EY_FW_Utility;

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;

public class MMS_RepairsTheme_SerenitySteps {

	@ManagedPages
	HomePage mmshomepage;

	@ManagedPages
	RepairDetailsPage mmsrepairdetail;

	@Step
	public void clickOnInvoicesMainMenu() {
		mmshomepage.clickInvoicesMenu();

	}

	@Step
	public void clickOnRepairDetailsSubMenu() {
		mmshomepage.selectRepairDetailsSubMenu();
		// EY_FW_Utility.doWait(3000);
	}

	@Step
	public void verifyRepairDetailsPageTitle() {
		EY_FW_Utility.waitTillPageLoad(3);
		// mmsrepairdetail.verifyRepairDetailsPageTitle();
		System.out.println("[MMS_RepairDetail : verifyRepairDetailTitle] Verifying Repair Detail Page title as "
				+ RepairDetail.REPAIRDETAIL_PAGE_TITLE);
		MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
				equalTo(RepairDetail.REPAIRDETAIL_PAGE_TITLE));
	}

	@Step
	public void clickTab(String s) {
		try {
			EY_FW_Utility.findElementByLocator(s).click();
			// EY_FW_Utility.doWait(3000);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void viewGrid(String s) {
		try {
			int size = EY_FW_Utility.getElementListByLocator(s).size();
			MatcherAssert.assertThat(size, greaterThan(0));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void verifyHomePageTitle() {
		// mmshomepage.verifyHomePageTitle();
		try {
			System.out.println("[MMS_HomePage : verifyHomePageTitle] Verifying Home Page title as "
					+ Home.HOME_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), equalTo(Home.HOME_PAGE_TITLE));

		} catch (AssertionError e) {

			System.out.println(
					"[MMS_HomePage : verifyHomePageTitle] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void clickOnFilterButton() {
		mmsrepairdetail.clickFilterButton();

	}

	@Step
	public void enterStartAndEndInvoiceNumbers(String invNumStart, String invNumEnd) {
		mmsrepairdetail.enterInvoiceNumbers(invNumStart, invNumEnd);

	}

	@Step
	public void clickSaveButtonAfterEnteringInvoiceNumbers() {
		mmsrepairdetail.clickSave();

	}

	@Step
	public void clickAudit() {
		mmsrepairdetail.clickAudit();
	}

	@Step
	public void clickCarAudit() {
		mmsrepairdetail.clickCarAudit();
	}
}
