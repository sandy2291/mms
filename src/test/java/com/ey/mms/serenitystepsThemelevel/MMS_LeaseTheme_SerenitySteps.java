package com.ey.mms.serenitystepsThemelevel;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.testng.Assert;

import com.ey.mms.pageobjects.AddGroupPage;
import com.ey.mms.pageobjects.MMS_ExpectedResult;
import com.ey.mms.pageobjects.HomePage;
import com.ey.mms.pageobjects.LeaseAssignmentPage;
import com.ey.mms.pageobjects.LoginPage;
import com.ey.mms.pageobjects.MaintenanceResponsibilityGroupsPage;
import com.ey.mms.pageobjects.UploadLeasesPage;
import com.ey.mms.pageobjects.ViewLeasesPage;
import com.ey.mms.pageobjects.mmsLocators.MMS_LeaseAssignmentPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MaintResGroupsPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_UploadDXPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_UploadLeasePageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_UserManagerPageLocator;
import com.ey.mms.pageobjects.mmsLocators.MMS_ViewLeasePageLocator;
import com.ey.mms.serenitystepsThemelevel.expectedData.ExceptionReview;
import com.ey.mms.serenitystepsThemelevel.expectedData.FleetList;
import com.ey.mms.serenitystepsThemelevel.expectedData.LeaseAssignment;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.PropertyReader;

