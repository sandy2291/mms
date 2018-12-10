package com.ey.mms.serenitystepsThemelevel;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.testng.AssertJUnit.assertEquals;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.ey.mms.pageobjects.CompanyInformationPage;
import com.ey.mms.pageobjects.MMS_ExpectedResult;
import com.ey.mms.pageobjects.HomePage;
import com.ey.mms.pageobjects.UserManagerPage;
import com.ey.mms.pageobjects.UserProfilePage;
import com.ey.mms.pageobjects.mmsLocators.MMS_AddUserPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_ExceptionTrackingPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_UserManagerPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_UserProfilePageLocator;
import com.ey.mms.serenitystepsThemelevel.expectedData.ExceptionReview;
import com.ey.mms.util.EY_FW_Utility;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;

public class MMS_SystemTheme_SerenitySteps extends PageObject {

	@ManagedPages
	HomePage mmshomepage;

	@ManagedPages
	UserManagerPage mmsusermanager;

	@ManagedPages
	CompanyInformationPage companyinfopage;

	@ManagedPages
	UserProfilePage userprofile;

	@Step
	public void clickConfiguration() {
		mmshomepage.clickConfiguration();
	}

	@Step
	public void selectSystem(String s) {
		mmshomepage.selectSystemSubMenu(s);
	}

	@Step
	public void selectSystemsublist(String s) {
		mmshomepage.selectSystemSubmenu(s);
	}

	@Step
	public void selectLeasesublist(String s) {
		mmshomepage.selectSystemLeaseSubmenu(s);
	}

