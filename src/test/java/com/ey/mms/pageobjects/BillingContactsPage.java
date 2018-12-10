package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.MMS_BillingContactsPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_UserManagerPageLocator;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.EY_GettersSetters;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class BillingContactsPage extends PageObject {

	/*
	 * public void verifyBillingContactsPageTitle() { try { System.out.println(
	 * "[MMS_BillingContacts : verifyBillingContactsPageTitle] Verifying Billing contacts title as "
	 * + MMS_ExpectedResult.Billing_Contacts_PAGE_TITLE);
	 * assertThat(EY_FW_Utility.getCurrentPageTitle(),
	 * equalTo(MMS_ExpectedResult.Billing_Contacts_PAGE_TITLE)); } catch
	 * (Exception e) { Assert.assertTrue(false, e.getMessage()); } }
	 */

	public void clickAddCompany() {
		try {

			System.out.println("[clickAddCompany : Clicking on add company]");
			EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.Add_Company).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterARNO(String arNo) {
		try {
			System.out.println("[enterARNo : entering ARRNO]");
			EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.ARNo).clear();
			EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.ARNo).sendKeys(arNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterAPNO(String apNo) {
		try {
			System.out.println("[enterAPNo : entering APNO]");
			EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.APNo).clear();
			EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.APNo).sendKeys(apNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterName(String name) {
		try {
			System.out.println("[enterMark : entering name]");
			EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.Name).clear();
			EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.Name).sendKeys(name);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterMark(String rmark) {
		try {
			System.out.println("[enterMark :enterimg mark]");
			EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.mark).clear();
			EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.mark).sendKeys(rmark);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickSave() {
		try {
			System.out.println("[billingContacts clicksave : Clicking on add company]");
			EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.Save).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickCancel() {
		try {
			System.out.println("[billingContacts clickcancel : Clicking on cancel]");
			EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.Cancel).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterRmark(String rmark) {
		try {
			System.out.println("[enterMark :enterimg mark]");
			EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.rmark).clear();
			EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.rmark).sendKeys(rmark);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickActions() {
		try {
			System.out.println("[click actions : Billing Contacts]");
			EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.Actions).click();
			EY_FW_Utility.doWait(2000);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickactionlist(String ationList) {
		try {
			System.out.println("[MMS_BillingContacts : clickactionlist], clicking on action list");

			EY_FW_Utility.clickMMSActionList(MMS_MyCompanyInfoPageLocator.contacttable,
					MMS_UserManagerPageLocator.actionlist1, MMS_UserManagerPageLocator.actionlist2, 1, 6, ationList);

			// EY_FW_Utility.getAnyElementByAnyLocator(MMS_BillingContactsPageLocator.ActionList1+s+MMS_BillingContactsPageLocator.ActionList2).click();
			/*
			 * EY_GettersSetters.getDriver().findElement(By .xpath(
			 * "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[6]/div/ul/li[a[contains(.,'"
			 * + s + "')]]")) .click();
			 */
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectcompanyEnabled(String enabledString) {
		try {
			System.out
					.println("[MMS_BillingContacts : selectcompanyEnabled] Selecting exception contact from dropdown.");
			WebElement company = EY_FW_Utility
					.findElementByLocator(MMS_BillingContactsPageLocator.companyenabled_dropdown);
			Select dropdown = new Select(company);
			dropdown.selectByVisibleText(enabledString);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectcontactEnabled(String contactEnabled) {
		try {
			System.out
					.println("[MMS_BillingContacts : selectcompanyEnabled] Selecting exception contact from dropdown.");
			WebElement company = EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.Contactenabled);
			Select dropdown = new Select(company);
			dropdown.selectByVisibleText(contactEnabled);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickok() {
		try {
			System.out.println("[click ok : Billing Contacts]");
			EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.ok).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickcancel() {
		try {
			System.out.println("[click cancel : Billing Contacts]");
			EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.cancel).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickPlusSign() {

		EY_FW_Utility.findElementByLocator("xpath_.//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]").click();
		/*
		 * Screen s = new Screen(); String path =
		 * System.getProperty("user.dir");//new
		 * PropertyReader().readProperty("path"); Pattern p = new
		 * Pattern(path+"/"+MMS_BillingContactsPageLocator.plus); try {
		 * s.click(p); } catch (FindFailed e) {
		 * 
		 * e.printStackTrace(); }
		 */

	}

	public void clickactions() {
		try {
			System.out.println("[MMS_Company Info : clickactions], clicking on actions");

			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.CONTACT_ACTIONS).click();

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickactionssubtable() {
		try {
			System.out.println("[MMS_Company Info : clickactions], clicking on actions");

			EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.subtable_actions).click();

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clicksubtableactionlist(String actionList) {
		try {
			System.out.println("[MMS_USER MANAGER : clickactionlist], clicking on action list");
			EY_FW_Utility.findElementByLocator(MMS_BillingContactsPageLocator.SubTableActionList1 + actionList
					+ MMS_BillingContactsPageLocator.ActionList2).click();
			// .//*[@data-table-name='CompanyContactsTable']/tbody/tr
			/*
			 * getDriver().findElement( By.xpath(
			 * ".//*[@data-table-name='CompanyContactsTable']/tbody/tr[1]/td[6]/div/ul/li[a[contains(.,'"
			 * + s + "')]]")) .click();
			 */
			// "//*[@id='DataTables_Table_0']/tbody/tr[1]/td[8]/div/ul/li[a[contains(.,'Edit')]]"

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

}
