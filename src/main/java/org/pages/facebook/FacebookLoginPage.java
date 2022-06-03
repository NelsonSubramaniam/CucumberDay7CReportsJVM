package org.pages.facebook;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage extends BaseClass {
	
	// Constructor
	public FacebookLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBys({@FindBy(id="email"), 
		      @FindBy(xpath="//input[@name='email']")})
	private WebElement txtUserName;
	
	@CacheLookup
	@FindBys({@FindBy(id="pass"), 
	      @FindBy(xpath="//input[@name='pass']")})
	private WebElement txtPassword;
	
	@FindBy(name="login")
	private WebElement btnLogin;
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement btnCreateNewAccount;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getBtnCreateNewAccount() {
		return btnCreateNewAccount;
	}
	
}