	@Step
	public void verifyCompanyInfoTitle() {
		EY_FW_Utility.waitTillPageLoad(6);
		//companyinfopage.verifyCompanyInfoPageTitle();
		try {
			System.out
					.println("[MMS_MY Company Info : verifyCompanyInfoPageTitle] Verifying Company Info Page Title as "
							+ ExceptionReview.COMPANY_INFO_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), equalTo(ExceptionReview.COMPANY_INFO_PAGE_TITLE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void verifyUserProfileTitle() {
		EY_FW_Utility.waitTillPageLoad(10);
		// userprofile.verifyUserProfilePageTitle();
		try {
			System.out
					.println("[MMS_UserProfile : verifyUserProfilePageTitle] Verifying User profile page info title as "
							+ ExceptionReview.USERProfile_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), equalTo(ExceptionReview.USERProfile_PAGE_TITLE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void verifyUserManagerPageTitle() {
		//EY_FW_Utility.waitTillPageLoad(10);
		// mmsusermanager.verifyUserManagerPageTitle();
		try {
			//EY_FW_Utility.doWait(3000);
			System.out
					.println("[MMS_UserManager : verifyUserManagePageTitle] Verifying User Manager page info title as "
							+ ExceptionReview.USER_MANAGER_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), equalTo(ExceptionReview.USER_MANAGER_PAGE_TITLE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void verifyEditUserPageTitle() {
		//EY_FW_Utility.waitTillPageLoad(5);
		// mmsusermanager.verifyEditUserPageTitle();
		try {
			EY_FW_Utility.doWait(3000);
			System.out.println("[MMS_AddUser : verifyEditUserPageTitle] Verifying add User page info title as "
					+ ExceptionReview.EDITUSER_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), equalTo(ExceptionReview.EDITUSER_PAGE_TITLE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void verify_Message_in_Color(String message) {
		//EY_FW_Utility.doWait(8000); // color
		MatcherAssert.assertThat(EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.msg).getText(), containsText(message));
		String color = EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.msg).getCssValue("color");
		String[] numbers = color.replace("rgba(", "").replace(")", "").split(",");
		int r = Integer.parseInt(numbers[0].trim());
		int g = Integer.parseInt(numbers[0].trim());
		int b = Integer.parseInt(numbers[0].trim());
		System.out.println("r: " + r + "g: " + g + "b: " + b);
		String hex = "#" + Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b);
		MatcherAssert.assertThat("#00ff00 ", equalTo(hex));
	}

	@Step
	public void verifyAddUserPageTitle() {
		// mmsusermanager.verifyAddUserPageTitle();
		try {
			EY_FW_Utility.doWait(3000);
			System.out.println("[MMS_AddUser : verifyAddUserPageTitle] Verifying add User page info title as "
					+ ExceptionReview.ADDUSER_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), equalTo(ExceptionReview.ADDUSER_PAGE_TITLE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void areDetailsDisplayed() {
		
		// companyinfopage.AreDetailsDisplayed();
		try {
			System.out.println("[MMS_COMPANYINFO : are details displayed ??]");
			// List<WebElement> l =
			// EY_FW_Utility.getAllElementsByAnyLocator(MMS_Locators.DISPLYEDIINFO_LIST);
			MatcherAssert.assertThat(
					EY_FW_Utility.getElementListByLocator(MMS_MyCompanyInfoPageLocator.DISPLYEDIINFO_LIST).size(),
					equalTo(5));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void clickeditButton() {
		companyinfopage.clickEditButton();
	}

	@Step
	public void verifyEditPopup(String s) {
		// companyinfopage.verifyEditCompanypopup(s);
		try {
			System.out.println("[MMS_MY Company Info : verifyEditCompanypopup] Verifying edit company popup title ");
			MatcherAssert.assertThat(EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.EDITCOMPANYPOPUP).getText(),
					equalTo(s));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void verifyEditPopupDetails() {
		//companyinfopage.verifyPopupDeatils();
		try {
			System.out.println("[MMS_MY Company Info : verifypopupdetails] Verifying edit company popup details");
			MatcherAssert.assertThat(true,equalTo(
					EY_FW_Utility.isElementPresent(MMS_MyCompanyInfoPageLocator.MARK)
							&& EY_FW_Utility.isElementPresent(MMS_MyCompanyInfoPageLocator.NAME)
							&& EY_FW_Utility.isElementPresent(MMS_MyCompanyInfoPageLocator.APNUMBER)
							&& EY_FW_Utility.isElementPresent(MMS_MyCompanyInfoPageLocator.ARNUMBER)
							&& EY_FW_Utility.isElementPresent(MMS_MyCompanyInfoPageLocator.TAXPAYERID)));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void verifyEditPopupButtons() {
		//companyinfopage.verifyPopupButtons();
		try {
			System.out
					.println("[MMS_MY Company Info : verifyPopupButtons] Verifying edit company popup button details");
			MatcherAssert.assertThat(true, equalTo(EY_FW_Utility.isElementPresent(MMS_MyCompanyInfoPageLocator.EDITSAVEBUTTON)
					&& EY_FW_Utility.isElementPresent(MMS_MyCompanyInfoPageLocator.CANCELBUTTON)));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void editPopupDetails(String s1, String s2, String s3, String s4, String s5) {
		companyinfopage.EditPopupDetails(s1, s2, s3, s4, s5);
	}

	@Step
	public void clickCancelButton() {
		companyinfopage.clickCancel();
	}

	@Step
	public void clickSaveButton() {
		companyinfopage.clickSave();
		EY_FW_Utility.doWait(4000); // refresh
	}

	@Step
	public void clickAddContactButton() {
		companyinfopage.clickAddContact();
	}

	@Step
	public void verifyTrueDetails(String s1, String s2, String s3, String s4, String s5) {
		//companyinfopage.verifyPopupDetails(s1, s2, s3, s4, s5);
		try {
			System.out.println("[MMS_MY Company Info : Editpopupdetails]  verifying company popup details");
			EY_FW_Utility.doWait(5000); // verification step
			
			MatcherAssert.assertThat(
					EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.DISPLYEDIINFO_LIST1).getText(),
					equalTo(s1));
			MatcherAssert.assertThat(
					EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.DISPLYEDIINFO_LIST2).getText(),
					equalTo(s2));
			MatcherAssert.assertThat(
					EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.DISPLYEDIINFO_LIST3).getText(),
					equalTo(s3));
			MatcherAssert.assertThat(
					EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.DISPLYEDIINFO_LIST4).getText(),
					equalTo(s4));
			MatcherAssert.assertThat(
					EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.DISPLYEDIINFO_LIST5).getText(),
					equalTo(s5));

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void verifyFailDetails(String s1, String s2, String s3, String s4, String s5) {
		companyinfopage.verifyFailPopupDetails(s1, s2, s3, s4, s5);
	}

	@Step
	public void addContactDetails(String s1, String s2, String s3, String s4, String s5, String s6, String s7,
			String s8, String s9, String s10, String s11) {
		companyinfopage.enterContactDetails(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
	}

	@Step
	public void clickActions(String s) {
		companyinfopage.clickActions(s);
	}

	@Step
	public void clickActionsUserManager() {
		mmsusermanager.clickActionsUserManager();
		EY_FW_Utility.doWait(1000);
	}

	@Step
	public void clickActionList(String s) {
		mmsusermanager.clickActionList(s);
	}

	@Step
	public void clickCompanyActionList(String s) {
		companyinfopage.clickCompanyActionList(s);
		EY_FW_Utility.doWait(1000);
	}

	@Step
	public void user_Can_See_Buttons() {
		try {
			MatcherAssert.assertThat(true, equalTo(EY_FW_Utility.isElementPresent(MMS_ExceptionTrackingPageLocator.CONFIRMEXCEPTIONTRACKER)
					&& EY_FW_Utility.isElementPresent(MMS_MyCompanyInfoPageLocator.CANCEL_DISABLECONTACTS)));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void selectAll() {
		mmsusermanager.selectAll();
	}
	/*
	 * @Step public void clickActionList(String s){
	 * mmsusermanager.clickactionlist(s); }
	 */

	@Step
	public void clickCancelContacts() {
		companyinfopage.clickContactsCancel();
	}

	@Step
	public void clickSaveContacts() {
		companyinfopage.clickContactsSave();
	}

	@Step
	public void clickSavePopup() {
		companyinfopage.savePopup();
		EY_FW_Utility.doWait(3000); // updation
	}

	@Step
	public void verifyEnabledText(String s) {
		EY_FW_Utility.doWait(3000); // verification
		//companyinfopage.verifyEnabledtext(s);
		MatcherAssert.assertThat(EY_FW_Utility.mms_getTextOfField(MMS_MyCompanyInfoPageLocator.contacttable, CompanyInformationPage.rownumber, 4), equalTo(s));
	}

	@Step
	public void clickAdduser() {
		mmsusermanager.clickAdduser();
	}

	@Step
	public void clickSaveUser() {
		mmsusermanager.clickSaveUser();
	}

	@Step
	public void clickCancelUser() {
		mmsusermanager.clickCancelUser();
		EY_FW_Utility.doWait(3000);
	}

	@Step
	public void clickEnableUser() {
		mmsusermanager.enableUser();
	}

	@Step
	public void clickDisableUser() {
		mmsusermanager.clickDisableUser();
	}

	@Step
	public void verifyUserDisplayDetails() {
		//mmsusermanager.verifyUserdisplayDeatils();
		try {
			EY_FW_Utility.doWait(3000);
			System.out.println("[MMS_Add user : verify add user] Verifying add user details");
			MatcherAssert.assertThat(true,equalTo(
					EY_FW_Utility.isElementPresent(MMS_AddUserPageLocator.UserName)
							&& EY_FW_Utility.isElementPresent(MMS_AddUserPageLocator.FirstName)
							&& EY_FW_Utility.isElementPresent(MMS_AddUserPageLocator.LastName)
							&& EY_FW_Utility.isElementPresent(MMS_AddUserPageLocator.Email)
							&& EY_FW_Utility.isElementPresent(MMS_AddUserPageLocator.SaveUser)
							&& EY_FW_Utility.isElementPresent(MMS_AddUserPageLocator.CancelUser)));
			// assertThat(EY_FW_Utility.getAllElementsByAnyLocator(MMS_UserProfilePageLocator.ROLES).size(),
			// equalTo(3));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void enterUserDeatisl(String firstName, String lastName, String email, String userName, String role) {
		mmsusermanager.enterUserDetails(firstName,lastName,email,userName,role);
	}

	@Step
	public void editUserDeatisl(String s2, String s3, String s4, String s5) {
		mmsusermanager.editUserDetails(s2, s3, s4, s5);// UserDetails(s1, s2,
														// s3, s4, s5);
	}

	@Step
	public void clickFilterButton() {
		mmsusermanager.clickFilter();
	}

	@Step
	public void enterFilterDetails(String s1, String s2, String s3) {
		mmsusermanager.enterFilterDetails(s1, s2, s3);
	}

	@Step
	public void clickSaveFilter() {
		mmsusermanager.saveFilter();
		EY_FW_Utility.doWait(10000);// refreshment of data - too huge
	}

	@Step
	public void clickCancelFilter() {
		mmsusermanager.cancelFilter();
	}

	@Step
	public void verifyFilter() {
		//mmsusermanager.verifyFilterdisplayDeatils();
		try {
			System.out.println("[MMS_User Manager : verify filter display buttons] ");
			MatcherAssert.assertThat(true,equalTo(
					EY_FW_Utility.isElementPresent(MMS_UserManagerPageLocator.FilterUserName)
							&& EY_FW_Utility.isElementPresent(MMS_UserManagerPageLocator.FilterRoles_DROPDOWN)
							&& EY_FW_Utility.isElementPresent(MMS_UserManagerPageLocator.FilterApprovalTiers_DROPDOWN)
							&& EY_FW_Utility.isElementPresent(MMS_UserManagerPageLocator.FilterEnabled_DROPDOWN)
							&& EY_FW_Utility.isElementPresent(MMS_UserManagerPageLocator.FilterSave)
							&& EY_FW_Utility.isElementPresent(MMS_UserManagerPageLocator.FilterCancel)));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void enterFilterUserNameFilter(String s) {
		mmsusermanager.enterFilterUserNameFilter(s);
	}

	@Step
	public void confirm() {
		EY_FW_Utility.doWait(2000); // load
		mmsusermanager.confirm();
	}

	@Step
	public void verifyUserProfiledetails() {
		//userprofile.verifyUserDisplayDeatils();
		try {
			System.out.println("[MMS_User Profile : verify user display] Verifying user details");
			MatcherAssert.assertThat(true,equalTo(
					EY_FW_Utility.isElementPresent(MMS_UserProfilePageLocator.up_UserName)
							&& EY_FW_Utility.isElementPresent(MMS_UserProfilePageLocator.up_FirstName)
							&& EY_FW_Utility.isElementPresent(MMS_UserProfilePageLocator.up_LastName)
							&& EY_FW_Utility.isElementPresent(MMS_UserProfilePageLocator.email)
							&& EY_FW_Utility.isElementPresent(MMS_UserProfilePageLocator.Change_pwd)
							&& EY_FW_Utility.isElementPresent(MMS_UserProfilePageLocator.save_pwd)
							// &&
							// EY_FW_Utility.isElementPresent(MMS_Locators.UP_Admin)
							// &&
							// EY_FW_Utility.isElementPresent(MMS_Locators.UP_User)
							// &&
							// EY_FW_Utility.isElementPresent(MMS_Locators.UP_UserEditor)
							&& EY_FW_Utility.isElementPresent(MMS_UserProfilePageLocator.cancelpwd)));
			// assertThat(EY_FW_Utility.getCurrentPageTitle(),
			// equalTo(MMS_ExpectedResult.USERProfile_PAGE_TITLE));
			// assertThat(EY_FW_Utility.getAllElementsByAnyLocator(MMS_UserProfilePageLocator.ROLES).size(),
			// equalTo(3));

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void isEditable(String s) {
		userprofile.isEditable(s);
	}

	@Step
	public void isNoteditable(String s) {
		userprofile.isNoteditable(s);
	}

	@Step
	public void clickCancelOption() {
		userprofile.clickCancelPassword();
	}

	@Step
	public void clickSavePassword() {
		userprofile.clickSave();
	}

	@Step
	public void clickChangePassword() {
		userprofile.clickChangePassword();
	}

	@Step
	public void enterUserName(String s) {
		userprofile.enterUsername(s);
	}

	@Step
	public void enterFirstName(String s) {
		userprofile.enterFirstName(s);
	}

	@Step
	public void enterLastName(String s) {
		userprofile.enterLastName(s);
	}

	@Step
	public void enterOldPassword(String s) {
		userprofile.enterOldPassword(s);
	}

	@Step
	public void enterNewPassword(String s) {
		userprofile.enterNewPassword(s);
	}

	@Step
	public void enterConfirmPassword(String s) {
		userprofile.confirmPassword(s);
	}

	@Step
	public void enterEmail(String s) {
		userprofile.enterEmail(s);
	}

	@Step
	public void clickLogout() {
		userprofile.clickLogout();
	}

}
