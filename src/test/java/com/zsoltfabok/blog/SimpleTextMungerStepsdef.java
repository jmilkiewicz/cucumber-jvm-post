package com.zsoltfabok.blog;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SimpleTextMungerStepsdef {
	@Given("^I have an instance of my class$")
	public void I_have_an_instance_of_my_class() {
	    // Express the Regexp above with the code you wish you had
	}

	@Then("^I receive \"([^\"]*)\"$")
	public void I_receive_(String arg1) {
	    // Express the Regexp above with the code you wish you had
	}

	@When("^I call my method with \"([^\"]*)\"$")
	public void I_call_my_method_with_(String arg1) {
	    // Express the Regexp above with the code you wish you had
	}
}
