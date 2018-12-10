package com.ey.mms.pageobjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hamcrest.MatcherAssert;
import static org.hamcrest.CoreMatchers.equalTo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import com.ey.mms.pageobjects.MMS_ExpectedResult;
import com.ey.mms.pageobjects.MMS_Locators;
import com.ey.mms.pageobjects.mmsLocators.MMS_LeaseAssignmentPageLocator;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.EY_GettersSetters;
import com.ey.mms.util.PropertyReader;

import net.serenitybdd.core.pages.PageObject;

public class LeaseAssignmentPage extends PageObject {

	String parentWindowHandler = null;
	String subWindowHandler = null;

	/*public void openURL() {
		try {
			System.out.println("[MMS_Lease_Assignment : openURL] open url ");
			String url = new PropertyReader().readProperty("appurl");// "http://3.204.170.44/ns/login";
			openAt(url);
			// driver= EY_GettersSetters.getDriver();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
*/
	public void clickUploadCsv() {
		try {

			System.out.println("[MMS_Lease_Assignment : clickUploadCsv] clicking upload CSV Button ");
			WebElement uploadCsv = EY_FW_Utility
					.findElementByLocator(MMS_LeaseAssignmentPageLocator.UPLOADCSV_BUTTON_LOCATOR);

			uploadCsv.click();
		} catch (Exception e) {

			Assert.assertTrue(false, e.getMessage());
		}

	}

