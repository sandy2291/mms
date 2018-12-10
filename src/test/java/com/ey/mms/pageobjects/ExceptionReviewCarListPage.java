package com.ey.mms.pageobjects;

import static org.testng.AssertJUnit.assertEquals;

import java.util.List;

import org.hamcrest.MatcherAssert;
import org.jruby.RubyProcess.Sys;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.*;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.EY_GettersSetters;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import static org.hamcrest.CoreMatchers.equalTo;
public class ExceptionReviewCarListPage extends PageObject {

	public static int j, k;
	int nrows;

	/*public void searchTableandClick(String invNo, String actionList) throws InterruptedException {
		try {
			System.out.println("[MMS_EXCEPTIONREVIEW_CARLIST : searchTableandClick] Searching table and click");
			j = 1;
			WebElement table_element = EY_FW_Utility
					.findElementByLocator(MMS_InvoiceHistoryPageLocator.TABLE_ELEMENT);// driver.findElement(By.id("DataTables_Table_0"));
			List<WebElement> tr_collection1 = table_element
					.findElements(By.xpath(MMS_InvoiceHistoryPageLocator.TABLE_ROWS));
			nrows = tr_collection1.size();
			for (WebElement trElement : tr_collection1) {
				WebElement td_collection = trElement.findElement(By.xpath(MMS_InvoiceHistoryPageLocator.COLUMN_THREE));

				if (td_collection.getText().equalsIgnoreCase(invNo)) {

					List<WebElement> l = EY_GettersSetters.getDriver()
							.findElements(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[14]/div/ul/li/a"));

					for (WebElement we : l) {
						System.out.println(we.getText());
					}
					EY_GettersSetters.getDriver()
							.findElement(
									By.xpath("//table[@id='DataTables_Table_0']/tbody/tr[" + j + "]/td[14]/div/button"))
							.click();
					// EY_FW_Utility.doWait(2000);
					k = j;
					EY_GettersSetters.getDriver().findElement(By.xpath("//table[@id='DataTables_Table_0']/tbody/tr[" + j
							+ "]/td[14]/div/ul/li[a[contains(.,'" + actionList + "')]]")).click();

					break;
				}
				j++;
			}
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
*/
	public void editExceptionAmount(String exceptionAmount) {
		try {
			System.out.println("[MMS_EXCEPTIONREVIEW_CARLIST : editExceptionamount] Editing exception amount");
			WebElement amount = EY_FW_Utility
					.findElementByLocator(MMS_ExceptionReviewCarListPageLocator.EDITEXCEPTIONAMOUNT_LOCATOR);
			amount.clear();
			//EY_FW_Utility.doWait(2000); // need this badly
			amount.sendKeys(exceptionAmount);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void ClickSaveButton() {
		System.out.println("[MMS_EXCEPTIONREVIEW_CARLIST : ClickSaveButton] Clicking save button");
		EY_FW_Utility.findElementByLocator(MMS_ExceptionReviewCarListPageLocator.Save_Button).click();
		EY_FW_Utility.doWait(12000); // updation
		/*Screen s = new Screen();
		String path = System.getProperty("user.dir");
		Pattern p = new Pattern(path+"/"+MMS_ExceptionReviewCarListPageLocator.Saveimage);
		try {
			EY_FW_Utility.doWait(3000);
			s.click(p);
		} catch (FindFailed e) {
			e.printStackTrace();
		}*/

	}

	public void ClickCancelButton() {
		System.out.println("[MMS_EXCEPTIONREVIEW_CARLIST : ClickCancelButton] Clicking cancel button");
		EY_FW_Utility.findElementByLocator(MMS_ExceptionReviewCarListPageLocator.Cancel_Button).click();
		/*Screen s = new Screen();
		String path = System.getProperty("user.dir");
		Pattern p = new Pattern(path+"/"+MMS_ExceptionReviewCarListPageLocator.Cancelimage);
		try {
			EY_FW_Utility.doWait(2000);
			s.click(p);
		} catch (FindFailed e) {

			e.printStackTrace();
		}*/

	}

	/*public void verifyAmount(String actualAmount) {
		try {
			System.out.println("[MMS_EXCEPTIONREVIEW_CARLIST : Verifyamount] Verifying amount");
			MatcherAssert.assertThat("$" + actualAmount,equalTo( EY_FW_Utility
					.findElementByLocator("xpath_.//*[@id='DataTables_Table_0']/tbody/tr[" + j + "]/td[12]/div")
					.getText()));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}*/

	/*
	 * public void verifyAmountFieldRequiredMessage() { try {
	 * System.out.println(
	 * "[MMS_EXCEPTIONREVIEW_CARLIST : verifyamountfieldRequiredmessage] Verifying amount field required message"
	 * ); assertEquals(MMS_ExpectedResult.AMOUNTFIELDREQUIRED,
	 * EY_FW_Utility.getAnyElementByAnyLocator(
	 * MMS_ExceptionReviewCarListPageLocator.AMOUNTFIELDREQUIRED_LOCATOR).
	 * getText()); } catch (Exception e) { Assert.assertTrue(false,
	 * e.getMessage()); } }
	 */

	public void verifyamountfieldMoreMessage(String message) {
		try {
			System.out.println(
					"[MMS_EXCEPTIONREVIEW_CARLIST : verifyamountfieldMoremessage] Verifying amount field more message");
			// assertThat(s, containsText(MMS_ExpectedResult.AMOUNTNOMORETHAN));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickRemoveRepair() {
		try {
			System.out.println("[MMS_EXCEPTIONREVIEW_CARLIST : clickremoverepair] Clicking on remove repair");
			EY_FW_Utility.findElementByLocator(MMS_ExceptionReviewCarListPageLocator.REMOVEREPAIRSAVEBUTTON)
					.click();

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void isNotDisplayed() {
		try {
			System.out.println(
					"[MMS_EXCEPTIONREVIEW_CARLIST : isnotdisplayed] checking whether element is displayed or not");
			MatcherAssert.assertThat(j, equalTo(nrows));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectAudit() {
		try {
			System.out.println("[MMS_EXCEPTIONREVIEW_CARLIST : selectaudit] selecting audit");
			/*EY_GettersSetters.getDriver().findElement(By.xpath("//table[@id='DataTables_Table_0']/tbody/tr[" + j + "]/td[13]/div/span"))
			.click();*/
			EY_GettersSetters.getDriver().findElement(By.xpath("//table[@id='DataTables_Table_0']/tbody/tr[1]/td[13]/div/span"))
					.click();
			// EY_FW_Utility.doWait(3000);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public Boolean checkremovemessage(String message) {
		try {
			System.out.println("[MMS_EXCEPTIONREVIEW_CARLIST : checkremovemessage] checking for remove message");
			k = 1;
			WebElement table_element = EY_FW_Utility
					.findElementByLocator(MMS_ExceptionReviewCarListPageLocator.AUDITRESULTSTABLE_ELEMENT);
			List<WebElement> tr_collection1 = table_element
					.findElements(By.xpath(MMS_ExceptionReviewCarListPageLocator.AUDITRESULTSTABLE_ROWS));

			for (WebElement trElement : tr_collection1) {
				WebElement td_collection = trElement
						.findElement(By.xpath(MMS_ExceptionReviewCarListPageLocator.COLUMN_FOUR));
				if (td_collection.getText().contains(message)) {
					return true;
				}

			}

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}

}
