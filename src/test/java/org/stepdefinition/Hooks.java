package org.stepdefinition;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	
	@Before
	public void beforeScenario() {
		System.out.println("===========================Before==========================");
		browserLaunch("Chrome");
		implicitWait(10);
		urlLaunch("https://www.facebook.com/");
	}
	
	@After
	public void afterScenario() {	
		System.out.println("===========================After==========================");
		quit();
	}

}
