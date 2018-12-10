/**
 * @Copyright Copyright (C) 2016 General Electric Company. All rights reserved.
 * @author  Ankur Chaudhry
 * @version 1.0
 * @since   2016-07-12
 * @description MMS LoginPage Class containing Page Functions for Login
 */

package com.ey.mms.pageobjects;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.*;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.EY_GettersSetters;
import com.ey.mms.util.PropertyReader;

import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {

	public void openURL() {
		String url = new PropertyReader().readProperty("appurl");
		System.out.println("[MMS_LoginPage : openURL] Opening WebURL:  " + url);
		EY_GettersSetters.getDriver().manage().deleteAllCookies();
		EY_GettersSetters.getDriver().manage().window().maximize();
		openAt(url);
	}

	public void enterUserId(String userid) {
		try {
			System.out.println("[MMS_LoginPage : enterUserId] Entering '" + userid + "' in UserField");
			WebElement userNameTextField = EY_FW_Utility
					.findElementByLocator(MMS_LoginpageLocator.USERNAME_INPUTFIELD_LOCATOR);
			userNameTextField.clear();
			userNameTextField.sendKeys(userid);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void enterPassword(String pwd) {
		try {
			System.out.println("[MMS_LoginPage : enterPassword] Entering '" + pwd + "' in PasswordField");
			WebElement passwordTextField = EY_FW_Utility
					.findElementByLocator(MMS_LoginpageLocator.PASSWORD_INPUTFIELD_LOCATOR);
			passwordTextField.clear();
			passwordTextField.sendKeys(pwd);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickLoginButton() {
		try {
			System.out.println("[MMS_LoginPage : clickLoginButton] Clicking Login Button");
			EY_FW_Utility.findElementByLocator(MMS_LoginpageLocator.SUBMIT_BUTTON_LOCATOR).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public String getHomePageTitle() {
		System.out.println("[MMS_LoginPage : getHomePageTitle] Returning Home Page Title");
		return EY_FW_Utility.getCurrentPageTitle();
	}

}
