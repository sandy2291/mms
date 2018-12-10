package com.ey.mms.pageobjects;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.MMS_InvoiceHistoryPageLocator;
import com.ey.mms.serenitystepsThemelevel.expectedData.InvoiceHistory;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.EY_GettersSetters;

import net.serenitybdd.core.pages.PageObject;

public class VoidingPage extends PageObject {
	
private Logger APP_LOGS = null;
private static WebDriver driver;
	
	private Logger setLogger(){
		if (APP_LOGS==null)
	    APP_LOGS = LogManager.getLogger(VoidingPage.class.getName());
		return APP_LOGS;	
	}
	
	
	public void clickBillingMainMenu(){
		try{
			setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickBillingMainMenu] clicking on Billing Main Menu");
			//driver = EY_GettersSetters.getDriver();
			/*long timeoutInSeconds = 30;
			new WebDriverWait(driver, timeoutInSeconds).until(ExpectedConditions.elementToBeClickable(EY_FW_Utility.getAnyElementByAnyLocator(MMS_InvoiceHistoryPageLocator.BILLING_MAIN_MENU_LOCATOR))).click();*/
			EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
			EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_MAIN_MENU_LOCATOR).click();
		}
		catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
	 }
	
   public void clickInvoiceHistorySunMenu(){
	   try{
		   setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickBillingMainMenu] clicking on Billing Main Menu");
		   EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_SUBMENU_LOCATOR).click();
	   }
	   catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
    }
	
   public void verifyInvoiceHistoryPageTitle(){
	   try{
		   setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyInvoiceHistoryPageTitle] Verifying Invoice History Page Title as " + InvoiceHistory.INVOICEHISTORY_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), equalTo(InvoiceHistory.INVOICEHISTORY_PAGE_TITLE));
	   }
	   catch(Exception e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyInvoiceHistoryPageTitle] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	    	Assert.assertTrue(false, e.getMessage()); 
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyInvoiceHistoryPageTitle] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	    	Assert.assertTrue(false, e.getMessage()); 
	    }
   }
   public boolean verifyVoidButtonPresence(){
	   try{
		   setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidButtonPresence] Verifying void Invoicebutton is Displayed in the Page " +InvoiceHistory.INVOICEHISTORY_VOIDINVOICE_BUTTON );
		   boolean  voidInvoiceBtn= EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_VOID_BUTTON_LOCATOR).isDisplayed();
		   return voidInvoiceBtn;
	   }
	   catch(Exception e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidButtonPresence] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	    	Assert.assertTrue(false, e.getMessage()); 
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidButtonPresence] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	    	Assert.assertTrue(false, e.getMessage()); 
	    }
	     return false;
   }
   
  public boolean verifyUnvoidButtonPresence(){
	  try{
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyUnvoidButtonPresence] Verifying Unvoid Invoicebutton is Displayed in the Page " +InvoiceHistory.INVOICEHISTORY_UNVOIDINVOICE_BUTTON );
		  boolean unvoidInvoiceBtn = EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_UNVOID_BUTTON_LOCATOR).isDisplayed();
		  return unvoidInvoiceBtn;
	  }
	 
	  catch(Exception e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyUnvoidButtonPresence] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	    	Assert.assertTrue(false, e.getMessage()); 
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyUnvoidButtonPresence] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	    	Assert.assertTrue(false, e.getMessage()); 
	    } 
	   return false;
	  
    }
  
  public String verifyVoidStatusTxt(){
	  try{
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidStatusTxt] Verifying void status in the Grid " +InvoiceHistory.INVOICEHISTORY_VOID_STATUS );
		  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_VOIDSTATUS_TAB_LOCATOR);
  		  String invoiceVoid=wb.getText();
  		  return invoiceVoid;
  		  //MatcherAssert.assertThat(invoiceVoid, equalTo(MMS_ExpectedResult.INVOICEHISTORY_VOID_STATUS));
	  }

  catch(Exception e){
		setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyUnvoidButtonPresence] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
  	Assert.assertTrue(false, e.getMessage());
  	return "";
    }
	catch(AssertionError e){
		setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyUnvoidButtonPresence] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
  	Assert.assertTrue(false, e.getMessage());
  	return "";
   }
  
 }
  
  public void clickInvoiceCheckbox(){
	  try{
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickInvoiceCheckbox] clicking on already Generated Invoice Checkbox");
		  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_CHECKBOX_LOCATOR).click();
	  }
	  catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
	  
    }
  public void clikcVoidInvoiceButton(){
	  try{
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickInvoiceCheckbox] clicking on already Generated Invoice Checkbox");
		  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_VOID_BUTTON_LOCATOR).click();
	  }
	  catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
   
 }
 
  public String verifyVoidInvoiceDialogeBox(){
	  try{
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidStatusTxt] Verifying void status in the Grid ");
		  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_VOIDINVOICE_TITLE_LOCATOR);
  		  String invoiceVoid=wb.getText();
  		  return invoiceVoid;
  		  //MatcherAssert.assertThat(invoiceVoid, equalTo(MMS_ExpectedResult.INVOICEHISTORY_VOIDINVOICE_POPUP));
		   /*setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidInvoiceDialogeBox] Verifying Invoice History Page Title as " + MMS_ExpectedResult.INVOICEHISTORY_VOIDINVOICE_POPUP);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), equalTo(MMS_ExpectedResult.INVOICEHISTORY_VOIDINVOICE_POPUP));*/
	   }
	   catch(Exception e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidInvoiceDialogeBox] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	    	Assert.assertTrue(false, e.getMessage());
	    	return "";
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidInvoiceDialogeBox] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	    	Assert.assertTrue(false, e.getMessage());
	    	return "";
	    }

  }
  
  public String verifyFirstOptionMsg(){
	  try{
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyFirstOptionMsg] Verifying void status in the Grid " +InvoiceHistory.INVOICEHISTORY_FIRSTOPTIONMSG);
		  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_FIRSTOPTION_MSG_LOCATOR);
  		  String firstOptionMsg=wb.getText();
  		  return firstOptionMsg;
  		  //MatcherAssert.assertThat(firstOptionMsg, equalTo(MMS_ExpectedResult.INVOICEHISTORY_FIRSTOPTIONMSG));
	  }
	  catch(Exception e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyFirstOptionMsg] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	    	Assert.assertTrue(false, e.getMessage());
	    	return "";
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyFirstOptionMsg] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	    	Assert.assertTrue(false, e.getMessage());
	    	return "";
	    }
  }
  
  
  public String verifySecondOptionMsg(){
	  try{
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifySecondOptionMsg] Verifying void status in the Grid " +InvoiceHistory.INVOICEHISTORY_SECONDOPTIONMSG);
		  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_SECONDOPTION_MSG_LOCATOR);
  		  String secondOptionMsg=wb.getText();
  		  return secondOptionMsg;
  		  //MatcherAssert.assertThat(secondOptionMsg, equalTo(MMS_ExpectedResult.INVOICEHISTORY_SECONDOPTIONMSG));
	  }
	  catch(Exception e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifySecondOptionMsg] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	    	Assert.assertTrue(false, e.getMessage());
	    	return "";
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifySecondOptionMsg] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	    	Assert.assertTrue(false, e.getMessage());
	    	return "";
	    }
  }
  
  public String verifyThirdOptionMsg(){
	  try{
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyThirdOptionMsg] Verifying void status in the Grid " +InvoiceHistory.INVOICEHISTORY_THIRDOPTIONMSG);
		  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_THIRDOPTION_MSG_LOCATOR);
  		  String thirdOptionMsg=wb.getText();
  		  return thirdOptionMsg;
  		  //MatcherAssert.assertThat(thirdOptionMsg, equalTo(MMS_ExpectedResult.INVOICEHISTORY_THIRDOPTIONMSG));
	  }
	  catch(Exception e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyThirdOptionMsg] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	    	Assert.assertTrue(false, e.getMessage());
            return "";
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyThirdOptionMsg] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	    	Assert.assertTrue(false, e.getMessage());
	    	return "";
	    }
  }
  
   public boolean voidCancelButtonPresence(){
	   try{
		   setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidCancelButtonPresence] Verifying void Invoice Cancel is Displayed in the Page " +InvoiceHistory.INVOICEHISTORY_VOIDINVOICE_CANCEL);
		   boolean  voidInvoiceCancelBtn= EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_VOIDINVOICE_CLOSEBUTTON_LOCATOR).isDisplayed();
		   return voidInvoiceCancelBtn;
	   }
	   catch(Exception e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidCancelButtonPresence] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	    	Assert.assertTrue(false, e.getMessage()); 
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidCancelButtonPresence] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	    	Assert.assertTrue(false, e.getMessage()); 
	    }
	   return false;
	  
   }
  
   public boolean voidInvoiceButtonPresence(){
	   try{
		   setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidInvoiceButtonPresence] Verifying void Invoice button is Displayed in the Page " +InvoiceHistory.INVOICEHISTORY_VOIDINVOICE);
		   boolean  voidInvoiceBtn= EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_VOIDINVOICE_BUTTON_LOCATOR).isDisplayed();
		   return voidInvoiceBtn;
		   
	   }
	   catch(Exception e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidInvoiceButtonPresence] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	    	Assert.assertTrue(false, e.getMessage()); 
	    	
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidInvoiceButtonPresence] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	    	Assert.assertTrue(false, e.getMessage()); 
	    }
	   return false;
	  
   }
   
   public void clickCancelVoidInvoiceDailogueBox(){
	   try{
		   setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickcloseVoidInvoiceDailogueBox] clicking on Close of Void Invoice Dialogue Box");
		   /*Screen s= new Screen();
		   Pattern p= new Pattern("src\\test\\resources\\images\\InvoiceHistoryVoidInvoiceDailogueCancelButton.PNG");
		   s.click(p);*/
		   EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_VOIDINVOICE_CANCEL_DIALOUGEBOX_LOCATOR).click();;
		   
	   }
	   catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
   }
   
   public void clickVoidInvoiceInvoiceDialouge(){
	   try{
		   setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickVoidInvoiceInvoiceDialouge] clicking on Void Invoice of Dialogue Box");
		   /*Screen s= new Screen();
		   Pattern p= new Pattern("src\\test\\resources\\images\\InvoiceHistoryVoidInvoice.PNG");
		   s.click(p);*/
		   EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_VOIDINVOICE_SAVE_DAILOUGEBOX_LOCATOR).click();
		   EY_FW_Utility.waitForProgressWindowToDisappear(30);
		   
	   }
	   catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
   }
   
   
  public void clickCheckBoxForFirstOption(){
	  try{
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickCheckBoxForFirstOption] clicking on already Generated Invoice Checkbox");
		  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_CHECKBOX_LOCATOR).click();
	  }
	  catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
  }
  
  public void clickFirstOptionOfVoidInvoiceDialougeBox(){
	  try{
	  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickFirstOptionOfVoidInvoiceDialougeBox] clicking on First Option Radio Button");
	  //EY_FW_Utility.getAnyElementByAnyLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_VOIDINVOICE_FIRSTOPTION_RADIO_LOCATOR).click();
	  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_VOIDINVOICE_FIRSTOPTION_RADIO_LOCATOR).click();
	  
	  }
	  catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
	}
  }
  
