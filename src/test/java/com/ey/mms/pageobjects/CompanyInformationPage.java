package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.testng.AssertJUnit.assertEquals;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.MMS_ExceptionTrackingPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_UserManagerPageLocator;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.EY_MMS_FW_Constants;

import net.serenitybdd.core.pages.PageObject;

public class CompanyInformationPage extends PageObject {
	public static int rownumber;

	/*public void verifyCompanyInfoPageTitle() {
		try {
			System.out
					.println("[MMS_MY Company Info : verifyCompanyInfoPageTitle] Verifying Company Info Page Title as "
							+ MMS_ExpectedResult.COMPANY_INFO_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), equalTo(MMS_ExpectedResult.COMPANY_INFO_PAGE_TITLE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

*/	/*
	 * public void AreDetailsDisplayed() { try {
	 * System.out.println("[MMS_COMPANYINFO : are details displayed ??]"); //
	 * List<WebElement> l = //
	 * EY_FW_Utility.getAllElementsByAnyLocator(MMS_Locators.DISPLYEDIINFO_LIST)
	 * ; assertEquals(EY_FW_Utility.getAllElementsByAnyLocator(
	 * MMS_MyCompanyInfoPageLocator.DISPLYEDIINFO_LIST).size(), 5); } catch
	 * (Exception e) { Assert.assertTrue(false, e.getMessage()); } }
	 */
	public void clickEditButton() {
		try {
			System.out.println("[MMS_COMPANYINFO : clickEditButton] clicking on edit button");
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.EDITBUTTON).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void verifyEditCompanypopup(String s) { try { System.out.
	 * println("[MMS_MY Company Info : verifyEditCompanypopup] Verifying edit company popup title "
	 * ); assertThat(EY_FW_Utility.getAnyElementByAnyLocator(
	 * MMS_MyCompanyInfoPageLocator.EDITCOMPANYPOPUP).getText(), equalTo(s)); }
	 * catch (Exception e) { Assert.assertTrue(false, e.getMessage()); } }
	 */

	/*public void verifyPopupDeatils() {
		try {
			System.out.println("[MMS_MY Company Info : verifypopupdetails] Verifying edit company popup details");
			MatcherAssert.assertThat(true,equalTo(
					EY_FW_Utility.isElementPresent(MMS_MyCompanyInfoPageLocator.MARK)
							&& EY_FW_Utility.isElementPresent(MMS_MyCompanyInfoPageLocator.NAME)
							&& EY_FW_Utility.isElementPresent(MMS_MyCompanyInfoPageLocator.APNUMBER)
							&& EY_FW_Utility.isElementPresent(MMS_MyCompanyInfoPageLocator.ARNUMBER)
							&& EY_FW_Utility.isElementPresent(MMS_MyCompanyInfoPageLocator.TAXPAYERID)));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}*/

	public void EditPopupDetails(String mark, String name, String apNo, String arNo, String taxPayerId) {
		try {
			System.out.println("[MMS_MY Company Info : Editpopupdetails]  editing company popup details");

			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.MARK).clear();
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.NAME).clear();
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.APNUMBER).clear();
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.ARNUMBER).clear();
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.TAXPAYERID).clear();

			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.MARK).sendKeys(mark);
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.NAME).sendKeys(name);
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.APNUMBER).sendKeys(apNo);
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.ARNUMBER).sendKeys(arNo);
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.TAXPAYERID).sendKeys(taxPayerId);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

