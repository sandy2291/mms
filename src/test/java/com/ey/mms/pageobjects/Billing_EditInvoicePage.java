package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.MMS_InvoiceHistoryPageLocator;
import com.ey.mms.serenitystepsThemelevel.expectedData.InvoiceHistory;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.EY_GettersSetters;

import net.serenitybdd.core.pages.PageObject;

public class Billing_EditInvoicePage extends PageObject {
	
private Logger APP_LOGS = null;
WebDriver driver;
	
	private Logger setLogger(){
		if (APP_LOGS==null)
	    APP_LOGS = LogManager.getLogger(Billing_EditInvoicePage.class.getName());
		return APP_LOGS;	
	}
	
	public void clickBillingMainMenu(){
		try{
			setLogger().info("[MMS_Billing_EditInvoicePage : clickBillingMainMenu] clicking on Billing Main Menu");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_MAIN_MENU_LOCATOR).click();
		}
		catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
	 }
	
	public void clickInvoicingSubMenu(){
		try{
			setLogger().info("[MMS_Billing_EditInvoicePage : clickInvoicingSubMenu] clicking on Invoicing Sub Menu");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICING_SUBMENU_LOCATOR).click();
		}
		catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
	 }
	
	public void verifyVoidedInvoiceCustomerNum(){
		  try{
			  setLogger().info("[MMS_Billing_EditInvoicePage : verifyVoidedInvoiceCustomerNum] Verifying Customer for Voided Invoice ");
			  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICING_INVOICENUM_LOCATOR);
	  		  String voidedCustomer=wb.getText();
	  		  MatcherAssert.assertThat(voidedCustomer, equalTo(InvoiceHistory.BILLING_INVOICNG_CUSTOMER));
		  }

	  catch(Exception e){
			setLogger().error("[MMS_Billing_EditInvoicePage : verifyVoidedInvoiceCustomerNum] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	  	Assert.assertTrue(false, e.getMessage()); 
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Billing_EditInvoicePage : verifyVoidedInvoiceCustomerNum] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	  	Assert.assertTrue(false, e.getMessage()); 
	   }
	  
	 }
	
	public void clickActionOfInvoicing(){
		try{
			setLogger().info("[MMS_Billing_EditInvoicePage : clickonActionOfInvoicing] clicking on Action in Invoicing Screen");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICING_ACTION_LOCATOR).click();
		}
		catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
		
	}
	
	public void clickActionViewDetailOfInvoicing(){
		try{
			setLogger().info("[MMS_Billing_EditInvoicePage : clickActionViewDetailOfInvoicing] clicking on View Details in Invoicing Screen");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICING_ACTION_VIEWDETAIL_LOCATOR).click();
			/*Screen s= new Screen();
			Pattern p= new Pattern("src\\test\\resources\\images\\InvoicinViewDetails.PNG");
			s.click(p);*/
		}
		catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
		
	}
	
	public String verifyVoidedInvoiceAmount(){
		  try{
			  setLogger().info("[MMS_Billing_EditInvoicePage : verifyVoidedInvoiceAmount] Verifying Customer Amount for the Voided Invoice ");
			  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICING_VIEW_AMOUNT_LOCATOR);
	  		  String amountText=wb.getText();
	  		  return amountText;
	  		  //MatcherAssert.assertThat(amountText, equalTo(InvoiceHistory.BILLING_INVOICING_CUSTOMER_AMOUNT));
		  }

	  catch(Exception e){
			setLogger().error("[MMS_Billing_EditInvoicePage : verifyVoidedInvoiceAmount] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	  	Assert.assertTrue(false, e.getMessage());
	  	
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Billing_EditInvoicePage : verifyVoidedInvoiceAmount] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	  	Assert.assertTrue(false, e.getMessage()); 
	   }
		  return "";
	  
	 }
	
	public void clickCheckBoxForFirstopt(){
		try{
			setLogger().info("[MMS_Billing_EditInvoicePage : clickCheckBoxForSecondopt] clicking on close of View Details ");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_CHECKBOX_LOCATOR).click();
		}
		catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
	}
	
	public void clickGenerateInvoiceBtn(){
		try{
			setLogger().info("[MMS_Billing_EditInvoicePage : clickGenerateInvoiceBtn] clicking on close of View Details ");
			EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICING_GENERATEINVOICE_LOCATOR).click();
			/*driver = EY_GettersSetters.getDriver();
			  //long timeoutInSeconds = 30;
			  EY_FW_Utility.doWait(2000);
			  WebElement ele= driver.findElement(By.cssSelector("div.blockUI blockMsg blockPage"));
			  System.out.println(ele.getText());*/
		}
		catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
	}
	
	
	public void clickCloseViewDetails(){
		try{
			setLogger().info("[MMS_Billing_EditInvoicePage : clickCloseViewDetails] clicking on close of View Details ");
			/*Screen s= new Screen();
			Pattern p= new Pattern("src\\test\\resources\\images\\InvoicingViewDetailsClose.PNG");
			s.click(p);*/
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICING_VIEWDETAILS_CLOSE_LOCATOR).click();
		}
		catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
	}
	
	public void verifyInvoiceEditBox(){
		try{
			  setLogger().info("[MMS_Billing_EditInvoicePage : verifyInvoiceEditBox] Verifying Invoice Number Edit Box is editable or not ");
			  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICENUM_EDITBOX_LOCATOR);
			  wb.click();
			  String readonly=wb.getAttribute("readonly");
			  //Assert.assertNotNull(readonly);

			 /* WebElement wb=EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.BILLING_INVOICING_VIEW_AMOUNT_LOCATOR);
	  		  String amountText=wb.getText();
	  		  MatcherAssert.assertThat(amountText, equalTo(MMS_ExpectedResult.BILLING_INVOICING_CUSTOMER_AMOUNT));*/
		  }

	  catch(Exception e){
			setLogger().error("[MMS_Billing_EditInvoicePage : verifyInvoiceEditBox] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	  	Assert.assertTrue(false, e.getMessage()); 
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Billing_EditInvoicePage : verifyInvoiceEditBox] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	  	Assert.assertTrue(false, e.getMessage()); 
	   }
	}
		
		public String verifyGenerateInvoiceDialougeBox(){
			try{
				  setLogger().info("[MMS_Billing_EditInvoicePage : verifyGenerateInvoiceDialougeBox] Verifying Invoicing Generate Dialouge Box ");
				
				  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICNG_GENERATEDAILOGEBOX_LOCATOR);
		  		  String dailougeBox=wb.getText();
		  		  return dailougeBox;
		  		  //MatcherAssert.assertThat(dailougeBox, equalTo(InvoiceHistory.BILLING_INVOICING_DAILOUGEBOX));
			  }

		  catch(Exception e){
				setLogger().error("[MMS_Billing_EditInvoicePage : verifyGenerateInvoiceDialougeBox] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
		  	Assert.assertTrue(false, e.getMessage()); 
		    }
			catch(AssertionError e){
				setLogger().error("[MMS_Billing_EditInvoicePage : verifyGenerateInvoiceDialougeBox] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
		  	Assert.assertTrue(false, e.getMessage()); 
		   }
			return "";
	  
	}
	
	public void clickInvoiceNumberEditBox(){
		try{
			setLogger().info("[MMS_Billing_EditInvoicePage : clickInvoiceNumberEditBox] clicking on Invoice Edit Box");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICENUM_EDITBOX_LOCATOR).click();
		}
		catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
		
	}
	
	public void enterInvoiceNumber(String invoiceNum){
		  try{
			  setLogger().info("[MMS_Billing_EditInvoicePage : enterInvoiceNumber] Entering '" + invoiceNum + "' in Invoice EditBox");
			  WebElement enterInvoiceNum=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICENUM_EDITBOX_LOCATOR);
			  enterInvoiceNum.clear();
			  enterInvoiceNum.sendKeys(invoiceNum);
		  }
		  catch(Exception e){
				 Assert.assertTrue(false, e.getMessage()); 
			}
		  
	  }
		
	public void clickGenerateInvoicesBtn(){
		try{
			setLogger().info("[MMS_Billing_EditInvoicePage : clickGenerateInvoicesBtn] clicking on Generate Invoice Button in Generate Invoice Window");
			EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICNG_GENERATEINVOICES_BUTTON_LOCATOR).click();
			EY_FW_Utility.waitForProgressWindowToDisappear(30);
			/*
			//EY_FW_Utility.doWait(8000);
			//new WebDriverWait(driver, timeoutInSeconds).until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockUI blockMsg blockPage")));
			 //long timeoutInSeconds = 30;*/
			
			  /*EY_FW_Utility.doWait(8000);
			  System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			  driver = EY_GettersSetters.getDriver();
			  WebElement ele= driver.findElement(By.xpath("//*[text()[contains(.,'Processing')]]"));
			  boolean disp= ele.isDisplayed();
			  
			  System.out.println(disp);
			  System.out.println(ele.getText());*/
			
			
		}
		catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
	}
	
	public String verifyGenerateInvoiceSuccessMsg(){
		try{
			  setLogger().info("[MMS_Billing_EditInvoicePage : verifyGenerateInvoiceSuccessMsg] Verifying generated Invoice Success Message ");
			
			  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_NOTIFICATION_SUCCESS);
	  		  String successMsg=wb.getText();
	  		  return successMsg;
	  		  ///MatcherAssert.assertThat(successMsg, equalTo(InvoiceHistory.BILLING_INVOICING_SUCCESS_MSG));
		  }

	  catch(Exception e){
			setLogger().error("[MMS_Billing_EditInvoicePage : verifyGenerateInvoiceSuccessMsg] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	  	Assert.assertTrue(false, e.getMessage()); 
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Billing_EditInvoicePage : verifyGenerateInvoiceSuccessMsg] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	  	Assert.assertTrue(false, e.getMessage()); 
	   }
		return "";
  
}
	public void clickGenerateInvoicePopUpCancel(){
		try{
			setLogger().info("[MMS_Billing_EditInvoicePage : clickGenerateInvoicePopUpClose] clicking on cancel for Generate Invoice ");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICING_GENERATEINVOICES_POPUP_CANCEL_LOCATOR).click();
			/*Screen s= new Screen();
			Pattern p= new Pattern("src\\test\\resources\\images\\cancel.PNG");
			s.click(p);*/
			//evaluateJavascript("document.getElementById('Cancel').click()");
			
		}
		catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
	}
	public String verifyEditedInvoice(){
		try{
			  setLogger().info("[MMS_Billing_EditInvoicePage : verifyEditedInvoice] Verifying edited Invoice Number ");
			
			  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_EDITEDINVOICE_LOCATOR);
	  		  String editedInvoiceNum=wb.getText();
	  		  return editedInvoiceNum;
	  		  //MatcherAssert.assertThat(editedInvoiceNum, equalTo(InvoiceHistory.BILLING_EDITEDINVOICE));
		  }

	  catch(Exception e){
			setLogger().error("[MMS_Billing_EditInvoicePage : verifyEditedInvoice] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	  	Assert.assertTrue(false, e.getMessage()); 
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Billing_EditInvoicePage : verifyEditedInvoice] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	  	Assert.assertTrue(false, e.getMessage()); 
	   }
		
		return "";
  
}
	
	public String verifyEditedInvoiceForSecondOpt(){
		try{
			  setLogger().info("[MMS_Billing_EditInvoicePage : verifyEditedInvoiceForSecondOpt] Verifying edited Invoice Number for Second Option ");
			
			  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_EDITED_INVOICENUM_FOR_SECOND_OPT_LOCATOR);
	  		  String editedInvoiceNum=wb.getText();
	  		  return editedInvoiceNum;
	  		  //MatcherAssert.assertThat(editedInvoiceNum, equalTo(InvoiceHistory.BILLING_EDITEDINVOICE_FOR_SECOND_OPT));
		  }

	  catch(Exception e){
			setLogger().error("[MMS_Billing_EditInvoicePage : verifyEditedInvoice] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	  	Assert.assertTrue(false, e.getMessage()); 
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Billing_EditInvoicePage : verifyEditedInvoice] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	  	Assert.assertTrue(false, e.getMessage()); 
	   }
		return "";
	}
	
	public String verifyVoidStatusForEditedInvoice(){
		  try{
			  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidStatusForEditedInvoice] Verifying void status in the Grid ");
			  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_EDITABLEINVOICE_VOIDSTATUS_FOR_SECOND_OPT_LOCATOR);
			  String voidstatus=wb.getText();
			  return voidstatus;
			  //MatcherAssert.assertThat(voidstatus, equalTo(InvoiceHistory.BILLING_INVOICING_EDITEDINVOICE_SECONDOPT_STATUS));
			  }
			  catch(Exception e){
					setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidStatusForEditedInvoice] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
			  	Assert.assertTrue(false, e.getMessage()); 
			    }
				catch(AssertionError e){
					setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidStatusForEditedInvoice] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
			  	Assert.assertTrue(false, e.getMessage()); 
			   }
		  return "";
	  }
	
	public String veifyVoidStatusforGeneratedInvoice(){
		try{
			  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : veifyVoidStatusforGeneratedInvoice] Verifying void status in the Grid for generated Invoice ");
			  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_GENERATEDINVOICE_VOIDSTATUS_FOR_SECOND_OPT_LOCATOR);
			  String voidstatus=wb.getText();
			  return voidstatus;
			  //MatcherAssert.assertThat(voidstatus, equalTo(InvoiceHistory.BILLING_INVOICING_GENERATED_INVOICENUM_SECONDOPT_VOIDSTATUS));
			  }
			  catch(Exception e){
					setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidStatusForEditedInvoice] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
			  	Assert.assertTrue(false, e.getMessage()); 
			    }
				catch(AssertionError e){
					setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidStatusForEditedInvoice] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
			  	Assert.assertTrue(false, e.getMessage()); 
			   }
		        return "";
	}
	
	
	public void clickCheckBoxForSecondopt(){
		try{
			setLogger().info("[MMS_Billing_EditInvoicePage : clickCheckBoxForSecondopt] clicking on close of View Details ");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_CHECKBOX_EDIT_FORSECONDOPT_LOCATOR).click();
		}
		catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
	}
	
	public String verifyBilledPartyforSecondOpt(){
		  try{
			  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyBilledPartyforSecondOpt] Verifying Billed party for Second Option  ");
			  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICING_INVOICENUM_FORSECONDOPT_LOCATOR);
			  String voidstatus=wb.getText();
			  return voidstatus;
			  //MatcherAssert.assertThat(voidstatus, equalTo(InvoiceHistory.BILLING_INVOICNG_CUSTOMER_FORSECONDOPT));
			  }
			  catch(Exception e){
					setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidStatusForEditedInvoice] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
			  	Assert.assertTrue(false, e.getMessage()); 
			    }
				catch(AssertionError e){
					setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidStatusForEditedInvoice] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
			  	Assert.assertTrue(false, e.getMessage()); 
			   }
		       return ""; 
	  }
	
	
	public String verifyGenerateInvoiceDialougeBoxforSecondOpt(){
		try{
			  setLogger().info("[MMS_Billing_EditInvoicePage : verifyGenerateInvoiceDialougeBox] Verifying Invoicing Generate Dialouge Box ");
			
			  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICNG_GENERATEDAILOGEBOX_FORSECONDOPT_LOCATOR);
	  		  String dailougeBox=wb.getText();
	  		  return dailougeBox;
	  		  //MatcherAssert.assertThat(dailougeBox, equalTo(InvoiceHistory.BILLING_INVOICING_DAILOUGEBOX_FORSECONDOPT));
		  }

	  catch(Exception e){
			setLogger().error("[MMS_Billing_EditInvoicePage : verifyGenerateInvoiceDialougeBox] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	  	Assert.assertTrue(false, e.getMessage()); 
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Billing_EditInvoicePage : verifyGenerateInvoiceDialougeBox] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	  	Assert.assertTrue(false, e.getMessage()); 
	   }
		return "";
     
   }
	
	public String verifyVoidedInvoiceAmountforSecondOpt(){
		  try{
			  setLogger().info("[MMS_Billing_EditInvoicePage : verifyVoidedInvoiceAmount] Verifying Customer Amount for the Voided Invoice ");
			  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICING_VIEW_AMOUNT_FORSECONDOPT_LOCATOR);
	  		  String amountText=wb.getText();
	  		  return amountText;
	  		  //MatcherAssert.assertThat(amountText, equalTo(InvoiceHistory.BILLING_INVOICNG_BILLEDPARTY_AMOUNT_FORSECONDOPT));
		  }

	  catch(Exception e){
			setLogger().error("[MMS_Billing_EditInvoicePage : verifyVoidedInvoiceAmount] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	  	Assert.assertTrue(false, e.getMessage()); 
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Billing_EditInvoicePage : verifyVoidedInvoiceAmount] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	  	Assert.assertTrue(false, e.getMessage()); 
	   }
	    return "";
	 }
	
	
	public void clickActionOfInvoicingforSecondOption(){
		try{
			setLogger().info("[MMS_Billing_EditInvoicePage : clickActionOfInvoicingforSecondOption] clicking on Action in Invoicing Screen");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICING_ACTION_FORSECONDOPT_LOCATOR).click();
		}
		catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
		
	}
	
	public void clickActionViewDetailOfInvoicingforSecondOption(){
		try{
			setLogger().info("[MMS_Billing_EditInvoicePage : clickActionViewDetailOfInvoicingforSecondOption] clicking on View Details in Invoicing Screen");
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICING_ACTION_VIEWDETAIL_LOCATOR_FOR_SECOND_OPTION_LOCATOR).click();
			/*Screen s= new Screen();
			Pattern p= new Pattern("src\\test\\resources\\images\\InvoicinViewDetails.PNG");
			s.click(p);*/
		}
		catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
		
	}
	
}
	
	