/*  public void clickFirstOptionOfVoidInvoice(){
	  try{
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickFirstOptionOfVoidInvoice] clicking on First Option Radio Button for Sent to Combined Billing");
		  //EY_FW_Utility.getAnyElementByAnyLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_VOIDINVOICE_FIRSTOPTION_RADIO_LOCATOR).click();
		  EY_FW_Utility.getAnyElementByAnyLocatorPresentSpecificWait(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_VOIDINVOICE_FIRSTOPTION_LOCATOR, 4).click();
		  }
		  catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
		}
  }
  */
  public void clickThirdOptionOfVoidInvoiceDialougeBox(){
	  try{
	  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickThirdOptionOfVoidInvoiceDialougeBox] clicking on Third Option Radio Button");
	  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_VOIDINVOICE_THIRDOPTION_RADIO_LOCATOR).click();
	  }
	  catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
	}
  }
  
  
  public void clickCloseInvoiceDate(){
	  try{
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickCloseInvoiceDate] clicking on close Invoice Date Buttton");
		  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_INVOICEDATE_BUTTONCLOSE_LOCATOR).click();
		  }
		  catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
		}
  }
  public void clickCloseVoidStatus(){
	  try{
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickCloseVoidStatus] clicking on close Void Status Buttton");
		  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_VOIDSTATUS_BUTTONCLOSE_LOCATOR).click();
		  }
		  catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
		}
	  
  }
  
  public void clickNotification(){
	  try{
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickNotification] clicking on Notification Area");		  
		  //new WebDriverWait(driver, timeoutInSeconds).until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockUI blockMsg blockPage")));
		  /*long timeoutInSeconds = 30;
		  EY_FW_Utility.doWait(2000);
		  WebElement ele= driver.findElement(By.cssSelector("div.blockUI blockMsg blockPage"));
		  System.out.println(ele.getText());*/
		  WebElement notification = EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_NOTIFICATION_LOCATOR);//.click();
		  if(notification.isEnabled()){
			  notification.click();
		  }
	  }
	  catch(Exception e){
		 Assert.assertTrue(false, e.getMessage()); 
	}
  }
  
  
  public void closeNotification(){
	  try{
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickNotification] clicking on Notification Area");		  
		  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_NOTIFICATION_CLOSE_LOCATOR).click();
	  }
	  catch(Exception e){
		 Assert.assertTrue(false, e.getMessage()); 
	}
  }
  
  public String verifyGenerateInvoiceSuccessMsg(){
		try{
			  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyGenerateInvoiceSuccessMsg] Verifying generated Invoice Success Message "+InvoiceHistory.BILLING_INVOICING_SUCCESS_MSG);
			
			  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_NOTIFICATION_SUCCESS);
	  		  String successMsg=wb.getText();
	  		  return successMsg;
	  		  
		  }

	  catch(Exception e){
			setLogger().error("[MMS_Billing_EditInvoicePage : verifyGenerateInvoiceSuccessMsg] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	  	Assert.assertTrue(false, e.getMessage());
	  	return "";
	  	
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Billing_EditInvoicePage : verifyGenerateInvoiceSuccessMsg] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	  	Assert.assertTrue(false, e.getMessage()); 
	  	return "";
	   }

}
  
  public void clickFilterButton(){
	  try{
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickFilterButton] clicking on Filter ");
		  
		  //EY_FW_Utility.getAnyElementByAnyLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_FILTER_BUTTON_LOCATOR).click();
		  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_FILTER_BUTTON_LOCATOR).click();
		  EY_FW_Utility.doWait(2000);
		  
	  }
	  catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
  }
  
  public void enterInvoiceStart(String InvoiceStart){
	  try{
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : enterInvoiceStart] Entering '" + InvoiceStart + "' in Invoice From EditBox");
		  WebElement startInvoiceNum=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_INVOICESSTART_EDITBOX_LOCATOR);
		  startInvoiceNum.clear();
		  startInvoiceNum.sendKeys(InvoiceStart);
	  }
	  catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
	  
  }
  
  public void enterInvoiceEnd(String enterInvoiceEnd){
	  try{
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : enterInvoiceStart] Entering '" + enterInvoiceEnd + "' in Invoice To EditBox");
		  WebElement endInvoiceNum=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_INVOICEEND_EDITBOX_LOCATOR);
		  endInvoiceNum.clear();
		  endInvoiceNum.sendKeys(enterInvoiceEnd);
	  }
	  catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
	  
  }
  
  public void clickFilterSave(){
	  try{
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickFilterButton] clicking on Filter Save");
		  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_INVOICESAVE_BUTTON_LOCATOR).click();
	  }
	  catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
  }
  
  public String verifyVoidStatusForFirstOption(){
	  try{
		  EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidStatusForFirstOption] Verifying void status in the Grid " +InvoiceHistory.INVOICEHISTORY_VOIDSTATUS_FIRSTOPTION );
		  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_FIRSTOPTION_STATUS_LOCATOR);
		  //WebElement wb=EY_FW_Utility.getAnyElementByAnyLocatorSpecificWait(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_FIRSTOPTION_STATUS_LOCATOR, 4);
		  String voidstatusFirstOpt=wb.getText();
		  return voidstatusFirstOpt;
		  //MatcherAssert.assertThat(voidstatusFirstOpt, equalTo(MMS_ExpectedResult.INVOICEHISTORY_VOIDSTATUS_FIRSTOPTION));
		  }
		  catch(Exception e){
				setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidStatusForFirstOption] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
		  	Assert.assertTrue(false, e.getMessage());
		  	return "";
		    }
			catch(AssertionError e){
				setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidStatusForFirstOption] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
		  	Assert.assertTrue(false, e.getMessage());
		  	return "";
		   }
  }
	  
	  public void clickInvoiceSentToCombinedBilling(){
		  try{
		  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickInvoiceSentToCombinedBilling] clicking on Checkbox for a Invoice already Sent to combined Billing");
		  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_INVOICE_SENTTO_COMBINEDBILLING_LOCATOR).click();
		  }
		  catch(Exception e){
				 Assert.assertTrue(false, e.getMessage()); 
			}
	  
  }
	  public void clickCombinedBillingPopupOk(){
			try{
				setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickCombinedBillingPopupOk] clicking on Combined Billing Pop Window Ok Button");
				  /* Screen s= new Screen();
				   Pattern p= new Pattern("src\\test\\resources\\images\\clickCombinedBillingPopupOk.PNG");
				   s.click(p);*/
				EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.CONFIRMCOMBINEDBILLING).click();
			}
			catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
			}
		}
	  
  
	public void clickVoidErrorforCombinedBillingInvoice(){
		try{
			setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickCombinedBillingPopupOk] clicking on Combined Billing Pop Window Ok Button");
			  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICE_COMBINED_BILLING_INVOICE_VOID_ERROR_LOCATOR).click();
		}
		catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
	}
	
	public void clickokVoidingFailure(){
		try{
			setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickCombinedBillingPopupOk] clicking on Combined Billing Pop Window Ok Button");
			  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.Validation_error_Confirm).click();
		}
		catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
	}
  
	public void clickokSingleVoidingFailure(){
		try{
			setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickCombinedBillingPopupOk] clicking on Combined Billing Pop Window Ok Button");
			  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.Validation_error_Confirm_Single).click();
		}
		catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
		}
	}
	
   public void clickCombinedBillingButton(){
	   try{
			  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickCombinedBillingButton] clicking on Send to combined Billing");
			  //EY_FW_Utility.getAnyElementByAnyLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_SEND_COMBINEDBILLING_BUTTON_LOCATOR).click();
			  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_SEND_COMBINEDBILLING_BUTTON_LOCATOR).click();
     }
	   catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
   }
   
   public String verifyErrorInvoiceAlreadySentCombinedBill(){
	   try{
			  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyErrorInvoiceAlreadySentCombinedBill] Verifying The ErrorMsg in Activity Area " +InvoiceHistory.INVOICEHISTORY_INVOICE_COMBINEDBILLING_ERROR );
			  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_ALLREADY_SENT_COMBINEDBILLING_ERROR_LOCATOR);
			  String errorMsg=wb.getText();
			  return errorMsg;
			  //MatcherAssert.assertThat(errorMsg, equalTo(MMS_ExpectedResult.INVOICEHISTORY_INVOICE_COMBINEDBILLING_ERROR));
			  }
			  catch(Exception e){
					setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyErrorInvoiceAlreadySentCombinedBill] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
			  	Assert.assertTrue(false, e.getMessage()); 
			  	return "";
			    }
				catch(AssertionError e){
					setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyErrorInvoiceAlreadySentCombinedBill] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
			  	Assert.assertTrue(false, e.getMessage());
			  	return "";
			   }
		   }
 
  
   public String verifyInvoiceNumPresentInGrid(){
	   try{
			  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyInvoiceNumPresentInGrid] Verifying Invoice Already been sent for Combined Billing trying to void with First Option  " +InvoiceHistory.INVOICEHISTORY_INVOICENUMBER );
			  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_INVOICENUMBER_LOCATOR);
	  		  String invoiceVoid=wb.getText();
	  		  return invoiceVoid;
	  		  //MatcherAssert.assertThat(invoiceVoid, equalTo(MMS_ExpectedResult.INVOICEHISTORY_INVOICENUMBER));
		  }

	  catch(Exception e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyInvoiceNumPresentInGrid] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	  	Assert.assertTrue(false, e.getMessage()); 
	  	
	  	return "";
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyInvoiceNumPresentInGrid] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	  	Assert.assertTrue(false, e.getMessage()); 
	  	return "";
	   }
   }
   
   public void clickMultipleInvoiceFirstChecKBox(){
	   try{
		   setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickMultipleInvoiceFirstChecKBox] clicking on First Checkbox  ");
			  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_MULTIPLEINVOICE_FIRST_LOCATOR).click();
	   }
	   catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
   }
   
   public void clickMultipleInvoiceSecondChecKBox(){
	   try{
		   setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickMultipleInvoiceFirstChecKBox] clicking on Second Checkbox ");
			  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_MULTIPLEINVOICE_SECOND_LOCATOR).click();
	   }
	   catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
   }
   
   public void clickSendToCombinedBilling(){
	   try{
		   setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickSendToCombinedBilling] clicking on Send to Combined Billing");
		  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_SEND_COMBINEDBILLING_BUTTON_LOCATOR).click();
	   }
	   catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
   }
  
   public void clickCheckBoxforThirdOpt(){
	   try{
		   setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickCheckBoxforThirdOpt] clicking on Checkbox for Third Option");
		  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_INVOICE_CHECKBOX_THIRDOPTION_LOCATOR).click();
	   }
	   catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
   }
   
   public String verifyVoidStatusforThirdoptTxt(){
		  try{
			  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidStatusforThirdoptTxt] Verifying void status in the Grid for Third Option " +InvoiceHistory.INVOICEHISTORY_VOIDSTATUS_THIRDOPTION);
			  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_VOIDSTATUS_FORTHIRD_OPTION_LOCATOR);
	  		  String voidStatus=wb.getText();
	  		  return voidStatus;
	  		  //MatcherAssert.assertThat(voidStatus, equalTo(MMS_ExpectedResult.INVOICEHISTORY_VOIDSTATUS_THIRDOPTION));
		  }

	  catch(Exception e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidStatusforThirdoptTxt] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
	  	Assert.assertTrue(false, e.getMessage()); 
	  	return "";
	    }
		catch(AssertionError e){
			setLogger().error("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyVoidStatusforThirdoptTxt] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
	  	Assert.assertTrue(false, e.getMessage()); 
	    return "";
		}
   
}
   
   public void verifyAlertPopup(){
	   try{
			  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : verifyAlertPopup] Verifying PopUp is displayed  ");
			  Alert alt= EY_GettersSetters.getDriver().switchTo().alert();
			  String msg= alt.getText();
			  System.out.println(msg);
			  //EY_FW_Utility.doWait(2000);
			  alt.accept();
			  System.out.println("Able to handel Pop up");
			  //EY_FW_Utility.doWait(3000);
		
			  
	   }
	   catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
	   
   }
   
   public void clickbulkbilling(){
	   try{
			  setLogger().info("[MMS_Invoice_History_Voiding_FirstOptionPage : clickbulkbilling] Verifying void status in the Grid for Third Option " +InvoiceHistory.INVOICEHISTORY_VOIDSTATUS_THIRDOPTION);
			  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICE_DEMO_LOCATOR).click();
			  
	   }
	   catch(Exception e){
			 Assert.assertTrue(false, e.getMessage()); 
		}
	   
   }
   
   public void verifyVoidInvoiceButtonEnable(){
		try{
			setLogger().info("[MMS_InvoiceHistory_NewPage : verifyVoidInvoiceButtonEnable] verify for Void Invoice Button is enable or not");
			boolean voidInvoiceEnable=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_VOIDINVOICE_BUTTON_LOCATOR).isEnabled();
			EY_FW_Utility.doWait(2000);
			String voidInvoiceTxt=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_VOIDINVOICE_BUTTON_LOCATOR).getText();
			setLogger().info("Void Invoice Button is Enable"+voidInvoiceTxt);
			}
		catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
		
		public void clickVoidInvoiceBtn(){
			try{
				  setLogger().info("[MMS_InvoiceHistory_NewPage : clickVoidInvoiceBtn] clicking on Void Invoice Button");
				  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_VOIDINVOICE_BUTTON_LOCATOR).click();
			  }
			  catch (Exception e) {
					Assert.assertTrue(false, e.getMessage());
			}

		}
		
	  public void verifyUnvoidInvoiceEnable(){
		  try{
			  setLogger().info("[MMS_InvoiceHistory_NewPage : verifyUnvoidInvoiceEnable] verify for UnVoid Invoice Button is enable or not");
			  boolean unvoidInvoiceEnable=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_UNVOIDINVOICE_BUTTON_LOCATOR).isEnabled();
			  //EY_FW_Utility.doWait(2000);
			  String unvoidInvoiceTxt=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_UNVOIDINVOICE_BUTTON_LOCATOR).getText();
			  setLogger().info("UnVoid Invoice Button is Enable"+unvoidInvoiceTxt);
		  }
		  catch (Exception e) {
				Assert.assertTrue(false, e.getMessage());
			}
	  }
	  
	  public void clickUnVoidInvoiceBtn(){
			try{
				  setLogger().info("[MMS_InvoiceHistory_NewPage : clickUnVoidInvoiceBtn] clicking on UnVoid Invoice Button");
				  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_UNVOIDINVOICE_BUTTON_LOCATOR).click();
			  }
			  catch (Exception e) {
					Assert.assertTrue(false, e.getMessage());
			}

		}
	  
	  
	  public void clickBillingButton(){
		  try{
			  setLogger().info("[MMS_InvoiceHistory_NewPage : clickBillingButton] clicking on Billing Main menu");
			  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_LINK_LOCATOR).click();
		  }
		  catch (Exception e) {
				Assert.assertTrue(false, e.getMessage());
		}
	  }
	  
	  public void clickINvoiceHistoryButton(){
		  try{
			  setLogger().info("[MMS_InvoiceHistory_NewPage : clickINvoiceHistoryButton] clicking on Invoice History SubMain menu"); 
			  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICE_HISTORY_LINK_LOCATOR).click();
		  }
		  catch (Exception e) {
				Assert.assertTrue(false, e.getMessage());
		}
	  }
	  
	  public void verifyInvoiceBulkBillingButton(){
		  try{
			  setLogger().info("[MMS_InvoiceHistory_NewPage : verifyInvoiceBulkBillingButton] verify for Bulk Billing Button is enable or not");
			  boolean bulkBillingEnable=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_BULKBILING_BUTTON_LOCATOR).isEnabled();
			  //EY_FW_Utility.doWait(2000);
			  String bulkbillingText=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_BULKBILING_BUTTON_LOCATOR).getText();
			  setLogger().info("UnVoid Invoice Button is Enable"+bulkbillingText);
		  }
		  catch (Exception e) {
				Assert.assertTrue(false, e.getMessage());
			}
	  }
	  
	  
	  public void clickBulkBillingBtn(){
			try{
				  setLogger().info("[MMS_InvoiceHistory_NewPage : clickBulkBillingBtn] clicking on Bulk Billing Button");
				  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_BULKBILING_BUTTON_LOCATOR).click();
			  }
			  catch (Exception e) {
					Assert.assertTrue(false, e.getMessage());
			}

		}
	  
	  public void verifyRemoveCombinedBillingButton(){
		  try{
			  setLogger().info("[MMS_InvoiceHistory_NewPage : verifyRemoveCombinedBillingButton] verify for Removefrom combined Billing  Button is enable or not");
			  boolean removefromcombinedBilling=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_BULKBILING_BUTTON_LOCATOR).isEnabled();
			  //EY_FW_Utility.doWait(2000);
			  String removefromcombinedBillingTxt=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_BULKBILING_BUTTON_LOCATOR).getText();
			  setLogger().info("UnVoid Invoice Button is Enable"+removefromcombinedBillingTxt);
		  }
		  catch (Exception e) {
				Assert.assertTrue(false, e.getMessage());
			}
	  }
	  
	  public void clickRemoveCombinedBillingBtn(){
			try{
				  setLogger().info("[MMS_InvoiceHistory_NewPage : clickRemoveCombinedBillingBtn] clicking on Remove from Combined Billing Button");
				  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_REMOVE_FROM_COMBINED_BILLING_BUTTON_LOCATOR).click();
			  }
			  catch (Exception e) {
					Assert.assertTrue(false, e.getMessage());
			}

		}
	  
	  public void verifysendtoCombinedBilling(){
		  try{
			  setLogger().info("[MMS_InvoiceHistory_NewPage : verifysendtoCombinedBilling] verify for Send to combined Billing  Button is enable or not");
			  boolean senTocombinedBilling=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_BULKBILING_BUTTON_LOCATOR).isEnabled();
			  //EY_FW_Utility.doWait(2000);
			  String sendTocombinedBillingTxt=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_BULKBILING_BUTTON_LOCATOR).getText();
			  setLogger().info("UnVoid Invoice Button is Enable"+sendTocombinedBillingTxt);
		  }
		  catch (Exception e) {
				Assert.assertTrue(false, e.getMessage());
			}
	  }
	  
	  public void clickSendToCombinedBillingBtn(){
			try{
				  setLogger().info("[MMS_InvoiceHistory_NewPage : clickSendToCombinedBillingBtn] clicking on Send to Combined Billing Button");
				  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_SENDTO_COMBINED_BILLING_BUTTON).click();
			  }
			  catch (Exception e) {
					Assert.assertTrue(false, e.getMessage());
			}

		}
	  
	  public void verifyPopup(){
		  try{
			  setLogger().info("[MMS_InvoiceHistory_NewPage : verifyPopup] verify Pop up and the message displayed in the PopUP"); 
			  Alert alt= EY_GettersSetters.getDriver().switchTo().alert();
			  String popupMsg=alt.getText();
			  setLogger().info(popupMsg);
		  }
		  catch (Exception e) {
				Assert.assertTrue(false, e.getMessage());
		}
	  }
	  
	  public void acceptAlert(){
		  try{
			  setLogger().info("[MMS_InvoiceHistory_NewPage : acceptAlert] verify  the message displayed in the PopUP"); 
			  Alert alt= EY_GettersSetters.getDriver().switchTo().alert();
			  alt.accept();
			  setLogger().info("Able to verify Popup");
		  }
		  catch (Exception e) {
				Assert.assertTrue(false, e.getMessage());
		}
	  }
	  
	  public void clickCheckBoxfora1(){
			try{
				setLogger().info("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : clickCheckBoxfora1] clicking on Checkbox for Invoice automatea1");
				EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_Autoamtea1CHECKNBOX_LOCATOR).click();
				
			}
			catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
			}
		}
		
		public void clickCheckBoxforb1(){
			try{
				setLogger().info("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : clickCheckBoxforb1] clicking on Checkbox for Invoice automateb1");
				EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_Autoamteb1CHECKNBOX_LOCATOR).click();
				
			}
			catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
			}
		}
		
		public void clickCheckBoxforc1(){
			try{
				setLogger().info("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : clickCheckBoxforb1] clicking on Checkbox for Invoice automatec1");
				EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_Autoamationc1CHECKNBOX_LOCATOR).click();
				
			}
			catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
			}
		}
		
		
		public void clickCheckBoxforCC1(){
			try{
				setLogger().info("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : clickCheckBoxforCC1] clicking on Checkbox for Invoice TestCC1");
				EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_TestCC1CHEKBOX_LOCATOR).click();
				
			}
			catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
			}
		}
		
		public void clickUnvoidInvoiceButton(){
			try{
				setLogger().info("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : clickUnvoidInvoiceButton] clicking on unvoid InvoiceButton");
				EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_UNVOID_BUTTON_LOCATOR).click();
				
			}
			catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
			}
		}
		
		//popup error void inv history
		public void clickOK(){
			try{
				setLogger().info("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : clickOK] clicking on Ok");
				/*Screen s= new Screen();
				Pattern p= new Pattern("src\\test\\resources\\images\\UnvoidingpopUpOK.PNG");
				s.click(p);*/
				EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
				EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_UNVOID_POPUP_OK_BUTTON_LOCATOR).click();
			}
			catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
			}

		}
		
		public String verifySingleErrorMsgforUnvoid(){
			try{
				  setLogger().info("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : verifySingleErrorMsgforUnvoid] Verifying Customer for Voided Invoice ");
				  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_SINGLEINVOICE_UNVOID_ERROR_LOCATOR);
		  		  String voidedCustomer=wb.getText();
		  		  return voidedCustomer;
		  		  
			  }

		  catch(Exception e){
				setLogger().error("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : verifySingleErrorMsgforUnvoid] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
		  	Assert.assertTrue(false, e.getMessage()); 
		  	return "";
		    }
			catch(AssertionError e){
				setLogger().error("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : verifySingleErrorMsgforUnvoid] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
		  	Assert.assertTrue(false, e.getMessage()); 
		  	return "";
		   }
		}
		
		
		public String verifyMultipleErrorMsgforUnvoid(){
			try{
				  setLogger().info("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : verifyMultipleErrorMsgforUnvoid] Verifying Customer for Voided Invoice ");
				  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_MULTIPLEINVOICE_UNVOID_ERROR_LOCATOR);
		  		  String voidedCustomer=wb.getText();
		  		  return voidedCustomer;
		  		  //MatcherAssert.assertThat(voidedCustomer, equalTo(MMS_ExpectedResult.POPUP_MULTIPLE_INVOICE_STATUS_UNVOID_ERROR));
			  }

		  catch(Exception e){
				setLogger().error("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : verifyMultipleErrorMsgforUnvoid] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
		  	Assert.assertTrue(false, e.getMessage()); 
		  	return "";
		    }
			catch(AssertionError e){
				setLogger().error("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : verifyMultipleErrorMsgforUnvoid] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
		  	Assert.assertTrue(false, e.getMessage()); 
		  	return "";
		   }
		}
		
		public String verifyCombinedErrorforUnvoid(){
			try{
				  setLogger().info("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : verifyCombinedErrorforUnvoid] Verifying Customer for Voided Invoice ");
				  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_COMBINED_UNVOID_ERROR_LOCATOR);
		  		  String combinedErrorforUnvoid=wb.getText();
		  		  return combinedErrorforUnvoid;
		  		  //MatcherAssert.assertThat(combinedErrorforUnvoid, equalTo(MMS_ExpectedResult.POPUP_COMBINED_INVOICE_STATUS_UNVOID_ERROR));
			  }

		  catch(Exception e){
				setLogger().error("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : verifyCombinedErrorforUnvoid] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
		  	Assert.assertTrue(false, e.getMessage()); 
		  	return "";
		    }
			catch(AssertionError e){
				setLogger().error("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : verifyCombinedErrorforUnvoid] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
		  	Assert.assertTrue(false, e.getMessage());
		  	return "";
		   }
		}
		
		public boolean verifyCheckBoxSelectedforUnvoid(){
			try{
				  setLogger().info("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : verifyCombinedErrorforUnvoid] Verifying Customer for Voided Invoice ");
				  boolean selectCheckBox=EY_FW_Utility.isCheckboxSelected(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_TestCC1CHEKBOX_LOCATOR);
				  return selectCheckBox;
						  
		  		  
			  }

		  catch(Exception e){
				setLogger().error("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : verifyCombinedErrorforUnvoid] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
		  	Assert.assertTrue(false, e.getMessage()); 
		    }
			catch(AssertionError e){
				setLogger().error("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : verifyCombinedErrorforUnvoid] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
		  	Assert.assertTrue(false, e.getMessage()); 
		   }
			return false;
		}
		
		public void clickCheckBoxfor333333(){
			try{
				setLogger().info("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : clickCheckBoxforCC1] clicking on Checkbox for Invoice TestCC1");
				EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_333333CHECKBOX_LOCATOR).click();
				
			}
			catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
			}
		}
		
		public String verifyVoidStatusfor333333(){
			try{
				  setLogger().info("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : verifyVoidStatusfor333333] Verifying Customer for Voided Invoice " );
				  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_333333_VOIDSTATUS_LOCATOR);
		  		  String voidstatus=wb.getText();
		  		  return voidstatus;
		  		  //MatcherAssert.assertThat(voidstatus, equalTo(MMS_ExpectedResult.BILLING_INVOICEHISTORY_333333INVOICE_VOIDSTATUS));
			  }

		  catch(Exception e){
				setLogger().error("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : verifyVoidStatusfor333333] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
		  	Assert.assertTrue(false, e.getMessage()); 
		  	return "";
		    }
			catch(AssertionError e){
				setLogger().error("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : verifyVoidStatusfor333333] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
		  	Assert.assertTrue(false, e.getMessage());
		  	return "";
		   }
		}
		
		public String verifyUnVoidStatusfor333333(){
			try{
				  setLogger().info("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : verifyUnVoidStatusfor333333] Verifying Customer for Voided Invoice " );
				  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_333333_UNVOIDSTATUS_LOCATOR);
		  		  String unvoidstatus=wb.getText();
		  		  return unvoidstatus;
		  		  //MatcherAssert.assertThat(voidstatus, equalTo(MMS_ExpectedResult.BILLING_INVOICEHISTORY_333333INVOICE_VOIDSTATUS));
			  }

		  catch(Exception e){
				setLogger().error("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : verifyVoidStatusfor333333] Exception thrown -- " + EY_FW_Utility.getStackTrace(e));	
		  	Assert.assertTrue(false, e.getMessage()); 
		  	return "";
		    }
			catch(AssertionError e){
				setLogger().error("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : verifyVoidStatusfor333333] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
		  	Assert.assertTrue(false, e.getMessage());
		  	return "";
		   }
		}
		
		
		public void clockOkofUnvoidInvoicePopup(){
			try{
				setLogger().info("[MMS_PopUp_Eror_Unvoid_InvoiceHistoryPage : clockOkofUnvoidInvoicePopup] clicking Ok of Unvoiding Invoice");
				/*Screen s= new Screen();
				Pattern p= new Pattern("src\\test\\resources\\images\\okButtonforUnvoidingInvoice.PNG");
				s.click(p);*/
				EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICEHISTORY_VOID_POPUP_OK_BUTTON_LOCATOR).click();
				
			}
			catch(Exception e){
				Assert.assertTrue(false, e.getMessage()); 
			}
		}

		public void clickChkBoxTestaa1(){
			try{
				setLogger().info("[MMS_PopUp_Error_Void_InvoiceHistoryPage : clickChkBoxTestaa1] click the check box");
				
				EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_Testaa1_CHKBOX_LOCATOR).click();

				}
			catch (Exception e) {
				Assert.assertTrue(false, e.getMessage());
			}
		}

		public void clickChkBoxTestbb1(){
			try{
				setLogger().info("[MMS_PopUp_Error_Void_InvoiceHistoryPage : clickChkBoxTestaa1] click the check box");
				
				EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_Testbb1_CHKBOX_LOCATOR).click();

				}
			catch (Exception e) {
				Assert.assertTrue(false, e.getMessage());
			}
		}

		public void clickChkBoxTestdd1(){
			try{
				setLogger().info("[MMS_PopUp_Error_Void_InvoiceHistoryPage : clickChkBoxTestdd1] click the check box");
				
				EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_Testdd1_CHKBOX_LOCATOR).click();

				}
			catch (Exception e) {
				Assert.assertTrue(false, e.getMessage());
			}
		}

		public void clickChkBoxTestee1(){
			try{
				setLogger().info("[MMS_PopUp_Error_Void_InvoiceHistoryPage : clickChkBoxTestaa1] click the check box");
				
				EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_Testee1_CHKBOX_LOCATOR).click();

				}
			catch (Exception e) {
				Assert.assertTrue(false, e.getMessage());
			}
		}

	

	/*	public void clikcVoidInvoiceButton(){
			  try{
			  setLogger().info("[MMS_PopUp_Error_Void_InvoiceHistoryPag : clickInvoiceCheckbox] clicking on already Generated Invoice Checkbox");
			  EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_VOID_BUTTON_LOCATOR).click();
			  }
			  catch(Exception e){
			Assert.assertTrue(false, e.getMessage()); 
			}
			   
			

		}
*/
		   public void clickVoidStatus(){
			try {
				setLogger().info("[MMS_PopUp_Eror_Void_InvoiceHistoryPage : clickvoidStatus] clicking on void Status Invoice");
			
				EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_CLOSE_VOIDSTATUS_LOCATOR).click();
			} catch (Exception e) {
				Assert.assertTrue(false, e.getMessage());
			}
		}


		public void clickvoid() {
			try {
				setLogger().info("[MMS_PopUp_Eror_Void_InvoiceHistoryPage : clickvoid] clicking on void Invoice");
			
				EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_VOID_BUTTON_LOCATOR).click();
			} catch (Exception e) {
				Assert.assertTrue(false, e.getMessage());
			}
		}

		
			public void clickBilling() {
				try {
					setLogger().info("[MMS_PopUp_Eror_Void_InvoiceHistoryPage : clickBilling] clicking on Billing");
				//	EY_FW_Utility.doWait(5000);
					EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_DROPDOWNMENU_LOCATOR).click();
				} catch (Exception e) {
					Assert.assertTrue(false, e.getMessage());
				}
			}

			public void clickInvoiceHistory() {
				try {
					//EY_FW_Utility.doWait(5000);
					setLogger().info("[MMS_PopUp_Eror_Void_InvoiceHistoryPage : clickInvoiceHistory] clicking on Invoice History");
					EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.INVOICE_HISTORY_SUBMENU_LOCATOR).click();
				} catch (Exception e) {
					Assert.assertTrue(false, e.getMessage());
				}
			}
			
			public String verifySingleErrorMsgForVoid(){
				try{
				  setLogger().info("[MMS_PopUp_Eror_Void_InvoiceHistoryPage :  verifySingleErrorMsgforVoid] Verifying Customer for Voided Invoice ");
				  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_Single_Invoice_VoidError_Locator);
				     String voidedCustomer=wb.getText();
				     return voidedCustomer;
				     //MatcherAssert.assertThat(voidedCustomer, equalTo(MMS_ExpectedResult.POP_UP_ERROR_SINGLE_INVOICE_VOID));
				  }

				  catch(Exception e){
				setLogger().error("[MMS_PopUp_Eror_Void_InvoiceHistoryPage :  verifySingleErrorMsgforVoid] Exception thrown -- " + EY_FW_Utility.getStackTrace(e)); 
				   Assert.assertTrue(false, e.getMessage()); 
				   return "";
				    }
				catch(AssertionError e){
				setLogger().error("[MMS_PopUp_Eror_Void_InvoiceHistoryPage :  verifySingleErrorMsgforVoid] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
				   Assert.assertTrue(false, e.getMessage()); 
				   return "";
				   }
				}
			
			public String verifyMultipleErrorMsgforVoid(){
				try{
				  setLogger().info("[MMS_PopUp_Eror_Void_InvoiceHistoryPage : verifyMultipleErrorMsgforVoid] Verifying Customer for Voided Invoice ");
				  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_MULTIPLEINVOICE_VOID_ERROR_LOCATOR);
				     String voidedCustomer=wb.getText();
				     return voidedCustomer;
				     //MatcherAssert.assertThat(voidedCustomer, equalTo(MMS_ExpectedResult.POP_UP_ERROR_MULTIPLE_INVOICE_VOID));
				  }

				  catch(Exception e){
				setLogger().error("[MMS_PopUp_Eror_Void_InvoiceHistoryPage : verifyMultipleErrorMsgforVoid] Exception thrown -- " + EY_FW_Utility.getStackTrace(e)); 
				   Assert.assertTrue(false, e.getMessage());
				   return "";
				    }
				catch(AssertionError e){
				setLogger().error("[MMS_PopUp_Eror_Void_InvoiceHistoryPage : verifyMultipleErrorMsgforVoid] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
				   Assert.assertTrue(false, e.getMessage());
				   return "";
				   }
				}
			
			public String verifyCombiErrorMsgforVoid(){
				try{
				  setLogger().info("[MMS_PopUp_Eror_Void_InvoiceHistoryPage : verifyCombiErrorMsgforVoid] Verifying Customer for Voided Invoice ");
				  WebElement wb=EY_FW_Utility.findElementByLocator(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_COMBINED_VOID_ERROR_LOCATOR);
				     String combiErrorMsg=wb.getText();
				     return combiErrorMsg;
				     //MatcherAssert.assertThat(combiErrorMsg, equalTo(MMS_ExpectedResult.POP_UP_ERROR_COMBI_INVOICE_VOID));
				  }

				  catch(Exception e){
				setLogger().error("[MMS_PopUp_Eror_Void_InvoiceHistoryPage : verifyCombiErrorMsgforVoid] Exception thrown -- " + EY_FW_Utility.getStackTrace(e)); 
				   Assert.assertTrue(false, e.getMessage()); 
				   return "";
				    }
				catch(AssertionError e){
				setLogger().error("[MMS_PopUp_Eror_Void_InvoiceHistoryPage : verifyCombiErrorMsgforVoid] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
				   Assert.assertTrue(false, e.getMessage()); 
				   return "";
				   }
				}
		      
			public boolean verifyInvoiceChecked(){
				try{
				  setLogger().info("[MMS_PopUp_Eror_Void_InvoiceHistoryPage : verifyCombiErrorMsgforVoid] Verifying Customer for Voided Invoice ");
				  boolean selectStatus=EY_FW_Utility.isCheckboxSelected(MMS_InvoiceHistoryPageLocator.BILLING_INVOICEHISTORY_Testee1_CHKBOX_LOCATOR);
				  return selectStatus;
				     
				  }

				  catch(Exception e){
				setLogger().error("[MMS_PopUp_Eror_Void_InvoiceHistoryPage : verifyInvoiceChecked] Exception thrown -- " + EY_FW_Utility.getStackTrace(e)); 
				   Assert.assertTrue(false, e.getMessage()); 
				   
				    }
				catch(AssertionError e){
				setLogger().error("[MMS_PopUp_Eror_Void_InvoiceHistoryPage : verifyInvoiceChecked] Assert Failure -- " + EY_FW_Utility.getStackTrace(e));
				   Assert.assertTrue(false, e.getMessage()); 
				  
				   }
				 
				return false;
				}
   
}
