package org.stepdefinition;

import org.base.BaseClass;
import org.pages.facebook.FacebookLoginPage;
import org.pages.facebook.FacebookSignUpPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps extends BaseClass {
	
	static FacebookSignUpPage fspObj;
	
	@When("The user has to click create new account link")
	public void the_user_has_to_click_create_new_account_link() {
		LoginSteps.flpObj = new FacebookLoginPage();
		fspObj = new FacebookSignUpPage();
		btnClick(LoginSteps.flpObj.getBtnCreateNewAccount());
	}
	
	@When("The user has to fill the firstname, lastname and other details")
	public void the_user_has_to_fill_the_firstname_lastname_and_other_details() {
		sendKeys(fspObj.getTxtFirstName(), "Manoj");
		sendKeys(fspObj.getTxtLastName(), "Kumar");
	}

	@Then("The user should get message successfull registered")
	public void the_user_should_get_message_successfull_registered() {
		System.out.println("Successfully Registered");
	}
	
}
