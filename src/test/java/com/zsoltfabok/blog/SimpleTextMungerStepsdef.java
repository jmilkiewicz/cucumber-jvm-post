package com.zsoltfabok.blog;



import java.util.List;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class SimpleTextMungerStepsdef {
    private SimpleTextMunger munger;
    private String result;

    @Given("^I have an instance of my class$")
    public void I_have_an_instance_of_my_class() {
        munger = new SimpleTextMunger();
    }

    @When("^I call my method with \"([^\"]*)\"$")
    public void I_call_my_method_with_(String word) {
        result = munger.execute(word);
    }

    @Then("^I receive \"([^\"]*)\"$")
    public void I_receive_(String expectation) {
        assertThat(expectation, is(result));
    }

    @Given("^the following users$")
    public void the_following_users(List<Entry> entries) {
        // iterate through the list and do something
    }

    class Entry {
        String first_name;
        String last_name;
    }
}
