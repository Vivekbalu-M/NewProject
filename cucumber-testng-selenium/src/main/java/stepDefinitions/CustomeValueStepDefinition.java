package stepDefinitions;

import org.testng.Assert;

import MyRunner.TestRunner;
import Util.Utils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CustomeValuesPage;

public class CustomeValueStepDefinition extends TestRunner {

	CustomeValuesPage customeValuesPage;
	@Given("^user is on home Page$")
	public void user_already_on_home_page() {
		
		driver.get("https://www.exercise1.com/values ");		
		customeValuesPage= new CustomeValuesPage(driver);
	}
	
	
	@When("^user verify home page header$")
	public void veriy_home_page_header() {
		Assert.assertEquals(customeValuesPage.getPageHeader().getText(),"ExpectedPageHeader");
	}

	@Then("^user veriy label headers for all fields$")
	public void veriy_label_header_all_fields() {
		Assert.assertTrue(customeValuesPage.getLabelFieldValue1().isDisplayed());
		Assert.assertTrue(customeValuesPage.getLabelFieldValue2().isDisplayed());
		Assert.assertTrue(customeValuesPage.getLabelFieldValue3().isDisplayed());
		Assert.assertTrue(customeValuesPage.getLabelFieldValue4().isDisplayed());
		Assert.assertTrue(customeValuesPage.getLabelFieldValue5().isDisplayed());
	}

	@Then("^user veriy the label values for all fields is grater than zero$")
	public void veriy_label_values_all_fields_is_grater_than_zero() {
		Assert.assertTrue(customeValuesPage.veriyAllInputFieldValues());
		
	}

	@Then("^verify currency symbol for all fields$")
	public void verify_currency_symbol_all_fields() {
		Assert.assertTrue(customeValuesPage.getInputField1().getText().contains("$"));
		Assert.assertTrue(customeValuesPage.getInputField2().getText().contains("$"));
		Assert.assertTrue(customeValuesPage.getInputField3().getText().contains("$"));
		Assert.assertTrue(customeValuesPage.getInputField4().getText().contains("$"));
		Assert.assertTrue(customeValuesPage.getInputField5().getText().contains("$"));
	}

	@Then("^verify total balance is matches all the fields$")
	public void verify_total_balance_matches_all_fields() {
		double totBal=Utils.convertStringToDouble(customeValuesPage.getInputTotalBalance().getAttribute("value"));		
		Assert.assertEquals(customeValuesPage.getSumOAllInputField(),totBal);
	}


}
