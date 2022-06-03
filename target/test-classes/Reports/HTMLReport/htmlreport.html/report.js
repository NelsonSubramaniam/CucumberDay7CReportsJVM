$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "To validate the login functionality of facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To validate the login functionality with invalid username and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "The user has to fill invalid \"\u003cusername\u003e\"and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The user has to click the \"login\" button",
  "keyword": "And "
});
formatter.step({
  "name": "The user should navigate to the invalid login page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "manoj",
        "34567"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.the_user_should_be_in_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login functionality with invalid username and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "The user has to fill invalid \"manoj\"and \"34567\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.the_user_has_to_fill_invalid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click the \"login\" button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.the_user_has_to_click_the_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should navigate to the invalid login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_user_should_navigate_to_the_invalid_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/register.feature");
formatter.feature({
  "name": "To validate the registration functionality of facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.the_user_should_be_in_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the registration functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@retest"
    }
  ]
});
formatter.step({
  "name": "The user has to click create new account link",
  "keyword": "When "
});
formatter.match({
  "location": "RegistrationSteps.the_user_has_to_click_create_new_account_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to fill the firstname, lastname and other details",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationSteps.the_user_has_to_fill_the_firstname_lastname_and_other_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click the \"signup\" button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.the_user_has_to_click_the_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should get message successfull registered",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.the_user_should_get_message_successfull_registered()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.RegistrationSteps.the_user_should_get_message_successfull_registered(RegistrationSteps.java:31)\r\n\tat ✽.The user should get message successfull registered(file:src/test/resources/Features/register.feature:11)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});