package com.Monkey_Cap.stepDefinitions;

import org.junit.Assert;

import com.Monkey_Cap.Baseclass;
import com.Monkey_Cap.pom.QuotesPage;

import cucumber.api.java.en.Then;

public class Quotes extends Baseclass{
	QuotesPage quotesPage = null;
	
	@Then("^User lands in Quotes page successfully$")
	public void user_lands_in_Quotes_page_successfully() throws Throwable {
		quotesPage = new QuotesPage(Baseclass.driver);
	    Assert.assertTrue(Baseclass.elementIsDisplayed(quotesPage.get_policy_list().get(0)));
	    test.info("User landed in Quotes page successfully");
	}
	
	@Then("^User validates results Quotes are displayed$")
	public void user_validates_results_Quotes_are_displayed() throws Throwable {
	    Assert.assertTrue(Baseclass.elementIsDisplayed(quotesPage.get_premium_list().get(0)));
	    test.info("User validated results Quotes are displayed");
	}
}
