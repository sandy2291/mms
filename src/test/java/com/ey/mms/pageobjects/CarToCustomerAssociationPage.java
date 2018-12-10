package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.testng.AssertJUnit.assertEquals;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.MMS_CartoCustomerAssocPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_ExceptionReviewCarListPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_UserManagerPageLocator;
import com.ey.mms.util.EY_FW_Utility;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class CarToCustomerAssociationPage extends PageObject {


	public void clickFilter() {
		try {
			System.out.println("[MMS_Car To Customer Association : clickFilter] clicking on filter");
			EY_FW_Utility.waitForProcessingNotificationToDisappear(20);
			EY_FW_Utility.waitForModalBackgroundFadeToDisappear(8);
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.C2CA_Filter).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickSaveFilter() {
		try {
			System.out.println("[MMS_Car To Customer Association : clicksaveFilter] clicking on save filter");
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.ASSOC_SAVE).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterCarInitial(String carInitial) {
		try {
			System.out.println("[MMS_Car To Customer Association : enterCarInitial] entering car initial");
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.ASSOC_CARINITIAL).clear();
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.ASSOC_CARINITIAL).sendKeys(carInitial);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterFromCarNo(String fromCarNumber) {
		try {
			System.out.println("[MMS_Car To Customer Association : enterFromCarNo] entering car from number");
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.ASSOC_CARNUMBER).clear();
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.ASSOC_CARNUMBER).sendKeys(fromCarNumber);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterCarEndNumber(String endCarNo) {
		try {
			System.out.println("[MMS_Car To Customer Association : enterCarEndNumber] entering car end number");
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.ASSOC_CAREND).clear();
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.ASSOC_CAREND).sendKeys(endCarNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterCustomer(String customer) {
		try {
			System.out.println("[MMS_Car To Customer Association : enterCustomer] entering customer");
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.ASSOC_CUSTOMER).clear();
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.ASSOC_CUSTOMER).sendKeys(customer);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectEnabled(String enabledColumn) {
		try {
			System.out.println("[MMS_Car To Customer Association : selectEnabled] selecting enabled");
			WebElement enabled = EY_FW_Utility
					.findElementByLocator(MMS_CartoCustomerAssocPageLocator.ASSOC_ENABLED);
			// enabled.click();
			// EY_FW_Utility.doWait(2000);
			Select dropdown = new Select(enabled);
			dropdown.selectByVisibleText(enabledColumn);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickSave() {
		try {
			System.out.println("[MMS_Car To Customer Association : clickSave] clicking on save");
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.ASSOC_SAVE).click();

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickCancel() {
		try {
			System.out.println("[MMS_Car To Customer Association : clickCancel] clicking on cancel");

			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.ASSOC_CANCEL).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickAddAssoc() {
		try {
			System.out.println("[MMS_Car To Customer Association : clickAddAssoc] clicking on add assoc");
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.ADD_ASSOCIATION).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickok() {
		try {
			System.out.println("[MMS_Car To Customer Association : clickok] clicking on ok");
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.okdisable).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickActions() {
		try {
			System.out.println("[MMS_Car To Customer Association : clickActions] clicking on actions");
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.ASSOC_ACTIONS).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickactionlist(String actionList) {
		try {
			System.out.println("[MMS_C2CA : clickactionlist], clicking on action list");
			EY_FW_Utility.clickMMSActionList(MMS_MyCompanyInfoPageLocator.contacttable,
					MMS_UserManagerPageLocator.actionlist1, MMS_UserManagerPageLocator.actionlist2, 1, 6, actionList);
			
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterAssocCarInitial(String carInitial) {
		try {
			System.out.println("[MMS_Car To Customer Association : enterCarInitial] entering car initial");
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.ASSOC_INITIAL).clear();
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.ASSOC_INITIAL).sendKeys(carInitial);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterBeginrange(String beginCarRange) {
		try {
			System.out.println("[MMS_Car To Customer Association : enterBeginrange] entering start range");
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.BEGINRANGE).clear();
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.BEGINRANGE).sendKeys(beginCarRange);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterCarEndRange(String endCarRange) {
		try {
			System.out.println("[MMS_Car To Customer Association : enterCarEndRange] entering car end range");
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.ENDRANGE).clear();
			EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.ENDRANGE).sendKeys(endCarRange);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectCustomer(String customerName) {
		try {
			System.out.println("[MMS_Car To Customer Association : enterCustomer] selecting customer");
			WebElement customer = EY_FW_Utility
					.findElementByLocator(MMS_CartoCustomerAssocPageLocator.CUSTOMER_DROPDOWN);
			Select dropdown = new Select(customer);
			dropdown.selectByVisibleText(customerName);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickpopuSave() {
		
		  try { 
			  System.out.println("[MMS_Car To Customer Association : clickpopupSave] clicking on save"); 
			  EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.Img_Save).click();
		  
		  } catch (Exception e) { Assert.assertTrue(false, e.getMessage()); }
		 

	}


	public void clickPopupCancelButton() {
		
		  try { 
			  System.out.println("[MMS_Car To Customer Association : clickpopupCancel] clicking on cancel");
		  
			  EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.popup_cancel).click();
		  } catch (Exception e) { Assert.assertTrue(false,
		  e.getMessage()); }


	}
	
	public void clickPopupCancel() {
		
		  try { 
			  System.out.println("[MMS_Car To Customer Association : clickpopupCancel] clicking on cancel");
		  
			  EY_FW_Utility.findElementByLocator(MMS_CartoCustomerAssocPageLocator.Img_Cancel).click();
		  } catch (Exception e) { Assert.assertTrue(false,
		  e.getMessage()); }
		 

	}

}