import cucumber.api.java.Before;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class MMS_LeaseTheme_SerenitySteps {

	@ManagedPages
	MaintenanceResponsibilityGroupsPage mainresp;

	@ManagedPages
	AddGroupPage addgroup;

	@ManagedPages
	LoginPage mmsloginpage;

	@ManagedPages
	HomePage mmshomepage;

	@ManagedPages
	LeaseAssignmentPage mmsleaseassignmentpage;

	@ManagedPages
	ViewLeasesPage mmsviewleasespage;

	@ManagedPages
	UploadLeasesPage mmsuploadlease;

	@Step
	public void verifyMaintenanceResponsibilityGroupPageTitle() {
		EY_FW_Utility.doWait(3000);
		// mainresp.verifyMaintenanceResponsibilityGroupPageTitle();
		try {

			System.out.println(
					"[MMS_Maintenance_Responsibility_Groups : verifyMaintenanceResponsibilityGroupPageTitle] Verifying Maintenace responsibility group title as "
							+ ExceptionReview.Maintenace_Responsibility_Groups_Page_Title);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
					equalTo(ExceptionReview.Maintenace_Responsibility_Groups_Page_Title));
		} catch (Exception e) {

			System.out.println(
					"[MMS_Maintenance_Responsibility_Groups : verifyMaintenanceResponsibilityGroupPageTitle] Exception thrown -- "
							+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void clickAddGroup() {
		mainresp.clickAddGroup();
		EY_FW_Utility.waitForProgressWindowToDisappear(20);
	}

	@Step
	public void verifyAddGroupPageTitle() {
		EY_FW_Utility.doWait(5000);
		// addgroup.verifyAddGroupPageTitle();
		try {

			System.out.println(
					"[MMS_Maintenance_Responsibility_Groups : verifyAddGroupPageTitle] Verifying Maintenace responsibility group title as "
							+ ExceptionReview.ADDGROUP_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
					equalTo(ExceptionReview.ADDGROUP_PAGE_TITLE));
		} catch (Exception e) {
			System.out.println("[MMS_Maintenance_Responsibility_Groups : verifyAddGroupPageTitle] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void enterName(String s) {
		addgroup.enterGroupName(s);
	}

	@Step
	public void enterFilterGroupName(String s) {
		mainresp.enterFilterGroupName(s);
	}

	@Step
	public void enterDesc(String s) {
		addgroup.enterGroupDesc(s);
	}

	@Step
	public void selectJobcode(String s) {
		addgroup.selectJobcodes(s);
		EY_FW_Utility.doWait(2000);
	}

	@Step
	public void selectQC(String s) {
		addgroup.selectQC(s);
		EY_FW_Utility.doWait(2000);
	}

	@Step
	public void selectWMC(String s) {
		addgroup.selectWMC(s);
		EY_FW_Utility.doWait(2000);
	}

	@Step
	public void clickCancelGroup() {
		addgroup.clickCancelGroup();
	}

	@Step
	public void clickSaveGroup() {
		addgroup.clickSaveGroup();
	}

	@Step
	public void verifyColor(String s) {
		// addgroup.verifyColor(s);
		String color = EY_FW_Utility.findElementByLocator(s).getCssValue("color");

		String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");

		int hexValue1 = Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();
		int hexValue2 = Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();
		int hexValue3 = Integer.parseInt(hexValue[2]);
		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		System.out.println("actual color is " + actualColor);
		MatcherAssert.assertThat("#ff0000", equalTo(actualColor));
	}

	@Step
	public void verifyLightRedColor(String s) {
		// addgroup.verifyLightRedColor(s);
		String color = EY_FW_Utility.findElementByLocator(s).getCssValue("color");

		String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");

		int hexValue1 = Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();
		int hexValue2 = Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();
		int hexValue3 = Integer.parseInt(hexValue[2]);
		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		System.out.println("actual color is " + actualColor);
		MatcherAssert.assertThat("#5c5f63", equalTo(actualColor));

	}

	@Step
	public void verifyErrorMessage(String s) {
		EY_FW_Utility.doWait(2000);
		// addgroup.verifyErrorMessage(s);
		try {
			System.out.println("MMS_Maintenance_Responsibility_Groups : verifyErrorMessage");
			MatcherAssert.assertThat(
					EY_FW_Utility.findElementByLocator(MMS_MaintResGroupsPageLocator.Error_Message).getText(),
					containsString(s));

		} catch (Exception e) {
			System.out.println("[MMS_Maintenance_Responsibility_Groups : verifyErrorMessage ] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void clickAddline() {
		addgroup.clickAddnewLine();
	}

	@Step
	public void clickDeleteIcon() {
		addgroup.clickDeleteIcon();
	}

	@Step
	public void checkLinescount() {
		MatcherAssert.assertThat(AddGroupPage.lineCount + 1, equalTo(addgroup.getLinesCount()));
	}

	@Step
	public void enterJobCodeText(String s) {
		addgroup.enterJobCodeText(s);
	}

	@Step
	public void enterQCText(String s) {
		addgroup.enterQCText(s);
	}

	@Step
	public void enterWMCText(String s) {
		addgroup.enterWMCtext(s);
	}

	@Step
	public void clickFilter() {
		mainresp.clickFilter();
	}

	@Step
	public void selectEnabled(String s) {
		mainresp.selectEnable(s);
	}

	@Step
	public void clickSave() {
		mainresp.saveFilter();
		EY_FW_Utility.doWait(3000); // for refreshment
	}

	@Step
	public void cancelFilter() {
		mainresp.cancelFilter();
	}

	@Step
	public void clickActions(String s) {
		mainresp.clickActions(s);
	}

	@Step
	public void clickActionList(String s) {
		mainresp.clickActionList(s);
	}

	@Step
	public void verifyEditGroupPageTitle() {
		// addgroup.verifyEditGroupPageTitle();
		try {

			System.out.println(
					"[MMS_Maintenance_Responsibility_Groups : verifyEditGroupPageTitle] Verifying Maintenace responsibility group title as "
							+ ExceptionReview.EDITGROUP_PAGE_TITLE);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
					equalTo(ExceptionReview.EDITGROUP_PAGE_TITLE));
		} catch (Exception e) {
			System.out.println("[MMS_Maintenance_Responsibility_Groups : verifyEditGroupPageTitle] Exception thrown -- "
					+ EY_FW_Utility.getStackTrace(e));
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void confirmPopup() {
		mainresp.confirmPopup();
	}

	@Step
	public void cancelPopup() {
		mainresp.cancelPopup();
	}

	@Step
	public void verifyEnabledText(String s1, String s2) {
		EY_FW_Utility.doWait(2000);
		// mainresp.verifyEnabledColumText(s1, s2);
		System.out.println("[MMS_Maintenance_Responsibility_Groups : clickActions ]");
		int rowno = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 1, s2);
		MatcherAssert.assertThat(EY_FW_Utility.mms_getTextOfField(MMS_MyCompanyInfoPageLocator.contacttable, rowno, 3), equalTo(s1));
	}

	// Serenity for Lease Assignment

	@Step
	public void opensMMSLoginPage() {
		System.out.println("------=================-------- " + mmsleaseassignmentpage);
		//mmsleaseassignmentpage.openURL();
		mmsloginpage.openURL();
		// mmsloginpage.enterUserId("kcsadmin");
	}

	@Step
	public void enterUserId(String userid) {
		mmsloginpage.enterUserId(userid);
	}

	@Step
	public void enterPassword(String input) {
		mmsloginpage.enterPassword(input);
		// mmsloginpage.enterUserId("kcsadmin");

	}

	@Step
	public void clickLoginButton() {
		mmsloginpage.clickLoginButton();
		// mmsloginpage.enterUserId("kcsadmin");

	}

	@Step
	public void clickConfigurationMainMenu() {
		mmshomepage.clickConfiguration();

	}

	@Step
	public void leasesSubMenu() {
		mmshomepage.selectLeasesSubMenu();
	}
	
	@Step
	public void clickRefreshLease() {
		try {

			EY_FW_Utility.findElementByLocator(MMS_UploadLeasePageLocator.REFRESH_LEASE).click();
			EY_FW_Utility.doWait(5000);
		} catch (Exception e) {

			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void leasesAssignmentSubMenu(String s) {
		mmshomepage.clickLeases_LeaseAssignmentSubmenu(s);
	}

	@Step
	public void uploadCsv() {
		mmsleaseassignmentpage.clickUploadCsv();

	}

	@Step
	public void uploadFile() throws FindFailed, InterruptedException {
		mmsleaseassignmentpage.clickUploadFile();
	}

	@Step
	public void browseFile(String s) throws InterruptedException {
		mmsleaseassignmentpage.browsecsvfile(s);
		EY_FW_Utility.doWait(20000); // depends on service response
	}

	@Step
	public void verify_Upload_Status(String s) {
		try {
			//EY_FW_Utility.doWait(3000);
			MatcherAssert.assertThat(s, equalTo(uploadStatus()));

		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void uploadProgressBar(String s) {
		//mmsleaseassignmentpage.getUploadProgress(s);
		String text = EY_FW_Utility.findElementByLocator(MMS_LeaseAssignmentPageLocator.UPLOAD_PROGRESSBAR_LOCATOR)
				.getText();
		MatcherAssert.assertThat(text, equalTo(s));
	}

	@Step
	public String uploadStatus() {
		return mmsleaseassignmentpage.leaseUploadStatus();
	}

	@Step
	public void Filter() {
		mmsleaseassignmentpage.clickFilter();

	}

	@Step
	public void carInitial(String leaseCarInitial) {
		mmsleaseassignmentpage.enterCarInitial(leaseCarInitial);
	}

	@Step
	public void carNumber(String carNumberFrom) {
		mmsleaseassignmentpage.enterCarNumberfrom(carNumberFrom);
	}

	@Step
	public void carTo(String carNumberTo) {
		mmsleaseassignmentpage.enterCarNumberTo(carNumberTo);
	}

	@Step
	public void filterSave() {
		mmsleaseassignmentpage.clickLeaseSave();
	}

	@Step
	public void carLoaded() {
		mmsleaseassignmentpage.getCarLoaded();

	}

	@Step
	public void selectCarCheckBox() {
		mmsleaseassignmentpage.carCheckbox();
	}

	@Step
	public void enterEndDate(String unAssignEndDate) {
		mmsleaseassignmentpage.enterUnAssignEndDate(unAssignEndDate);
	}

	@Step
	public void unAssign() {
		mmsleaseassignmentpage.clickUnAssign();
	}

	@Step
	public void unAssignSave() throws InterruptedException {
		mmsleaseassignmentpage.clickUnAssignSave();
	}

	@Step
	public void unAssignError() {
		//mmsleaseassignmentpage.getUnAssignError();
		System.out.println("[MMS_Lease_Assignment : verifyErrormsg] Verifying Error Message "
				+ FleetList.FLEETLIST_DEACTIVATE_ERROR_MSG);
		WebElement wb = EY_FW_Utility
				.findElementByLocator(MMS_LeaseAssignmentPageLocator.UNASSIGN_ERROR_TEXT_LOCATOR);
		String errormsg = wb.getText();
		MatcherAssert.assertThat(errormsg, equalTo(LeaseAssignment.LEASEASSIGNMENT_UNASSIGN_ERROR));
	}

	@Step
	public void unAssignCancel() {
		mmsleaseassignmentpage.clickUnAssignCancel();
	}

	@Step
	public void unAssignDate(String EndDate) throws InterruptedException {
		mmsleaseassignmentpage.enterUnAssignEndDate(EndDate);
	}

	@Step
	public void clickAction() throws InterruptedException {
		mmsleaseassignmentpage.clickAction();
	}

	@Step
	public void viewLog() throws InterruptedException {
		mmsleaseassignmentpage.clickViewLog();
	}

	@Step
	public void clickDelete() throws InterruptedException {
		mmsleaseassignmentpage.clickDelete();
	}

	@Step
	public void getPageTitle() {
		mmsleaseassignmentpage.getTitle();
	}

	@Step
	public void getTableText() {
		mmsleaseassignmentpage.getTextFromTable();
	}

	@Step
	public void leaseCloseCarInitial() {
		mmsleaseassignmentpage.closecarInitial();
	}

	@Step
	public void leasesCloseCarNumber() {
		mmsleaseassignmentpage.closeCarNumber();
	}

	// Serenity for View Leases

	@Step
	public void leasesViewLeaseSubMenu() {
		mmshomepage.clickLeases_ViewLeases();
	}

	@Step
	public void leaseViewLeasesAddLeases() {
		mmsviewleasespage.clickViewLeaseAddLease();
	}

	@Step
	public void leaseViewLeaseselectRelationship() {
		mmsviewleasespage.selectViewLeasesRelationShip();
	}

	@Step
	public void leaseViewLeaseSelectType() {
		mmsviewleasespage.selectViewLeasesType();
	}

	@Step
	public void leaseViewLeaseEnterLeaseNumber(String leaseNumber) {
		mmsviewleasespage.enterViewLeaseNumber(leaseNumber);
	}

	@Step
	public void leaseViewLeaseEnterLeaseTitle(String leaseTitle) {
		mmsviewleasespage.enterViewLeasesTitle(leaseTitle);
	}

	@Step
	public void leaseViewLeaseEnterStartDate(String startDate) {
		mmsviewleasespage.enterViewLeasesStartDate(startDate);

	}

	@Step
	public void leaseViewLeaseEnterEndDate(String endDate) {
		mmsviewleasespage.enterViewLeasesEndDate(endDate);
	}

	@Step
	public void leaseViewLeaseSelectLessor() {
		mmsviewleasespage.selectViewLeasesLessor();
	}

	@Step
	public void leaseViewLeaseSelectContact(String contact) {
		mmsviewleasespage.selectViewLeasesContact(contact);
	}

	@Step
	public void leaseViewLeaseEnterCarCount(String carCount) {
		// mmsviewleasespage.enterViewLeasesCarCount(carCount);

	}

	@Step
	public void leaseViewLeaseclicksaveGroup() {
		mmsviewleasespage.clickViewLeasesSaveGroup();
	}

	@Step
	public void verifyViewLeasePageTitle() {
		// mmsviewleasespage.verifyViewLeasePageTItle();
		EY_FW_Utility.doWait(2000);
		System.out.println("[MMS_View_LeasesPage : verifyViewLeasePageTItle] Verifying View Leases Page Title as "
				+ LeaseAssignment.LEASES_VIEWLEASE_PAGETITLE);
		MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
				equalTo(LeaseAssignment.LEASES_VIEWLEASE_PAGETITLE));
	}

	@Step
	public void leaseVerifyViewLeaseAddLeasePageTitle() {
		// mmsviewleasespage.verifyViewLeaseAddLeasePageTitle();
		EY_FW_Utility.doWait(2000);
		System.out
				.println("[MMS_View_LeasesPage : verifyViewLeaseAddLeasePageTitle] Verifying Add Leases Page Title as "
						+ LeaseAssignment.LEASES_VIEWLEASE_ADDLEASE_PAGETITLE);
		MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
				equalTo(LeaseAssignment.LEASES_VIEWLEASE_ADDLEASE_PAGETITLE));
	}
	
	
	@Step
	public void verifyHeading(String title){
		MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
				equalTo(title));
	}

	@Step
	public void verifyLeaseInformation() {
		// mmsviewleasespage.verifyViewLeasesLeaseInformation();
		System.out.println(
				"[MMS_View_LeasesPage : verifyViewLeasesLeaseInformation] Verifying Add Leases Information TAb as "
						+ LeaseAssignment.LEASES_VIEWLEASE_LEASEINFORMATION);
		WebElement wb = EY_FW_Utility
				.findElementByLocator(MMS_ViewLeasePageLocator.VIEWLEASES_LEASEINFORMATION_LOCATOR);
		String tab = wb.getText();
		MatcherAssert.assertThat(tab, equalTo(LeaseAssignment.LEASES_VIEWLEASE_LEASEINFORMATION));
	}

	@Step
	public void verifyUploadLeasePageTitle() {
		EY_FW_Utility.waitTillPageLoad(3);
		// mmsuploadlease.verifyUploadLeasePageTItle();
		System.out.println("[MMS_Upload_LeasesPage : verifyUploadLeasePageTItle] Verifying Upload Leases Page Title as "
				+ LeaseAssignment.LEASES_VIEWLEASE_PAGETITLE);
		MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(),
				equalTo(LeaseAssignment.UPLOAD_LEASES_PAGETITLE));
	}

	@Step
	public void verify_User_Page(String pageTitle) {
		try {
			EY_FW_Utility.waitTillPageLoad(5);
			MatcherAssert.assertThat(EY_FW_Utility.getCurrentPageTitle(), containsString(pageTitle));
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void show_Level(String invNo) {
		try {
			EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 1, invNo);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}

	@Step
	public void verify_Message(String message) {
		try {
			EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 5, message);
		} catch (Exception e) {
			Assert.assertTrue(false, e.getMessage());
		}
	}
	String colName1;
	
	@Step
	public void clickAction(String colName){
		colName1=colName;
		int rno = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 1, colName);
		EY_FW_Utility.clickMMSActions(MMS_MyCompanyInfoPageLocator.contacttable, MMS_UserManagerPageLocator.divison, rno,
				6);
	}
	
	@Step
	public void clickActionlist1(String actionList){
		int rno = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 1, colName1);
		EY_FW_Utility.clickMMSActionList(MMS_MyCompanyInfoPageLocator.contacttable, MMS_UserManagerPageLocator.actionlist1,
				MMS_UserManagerPageLocator.actionlist2, rno, 6, actionList);
	}
	
	@Step
	public void clickActionlist(String actionList){
		int rno = EY_FW_Utility.getTableRowNumber(MMS_MyCompanyInfoPageLocator.contacttable, 1, colName1);
		EY_FW_Utility.clickMMSActionList(MMS_MyCompanyInfoPageLocator.contacttable, MMS_UserManagerPageLocator.actionlist1,
				MMS_UserManagerPageLocator.actionlist2, 1, 6, actionList);
	}

	@Step
	public void clickActionsUploadLease() {
		mmsuploadlease.clickActionsFirstRow();
	}

	@Step
	public void clickActionListUploadLease(String s) {
		mmsuploadlease.clickActionList(s);
	}
}
