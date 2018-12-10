package com.ey.mms.pageobjects;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.MMS_ExceptionAndRejectionPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_InvoiceHistoryPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_InvoiceListPageLocator;
import com.ey.mms.serenitystepsThemelevel.expectedData.InvoiceHistory;
import com.ey.mms.util.EY_FW_Utility;

import net.serenitybdd.core.pages.PageObject;

public class ExceptionAndRejectionPage extends PageObject {
	
	private Logger APP_LOGS = null;
	//private static WebDriver driver;
		
    private Logger setLogger(){
			if (APP_LOGS==null)
		    APP_LOGS = LogManager.getLogger(ExceptionAndRejectionPage.class.getName());
			return APP_LOGS;	
		}

		
	public void clickExceptionAndRejectionMenu() {
		/*try {
				setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickExceptionAndRejectionMenu] clicking on Exception and Rejection SubMenu");
				EY_FW_Utility.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.EXCEPTIONS_AND_REJECTION_LOCATOR).click();
			}
			catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
			}*/
		}
		
		
	public void clickFilterButton() {
		try {
			setLogger().info("[MMS_ExceptionAndRejectionPageLocator : clickFilterButton] clicking on filter button");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceListPageLocator.INVOICELISTFILTERBUTTON).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	public void clickGenerateExceptionLetter() {
		try {
			setLogger().info(
					"[MMS_ExceptionAndRejectionPageLocator : clickgenerateexceptionletter] clicking on generate exception letter");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceListPageLocator.generateexceptionletter).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
		
	public void clickPopUpOkButton(){
		try {
			setLogger().info(
					"[MMS_ExceptionAndRejectionPageLocator : clickPopUpOkButton] clicking on Ok button appering on pop up once click on Generrate Rejection Button");
			EY_FW_Utility.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.GENERATE_REJECTION_POPUP_OK_BUTTON).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	
	public void clickGenerateRejectionLetter() {
		try {
			setLogger().info(
					"[MMS_ExceptionAndRejectionPageLocator : clickGenerateRejectionLetter] clicking on generate rejection letter button");
			EY_FW_Utility.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.GENERATE_REJECTION_LETTER_BUTTON).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	/*
	public boolean checkRejectionNumberEditBoxIsPresent() {
		try {
			setLogger().info(
					"[MMS_ExceptionAndRejectionPageLocator : checkRejectionNumberEditBox] Verify Rejection Number EditBox");
			boolean statusRejectionNumberPresence=EY_FW_Utility.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.GENERATE_REJECTION_NUMBER_EDITBOX).isDisplayed();
			
			return statusRejectionNumberPresence;
			
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}*/
	
	public boolean checkReasonAARRadioButton(){
		try{
			setLogger().info("[MMS_ExceptionAndRejectionPageLocator : checkReasonAARRadioButton] Verify Reason AAR Radio Button");
		boolean aarRadiobtn=EY_FW_Utility.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.GENERATE_REJECTION_RESON_AAR_RADIO).isSelected();
		return aarRadiobtn;
		}
		catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}
	
	public boolean checkReasonmanualRadionButton(){
		try{
			setLogger().info("[MMS_ExceptionAndRejectionPageLocator : checkReasonmanualRadionButton] Verify Reason Manual Radio Button");
			EY_FW_Utility.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.GENERATE_REJECTION_RESON_MANUAL_RADIO).click();
		boolean aarRadiobtn=EY_FW_Utility.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.GENERATE_REJECTION_RESON_MANUAL_RADIO).isSelected();
		return aarRadiobtn;
		}
		catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		return false;
	}
	
	

 
    public boolean verifySaveButton(){
 	   try{
 		   setLogger().info("[MMS_ExceptionAndRejectionPageLocator : verifySaveButton] Verifying Save Button on Rejection Cover Letter");
 		   boolean  voidInvoiceBtn= EY_FW_Utility.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.GENERATE_REJECTION_SAVE).isDisplayed();
 		   return voidInvoiceBtn;
 		   
 	   }
 	   catch(Exception e){
 			setLogger().error("[MMS_ExceptionAndRejectionPageLocator : verifySaveButton] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
 	    	Assert.assertTrue(false, e.getMessage()); 
 	    	
 	    }
 		catch(AssertionError e){
 			setLogger().error("[MMS_ExceptionAndRejectionPageLocator : verifySaveButton] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
 	    	Assert.assertTrue(false, e.getMessage()); 
 	    }
 	   return false;
 	
 } 
    
    public boolean verifyCancelButton(){
  	   try{
  		   setLogger().info("[MMS_ExceptionAndRejectionPageLocator : verifyCancelButton] Verifying cancel Button on Rejection Cover Letter");
  		   boolean  voidInvoiceBtn= EY_FW_Utility.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.GENERATE_REJECTION_CANCEL_BUTTON).isDisplayed();
  		   return voidInvoiceBtn;
  		   
  	   }
  	   catch(Exception e){
  			setLogger().error("[MMS_ExceptionAndRejectionPageLocator : verifyCancelButton] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
  	    	Assert.assertTrue(false, e.getMessage()); 
  	    	
  	    }
  		catch(AssertionError e){
  			setLogger().error("[MMS_ExceptionAndRejectionPageLocator : verifyCancelButton] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
  	    	Assert.assertTrue(false, e.getMessage()); 
  	    }
  	   return false;
  	} 
    
   
    
    
    public boolean verifyRejectInvoiceButton(){
   	   try{
   		   setLogger().info("[MMS_ExceptionAndRejectionPageLocator : verifyRejectInvoiceButton] Verifying Reject Invoice Button on Rejection Cover Letter");
   		   boolean  voidInvoiceBtn= EY_FW_Utility.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.GENERATE_REJECTION_CANCEL_BUTTON).isDisplayed();
   		   return voidInvoiceBtn;
   		   
   	   }
   	   catch(Exception e){
   			setLogger().error("[MMS_ExceptionAndRejectionPageLocator : verifyRejectInvoiceButton] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
   	    	Assert.assertTrue(false, e.getMessage()); 
   	    	
   	    }
   		catch(AssertionError e){
   			setLogger().error("[MMS_ExceptionAndRejectionPageLocator : verifyRejectInvoiceButton] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
   	    	Assert.assertTrue(false, e.getMessage()); 
   	    }
   	   return false;
   	} 
     
    public String verifyGenerateRejectionHeader(){
    	try{
  		  setLogger().info("[MMS_ExceptionAndRejectionPageLocator : verifyGenerateRejectionHeader] Verifying Generate Rejection Header Tilte ");
  		  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.GENERATE_REJECTION_HEADER);
    		  String generateRejectionHeader=wb.getText();
    		  return generateRejectionHeader;
    		  //MatcherAssert.assertThat(invoiceVoid, equalTo(MMS_ExpectedResult.INVOICEHISTORY_VOIDINVOICE_POPUP));
  		   /*setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidInvoiceDialogeBox] Verifying Invoice History Page Title as " + MMS_ExpectedResult.INVOICEHISTORY_VOIDINVOICE_POPUP);
  			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), equalTo(MMS_ExpectedResult.INVOICEHISTORY_VOIDINVOICE_POPUP));*/
  	   }
  	   catch(Exception e){
  			setLogger().error("[MMS_ExceptionAndRejectionPageLocator : verifyGenerateRejectionHeader] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
  	    	Assert.assertTrue(false, e.getMessage());
  	    	return "";
  	    }
  		catch(AssertionError e){
  			setLogger().error("[MMS_ExceptionAndRejectionPageLocator : verifyGenerateRejectionHeader] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
  	    	Assert.assertTrue(false, e.getMessage());
  	    	return "";
  	    }

    }
    
    

	public void enterRejectionNumber(String rejectionNumber) {
		try {
			

			WebElement toInvoiceNumber = EY_FW_Utility
					.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.Rejection_Number);
			toInvoiceNumber.clear();
			//toInvoiceNumber.click();
			toInvoiceNumber.sendKeys(rejectionNumber);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		
	}

	public void enterRejectionMessage(String rejectionMessage) {
		try {
			WebElement toInvoiceNumber = EY_FW_Utility
					.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.Rejection_Message);
			toInvoiceNumber.clear();
			toInvoiceNumber.sendKeys(rejectionMessage);

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		
	}

	public void clickOnSaveButton() {
		try {
			WebElement saveGenerateRejectionLetter= EY_FW_Utility
					.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.Save_Generate_Rejection_Letter);
			saveGenerateRejectionLetter.click();
			
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		
		
	}

	public void clickRejectInvoiceButton() {
		try {
			WebElement rejectInvoice= EY_FW_Utility
					.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.Reject_Invoice_Button);
			rejectInvoice.click();
			
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		
		
	}

	public String getPopupTitle() {
		WebElement emailConfirmationPopup= EY_FW_Utility
				.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.Email_Confirmation_Popup);	
		String popupTitle=emailConfirmationPopup.getText();
		return popupTitle;
	}

	public void dismissEmailConfirmationPopup() {
		WebElement emailConfirmationPopupButton1= EY_FW_Utility
				.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.Email_Confirmation_Popup_Button1);
		emailConfirmationPopupButton1.click();
		
	}


	public void clickCancelButton() {
		
		
		WebElement cancelButton= EY_FW_Utility
				.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.GENERATE_REJECTION_CANCEL_BUTTON);
		cancelButton.click();
		/*evaluateJavascript("document.getElementById('popupCloseBtn').click()");*/
		
	}
	
	public void verifyErrorOnClickOfSavebutton(){
		EY_FW_Utility.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.GENERATE_REJECTION_CLICK_SAVE_ERROR);
	}
	
	public void clickRejectionReasonRadioButton(){
		EY_FW_Utility.findElementByLocator(MMS_ExceptionAndRejectionPageLocator.GENERATE_REJECTION_RESON_MANUAL_RADIO).click();
	}
    
    
}
