package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.testng.AssertJUnit.assertEquals;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.MMS_AddUserPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_UserManagerPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_UserProfilePageLocator;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.EY_MMS_FW_Constants;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class UserManagerPage extends PageObject {

	/*
	 * public void verifyUserManagerPageTitle() { try {
	 * EY_FW_Utility.doWait(3000); System.out.println(
	 * "[MMS_UserManager : verifyUserManagePageTitle] Verifying User Manager page info title as "
	 * + MMS_ExpectedResult.USER_MANAGER_PAGE_TITLE);
	 * assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.USER_MANAGER_PAGE_TITLE)); } catch (Exception
	 * e) { Assert.assertTrue(false, e.getMessage()); } }
	 */

	/*
	 * public void verifyAddUserPageTitle() { try { EY_FW_Utility.doWait(3000);
	 * System.out.println(
	 * "[MMS_AddUser : verifyAddUserPageTitle] Verifying add User page info title as "
	 * + MMS_ExpectedResult.ADDUSER_PAGE_TITLE);
	 * assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.ADDUSER_PAGE_TITLE)); } catch (Exception e) {
	 * Assert.assertTrue(false, e.getMessage()); } }
	 */

	/*
	 * public void verifyEditUserPageTitle() { try { EY_FW_Utility.doWait(3000);
	 * System.out.println(
	 * "[MMS_AddUser : verifyEditUserPageTitle] Verifying add User page info title as "
	 * + MMS_ExpectedResult.EDITUSER_PAGE_TITLE);
	 * assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.EDITUSER_PAGE_TITLE)); } catch (Exception e) {
	 * Assert.assertTrue(false, e.getMessage()); } }
	 */

/*	public void verifyUserdisplayDeatils() {
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
	}*/

	public void enterUserDetails(String firstName, String lastName, String email, String userName, String role) {
		try {
			System.out.println("[MMS_ADD User : EnterUserDetails]  entering user details");

			EY_FW_Utility.findElementByLocator(MMS_AddUserPageLocator.FirstName).clear();
			EY_FW_Utility.findElementByLocator(MMS_AddUserPageLocator.LastName).clear();
			EY_FW_Utility.findElementByLocator(MMS_AddUserPageLocator.Email).clear();
			EY_FW_Utility.findElementByLocator(MMS_AddUserPageLocator.UserName).clear();

			EY_FW_Utility.findElementByLocator(MMS_AddUserPageLocator.UserName).sendKeys(firstName);
			EY_FW_Utility.findElementByLocator(MMS_AddUserPageLocator.FirstName).sendKeys(lastName);
			EY_FW_Utility.findElementByLocator(MMS_AddUserPageLocator.LastName).sendKeys(email);
			EY_FW_Utility.findElementByLocator(MMS_AddUserPageLocator.Email).sendKeys(userName);
			EY_FW_Utility.findElementByLocator(MMS_AddUserPageLocator.Roles).click();;


		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void editUserDetails(String firstName, String lastName, String email, String role) {
		try {
			System.out.println("[MMS_ADD User : EditUserDetails]  editing user details");

			EY_FW_Utility.findElementByLocator(MMS_AddUserPageLocator.FirstName).clear();
			EY_FW_Utility.findElementByLocator(MMS_AddUserPageLocator.LastName).clear();
			EY_FW_Utility.findElementByLocator(MMS_AddUserPageLocator.Email).clear();
			// EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.UserName).clear();

			// EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.UserName).sendKeys(s1);
			EY_FW_Utility.findElementByLocator(MMS_AddUserPageLocator.FirstName).sendKeys(firstName);
			EY_FW_Utility.findElementByLocator(MMS_AddUserPageLocator.LastName).sendKeys(lastName);
			EY_FW_Utility.findElementByLocator(MMS_AddUserPageLocator.Email).sendKeys(email);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickSaveUser() {
		try {
			System.out.println("[MMS_ADD USER clicksaveuser] : clicking on save user");
			EY_FW_Utility.findElementByLocator(MMS_AddUserPageLocator.SaveUser).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickCancelUser() {
		try {
			System.out.println("[MMS_ADD USER clickcanceluser] : clicking on cancel user");
			EY_FW_Utility.findElementByLocator(MMS_AddUserPageLocator.CancelUser).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickAdduser() {
		try {
			System.out.println("[MMS_ADD USER clickadduser] : clicking on add user");
			EY_FW_Utility.findElementByLocator(MMS_UserManagerPageLocator.Add_User).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickDisableUser() {
		try {
			System.out.println("[MMS_ADD USER clickdisableuser] : clicking on disable user");
			EY_FW_Utility.findElementByLocator(MMS_UserManagerPageLocator.Disable_Users).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enableUser() {
		try {
			System.out.println("[MMS_ADD USER enableuser] : clicking on enable user");
			EY_FW_Utility.findElementByLocator(MMS_UserManagerPageLocator.Enable_Users).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickActionsUserManager() {
		try {
			System.out.println("[MMS_USER Manager clickactions] : clicking on actions");
			EY_FW_Utility.findElementByLocator(MMS_UserManagerPageLocator.Actions_userManager).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickActionList(String s) {
		try {
			System.out.println("[MMS_USER MANAGER : clickactionlist], clicking on action list");

			/*
			 * MMS_UserManagerPageLocator.actionlist1,
			 * MMS_UserManagerPageLocator.actionlist2, rownumber, 6, s);
			 */
			EY_FW_Utility.clickMMSActionList(MMS_MyCompanyInfoPageLocator.contacttable,
					MMS_UserManagerPageLocator.actionlist1, MMS_UserManagerPageLocator.actionlist2, 1, 8, s);
			/*getDriver().findElement(By
					.xpath("//table[@id='DataTables_Table_0']/tbody/tr[1]/td[8]/div/ul/li[a[contains(.,'" + s + "')]]"))
					.click();*/
			// "//*[@id='DataTables_Table_0']/tbody/tr[1]/td[8]/div/ul/li[a[contains(.,'Edit')]]"

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickFilter() {
		try {
			System.out.println("[MMS_USER MANAGER : clickFilter] clicking on filter");
			EY_FW_Utility.findElementByLocator(MMS_UserManagerPageLocator.User_Manager_Filter).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterFilterDetails(String role, String aaptier, String enable) {
		try {
			System.out.println("[MMS_USER Manager : enterFilterDetails],Entereing filter data");
			WebElement roles = EY_FW_Utility.findElementByLocator(MMS_UserManagerPageLocator.FilterRoles_DROPDOWN);
			Select dropdown = new Select(roles);
			dropdown.selectByVisibleText(role);
			WebElement approvalTier = EY_FW_Utility
					.findElementByLocator(MMS_UserManagerPageLocator.FilterApprovalTiers_DROPDOWN);
			Select apptier = new Select(approvalTier);
			apptier.selectByVisibleText(aaptier);
			WebElement enabled = EY_FW_Utility
					.findElementByLocator(MMS_UserManagerPageLocator.FilterEnabled_DROPDOWN);
			Select enb = new Select(enabled);
			enb.selectByVisibleText(enable);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void saveFilter() {
		try {
			System.out.println("[clicking on save filter ]");
			EY_FW_Utility.findElementByLocator(MMS_UserManagerPageLocator.FilterSave).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void cancelFilter() {
		try {
			System.out.println("[clicking on cancel filter ]");
			EY_FW_Utility.findElementByLocator(MMS_UserManagerPageLocator.FilterCancel).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterFilterUserNameFilter(String userName) {
		try {
			System.out.println("[clicking on cancel filter ]");
			EY_FW_Utility.findElementByLocator(MMS_UserManagerPageLocator.FilterUserName).clear();
			EY_FW_Utility.findElementByLocator(MMS_UserManagerPageLocator.FilterUserName).sendKeys(userName);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*public void verifyFilterdisplayDeatils() {
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
	}*/

	public void selectAll() {
		try {
			System.out.println("[selectAll : selecting all]");
			EY_FW_Utility.findElementByLocator(MMS_AddUserPageLocator.SELECTALL).click();

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void confirm() {
		try {
			System.out.println("[confirm : confirm disable or enable users]");
			EY_FW_Utility.findElementByLocator(MMS_AddUserPageLocator.CONFIRM).click();

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
}
