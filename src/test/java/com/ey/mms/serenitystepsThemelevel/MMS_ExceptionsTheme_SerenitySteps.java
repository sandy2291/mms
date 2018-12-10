package com.ey.mms.serenitystepsThemelevel;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.testng.AssertJUnit.assertEquals;

import org.hamcrest.MatcherAssert;
import org.testng.Assert;

import com.ey.mms.pageobjects.ExceptionReviewPage;
import com.ey.mms.pageobjects.ExceptionReviewCarListPage;
import com.ey.mms.pageobjects.ExceptionTrackingPage;
import com.ey.mms.pageobjects.MMS_ExpectedResult;
import com.ey.mms.pageobjects.HomePage;
import com.ey.mms.pageobjects.mmsLocators.MMS_ExceptionReviewCarListPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_ExceptionTrackingPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_UserManagerPageLocator;
import com.ey.mms.serenitystepsThemelevel.expectedData.ExceptionReview;
import com.ey.mms.util.EY_FW_Utility;

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;

public class MMS_ExceptionsTheme_SerenitySteps {

	@ManagedPages
	HomePage mmshomepage;

	@ManagedPages
	ExceptionReviewPage mmsexceptionreviewpage;

	@ManagedPages
	ExceptionReviewCarListPage mmsexceptioncarlist;

	@ManagedPages
	ExceptionTrackingPage mmsexceptiontracking;

	@Step
	public void clickInvoices() {
		mmshomepage.clickInvoices();
	}

	@Step
	public void SelectExceptions() {
		mmshomepage.selectExceptionsSubMenu("Exceptions");
	}

	@Step
	public void selectExceptionReview() {
		mmshomepage.selectExceptions_ExceptionsSubmenu("Exceptions and Rejections");
	}

	@Step
	public void selectExceptionTracking() {
		mmshomepage.selectExceptions_ExceptionsSubmenu("Exception Tracking");
	}

