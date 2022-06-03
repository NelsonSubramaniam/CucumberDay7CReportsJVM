package org.stepdefinition;

import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.base.BaseClass;
import org.pages.facebook.FacebookLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass {
	
	static FacebookLoginPage flpObj;
	
	@Given("The user should be in facebook page")
	public void the_user_should_be_in_facebook_page() {
//		browserLaunch("Chrome");
//		implicitWait(10);
//		urlLaunch("https://www.facebook.com/");
	}

	@When("The user has to fill invalid {string}and {string}")
	public void the_user_has_to_fill_invalid_and(String user, String pass) {
		flpObj = new FacebookLoginPage();

		sendKeys(flpObj.getTxtUserName(), user);
		sendKeys(flpObj.getTxtPassword(), pass);
	}

	@When("The user has to click the {string} button")
	public void the_user_has_to_click_the_button(String btn) {
		if (btn.equals("login")) {
			btnClick(flpObj.getBtnLogin());
			System.out.println("Login button clicked");
		}
		else if (btn.equals("signup")) {
			btnClick(RegistrationSteps.fspObj.getBtnSignUp());
			System.out.println("Signup button clicked");
		}
		else {
			throw new NoSuchElementException();
		}
	}

	@Then("The user should navigate to the invalid login page")
	public void the_user_should_navigate_to_the_invalid_login_page() {
		assertTrue("Verify url after login", waitForURL("privacy"));
	    System.out.println("I am in Invalid Page"); 
//	    quit();
	}
	
}
