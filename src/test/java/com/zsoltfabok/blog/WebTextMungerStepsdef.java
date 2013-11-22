package com.zsoltfabok.blog;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class WebTextMungerStepsdef {

    private EmbeddedTomcat tomcat = new EmbeddedTomcat();
    private WebDriver browser;

    @Before("@web")
    public void beforeScenario() {
        if (!tomcat.isRunning()) {
            tomcat.start();
            tomcat.deploy("munger");
            browser = new FirefoxDriver();

            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    browser.close();
                    tomcat.stop();
                }
            });
        }
    }

    @Given("^I am on the home page")
    public void I_am_on_the_home_page() {
        browser.get(tomcat.getApplicationUrl("munger"));
    }

    @When("^I enter \"([^\"]*)\"$")
    public void I_enter_(String text) {
        browser.findElement(By.id("text")).sendKeys(text);
    }

    @When("^I press \"([^\"]*)\"$")
    public void I_press_(String buttonId) {
        browser.findElement(By.id(buttonId)).click();
    }

    @Then("^I see \"([^\"]*)\" as the munged text$")
    public void I_see_as_the_munged_text(String text) {
        assertEquals(text, browser.findElement(By.id("munged")).getText());
    }

    @Then("^I see \"([^\"]*)\" as the original$")
    public void I_see_as_the_original(String text) {
        assertEquals("(" + text + ")", browser.findElement(By.id("original")).getText());
    }
}
