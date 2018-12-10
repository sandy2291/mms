package com.ey.mms.pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import com.ey.mms.pageobjects.mmsLocators.MMS_BulkRebuttalDialogueLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_RepairListPageLocator;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.EY_GettersSetters;

import net.serenitybdd.core.pages.PageObject;

public class Rebuttal_RepairListPage extends PageObject {

	public void clickBulkRebuttal() {
		try {
			System.out.println("[MMS_RebuttalRepair List : clickBulkRebuttal ] Clicking on bulk rebuttal");
			EY_FW_Utility.findElementByLocator(MMS_RepairListPageLocator.BULK_REBUTTAL_REPAIRLIST).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectBillee(String billeeName) {
		try {
			System.out.println("[MMS_REBUTTAL_BILLING_REPAIRLIST : selectbillee], Selecting BILEE");
			WebElement billee = EY_FW_Utility.findElementByLocator(MMS_BulkRebuttalDialogueLocator.BILEE_DROPDOWN);
			Select dropdown = new Select(billee);
			dropdown.selectByVisibleText(billeeName);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void selectContact(String contactName) {
		try {
			System.out.println("[MMS_REBUTTAL_BILLING_REPAIRLIST : selectcontact], Selecting contact");
			WebElement contact = EY_FW_Utility
					.findElementByLocator(MMS_BulkRebuttalDialogueLocator.CONTACT_DROPDOWN);
			Select dropdown = new Select(contact);
			dropdown.selectByVisibleText(contactName);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickSaveRebuttal() {
		try {
			//evaluateJavascript("document.getElementById('SaveRebuttal').click()");
			System.out.println("[MMS_RebuttalRepair List : clickSaveRebuttal ] Clicking on Save rebuttal");
			EY_FW_Utility.findElementByLocator(MMS_BulkRebuttalDialogueLocator.SAVE_REBUTTAL).click();
			//WebDriverWait wait = new WebDriverWait(EY_GettersSetters.getDriver(), 10);
			//wait.until(ExpectedConditions.alertIsPresent());
			//Alert alert = EY_GettersSetters.getDriver().switchTo().alert();
			//alert.accept();
			
		/*	String originalWindowHandle = EY_GettersSetters.getDriver().getWindowHandle();
			System.out.println("original Window handles are: " + originalWindowHandle);
			System.out.println("Title of original Page:" + EY_GettersSetters.getDriver().getTitle());  
			java.util.Set<java.lang.String> windowHandles = EY_GettersSetters.getDriver().getWindowHandles();
			System.out.println(windowHandles);
			int count = windowHandles.size();
			
			for (String window: windowHandles) {
			    if(!window.equals(originalWindowHandle)){
			    	EY_GettersSetters.getDriver().switchTo().window(window);
			        String url = EY_GettersSetters.getDriver().getCurrentUrl();
			        System.out.println("current url is: " + url+"  "+EY_GettersSetters.getDriver().getTitle());        
			    }  
			    //to go back to original    
			    EY_GettersSetters.getDriver().switchTo().window(originalWindowHandle); 

			}   */
			
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickBulkUnassignButton() {
		try {
			System.out.println("[MMS_RebuttalRepair List : clickBulkUnassignButton ] Clicking on bulk unassign");
			EY_FW_Utility.findElementByLocator(MMS_BulkRebuttalDialogueLocator.BULK_UNASSIGN).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void confirmBulkUnassignButton() {
		try {
			System.out
					.println("[MMS_RebuttalRepair List : confirmBulkUnassignButton ] Clicking on ok of  bulk unassign");
			EY_FW_Utility.findElementByLocator(MMS_BulkRebuttalDialogueLocator.CONFIRMBULKUNASSIGN).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickRestoreDefault() {
		try {
			System.out.println("[MMS_RebuttalRepair List : clickRestoreDefault ] Clicking on restore default");
			EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
			EY_FW_Utility.findElementByLocator(MMS_RepairListPageLocator.RESTORE_DEFAULT).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void SelectOverwriteRebuttal() {
		try {
			EY_FW_Utility.doWait(2000);
			System.out.println("[MMS_RebuttalRepair List : SelectOverwriteRebuttal ] selecting overwrite rebuttal");
			EY_FW_Utility.findElementByLocator(MMS_BulkRebuttalDialogueLocator.OVERWRITE_REBUTTAL).click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void confirmSaveRebuttal() {
		try {
			// DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			// capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,"ignore");
			System.out.println("[MMS_RebuttalRepair List : confirmSaveRebuttal ] Clicking on ok to Save rebuttal");
			WebDriverWait wait = new WebDriverWait(EY_GettersSetters.getDriver(), 10);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = EY_GettersSetters.getDriver().switchTo().alert();
			alert.accept();
			/*Thread.sleep(6000);
			// Check the presence of alert
			   Alert alert = EY_GettersSetters.getDriver().switchTo().alert();
			   // Alert present; set the flag
			   //presentFlag = true;
			   // if present consume the alert
			   alert.accept();*/
			   
			// WebElement.sendKeys(Keys.RETURN);
			// selenium.keyPressNative("10"); // Enter
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
		/*
		 * Screen s = new Screen(); Pattern p = new Pattern(MMS_Locators.popupok
		 * ); try { System.out.
		 * println("[MMS_RebuttalRepair List : confirmSaveRebuttal ] Clicking on ok alert button"
		 * ); s.click(p);
		 * 
		 * } catch (FindFailed e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		// getDriver().switchTo().activeElement().sendKeys(Keys.RETURN);

	}

}
