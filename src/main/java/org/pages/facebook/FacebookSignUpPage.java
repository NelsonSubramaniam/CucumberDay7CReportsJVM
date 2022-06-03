package org.pages.facebook;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookSignUpPage extends BaseClass {
	
	public FacebookSignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="firstname")
	private WebElement txtFirstName;
	
	@FindBy(name="lastname")
	private WebElement txtLastName;
	
	@FindBy(name="reg_email__")
	private WebElement txtPhoneNo;
	
	@FindBy(name="reg_passwd__")
	private WebElement txtPassword;
	
	@FindBy(xpath="//select[@id='day']")
	private WebElement ddDOBDate;
	
	@FindBy(xpath="//select[@id='month']")
	private WebElement ddDOBMonth;
	
	@FindBy(xpath="//select[@id='year']")
	private WebElement ddDOBYear;
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement optFemale;
	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement optMale;
	
	@FindBy(xpath="//label[text()='Custom']")
	private WebElement optCustom;
	
	@FindBy(xpath="//button[text()='Sign Up']")
	private WebElement btnSignUp;
	
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtPhoneNo() {
		return txtPhoneNo;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getDdDOBDate() {
		return ddDOBDate;
	}

	public WebElement getDdDOBMonth() {
		return ddDOBMonth;
	}

	public WebElement getDdDOBYear() {
		return ddDOBYear;
	}

	public WebElement getOptFemale() {
		return optFemale;
	}

	public WebElement getOptMale() {
		return optMale;
	}

	public WebElement getOptCustom() {
		return optCustom;
	}

	public WebElement getBtnSignUp() {
		return btnSignUp;
	}

}
