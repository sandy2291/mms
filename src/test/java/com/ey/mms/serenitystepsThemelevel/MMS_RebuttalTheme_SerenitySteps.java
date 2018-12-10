package com.ey.mms.serenitystepsThemelevel;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.hamcrest.MatcherAssert;
import org.testng.Assert;

import com.ey.mms.pageobjects.MMS_ExpectedResult;
import com.ey.mms.pageobjects.HomePage;
import com.ey.mms.pageobjects.RebuttalPage;
import com.ey.mms.pageobjects.RebuttalCarList;
import com.ey.mms.pageobjects.Rebuttal_RepairListPage;
import com.ey.mms.pageobjects.mmsLocators.MMS_BulkRebuttalDialogueLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_RebuttalBillingCarListPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_RebuttalBillingPageLocator;
import com.ey.mms.serenitystepsThemelevel.expectedData.ExceptionReview;
import com.ey.mms.serenitystepsThemelevel.expectedData.RebuttalDetails;
import com.ey.mms.util.EY_FW_Utility;

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;

public class MMS_RebuttalTheme_SerenitySteps {

	@ManagedPages
	HomePage mmshomepage;

	@ManagedPages
	RebuttalPage mmsrebuttalpage;

	@ManagedPages
	RebuttalCarList rebuttalcarlist;
	@ManagedPages
	Rebuttal_RepairListPage rebuttalrepairlist;

	@Step
	public void clickRebuttal() {
		mmshomepage.clickRebuttals();
	}

	@Step
	public void verifyRebuttalBillingPageTitle() {
		EY_FW_Utility.waitTillPageLoad(6);
		// mmsrebuttalpage.verifyRebuttalBillingPageTitle();
		try {
			System.out.println(
					"[MMS_Rebuttal Billing Invoice List : verifyExceptionReviewPageTitle] Verifying Rebuttal Billing Invoice List Page Title as "
							+ ExceptionReview.REBUTTAL_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), equalTo(ExceptionReview.REBUTTAL_PAGE_TITLE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void selectRebuttal(String s) {
		mmsrebuttalpage.selectRebuttal(s);
	}

	@Step
	public void selectRebuttalStatus(String s) {
		mmsrebuttalpage.selectRebuttalStatus(s);
	}

	@Step
	public void enterStartInvoiceNumber(String s) {
		mmsrebuttalpage.enterInvoicenumberStart(s);
	}

	@Step
	public void enterInvoiceNumberEnd(String s) {
		mmsrebuttalpage.enterInvoicenumberEnd(s);
	}

	@Step
	public void clickSaveButton() {
		mmsrebuttalpage.clickSaveButton();
	}

	@Step
	public void selectRow() {
		mmsrebuttalpage.selectFirstRow();
	}

	@Step
	public void clickMarkInvoicesButton() {
		mmsrebuttalpage.clickMarkInvoicesReviewed();
		EY_FW_Utility.doWait(2000);
	}

	@Step
	public void clickFinalizeInvoicesButton() {
		mmsrebuttalpage.clickFinalizeInvoices();
	}

	@Step
	public void verifyRebuttalStatus(String s) {
		EY_FW_Utility.waitForProcessingNotificationToAppear(5);
		EY_FW_Utility.waitForProcessingNotificationToDisappear(20);
		try {
			String InvoiceStatus;
			System.out.println("[MMS_Rebuttal Billing Invoice List : verifyStatus] Verifying Rebuttal status ");
			InvoiceStatus = EY_FW_Utility.findElementByLocator(MMS_BulkRebuttalDialogueLocator.STATUS).getText();
			MatcherAssert.assertThat(InvoiceStatus, equalTo(s));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void clickActions(String s) {
		mmsrebuttalpage.clickActions(s);
	}

	@Step
	public void verifyRebuttalInvoiceListPageTitle() {
		//EY_FW_Utility.waitTillPageLoad(6);
		EY_FW_Utility.doWait(6000);;
		// rebuttalcarlist.verifyRebuttalBillingPageTitle();
		try {
			System.out.println(
					"[MMS_Rebuttal Car List : verifyRebuttalBillingPageTitle] Verifying Rebuttal Billing Car List Page Title as "
							+ ExceptionReview.REBUTTAL_PAGE_CAR_LIST_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), equalTo(ExceptionReview.REBUTTAL_PAGE_CAR_LIST_TITLE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void clickMarkCarsButton() {
		rebuttalcarlist.clickMarkCarsReviewed();
	}

	@Step
	public void verifyCarStatus(String s) {
		EY_FW_Utility.doWait(2000);
		// rebuttalcarlist.verifyCarStatus(s);
		try {
			System.out.println("[MMS_Rebuttal Billing Car List : verifyCarStatus] Verifying Car status ");
			MatcherAssert.assertThat(
					EY_FW_Utility.findElementByLocator(MMS_RebuttalBillingCarListPageLocator.CAR_STATUS).getText(),
					equalTo(s));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void verifyInvoicePrevStatus(String s) {
		EY_FW_Utility.doWait(2000);
		// rebuttalcarlist.verifyInvoicePrevStatus(s);
		try {
			System.out.println(
					"[MMS_Rebuttal Billing Car List : verifyInvoicePrevStatus] Verifying invoice previous status ");
			MatcherAssert.assertThat(RebuttalPage.InvoiceStatus, equalTo(s));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void clickCarAction(String s) {
		rebuttalcarlist.clickCarActions(s);
	}

	@Step
	public void clickRepairListBulkRebuttal() {
		rebuttalrepairlist.clickBulkRebuttal();
	}
	
	@Step
	public void verifyRebuttalWindow(){
		String popupText  = EY_FW_Utility.findElementByLocator(MMS_RebuttalBillingPageLocator.REBUTTAL_POPUP).getText();
		MatcherAssert.assertThat(popupText, equalTo(RebuttalDetails.REBUTTAL_POPUP_TITLE));
	}

	@Step
	public void selectBillee(String s) {
		rebuttalrepairlist.selectBillee(s);
	}

	@Step
	public void selectContact(String s) {
		rebuttalrepairlist.selectContact(s);
	}

	@Step
	public void saveRebuttal() {
		rebuttalrepairlist.clickSaveRebuttal();
	}

	@Step
	public void confirmRebuttals() {
		rebuttalrepairlist.confirmSaveRebuttal();
	}

	@Step
	public void clickBulkUnassign() {
		rebuttalrepairlist.clickBulkUnassignButton();
	}

	@Step
	public void confirmBulkUnassign() {
		rebuttalrepairlist.confirmBulkUnassignButton();
		EY_FW_Utility.doWait(2000); // reload
	}

	@Step
	public void clickRefresh() {
		rebuttalrepairlist.clickRestoreDefault();
		EY_FW_Utility.waitTillPageLoad(20);
	}

	@Step
	public void selectOverwriteRebuttal() {
		rebuttalrepairlist.SelectOverwriteRebuttal();
	}
}
