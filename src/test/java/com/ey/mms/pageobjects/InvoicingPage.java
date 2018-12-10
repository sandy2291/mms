package com.ey.mms.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import java.lang.String;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.ey.mms.pageobjects.mmsLocators.*;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.EY_GettersSetters;

import net.serenitybdd.core.pages.PageObject;

public class InvoicingPage extends PageObject {
	int rowNumber, invcount = 0;
	boolean flag = true;

	public void selectType(String type) {
		try {
			System.out.println("[MMS_Invoicing : selectType] Selecting type ");

			WebElement element = EY_FW_Utility
					.findElementByLocator(MMS_InvoicingPageLocator.Invoice_type_Dropdown);
			Select dropdown = new Select(element);
			dropdown.selectByVisibleText(type);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterRmark(String mark) {
		try {
			System.out.println("[MMS_Invoicing : enterRmark] entering rmark ");

			WebElement e = EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.Rmark);
			e.clear();
			e.sendKeys(mark);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickaction() {
		try {
			EY_FW_Utility.clickMMSActions(MMS_MyCompanyInfoPageLocator.contacttable, MMS_UserManagerPageLocator.divison, 1,
					5);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickactionlist(String actionList) {
		try {
			EY_FW_Utility.clickMMSActionList(MMS_MyCompanyInfoPageLocator.contacttable,
					MMS_UserManagerPageLocator.actionlist1, MMS_UserManagerPageLocator.actionlist2, 1, 5, actionList);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectFirstRow() {
		try {
			EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.FirstRow).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void GenerateInvoice() {
		try {
			EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.Generate_Invoice).click();
			// EY_FW_Utility.doWait(5000);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickGenerateInvoiceButtonpopup() {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) EY_GettersSetters.getDriver();
			jse.executeScript("window.scrollBy(0,125)", "");
		
			EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.Inv_GenerateButton).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterInvNumber(String invNo) {
		try {
			System.out.println("enter invoice number");
			EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.Inv_Number).clear();
			EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.Inv_Number).sendKeys(invNo);
			// EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.Inv_Number).sendKeys(Keys.TAB);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterInvStartDate(String date) {
		try {
			EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.Inv_StartDate).clear();
			EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.Inv_StartDate).sendKeys(date);
			// EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.Inv_StartDate).sendKeys(Keys.TAB);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterInvDueDate(String date) {
		try {
			EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.Inv_DueDate).clear();
			EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.Inv_DueDate).sendKeys(date);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectBillingContacts(String contacts) {
		try {
			System.out.println("[MMS_Invoicing : selectBC] Selecting BC ");

			WebElement element = EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.Inv_BillingContact);
			Select dropdown = new Select(element);
			dropdown.selectByVisibleText(contacts);
			invcount = 1;

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectCustomer(String customer) {
		try {
			rowNumber = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 2, customer);
			EY_FW_Utility.clickMMSActions(MMS_MyCompanyInfoPageLocator.contacttable, "input", rowNumber, 1);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterInvoiceNumber(String invNo) {
		try {
			if (flag) {
				invcount = 0;
			}
			System.out.println(invcount + " " + MMS_InvoicingPageLocator.Invoice + invcount + "__InvoiceNumber']");
			WebElement invo = EY_FW_Utility
					.findElementByLocator(MMS_InvoicingPageLocator.Invoice + invcount + "__InvoiceNumber']");
			invo.clear();
			invo.sendKeys(invNo);
			flag = false;
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterInvoiceStartDate(String date) {
		try {
			System.out.println(invcount + " " + MMS_InvoicingPageLocator.Invoice + invcount + "__InvoiceDate']");
			WebElement invo = EY_FW_Utility
					.findElementByLocator(MMS_InvoicingPageLocator.Invoice + invcount + "__InvoiceDate']");
			invo.clear();
			invo.sendKeys(date);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterInvoiceDueDate(String date) {
		try {
			System.out.println(invcount + " " + MMS_InvoicingPageLocator.Invoice + invcount + "__DueDate']");
			WebElement invo = EY_FW_Utility
					.findElementByLocator(MMS_InvoicingPageLocator.Invoice + invcount + "__DueDate']");
			invo.clear();
			invo.sendKeys(date);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectInvoiceBC(String invoice) {
		try {
			System.out.println(invcount + " " + MMS_InvoicingPageLocator.Invoice_BC + invcount + "]_BillingContact']");
			WebElement element = EY_FW_Utility
					.findElementByLocator(MMS_InvoicingPageLocator.Invoice_BC + invcount + "]_BillingContact']");
			Select dropdown = new Select(element);
			dropdown.selectByVisibleText(invoice);
			invcount++;
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void countNotification(){ try{
	 * EY_FW_Utility.getAnyElementByAnyLocator(MMS_InvoicingPageLocator.
	 * Notification).click();
	 * assertThat(EY_FW_Utility.getAllElementsByAnyLocator(
	 * MMS_InvoicingPageLocator.NotificationAlert).size(),equalTo(1));//equalTo(
	 * invcount)); //EY_FW_Utility.doWait(3000);
	 * 
	 * }catch (Exception e) { Assert.assertTrue(false, e.getMessage()); } }
	 */
	/*
	 * public void checkNotificationMessage(){ try{ List<WebElement> l =
	 * EY_FW_Utility.getAllElementsByAnyLocator(MMS_InvoicingPageLocator.
	 * NotificationAlertMessage); for(WebElement e : l){
	 * assertThat(e.getText(),equalTo("ERROR")); //EY_FW_Utility.doWait(2000); }
	 * EY_FW_Utility.getAnyElementByAnyLocator(MMS_InvoicingPageLocator.
	 * EmptyReports).click(); //EY_FW_Utility.doWait(3000);
	 * 
	 * }catch (Exception e) { Assert.assertTrue(false, e.getMessage()); } }
	 */

	/*
	 * public void checkPopupErrorMessage(String s){ try{
	 * assertThat(s,equalTo(EY_FW_Utility.getAnyElementByAnyLocator(
	 * MMS_InvoicingPageLocator.POPUP_MSG).getText())); }catch (Exception e) {
	 * Assert.assertTrue(false, e.getMessage()); } }
	 */

	/*
	 * public void checkVerificationErrorMessage(String s){ try{ String text =
	 * EY_FW_Utility.getAnyElementByAnyLocator(MMS_InvoicingPageLocator.
	 * ERROR_Message).getText(); System.out.println(text);
	 * assertThat(s,containsText(text));
	 * EY_FW_Utility.getAnyElementByAnyLocator(MMS_InvoicingPageLocator.
	 * EmptyReports).click(); //EY_FW_Utility.doWait(3000);
	 * EY_FW_Utility.getAnyElementByAnyLocator(MMS_InvoicingPageLocator.
	 * Notification).click(); //EY_FW_Utility.doWait(2000);
	 * 
	 * }catch (Exception e) { Assert.assertTrue(false, e.getMessage()); } }
	 */

	public void Cancel_Invoice() {
		EY_FW_Utility.findElementByLocator(MMS_InvoicingPageLocator.CANCEL_INVOICE).click();
		/*Screen s = new Screen();
		String path = System.getProperty("user.dir");
		Pattern p = new Pattern(path+"/"+MMS_ExceptionReviewCarListPageLocator.Cancelimage);
		try {
			s.click(p);
		} catch (FindFailed e) {

			e.printStackTrace();
		}*/
		/*
		 * try{
		 * EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.CANCEL_INVOICE).
		 * click(); }catch (Exception e) { Assert.assertTrue(false,
		 * e.getMessage()); }
		 */
	}
}
