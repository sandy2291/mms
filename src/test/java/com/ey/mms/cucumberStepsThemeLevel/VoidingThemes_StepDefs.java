package com.ey.mms.cucumberStepsThemeLevel;

import java.util.List;

import com.ey.mms.serenitystepsThemelevel.MMS_BillingTheme_SerenitySteps;

import com.ey.mms.serenitystepsThemelevel.MMS_VoidingTheme_SerenitySteps;
import com.ey.mms.util.EY_FW_Utility;
import com.ey.mms.util.PropertyReader;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class VoidingThemes_StepDefs {
	
	
	
	@Steps
	MMS_BillingTheme_SerenitySteps mmsbillingtheme;
	
	
	@Steps
	MMS_VoidingTheme_SerenitySteps voidingtheme;

	List<List<String>> data;

	
	
	@Before("@MMS_Invoicing_InvoiceEditable_SecondOpt")
	public void beforeScenario() {
		System.out.println("Inside before");
		//String path1=System.getProperty("user.dir")+"\\target\\logs\\";
		String path2 = new PropertyReader().readProperty("logfile6"); 
		System.setProperty("logfile.name",path2+".html"); 
	}
	
	@Given("^User has voided an invoice \"([^\"]*)\" for a customer \"([^\"]*)\" with the (\\d+)nd option$")
	public void user_has_voided_an_invoice_for_a_customer_with_the_nd_option(String arg1, String arg2, int arg3) throws Throwable {
		voidingtheme.clickBillingMainMenu();
	}

	@Then("^user can see the customer listed on the grid$")
	public void user_can_see_the_customer_listed_on_the_grid() throws Throwable {
		voidingtheme.verifyBilledpartyforSecondOption();
	    //EY_FW_Utility.doWait(2000);
	   voidingtheme.clickActionforSecondOption();
	   //EY_FW_Utility.doWait(1000);
	   voidingtheme.clickActionforViewDetailsforSecondOpt();
	   //EY_FW_Utility.doWait(2000);
	}
    
	@And("On click of the view the user will see the amount of the invoice which was voided with second option")
	public void user_can_verify_Amount_for_Invoice_voided_With_Second_Option(){
		voidingtheme.verifyCustomerAmountforSecondOption();
		//EY_FW_Utility.doWait(2000);
		voidingtheme.clickCloseOfViewDetails();
		//EY_FW_Utility.doWait(2000);
	}
	
	@Given("has selected the customer for Second option")
	public void user_has_selected_Billed_party_for_SecondOption(){
		voidingtheme.clickCheckboxforSecondOpt();
		
	}
	
	@Then("a dialogue window pops up with the same invoice number appears for Second Option")
	public void user_can_verify_DialogueBox_with_Same_Invoice_Number(){
		voidingtheme.verifyGenerateInvoiceDailougeforSecondOpt();
		EY_FW_Utility.doWait(3000);
	}
	
	@Given("^User has already clicked on the Generate invoice number for the customer \"([^\"]*)\"$")
	public void user_has_already_clicked_on_the_Generate_invoice_number_for_the_customer(String arg1) throws Throwable {
		//voidingtheme.clickCheckboxforSecondOpt();
	}

	@When("^user clicks the text area for the invoice \"([^\"]*)\"$")
	public void user_clicks_the_text_area_for_the_invoice(String arg1) throws Throwable {
	  boolean b= true;
	}

	@Then("^it should be editable$")
	public void it_should_be_editable() throws Throwable {
	    boolean b= true;
	}
	
	@When("User changes the invoice DEMO567 to '(.*)'")
	public void user_changes_the_invoice(String invoiceNum) throws Throwable {
		voidingtheme.enterInvoiceNum(invoiceNum);
	}
	
	@Given("^User has already clicked on the Generate invoice\\(s\\) button after changing the details of the invoice \"([^\"]*)\" for Customer \"([^\"]*)\"$")
	public void user_has_already_clicked_on_the_Generate_invoice_s_button_after_changing_the_details_of_the_invoice_for_Customer(String arg1, String arg2) throws Throwable {
		voidingtheme.clickBilling();
		voidingtheme.clickInvoiceHistory();
		EY_FW_Utility.doWait(2000);
		voidingtheme.clickCloseInvoiceDate();
		EY_FW_Utility.doWait(2000);
	}
	
	@Then("User will find the invoice number on the invoice history Grid")
	public void user_finds_the_Invoice_on_the_Invoice_History_Grid(){
		 voidingtheme.verifyEditedInvoiceNumforSecondOpt();
		 EY_FW_Utility.doWait(2000);
	}
    
	
	@Then("^the void status will be \"([^\"]*)\" with a tool tip \\.$")
	public void the_void_status_will_be_with_a_tool_tip(String arg1) throws Throwable {
	    voidingtheme.verifyGeneratedInvoiceStatusforSecondOpt();
	}
	
	
	@When("^Searches for the old invoice #  by Entering Invoice Number field '(.*)' to '(.*)'$")
	public void searches_for_the_old_invoice_by_Entering_Invoice_Number_field(String invc1, String invc2) throws Throwable {
	    //voidingtheme.clickFilter();
	    voidingtheme.enterInvoiceFrom(invc1);
	    EY_FW_Utility.doWait(1000);
	    voidingtheme.enterInvoiceTo(invc2);
	    EY_FW_Utility.doWait(1000);
	    voidingtheme.clickFilterSave();
	    EY_FW_Utility.doWait(2000);
	}

	@Then("^Void statu will be \"([^\"]*)\"$")
	public void void_statu_will_be(String arg1) throws Throwable {
	    voidingtheme.verifyEditedInvoiceStatusforSecondopt();
	    EY_FW_Utility.doWait(2000);
	}
	

	
	
	

	@Given("^User has voided an invoice \"([^\"]*)\" for a customer \"([^\"]*)\"$")
	public void user_has_voided_an_invoice_for_a_customer(String arg1, String arg2) throws Throwable {
	   voidingtheme.clickBillingMainMenu();
	   
	}
	
	@When("^user navigates to invoicing under billing menu$")
	public void user_navigates_to_invoicing_under_billing_menu() throws Throwable {
		voidingtheme.clickInvoicingSubMenu();
		  EY_FW_Utility.waitTillPageLoad(5000);
	}
	
	@Then("^user will see the customer listed on the grid$")
	public void user_will_see_the_customer_listed_on_the_grid() throws Throwable {
	      voidingtheme.verifyVoidedCustomer();
	      EY_FW_Utility.doWait(2000);
	}
	
	@Then("^On click of the view the user will see the amount of the invoice which was voided\\.$")
	public void on_click_of_the_view_the_user_will_see_the_amount_of_the_invoice_which_was_voided() throws Throwable {
	    voidingtheme.clickAction();
	    EY_FW_Utility.doWait(2000);
	    voidingtheme.clickViewDetails();
	    EY_FW_Utility.doWait(4000);
	    voidingtheme.verifyCustomerAmount();
	    EY_FW_Utility.doWait(2000);
	    voidingtheme.clickCloseOfViewDetails();
	    
	}
	
	@Given("^user is on the invoicing grid$")
	public void user_is_on_the_invoicing_grid() throws Throwable {
	    boolean b= true;
	}
	
	@Given("^has selected the customer$")
	public void has_selected_the_customer() throws Throwable {
	   //voidingtheme.clickCloseOfViewDetails();
	   EY_FW_Utility.doWait(2000);
	   voidingtheme.clickCheckBoxforFirstOpt();
	}
	
	@When("^user clicks the button \"([^\"]*)\"$")
	public void user_clicks_the_button(String arg1) throws Throwable {
	    voidingtheme.clickGenerateInvoice();
	    EY_FW_Utility.doWait(40000);
	}
	
	@Then("^a dialogue window pops up with the same invoice number appearing$")
	public void a_dialogue_window_pops_up_with_the_same_invoice_number_appearing() throws Throwable {
	    voidingtheme.verifyGenerateInvoiceDailouge();
	    EY_FW_Utility.doWait(2000);
	}
	
	@Then("^Invoice number is editable$")
	public void invoice_number_is_editable() throws Throwable {
	   voidingtheme.verifyInvoiceEditBox();
	   EY_FW_Utility.doWait(2000);
	   voidingtheme.clickCancelOfGenerateInvoices();
	}
	
	@Given("^User has already clicked on the Generate invoice number \"([^\"]*)\" for the customer \"([^\"]*)\"$")
	public void user_has_already_clicked_on_the_Generate_invoice_number_for_the_customer(String arg1, String arg2) throws Throwable {
	  
		boolean b=true;
	}
	
	@Given("^dialogue already poped up with the same invoice number$")
	public void dialogue_already_poped_up_with_the_same_invoice_number() throws Throwable {
	    boolean b=true;
	}
	
	@Given("^user has clicked on the text area for the invoice number$")
	public void user_has_clicked_on_the_text_area_for_the_invoice_number() throws Throwable {
	   voidingtheme.clickGenerateInvoice();
	   EY_FW_Utility.doWait(4000);
	}
	
	@When("User changes the invoice VOIDOPT1 to '(.*)'")
	public void user_changes_the_invoice_number_to(String invoiceNum) throws Throwable {
	   voidingtheme.enterInvoiceNum(invoiceNum);
	}

	
	@When("clicks on Generate Invoice button")
	public void clicks_on_Generate_Invoice_S() throws Throwable {
	   voidingtheme.clickGenerateInvoicesBtn();
	}
	
	/*@Then("^Success Message appears on the right on the activity summary page$")
	public void success_Message_appears_on_the_right_on_the_activity_summary_page() throws Throwable {
	  voidingtheme.clickVoidInvoiceNotification();
	  EY_FW_Utility.doWait(2000);
	  //voidingtheme.verifyGenerateInvoiceSucessMsg();
	  //EY_FW_Utility.doWait(4000);
		
	}
	
	@Then("^the customer will disappear from the grid$")
	public void the_customer_will_disappear_from_the_grid() throws Throwable {
	   voidingtheme.clickVoidInvoiceNotification();
		
	}*/
	
	@Given("^User has already clicked on the Generate invoice\\(s\\) button after changing the details of the invoice \"([^\"]*)\"$")
	public void user_has_already_clicked_on_the_Generate_invoice_s_button_after_changing_the_details_of_the_invoice(String arg1) throws Throwable {
		
	}
	
	@When("^User navigates to Invoice history page under Billing$")
	public void user_navigates_to_Invoice_history_page_under_Billing() throws Throwable {
		 voidingtheme.clickBilling();
		 EY_FW_Utility.doWait(1000);
	    voidingtheme.clickInvoiceHistory();
	    EY_FW_Utility.doWait(2000);
	    voidingtheme.clickCloseVoidStatus();
	    EY_FW_Utility.doWait(2000);
	    
	}
	
	@Then("^User will find the invoice number on the invoice history Grid\\.$")
	public void user_will_find_the_invoice_number_on_invoice_history_Grid() throws Throwable {
	    voidingtheme.verifyEditedInvoiceNum();
	}
	@Given("^User has already clicked on the Generate invoice\\(s\\) button after changing the detail of the invoice \"([^\"]*)\"$")
	public void user_has_already_clicked_on_generate_invoice(String arg1){
		 voidingtheme.clickBilling();
		 EY_FW_Utility.doWait(1000);
	    voidingtheme.clickInvoiceHistory();
	    EY_FW_Utility.doWait(2000);
	   
	}
	
	@Given("^Invoice generation was successful$")
	public void invoice_generation_was_successful() throws Throwable {
		   voidingtheme.clickCloseVoidStatus();
		   EY_FW_Utility.doWait(2000);
		   voidingtheme.clickCloseInvoiceDate();
		   EY_FW_Utility.doWait(2000);
	    
	}
	
	@When("^User clicks on filter$")
	public void user_clicks_on_filter() throws Throwable {
	   voidingtheme.clickFilter();
	   EY_FW_Utility.doWait(1000);
	   
		   
	}
	
	@When("Searches for the old invoice by Entering Invoice Number field '(.*)' to '(.*)'")
	public void search_invoice_generated(String invc1, String invc2) throws Throwable {
		   
		   voidingtheme.enterInvoiceFrom(invc1);
		   EY_FW_Utility.doWait(1000);
		   voidingtheme.enterInvoiceTo(invc2);
		   EY_FW_Utility.doWait(1000);
		   voidingtheme.clickFilterSave();
		   EY_FW_Utility.doWait(2000);
	}
	
	@Then("^Void status will be \"([^\"]*)\"$")
	public void void_status_will_be(String arg1) throws Throwable {
		voidingtheme.verifyEditedInvoiceVoidStatus();
	    EY_FW_Utility.doWait(2000);
	}
	
	@Given("^User is already logged in MMS home page$")
	public void user_is_already_logged_in_MMS_home_page() throws Throwable {
	    
	}

	@Given("User has clicked on Billing")
	public void user_has_clicked_on_Billing() throws Throwable {
	   voidingtheme.clickBillingMainMenu();
	}

	@When("^user clicks on the \"([^\"]*)\" sub menu$")
	public void user_clicks_on_the_sub_menu(String arg1) throws Throwable {
	   voidingtheme.clickInvoiceHistorySubMenu();
	   EY_FW_Utility.doWait(3000);
	}

	@Then("^user will find the voiding button enabled by default$")
	public void user_will_find_the_voiding_button_enabled_by_default() throws Throwable {
	  voidingtheme.verifyVoidInvoice();
	  //EY_FW_Utility.doWait(2000);
	  /*voidingtheme.clickVoidInvoiceBtn();
	  voidingtheme.verifyPopup();
	  EY_FW_Utility.doWait(5000);
	  voidingtheme.acceptAlert();
	  EY_FW_Utility.doWait(2000);*/
	}

	@Then("^user will find the unvoiding button enabled by default$")
	public void user_will_find_the_unvoiding_button_enabled_by_default() throws Throwable {
	   voidingtheme.verifyUnvoidInvoice();
	   //EY_FW_Utility.doWait(2000);
	  /* voidingtheme.clickUnvoidInvoiceBtn();
	   voidingtheme.verifyPopup();
	   EY_FW_Utility.doWait(5000);
	   voidingtheme.acceptAlert();
	   EY_FW_Utility.doWait(2000);*/
	}

	@Then("^user will find the bulk billing button enabled by default$")
	public void user_will_find_the_bulk_billing_button_enabled_by_default() throws Throwable {
	   voidingtheme.verifybulkBilling();
	   //EY_FW_Utility.doWait(2000);
	   /*voidingtheme.clickBulkBillingBtn();
	   voidingtheme.verifyPopup();
	   //EY_FW_Utility.doWait(5000);
	   voidingtheme.acceptAlert();
	   //EY_FW_Utility.doWait(2000);
*/	   
	}

	@Then("^user will find the remove from combined Billing button enabled by default$")
	public void user_will_find_the_remove_from_combined_Billing_button_enabled_by_default() throws Throwable {
	   voidingtheme.verifyRemoveFromCombinedBilling();
	   EY_FW_Utility.doWait(2000);
	   /*voidingtheme.clickRemovefromCombinedBilling();
	   voidingtheme.verifyPopup();
	   //EY_FW_Utility.doWait(5000);
	   voidingtheme.acceptAlert();
	   //EY_FW_Utility.doWait(2000);
*/	}

	@Then("^user will find the send to combined Billing button enabled by default$")
	public void user_will_find_the_send_to_combined_Billing_button_enabled_by_default() throws Throwable {
		voidingtheme.verifySendToCombinedBilling();
		EY_FW_Utility.doWait(2000);
		/*voidingtheme.clickSendtoCombinedBilling();
		voidingtheme.verifyPopup();
		//EY_FW_Utility.doWait(5000);
		 voidingtheme.acceptAlert();
		 //EY_FW_Utility.doWait(2000);
*/			
	   
	}
	
	@Given("^User has clicked on Billing from the menu$")
	public void user_has_clicked_on_Billing_from_the_menu() throws Throwable {
	  voidingtheme.clickBilling();
	  EY_FW_Utility.doWait(1000);
		
	}
	
	@When("User click on the Invoice History link option under the Billing")
	public void user_click_Invoicehistory_Submenu() throws Throwable {
		
		voidingtheme.clickInvoiceHistory();
	}

	@When("^user has selected an invoice which is not voided 'DEMO(\\d+)'$")
	public void user_has_selected_an_invoice_which_is_not_voided_Automatea(int arg1) throws Throwable {
	   
		voidingtheme.clickCloseInvoiceDate();
		voidingtheme.clickCloseVoidStatus();
		voidingtheme.clickCheckboxa1();
	}

	@When("^user clicks on the \"([^\"]*)\"$")
	public void user_clicks_on_the(String arg1) throws Throwable {
	    voidingtheme.clickUnvoidBtn();
	    EY_FW_Utility.doWait(3000);
	}

	@Then("^User will get a dialogue with the message \"([^\"]*)\" with a OK button$")
	public void user_will_get_a_dialogue_with_the_message_with_a_OK_button(String arg1) throws Throwable {
	    voidingtheme.verifySingleInvoiceUnvoidError();
	    EY_FW_Utility.doWait(2000);
	}

	@Then("^clicking OK, should remove the selection made on the grid\\.$")
	public void clicking_OK_should_remove_the_selection_made_on_the_grid() throws Throwable {
	   voidingtheme.clickOkPop();
	   EY_FW_Utility.doWait(2000);
	}

	@Given("^user has selected multiple invoices which is not voided$")
	public void user_has_selected_multiple_invoices_which_is_not_voided() throws Throwable {
	   //voidingtheme.clickCloseVoidStatus();
	   voidingtheme.clickCheckboxa1();
	   voidingtheme.clickCheckboxb1();
	   //voidingtheme.clickCheckboxc1();
	   
}
	
	

	@Then("User will get a dialogue with the message Invoices can't be unvoided as it is not voided with a OK button")
	public  void user_will_get_a_dialogue_with_the_message_with_a_OK_button(){
		voidingtheme.verifyMultipleInvoiceUnvoidError();
		 EY_FW_Utility.doWait(2000);
	}

	@Given("^user has selected multiple invoices which is not voided and few are voided$")
	public void user_has_selected_multiple_invoices_which_is_not_voided_and_few_are_voided() throws Throwable {
	    //voidingtheme.clickCloseVoidStatus();
	    //EY_FW_Utility.doWait(2000);
		voidingtheme.clickCheckboxa1();
		EY_FW_Utility.doWait(1000);
	    voidingtheme.clickCheckboxb1();
	    //EY_FW_Utility.doWait(1000);
		//voidingtheme.clickCheckboxc1();
		EY_FW_Utility.doWait(1000);
		voidingtheme.clickCheckboxaCC1();
	}

	@Then("User will get a dialogue with the message Invoices can't be unvoided as it not voided with a OK button")
	public void user_will_get_a_dialogue_with_the_message_Invoice_s_can_t_be_unvoided_as_it_is_not_voided_with_a_OK() throws Throwable {
	   voidingtheme.verifyCombinedInvoiceUnvoidError();
	   EY_FW_Utility.doWait(2000);
	}

	@Then("^Rest of the invoices will still be selected\\.$")
	public void rest_of_the_invoices_will_still_be_selected() throws Throwable {
	   voidingtheme.verifyInvoiceCheckedForUnvoid();
	   EY_FW_Utility.doWait(2000);
	}
	
	@Given("^User has selected an Invoice which is voided and no changes are made to this Invoice$")
	public void user_has_selected_an_Invoice_which_is_voided_and_no_changes_are_made_to_this_Invoice() throws Throwable {
	  
	    voidingtheme.clickCheckBoxfor333333();
	    EY_FW_Utility.doWait(1000);
	    voidingtheme.clickCheckboxaCC1();
	}

	@When("^User is able to unvoid the Invoice$")
	public void user_is_able_to_unvoid_the_Invoice() throws Throwable {
	   /* voidingtheme.clickUnvoidBtn();*/
		 voidingtheme.clickOkButtonForUnvoidInvoicePopup();
		 EY_FW_Utility.waitForProgressWindowToDisappear(30);
	    
	    
	}

	@Then("^can see the Voiding status as blank$")
	public void can_see_the_Voiding_status_as_blank() throws Throwable {
       
         voidingtheme.verifyUnvoidstatus();
         EY_FW_Utility.doWait(2000);
       
	}
	
	@Given("^User has selected  invoices which has been sent to combined billing$")
	public void user_has_selected_invoices_which_has_been_sent_to_combined_billing(DataTable invoices)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		data = invoices.raw();
		for (List<String> tabledata : data) {
			voidingtheme.selectInvoice(tabledata.get(0));
		}
		// voidingtheme.selectInvoice(data.get(0).get(0));
		// voidingtheme.selectInvoice(data.get(1).get(0));

	}

	@Then("^generates an error message \"([^\"]*)\"$")
	public void generates_an_error_message(String message) throws Throwable {
		voidingtheme.VerifyErrorMsgAlreadySentToCombinedBilling(message);
		// EY_FW_Utility.doWait(3000);
		// voidingtheme.clickVoidErrorforCombinedBillingInvoice();
	}

	@Then("^clicks on ok of failed invoice popup$")
	public void clicks_on_ok_of_failed_invoice_popup() throws Throwable {
		voidingtheme.clickOkMultipleVoidFailure();
	}

	@Then("^clicks on ok of failed Invoice Popup$")
	public void clicks_on_ok_of_failed_Invoice_Popup() throws Throwable {
		voidingtheme.clickOksingleVoidFailure();
	}

	@Then("^User lands to Invoice History Page\\.$")
	public void user_lands_to_Invoice_History_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		mmsbillingtheme.verifyInvoiceHistoryPageTitle();
	}

	/*
	 * @Then("^selection was removed from grid$") public void
	 * selection_was_removed_from_grid() throws Throwable { for(List<String>
	 * tabledata:data){ voidingtheme.isInvoiceNotSelected(tabledata.get(0)); }
	 * //voidingtheme.isInvoiceNotSelected(data.get(0).get(0));
	 * //voidingtheme.isInvoiceNotSelected(data.get(1).get(0)); }
	 */

	@Then("^there will be notification on the page$")
	public void there_will_be_notification_on_the_page() throws Throwable {
		voidingtheme.checkPopupNotifications();
	}

	@Then("^error message will be shown in activity summary panel as \"([^\"]*)\"$")
	public void error_message_will_be_shown_in_activity_summary_panel_as(String actualMessage) throws Throwable {
		voidingtheme.verifyPopupErrorMessage(actualMessage);
	}

	@Then("^selection was removed for failed invoice$")
	public void selection_was_removed_for_failed_invoice() throws Throwable {
		voidingtheme.isInvoiceNotSelected(data.get(0).get(0));
		voidingtheme.isInvoiceSelected(data.get(1).get(0));
	}

	@When("^clicks on filter button$")
	public void clicks_on_filter_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		voidingtheme.clickFilterButton();
	}

	@When("^enters invoice date as \"([^\"]*)\"$")
	public void enters_invoice_date_as(String fromdate) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		voidingtheme.enterInvoiceDate(fromdate);
	}

	@When("^Void status as \"([^\"]*)\"$")
	public void void_status_as(String status) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		voidingtheme.selectVoidStatus(status);
	}

	/*
	 * @When("^selects invoice") public void selects_invoice(DataTable invoices)
	 * throws Throwable { // Write code here that turns the phrase above into
	 * concrete actions // For automatic transformation, change DataTable to one
	 * of // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>. // E,K,V
	 * must be a scalar (String, Integer, Date, enum etc) data = invoices.raw();
	 * voidingtheme.selectInvoice(data.get(0).get(0)); }
	 */
	@When("^User selects invoice")
	public void user_selects_invoice(DataTable invoices) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		data = invoices.raw();
		// List<String> tabledata;
		for (List<String> tabledata : data) {
			voidingtheme.selectInvoice(tabledata.get(0));
		}
		// voidingtheme.selectInvoice(data.get(0).get(0));
		// voidingtheme.selectInvoice(data.get(1).get(0));
	}

	/*
	 * @When("^selects invoice with status as") public void
	 * selects_invoice_with_status_as(DataTable invoices) throws Throwable { //
	 * Write code here that turns the phrase above into concrete actions // For
	 * automatic transformation, change DataTable to one of // List<YourType>,
	 * List<List<E>>, List<Map<K,V>> or Map<K,V>. // E,K,V must be a scalar
	 * (String, Integer, Date, enum etc) data = invoices.raw();
	 * voidingtheme.selectInvoicewithStatus(data.get(0).get(1)); }
	 */

	@Then("^popup displays generates error message \"([^\"]*)\"$")
	public void popup_displays_generates_error_message(String message) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		voidingtheme.invoiceValidationErrorpopupMessageFirst(message);
	}

	@Then("^popup displays generates error message as \"([^\"]*)\"$")
	public void popup_displays_generates_error_message_as(String message) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		voidingtheme.failedtoUnvoidInvoiceMessage(message);
	}

	@Then("^popup displays another error message \"([^\"]*)\"$")
	public void popup_displays_another_error_message(String message) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		voidingtheme.popupErrorMessageSecond(message);
	}

	@Then("^invoice was deselected from grid$")
	public void invoice_was_deselected_from_grid() throws Throwable {
		for (List<String> tabledata : data) {
			voidingtheme.isInvoiceNotSelected(tabledata.get(0));
		}
		// voidingtheme.isInvoiceNotSelected(data.get(0).get(0));
	}

	@Then("^modified invoices remains selected$")
	public void modified_invoices_remains_selected() throws Throwable {
		voidingtheme.isInvoiceSelected(data.get(2).get(0));
		
	}
	
	@Then("^modified invoices remain selected$")
	public void modified_invoices_remain_selected() throws Throwable {
		voidingtheme.isInvoiceSelected(data.get(2).get(0));
		voidingtheme.isInvoiceSelected(data.get(3).get(0));
	}

	@Then("^clicks on ok$")
	public void clicks_on_ok() throws Throwable {
		voidingtheme.clickOkPop();
	}
	
	@Then("^valid invoices are selected in the grid$")
	public void valid_invoices_selected_in_the_grid() throws Throwable {
		voidingtheme.verifyInvoiceCheckedForUnvoid();
		   EY_FW_Utility.doWait(2000);
	}
	
	@Then("^user clicks on the \"([^\"]*)\" button$")
	public void user_clicks_on_the_button(String button) throws Throwable {
		
		voidingtheme.clickremoveCB();
	}

	@Then("^success message will be shown in activity summary panel as \"([^\"]*)\"$")
	public void sucess_message_will_be_shown_in_activity_summary_panel_as(String actualMessage) throws Throwable {
		voidingtheme.verifyPopupErrorMessage(actualMessage);
	}

	@Then("^User verify status updated date with latest$")
	public void user_verify_status_updated_date_with_latest() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		voidingtheme.verifyUpdatedDate();
	}
	
	@Then("^user verify status not populated$")
	public void user_verify_status_not_populated() throws Throwable {
		voidingtheme.verifyEmptyDate();
	}
	

	@Then("^rest of invoices still be selected$")
	public void rest_of_invoices_still_be_selected() throws Throwable {
		 voidingtheme.isInvoiceSelected(data.get(2).get(0));
	}
	
	@Then("^user clicks on the send to combined billing button$")
	public void user_clicks_on_sendto_CB_button() throws Throwable {
		
		voidingtheme.clicksendToCB();
	}
	
	@Then("^remaining invoices remain selected$")
	public void remaining_invoices_remain_selected() throws Throwable {
		voidingtheme.isInvoiceNotSelected(data.get(2).get(0));
		voidingtheme.isInvoiceNotSelected(data.get(3).get(0));
	}
	

	@Then("^user lands on the Invoice History page$")
	public void user_lands_on_the_Invoice_History_page() throws Throwable {
	    voidingtheme.verifyInvoiceHistoryPageTitle();
	}
     
	@Given("user has selected an invoice which is voided")
	public void user_selects_an_invoice_which_is_voided() throws Throwable {
		voidingtheme.clickCloseInvoiceDate();
		voidingtheme.clickcloseVoidStatus();
	    EY_FW_Utility.doWait(2000);
		voidingtheme.selectFirstInvoice();
	}
	
	
	@When("^user click on the \"([^\"]*)\"$")
	public void user_clicks_on_the_void_invoice(String arg1) throws Throwable {
	    
		voidingtheme.clickVoidInvoice();
		EY_FW_Utility.doWait(2000);
	}

	@Then("^user will get dialogue with the message \"([^\"]*)\" with a OK button$")
	public void user_will_get_a_dialogue_with_the_message_with_a_OK_Button(String arg1) throws Throwable {
	    voidingtheme.verifyErrorPopSingleVoidedInvoice();   
	    EY_FW_Utility.doWait(2000);
	
	}

	@Then("^clicking OK, should remove selection made on the grid\\.$")
	public void clicking_OK_should_remove_the_selection_made_on_the_Grid() throws Throwable {
	    voidingtheme.clickOk();
	    EY_FW_Utility.doWait(1000);
	}
     
	@Given("user has selected multiple invoices which are voided")
	public void user_has_selected_multiple_invoices_are_voided() throws Throwable {
		voidingtheme.selectFirstInvoice();
		  EY_FW_Utility.doWait(1000);
		  voidingtheme.selectSecondInvoice();
		 /* EY_FW_Utility.doWait(1000);
		  voidingtheme.selectThirdInvoice();
		  EY_FW_Utility.doWait(1000);*/
	}
	
	

	@Then("^User gets dialogue with message \"([^\"]*)\" with a OK button$")
	public void user_will_get_a_dialogue_with_the_message_with_a_button(String arg1) throws Throwable {
	   voidingtheme.verifyErrorPopMultipleVoidedInvoice();
	   EY_FW_Utility.doWait(2000);
	  
	}
	
	@Given("user has selected multiple invoices which is voided and few are not voided")
	public void user_has_selected_multiple_invoices_which_is_voided_and_few_not_voided() throws Throwable {
		voidingtheme.selectFirstInvoice();
		  EY_FW_Utility.doWait(1000);
		  voidingtheme.selectSecondInvoice();
		  EY_FW_Utility.doWait(1000);
		 /* voidingtheme.selectThirdInvoice();
		  EY_FW_Utility.doWait(1000);*/
		  voidingtheme.selectFourthInvoice();
		  EY_FW_Utility.doWait(1000);
	}

	/*@Then("^User will get dialogue with the message  \"([^\"]*)\" with a OK button$")
	public void verify_combined_error_msg(String arg1){
		voidingtheme.VerifyErrorPopMultipleCombiInvoice();
		EY_FW_Utility.doWait(2000);
		
	}*/
	
	@Then("^User will get the dialogue with the message \"([^\"]*)\" with a OK button$")
	public void user_will_get_dialogue_with_the_message_with_a_OK_button(String arg1) throws Throwable {
		voidingtheme.VerifyErrorPopMultipleCombiInvoice();
		EY_FW_Utility.doWait(2000);
	}

	
	
	@Then("^Rest of the invoice will still be selected\\.$")
	public void rest_of_the_invoices_will_still_be_Selected() throws Throwable {
	    voidingtheme.verifyCheckforInvoiceSelection();
	    EY_FW_Utility.doWait(2000);
	}
	
	@Given("^a customer is selected which was already voided by third option$")
	public void a_customer_is_selected_which_was_already_voided_by_third_option(DataTable customer) throws Throwable {
		data = customer.raw();
		// List<String> tabledata;
		for (List<String> tabledata : data) {
			voidingtheme.selectInvoice(tabledata.get(0));
		}
	}
	

}