	WebElement uploadbutton;
	public void clickUploadFile() throws FindFailed, InterruptedException {
		try {
			System.out.println("[MMS_Lease_Assignment : clickUploadFile] clicking upload File ");
			//String path = System.getProperty("user.dir");
			//uploadbutton = EY_FW_Utility.findElementByLocator(MMS_LeaseAssignmentPageLocator.UPLOAD_BUTTON);
			List<WebElement> we = EY_FW_Utility.getElementListByLocator(MMS_LeaseAssignmentPageLocator.UPLOAD_BUTTON);
			uploadbutton = we.get(0);
			/*uploadbutton = EY_GettersSetters.getDriver().findElement(By.id("attachments"));
			System.out.println(" size is "+uploadbutton.getSize().height+" "+uploadbutton.getSize().width);
			if(uploadbutton.isDisplayed()){
				System.out.println("element is displayed ");
			}
			else
				System.out.println("element is not displayed");
			
			if(uploadbutton.isEnabled()){
				System.out.println("element is enabed ");
			}
			else
				System.out.println("element is not enabled");*/
			/*Screen s = new Screen();
			String path = System.getProperty("user.dir");
			Pattern p = new Pattern(path+"/"+MMS_LeaseAssignmentPageLocator.UploadButton);
			EY_FW_Utility.doWait(3000);
			s.click(p);*/
			Thread.sleep(1000);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

		/*
		 * WebElement uploadFile =
		 * EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.
		 * UPLOADFILE_BUTTON_LOCATOR); uploadFile.click();
		 */
	}

	public void browsecsvfile(String s1) throws InterruptedException {
		try {
			String path = System.getProperty("user.dir");
			System.out.println("[MMS_Lease_Assignment : browsecsvfile] browesing CSV file ");
			/*Screen s = new Screen();
			String path = System.getProperty("user.dir");//new PropertyReader().readProperty("path");
*/			//System.out.println("path is "+path);
			uploadbutton.sendKeys(path + "\\src\\test\\resources\\files\\" + s1);
			Thread.sleep(2000);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*public void getUploadProgress(String s) {
		String text = EY_FW_Utility.getAnyElementByAnyLocator(MMS_LeaseAssignmentPageLocator.UPLOAD_PROGRESSBAR_LOCATOR)
				.getText();
		MatcherAssert.assertThat(text, equalTo(s));
		// EY_FW_Utility.doWait(2000);
	}*/

	public String leaseUploadStatus() {
		return EY_FW_Utility.findElementByLocator(MMS_LeaseAssignmentPageLocator.LEASE_UPLOAD_STATUS_LOCATOR)
				.getText();
	}

	public void clickFilter() {
		try {
			System.out.println("[MMS_Lease_Assignment : clickFilter] click on Filter button ");
			WebElement filter = EY_FW_Utility
					.findElementByLocator(MMS_LeaseAssignmentPageLocator.FILTER_BUTTON_LOCATOR);
			filter.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterCarInitial(String leaseCarInitial) {
		try {
			System.out.println("[MMS_Lease_Assignment : enterCarInitial] Entering '" + leaseCarInitial
					+ "' in Lease Car Initial ");
			WebElement carInitial = EY_FW_Utility
					.findElementByLocator(MMS_LeaseAssignmentPageLocator.CAR_INITIAL_EDITBOX_LOCATOR);
			carInitial.sendKeys(leaseCarInitial);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterCarNumberfrom(String leasecarNumberFrom) {
		try {
			System.out.println("[MMS_Lease_Assignment : enterCarNumberfrom] Entering '" + leasecarNumberFrom
					+ "' in Lease Car Number From ");
			WebElement carNumberFrom = EY_FW_Utility
					.findElementByLocator(MMS_LeaseAssignmentPageLocator.CAR_NUMBERFROM_EDITBOX_LOCATOR);
			carNumberFrom.sendKeys(leasecarNumberFrom);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void enterCarNumberTo(String leasecarNumberTo) {
		try {
			System.out.println("[MMS_Lease_Assignment : enterCarNumberTo] Entering '" + leasecarNumberTo
					+ "' in Lease Car Number To ");
			WebElement carNumberTo = EY_FW_Utility
					.findElementByLocator(MMS_LeaseAssignmentPageLocator.CAR_NUMBERTO_EDITBOX_LOCATOR);
			carNumberTo.sendKeys(leasecarNumberTo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickLeaseSave() {
		try {
			System.out.println("[MMS_Lease_Assignment : clickLeaseSave] clicking on Lease Save Button ");
			WebElement leaseSave = EY_FW_Utility
					.findElementByLocator(MMS_LeaseAssignmentPageLocator.LEASE_SAVE_BUTTON_LOCATOR);
			leaseSave.click();
			// EY_FW_Utility.doWait(2000);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public String getCarLoaded() {

		return EY_FW_Utility.findElementByLocator(MMS_LeaseAssignmentPageLocator.CAR_LOADED_LOCATOR).getText();
	}

	public void carCheckbox() {
		try {
			System.out.println("[MMS_Lease_Assignment : carcheckBox] clicking on car Checkbox ");
			WebElement carInitialCheck = EY_FW_Utility
					.findElementByLocator(MMS_LeaseAssignmentPageLocator.CAR_INITIAL_CHECKBOX_LOCATOR);
			carInitialCheck.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void clickUnAssign() {
		try {
			System.out.println("[MMS_Lease_Assignment : clickUnAssign] clicking on Unassign Button ");
			WebElement unAssign = EY_FW_Utility
					.findElementByLocator(MMS_LeaseAssignmentPageLocator.UNASSIGN_BUTTON_LOCATOR);
			unAssign.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void clickUnAssignSave() throws InterruptedException {
		try {

			System.out.println("[MMS_Lease_Assignment : clickUnAssignSave] clicking on Unassign Save Button");
			EY_FW_Utility.findElementByLocator(MMS_LeaseAssignmentPageLocator.Unassign_Save).click();
			/*Screen s = new Screen();
			String path = System.getProperty("user.dir");
			Pattern p = new Pattern(path+"/"+MMS_LeaseAssignmentPageLocator.SaveButton);

			s.click(p);
*/
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	/*
	 * public void getErrorMsg(){ System.out.
	 * println("[MMS_FleetListPage : verifyErrormsg] Verifying Error Message "+
	 * MMS_ExpectedResult.FLEETLIST_DEACTIVATE_ERROR_MSG); WebElement
	 * errormsg=EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.
	 * FLEET_DEACTIVATE_ERROR_MSG_LOCATOR);
	 * Assert.assertTrue(errormsg.equals(MMS_ExpectedResult.
	 * FLEETLIST_DEACTIVATE_ERROR_MSG)); }
	 */
/*
	public void getUnAssignError() {
		System.out.println("[MMS_Lease_Assignment : verifyErrormsg] Verifying Error Message "
				+ MMS_ExpectedResult.FLEETLIST_DEACTIVATE_ERROR_MSG);
		WebElement wb = EY_FW_Utility
				.getAnyElementByAnyLocator(MMS_LeaseAssignmentPageLocator.UNASSIGN_ERROR_TEXT_LOCATOR);
		String errormsg = wb.getText();
		MatcherAssert.assertThat(errormsg, equalTo(MMS_ExpectedResult.LEASEASSIGNMENT_UNASSIGN_ERROR));
		// EY_FW_Utility.doWait(2000);
		// return
		// EY_FW_Utility.getAnyElementByAnyLocator(MMS_Locators.UNASSIGN_ERROR_TEXT_LOCATOR).getText();
	}
*/
	public void clickUnAssignCancel() {
		try {
			System.out.println("[MMS_Lease_Assignment : clickUnAssignCancel] clicking on Unassign Cancel Button ");
			EY_FW_Utility.waitForModalBackgroundFadeToDisappear(5);
			EY_FW_Utility.findElementByLocator(MMS_LeaseAssignmentPageLocator.Unassign_Cancel).click();
			/*Screen s = new Screen();
			String path = System.getProperty("user.dir");
			Pattern p = new Pattern(path+"/"+MMS_LeaseAssignmentPageLocator.CancelButton);
			EY_FW_Utility.doWait(2000);
			s.click(p);*/
		     EY_FW_Utility.doWait(3000);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void enterUnAssignEndDate(String unAssignEndDate) {
		try {
			System.out.println("[MMS_Lease_Assignment : enterUnAssignEndDate] Entering '" + unAssignEndDate
					+ "' UnAssign End Date");
			WebElement endDate = EY_FW_Utility
					.findElementByLocator(MMS_LeaseAssignmentPageLocator.UNASSIGN_ENDDATE_EDITBOX_LOCATOR);
			endDate.sendKeys(unAssignEndDate);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void clickAction() {
		try {
			System.out.println("[MMS_Lease_Assignment : clickUnAssignCancel] clicking on Unassign Cancel Button ");
			WebElement action = EY_FW_Utility.findElementByLocator(MMS_LeaseAssignmentPageLocator.ACTION_LOCATOR);
			action.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void clickViewLog() throws InterruptedException {
		// TODO Auto-generated method stub
		try {
			System.out.println("[MMS_Lease_Assignment : clickViewLog] clicking on view log under action column ");
			WebElement viewLog = EY_FW_Utility
					.findElementByLocator(MMS_LeaseAssignmentPageLocator.VIEWLOG_LOCATOR);
			viewLog.click();
			// return new EY_MMS_PG_UploadFleet_Log(driver);
			parentWindowHandler = EY_GettersSetters.getDriver().getWindowHandle(); // Store
																					// your
																					// parent
																					// window
			Set<String> handles = EY_GettersSetters.getDriver().getWindowHandles(); // get
																					// all
																					// window
																					// handles
			Iterator<String> it = handles.iterator();
			// System.out.println(it.size());

			while (it.hasNext()) {
				subWindowHandler = it.next();
			}
			EY_GettersSetters.getDriver().switchTo().window(subWindowHandler); // switch
																				// to
																				// popup
																				// window
			Thread.sleep(3000);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public void clickDelete() throws InterruptedException {
		// TODO Auto-generated method stub
		try {
			System.out.println("[MMS_Lease_Assignment : clickDelete] clicking on delete Button ");
			WebElement delete = EY_FW_Utility.findElementByLocator(MMS_LeaseAssignmentPageLocator.DELETE_LOCATOR);
			delete.click();
			// return new EY_MMS_PG_UploadFleet_Log(driver);
			parentWindowHandler = EY_GettersSetters.getDriver().getWindowHandle(); // Store
																					// your
																					// parent
																					// window
			Set<String> handles = EY_GettersSetters.getDriver().getWindowHandles(); // get
																					// all
																					// window
																					// handles
			Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()) {
				subWindowHandler = iterator.next();
			}
			EY_GettersSetters.getDriver().switchTo().window(subWindowHandler); // switch
																				// to
																				// popup
																				// window
			Thread.sleep(3000);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return EY_GettersSetters.getDriver().getTitle();
	}

	public String getTextFromTable() {
		List<WebElement> lst = EY_FW_Utility
				.getElementListByLocator(MMS_LeaseAssignmentPageLocator.TEXT_TABLE_LOCATOR);
		lst.size();
		return lst.toString();

	}

	public void closecarInitial() {
		try {
			System.out.println("[MMS_Lease_Assignment : closecarInitial] clicking on  close Car Initial Box ");
			EY_FW_Utility.findElementByLocator(MMS_LeaseAssignmentPageLocator.LEASES_CAR_INITIAL_CLOSE_LOCATOR)
					.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	public void closeCarNumber() {
		try {
			System.out.println("[MMS_Lease_Assignment : closecarInitial] clicking on  close Car Initial Box ");
			EY_FW_Utility.findElementByLocator(MMS_LeaseAssignmentPageLocator.LEASES_CAR_NUMBER_CLOSE_LOCATOR)
					.click();
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}

	}
}
