package com.ey.mms.serenitystepsThemelevel;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.CoreMatchers.containsString;
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.equalTo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.mockito.internal.matchers.GreaterOrEqual;
import org.mockito.internal.matchers.GreaterThan;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.ey.mms.pageobjects.Billing_EditInvoicePage;
import com.ey.mms.pageobjects.HomePage;
import com.ey.mms.pageobjects.InvoiceHistoryPage;
import com.ey.mms.pageobjects.LoginPage;
import com.ey.mms.pageobjects.VoidingPage;
import com.ey.mms.pageobjects.mmsLocators.MMS_InvoiceHistoryPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.serenitystepsThemelevel.expectedData.Home;
import com.ey.mms.serenitystepsThemelevel.expectedData.InvoiceHistory;
import com.ey.mms.util.EY_FW_Utility;

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;

public class MMS_VoidingTheme_SerenitySteps {
	
	@ManagedPages
	InvoiceHistoryPage invHistory;
/*	
	@ManagedPages
	VoidingPage voidingFirstOption;
	
	@ManagedPages
	VoidingPage  mmspopuperrormsg;
	*/
	@ManagedPages
	LoginPage mmsloginpage;
	
	@ManagedPages
	Home mmshome;
	
	@ManagedPages
	HomePage mmshomepage;
	
	@ManagedPages
	VoidingPage voidingpage;
	
	
	@ManagedPages
	Billing_EditInvoicePage mmsbillingeditInvoice;
	
	
	

	
	
	
	@ManagedPages
	InvoiceHistory mmsinvoicehistory;
	
	
	@ManagedPages
	HomePage mmshomePage;
	
	
	