/*	public void verifyPopupDetails(String s1, String s2, String s3, String s4, String s5) {
		try {
			System.out.println("[MMS_MY Company Info : Editpopupdetails]  verifying company popup details");
			EY_FW_Utility.doWait(3000); // verification step
			
			MatcherAssert.assertThat(
					EY_FW_Utility.getAnyElementByAnyLocator(MMS_MyCompanyInfoPageLocator.DISPLYEDIINFO_LIST1).getText(),
					equalTo(s1));
			MatcherAssert.assertThat(
					EY_FW_Utility.getAnyElementByAnyLocator(MMS_MyCompanyInfoPageLocator.DISPLYEDIINFO_LIST2).getText(),
					equalTo(s2));
			MatcherAssert.assertThat(
					EY_FW_Utility.getAnyElementByAnyLocator(MMS_MyCompanyInfoPageLocator.DISPLYEDIINFO_LIST3).getText(),
					equalTo(s3));
			MatcherAssert.assertThat(
					EY_FW_Utility.getAnyElementByAnyLocator(MMS_MyCompanyInfoPageLocator.DISPLYEDIINFO_LIST4).getText(),
					equalTo(s4));
			MatcherAssert.assertThat(
					EY_FW_Utility.getAnyElementByAnyLocator(MMS_MyCompanyInfoPageLocator.DISPLYEDIINFO_LIST5).getText(),
					equalTo(s5));

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}*/

	public void verifyFailPopupDetails(String list1, String list2, String list3, String list4, String list5) {
		try {
			System.out.println("[MMS_MY Company Info : Editpopupdetails]  verifying company popup details");

			MatcherAssert.assertThat(
					EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.DISPLYEDIINFO_LIST1).getText(),
					not(equalTo(list1)));
			MatcherAssert.assertThat(
					EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.DISPLYEDIINFO_LIST2).getText(),
					not(equalTo(list2)));
			MatcherAssert.assertThat(
					EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.DISPLYEDIINFO_LIST3).getText(),
					not(equalTo(list3)));
			MatcherAssert.assertThat(
					EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.DISPLYEDIINFO_LIST4).getText(),
					not(equalTo(list4)));
			MatcherAssert.assertThat(
					EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.DISPLYEDIINFO_LIST5).getText(),
					not(equalTo(list5)));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*public void verifyPopupButtons() {
		try {
			System.out
					.println("[MMS_MY Company Info : verifyPopupButtons] Verifying edit company popup button details");
			MatcherAssert.assertThat(true, equalTo(EY_FW_Utility.isElementPresent(MMS_MyCompanyInfoPageLocator.EDITSAVEBUTTON)
					&& EY_FW_Utility.isElementPresent(MMS_MyCompanyInfoPageLocator.CANCELBUTTON)));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}*/

	public void clickCancel() {
		try {
			System.out.println("[ MMS_COMPANY INFO : click cancel button]");
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.CANCELBUTTON).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickSave() {
		try {
			System.out.println("[ MMS_COMPANY INFO : click save button]");
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.EDITSAVEBUTTON).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickAddContact() {
		try {
			System.out.println("[ MMS_COMPANY INFO : click addcontact button]");
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.ADDCONTACT).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterContactDetails(String contactName, String title, String phone, String fax, String email, String country1, String city,
			String address1, String city1, String state, String zipcode) {
		try {
			System.out.println("Entering contact details");
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.CONTACTNAME).clear();
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.TITLE).clear();
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.PHONE).clear();
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.FAX).clear();
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.EMAIL).clear();
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.ADDRESS1).clear();
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.CITY).clear();
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.STATE).clear();
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.zipcode).clear();
			
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.CONTACTNAME).sendKeys(contactName);
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.TITLE).sendKeys(title);
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.PHONE).sendKeys(phone);
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.FAX).sendKeys(fax);
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.EMAIL).sendKeys(email);
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.ADDRESS1).sendKeys(address1);
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.CITY).sendKeys(city1);
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.STATE).sendKeys(state);
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.zipcode).sendKeys(zipcode);

			WebElement country = EY_FW_Utility
					.findElementByLocator(MMS_MyCompanyInfoPageLocator.COUNTRYCODE_DROPDOWN);
			Select dropdown = new Select(country);
			dropdown.selectByVisibleText(country1);

			String multipleSel[] = city.split(",");

			for (String valueToBeSelected : multipleSel) {

				WebElement type = EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.TYPE_SELECTID);
				Select mselect = new Select(type);
				mselect.selectByVisibleText(valueToBeSelected);
			}

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickActions(String actions) {
		try {
			System.out.println("[MMS_Company Info : clickactions], clicking on actions");
			rownumber = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 1, actions);
			EY_FW_Utility.clickMMSActions(MMS_MyCompanyInfoPageLocator.contacttable, MMS_UserManagerPageLocator.divison,
					rownumber, 6);
			// EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.CONTACT_ACTIONS).click();

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickCompanyActionList(String actionList) {
		try {
			System.out.println("[MMS_Company Info : clickactionlist], clicking on action list");

			EY_FW_Utility.clickMMSActionList(MMS_MyCompanyInfoPageLocator.contacttable,
					MMS_UserManagerPageLocator.actionlist1, MMS_UserManagerPageLocator.actionlist2, rownumber, 6, actionList);

			/*
			 * int size = getDriver().findElements( By.xpath(
			 * "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[6]/div/ul/li[a[contains(.,'"
			 * + s + "')]]") ).size();
			 * 
			 * if( size != 0){ getDriver().findElement(By .xpath(
			 * "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[6]/div/ul/li[a[contains(.,'"
			 * + s + "')]]")) .click(); }
			 */
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickContactsCancel() {
		try {
			System.out.println("[MMS_COMPANYINFO clicking on cancel of disable contact]");
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.CANCEL_DISABLECONTACTS).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void clickContactsSave() {
		try {
			System.out.println("[MMS_COMPANYINFO clicking on save of disable contact]");
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.SAVECONTACT).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void savePopup() {
		try {
			System.out.println("[MMS_COMPANYINFO clicking on save of disable contact]");
			EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.CONFIRMSAVE).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	/*public void verifyEnabledtext(String s) {
		MatcherAssert.assertThat(EY_FW_Utility.getTextofField(MMS_MyCompanyInfoPageLocator.contacttable, rownumber, 4), equalTo(s));
		// assertThat(EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.ENABLEDTEXT).getText(),
		// equalTo(s));
	}
*/
}
