 package stepDefinition;

import org.openqa.selenium.WebDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ecommerce.DriverFactory;
import ecommerce.DriverType;

public class stepDefinition {
	public WebDriver driver;
	@Given("^Go to http://live\\.demoguru(\\d+)\\.com/index\\.php/backendlogin$")
	public void go_to_http_live_demoguru_com_index_php_backendlogin() throws Throwable {
	    driver=DriverFactory.getDriver(DriverType.CHROME);
	    driver.get("http://live.demoguru99.com/index.php/backendlogin");
	    driver.manage().window().maximize();
	    
	}

	@Given("^Login the credentials provided$")
	public void login_the_credentials_provided(String username,String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^Go to Sales-> Orders menu$")
	public void go_to_Sales_Orders_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^In the status field select \"([^\"]*)\"\\. Click Search$")
	public void in_the_status_field_select_Click_Search(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    }

	@When("^Select the checkbox next to first order$")
	public void select_the_checkbox_next_to_first_order() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^In Actions, select Print Invoices\\. Click Submit$")
	public void in_Actions_select_Print_Invoices_Click_Submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("^Verify the error message$")
	public void verify_the_error_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^n the status field select \"([^\"]*)\"\\. Click Search$")
	public void n_the_status_field_select_Click_Search(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^Error message There are no printable documents related to selected orders is shown$")
	public void error_message_There_are_no_printable_documents_related_to_selected_orders_is_shown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Invoice is downloaded$")
	public void invoice_is_downloaded() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}



}
