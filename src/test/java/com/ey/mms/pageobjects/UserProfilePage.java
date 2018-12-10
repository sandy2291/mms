package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.testng.AssertJUnit.assertEquals;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.MMS_UserProfilePageLocator;
import com.ey.mms.util.EY_FW_Utility;

import net.serenitybdd.core.pages.PageObject;

public class UserProfilePage extends PageObject {
	/*
	 * public void verifyUserProfilePageTitle() { try { System.out
	 * .println("[MMS_UserProfile : verifyUserProfilePageTitle] Verifying User profile page info title as "
	 * + MMS_ExpectedResult.USERProfile_PAGE_TITLE);
	 * assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.USERProfile_PAGE_TITLE)); } catch (Exception
	 * e) { Assert.assertTrue(false, e.getMessage()); } }
	 */

	public void enterUsername(String userName) {
		try {
			EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.up_UserName).clear();
			EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.up_UserName).sendKeys(userName);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterFirstName(String name) {
		try {
			EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.up_FirstName).clear();
			EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.up_FirstName).sendKeys(name);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterLastName(String name) {
		try {
			EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.up_LastName).clear();
			EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.up_LastName).sendKeys(name);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterEmail(String email) {
		try {
			EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.email).clear();
			EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.email).sendKeys(email);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickChangePassword() {
		try {
			EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.Change_pwd).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterOldPassword(String password) {
		try {
			EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.oldpwd).clear();
			EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.oldpwd).sendKeys(password);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterNewPassword(String password) {
		try {
			EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.newpwd).clear();
			EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.newpwd).sendKeys(password);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void confirmPassword(String password) {
		try {
			EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.confirmpwd).clear();
			EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.confirmpwd).sendKeys(password);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickSave() {
		try {
			EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.save_pwd).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickCancelPassword() {
		try {
			EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.cancelpwd).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void isEditable(String textEditable) {
		try {
			WebElement e = EY_FW_Utility.findElementByLocator(textEditable);
			String result = e.getAttribute("readonly");
			Assert.assertNull(result);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void isNoteditable(String textEditable) {
		try {
			WebElement e = EY_FW_Utility.findElementByLocator(textEditable);
			String result = e.getAttribute("readonly");
			Assert.assertNotNull(result);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*public void verifyUserDisplayDeatils() {
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
	}*/

	public void clickLogout() {
		EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.TOPRIGHT).click();
		// EY_FW_Utility.doWait(2000);
		EY_FW_Utility.findElementByLocator(MMS_UserProfilePageLocator.LOGOUT).click();
		// EY_FW_Utility.doWait(3000);
	}

}
