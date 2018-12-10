package com.ey.mms.serenitystepsThemelevel;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.hamcrest.MatcherAssert;
import org.testng.Assert;

import com.ey.mms.pageobjects.BillingContactsPage;
import com.ey.mms.pageobjects.MMS_ExpectedResult;
import com.ey.mms.pageobjects.HomePage;
import com.ey.mms.pageobjects.mmsLocators.MMS_BillingContactsPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.serenitystepsThemelevel.expectedData.ExceptionReview;
import com.ey.mms.util.EY_FW_Utility;

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;

public class MMS_BillingContactsTheme_SerenitySteps {

	@ManagedPages
	HomePage homepage;

	@ManagedPages
	BillingContactsPage billingcontacts;

	@Step
	public void clickContacts() {
		homepage.clickBillingContacts();
	}

	@Step
	public void verifyBillingContactsPageTitle() {
		EY_FW_Utility.waitTillPageLoad(3);
		// billingcontacts.verifyBillingContactsPageTitle();
		try {
			System.out.println(
					"[MMS_BillingContacts : verifyBillingContactsPageTitle] Verifying Billing contacts title as "
							+ ExceptionReview.Billing_Contacts_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), equalTo(ExceptionReview.Billing_Contacts_PAGE_TITLE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void clickAddCompany() {
		billingcontacts.clickAddCompany();
	}

	@Step
	public void verifyPopupTitle(String popupTitle) {
		try {
			//EY_FW_Utility.doWait(4000); // verification
			EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
			MatcherAssert.assertThat(EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.popuptitle).getText(),
					equalTo(popupTitle));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	@Step
	public void checkemptyTable(){
		EY_FW_Utility.doWait(5000); // refresh
		MatcherAssert.assertThat(EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.EMPTYCONTACTTABLE).getText(),
				equalTo("No data available in table"));
	}

	@Step
	public void verifyNewlyAddedCompany(String mark) {
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 2, mark);
	}

	@Step
	public void verifyCancelAddCompany(String mark) {
		//EY_FW_Utility.doWait(2000);// verification
		EY_FW_Utility.verifyTableColumnDoesntContains(MMS_MyCompanyInfoPageLocator.contacttable, 2, mark);
	}

	@Step
	public void verifyNewlyEditedCompany(String mark, String name) {
		//EY_FW_Utility.doWait(2000); // verification
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 2, mark);
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 3, name);
	}

	@Step
	public void verifyNewlyEditedCancelCompany(String name) {
		//EY_FW_Utility.doWait(2000);
		EY_FW_Utility.verifyTableColumnDoesntContains(MMS_MyCompanyInfoPageLocator.contacttable, 3, name);
	}

	@Step
	public void verifyEnabledColumn(String xpath, String status, int colno) {
		//EY_FW_Utility.doWait(2000); // verification
		EY_FW_Utility.verifyTableColumnContain(xpath, colno, status);
	}

	@Step
	public void verifyEnabledColumnDoesntcontain(String xpath, String status, int colno) {
		//EY_FW_Utility.doWait(2000); // verification
		EY_FW_Utility.verifyTableColumnDoesntContains(xpath, colno, status);
	}

	@Step
	public void verifyNameandTitle(String name, String title) {
		EY_FW_Utility.doWait(2000);
		MatcherAssert.assertThat(EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.Name_Displayed).getText(),
				equalTo(name));
		MatcherAssert.assertThat(EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.Title_Displayed).getText(),
				equalTo(title));

	}

	@Step
	public void companyCantSaveErrorMessage(String msg) {
		MatcherAssert.assertThat(EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.companycantsave).getText(),
				equalTo(msg));
	}

	@Step
	public void duplicateCompanyErrorPopup(String msg) {
		MatcherAssert.assertThat(EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.duplicatecompany).getText(),
				equalTo(msg));
		// exceptiontheme.clickclosebutton();
	}

	@Step
	public void clicksave() {
		EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
		billingcontacts.clickSave();
		EY_FW_Utility.doWait(5000); // check
	}

	@Step
	public void clickCancel() {
		billingcontacts.clickCancel();
	}

	@Step
	public void enterMark(String s) {
		billingcontacts.enterMark(s);
	}

	@Step
	public void enterRmark(String s) {
		billingcontacts.enterRmark(s);
	}

	@Step
	public void enterName(String s) {
		billingcontacts.enterName(s);
	}

	@Step
	public void enterAPNO(String s) {
		billingcontacts.enterAPNO(s);
	}

	@Step
	public void enterARNO(String s) {
		billingcontacts.enterARNO(s);
	}

	@Step
	public void clickActions() {
		billingcontacts.clickActions();
	}

	@Step
	public void clickActionList(String s) {
		billingcontacts.clickactionlist(s);
	}

	@Step
	public void selectCompanyEnabled(String s) {
		billingcontacts.selectcompanyEnabled(s);
	}

	@Step
	public void selectContactEnabled(String s) {
		billingcontacts.selectcontactEnabled(s);
	}

	@Step
	public void clickok() {
		billingcontacts.clickok();
	}

	@Step
	public void clickcancel() {
		billingcontacts.clickcancel();
	}

	@Step
	public void clickplus() {
		EY_FW_Utility.doWait(3000);
		billingcontacts.clickPlusSign();
		EY_FW_Utility.doWait(3000);
	}

	@Step
	public void clickactionssubtable() {
		billingcontacts.clickactionssubtable();
		EY_FW_Utility.doWait(2000);
	}

	@Step
	public void clickactionssubtablelist(String s) {
		billingcontacts.clicksubtableactionlist(s);
	}

}