	@Step
	public void verifyExceptionReviewPageTitle() {
		EY_FW_Utility.waitTillPageLoad(12);
		// mmsexceptionreviewpage.verifyExceptionReviewPageTitle();
		try {
			System.out.println(
					"[MMS_ExceptionReview : verifyExceptionReviewPageTitle] Verifying Exception Review Page Title as "
							+ ExceptionReview.EXCEPTIONREVIEW_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
					equalTo(ExceptionReview.EXCEPTIONREVIEW_PAGE_TITLE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void verifyExceptionTrackingPageTitle() {

		// mmsexceptiontracking.verifyExceptionTrackingPageTitle();
		try {
			System.out.println(
					"[MMS_EXCEPTION_TRACKING : verifyExceptionTrackingPageTitle], verifying page title of exception tracking page");
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
					equalTo(ExceptionReview.EXCEPTIONTRACKING_PAGE_TITLE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void clickView(String s) throws InterruptedException {
		//mmsexceptionreviewpage.searchTableandClick(s, 0);
		EY_FW_Utility.doWait(3000);
		int rno = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 6, s);
		EY_FW_Utility.clickMMSActions(MMS_MyCompanyInfoPageLocator.contacttable, MMS_UserManagerPageLocator.divison, rno,
				16);
		//EY_FW_Utility.clickMMSActionList(locatorPath1, locatorPath2, locatorPath3, rowNumber, colNumber, text);
		EY_FW_Utility.clickMMSActionList(MMS_MyCompanyInfoPageLocator.contacttable,
				MMS_UserManagerPageLocator.actionlist1, MMS_UserManagerPageLocator.actionlist2, rno, 16, "View");
	}

	@Step
	public void clickEditException(String s) throws InterruptedException {
		//mmsexceptioncarlist.searchTableandClick(s, "Edit Exception");
		//EY_FW_Utility.getTableRowNumber(locatorPath, colNumber, expectedValue)
		int rno = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 3, s);
		EY_FW_Utility.clickMMSActions(MMS_MyCompanyInfoPageLocator.contacttable, MMS_UserManagerPageLocator.divison, rno,
				14);
		//EY_FW_Utility.clickMMSActionList(locatorPath1, locatorPath2, locatorPath3, rowNumber, colNumber, text);
		EY_FW_Utility.clickMMSActionList(MMS_MyCompanyInfoPageLocator.contacttable,
				MMS_UserManagerPageLocator.actionlist1, MMS_UserManagerPageLocator.actionlist2, rno, 14, "Edit Exception");
	}

	@Step
	public void selectExceptionContact(String s) throws InterruptedException {
		mmsexceptionreviewpage.selectExceptionContact(s);
	}

	@Step
	public void clickRemoveException(String s) throws InterruptedException {
		//mmsexceptioncarlist.searchTableandClick(s, "Remove Exception");
		int rno = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 3, s);
		EY_FW_Utility.clickMMSActions(MMS_MyCompanyInfoPageLocator.contacttable, MMS_UserManagerPageLocator.divison, rno,
				14);
		//EY_FW_Utility.clickMMSActionList(locatorPath1, locatorPath2, locatorPath3, rowNumber, colNumber, text);
		EY_FW_Utility.clickMMSActionList(MMS_MyCompanyInfoPageLocator.contacttable,
				MMS_UserManagerPageLocator.actionlist1, MMS_UserManagerPageLocator.actionlist2, rno, 14, "Remove Exception");
	}

	@Step
	public void clickEditAmount(String s) {
		mmsexceptioncarlist.editExceptionAmount(s);
		// EY_FW_Utility.doWait(5000);
		mmsexceptioncarlist.ClickSaveButton();
		EY_FW_Utility.waitForProgressWindowToDisappear(30);
		// EY_FW_Utility.doWait(10000);
	}

	@Step
	public void verifyamount(String amount) {
		EY_FW_Utility.doWait(5000); // verification , more time as of processing
		//mmsexceptioncarlist.verifyAmount(s); // can't move as of j
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 12, "$"+amount);
	}

	@Step
	public void verifyAmountFieldRequiredMessage() {
		EY_FW_Utility.doWait(3000); // verification
		// mmsexceptioncarlist.verifyAmountFieldRequiredMessage();
		try {
			System.out.println(
					"[MMS_EXCEPTIONREVIEW_CARLIST : verifyamountfieldRequiredmessage] Verifying amount field required message");
			MatcherAssert.assertThat(ExceptionReview.AMOUNTFIELDREQUIRED,equalTo( EY_FW_Utility
					.findElementByLocator(MMS_ExceptionReviewCarListPageLocator.AMOUNTFIELDREQUIRED_LOCATOR)
					.getText()));
			mmsexceptioncarlist.ClickCancelButton();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	@Step
	public void verifyErrorMessage() {
		// mmsexceptioncarlist.verifyamountfieldMoremessage();
		mmsexceptioncarlist.ClickCancelButton();
	}

	@Step
	public void clickFilter() {
		mmsexceptionreviewpage.clickFilterButton();
	}

	@Step
	public void enterDetails(String s1, String s2, String s3) {
		mmsexceptionreviewpage.enterFilterDetails(s1, s2, s3);
	}

	@Step
	public void confirmRemoveRepair() {
		mmsexceptioncarlist.clickRemoveRepair();
	}

	@Step
	public void isRemoved() {
		mmsexceptioncarlist.isNotDisplayed();
		//EY_FW_Utility.doWait(4000); // loading
	}

	@Step
	public void selectAudit() {
		mmsexceptioncarlist.selectAudit();
		
	}

	@Step
	public void checkMessage(String s) {
		//EY_FW_Utility.doWait(3000);
		// asser
		// Assert.assertEquals(true, mmsexceptioncarlist.checkremovemessage(s));
	}

	@Step
	public void selectRow(String s) throws InterruptedException {
		//mmsexceptionreviewpage.selectrow(s, 0);
		EY_FW_Utility.doWait(3000);
		int rno = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 6, s);
		EY_FW_Utility.clickMMSActions(MMS_MyCompanyInfoPageLocator.contacttable, "input", rno,
				1);
	}

	@Step
	public void clickGenerateLetterButton() {
		mmsexceptionreviewpage.clickGenerateExceptionLetter();
	}

	@Step
	public void enterLetterNumber(String s) {
		mmsexceptionreviewpage.enterGenerateExceptionNumber(s);
	}

	@Step
	public void clicksave() {
		mmsexceptionreviewpage.ClickSaveButton();
	}

	@Step
	public void verifyGenrateExceptionLetter(String s) {

		MatcherAssert.assertThat(ExceptionReview.EXCEPTIONFIELDREQUIRED, equalTo(s));
	}

	@Step
	public void enterInvoice(String s) {
		mmsexceptiontracking.enterInvoicenumber(s);
	}

	@Step
	public void selectStatus(String s) {
		mmsexceptiontracking.selectstatus(s);
	}

	@Step
	public void selectResponse(String s) {
		mmsexceptiontracking.selectResponseType(s);
		EY_FW_Utility.doWait(3000); // for loading other options
	}

	@Step
	public void clickSaveButton() {
		mmsexceptiontracking.clickSaveFilter();
		EY_FW_Utility.doWait(3000);// for refreshment
	}

	@Step
	public void clickAction(String s) {
		mmsexceptiontracking.clickActions(s);
		EY_FW_Utility.waitTillPageLoad(4);
	}

	@Step
	public void clickCheckbox() {
		mmsexceptiontracking.selectCheckbox();
	}

	@Step
	public void enterResponse(String s) {
		mmsexceptiontracking.enterResponseComment(s);
	}
	
	@Step
	public void enterCBA(String s) {
		mmsexceptiontracking.enterCBA(s);
	}

	@Step
	public void saveResponse() {
		mmsexceptioncarlist.ClickSaveButton();
		EY_FW_Utility.doWait(5000);
	}

	@Step
	public void verifyResponse(String s) {
		EY_FW_Utility.doWait(2000);
		// mmsexceptiontracking.verifyResponse(s);
		try {
			System.out.println("[MMS_EXCEPTION_TRACKING : verifyresponsecomment], verifyinging response comments");
			MatcherAssert.assertThat(
					EY_FW_Utility.findElementByLocator(MMS_ExceptionTrackingPageLocator.RESPONSESTATUS).getText(),
					equalTo(s));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void confirm() {
		EY_FW_Utility.doWait(2000);
		mmsexceptiontracking.confirm();
		EY_FW_Utility.waitForProgressWindowToDisappear(20);
		EY_FW_Utility.doWait(5000); // loading else other ele's receive click
	}

	@Step
	public void clickFinalizeButton() {
		mmsexceptiontracking.clickFinalize();
		EY_FW_Utility.doWait(3000);
	}

	@Step
	public void clickDeleteButton() {
		mmsexceptiontracking.clickDelete();
	}

	@Step
	public void verifyDelete() {
		// mmsexceptiontracking.verifyDelete();
		try {
			System.out.println("[MMS_EXCEPTION_TRACKING : verifydelete], Verifying delete");
			MatcherAssert.assertThat(ExceptionReview.EMPTYTABLE,
					equalTo(EY_FW_Utility.findElementByLocator(MMS_ExceptionTrackingPageLocator.EMPTYTABLE).getText()));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void verifyEmptyTable() {
		EY_FW_Utility.doWait(5000);
		// mmsexceptiontracking.checkEmptyTable();
		try {
			System.out.println("[MMS_EXCEPTION_TRACKING : checkEmptyTable], checking whether table is empty or not");
			MatcherAssert.assertThat(
					EY_FW_Utility.findElementByLocator(MMS_ExceptionTrackingPageLocator.NODATA).getText(),
					equalTo(ExceptionReview.EMPTYTABLE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void verifyDeleteError(String s) {
		// mmsexceptiontracking.deleteError(s);
		try {
			System.out.println("[MMS_EXCEPTION_TRACKING : deleteerror], checking for delete error");
			MatcherAssert.assertThat(
					EY_FW_Utility.findElementByLocator(MMS_ExceptionTrackingPageLocator.DELETEERROR).getText(), equalTo(s));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void clickCloseButton() {
		mmsexceptiontracking.clickClose();
	}

	@Step
	public void clickExceptionTracker() {
		mmsexceptiontracking.clickExceptionTracker();
	}

}
