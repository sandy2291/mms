package com.ey.mms.pageobjects;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import static org.hamcrest.CoreMatchers.equalTo;

import com.ey.mms.pageobjects.mmsLocators.MMS_RepairDetailPageLocator;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.EY_GettersSetters;

import net.serenitybdd.core.pages.PageObject;

public class RepairDetailsPage extends PageObject {

	/*
	 * public void verifyRepairDetailsPageTitle() { System.out.
	 * println("[MMS_RepairDetail : verifyRepairDetailTitle] Verifying Repair Detail Page title as "
	 * + MMS_ExpectedResult.REPAIRDETAIL_PAGE_TITLE);
	 * MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.REPAIRDETAIL_PAGE_TITLE)); }
	 */
	public void clickFilterButton() {

		WebElement filterButton = EY_FW_Utility
				.findElementByLocator(MMS_RepairDetailPageLocator.REPAIR_DETAIL_FILTER_BUTTON_LOCATOR);
		filterButton.click();

	}

	public void enterInvoiceNumbers(String invNumStart, String invNumEnd) {
		WebElement invoiceStartNum = EY_FW_Utility.findElementByLocator(
				MMS_RepairDetailPageLocator.REPAIR_DETAIL_INVOICENUMBERSTART_EDITBOX_LOCATOR);
		invoiceStartNum.clear();
		invoiceStartNum.sendKeys(invNumStart);

		WebElement invoiceEndNum = EY_FW_Utility
				.findElementByLocator(MMS_RepairDetailPageLocator.REPAIR_DETAIL_INVOICENUMBEREND_EDITBOX_LOCATOR);
		invoiceEndNum.clear();
		invoiceEndNum.sendKeys(invNumStart);

	}

	public void clickSave() {

		JavascriptExecutor jse = (JavascriptExecutor) EY_GettersSetters.getDriver();
		jse.executeScript("window.scrollBy(0,125)", "");
		WebElement saveButton = EY_FW_Utility
				.findElementByLocator(MMS_RepairDetailPageLocator.REPAIR_DETAIL_SAVE_BUTTON);
		saveButton.click();
		WebElement removeFilterLink = EY_FW_Utility
				.findElementByLocator(MMS_RepairDetailPageLocator.REPAIR_DETAIL_REMOVEFILTER_LINK);
		removeFilterLink.click();
		// EY_FW_Utility.doWait(8000);
		/*
		 * Screen s = new Screen(); Pattern p = new
		 * Pattern(MMS_Locators.filtersaveimage); try { System.out.
		 * println("[MMS_Repair Details : clickSave] Clicking on Save Button");
		 * s.click(p); } catch (FindFailed e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */

	}

	public void clickAudit() {

		try {
			EY_FW_Utility.findElementByLocator(MMS_RepairDetailPageLocator.AUDIT_TAB).click();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void clickCarAudit() {

		try {
			EY_FW_Utility.findElementByLocator(MMS_RepairDetailPageLocator.CAR_Audit_Tab).click();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
