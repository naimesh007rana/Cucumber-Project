package stepdefs;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepdefs {
	
	WebDriver driver = BaseClass.driver;
	
	@Given("I have webside URL")
	public void i_have_webside_URL() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://simplilearn.com/");
	} 

	@Given("I clicked on Login link")
	public void i_clicked_on_Login_link() {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement loginlnk = driver.findElement(By.linkText("Log in"));
		loginlnk.click();
	    
	}

	@When("I enter Username")
	public void i_enter_Username() {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement username = driver.findElement(By.name("user_login"));
		username.sendKeys("naimesh007rana@gmail.com");
	    
	}

	@When("I enter Password")
	public void i_enter_Password() {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement password = driver.findElement(By.name("user_pwd"));
		password.sendKeys("8460402445Nn$");
	    
	}

	@When("I click on Login button")
	public void i_click_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement loginbtn = driver.findElement(By.name("btn_login"));
		loginbtn.click();
	    
	}

	@Then("I should be navigate to Home page")
	public void i_should_be_navigate_to_Home_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		
	    
	}
	
	@When("I enter Username as {string}")
	public void i_enter_Username_as(String usernamevlu) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement username = driver.findElement(By.name("user_login"));
		username.sendKeys(usernamevlu);
	    
	}

	@When("I enter Password as {string}")
	public void i_enter_Password_as(String passwordvlu) {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement password = driver.findElement(By.name("user_pwd"));
		password.sendKeys(passwordvlu);
	    
	}

	@Then("I should get error message as {string}")
	public void i_should_get_error_message_as(String experror) {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement error = driver.findElement(By.className("error_msg"));
		String acterror = error.getText();
		Assert.assertEquals(experror, acterror);
		
		
		
	    
	}
	
	@Then("I should get below login options")
	public void i_should_get_below_login_options(List<String> Options) {
	    // Write code here that turns the phrase above into concrete actions
		
		for(String option:Options) {
			
			WebElement opt = driver.findElement(By.xpath("//button[@data-clickedtype='"+ option +"']"));
			Assert.assertTrue(opt.isDisplayed());
		}
	    
	}




}
