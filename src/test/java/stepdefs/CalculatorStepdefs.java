package stepdefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import app.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CalculatorStepdefs {
	
	Calculator calc;
	int result=0;
	
	@Given("I have the calculator")
	public void i_have_the_calculator() {
	    // Write code here that turns the phrase above into concrete actions
	
		calc = new Calculator();
	    
	}

	@When("I add {int} and {int}")
	public void i_add_and(int num1, int num2) {
	    // Write code here that turns the phrase above into concrete actions
		
		result=calc.add(num1, num2);
	    
	}

	@Then("I should get reault as {int}")
	public void i_should_get_reault_as(int expResult) {
	    // Write code here that turns the phrase above into concrete actions
		
		Assert.assertEquals(expResult, result);
	    
	}
	
	@When("I sub {int} and {int}")
	public void i_sub_and(int num1, int num2) {
	    // Write code here that turns the phrase above into concrete actions
		
		result=calc.sub(num1, num2);
	}
	
	@When("I add below numbers")
	public void i_add_below_numbers(List<Integer> numbers) {
		
		for (int num:numbers) {
			
			result=calc.add(num, result);
		}
	    
	}
	
	@When("I buy below items with price")
	public void i_buy_below_items_with_price(Map<String,Integer> items) {
		
	for (int value:items.values()) {
		result=calc.add(value, result);
	}
	    
	}
	
	@When("I buy below items with price and Qty")
	public void i_buy_below_items_with_price_and_Qty(io.cucumber.datatable.DataTable dataTable) {
	    int row = dataTable.height();
	    
	    for (int i=0;i<row;i++) {
	    	int qty = Integer.parseInt(dataTable.cell(i, 1));
	    	int price = Integer.parseInt(dataTable.cell(i, 2));
	    	
	    	result=calc.add(qty*price, result);
	    }
	}
		


}
