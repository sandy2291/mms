/**
* @Copyright Copyright (C) 2016 General Electric Company. All rights reserved.
* @author  Ankur Chaudhry
* @version 1.0
* @since   2016-08-24
*/

package com.ey.mms.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import net.thucydides.core.webdriver.DriverSource;

public class EY_CustomDriver implements DriverSource {
	@Override
	public WebDriver newDriver() {
		try {

			DesiredCapabilities dc = DesiredCapabilities.firefox();
			dc.setJavascriptEnabled(true);
			dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, "ignore");
			/*ProfilesIni profile = new ProfilesIni();
			FirefoxProfile myprofile = profile.getProfile("seleniumProfile");
			myprofile.setPreference("browser.download.folderList",2);
			myprofile.setPreference("browser.download.manager.showWhenStarting",false);
			myprofile.setPreference("browser.download.dir","C:\\Users\\212470878\\Downloads");
			myprofile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");

			WebDriver driver = new FirefoxDriver(myprofile);
*/			
			WebDriver driver = new FirefoxDriver(dc);
			return driver;
		} catch (Exception e) {
			throw new Error(e);
		}
	}

	@Override
	public boolean takesScreenshots() {
		// TODO Auto-generated method stub
		return true;
	}

}
