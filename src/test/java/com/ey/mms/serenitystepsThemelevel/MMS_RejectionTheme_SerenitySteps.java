package com.ey.mms.serenitystepsThemelevel;


import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.Matchers.equalTo;

import static org.junit.Assert.assertThat;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.ey.mms.pageobjects.BillingContactsPage;
import com.ey.mms.pageobjects.ExceptionAndRejectionPage;
import com.ey.mms.pageobjects.ExceptionReviewPage;
import com.ey.mms.pageobjects.MMS_ExpectedResult;
import com.ey.mms.pageobjects.RejectionTrackingPage;
import com.ey.mms.pageobjects.VoidingPage;
import com.ey.mms.pageobjects.HomePage;
import com.ey.mms.pageobjects.mmsLocators.MMS_BillingContactsPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_BulkRebuttalDialogueLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_ExceptionAndRejectionPageLocator;

import com.ey.mms.pageobjects.mmsLocators.MMS_CombineBillingPageLocator;

import com.ey.mms.pageobjects.mmsLocators.MMS_ExceptionTrackingPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_InvoiceHistoryPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_RejectionTrackingPageLocator;
import com.ey.mms.serenitystepsThemelevel.expectedData.ExceptionReview;
import com.ey.mms.serenitystepsThemelevel.expectedData.ExceptionandRejection;
import com.ey.mms.serenitystepsThemelevel.expectedData.RejectionReview;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.EY_GettersSetters;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;

import java.util.Arrays;
import java.util.List;

public class MMS_RejectionTheme_SerenitySteps {

	@ManagedPages
	HomePage mmshomepage;
	@ManagedPages
	ExceptionReviewPage exceptionreviewpage;
	@ManagedPages
	VoidingPage voidingpage;
	@ManagedPages
	RejectionTrackingPage rejectiontrackingpage;
	
	@ManagedPages
	ExceptionAndRejectionPage exceptionandrejectionpage;
	
	
	
	@Step
	public void clickOnInvoicesTab() {
		mmshomepage.clickInvoices();
	}
	
	@Step
	public void SelectExceptions() {
		mmshomepage.selectExceptionsSubMenu("Exceptions");
	}


	@Step
	public void selectRejectionTracking() {
		mmshomepage.selectExceptions_ExceptionsSubmenu("Rejection Tracking");
	}
	
	@Step
	public void selectExceptionReview() {
		mmshomepage.selectExceptions_ExceptionsSubmenu("Exceptions and Rejections");
	}

	@Step
	public void verifyInvoiceCheckedInGrid(){
		boolean invoiceCheckedStatus=voidingpage.verifyCheckBoxSelectedforUnvoid();
		 MatcherAssert.assertThat(invoiceCheckedStatus, equalTo(true));
	}
	
