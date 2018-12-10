package com.ey.mms.cucumberStepsThemeLevel;

import com.ey.mms.pageobjects.MMS_ExpectedResult;
import com.ey.mms.pageobjects.MMS_Locators;
import com.ey.mms.pageobjects.mmsLocators.MMS_MyCompanyInfoPageLocator;
import com.ey.mms.serenitystepsThemelevel.MMS_ReportsTheme_SerenitySteps;
import com.ey.mms.serenitystepsThemelevel.expectedData.ReportHistory;
import com.ey.mms.util.EY_FW_Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ReportsThemes_StepDefs {

	@Steps
	MMS_ReportsTheme_SerenitySteps mmsthemesreportsserenitySteps;

	@Given("^User is on the Report History Page$")
	public void user_is_on_the_Report_History_Page() throws Throwable {
		// mmsthemesreportsserenitySteps.verifyHomePageTitle();
		// EY_FW_Utility.doWait(1000);
		// mmsthemesreportsserenitySteps.reportclickReportHistoryMenuBar();
		// EY_FW_Utility.doWait(1000);
		mmsthemesreportsserenitySteps.verifyReportHistoryPageTitle();
	}

	@Given("^User has clicked \"([^\"]*)\" button Under \"([^\"]*)\" column for a line item$")
	public void user_has_clicked_button_Under_column_for_a_line_item(String arrow, String actions) throws Throwable {
		mmsthemesreportsserenitySteps.reportclickReportHistoryAction();
		// EY_FW_Utility.doWait(3000);
	}

	@Given("^clicks on the \"([^\"]*)\" button to land on the \"([^\"]*)\" Pop Up$")
	public void clicks_on_the_button_to_land_on_the_Pop_Up(String button, String popupTitle) throws Throwable {
		mmsthemesreportsserenitySteps.reportclickReportHistoryActionDownload();
		// EY_FW_Utility.doWait(1000);
	}

	@When("^User clicks on the \"([^\"]*)\" button Under \"([^\"]*)\" column for a line item on the \"([^\"]*)\" Pop Up$")
	public void user_clicks_on_the_button_Under_column_for_a_line_item_on_the_Pop_Up(String button, String actions,
			String popup) throws Throwable {
		mmsthemesreportsserenitySteps.reportClickReportDownloadAction();
		// EY_FW_Utility.doWait(3000);
	}

	@When("^clicks on the Download button$")
	public void clicks_on_the_Download_button() throws Throwable {
		 mmsthemesreportsserenitySteps.reportclickReportDownloadActionDownload();
		// EY_FW_Utility.doWait(3000);
		mmsthemesreportsserenitySteps.reportClickCloseReportDownLoadPopUp();

	}

	@Then("^User lands on the Report History page$")
	public void user_lands_on_the_Report_History_page() throws Throwable {
		mmsthemesreportsserenitySteps.verifyReportHistoryPageTitle();
	}

	@Then("^Report gets downloaded in pdf form in the Downloads folder$")
	public void report_gets_downloaded_in_pdf_form_in_the_Downloads() throws Throwable {

	}

	@Given("^User clicks on report history$")
	public void user_clicks_on_report_history() {
		mmsthemesreportsserenitySteps.reportclickReportHistoryMenuBar();
		// EY_FW_Utility.doWait(3000);
	}

	@Given("^User lands on the Report History Page$")
	public void user_lands_on_the_Report_History_Page() throws Throwable {
		// mmsthemesreportsserenitySteps.reportclickReportHistoryMenuBar();
		// EY_FW_Utility.waitTillPageLoad(3);
		mmsthemesreportsserenitySteps.verifyReportHistoryPageTitle();
	}

	@Given("^clicks on the \"([^\"]*)\" button to lands on the \"([^\"]*)\" Pop Up$")
	public void clicks_on_the_button_to_lands_on_the_Pop_Up(String download, String actions) throws Throwable {

		mmsthemesreportsserenitySteps.reportclickReportHistoryActionDownload();
		// EY_FW_Utility.doWait(2000);

	}

	@When("^User clicks on the \"([^\"]*)\" button$")
	public void user_clicks_on_the_button(String button) throws Throwable {
		// EY_FW_Utility.doWait(3000); // wait for clickability
		mmsthemesreportsserenitySteps.reportClickCloseReportDownLoadPopUp();

	}

	@Then("^Report is not downloaded$")
	public void report_is_not_downloaded() throws Throwable {
		mmsthemesreportsserenitySteps.verifyReportHistoryPageTitle();
	}

	@Given("^User is on the \"([^\"]*)\" Page$")
	public void user_is_on_the_Page(String pageTitle) throws Throwable {
		mmsthemesreportsserenitySteps.reportclickReportHistoryMenuBar();
	}

	@Given("^has clicked the \"([^\"]*)\" button$")
	public void has_clicked_the_button(String button) throws Throwable {
		mmsthemesreportsserenitySteps.reportclickFilter();
	}

	@When("User enters the filter criteria such as Report Create Date '(.*)'")
	public void user_enters_the_filter_criteria_such_as(String createDate) throws Throwable {
		mmsthemesreportsserenitySteps.reportEnterCreateDate(createDate);
		// EY_FW_Utility.doWait(1000);
	}

	@When("^clicks on the Save Button of report history$")
	public void clicks_on_the_Save_Button_of_report_history() throws Throwable {
		mmsthemesreportsserenitySteps.reportClickFilterSave();
		// EY_FW_Utility.doWait(10000);
	}

	/*
	 * @Then("^User lands on the \"([^\"]*)\" page$") public void
	 * user_lands_on_the_page(String arg1) throws Throwable {
	 * mmsthemesreportsserenitySteps.verifyReportHistoryPageTitle();
	 * EY_FW_Utility.doWait(3000); }
	 */

	@Then("^User can see the filtered data in the grid$")
	public void user_can_see_the_filtered_data_in_the_grid() throws Throwable {
		// EY_FW_Utility.doWait(3000); // verification
		EY_FW_Utility.verifyTableColumnContain(MMS_MyCompanyInfoPageLocator.contacttable, 2,
				ReportHistory.DATEEXPECTED);
		// mmsthemesreportsserenitySteps.reportVerifyGridDescription();

	}

	@When("^clicks on the \"([^\"]*)\" Button of report history$")
	public void clicks_on_the_Button_of_report_history(String button) throws Throwable {

		mmsthemesreportsserenitySteps.reportClickFilterCancel();
	}

	@Then("^User cannot see the filtered data in the grid$")
	public void user_cannot_see_the_filtered_data_in_the_grid() throws Throwable {

	}

	@Then("^can see all the available data$")
	public void can_see_all_the_available_data() throws Throwable {
		mmsthemesreportsserenitySteps.verifyReportHistoryPageTitle();
	}

}
