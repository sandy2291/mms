package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.*;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.EY_GettersSetters;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class ExceptionTrackingPage extends PageObject {

	/*
	 * public void verifyExceptionTrackingPageTitle() { try {
	 * System.out.println(
	 * "[MMS_EXCEPTION_TRACKING : verifyExceptionTrackingPageTitle], verifying page title of exception tracking page"
	 * ); MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.EXCEPTIONTRACKING_PAGE_TITLE)); } catch
	 * (Exception e) { Assert.assertTrue(false, e.getMessage()); } }
	 */

	/*
	 * public void checkEmptyTable() { try { System.out.
	 * println("[MMS_EXCEPTION_TRACKING : checkEmptyTable], checking whether table is empty or not"
	 * ); MatcherAssert.assertThat(EY_FW_Utility.getAnyElementByAnyLocator(
	 * MMS_ExceptionTrackingPageLocator.NODATA).getText(),
	 * equalTo(MMS_ExpectedResult.EMPTYTABLE)); } catch (Exception e) {
	 * Assert.assertTrue(false, e.getMessage()); } }
	 */

	public void enterInvoicenumber(String invNo) {
		try {
			System.out.println("[MMS_EXCEPTION_TRACKING : enterInvoicenumber], Entering invoice number");
			WebElement startinvoice = EY_FW_Utility
					.findElementByLocator(MMS_ExceptionTrackingPageLocator.INVOICENUMBERSTART);
			startinvoice.clear();
			startinvoice.sendKeys(invNo);
			WebElement endinvoice = EY_FW_Utility
					.findElementByLocator(MMS_ExceptionTrackingPageLocator.INVOICENUMBEREND);
			endinvoice.clear();
			endinvoice.sendKeys(invNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectstatus(String status) {
		try {
			System.out.println("[MMS_EXCEPTION_TRACKING : selectstatus], Selecting status");
			WebElement CBAstatus = EY_FW_Utility
					.findElementByLocator(MMS_ExceptionTrackingPageLocator.CBASTATUS_DROPDOWN);
			Select dropdown = new Select(CBAstatus);
			dropdown.selectByVisibleText(status);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectResponseType(String responseType) {
		try {
			System.out.println("[MMS_EXCEPTION_TRACKING : selectresponsetype], Selecting response type");
			WebElement responsetype = EY_FW_Utility
					.findElementByLocator(MMS_ExceptionTrackingPageLocator.RESPONSE_DROPDOWN);
			Select dropdown = new Select(responsetype);
			dropdown.selectByVisibleText(responseType);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickSaveFilter() {
		try {
			System.out.println("[MMS_EXCEPTION_TRACKING : clicksavefilter], clicking on save filter button");
			EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.SAVEBUTTON).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectCheckbox() {
		try {
			System.out.println("[MMS_EXCEPTION_TRACKING : selectcheckbox], selecting checkbox");
			WebElement e = EY_FW_Utility.findElementByLocator(MMS_ExceptionTrackingPageLocator.CHECKBOX);// .click();
			if (!e.isSelected()) {
				e.click();
			}
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickActions(String actions) {
		try {
			System.out.println("[MMS_EXCEPTION_TRACKING : clickactions], clicking on actions");
			List<WebElement> l = EY_FW_Utility
					.getElementListByLocator(MMS_ExceptionTrackingPageLocator.EXCEPTIONTRACKING_ACTIONS);
			EY_GettersSetters.getDriver().findElement(By.xpath("//table[@id='DataTables_Table_0']/tbody/tr[1]/td[12]/div/button"))
					.click();
			EY_GettersSetters.getDriver().findElement(By.xpath(
					"//table[@id='DataTables_Table_0']/tbody/tr[1]/td[12]/div/ul/li[a[contains(.,'" + actions + "')]]"))
					.click();

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterResponseComment(String responseComment) {
		try {
			System.out.println("[MMS_EXCEPTION_TRACKING : enterresponsecomment], entering response comments");
			WebElement comment = EY_FW_Utility
					.findElementByLocator(MMS_ExceptionTrackingPageLocator.EXCEPTIONRESPONSECOMMENT);
			comment.clear();
			comment.sendKeys(responseComment);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	public void enterCBA(String cbaNo) {
		try {
			System.out.println("[MMS_EXCEPTION_TRACKING : enterresponsecomment], entering response comments");
			WebElement comment = EY_FW_Utility
					.findElementByLocator(MMS_ExceptionTrackingPageLocator.CBACOMMENT);
			comment.clear();
			comment.sendKeys(cbaNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void verifyResponse(String s) { try { System.out.
	 * println("[MMS_EXCEPTION_TRACKING : verifyresponsecomment], verifyinging response comments"
	 * ); Assert.assertEquals(EY_FW_Utility.getAnyElementByAnyLocator(
	 * MMS_ExceptionTrackingPageLocator.RESPONSESTATUS).getText(), s); } catch
	 * (Exception e) { Assert.assertTrue(false, e.getMessage()); } }
	 */

	public void clickExceptionTracker() {
		try {
			System.out.println("[MMS_EXCEPTION_TRACKING : clickExceptionTracer], clicking on exception tracker");
			EY_FW_Utility.findElementByLocator(MMS_ExceptionTrackingPageLocator.EXCEPTIONTRACKER).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void confirm() {
		System.out.println("[MMS_EXCEPTION_TRACKING : confirm], clicking on confirm");
		EY_FW_Utility.findElementByLocator(MMS_ExceptionTrackingPageLocator.CONFIRMEXCEPTIONTRACKER).click();
	}

	public void clickFinalize() {
		try {
			System.out.println("[MMS_EXCEPTION_TRACKING : clickFinalize], clicking on Finalize");
			EY_FW_Utility.findElementByLocator(MMS_ExceptionTrackingPageLocator.FINALIZE).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickDelete() {
		try {
			System.out.println("[MMS_EXCEPTION_TRACKING : clickdelete], clicking on delete");
			EY_FW_Utility.findElementByLocator(MMS_ExceptionTrackingPageLocator.DELETE).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void verifyDelete() { try { System.out.
	 * println("[MMS_EXCEPTION_TRACKING : verifydelete], Verifying delete");
	 * Assert.assertEquals(MMS_ExpectedResult.EMPTYTABLE,
	 * EY_FW_Utility.getAnyElementByAnyLocator(MMS_ExceptionTrackingPageLocator.
	 * EMPTYTABLE).getText()); } catch (Exception e) { Assert.assertTrue(false,
	 * e.getMessage()); } }
	 */

	/*
	 * public void deleteError(String s) { try { System.out.
	 * println("[MMS_EXCEPTION_TRACKING : deleteerror], checking for delete error"
	 * ); Assert.assertEquals(EY_FW_Utility.getAnyElementByAnyLocator(
	 * MMS_ExceptionTrackingPageLocator.DELETEERROR).getText(), s); } catch
	 * (Exception e) { Assert.assertTrue(false, e.getMessage()); } }
	 */

	public void clickClose() {
		try {
			System.out.println("[MMS_EXCEPTION_TRACKING : click close], clicking on close");
			EY_FW_Utility.findElementByLocator(MMS_ExceptionTrackingPageLocator.CLOSE).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
}
