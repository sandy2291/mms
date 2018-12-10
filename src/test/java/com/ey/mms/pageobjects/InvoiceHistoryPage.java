package com.ey.mms.pageobjects;

import static org.testng.AssertJUnit.assertEquals;
import static org.hamcrest.CoreMatchers.equalTo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.jruby.RubyProcess.Sys;
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

public class InvoiceHistoryPage extends PageObject {

	public String lastSentToCombinedBilling = "";
	public String voidstatus = "";
	public static int flag = 0;
	int j; // to get row number
	List<Integer> row_number = new ArrayList<Integer>();

	public void clickBilling() {
		try {
			System.out.println("[MMS_HomePage : clickBilling] Clicking Billing ");
			// EY_FW_Utility.doWait(5000);
			EY_FW_Utility.findElementByLocator(MMS_HomepageLocator.BILLING_DROPDOWNMENU_LOCATOR).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickInvoiceHistory() {
		try {
			// EY_FW_Utility.doWait(5000);
			System.out.println("[MMS_BillingPage : clickInvoiceHistory] Clicking Invoice History ");
			EY_FW_Utility.findElementByLocator(MMS_HomepageLocator.INVOICE_HISTORY_SUBMENU_LOCATOR).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickInvoicing() {
		try {
			// EY_FW_Utility.doWait(5000);
			System.out.println("[MMS_BillingPage : clickInvoiceHistory] Clicking Invoice History ");
			EY_FW_Utility.findElementByLocator(MMS_HomepageLocator.INVOICING_SUBMENU_LOCATOR).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void verifyInvoiceHistoryPageTitle() { System.out.println(
	 * "[MMS_InvoiceHistoryPage : verifyInvoiceHistoryPageTitle] Verifying Invoice History Page title as "
	 * + MMS_ExpectedResult.INVOICE_HISTORY_PAGE_TITLE);
	 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.INVOICE_HISTORY_PAGE_TITLE)); }
	 */
	/*
	 * public void verifyInvoicingPageTitle() { System.out.println(
	 * "[MMS_InvoiceHistoryPage : verifyInvoiceHistoryPageTitle] Verifying Invoice History Page title as "
	 * + MMS_ExpectedResult.INVOICING);
	 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.INVOICING)); }
	 */
	public void removeFilter() {

		try {
			if (flag == 0) {

				System.out.println("[MMS_InvoiceHistoryPage : RemovingFilters] Removing default Filters");
				// EY_FW_Utility.doWait(3000);
				EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.VOID_STATUS_FILTER).click();
				// EY_FW_Utility.doWait(2000);
				EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICE_DATE_FILTER).click();
				// EY_FW_Utility.doWait(2000);
				// EY_FW_Utility.selectNumberofEntries(50);
				EY_FW_Utility.doWait(30000);
				flag++;
			}

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectInvoice(String invoice) {
		int rowNumber = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 2, invoice);
		row_number.add(rowNumber);
		EY_FW_Utility.clickMMSActions(MMS_MyCompanyInfoPageLocator.contacttable, "input", rowNumber, 1);
	}

	public void searchTableandClick(String text, int rno) throws InterruptedException {
		try {
			j = 0;
			System.out.println("[MMS_InvoiceHistoryPage : Search table for element] Searching table for element");
			WebElement table_element = EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.TABLE_ELEMENT);// driver.findElement(By.id("DataTables_Table_0"));
			List<WebElement> tr_collection1 = table_element
					.findElements(By.xpath(MMS_InvoiceHistoryPageLocator.TABLE_ROWS));
			for (WebElement trElement : tr_collection1) {
				WebElement td_collection = trElement.findElement(By.xpath(MMS_InvoiceHistoryPageLocator.COLUMN_TWO));

				if (td_collection.getText().equalsIgnoreCase(text)) {
					WebElement e = EY_GettersSetters.getDriver().findElement(By.xpath("" + "" + "" + ""
							+ "//table[@id='DataTables_Table_0']/tbody/tr[" + ++j + "][td[2]]/td/input"));
					System.out.println("row is " + j);
					lastSentToCombinedBilling = EY_GettersSetters.getDriver()
							.findElement(By.xpath("//table[@id='DataTables_Table_0']/tbody/tr[" + j + "][td[2]]/td[6]"))
							.getText();
					voidstatus = EY_GettersSetters.getDriver()
							.findElement(By.xpath("//table[@id='DataTables_Table_0']/tbody/tr[" + j + "][td[2]]/td[7]"))
							.getText();
					row_number.add(j);
					if (!e.isSelected()) {
						System.out.println("clicking ");
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
	}

	public void clickSendToCombinedBilling() {
		try {
			System.out.println("[MMS_INVOICEHistoryPage : Click Combined Billing] Click on Combined Billing");
			// EY_FW_Utility.doWait(8000);
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.SENDTOCOMBINEDBILLINGBUTTON).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickOKCombinedBilling() {
		try {
			System.out.println(
					"[MMS_INVOICEHistoryPage : ConfirmCombined Billing] Clicking on OK button of combined Billing");
			// EY_FW_Utility.doWait(4000);
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.CONFIRMCOMBINEDBILLING).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickRestoreDefault() {
		try {
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.RESTORE_DEFAULT_INV_HISTORY).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void verifyLastsenttoCombinedBillingDate() {
		try {
			String timeStamp = new SimpleDateFormat("M/d/yyyy").format(Calendar.getInstance().getTime());
			System.out.println(
					"[MMS_InvoiceHistory : verifyLastsenttoCombinedBillingDate] Verifying last sent to combined billing date");
			Iterator<Integer> row_number_Iterator = row_number.iterator();
			while (row_number_Iterator.hasNext()) {
				Integer rno = row_number_Iterator.next();
				System.out.println("row number is " + rno);
				String date = EY_GettersSetters.getDriver()
						.findElement(By.xpath("//table[@id='DataTables_Table_0']/tbody/tr[" + rno + "][td[2]]/td[6]"))
						.getText();
				// return date;
				MatcherAssert.assertThat(timeStamp, equalTo(date));
				// assertEquals(0,timeStamp.compareTo(date));
			}
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void clickBulkBillingSummary() {
		try {
			System.out.println("[MMS_INVOICEHistoryPage : clickBulkBillingSummary ] Clicking on Bulk Billing Summary");
			// EY_FW_Utility.doWait(1000);
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BULKBILLINGSUMMARY).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickFilterButton() {
		try {
			System.out.println("[MMS_INVOICEHistoryPage : clickFilterButton ] Clicking on Filter Button");
			EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.FILTERBUTTON).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickSaveButton() {
		/*
		 * try { System.out.
		 * println("[MMS_INVOICEHistoryPage : clickSaveButton ] Clicking on Save Button"
		 * );
		 * 
		 * EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.SAVEBUTTON).
		 * click(); EY_FW_Utility.doWait(1000); } catch (Exception e) {
		 * Assert.assertTrue(false, e.getMessage()); }
		 */
		EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.SAVE_BUTTON).click();
		/*
		 * Screen s = new Screen(); String path =
		 * System.getProperty("user.dir"); Pattern p = new
		 * Pattern(path+"/"+MMS_InvoiceListPageLocator.filtersaveimage); try {
		 * System.out.
		 * println("[MMS_INVOICEHistoryPage : clickSaveButton ] Clicking on Save Button"
		 * ); s.click(p); } catch (FindFailed e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */
	}

	public void enterFromInvoiceNumber(String invNo) {
		try {
			System.out.println("[MMS_INVOICEHistoryPage : enterFromInvoiceNumber ] entering from invoice number");
			// EY_FW_Utility.doWait(1000);
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.FROMINVOICENUMBER).clear();
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.FROMINVOICENUMBER).sendKeys(invNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterEndInvoiceNumber(String invNo) {
		try {
			System.out.println("[MMS_INVOICEHistoryPage : enterFromInvoiceNumber ] entering from invoice number");
			// EY_FW_Utility.doWait(1000);
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.END_INVNO).clear();
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.END_INVNO).sendKeys(invNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterInvStartDate(String date) {
		try {
			System.out.println("[MMS_INVOICEHistoryPage : enterFromInvoiceNumber ] entering from invoice number");
			// EY_FW_Utility.doWait(1000);
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.STARTDATE_INV).clear();
			// EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.STARTDATE_INV).sendKeys(s);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void voidstatus(String status) {
		try {
			WebElement element = EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INV_STATUS_DROPDOWN);
			//element.click();
			Select dropdown = new Select(element);
			//dropdown.selectByValue(value);
			dropdown.selectByVisibleText(status);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public int countPopupNotifications() {
		try {

			return EY_FW_Utility.getElementListByLocator(MMS_InvoiceHistoryPageLocator.Popup_Error_List).size();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return -1;
	}

	public void enterFromInvDate(String date){
		try{
			WebElement fromdate = EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.From_InvDate);
			fromdate.clear();
			fromdate.sendKeys(date);
		}catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	public void clickRemoveFromCombineBilling(){
		try{
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.Remove_From_CB).click();
			
		}catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	public void clicksendToCombineBilling(){
		try{
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.Send_To_CB).click();
			
		}catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

}