	@Step
	public void selectInvoice(String invoiceNo){
		int rowNumber = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 2, invoiceNo);
		EY_FW_Utility.clickMMSActions(MMS_MyCompanyInfoPageLocator.contacttable, "input", rowNumber, 1);
		//EY_FW_Utility.clickMMSActions(locatorPath1, locatorPath2, rowNumber, colNumber);
	}
	
	@Step
	public void selectInvoicewithStatus(String status){
		int rowNumber = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 7, status);
		EY_FW_Utility.clickMMSActions(MMS_MyCompanyInfoPageLocator.contacttable, "input", rowNumber, 1);
		//EY_FW_Utility.clickMMSActions(locatorPath1, locatorPath2, rowNumber, colNumber);
	}
	
	
	@Step
	public void isInvoiceSelected(String invoiceNo){
		int rowNumber = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 2, invoiceNo);
		WebElement checkbox = EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.contacttable+ "[" + rowNumber + "]/td[" + 1 + "]/" + "input");
		MatcherAssert.assertThat(checkbox.isSelected(),
				equalTo(true));
	}
	
	
	@Step
	public void isInvoiceNotSelected(String invoiceNo){
		int rowNumber = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 2, invoiceNo);
		WebElement checkbox = EY_FW_Utility.findElementByLocator(MMS_MyCompanyInfoPageLocator.contacttable+ "[" + rowNumber + "]/td[" + 1 + "]/" + "input");
		MatcherAssert.assertThat(checkbox.isSelected(),
				equalTo(false));
	}
	
	
	@Step
	public void checkPopupNotifications(){
		voidingpage.clickNotification();
		MatcherAssert.assertThat(invHistory.countPopupNotifications(), greaterThan(0));
	}
	
	
	@Step
	public void verifyPopupErrorMessage(String actualMessage){
		try{
			// EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.Popup_Error_Div_Button).click();
			String failureMessage = EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.Popup_Error_Div_Button_Message).getText();
			MatcherAssert.assertThat(failureMessage, equalTo(actualMessage));
			EY_FW_Utility.doWait(3000);
			
			voidingpage.clickNotification();
		}catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
	}
	
	@Step
	public void verifyUpdatedDate(){
		try{
			
			EY_FW_Utility.waitForProcessingNotificationToAppear(5);
			EY_FW_Utility.waitForProcessingNotificationToDisappear(20);
			String timeStamp = new SimpleDateFormat("M/d/yyyy").format(Calendar.getInstance().getTime());
			//EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 8, timeStamp);	
			String date=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.STATUS_DATE).getText();
			MatcherAssert.assertThat(date, containsString(timeStamp));
				// assertEquals(0,timeStamp.compareTo(date));
			}
		catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	@Step
	public void verifyEmptyDate(){
		try{
			//String timeStamp = new SimpleDateFormat("M/d/yyyy").format(Calendar.getInstance().getTime());
			EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 8, "");	
			//MatcherAssert.assertThat(timeStamp, equalTo(date));
				// assertEquals(0,timeStamp.compareTo(date));
			}
		catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	@Step
	public void clickFilterButton(){
		invHistory.clickFilterButton();
	}
	
	@Step
	public void enterInvoiceDate(String fromdate){
		invHistory.enterFromInvDate(fromdate);
	}
	
	@Step
	public void selectVoidStatus(String Status){
		invHistory.voidstatus(Status);
	}
	
	@Step
	public void clickOkPop(){
		voidingpage.clickOK();
	}
	
	@Step
	public void invoiceValidationErrorpopupMessageFirst(String message){
		try{
			List<WebElement> webelementList = EY_FW_Utility.getElementListByLocator(MMS_InvoiceHistoryPageLocator.popup_msg1);
			WebElement actualtext = webelementList.get(0);
			MatcherAssert.assertThat(actualtext.getText(), equalTo(message));
		}catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
	}
	

	@Step
	public void failedtoUnvoidInvoiceMessage(String message){
		try{
			List<WebElement> webelementList = EY_FW_Utility.getElementListByLocator(MMS_InvoiceHistoryPageLocator.failed_unvoid_inv_msg);
			WebElement actualtext = webelementList.get(0);
			MatcherAssert.assertThat(actualtext.getText(), equalTo(message));
		}catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
	}
	
	@Step
	public void popupErrorMessageSecond(String message){
		try{
			
			List<WebElement> webelementList = EY_FW_Utility.getElementListByLocator(MMS_InvoiceHistoryPageLocator.popup_msg2);
			WebElement actualtext = webelementList.get(0);
/*			WebElement actualtext = EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.popup_msg2);*/
			MatcherAssert.assertThat(actualtext.getText(), equalTo(message));
		}catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
	}
	
	
	@Step
	public void clickremoveCB(){
		invHistory.clickRemoveFromCombineBilling();
	}
	

	@Step
	public void clicksendToCB(){
		invHistory.clicksendToCombineBilling();
	}
	
	
	
	
	/*@Step
	public void clickBillingMainMenu(){
		voidingpage.clickBillingButton();
	}*/
	
	@Step
	public void clickInvoiceHistorySubMenu(){
		voidingpage.clickINvoiceHistoryButton();
	}
	
	@Step
	public void verifyVoidInvoice(){
		//mmsinvoicehistorynewpages.verifyVoidInvoiceButtonEnable();
		try{
			MatcherAssert.assertThat(true,equalTo(EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.Void_Button).isEnabled()));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
	}
	}
	
	@Step
	public void verifyUnvoidInvoice(){
		//mmsinvoicehistorynewpages.verifyUnvoidInvoiceEnable();
		try{
			MatcherAssert.assertThat(true,equalTo(EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.Unvoid_Button).isEnabled()));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
	}
	}
	
	@Step
	public void verifybulkBilling(){
		//mmsinvoicehistorynewpages.verifyInvoiceBulkBillingButton();
		try{
			MatcherAssert.assertThat(true,equalTo(EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BulkBilling_Button).isEnabled()));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
	}
	}
	
	@Step
	public void verifyRemoveFromCombinedBilling(){
		//mmsinvoicehistorynewpages.verifyRemoveCombinedBillingButton();
		try{
			MatcherAssert.assertThat(true,equalTo(EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.RemovefromCB_Button).isEnabled()));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
	}
	}
	
	@Step
	public void verifySendToCombinedBilling(){
		//mmsinvoicehistorynewpages.verifysendtoCombinedBilling();
		try{
			MatcherAssert.assertThat(true,equalTo(EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.SendtoCB_Button).isEnabled()));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
	}
	}
	
	@Step
	public void verifyPopup(){
		voidingpage.verifyPopup();
	}
	
	@Step
	public void acceptAlert(){
		voidingpage.acceptAlert();
	}
	
	/*@Step
	public void clickVoidInvoiceBtn(){
		voidingpage.clickVoidInvoiceBtn();
	}*/
	
	@Step
	public void clickUnvoidInvoiceBtn(){
		voidingpage.clickUnVoidInvoiceBtn();
	}
	
	@Step
	public void clickBulkBillingBtn(){
		voidingpage.clickBulkBillingBtn();
	}
	
	@Step
	public void clickRemovefromCombinedBilling(){
		voidingpage.clickRemoveCombinedBillingBtn();
	}
	
	@Step
	public void clickSendtoCombinedBilling(){
		voidingpage.clickSendToCombinedBillingBtn();
	}
	
	@Step
	public void clickBillingMainMenu(){
		voidingpage.clickBillingMainMenu();
	}
	
	@Step
	public void clickInvoicingSubMenu(){
		mmsbillingeditInvoice.clickInvoicingSubMenu();
	}
	
	@Step
	public void verifyVoidedCustomer(){
		mmsbillingeditInvoice.verifyVoidedInvoiceCustomerNum();
	}
    
	
	@Step
	public void clickAction(){
		mmsbillingeditInvoice.clickActionOfInvoicing();
	}
	
	@Step
	public void clickViewDetails(){
		mmsbillingeditInvoice.clickActionViewDetailOfInvoicing();
	}
	
	@Step
	public void verifyCustomerAmount(){
		String amountText=mmsbillingeditInvoice.verifyVoidedInvoiceAmount();
		MatcherAssert.assertThat(amountText, equalTo(InvoiceHistory.BILLING_INVOICING_CUSTOMER_AMOUNT));
	}
	
	@Step
	public void clickCloseOfViewDetails(){
		mmsbillingeditInvoice.clickCloseViewDetails();
	}
	
	@Step
	public void clickCheckBoxforFirstOpt(){
		mmsbillingeditInvoice.clickCheckBoxForFirstopt();
	}
	
	@Step
	public void clickGenerateInvoice(){
		mmsbillingeditInvoice.clickGenerateInvoiceBtn();
	}
	
	@Step
	public void verifyInvoiceEditBox(){
		mmsbillingeditInvoice.verifyInvoiceEditBox();
	}
	
	@Step
	public void verifyGenerateInvoiceDailouge(){
		String invoiceDailougeBox=mmsbillingeditInvoice.verifyGenerateInvoiceDialougeBox();
		MatcherAssert.assertThat(invoiceDailougeBox, equalTo(InvoiceHistory.BILLING_INVOICING_DAILOUGEBOX));
	}
	
	@Step
	public void clickInvoiceNum(){
		mmsbillingeditInvoice.clickInvoiceNumberEditBox();
	}
	
	@Step
	public void enterInvoiceNum(String invoicenum){
		mmsbillingeditInvoice.enterInvoiceNumber(invoicenum);
	}
	
	@Step
	public void clickGenerateInvoicesBtn(){
		mmsbillingeditInvoice.clickGenerateInvoicesBtn();
	}
	
	@Step
	public void verifyGenerateInvoiceSucessMsg(){
		String successMessage=mmsbillingeditInvoice.verifyGenerateInvoiceSuccessMsg();
		MatcherAssert.assertThat(successMessage, equalTo(InvoiceHistory.BILLING_INVOICING_SUCCESS_MSG));
	}
	
	@Step
	public void clickCancelOfGenerateInvoices(){
		mmsbillingeditInvoice.clickGenerateInvoicePopUpCancel();
	}
	
	@Step
	public void verifyEditedInvoiceNum(){
		String editedInvoiceNumber=mmsbillingeditInvoice.verifyEditedInvoice();
		MatcherAssert.assertThat(editedInvoiceNumber, equalTo(InvoiceHistory.BILLING_EDITEDINVOICE));
	}
	
	@Step
	public void verifyEditedInvoiceVoidStatus(){
		String invoiceVoidStatus=mmsbillingeditInvoice.verifyVoidStatusForEditedInvoice();
		MatcherAssert.assertThat(invoiceVoidStatus, equalTo(InvoiceHistory.BILLING_INVOICING_EDITEDINVOICE_SECONDOPT_STATUS));
	}
	
	@Step
	public void clickCheckboxforSecondOpt(){
	mmsbillingeditInvoice.clickCheckBoxForSecondopt();
	}
	
	@Step
	public void verifyBilledpartyforSecondOption(){
		String billingParty=mmsbillingeditInvoice.verifyBilledPartyforSecondOpt();
		MatcherAssert.assertThat(billingParty, equalTo(InvoiceHistory.BILLING_INVOICNG_CUSTOMER_FORSECONDOPT));
	}
	
	@Step
	public void verifyGenerateInvoiceDailougeforSecondOpt(){
		String invoiceDailougeBox=mmsbillingeditInvoice.verifyGenerateInvoiceDialougeBoxforSecondOpt();
		MatcherAssert.assertThat(invoiceDailougeBox, equalTo(InvoiceHistory.BILLING_INVOICING_DAILOUGEBOX_FORSECONDOPT));
	}
	
	@Step
	public void verifyCustomerAmountforSecondOption(){
		String amountText=mmsbillingeditInvoice.verifyVoidedInvoiceAmountforSecondOpt();
		MatcherAssert.assertThat(amountText, equalTo(InvoiceHistory.BILLING_INVOICNG_BILLEDPARTY_AMOUNT_FORSECONDOPT));
	}
	
	@Step
	public void clickActionforSecondOption(){
		mmsbillingeditInvoice.clickActionOfInvoicingforSecondOption();
	}
	
	@Step
	public void clickActionforViewDetailsforSecondOpt(){
		mmsbillingeditInvoice.clickActionViewDetailOfInvoicingforSecondOption();
	}
	
	@Step
	public void verifyEditedInvoiceNumforSecondOpt(){
		String editedInvoiceNumber=mmsbillingeditInvoice.verifyEditedInvoiceForSecondOpt();
		MatcherAssert.assertThat(editedInvoiceNumber, equalTo(InvoiceHistory.BILLING_EDITEDINVOICE_FOR_SECOND_OPT));
	}
	
	@Step
	public void verifyEditedInvoiceStatusforSecondopt(){
		String voidStatus=mmsbillingeditInvoice.verifyVoidStatusForEditedInvoice();
		MatcherAssert.assertThat(voidStatus, equalTo(InvoiceHistory.BILLING_INVOICING_EDITEDINVOICE_SECONDOPT_STATUS));
	}
	
	@Step
	public void verifyGeneratedInvoiceStatusforSecondOpt(){
		String voidStatus=mmsbillingeditInvoice.veifyVoidStatusforGeneratedInvoice();
		MatcherAssert.assertThat(voidStatus, equalTo(InvoiceHistory.BILLING_INVOICING_GENERATED_INVOICENUM_SECONDOPT_VOIDSTATUS));
	}
	
	@Step
	public void opensMMSLoginPage() {
		mmsloginpage.openURL();		
	}
	
	@Step
	public void enterUserId(String userid) {
		mmsloginpage.enterUserId(userid);
	}

	@Step
	public void enterPassword(String password) {
		mmsloginpage.enterPassword(password);		
	}
	
	@Step
	public void clickLoginButton() {
		mmsloginpage.clickLoginButton();		
	}
	
	@Step
	public void verifyHomePage() {
		mmsloginpage.getHomePageTitle();
	}
	
	@Step
	public void clickBilling(){
		voidingpage.clickBillingMainMenu();
	}
	
	@Step
	public void clickInvoiceHistory(){
		voidingpage.clickInvoiceHistorySunMenu();
	}
   
	@Step
	public void verifyInvoiceHistoryPage(){
		//mmsvoidfirstoption.verifyInvoiceHistoryPageTitle();
		System.out.println(
				"[MMS_Invoice_ReviewPage : verifyInvoiceDetailsPageTitle] Verifying Invoice Details Page Title as "
						+ InvoiceHistory.INVOICEHISTORY_PAGE_TITLE );
		MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
				equalTo(InvoiceHistory.INVOICEHISTORY_PAGE_TITLE ));
	}
	
	@Step
	public void verifyVoidButton(){
		boolean voidButtonPresence=voidingpage.verifyVoidButtonPresence();
		MatcherAssert.assertThat(voidButtonPresence, equalTo(true));
	}
	
	@Step
	public void verifyUnvoidButton(){
		boolean unVoidButtonPresence=voidingpage.verifyUnvoidButtonPresence();
		MatcherAssert.assertThat(unVoidButtonPresence, equalTo(true));
	}
	
	@Step
	public void verifyVoidStatus(){
		String voidStatus =voidingpage.verifyVoidStatusTxt();
		MatcherAssert.assertThat(voidStatus, equalTo(InvoiceHistory.INVOICEHISTORY_VOID_STATUS));
		
	}
	
	@Step
	public void clickInvoiceCheckBox(){
		voidingpage.clickInvoiceCheckbox();
	}
	
	@Step
	public void clickVoidInvoiceBtn(){
		voidingpage.clikcVoidInvoiceButton();
		
	}
	
	
    
	@Step
	public void verifyVoidInvoiceDialogeBox(){
		String voidInvoiceDailogeBox=voidingpage.verifyVoidInvoiceDialogeBox();
		MatcherAssert.assertThat(voidInvoiceDailogeBox, equalTo(InvoiceHistory.INVOICEHISTORY_VOIDINVOICE_POPUP));
	}
	
	@Step
	public void verifyVoidInvoiceFirstOption(){
		String optMsg=voidingpage.verifyFirstOptionMsg();
		MatcherAssert.assertThat(optMsg, equalTo(InvoiceHistory.INVOICEHISTORY_FIRSTOPTIONMSG));
	}
	
	@Step
	public void verifyVoidInvoiceSecondOption(){
		String optMsg=voidingpage.verifySecondOptionMsg();
		MatcherAssert.assertThat(optMsg, equalTo(InvoiceHistory.INVOICEHISTORY_SECONDOPTIONMSG));
	}
	
	@Step
	public void verifyVoidInvoiceThirdOption(){
		String optMsg=voidingpage.verifyThirdOptionMsg();
		MatcherAssert.assertThat(optMsg, equalTo(InvoiceHistory.INVOICEHISTORY_THIRDOPTIONMSG));
	}
	
	@Step
	public void verifyVoidInvoiceCancel(){
		boolean presenceofCancelBtn=voidingpage.voidCancelButtonPresence();
		MatcherAssert.assertThat(presenceofCancelBtn, equalTo(true));
	}
	
	@Step
	public void verifyVoidInvoiceBtn(){
		boolean presenceofVoidinvoiceBtn= voidingpage.voidInvoiceButtonPresence();
		MatcherAssert.assertThat(presenceofVoidinvoiceBtn, equalTo(true));
	}
   
   @Step
   public void clikcCheckBoxFirstOption(){
	   voidingpage.clickCheckBoxForFirstOption();
   }
   
  @Step
  public void clickCloseInvoiceDate(){
	  voidingpage.clickCloseInvoiceDate();
  }
  
  @Step
  public void clickCloseVoidStatus(){
	  voidingpage.clickCloseVoidStatus();
	  
  }
  
  @Step
  public void clickFirstoptionRadio(){
	  voidingpage.clickFirstOptionOfVoidInvoiceDialougeBox();
  }
  
  /*@Step
  public void clickFirstOption(){
	  mmsvoidfirstoption.clickFirstOptionOfVoidInvoice();
  }*/
  
  @Step
  public void clickCancelVoidInvoiceDailogue(){
	  voidingpage.clickCancelVoidInvoiceDailogueBox();
  }
  
  @Step
  public void clickVoidInvoiceSaveDailouge(){
	  voidingpage.clickVoidInvoiceInvoiceDialouge();
  }
  
  @Step
  public void clickVoidInvoiceNotification(){
	  voidingpage.clickNotification();
  }
  
  @Step
  public void verifyVoidSuccessMsg(){
	try{
		String successMsg=voidingpage.verifyGenerateInvoiceSuccessMsg();
	    MatcherAssert.assertThat(successMsg, equalTo(InvoiceHistory.BILLING_INVOICING_SUCCESS_MSG));
	 }
	  catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
  }
  
  @Step
  public void clickFilter(){
	  voidingpage.clickFilterButton();
  }
  
  @Step
  public void enterInvoiceFrom(String invoiceStart){
	  voidingpage.enterInvoiceStart(invoiceStart);
  }
  
  @Step
  public void enterInvoiceTo(String endInvoice){
	  voidingpage.enterInvoiceEnd(endInvoice);
  }
  
  @Step
  public void clickFilterSave(){
	  voidingpage.clickFilterSave();
  }
  
  @Step
  public void verifyVoidStatusfirstopt(){
    String firstOption=voidingpage.verifyVoidStatusForFirstOption();
	MatcherAssert.assertThat(firstOption, equalTo(InvoiceHistory.INVOICEHISTORY_VOIDSTATUS_FIRSTOPTION));
  }
  
  @Step
  public void clickInvoiceAlreadySentToCombinedBilling(){
	  voidingpage.clickInvoiceSentToCombinedBilling();
  }
  
  @Step
  public void clickCombinedBillingPopupOk(){
	  voidingpage.clickCombinedBillingPopupOk();
  }
  
  @Step
  public void clickSendToCombinedBilling(){
	  voidingpage.clickCombinedBillingButton();
  }
  
  @Step
  public void verifyInvoicePresentGrid(){
	  String invoicepresent=voidingpage.verifyInvoiceNumPresentInGrid();
	  
	  MatcherAssert.assertThat(invoicepresent, equalTo(InvoiceHistory.INVOICEHISTORY_INVOICENUMBER));
  }
  
  @Step
  public void VerifyErrorMsgforAlreadySentToCombinedBilling(){
	  String errorMsg=voidingpage.verifyErrorInvoiceAlreadySentCombinedBill();
	MatcherAssert.assertThat(errorMsg, equalTo(InvoiceHistory.INVOICEHISTORY_INVOICE_COMBINEDBILLING_ERROR));
  }
  
  
  @Step
  public void VerifyErrorMsgAlreadySentToCombinedBilling(String s){
	  String errorMsg=voidingpage.verifyErrorInvoiceAlreadySentCombinedBill();
	MatcherAssert.assertThat(errorMsg, equalTo(s));
  }
  
  @Step
  public void clickMultipleInvoiceFirst(){
	  voidingpage.clickMultipleInvoiceFirstChecKBox();
  }
  
  @Step
  public void clickMultipleInvoiceSecond(){
	  voidingpage.clickMultipleInvoiceSecondChecKBox();
  }
  
  @Step
  public void clickThirdOption(){
	  voidingpage.clickThirdOptionOfVoidInvoiceDialougeBox();
  }
  
  @Step
  public void clickCheckBoxThirOpt(){
	  voidingpage.clickCheckBoxforThirdOpt();
  }
  
  @Step
  public void verifyStatusforThirdOpt(){
	 String thirdStatusOption= voidingpage.verifyVoidStatusforThirdoptTxt();
	MatcherAssert.assertThat(thirdStatusOption, equalTo(InvoiceHistory.INVOICEHISTORY_VOIDSTATUS_THIRDOPTION));
  }
  
  @Step
  public void verifyAlertPopup(){
	  voidingpage.verifyAlertPopup();
  }
  
  @Step
  public void clickBulkBilling(){
	  voidingpage.clickbulkbilling();
  }
  
  @Step
  public void clickVoidErrorforCombinedBillingInvoice(){
	  voidingpage.clickVoidErrorforCombinedBillingInvoice();
  }
  
  @Step
  public void clickOkMultipleVoidFailure(){
	  voidingpage.clickokVoidingFailure();
  }
  
  @Step
  public void clickOksingleVoidFailure(){
	  voidingpage.clickokSingleVoidingFailure();
  }
	
  
  
  @Step
  public void clickOk(){
	  voidingpage.clickOK();
  }
  
  @Step
  public void clickcloseVoidStatus(){
	  voidingpage.clickVoidStatus();
  }
  
  @Step
  public void verifyInvoiceHistoryPageTitle(){
	  voidingpage.verifyInvoiceHistoryPageTitle();
  }    
  
  
  @Step
  public void selectFirstInvoice(){
	  voidingpage.clickChkBoxTestaa1();
  }    
  
  @Step
  public void clickVoidInvoice(){
	  voidingpage.clickvoid();
  }
  
  @Step
  public void verifyErrorPopSingleVoidedInvoice(){
  	String errorPopMsg=voidingpage.verifySingleErrorMsgForVoid();
  	MatcherAssert.assertThat(errorPopMsg, equalTo(InvoiceHistory.POP_UP_ERROR_SINGLE_INVOICE_VOID));
  }
  
  @Step
  public void selectSecondInvoice(){
	  voidingpage.clickChkBoxTestbb1();
  }
  
  @Step
  public void selectThirdInvoice(){
	  voidingpage.clickChkBoxTestdd1(); 	
  }
 
  @Step
  public void verifyErrorPopMultipleVoidedInvoice(){
  	String errorPopUpforMultipleVoidedInvoice=voidingpage.verifyMultipleErrorMsgforVoid();
  	MatcherAssert.assertThat(errorPopUpforMultipleVoidedInvoice, equalTo(InvoiceHistory.POP_UP_ERROR_MULTIPLE_INVOICE_VOID));
  }
  
  @Step
  public void selectFourthInvoice(){
	  voidingpage.clickChkBoxTestee1();	
  }
  
  @Step
  public void VerifyErrorPopMultipleCombiInvoice(){
  	String errorPopupforMultipleInvoiceSentToCombinedBilling=voidingpage.verifyCombiErrorMsgforVoid();
  	MatcherAssert.assertThat(errorPopupforMultipleInvoiceSentToCombinedBilling, equalTo(InvoiceHistory.POP_UP_ERROR_COMBI_INVOICE_VOID));
  }
  
  @Step
  public void verifyCheckforInvoiceSelection(){
  	
  boolean invoiceCheckedStatus= voidingpage.verifyInvoiceChecked();
  MatcherAssert.assertThat(invoiceCheckedStatus, equalTo(true));
  	
  	
  }
  
  
	
	@Step
	public void clickCheckboxa1(){
		voidingpage.clickCheckBoxfora1();
	}
	
	@Step
	public void clickCheckboxb1(){
		voidingpage.clickCheckBoxforb1();
	}
	
	@Step
	public void clickCheckboxc1(){
		voidingpage.clickCheckBoxforc1();
	}
	
	@Step
	public void clickCheckboxaCC1(){
		voidingpage.clickCheckBoxforCC1();
	}
	
	
	@Step
	public void clickUnvoidBtn(){
		voidingpage.clickUnvoidInvoiceButton();
	}
	
	@Step
	public void verifySingleInvoiceUnvoidError(){
		String singleInvoiceUnvoidError=voidingpage.verifySingleErrorMsgforUnvoid();
		 MatcherAssert.assertThat(singleInvoiceUnvoidError, equalTo(InvoiceHistory.POPUP_SINGLE_INVOICE_STATUS_UNVOID_ERROR));
	}
	
	@Step
	public void verifyMultipleInvoiceUnvoidError(){
		String errorMessageForMultipleInvoice=voidingpage.verifyMultipleErrorMsgforUnvoid();
	   MatcherAssert.assertThat(errorMessageForMultipleInvoice, equalTo(InvoiceHistory.POPUP_MULTIPLE_INVOICE_STATUS_UNVOID_ERROR));
	}
	
	@Step
	public void verifyCombinedInvoiceUnvoidError(){
		String unvoidError=voidingpage.verifyCombinedErrorforUnvoid();
		MatcherAssert.assertThat(unvoidError, equalTo(InvoiceHistory.POPUP_COMBINED_INVOICE_STATUS_UNVOID_ERROR));
	}
	
	/*@Step
	public void clickOkPop(){
		voidingpage.clickOK();
	}*/
	
	@Step
	public void verifyInvoiceCheckedForUnvoid(){
		boolean invoiceCheckedStatus=voidingpage.verifyCheckBoxSelectedforUnvoid();
		 MatcherAssert.assertThat(invoiceCheckedStatus, equalTo(true));
	}
	
	@Step
	public void clickCheckBoxfor333333(){
		voidingpage.clickCheckBoxfor333333();
	}
	
	@Step
	public void verifyUnvoidstatus(){
		String unvoidStatus=voidingpage.verifyUnVoidStatusfor333333();
	  MatcherAssert.assertThat(unvoidStatus, equalTo(InvoiceHistory.BILLING_INVOICEHISTORY_333333INVOICE_VOIDSTATUS));
	}
  
	
	@Step
	public void clickOkButtonForUnvoidInvoicePopup(){
		voidingpage.clockOkofUnvoidInvoicePopup();
	}
	
	
}
