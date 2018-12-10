package com.ey.mms.cucumberStepsThemeLevel;


import com.ey.mms.serenitystepsThemelevel.MMS_VoidingTheme_SerenitySteps;
import com.ey.mms.util.EY_FW_Utility;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class InvoiceHistory_StepDefs {
	
	@Steps
	MMS_VoidingTheme_SerenitySteps mmsinvoicehistory;
   
	@Given("user is logges in as '(.*)' and '(.*)' as password")
	public void user_is_logged_in_as_and_as_password(String username, String password) throws Throwable {
		mmsinvoicehistory.opensMMSLoginPage();
		mmsinvoicehistory.enterUserId(username);
		mmsinvoicehistory.enterPassword(password);
	}
	
	@When("user Click on MMS Login Button")
	public void user_Clicks_on_MMS_Login_Button() throws Throwable {

		mmsinvoicehistory.clickLoginButton();
		//EY_FW_Utility.doWait(5000);
	}
	
	@And("User clicks on the Invoice History link option under the Billing")
	public void user_clicks_on_Invoice_History_link_option_under_Billing(){
		mmsinvoicehistory.clickBilling();
		mmsinvoicehistory.clickInvoiceHistory();
	}
	
	@Then("User will navigate to the Invoice history screen with a grid")
	public void User_will_navigate_to_the_Invoice_History_Screen_With_a_grid(){
		mmsinvoicehistory.verifyInvoiceHistoryPage();
		//EY_FW_Utility.doWait(2000);
	}
	
	@And("User will see a new button for Void Invoice and Unvoid Invoice")
	public void User_will_see_a_new_button_for_Void_Invoice_and_Unvoid_Invoice(){
		mmsinvoicehistory.verifyVoidButton();
		//EY_FW_Utility.doWait(3000);
		mmsinvoicehistory.verifyUnvoidButton();
		//EY_FW_Utility.doWait(5000);
	}
	
	@And("Grid shows a new column added Void Status")
	public void grid_show_a_new_column_add_void_status(){
		mmsinvoicehistory.verifyVoidStatus();
		//EY_FW_Utility.doWait(2000);
	}
	
	@Given("User is already on the Invoice history screen")
	public void user_is_already_on_the_InvoiceHistory_Screen(){
		mmsinvoicehistory.clickBilling();
		//EY_FW_Utility.doWait(2000);
		mmsinvoicehistory.clickInvoiceHistory();
		EY_FW_Utility.doWait(3000);
	}
	
	@And("has already Generated an Invoice")
	public void has_already_generated_an_Invoice(){
		
	}
	
	@And("User has already checked the box against that invoice number")
	public void user_has_already_Checked_the_box_against_that_invoice_number(){
		mmsinvoicehistory.clickCloseVoidStatus();
		EY_FW_Utility.doWait(2000);//need wait to perform alternate operation
		mmsinvoicehistory.clickCloseInvoiceDate();
		EY_FW_Utility.doWait(3000);
		mmsinvoicehistory.clickInvoiceCheckBox();
		
	}
	
	@When("user clicks on the void invoice button")
	public void user_clicks_on_the_void_invoice_button(){
		
		mmsinvoicehistory.clickVoidInvoiceBtn();
		EY_FW_Utility.doWait(4000);
		
	}
	
	@Then("A dialogue appears with 3 options.")
	public void dailoge_appears_with_options(){
		
	}
	
	@And("the tile of the dialogue is Void invoice")
	public void the_title_of_the_dailogue_is_void_invoice(){
		EY_FW_Utility.doWait(4000);
		mmsinvoicehistory.verifyVoidInvoiceDialogeBox();
		
	}
	
	@And("Three radio buttons are present")
	public void three_radio_buttons_are_present(){
		
	}
	
	@And("First radio button has the message I'm correcting this invoice.It has not been processed by Railinc or submitted to anyone and I will be reusing the same invoice number.")
	public void firstvoidInvoiceMsg(){
		mmsinvoicehistory.verifyVoidInvoiceFirstOption();
		//EY_FW_Utility.doWait(2000);
	}
	
	@And("Second radio button has the message I'm resubmitting this invoice. I have already sent it to the Data exchange or my customer and need to submit a revised invoice with the same invoice number")
	public void secondVoidInvoiceMsg(){
		mmsinvoicehistory.verifyVoidInvoiceSecondOption();
		//EY_FW_Utility.doWait(1000);
	}
	
	@And("Third radio button has the message I'm resubmitting this invoice. I have already sent it to the Data exchange or my customer and need to submit a revised invoice with a new invoice number")
    public void thirdVoidInvoiceMSg(){
		mmsinvoicehistory.verifyVoidInvoiceThirdOption();
		//EY_FW_Utility.doWait(2000);
	}
    
   @And("two buttons - cancel and void invoice is present")
   public void buttons_present_on_dialogebox(){
	   mmsinvoicehistory.verifyVoidInvoiceCancel();
	   //EY_FW_Utility.doWait(2000);
	   mmsinvoicehistory.verifyVoidInvoiceBtn();
	   //EY_FW_Utility.doWait(1000);
	   mmsinvoicehistory.clickCancelVoidInvoiceDailogue();
	   
   }
   
   @Given("^User has already checked the box against the invoice \"([^\"]*)\"$")
   public void user_has_already_checked_the_box_against_the_invoice(String arg1) throws Throwable {
       
      /* EY_FW_Utility.doWait(2000);
       mmsinvoicehistory.clickCloseVoidStatus();
       EY_FW_Utility.doWait(3000);
       mmsinvoicehistory.clickCloseInvoiceDate();
       EY_FW_Utility.doWait(2000);*/
	   mmsinvoicehistory.clikcCheckBoxFirstOption();
	   
   }

   @Given("^Invoice has not bee sent to combined billing$")
   public void invoice_has_not_bee_sent_to_combined_billing() throws Throwable {
      
   }

   @Given("^\"([^\"]*)\" button is clicked$")
   public void button_is_clicked(String arg1) throws Throwable {
       mmsinvoicehistory.clickVoidInvoiceBtn();
       EY_FW_Utility.doWait(4000);
   }

   @Given("Dialogue shows with three options")
   public void dialogue_is_shown_with_three_options() throws Throwable {
      mmsinvoicehistory.verifyVoidInvoiceDialogeBox();
      EY_FW_Utility.doWait(2000);//need wait to verify
   }

   @When("^User selects the first option \"([^\"]*)\"$")
   public void user_selects_the_first_option(String arg1) throws Throwable {
       mmsinvoicehistory.clickFirstoptionRadio();
   }

   @When("^clicks on void invoice button$")
   public void clicks_on_void_invoice_button() throws Throwable {
       mmsinvoicehistory.clickVoidInvoiceSaveDailouge();
       
   }

   @Then("^system will validate at the backend$")
   public void system_will_validate_at_the_backend() throws Throwable {
      EY_FW_Utility.waitForProgressWindowToDisappear(15);
	   EY_FW_Utility.doWait(5000);
   }

   @Then("^generates a success message stating invoice is voided$")
   public void generates_a_success_message_stating_invoice_is_voided() throws Throwable {
      mmsinvoicehistory.clickVoidInvoiceNotification();
      EY_FW_Utility.doWait(4000);
      mmsinvoicehistory.verifyVoidSuccessMsg();
      //EY_FW_Utility.doWait(2000);
      
   }

   @Then("^invoice will disappear from the grid$")
   public void invoice_will_disappear_from_the_grid() throws Throwable {
    
   }
   
   
   
   
   @Given("User has already voided a invoice selecting the first option for InvoiceNumber TESTppp")
   public void user_has_already_voided_a_invoice_selecting_the_first_option_InvoiceNumber_vda() throws Throwable {
       //mmsinvoicehistory.clickCloseVoidStatus();
       //EY_FW_Utility.doWait(2000);
      //mmsinvoicehistory.clickCloseInvoiceDate();
       EY_FW_Utility.doWait(2000);
	   //mmsinvoicehistory.clickInvoiceCheckBox();
   }

   @When("user clicks on Filter")
   public void user_clicks_on_Filter() throws Throwable {
      mmsinvoicehistory.clickFilter();
   }

   @When("enter the invoice '(.*)' to '(.*)'")
   public void enter_the_invoice_vda(String startInvoice, String endInvoice) throws Throwable {
      mmsinvoicehistory.enterInvoiceFrom(startInvoice);
      mmsinvoicehistory.enterInvoiceTo(endInvoice);
   }

   @When("^click on save$")
   public void click_on_save() throws Throwable {
       mmsinvoicehistory.clickFilterSave();
       EY_FW_Utility.doWait(3000);
   }

   @Then("^the grid should show that invoice number with void status column \"([^\"]*)\"$")
   public void the_grid_should_show_that_invoice_number_with_void_status_column(String arg1) throws Throwable {
       mmsinvoicehistory.verifyVoidStatusfirstopt();
       EY_FW_Utility.doWait(4000);
   }
   
   @Given("^User has already Generated an Invoice \"([^\"]*)\"$")
   public void user_has_already_Generated_an_Invoice(String arg1) throws Throwable {
       mmsinvoicehistory.clickCloseInvoiceDate();
       EY_FW_Utility.doWait(3000);
	   mmsinvoicehistory.clickBilling();
       EY_FW_Utility.doWait(2000);
       mmsinvoicehistory.clickInvoiceHistory();
       EY_FW_Utility.doWait(2000);
       mmsinvoicehistory.clickInvoiceAlreadySentToCombinedBilling();
   }

   @Given("^Invoice has been sent to combined billing$")
   public void invoice_has_been_sent_to_combined_billing() throws Throwable {
      mmsinvoicehistory.clickSendToCombinedBilling();
      EY_FW_Utility.doWait(3000);
      mmsinvoicehistory.clickCombinedBillingPopupOk();
      EY_FW_Utility.doWait(4000);
      
   }

   @Given("^has not been sent to DX file$")
   public void has_not_been_sent_to_DX_file() throws Throwable {
       
   }

   @Given("^User has already checked the box against the invoice$")
   public void user_has_already_checked_the_box_against_the_invoice() throws Throwable {
	   mmsinvoicehistory.clickInvoiceAlreadySentToCombinedBilling();
	   //EY_FW_Utility.doWait(2000);
	   mmsinvoicehistory.clickVoidInvoiceBtn();
	   EY_FW_Utility.doWait(6000);
	   
   }

   @When("^User select the first option in the Window$")
   public void user_selects_the_first_options(String arg1) throws Throwable {
	   mmsinvoicehistory.clickFirstoptionRadio();
	   EY_FW_Utility.doWait(3000);
       mmsinvoicehistory.clickVoidInvoiceSaveDailouge();
       EY_FW_Utility.doWait(4000);
       //mmsinvoicehistory.clickVoidInvoiceNotification();
       //EY_FW_Utility.doWait(2000);
   }

   @Then("^generates a error message \"([^\"]*)\"$")
   public void generates_a_error_message(String arg1) throws Throwable {
       mmsinvoicehistory.VerifyErrorMsgforAlreadySentToCombinedBilling();
       //EY_FW_Utility.doWait(3000);
       mmsinvoicehistory.clickVoidErrorforCombinedBillingInvoice();
   }

   @Then("^The invoice stays on the grid\\.$")
   public void the_invoice_stays_on_the_grid() throws Throwable {
       mmsinvoicehistory.verifyInvoicePresentGrid();
       EY_FW_Utility.doWait(3000);
      
   }
   
   @Given("^User is already on the \"([^\"]*)\" screen$")
   public void user_is_already_on_the_screen(String arg1) throws Throwable {
      mmsinvoicehistory.clickBilling();
      //EY_FW_Utility.doWait(1000);
      mmsinvoicehistory.clickInvoiceHistory();
      //EY_FW_Utility.doWait(2000);
   }

   @Given("User selects multiple Invoices \"([^\"]*)\" and \"([^\"]*)\" from the Grid having no Voiding Status")
   public void user_selects_multiple_Invoices_asdfasdf_gaa_ag_from_the_Grid_having_no_Status(int arg1, int arg2) throws Throwable {
       mmsinvoicehistory.clickMultipleInvoiceFirst();
       //EY_FW_Utility.doWait(1000);
       mmsinvoicehistory.clickMultipleInvoiceSecond();
   }

   @Given("^the invoices are not sent to combined billing- Last sent to combined billing column will be blank$")
   public void the_invoices_are_not_sent_to_combined_billing_Last_sent_to_combined_billing_column_will_be_blank() throws Throwable {
       
   }

   @When("^User clicks on Void Invoice Button\\.$")
   public void user_clicks_on_Void_Invoice_Button() throws Throwable {
       mmsinvoicehistory.clickVoidInvoiceBtn();
       //EY_FW_Utility.doWait(5000);
       mmsinvoicehistory.clickCancelVoidInvoiceDailogue();
       //EY_FW_Utility.doWait(1000);
   }

   @Then("^generates a success message stating invoices is voided$")
   public void generates_a_success_message_stating_invoices_is_voided() throws Throwable {
      
   }

   @Then("^invoices will disappear from the grid$")
   public void invoices_will_disappear_from_the_grid() throws Throwable {
       
   }
   
   
   @Given("^User has selected a invoice which is not voided but sent to combined billing and DX file is generated '(.*)' to '(.*)'$")
   public void user_has_selected_a_invoice_which_is_not_voided_but_sent_to_combined_billing_and_DX_file_is_generated(String from, String to) throws Throwable {
	   /*mmsinvoicehistory.clickCloseVoidStatus();
       EY_FW_Utility.doWait(2000);
       mmsinvoicehistory.clickCloseInvoiceDate();
       EY_FW_Utility.doWait(2000);*/
	   mmsinvoicehistory.clickFilter();
       mmsinvoicehistory.enterInvoiceFrom(from);
       //EY_FW_Utility.doWait(1000);
       mmsinvoicehistory.enterInvoiceTo(to);
       //EY_FW_Utility.doWait(1000);
       mmsinvoicehistory.clickFilterSave();
       //EY_FW_Utility.doWait(2000);
       
   }

   @Given("^has clicked on the Void button$")
   public void has_clicked_on_the_Void_button() throws Throwable {
       mmsinvoicehistory.clickInvoiceCheckBox();
	   mmsinvoicehistory.clickVoidInvoiceBtn();
       //EY_FW_Utility.doWait(2000);
   }

   @Given("^dialogue window appears with (\\d+) options$")
   public void dialogue_window_appears_with_options(int arg1) throws Throwable {
       
   }

   @When("^User selects (\\d+)rd option \"([^\"]*)\"I'm resubmitting this invoice\\. I have already sent it to the Data exchange or my customer and need to submit a revised invoice with a new invoice number\"([^\"]*)\"$")
   public void user_selects_rd_option_I_m_resubmitting_this_invoice_I_have_already_sent_it_to_the_Data_exchange_or_my_customer_and_need_to_submit_a_revised_invoice_with_a_new_invoice_number(int arg1, String arg2, String arg3) throws Throwable {
       mmsinvoicehistory.clickThirdOption();
   }

   @When("^clicks on Void invoice button$")
   public void clicks_on_Void_invoice_button() throws Throwable {
       mmsinvoicehistory.clickVoidInvoiceSaveDailouge();
       //EY_FW_Utility.doWait(10000);
       mmsinvoicehistory.clickVoidInvoiceNotification();
       //EY_FW_Utility.doWait(5000);
   }

   @Then("^generates a success message stating invoice is voided on the activity summary$")
   public void generates_a_success_message_stating_invoice_is_voided_on_the_activity_summary() throws Throwable {
      
   }
   
   @Given("^User has already voided a invoice selecting the (\\d+)rd option \"([^\"]*)\"$")
   public void user_has_already_voided_a_invoice_selecting_the_rd_option(int arg1, String arg2) throws Throwable {
       
   }

   /*@When("^User clicks on Filter button$")
   public void user_clicks_on_Filter_button() throws Throwable {
       mmsinvoicehistory.clickFilter();
       
   }*/

   @When("^enter the invoice from '(.*)' to '(.*)'$")
   public void enter_the_invoice_from_to(String arg1, String arg2) throws Throwable {
    
	  mmsinvoicehistory.enterInvoiceFrom(arg1);
      mmsinvoicehistory.enterInvoiceTo(arg2);
      
   }

   @When("^click on save of Filter$")
   public void click_on_save_of_Filter() throws Throwable {
      mmsinvoicehistory.clickFilterSave();
      //EY_FW_Utility.doWait(2000);
   }

   @Then("^the grid should show that invoice number for Third option with void status column \"([^\"]*)\"$")
   public void the_grid_should_show_that_invoice_number_for_Third_option_with_void_status_column(String arg1) throws Throwable {
      mmsinvoicehistory.verifyStatusforThirdOpt();
      //EY_FW_Utility.doWait(2000);
   }
   
   
   
}
