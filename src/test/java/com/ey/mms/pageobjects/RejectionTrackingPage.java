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

public class RejectionTrackingPage extends PageObject {

	public void enterFromInvoicenumber(String fromInvoiceNo) {
		try {
			WebElement fromInvoiceNumber = EY_FW_Utility
					.findElementByLocator(MMS_RejectionTrackingPageLocator.Inv_From_Textbox);

			fromInvoiceNumber.clear();
			fromInvoiceNumber.sendKeys(fromInvoiceNo);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	public void enterToInvoicenumber(String toInvoiceNo) {
		try {
			WebElement toInvoiceNumber = EY_FW_Utility
					.findElementByLocator(MMS_RejectionTrackingPageLocator.Inv_To_Textbox);

			toInvoiceNumber.clear();
			toInvoiceNumber.sendKeys(toInvoiceNo);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickInvoiceApprovePayment() {
		try {
			System.out.println(
					"[MMS_Rejection_Tracking_Page : clickUnreject] Clicking on Unreject in Rejection Tracking Page");
			EY_FW_Utility.findElementByLocator(MMS_RejectionTrackingPageLocator.Unreject_Button)
					.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	public void clickActions() {
		try {
			System.out.println("[click actions : Update Status]");
			EY_FW_Utility.findElementByLocator(MMS_RejectionTrackingPageLocator.Actions).click();
			EY_FW_Utility.doWait(2000);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	public void clickactionlist(String ationList) {
		try {
			System.out.println("[MMS_UpdateStatus : clickactionlist], clicking on Update Status");

			EY_FW_Utility.clickMMSActionList(MMS_RejectionTrackingPageLocator.contacttable,

					MMS_RejectionTrackingPageLocator.actionlist1, MMS_RejectionTrackingPageLocator.actionlist2, 1, 6, ationList);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	public void clickactionlistInRejectionTrackingPage(String ationList) {
		
		WebElement s= EY_FW_Utility.findElementByLocator("xpath_//a[contains(text(),'"+ationList+"')]");
		s.click();
		
		/*try {
			System.out.println("[MMS_UpdateStatus : clickactionlist], clicking on Update Status");

			EY_FW_Utility.clickMMSActionList(MMS_RejectionTrackingPageLocator.contacttable,

					MMS_RejectionTrackingPageLocator.actionlist1, MMS_RejectionTrackingPageLocator.actionlist2, 1, 3, ationList);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}*/
	}
	
	public void selectStatusType(String statusType) {
		try {
			System.out.println("[MMS_REJECTION_TRACKING : selectstatustype], Selecting status type");
			WebElement statustype = EY_FW_Utility
					.findElementByLocator(MMS_RejectionTrackingPageLocator.Status_Dropdown);
			Select dropdown = new Select(statustype);
			dropdown.selectByVisibleText(statusType);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	public void enterResubmittedInvoice(String resubmittedInvoiceNumber) {
		try {
			System.out.println("[MMS_REJECTION_TRACKING : enterResubmittedInvoice], entering resubmitted Invoice number");
			WebElement comment = EY_FW_Utility
					.findElementByLocator(MMS_RejectionTrackingPageLocator.Resubmitted_Invoice_Number);
			comment.clear();
			comment.sendKeys(resubmittedInvoiceNumber);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	

	public void clickSave() {
		/* try {
			System.out.println("[MMS_Rejection_Tracking : clickSaveButton], clicking on Save button");

			EY_FW_Utility.clickMMSActionList(MMS_RejectionTrackingPageLocator.contacttable,
					MMS_RejectionTrackingPageLocator.actionlist1, MMS_RejectionTrackingPageLocator.actionlist2, 1, 6, ationList);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}*/
	}

	public void enterRejectionNumber(String rejectionNumber) {
		try {
			WebElement toInvoiceNumber = EY_FW_Utility
					.findElementByLocator(MMS_RejectionTrackingPageLocator.Rejection_Number);
			toInvoiceNumber.clear();
			toInvoiceNumber.sendKeys(rejectionNumber);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		
	}

	public void enterRejectionMessage(String rejectionMessage) {
		try {
			WebElement toInvoiceNumber = EY_FW_Utility
					.findElementByLocator(MMS_RejectionTrackingPageLocator.Rejection_Message);
			toInvoiceNumber.clear();
			toInvoiceNumber.sendKeys(rejectionMessage);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		
	}
	
	public void enterCCEmailId(String ccEmailId) {
		try {
			WebElement toInvoiceNumber = EY_FW_Utility
					.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.CCTextbox);
			toInvoiceNumber.clear();
			toInvoiceNumber.sendKeys(ccEmailId);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		
	}

	public void clickOnSaveButton() {
		try {
			WebElement saveGenerateRejectionLetter= EY_FW_Utility
					.findElementByLocator(MMS_RejectionTrackingPageLocator.Save_Generate_Rejection_Letter);
			saveGenerateRejectionLetter.click();
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
	
	public void selectToOption(String toemailid) {
		try {
			WebElement toemaildropdown = EY_FW_Utility
					.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.TO_DROPDOWN);
			Select dropdown = new Select(toemaildropdown);
			dropdown.selectByVisibleText(toemailid);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	public void selectInvoicesInRejectionTracking(String InvoiceNo) {
		try {
			int rowNumber = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 3, InvoiceNo);
			EY_FW_Utility.clickMMSActions(MMS_MyCompanyInfoPageLocator.contacttable, "input", rowNumber, 1);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	public void clickUnreject() {
		try {
			System.out.println("[MMS_Unreject : clickactionlist], clicking on Unreject Button");
			EY_FW_Utility.findElementByLocator(MMS_RejectionTrackingPageLocator.Unreject_Button).click();
		//	EY_FW_Utility.doWait(50000);
			
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	public void clickEmailButton() {
		try {
			System.out.println("[MMS_Unreject : clickactionlist], clicking on Email Button");
			EY_FW_Utility.findElementByLocator(MMS_RejectionTrackingPageLocator.Email_Button).click();
		//	EY_FW_Utility.doWait(50000);
			
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	public void clickSendmailButton() {
		try {
			System.out.println("[MMS_Email : Send mail], clicking on Send mail Button");
			EY_FW_Utility.findElementByLocator(MMS_RejectionTrackingPageLocator.Sendmail_Button).click();
			//EY_FW_Utility.doWait(50000);

			
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

		
		
	}

	public void clickRejectInvoiceButton() {
		try {
			WebElement rejectInvoice= EY_FW_Utility
					.findElementByLocator(MMS_RejectionTrackingPageLocator.Reject_Invoice_Button);
			rejectInvoice.click();

	}
		 catch (Exception e) {
				Assert.assertTrue(false, e.getMessage());
			}

			
			
		}
	
	
	public void clickSaveStatus() {
		try {
			System.out.println(
					"[MMS_Rejection_Tracking_Page : clickSavebuttonforstatus] Clicking on Status Save Button in Rejection Tracking Page");
			EY_FW_Utility.findElementByLocator(MMS_RejectionTrackingPageLocator.Rejection_Status_Save_Button).click();

			
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

		
		
	}

	public String getPopupTitle() {
		WebElement emailConfirmationPopup= EY_FW_Utility
				.findElementByLocator(MMS_RejectionTrackingPageLocator.Email_Confirmation_Popup);	
		String popupTitle=emailConfirmationPopup.getText();
		return popupTitle;
	}


	public void clickSenditNowButton() {
		WebElement emailConfirmationPopupButton2= EY_FW_Utility
				.findElementByLocator(MMS_RejectionTrackingPageLocator.Email_Confirmation_Popup_Button2);
		emailConfirmationPopupButton2.click();
		
		EY_FW_Utility.waitForLargeProgressWindowToDisappear(180);
		EY_FW_Utility.waitForProcessingNotificationToAppear(5);
		EY_FW_Utility.waitForProcessingNotificationToDisappear(20);
		
	}
}



