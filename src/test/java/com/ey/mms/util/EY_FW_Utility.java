/**
 * @Copyright Copyright (C) 2016 General Electric Company. All rights reserved.
 * @since   2016-07-12
 * @description Frame Work Utility Class. Contains functions which can be reuse across entire test scripts
 */

package com.ey.mms.util;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import org.openqa.selenium.JavascriptExecutor;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hamcrest.MatcherAssert;
import org.hamcrest.text.IsEqualIgnoringCase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
//import com.jcraft.jsch.*;

/**
 * <h1>Framework Utility Functions Library</h1> Frame Work Utility Class.
 * Contains functions which can be reuse across entire test scripts
 * 
 * @since 2016-07-12
 */

public class EY_FW_Utility {
	private static WebDriver driver = EY_GettersSetters.getDriver();
	private static Logger APP_LOGS = null;

	private static Logger setLogger() {
		if (APP_LOGS == null)
			APP_LOGS = LogManager.getLogger(EY_FW_Utility.class.getName());
		return APP_LOGS;
	}

	/**
	 ***************************************************************************************
	 * Wait time so that script will wait to continue to next step.
	 * 
	 * @param milliSeconds
	 *            This is wait time in milli seconds.
	 ***************************************************************************************
	 */
	public static void doWait(long milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: doWait] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/**
	 **************************************************************************************
	 * Wait till the page loads with in the provided time units.
	 * 
	 * @param loadTime
	 *            This is load time in seconds
	 **************************************************************************************
	 */
	public static void waitTillPageLoad(int loadTime) {
		driver.manage().timeouts().pageLoadTimeout(loadTime, TimeUnit.SECONDS);
		// driver.manage().timeouts().pageLoadTimeout(loadTime,
		// TimeUnit.SECONDS);
		// http://www.testingexcellence.com/webdriver-wait-page-load-example-java/
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};
		try {
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, loadTime);
			wait.until(expectation);
		} catch (Throwable error) {
			Assert.fail("Timeout waiting for Page Load Request to complete.");
		}
	}

	/**
	 **************************************************************************************
	 * Select the Name from the drop down of the given drop down locator.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 * @param Name
	 *            This is name which needs to be selected in String format.
	 **************************************************************************************
	 */
	public static void selectDropDownElementByVisibleText(String locatorPath, String Name) {
		try {
			Select selectitem = new Select(findElementByLocator(locatorPath));
			selectitem.selectByVisibleText(Name);
		} catch (Exception e) {
			setLogger().error(
					"[EY_FW_Utility: selectDropDownElementByVisibleText] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public static boolean isCheckboxSelected(String locatorPath) {
		try {

			WebElement checkBox = findElementByLocator(locatorPath);
			boolean checkedStatus = checkBox.isSelected();
			return checkedStatus;

		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: isCheckboxSelected] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return false;
		}

	}

	/**
	 ***************************************************************************************
	 * Select the Value from the drop down of the given drop down locator.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 * @param value
	 *            This is value which needs to be selected in String format.
	 ***************************************************************************************
	 */
	public static void selectDropDownElementByValue(String locatorPath, String value) {
		try {
			Select selectitem = new Select(findElementByLocator(locatorPath));
			selectitem.selectByValue(value);
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: selectDropDownElementByValue] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/**
	 *****************************************************************************************
	 * Select the Index from the drop down of the given drop down locator.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 * @param index
	 *            This is index which needs to be selected in Integer format.
	 *****************************************************************************************
	 */
	public static void selectDropDownElementByIndex(String locatorPath, int index) {
		try {
			Select selectitem = new Select(findElementByLocator(locatorPath));
			selectitem.selectByIndex(index);
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: selectDropDownElementByIndex] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/**
	 ******************************************************************************************
	 * Click any element from given List.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 * @param valueToSelect
	 *            This is value to select in String format.
	 ******************************************************************************************
	 */
	public static void clickElementFromListOfElements(String locatorPath, String valueToSelect) {
		try {

			List<WebElement> lst = getElementListByLocator(locatorPath);
			for (WebElement f : lst) {
				System.out.println("value in the list : " + f.getText());
				if (valueToSelect.equals(f.getText())) {
					f.click();
					break;
				}
			}
		} catch (Exception e) {
			setLogger()
					.error("[EY_FW_Utility: clickElementFromListOfElements] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/**
	 *****************************************************************************************
	 * Click on sub element from given List.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 * @param subElement
	 *            This is sub Element name in String format.
	 * @param valueToSelect
	 *            This is value to select in String format.
	 *****************************************************************************************
	 */
	public static void clickSubElementFromListOfElements(String locatorPath, String subElement, String valueToSelect) {
		try {
			WebElement mainElement = findElementByLocator(locatorPath);
			List<WebElement> subList = mainElement.findElements(By.xpath("//" + subElement));
			for (WebElement f : subList) {
				if (valueToSelect.equals(f.getText())) {
					f.click();
					break;
				}
			}
		} catch (Exception e) {
			setLogger().error(
					"[EY_FW_Utility: clickSubElementFromListOfElements] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/**
	 *****************************************************************************************
	 * Click on the given radio button if not selected.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 *****************************************************************************************
	 */
	public static void selectRadioButton(String locatorPath) {
		try {
			WebElement radio = findElementByLocator(locatorPath);
			boolean checkstatus;
			checkstatus = radio.isSelected();
			if (checkstatus == false) {
				radio.click();
			}
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: selectRadioButton] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/**
	 *****************************************************************************************
	 * Click on the given radio button if selected.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 *****************************************************************************************
	 */
	public static void deselectRadioButton(String locatorPath) {
		try {
			WebElement radio = findElementByLocator(locatorPath);
			boolean checkstatus;
			checkstatus = radio.isSelected();
			if (checkstatus == true) {
				radio.click();
			}
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: deselectRadioButton] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/**
	 ****************************************************************************************
	 * Find element based on the input locator path.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 * @return WebElement.
	 ***************************************************************************************
	 */
	public static WebElement findElementByLocator(String locatorPath) {
		try {
			long waitTime = 120;
			WebDriverWait w = new WebDriverWait(driver, waitTime);
			if (locatorPath.startsWith("css_")) {
				WebElement we = w.until(
						ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locatorPath.replace("css_", ""))));
				return we;
			} else if (locatorPath.startsWith("xpath_")) {
				WebElement we = w.until(
						ExpectedConditions.presenceOfElementLocated(By.xpath(locatorPath.replace("xpath_", ""))));
				return we;
			} else if (locatorPath.startsWith("id_")) {
				WebElement we = w
						.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorPath.replace("id_", ""))));
				return we;
			} else if (locatorPath.startsWith("name_")) {
				WebElement we = w.until(
						ExpectedConditions.visibilityOfElementLocated(By.name(locatorPath.replace("name_", ""))));
				return we;
			} else if (locatorPath.startsWith("link_")) {
				WebElement we = w.until(
						ExpectedConditions.visibilityOfElementLocated(By.linkText(locatorPath.replace("link_", ""))));
				return we;
			} else if (locatorPath.startsWith("partial_")) {
				WebElement we = w.until(ExpectedConditions
						.visibilityOfElementLocated(By.partialLinkText(locatorPath.replace("partial_", ""))));
				return we;
			} else if (locatorPath.startsWith("class_")) {
				WebElement we = w.until(
						ExpectedConditions.visibilityOfElementLocated(By.className(locatorPath.replace("class_", ""))));
				return we;
			} else if (locatorPath.startsWith("tag_")) {
				WebElement we = w.until(
						ExpectedConditions.visibilityOfElementLocated(By.tagName(locatorPath.replace("tag_", ""))));
				return we;
			} else
				return null;
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: findAnyElementByAnyLocator] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return null;
		}
	}


	
	public static WebElement findElementPresenceInDomByLocator(String locatorPath) {
		try {
			long waitTime = 120;
			WebDriverWait w = new WebDriverWait(driver, waitTime);
			if (locatorPath.startsWith("css_")) {
				WebElement we = w.until(
						ExpectedConditions.presenceOfElementLocated(By.cssSelector(locatorPath.replace("css_", ""))));
				return we;
			} else if (locatorPath.startsWith("xpath_")) {
				WebElement we = w.until(
						ExpectedConditions.presenceOfElementLocated(By.xpath(locatorPath.replace("xpath_", ""))));
				return we;
			} else if (locatorPath.startsWith("id_")) {
				WebElement we = w
						.until(ExpectedConditions.presenceOfElementLocated(By.id(locatorPath.replace("id_", ""))));
				return we;
			} else if (locatorPath.startsWith("name_")) {
				WebElement we = w.until(
						ExpectedConditions.presenceOfElementLocated(By.name(locatorPath.replace("name_", ""))));
				return we;
			} else if (locatorPath.startsWith("link_")) {
				WebElement we = w.until(
						ExpectedConditions.presenceOfElementLocated(By.linkText(locatorPath.replace("link_", ""))));
				return we;
			} else if (locatorPath.startsWith("partial_")) {
				WebElement we = w.until(ExpectedConditions
						.presenceOfElementLocated(By.partialLinkText(locatorPath.replace("partial_", ""))));
				return we;
			} else if (locatorPath.startsWith("class_")) {
				WebElement we = w.until(
						ExpectedConditions.presenceOfElementLocated(By.className(locatorPath.replace("class_", ""))));
				return we;
			} else if (locatorPath.startsWith("tag_")) {
				WebElement we = w.until(
						ExpectedConditions.presenceOfElementLocated(By.tagName(locatorPath.replace("tag_", ""))));
				return we;
			} else
				return null;
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: findAnyElementByAnyLocator] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return null;
		}
	}



	/**
	 ***************************************************************************************
	 * Find list of Web elements based on the input locator path.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 * @return List of WebElements.
	 ***************************************************************************************
	 */
	public static List<WebElement> getElementListByLocator(String locatorPath) {
		try {
			if (locatorPath.startsWith("css_")) {
				String s = locatorPath.replace("css_", "");
				return driver.findElements(By.cssSelector(s));
			} else if (locatorPath.startsWith("xpath_")) {
				return driver.findElements(By.xpath(locatorPath.replace("xpath_", "")));
			} else if (locatorPath.startsWith("id_")) {
				return driver.findElements(By.id(locatorPath.replace("id_", "")));
			} else if (locatorPath.startsWith("name_")) {
				return driver.findElements(By.name(locatorPath.replace("name_", "")));
			} else if (locatorPath.startsWith("link_")) {
				return driver.findElements(By.linkText(locatorPath.replace("link_", "")));
			} else if (locatorPath.startsWith("partiallink_")) {
				return driver.findElements(By.partialLinkText(locatorPath.replace("partiallink_", "")));
			} else if (locatorPath.startsWith("class_")) {
				return driver.findElements(By.xpath(locatorPath.replace("class_", "")));
			} else if (locatorPath.startsWith("tag_")) {
				return driver.findElements(By.tagName(locatorPath.replace("tag_", "")));
			} else
				return null;
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: getElementListByLocator] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return null;
		}
	}

	/**
	 *******************************************************************************************
	 * Verify the given element is present or not.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 * @return boolean True / False
	 *******************************************************************************************/
	public static boolean isElementPresent(String locatorPath) {
		try {
			findElementByLocator(locatorPath).isDisplayed();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: isElementPresent] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return false;
		}
	}

	/**
	 ******************************************************************************************
	 * Will give a CurrentPageTitle.
	 * 
	 * @return pageTitle This is Page title in String format.
	 ******************************************************************************************
	 */
	public static String getCurrentPageTitle() {
		try {
			return driver.getTitle();
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: getCurrentPageTitle] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return null;
		}
	}

	/**
	 ******************************************************************************************
	 * Will Check Alert present or not. And if alert present accept.
	 * 
	 * @return boolean True / False.
	 ******************************************************************************************
	 */
	public static boolean acceptAlert() {
		try {
			Alert a = driver.switchTo().alert();
			a.accept();
			return true;
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: acceptAlert] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return false;
		}
	}

	/**
	 ******************************************************************************************
	 * Will Check Alert present or not. And if alert present dismiss.
	 * 
	 * @return boolean True / False.
	 ******************************************************************************************
	 */
	public static boolean dimissAlert() {
		try {
			Alert a = driver.switchTo().alert();
			a.dismiss();
			return true;
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: dimissAlert] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return false;
		}
	}

	/**
	 ******************************************************************************************
	 * Perform Scrolling till it finds the element specified.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 ******************************************************************************************
	 */
	public static void scrollToElement(String locatorPath) {
		try {
			WebElement mainElement = findElementByLocator(locatorPath);
			Coordinates coordinate = ((Locatable) mainElement).getCoordinates();
			coordinate.onPage();
			coordinate.inViewPort();
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: scrolltoElement] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/**
	 ******************************************************************************************
	 * Perform double click on the element specified.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 ******************************************************************************************
	 */
	public static void doubleClickElement(String locatorPath) {
		try {
			WebElement doubleclickonWebElement = findElementByLocator(locatorPath);
			Actions builder = new Actions(driver);
			builder.doubleClick(doubleclickonWebElement).perform();
			doWait(2000);
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: doubleClickElement] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/**
	 ******************************************************************************************
	 * Perform switch To child Window operation when there is child and parent
	 * window .
	 ******************************************************************************************
	 */
	public static void switchToChildWindow() {
		try {
			@SuppressWarnings("rawtypes")
			Set s = driver.getWindowHandles();
			@SuppressWarnings("rawtypes")
			Iterator itr = s.iterator();
			@SuppressWarnings("unused")
			String w1 = (String) itr.next();
			String w2 = (String) itr.next();
			driver.switchTo().window(w2);
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: switchToChildWindow] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/**
	 ******************************************************************************************
	 * Perform switch To parent Window operation when there is child and parent
	 * window .
	 ******************************************************************************************
	 */
	public static void switchToParentWindow() {
		try {
			@SuppressWarnings("rawtypes")
			Set s = driver.getWindowHandles();
			@SuppressWarnings("rawtypes")
			Iterator itr = s.iterator();
			String w1 = (String) itr.next();
			driver.switchTo().window(w1);
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: switchToParentWindow] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/**
	 *******************************************************************************************
	 * Verify the given value is present or not in particular column of web
	 * table.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 * @param colNumber
	 *            This is column Number need to be checked for presence of given
	 *            value
	 * @param expectedValue
	 *            This is expected value which column should contain
	 *******************************************************************************************
	 */
	public static void verifyTableColumnContain(String locatorPath, int colNumber, String expectedValue) {
		try {
			EY_FW_Utility.doWait(3000); // verification
			String part1 = locatorPath; // Example: locatorPath =
										// "xpath_//table[@class='dataTable']/tbody/tr"
			String part2 = "[";
			String part3 = "]/td[";
			String part4 = Integer.toString(colNumber);
			String part5 = "]";
			int count = EY_FW_Utility.getElementListByLocator(part1).size();
			int i = 1;
			String actualValue = null;
			while (i <= count) {
				String extractedValue = findElementByLocator(part1 + part2 + i + part3 + part4 + part5).getText();
				if (extractedValue.equals(expectedValue)) {
					actualValue = extractedValue;
					break;
				}
				i++;
			}
			doWait(2000);
			MatcherAssert.assertThat(actualValue, IsEqualIgnoringCase.equalToIgnoringCase(expectedValue));
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: verifyTableColumnContains] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/**
	 *******************************************************************************************
	 * Verify the given value is present or not in particular row of web table.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 * @param rowNumber
	 *            This is row Number need to be checked for presence of given
	 *            value
	 * @param expectedValue
	 *            This is expected value which row should contain
	 *******************************************************************************************
	 */
	public static void verifyTableRowContain(String locatorPath, int rowNumber, String expectedValue) {
		try {
			String part1 = locatorPath; // Example: locatorPath =
										// "xpath_//table[@class='dataTable']/tbody/tr"
			String part2 = "[";
			String part3 = Integer.toString(rowNumber);
			String part4 = "]/td[";
			String part5 = "]";
			int i = 1;
			String actualValue = null;
			while (isElementPresent(part1 + part2 + part3 + part4 + i + part5)) {
				String extractedValue = findElementByLocator(part1 + part2 + part3 + part4 + i + part5).getText();
				if (extractedValue.equals(expectedValue)) {
					actualValue = extractedValue;
					break;
				}
				i++;
			}
			doWait(2000);
			MatcherAssert.assertThat(actualValue, equalTo(expectedValue));
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: verifyTableRowContains] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/**
	 *******************************************************************************************
	 * Verify the given value is present or not in particular row,column of web
	 * table.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 * @param rowNumber
	 *            This is row Number need to be checked for presence of given
	 *            value.
	 * @param colNumber
	 *            This is column Number need to be checked for presence of given
	 *            value.
	 * @param expectedValue
	 *            This is expected value which row,column should contain.
	 *******************************************************************************************
	 */
	public static void verifyTableCellContain(String locatorPath, int rowNumber, int colNumber, String expectedValue) {
		try {
			String part1 = locatorPath; // Example: locatorPath =
										// "xpath_//table[@class='dataTable']/tbody/tr"
			String part2 = "[";
			String part3 = Integer.toString(rowNumber);
			String part4 = "]/td[";
			String part5 = Integer.toString(colNumber);
			String part6 = "]";
			String actualValue = null;
			String extractedValue = findElementByLocator(part1 + part2 + part3 + part4 + part5 + part6).getText();
			if (extractedValue.equals(expectedValue)) {
				actualValue = extractedValue;
			}
			doWait(2000);
			MatcherAssert.assertThat(actualValue, equalTo(expectedValue));
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: verifyTableCellContains] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/**
	 ******************************************************************************************
	 * @Function Name : selectNumberofEntries
	 * @Description : Selects number of entries
	 * @Param : i
	 * @Return : null
	 ******************************************************************************************
	 */
	public static void mms_SelectNumberofEntries(int i) {
		EY_FW_Utility.findElementByLocator("xpath_//option[@value=" + i + "]").click();
		EY_FW_Utility.doWait(5000);
	}

	public static void verifyTableColumnDoesntContains(String locatorPath, int colNumber, String expectedValue) {
		try {
			String part1 = locatorPath; // Example: locatorPath =
										// "xpath_//table[@class='dataTable']/tbody/tr"
			String part2 = "]/td[";
			String part3 = Integer.toString(colNumber);
			String part4 = "]";
			int count = EY_FW_Utility.getElementListByLocator(part1).size();
			int i = 1;
			String actualValue = null;
			while (i <= count) {// isElementPresent(part1+"]"+i+part2+part3+part4)){
				String extractedValue = findElementByLocator(part1 + "[" + i + part2 + part3 + part4).getText();
				System.out.println(extractedValue);
				if (extractedValue.equals(expectedValue)) {
					actualValue = extractedValue;
					break;
				}
				i++;
			}
			MatcherAssert.assertThat(actualValue, not(equalTo(expectedValue)));
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false, e.getMessage());
			setLogger()
					.error("[EY_FW_Utility: verifyTableColumnDoesntContains] Exception thrown -- " + getStackTrace(e));
		}
	}

	/**
	 ******************************************************************************************
	 * Will return row number
	 * 
	 * // Example: locatorPath = "xpath_//table[@class='dataTable']/tbody/tr"
	 ******************************************************************************************
	 */
	public static int getTableRowNumber(String locatorPath, int colNumber, String expectedValue) {
		try {
			EY_FW_Utility.doWait(4000);
			String part1 = locatorPath;
			String part2 = "]/td[";
			String part3 = Integer.toString(colNumber);
			String part4 = "]";
			int count = EY_FW_Utility.getElementListByLocator(part1).size();
			System.out.println(count);
			int i = 1;
			while (i <= count) {
				String extractedValue = findElementByLocator(part1 + "[" + i + part2 + part3 + part4).getText();
				System.out.println(i + " " + extractedValue);
				if (extractedValue.equals(expectedValue)) {
					return i;
				}
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false, e.getMessage());
			setLogger().error("[EY_FW_Utility: getTableRowNumber] Exception thrown -- " + getStackTrace(e));
		}
		return 0;
	}

	/**
	 ******************************************************************************************
	 * Will click mms actions or checkbox
	 * 
	 * // Example: locatorPath = "xpath_//table[@class='dataTable']/tbody/tr"
	 ******************************************************************************************
	 */
	public static void clickMMSActions(String locatorPath1, String locatorPath2, int rowNumber, int colNumber) {
		try {
			String part1 = locatorPath1; // Example: locatorPath =
											// "xpath_//table[@class='dataTable']/tbody/tr"
			String part2 = "]/td[";
			String part3 = locatorPath2;
			WebElement element = findElementByLocator(part1 + "[" + rowNumber + part2 + colNumber + "]/" + part3);// .click();
			if (locatorPath2.equalsIgnoreCase("input") && !element.isSelected()) {
				element.click();
			} else {
				element.click();
			}
			// .//*[@id='DataTables_Table_0']/tbody/tr[1]/td[5]/div/button
			EY_FW_Utility.doWait(2000);

		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false, e.getMessage());
			setLogger().error("[EY_FW_Utility: clickMMSActions] Exception thrown -- " + getStackTrace(e));
		}

	}

	/**
	 ******************************************************************************************
	 * Will click mms actions list
	 * 
	 * // Example: locatorPath = "xpath_//table[@class='dataTable']/tbody/tr"
	 ******************************************************************************************
	 */
	public static void clickMMSActionList(String locatorPath1, String locatorPath2, String locatorPath3, int rowNumber,
			int colNumber, String text) {
		try {
			String part1 = locatorPath1; // Example: locatorPath =
											// "xpath_//table[@class='dataTable']/tbody/tr"
			String part2 = "]/td[";
			String part3 = locatorPath2;
			String part4 = locatorPath3;
			findElementByLocator(part1 + "[" + rowNumber + part2 + colNumber + "]/" + part3 + text + part4).click();
			EY_FW_Utility.doWait(2000);

		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false, e.getMessage());
			setLogger().error("[EY_FW_Utility: clickMMSActionList] Exception thrown -- " + getStackTrace(e));
		}

	}

	/**
	 ******************************************************************************************
	 * Will get text of that field
	 * 
	 * // Example: locatorPath = "xpath_//table[@class='dataTable']/tbody/tr"
	 ******************************************************************************************
	 */
	public static String mms_getTextOfField(String locatorPath1, int rowNumber, int colNumber) {
		try {
			String part1 = locatorPath1; // Example: locatorPath =
											// "xpath_//table[@class='dataTable']/tbody/tr"
			String part2 = "]/td[";

			return findElementByLocator(part1 + "[" + rowNumber + part2 + colNumber + "]").getText();

		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false, e.getMessage());
			setLogger().error("[EY_FW_Utility: mms_getTextOfField] Exception thrown -- " + getStackTrace(e));
		}
		return null;
	}

	/**
	 *******************************************************************************************
	 * Converts StackTrace generated at time of Exception thrown into Message
	 * String format.
	 * 
	 * @param throwable
	 *            This is Exception thrown.
	 * @return String This is Exception message in String format.
	 *******************************************************************************************
	 */
	public static String getStackTrace(final Throwable throwable) {
		try {
			final StringWriter sw = new StringWriter();
			final PrintWriter pw = new PrintWriter(sw, true);
			throwable.printStackTrace(pw);
			return sw.getBuffer().toString();
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: getStackTrace] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return null;
		}
	}

	/**
	 ******************************************************************************************
	 * Will Check Alert present or not.
	 * 
	 * @return boolean True / False.
	 ******************************************************************************************
	 */
	public static boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			setLogger().error("[EY_FW_Utility: isAlertPresent] No Alert Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return false;
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: isAlertPresent] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return false;
		}
	}

	/**
	 ******************************************************************************************
	 * Will Check Whether Page Contains given text or not.
	 * 
	 * @param pageText
	 *            This is text in string format to be checked on Web Page.
	 * @return boolean True / False.
	 ******************************************************************************************
	 */
	public static boolean verifyPageContainsText(String pageText) {
		try {
			List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + pageText + "')]"));
			if (list.size() > 0) {
				return true;
			}
			return false;
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: verifyPageContainsText] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return false;
		}

	}

	/**
	 ******************************************************************************************
	 * Will Check Whether Page Contains given WebElement or not.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 * @return boolean True / False.
	 ******************************************************************************************
	 */
	public static boolean verifyPageContainsElement(String locatorPath) {
		try {
			List<WebElement> element = getElementListByLocator(locatorPath);
			if (element.size() != 0) {
				return true;
			}
			return false;
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: verifyPageContainsElement] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return false;
		}

	}

	/**
	 ******************************************************************************************
	 * Will Check Whether given WebElement Visible or not.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 * @return boolean True / False.
	 ******************************************************************************************
	 */
	public static boolean verifyElementIsVisible(String locatorPath) {
		try {
			WebElement element = findElementByLocator(locatorPath);
			if (element.isDisplayed()) {
				return true;
			}
			return false;
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: verifyElementIsVisible] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return false;
		}
	}

	/**
	 ******************************************************************************************
	 * Will Check Whether given WebElement Enabled or not.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 * @return boolean True / False.
	 ******************************************************************************************
	 */
	public static boolean verifyElementIsEnabled(String locatorPath) {
		try {
			WebElement element = findElementByLocator(locatorPath);
			if (element.isEnabled()) {
				return true;
			}
			return false;
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: verifyElementIsEnabled] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return false;
		}
	}

	/**
	 ******************************************************************************************
	 * Will Check Whether given WebElement Disabled or not.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 * @return boolean True / False.
	 ******************************************************************************************
	 */
	public static boolean verifyElementIsDisabled(String locatorPath) {
		try {
			WebElement element = findElementByLocator(locatorPath);
			if (!element.isEnabled()) {
				return true;
			}
			return false;
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: verifyElementIsDisabled] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return false;
		}
	}

	/**
	 ******************************************************************************************
	 * Will Check Whether text field contains given value or not
	 * 
	 * @param locatorPath
	 *            This is locator path in String format.
	 * @param value
	 *            This is value to be checked in the text field.
	 * @return boolean True / False.
	 ******************************************************************************************
	 */
	public static boolean verifyTextFieldContainsValue(String locatorPath, String value) {
		try {
			WebElement element = findElementByLocator(locatorPath);
			if (element.getAttribute("value").equals(value)) {
				return true;
			}
			return false;
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: verifyTextFieldContainsValue] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return false;
		}
	}

	/**
	 ******************************************************************************************
	 * Will Check Whether frame contains given text or not using frame index
	 * 
	 * @param index
	 *            This is frame index to be switched in.
	 * @param pageText
	 *            This is text in string format to be checked on Frame inside
	 *            Web Page.
	 * @return boolean True / False.
	 ******************************************************************************************
	 */
	public static boolean verifyFrameContainsTextUsingIndex(int index, String pageText) {
		try {
			driver.switchTo().frame(index);
			List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + pageText + "')]"));
			if (list.size() > 0) {
				return true;
			}
			return false;
		} catch (Exception e) {
			setLogger().error(
					"[EY_FW_Utility: verifyFrameContainsTextUsingIndex] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return false;
		}
	}

	/**
	 *****************************************************************************************************
	 * Will Check Whether frame contains given text or not using name of the
	 * frame or id of frame element.
	 * 
	 * @param name
	 *            This is frame name to be switched in.
	 * @param pageText
	 *            This is text in string format to be checked on Frame inside
	 *            Web Page.
	 * @return boolean True / False.
	 *****************************************************************************************************
	 */
	public static boolean verifyFrameContainsTextUsingName(String name, String pageText) {
		try {
			driver.switchTo().frame(name);
			List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + pageText + "')]"));
			if (list.size() > 0) {
				return true;
			}
			return false;
		} catch (Exception e) {
			setLogger()
					.error("[EY_FW_Utility: VerifyFrameContainsTextUsingName] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return false;
		}
	}

	/**
	 *****************************************************************************************************
	 * Will Check Whether frame contains given text or not using its previously
	 * located WebElement.
	 * 
	 * @param locatorPath
	 *            This is locator path in String format of previously located
	 *            frame.
	 * @param pageText
	 *            This is text in string format to be checked on Frame inside
	 *            Web Page.
	 * @return boolean True / False.
	 *****************************************************************************************************
	 */
	public static boolean verifyFrameContainsTextUsingElement(String locatorPath, String pageText) {
		try {
			if (isElementPresent(locatorPath)) {
				WebElement element = findElementByLocator(locatorPath);
				driver.switchTo().frame(element);
				List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + pageText + "')]"));
				if (list.size() > 0) {
					return true;
				}
			}
			return false;
		} catch (Exception e) {
			setLogger().error(
					"[EY_FW_Utility: VerifyFrameContainsTextUsingElement] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return false;
		}
	}

	/**
	 *****************************************************************************************************
	 * To setup database restore
	 *****************************************************************************************************
	 */

	public static void setupDBRestore(String dbName, String sql) {

		Connection conn = null;
		Statement stmt = null;

		String hostName = new PropertyReader().readProperty("hostName");
		String port = new PropertyReader().readProperty("port");
		String DB_URL = "jdbc:postgresql://" + hostName + ":" + port + "/" + dbName;
		System.out.println("Checking DB ");
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Inside ");
			Class.forName("org.postgresql.Driver");
			// DriverManager.registerDriver(new org.postgresql.Driver());

			// STEP 3: Open a connection
			System.out.println("Connecting to database..."+ DB_URL + " : " + USER + " : " + PASS);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query

			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			System.out.println("Print: " + sql);

			stmt.executeUpdate(sql);
			System.out.println("query " + sql + "is successfull");

			// STEP 6: Clean-up environment
			// rs.close();
			stmt.close();
			conn.close();

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
			// setLogger().error("JDBC error " + getStackTrace(se));
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
			setLogger().error("Class not initiated or not found " + getStackTrace(e));
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
				setLogger().error("connection not established " + getStackTrace(se));
			} // end finally try
		} // end try
	}

	
	/**
	 *****************************************************************************************************
	 * To restore database
	 *****************************************************************************************************
	 */

	// Database credentials
	public static final String USER = "postgres";
	public static final String PASS = "onlyIknow1";

	public static int restoreDB(String dbName, String backup) {
		String sql = "DROP SCHEMA public CASCADE;";
		String sql1 = "CREATE SCHEMA public;";
		setupDBRestore(dbName, sql);
		setupDBRestore(dbName, sql1);

		System.out.println("Restoring DB");
		String postgrespath = new PropertyReader().readProperty("postgrespath");
		String hostName = new PropertyReader().readProperty("hostName");
		String port = new PropertyReader().readProperty("port");
		String pgrestore = new PropertyReader().readProperty("pgrestore");
		String userName = new PropertyReader().readProperty("userName");
		String path = System.getProperty("user.dir");
		// PropertyReader().readProperty("path");
		String cmd, SQL438,SQL439,SQL440;
		int result = 1;
		//setupDBRestore(dbName, "set PGPASSWORD='onlyIknow1'");
		cmd = postgrespath + pgrestore + " --host " + hostName + " --port " + port + " --username " + userName

				+ " --no-password --dbname " + dbName + " " + path + "\\src\\test\\resources\\testdata\\"
				+ backup;	
		
		SQL438 = postgrespath + "psql.exe" + " --host " + hostName + " --port " + port + " --username " + userName
                + " --no-password --dbname " + dbName + " " + "-a" + " " + "-f" + " " + path + "\\src\\test\\resources\\testdata\\438-Company-InvoiceRejection.sql";

		SQL439 = postgrespath + "psql.exe" + " --host " + hostName + " --port " + port + " --username " + userName
                + " --no-password --dbname " + dbName + " " + "-a" + " " + "-f" + " " + path + "\\src\\test\\resources\\testdata\\439-Company-CarConfiguration.sql";
		SQL440 = postgrespath + "psql.exe" + " --host " + hostName + " --port " + port + " --username " + userName
                + " --no-password --dbname " + dbName + " " + "-a" + " " + "-f" + " " + path + "\\src\\test\\resources\\testdata\\440-Company-Akka-DxUpload.sql";
		
		try {
			Runtime rt = Runtime.getRuntime();
			Process proc = rt.exec(cmd);
			System.out.println("DB Restore command is " + cmd);
			InputStream stderr = proc.getErrorStream();
			InputStreamReader isr = new InputStreamReader(stderr);
			BufferedReader br = new BufferedReader(isr);
			String line = null;
			while ((line = br.readLine()) != null)
				System.out.println(line);
			result = proc.waitFor();
			System.out.println("Process exitValue for DB Restore: " + result);
			if (result == 0) {
				System.out.println("Restore successful");
				setupDBRestore(dbName, "update system_information SET value='442' where key='Database Version'");
				System.out.println("Ran system information query...set DB version to 442");
				if(dbName.equalsIgnoreCase("testdata") || dbName.equalsIgnoreCase("ey_mms_qa6")){
					proc = rt.exec(SQL438);
					EY_FW_Utility.doWait(4000);
					proc = rt.exec(SQL439);
					EY_FW_Utility.doWait(4000);
					proc = rt.exec(SQL440);
					EY_FW_Utility.doWait(4000);
					System.out.println(SQL438);
					System.out.println(SQL439);
					System.out.println(SQL440);
					System.out.println("Ran SQL438, SQL439, SQL440");
						
				}
			} else {
				System.out.println("There is an error in restoring");
			}
		} catch (Throwable t) {
			t.printStackTrace();
			setLogger().error("Restore failed " + getStackTrace(t));
		}
		return result;
	}

	/**
	 *****************************************************************************************************
	 * Wait for progress window to disappear
	 *****************************************************************************************************
	 */
	public static void waitForProgressWindowToDisappear(long timeoutInSeconds) {
		try {
			new WebDriverWait(driver, timeoutInSeconds).until(
					ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),'Processing,')]")));
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
	
	/**
	 *****************************************************************************************************
	 *  Wait for Large progress window to disappear
	 *****************************************************************************************************
	 */
	public static void waitForLargeProgressWindowToDisappear(long timeoutInSeconds) {
		try{
		new WebDriverWait(driver, timeoutInSeconds).until(
				ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'blockUI blockMsg blockPage')]")));
		}catch(Exception e){
			System.out.println(e.getStackTrace());
		}
	}
	
	/**
	 *****************************************************************************************************
	 *  Wait for Large progress window to appear
	 *****************************************************************************************************
	 */
	public static void waitForLargeProgressWindowToAppear(long timeoutInSeconds) {
		try{
			new WebDriverWait(driver, timeoutInSeconds).until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'blockUI blockMsg blockPage')]")));
			}catch(Exception e){
				System.out.println(e.getStackTrace());
			}
	}
	/**
	 *****************************************************************************************************
	 * To read config file
	 *****************************************************************************************************
	 */
	public static String getConfigProperty(String filename, String key) {
		Properties prop = new Properties();
		InputStream input = null;

		try {
			String path = System.getProperty("user.dir");
			path += new PropertyReader().readProperty("configpath");
			input = new FileInputStream(path + filename);

			// load a properties file
			prop.load(input);
			// System.out.println("file is " + input);
			return prop.getProperty(key);

		} catch (IOException ex) {
			ex.printStackTrace();
			setLogger().error("Cant read config file " + getStackTrace(ex));
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;

	}

	/**
	 *****************************************************************************************************
	 * To check whether element is visible or not
	 *****************************************************************************************************
	 */
	public static boolean checkElementVisible(String locator) {
		return findElementByLocator(locator).isDisplayed();
	}
	
	/**
	 ******************************************************************************************
	 * Will if edit box is empty
	 * 
	 * @param locator
	 *            This is locator path in String format.
	 * @return boolean True / False.
	 ******************************************************************************************
	 */
	public static boolean verifyEditBoxFieldIsEmpty(String locator) {
		try {
			WebElement element = findElementByLocator(locator);
			String fieldValue = element.getAttribute("value");
			//String fieldText = element.getText();
			if (fieldValue.isEmpty()) {
				return true;
			}
			return false;
		} catch (Exception e) {
			setLogger()
					.error("[EY_FW_Utility: verifyEditBoxFieldIsEmpty] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return false;
		}
	}
	
	/**
	 ******************************************************************************************
	 * Will check if drop down default value is empty
	 * 
	 * @param locator
	 *            This is locator path in String format.
	 * @return boolean True / False.
	 ******************************************************************************************
	 */
	public static String getDefaultValueOfDropdown(String locator) {
		String defaultSelectedValue="";
		try {
			Select selectitem = new Select(findElementByLocator(locator));
			WebElement defaultSelectedElement= selectitem.getFirstSelectedOption();
			defaultSelectedValue= defaultSelectedElement.getText();
			System.out.println("VALUE" + defaultSelectedValue);
			return defaultSelectedValue;
			
		} catch (Exception e) {
			setLogger().error("[EY_FW_Utility: getDefaultValueOfDropdown] Exception thrown -- " + getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
			return null;
		}
		
	}

	public static void waitForProcessingNotificationToDisappear(long timeoutInSeconds) {
		try{
			new WebDriverWait(driver, timeoutInSeconds).until(
					ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='DataTables_Table_0_processing']")));
			}catch(Exception e){
				System.out.println(e.getStackTrace());
			}
	}
	
	public static void waitForProcessingNotificationToAppear(long timeoutInSeconds) {
		try{
			new WebDriverWait(driver, timeoutInSeconds).until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='DataTables_Table_0_processing']")));
			}catch(Exception e){
				System.out.println(e.getStackTrace());
			}
	}
	
	public static void waitForModalBackgroundFadeToDisappear(long timeoutInSeconds) {
		try{
			new WebDriverWait(driver, timeoutInSeconds).until(
					ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class, 'modal-backdrop fade')]")));
			}catch(Exception e){
				System.out.println(e.getStackTrace());
			}
			
	}
	
	
	public static void enterText(String locator, String text) {
		try {
			WebElement webElement = findElementByLocator(locator);
			webElement.clear();
			webElement.sendKeys(text);
		} catch (Exception e) {
			MatcherAssert.assertThat(e.getMessage(), false);
		}
	}
	
	public static boolean verifyElementIsNotPresent(String locator) {
		try {
		WebElement element = findElementPresenceInDomByLocator(locator);
		if (!element.isDisplayed()) {
		return true;
		}
		return false;
	} catch (Exception e) {
		MatcherAssert.assertThat(e.getMessage(), true);
		return true;
   }
}

/*
	public static void tunnel() throws JSchException {
		String host = "3.192.123.222";
		String user = "rmihe";
		String password = "qwe123rty";
		int port = 22;

		int tunnelLocalPort = 11111;
		String tunnelRemoteHost = "boeapidev.railcarmgt.com/";
		int tunnelRemotePort = 80;

		JSch jsch = new JSch();
		Session session = jsch.getSession(user, host, port);
		session.setPassword(password);
		// UserInfo userInfo = new SftpUserInfo();
		// session.setUserInfo(userInfo);
		// localUserInfo lui=new localUserInfo();
		// session.setUserInfo(lui);
		session.connect();
		session.setPortForwardingL(tunnelLocalPort, tunnelRemoteHost, tunnelRemotePort);
		System.out.println("Connected");
	}*/
}
