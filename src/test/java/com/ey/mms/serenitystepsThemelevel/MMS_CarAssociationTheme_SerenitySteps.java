package com.ey.mms.serenitystepsThemelevel;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.hamcrest.MatcherAssert;
import org.testng.Assert;

import com.ey.mms.pageobjects.CarToCustomerAssociationPage;
import com.ey.mms.pageobjects.MMS_ExpectedResult;
import com.ey.mms.pageobjects.HomePage;
import com.ey.mms.pageobjects.mmsLocators.MMS_CartoCustomerAssocPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.serenitystepsThemelevel.expectedData.ExceptionReview;
import com.ey.mms.util.EY_FW_Utility;

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;

public class MMS_CarAssociationTheme_SerenitySteps {

	@ManagedPages
	HomePage mmshomepage;

	@ManagedPages
	CarToCustomerAssociationPage carToCustomerAssociation;

	@Step
	public void clickCarToCustomerAssociation() {
		mmshomepage.clickCarToCustomerAssociation();
	}

	@Step
	public void verifyCarToCustomerAssociationPageTitle() {
		EY_FW_Utility.waitTillPageLoad(3);
		// carToCustomerAssociation.verifyCarToCustomerAssociationPageTitle();
		try {
			System.out.println(
					"[MMS_Car To Customer Association : verifyC2CAPageTitle] Verifying Car to customer association title as "
							+ ExceptionReview.C2CA_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), equalTo(ExceptionReview.C2CA_PAGE_TITLE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void clickAddAssoc() {
		carToCustomerAssociation.clickAddAssoc();
		EY_FW_Utility.waitTillPageLoad(3);
	}

	@Step
	public void clickPopupCancel() {
		carToCustomerAssociation.clickPopupCancel();
		EY_FW_Utility.doWait(2000);
	}

	

	@Step
	public void clickPopupCancelButton() {
		carToCustomerAssociation.clickPopupCancelButton();
		EY_FW_Utility.doWait(2000);
	}

	
	@Step
	public void clickPopupSave() {
		carToCustomerAssociation.clickpopuSave();
		EY_FW_Utility.doWait(5000);
	}

	@Step
	public void clickactions() {
		carToCustomerAssociation.clickActions();
		EY_FW_Utility.doWait(2000);
	}

	@Step
	public void clickFilter() {
		carToCustomerAssociation.clickFilter();
		
	}

	@Step
	public void clickSaveFilter() {
		carToCustomerAssociation.clickSaveFilter();
		EY_FW_Utility.doWait(4000); // to refresh data
	}

	@Step
	public void enterCarInitial(String s) {
		carToCustomerAssociation.enterCarInitial(s);
	}

	@Step
	public void clickOkDisable() {
		carToCustomerAssociation.clickok();
		EY_FW_Utility.doWait(5000); // refresh
	}

	@Step
	public void selectEnabled(String s) {
		carToCustomerAssociation.selectEnabled(s);
	}

	@Step
	public void verifyDisplay() {
		EY_FW_Utility.doWait(2000);
		// carToCustomerAssociation.verifyCarToCustomerAssociation();
		try {
			System.out.println("[MMS_Car To Customer Association : verify add C2CA] Verifying add user details");

			MatcherAssert.assertThat(true,
					equalTo(EY_FW_Utility.isElementPresent(MMS_CartoCustomerAssocPageLocator.ASSOC_INITIAL)
							&& EY_FW_Utility.isElementPresent(MMS_CartoCustomerAssocPageLocator.BEGINRANGE)
							&& EY_FW_Utility.isElementPresent(MMS_CartoCustomerAssocPageLocator.ENDRANGE)
							&& EY_FW_Utility.isElementPresent(MMS_CartoCustomerAssocPageLocator.CUSTOMER_DROPDOWN)
							&& EY_FW_Utility.isElementPresent(MMS_CartoCustomerAssocPageLocator.Img_Cancel)
							&& EY_FW_Utility.isElementPresent(MMS_CartoCustomerAssocPageLocator.Img_Save)));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void verifydisplay1() {
		EY_FW_Utility.doWait(2000);
		// carToCustomerAssociation.verifyCarToCustomerAssoc1();
		try {
			System.out.println("[MMS_Car To Customer Association : verify add C2CA] Verifying add user details");
			/*MatcherAssert.assertThat(true,
					equalTo(EY_FW_Utility.isElementPresent(MMS_CartoCustomerAssocPageLocator.ASSOC_CARINITIAL)
							&& EY_FW_Utility.isElementPresent(MMS_CartoCustomerAssocPageLocator.ASSOC_CARINITIAL)
							&& EY_FW_Utility.isElementPresent(MMS_CartoCustomerAssocPageLocator.ASSOC_CAREND)
							&& EY_FW_Utility.isElementPresent(MMS_CartoCustomerAssocPageLocator.CUSTOMER_DROPDOWN)));
*/		
			MatcherAssert.assertThat(true,
			equalTo(EY_FW_Utility.isElementPresent(MMS_CartoCustomerAssocPageLocator.ASSOC_INITIAL)
					&& EY_FW_Utility.isElementPresent(MMS_CartoCustomerAssocPageLocator.BEGINRANGE)
					&& EY_FW_Utility.isElementPresent(MMS_CartoCustomerAssocPageLocator.ENDRANGE)
					&& EY_FW_Utility.isElementPresent(MMS_CartoCustomerAssocPageLocator.CUSTOMER_DROPDOWN)
			));

			} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void enterAddAssoc(String s1, String s2, String s3, String s4) {
		carToCustomerAssociation.enterAssocCarInitial(s1);
		carToCustomerAssociation.enterBeginrange(s2);
		carToCustomerAssociation.enterCarEndRange(s3);
		carToCustomerAssociation.selectCustomer(s4);
	}

	@Step
	public void user_cant_see_assoc(String initial, String startno, String endno) {
		EY_FW_Utility.verifyTableColumnDoesntContains(MMS_MyCompanyInfoPageLocator.contacttable, 1, initial);
		EY_FW_Utility.verifyTableColumnDoesntContains(MMS_MyCompanyInfoPageLocator.contacttable, 2, startno);
		EY_FW_Utility.verifyTableColumnDoesntContains(MMS_MyCompanyInfoPageLocator.contacttable, 3, endno);
		// EY_FW_Utility.verifyTableColumnDoesntContains(MMS_Locators.contacttable,
		// 4, customer);
	}

	@Step
	public void user_Can_see_assoc_added(String initial, String startno, String endno, String customer) {
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 1, initial);
		//EY_FW_Utility.verifyTableColumnContains(MMS_MyCompanyInfoPageLocator.contacttable, 2, startno);
		//EY_FW_Utility.verifyTableColumnContains(MMS_MyCompanyInfoPageLocator.contacttable, 3, endno);
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 4, customer);
	}

	@Step
	public void clickActionList(String s) {
		carToCustomerAssociation.clickactionlist(s);
	}
}
