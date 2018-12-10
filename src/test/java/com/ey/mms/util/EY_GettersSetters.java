/**
 * @Copyright Copyright (C) 2016 General Electric Company. All rights reserved.
 * @author  Ankur Chaudhry
 * @version 1.0
 * @since   2016-07-12
 */

package com.ey.mms.util;

import java.awt.Toolkit;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.webdriver.WebdriverManager;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class EY_GettersSetters {

	private static WebDriver driver;

	private static Logger APP_LOGS = null;

	private static Logger setLogger() {
		if (APP_LOGS == null)
			APP_LOGS = LogManager.getLogger(EY_GettersSetters.class.getName());
		return APP_LOGS;
	}

	/*
	 * public static WebDriver getDriver() { //try { if (driver == null) {
	 * setDriver(); driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS); }
	 * return driver; } catch (Exception e) {
	 * setLogger().error("[EY_GettersSetters: getDriver] Exception thrown -- " +
	 * EY_FW_Utility.getStackTrace(e)); Assert.assertTrue(false,
	 * e.getMessage()); return null; } }
	 */

	public static WebDriver getDriver() {
		if (driver == null) {
			/*
			 * ProfilesIni profile = new ProfilesIni(); FirefoxProfile myprofile
			 * = profile.getProfile("seleniumProfile");
			 * myprofile.setPreference("browser.download.folderList",2);
			 * myprofile.setPreference(
			 * "browser.download.manager.showWhenStarting",false);
			 * myprofile.setPreference("browser.download.dir",
			 * "C:\\Users\\212470878\\Downloads");
			 * myprofile.setPreference("browser.helperApps.neverAsk.saveToDisk",
			 * "text/csv/pdf"); driver = new FirefoxDriver(myprofile);
			 */
			setDriver();
            //driver.manage().deleteAllCookies();
			//driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			/*
			 * Toolkit toolkit = Toolkit.getDefaultToolkit(); int Width = (int)
			 * toolkit.getScreenSize().getWidth();// 1234; int Height = (int)
			 * toolkit.getScreenSize().getHeight(); // 1040; Dimension
			 * screenResolution = new Dimension(Width, Height);
			 * driver.manage().window().setSize(screenResolution);
			 */
			/*
			 * _driver.Manage().Window.Maximize();
			 * ((IJavaScriptExecutor)_driver).ExecuteScript(
			 * "window.resizeTo(screen.width, screen.height)");
			 * _driver.Manage().Window.Position = new Point(0, 0);
			 * _driver.Manage().Window.Size = new
			 * Size(Screen.PrimaryScreen.WorkingArea.Width,
			 * Screen.PrimaryScreen.WorkingArea.Height);
			 * _driver.FindElement(By.CssSelector("body")).SendKeys(Keys.F11);
			 * _driver.Navigate().GoToUrl("about:blank");
			 * 
			 */

			/*
			 * //driver.get("google.com/"); //Thread.sleep(3000);
			 * driver.manage().window().maximize();
			 * ((JavascriptExecutor)driver).
			 * executeScript("window.resizeT‌​o(screen.width, screen.height)");
			 * driver.manage().window().setPosition(new Point(0, 0));
			 * driver.manage().window().setSize(new Dimension(1500,1800));
			 * driver.findElement(By.tagName("body")).sendKeys(Keys.F11);
			 * //Thread.sleep(4000);
			 */
			/*
			 * Dimension dimensions2=driver.manage().window().getSize();
			 * System.out.println("Width b4 : "+dimensions2.width);
			 * System.out.println("Height : "+dimensions2.height);
			 * driver.manage().window().maximize();
			 * 
			 * Dimension dimensions=driver.manage().window().getSize();
			 * System.out.println("Width : "+dimensions.width);
			 * System.out.println("Height : "+dimensions.height);
			 */
			// driver.manage().window().fullscreen();

			/*
			 * Dimension dimension = new Dimension(1600,1300); //1516,1260
			 * driver.manage().window().setSize(dimension);
			 * 
			 * Dimension dimensions2=driver.manage().window().getSize();
			 * System.out.println("Width after : "+dimensions2.width);
			 * System.out.println("Height : "+dimensions2.height);
			 */
			/*
			 * driver.findElement(By.tagName("body")).sendKeys(Keys.F11); //
			 * 1280,1024
			 * 
			 * //Set the upper left corner of the screen starting point
			 * driver.manage().window().setPosition(new Point(0,0)); //define
			 * screen size java.awt.Dimension screenSize =
			 * java.awt.Toolkit.getDefaultToolkit().getScreenSize(); // define
			 * desired size Dimension maxWindowSize = new Dimension((int)
			 * screenSize.getWidth(), (int) screenSize.getHeight()); // Maximize
			 * the browser window according to your system's current
			 * resolution(set desired size)
			 * driver.manage().window().setSize(maxWindowSize); Dimension
			 * dimensions1=driver.manage().window().getSize();
			 * System.out.println("Width : "+dimensions1.width);
			 * System.out.println("Height : "+dimensions1.height);
			 */
			// ((FirefoxDriver) driver).executeScript("window.resizeTo(1024,
			// 768);");

			// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		return driver;
	}

	/**
	 **********************************************************************
	 * @Function Name : setDriver
	 * @Description : Set Driver Instance as generated by the Framework
	 * @Param : null
	 * @Return : null
	 * @Date : 2016-07-12
	 * @Author : Ankur Chaudhry
	 ***********************************************************************
	 */
	private static void setDriver() {
		// DesiredCapabilities capabilities = DesiredCapabilities.firefox();

		// capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
		// "ignore");

		// capabilities.setJavascriptEnabled(true);
		// EY_GettersSetters.driver=
		// Serenity.getWebdriverManager().getWebdriver();
		EY_GettersSetters.driver = Injectors.getInjector().getInstance(WebdriverManager.class).getWebdriver();
	}

}