	@Step
	public void verifyRejectionReviewPageTitle() {
		EY_FW_Utility.waitTillPageLoad(12);

		try {
			System.out.println(
					"[MMS_ExceptionReview : verifyExceptionReviewPageTitle] Verifying Exception Review Page Title as "
							+ RejectionReview.REJECTIONTRACKING_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
					equalTo(RejectionReview.REJECTIONTRACKING_PAGE_TITLE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void verifyRejectionReviewPageSections() {
		try {
			MatcherAssert.assertThat(true,
					equalTo(EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Rejection_Tracking_Filter)
							&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Rejection_Tracking_Grid)));

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	@Step
	public void verifyDefaultStatus() {
		try {
			MatcherAssert.assertThat(true,
					equalTo(EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Rejection_Status_NotClosed)));

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	@Step
	public void verifyActionsCoulmn() {
		try {
			MatcherAssert.assertThat(true,
					equalTo(EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Rejection_Tracking_Actions)));

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	@Step
	public void verifyInvoiceFilterSection() {
		try {
			MatcherAssert.assertThat(true,
					equalTo(EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Inv_From_Textbox)
							&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Inv_To_Textbox)
							&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Invoice_Date_Label)
							&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Invoice_EndDate_Textbox)
							&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Invoice_No_Label)
							&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Invoice_Party_Textbox)
							&& EY_FW_Utility
									.isElementPresent(MMS_RejectionTrackingPageLocator.Invoice_StartDate_Textbox)
							&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Invoicing_Party_Label)));

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void verifyRejectionFilterSection() {
		try {
			MatcherAssert.assertThat(true, equalTo(EY_FW_Utility
					.isElementPresent(MMS_RejectionTrackingPageLocator.Inv_From_Textbox)
					&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Inv_To_Textbox)
					&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Invoice_Date_Label)
					&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Invoice_EndDate_Textbox)
					&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Invoice_No_Label)
					&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Invoice_Party_Textbox)
					&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Invoice_StartDate_Textbox)
					&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Invoicing_Party_Label)
					&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Rejection_Date_Label)
					&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Rejection_EndDate_Textbox)
					&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Rejection_Number_From_Textbox)
					&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Rejection_Number_Label)
					&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Rejection_Number_To_Textbox) &&

					EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Rejection_Reason_Label)
					&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Rejection_StartDate_Textbox) &&

					EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Rejection_Status_Label)
					&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Resubmitted_Inv_No_From_Textbox)
					&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Resubmitted_Inv_No_Label)
					&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Resubmitted_Inv_No_To_Textbox)
					&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Save_Button)
					&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Cancel_Button)));
			MatcherAssert.assertThat(true, equalTo(verifyRejectionStatusDropdown()));
			MatcherAssert.assertThat(true, equalTo(verifyRejectionReasonDropdown()));

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	@Step
	public boolean verifyRejectionStatusDropdown() {
		try {
			boolean verify = true;
			WebElement dropdown = EY_FW_Utility.findElementByLocator(MMS_RejectionTrackingPageLocator.Rejection_Status_Dropdown);
			Select select = new Select(dropdown);
			List<WebElement> rejectionStatus = select.getOptions();
			System.out.println("size is" + rejectionStatus.size());
			List<String> rejectionStatusExpectedtext = Arrays.asList("All", "Generated", "Sent", "Closed",
					"In Progress");
			for (int i = 0; i < rejectionStatus.size(); i++) {
				System.out.println(rejectionStatus.get(i).getText());
				if (rejectionStatusExpectedtext.contains(rejectionStatus.get(i).getText())) {
					verify = true;
				} else {
					verify = false;
					break;
				}
			}
			return verify;
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}

	public boolean verifyRejectionReasonDropdown() {
		try {
			boolean verify = true;
			WebElement dropdown = EY_FW_Utility
					.findElementByLocator(MMS_RejectionTrackingPageLocator.Rejection_Reason_Dropdown);
			Select select = new Select(dropdown);
			List<WebElement> rejectionReason = select.getOptions();
			// List<String> rejectionReasontext = null;
			List<String> rejectionReasonExpectedtext = Arrays.asList("All", "Threshold", "Other");
			for (int i = 0; i < rejectionReason.size(); i++) {
				System.out.println(rejectionReason.get(i).getText());
				if (rejectionReasonExpectedtext.contains(rejectionReason.get(i).getText())) {
					verify = true;
				} else {
					verify = false;
					break;
				}
			}
			return verify;
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}

	@Step
	public void filterCollapsed() {
		try {

			WebElement checkbox = EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.contacttable);
			//WebElement savebuttton = EY_GettersSetters.getDriver().findElement(By.id("Save"));
			WebElement savebuttton = EY_GettersSetters.getDriver().findElement(By.id("Save"));
			// EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.contacttable);
			MatcherAssert.assertThat(false, equalTo(savebuttton.isDisplayed()));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	@Step
	public void clickUnreject() {
		try {
			rejectiontrackingpage.clickUnreject();
			//EY_FW_Utility.doWait(40000);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}
	
	@Step
	public void clickEmailButton() {
		try {
			rejectiontrackingpage.clickEmailButton();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}
	
	@Step
	public void verify_popup_title(String popupTitle) {
		EY_FW_Utility.doWait(5000); // wait to get text (load)
		WebElement e = EY_FW_Utility
				.findElementByLocator(MMS_RejectionTrackingPageLocator.EmailRejectionLetterPopup);
		MatcherAssert.assertThat(e.getText(), equalTo(popupTitle));
	}
	
	@Step
	public void clickSendmailButton() {
		try {
			rejectiontrackingpage.clickSendmailButton();
			EY_FW_Utility.waitForLargeProgressWindowToDisappear(600);
			EY_FW_Utility.waitForProgressWindowToDisappear(15);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}
	
	@Step
	public void enterFromInvoiceNo(String fromInvoiceNo) {
		try {
			exceptionreviewpage.enterFromInvoiceNumber(fromInvoiceNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}
	
	@Step
	public void enterFromInvoiceNoInRejectionTracking(String fromInvoiceNo) {
		try {
			rejectiontrackingpage.enterFromInvoicenumber(fromInvoiceNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}
	
	@Step
	public void enterToInvoiceNoInRejectionTracking(String toInvoiceNo) {
		try {
			rejectiontrackingpage.enterToInvoicenumber(toInvoiceNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}
	
	@Step
	public void enterTovoiceNo(String toInvoiceNo) {
		try {
			exceptionreviewpage.enterToInvoiceNumber(toInvoiceNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}
	
	@Step
	public void selectExceptionStatus(String status) {
		try {
			exceptionreviewpage.selectExceptionstatus(status);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}
	@Step
	public void selectHasException(String status) {
		try {
			exceptionreviewpage.selectHasException(status);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}
	
	@Step
	public void selectToOption(String toemailid) {
		try {
			rejectiontrackingpage.selectToOption(toemailid);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}
	@Step
	public void verifyInvoiceNumber(String invNo) {
		try {
			EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable,6, invNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}
	
	@Step
	public void selectInvNo(String invNo) {
		try {
			rejectiontrackingpage.selectInvoices(invNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}
	
	@Step
	public void selectInvNoInRejectionTrackingPage(String invNo) {
		try {
			rejectiontrackingpage.selectInvoicesInRejectionTracking(invNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}
	
	@Step
	public void clickGenerateRejectionLetterButton() {
		try {
			exceptionreviewpage.clickGenerateRejectionLetter();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}
	
	@Step
	public void isInvoiceNotSelected(String invoiceNo){
		int rowNumber = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 6, invoiceNo);
		WebElement checkbox = EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.contacttable+ "[" + rowNumber + "]/td[" + 1 + "]/" + "input");
		MatcherAssert.assertThat(checkbox.isSelected(),
				equalTo(false));
	}
	
	@Step
	public void verifyInvoicesSelectedInGrid(String invoiceNo){
		int rowNumber = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 6, invoiceNo);
		WebElement checkbox = EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.contacttable+ "[" + rowNumber + "]/td[" + 1 + "]/" + "input");
		MatcherAssert.assertThat(checkbox.isSelected(),
				equalTo(true));
	}
	
	@Step
	public void invoicesNotSelectedInGrid(String invoiceNo){
		int rowNumber = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 6, invoiceNo);
		WebElement checkbox = EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.contacttable+ "[" + rowNumber + "]/td[" + 1 + "]/" + "input");
		MatcherAssert.assertThat(checkbox.isSelected(),
				equalTo(false));
	}
	
	@Step
	public void invoicesPresentInGrid(String invoiceNo){
				
		int rowNumber = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 6, invoiceNo);
		WebElement checkbox = EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.contacttable+ "[" + rowNumber + "]/td[" + 1 + "]/" + "input");
		MatcherAssert.assertThat(checkbox.isDisplayed(),
				equalTo(true));	
	}
	
	@Step
	public void clickInvoices() {
		mmshomepage.clickInvoices();
	}
	
	@Step
	public void verifyExceptionReviewPageTitle() {
		EY_FW_Utility.waitTillPageLoad(15);
		try {
			System.out.println(
					"[MMS_ExceptionReview : verifyExceptionReviewPageTitle] Verifying Exception Review Page Title as "
							+ ExceptionReview.EXCEPTIONREVIEW_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
					equalTo(ExceptionReview.EXCEPTIONREVIEW_PAGE_TITLE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	@Step
	public void invoiceValidationErrorpopupMessageFirst(String message){
		try{
			EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
			List<WebElement> webelementList = EY_FW_Utility.getElementListByLocator(MMS_InvoiceHistoryPageLocator.popup_msg1);
			WebElement actualtext = webelementList.get(0);
			MatcherAssert.assertThat(actualtext.getText(), equalTo(message));
		}catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
	}
	
	@Step
	public void verifyEmptyTable() {
		EY_FW_Utility.doWait(5000);
		// mmsexceptiontracking.checkEmptyTable();
		try {
			System.out.println("[MMS_REJECTION_TRACKING : checkEmptyTable], checking whether table is empty or not");
			EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
			MatcherAssert.assertThat(
					EY_FW_Utility.findElementByLocator(MMS_RejectionTrackingPageLocator.NODATA).getText(),
					equalTo(RejectionReview.EMPTYTABLE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}	
	
	@Step
	public void clickActions() {
		rejectiontrackingpage.clickActions();
	}
	
	@Step
	public void clickActionList(String s) {
		rejectiontrackingpage.clickactionlist(s);
	}
	
	@Step
	public void clickactionlistInRejectionTrackingPage(String s) {
		rejectiontrackingpage.clickactionlistInRejectionTrackingPage(s);
	}
	
	@Step
	public void selectStatus(String s) {
		rejectiontrackingpage.selectStatusType(s);
		EY_FW_Utility.doWait(3000); 
	}
	
	@Step
	public void enterResubmittedInvoice(String s) {
		rejectiontrackingpage.enterResubmittedInvoice(s);
	}
	
	@Step
	public void clickSaveStatus() {
		rejectiontrackingpage.clickSaveStatus();
		//EY_FW_Utility.doWait(20000);
	}
	
	@Step
	public void verifyResponse(String s) {
		EY_FW_Utility.doWait(2000);
		try {
			System.out.println("[MMS_REJECTION_TRACKING : verifyUpdatedStatus], verifyinging updated status");
			MatcherAssert.assertThat(
					EY_FW_Utility.findElementByLocator(MMS_RejectionTrackingPageLocator.UpdatedStatus).getText(),
					equalTo(s));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void clickGenerateRejectionOKButton(){
		exceptionandrejectionpage.clickPopUpOkButton();
	} 
	
	@Step
	public void verifyRejectionNumberEditBoxIsPresent(){
		//exceptionandrejectionpage.checkRejectionNumberEditBoxIsPresent();
		try {
			MatcherAssert.assertThat(true,
					equalTo(EY_FW_Utility.isElementPresent(MMS_ExceptionAndRejectionPageLocator.GENERATE_REJECTION_NUMBER_EDITBOX)));

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	@Step
	public void verifyAARRadioButton(){
		exceptionandrejectionpage.checkReasonAARRadioButton();
	
	}
	
	@Step
	public void verifyManualRadioButton(){
		exceptionandrejectionpage.checkReasonmanualRadionButton();
	}
	
	@Step
	public void verifyRejectionMessageEditBoxIsPresent(){
		try {
			MatcherAssert.assertThat(true,
					equalTo(EY_FW_Utility.isElementPresent(MMS_ExceptionAndRejectionPageLocator.GENERATE_REJECTION_MESSAGE_EDITBOX)));

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	@Step
	public void verifyResetButtonIsPresent(){
		try {
			MatcherAssert.assertThat(true,
					equalTo(EY_FW_Utility.isElementPresent(MMS_ExceptionAndRejectionPageLocator.GENERATE_REJECTION_RESET_BUTTON)));

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	@Step
	public void verifySaveButton(){
		exceptionandrejectionpage.verifySaveButton();

	}
	
	@Step
	public void verifyCancelButton(){
		exceptionandrejectionpage.verifyCancelButton();
	}
	
	@Step
	public void clickCancelButton(){
		exceptionandrejectionpage.clickCancelButton();
	}
	
	@Step
	public void verifyRejectionInvoiceButtonIsPresent(){
		
		try {
			MatcherAssert.assertThat(true,
					equalTo(EY_FW_Utility.isElementPresent(MMS_ExceptionAndRejectionPageLocator.GENERATE_REJECTION_REJECT_INVOICE_BUTTON)));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		
		
	}
		
	@Step
	public void verifyGenerateRejectionPageTitle() {
		WebElement  pageHeader=EY_FW_Utility
				.findElementByLocator(MMS_RejectionTrackingPageLocator.Generate_Rejection_Letter_Header);
		try {
			System.out.println(
					"[MMS_ExceptionReview : verifyGenerateRejectionLetterPageTitle] Verifying Generate Rejection Letter Page Title as "
							+ ExceptionReview.GENERATEREJECTIONLETTER_PAGE_TITLE);
			MatcherAssert.assertThat(pageHeader.getText(),
					equalTo(ExceptionReview.GENERATEREJECTIONLETTER_PAGE_TITLE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		
	}
	
	@Step
	public void enterRejectionNumber(String rejectionNumber) {
		rejectiontrackingpage.enterRejectionNumber(rejectionNumber);
		
	}

	@Step
	public void enterRejectionMessage(String rejectionMessage) {
		rejectiontrackingpage.enterRejectionMessage(rejectionMessage);
		
	}
	
	@Step
	public void enterCCEmailId(String ccEmailId) {
		rejectiontrackingpage.enterCCEmailId(ccEmailId);
		
	}

	@Step
	public void clickOnSaveButtonOnGenerateRejectionLetterForm() {
		rejectiontrackingpage.clickOnSaveButton();
		
	}

	@Step
	public void clickOnRejectInvoiceButton() {
		try {
			MatcherAssert.assertThat(true,
					equalTo(EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Reject_Invoice_Button)));

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		
		rejectiontrackingpage.clickRejectInvoiceButton();
		
	}
	
	@Step
	public void clickOnCCCheckbox() {
		try {
			WebElement ccCheckBox= EY_FW_Utility
					.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.CCCheckbox);
			ccCheckBox.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}		
	}

	@Step
	public void verifyEmailConfirmationPopupIsDisplayed() {
		String emailConfirmationPopupTitle= rejectiontrackingpage.getPopupTitle();
		try {
			System.out.println(
					"[MMS_ExceptionReview : verifyEmailConfirmationPopupIsDisplayed] Verifying Email Confirmation Popup is displayed as "
							+ ExceptionReview.EMAIL_CONFIRMATION_POPUP_TITLE);
			MatcherAssert.assertThat(emailConfirmationPopupTitle,
					equalTo(ExceptionReview.EMAIL_CONFIRMATION_POPUP_TITLE));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		
	}

	@Step
	public void verifyEmailConfirmationPopupButtonsAreDisplayed() {
			try {
				MatcherAssert.assertThat(true,
						equalTo(EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Email_Confirmation_Popup_Button1)
								&& EY_FW_Utility.isElementPresent(MMS_RejectionTrackingPageLocator.Email_Confirmation_Popup_Button2)));

			} catch (Exception e) {
				Assert.assertTrue(false, e.getMessage());
			}
			
		}
	@Step
	public void verifyAARRadioButtonIsChecked(){
		try {
			MatcherAssert.assertThat(true,
					equalTo(EY_FW_Utility.isCheckboxSelected(MMS_ExceptionAndRejectionPageLocator.GENERATE_REJECTION_RESON_AAR_RADIO)));

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
		
	@Step
	public void verifyGenerateRejectionErrorMessage(){
		WebElement  errorMsg=EY_FW_Utility
				.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.GENERATE_REJECTION_CLICK_SAVE_ERROR);
		try {
			System.out.println(
					"[MMS_ExceptionReview : verifyGenerateRejectionLetterPageTitle] Verifying Generate Rejection Letter Page Title as "
							+ ExceptionandRejection.GENERATE_REJECTION_ERROR_MSG);
			MatcherAssert.assertThat(errorMsg.getText(),
					equalTo(ExceptionandRejection.GENERATE_REJECTION_ERROR_MSG));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	@Step
	public void clickManualReasonRadionButton(){
		exceptionandrejectionpage.clickRejectionReasonRadioButton();
	}

	@Step
	public void clickOnYesSendItNowButton() {
		rejectiontrackingpage.clickSenditNowButton();
		
	}

	@Step
	public void verifyRejectionLetterCcEmailId(String ccemailid) {
		WebElement  defaultValueCCemailid=EY_FW_Utility
				.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.CCTextbox);
		try {
			MatcherAssert.assertThat(defaultValueCCemailid.getAttribute("value"),
					equalTo(ccemailid));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		
	}
	
	@Step
	public void verifyRejectionMessageInEditBox(String rejectionmsg) {
		WebElement  rejectionMessageInEditBox=EY_FW_Utility
				.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.Rejection_Message);
		try {
			MatcherAssert.assertThat(rejectionMessageInEditBox.getAttribute("value"),
					equalTo(rejectionmsg));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		
	}
	
	@Step
	public void verifyRejectionNumberInEditBox(String rejectionnumber) {
		WebElement  rejectionNumberInEditBox=EY_FW_Utility
				.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.Rejection_Number);
		try {
			MatcherAssert.assertThat(rejectionNumberInEditBox.getAttribute("value"),
					equalTo(rejectionnumber));
			//MatcherAssert.assertThat(rejectionNumberInEditBox.getAttribute("ng-reflect-is-disabled"),
					//equalTo("true"));
			
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		
	}
	
	@Step
	public void verifyRejectionLetterTODropdownHasDefaultValue(String toemailid) {
		String defaultValueTODropdown= EY_FW_Utility.getDefaultValueOfDropdown(MMS_ExceptionAndRejectionPageLocator.TO_DROPDOWN);
			
		try {
				MatcherAssert.assertThat(defaultValueTODropdown,(equalTo(toemailid)));
			} catch (Exception e) {
				Assert.assertTrue(false, e.getMessage());
			}	
	}
	
	@Step
	public void verifyFromFieldValue() {
		WebElement  defaultValueFromemailid=EY_FW_Utility
				.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.FromTextbox);
		try {
			MatcherAssert.assertThat(defaultValueFromemailid.getAttribute("value"),
					!equals(""));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}	
	}

	public void verifyRejectInvoiceButtonIsDisabled() {
		try {
			MatcherAssert.assertThat(true,
					equalTo(EY_FW_Utility.verifyElementIsDisabled(MMS_RejectionTrackingPageLocator.Reject_Invoice_Button)));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		}
}
