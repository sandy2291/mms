package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.MMS_ExceptionReviewCarListPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_ExceptionReviewInvoiceList;
import com.ey.mms.pageobjects.mmsLocators.MMS_ExceptionTrackingPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_InvoiceHistoryPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_InvoiceListPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.EY_GettersSetters;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class ExceptionReviewPage extends PageObject {

	int j; // to get row number
	int nrows;
	List<Integer> row_number = new ArrayList<Integer>();
		
	/*
	 * public void verifyExceptionReviewPageTitle() { try { System.out.println(
	 * "[MMS_ExceptionReview : verifyExceptionReviewPageTitle] Verifying Exception Review Page Title as "
	 * + MMS_ExpectedResult.EXCEPTIONREVIEW_PAGE_TITLE);
	 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.EXCEPTIONREVIEW_PAGE_TITLE)); } catch
	 * (Exception e) { Assert.assertTrue(false, e.getMessage()); } }
	 */
/*	public void searchTableandClick(String invNo, int actionList) throws InterruptedException {
		try {
			j = 1;
			WebElement table_element = EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.TABLE_ELEMENT);
			List<WebElement> tr_collection1 = table_element
					.findElements(By.xpath(MMS_InvoiceHistoryPageLocator.TABLE_ROWS));
			nrows = tr_collection1.size();
			for (WebElement trElement : tr_collection1) {

				WebElement td_collection = trElement.findElement(By.xpath(MMS_InvoiceHistoryPageLocator.COLUMN_SIX));
				System.out.println("[MMS_EXCEPTIONREVIEWPage : Search table for element] Searching table for element");
				if (td_collection.getText().equalsIgnoreCase(invNo)) {

					EY_GettersSetters.getDriver()
							.findElement(
									By.xpath("//table[@id='DataTables_Table_0']/tbody/tr[" + j + "]/td[16]/div/button"))
							.click();
					// EY_FW_Utility.doWait(2000);
					EY_GettersSetters.getDriver()
							.findElement(By
									.xpath("//table[@id='DataTables_Table_0']/tbody/tr[" + j + "]/td[16]/div/ul/li/a"))
							.click();
					break;
				}
				j++;
			}
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}*/

	public void clickFilterButton() {
		try {
			System.out.println("[MMS_EXCEPTIONREVIEWPage : clickFilterButton] clicking on filter button");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceListPageLocator.INVOICELISTFILTERBUTTON).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterFilterDetails(String carInitial, String fromCarNo, String toCarNo) {
		try {
			System.out.println("[MMS_EXCEPTIONREVIEWPage : enterfilterdetails] entering filter details");
			WebElement carinitial = EY_FW_Utility
					.findElementByLocator(MMS_InvoiceListPageLocator.INVOICELISTCARINITIAL);
			WebElement startcarnumber = EY_FW_Utility
					.findElementByLocator(MMS_InvoiceListPageLocator.INVOICELISTFROMCARNUMBER);
			WebElement endcarnumber = EY_FW_Utility
					.findElementByLocator(MMS_InvoiceListPageLocator.INVOICELISTENDCARNUMBER);
			WebElement savebutton = EY_FW_Utility
					.findElementByLocator(MMS_InvoiceListPageLocator.INVOICELISTSAVEBUTTON);
			carinitial.clear();
			carinitial.sendKeys(carInitial);
			startcarnumber.clear();
			startcarnumber.sendKeys(fromCarNo);
			endcarnumber.clear();
			endcarnumber.sendKeys(toCarNo);
			savebutton.click();
			// EY_FW_Utility.doWait(10000);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*public void selectrow(String text, int row) throws InterruptedException {
		try {
			System.out.println("[MMS_EXCEPTIONREVIEWPage : selectrow] Selecting row");
			j = 0;
			WebElement table_element = EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.TABLE_ELEMENT);
			List<WebElement> tr_collection1 = table_element
					.findElements(By.xpath(MMS_InvoiceHistoryPageLocator.TABLE_ROWS));

			nrows = tr_collection1.size();
			for (WebElement trElement : tr_collection1) {

				WebElement td_collection = trElement.findElement(By.xpath(MMS_InvoiceHistoryPageLocator.COLUMN_SIX));

				if (td_collection.getText().equalsIgnoreCase(text)) {

					WebElement e = EY_GettersSetters.getDriver().findElement(By.xpath("" + "" + "" + ""
							+ "//table[@id='DataTables_Table_0']/tbody/tr[" + ++j + "][td[6]]/td/input"));

					if (!e.isSelected()) {
						e.click();
						Thread.sleep(2000);
					}
					break;
				}
				j++;
			}
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}*/

	public void clickGenerateExceptionLetter() {
		try {
			System.out.println(
					"[MMS_EXCEPTIONREVIEWPage : clickgenerateexceptionletter] clicking on generate exception letter");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceListPageLocator.generateexceptionletter).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterGenerateExceptionNumber(String exceptionNo) {
		try {
			System.out.println(
					"[MMS_EXCEPTIONREVIEWPage : entergenerateexceptionnumber] entering generate exception number");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceListPageLocator.EXCEPTIONLETTERNUMBER).clear();
			EY_FW_Utility.findElementByLocator(MMS_InvoiceListPageLocator.EXCEPTIONLETTERNUMBER).sendKeys(exceptionNo);
			;
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void ClickSaveButton() {
		// Screen s = new Screen();
		// String path = System.getProperty("user.dir");
		EY_FW_Utility.findElementByLocator(MMS_ExceptionReviewCarListPageLocator.Generate_Exception_Letter).click();
		/*
		 * Pattern p = new
		 * Pattern(path+"/"+MMS_InvoiceListPageLocator.generateexceptionimage);
		 * try { System.out.println(
		 * "[MMS_EXCEPTIONREVIEWPage : ClickSaveButton] Clicking on save button"
		 * ); s.click(p); } catch (FindFailed e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */

	}

	public void selectExceptionContact(String contact) {
		try {
			System.out.println(
					"[MMS_EXCEPTIONREVIEWPage : selectexceptioncontact] Selecting exception contact from dropdown.");
			WebElement exceptioncontact = EY_FW_Utility
					.findElementByLocator(MMS_ExceptionReviewCarListPageLocator.EXCEPTIONCONTACT_DROPDOWN);
			Select dropdown = new Select(exceptioncontact);
			dropdown.selectByVisibleText(contact);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterFromInvoiceNumber(String fromInvoiceNo) {
		try {
			WebElement FromInvoiceNumber = EY_FW_Utility
					.findElementByLocator(MMS_ExceptionReviewInvoiceList.FROMINVOICENUMBER);

			FromInvoiceNumber.clear();
			FromInvoiceNumber.sendKeys(fromInvoiceNo);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	public void enterToInvoiceNumber(String toInvoiceNo) {
		try {
			WebElement toInvoiceNumber = EY_FW_Utility
					.findElementByLocator(MMS_ExceptionReviewInvoiceList.TOINVOICENUMBER);

			toInvoiceNumber.clear();
			toInvoiceNumber.sendKeys(toInvoiceNo);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	public void selectExceptionstatus(String status) {
		try {
			WebElement exceptionstatusdropdown = EY_FW_Utility
					.findElementByLocator(MMS_ExceptionReviewInvoiceList.EXCEPTIONSTATUS);
			Select dropdown = new Select(exceptionstatusdropdown);
			dropdown.selectByVisibleText(status);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	public void selectHasException(String status) {
		try {
			WebElement exceptionstatusdropdown = EY_FW_Utility
					.findElementByLocator(MMS_ExceptionReviewInvoiceList.HASEXCEPTION);
			Select dropdown = new Select(exceptionstatusdropdown);
			dropdown.selectByVisibleText(status);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectInvoices(String InvoiceNo) {
		try {
			int rowNumber = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 6, InvoiceNo);
			EY_FW_Utility.clickMMSActions(MMS_MyCompanyInfoPageLocator.contacttable, "input", rowNumber, 1);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	public void clickGenerateRejectionLetter() {
		try {
			EY_FW_Utility.findElementByLocator(MMS_ExceptionReviewInvoiceList.GENERATEREJECTIONLETTERBUTTON).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void verifyErrorMessage(String InvoiceNo) {
		try {
			EY_FW_Utility.findElementByLocator(MMS_ExceptionReviewInvoiceList.GENERATEREJECTIONLETTERBUTTON).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

			
}
