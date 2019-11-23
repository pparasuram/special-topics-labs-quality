package edu.cscc.topics.quality.e2e;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Steps {
    private static WebDriver driver;

    static {
        /*
           Selenium can drive multiple kinds of browsers.  Chrome tends to be the most
           ubiquitous (and pretty stable).  Firefox is another good choice.  This library
           takes care of downloading a FirefoxDriver executable (which selenium uses to send
           commands to a firefox browser instance
         */
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    /*
        Note the annotation (@When).
        This step definition triggers on 'When I go to the Hello World homepage'
     */
    @When("^I go to the Hello World homepage$")
    public void whenIGoToTheHompeage() {
        // this line tells the ChromeDriver to direct its chrome instance to http://localhost:8080/
        driver.navigate().to("http://localhost:8080/");
    }

    /*
        Gherkin/cucumber supports variables in step definitions.  In this instance, any text inside quotes
        is passed as the String argument 'text' to this method.
     */
    @Then("^\\\"(.*)\\\" should be displayed$")
    public void textShouldBeDisplayed(String text) {
        // By is really helpful, and has multiple ways of selecting elements (id, class, selector, xpath, etc.)
        String output = driver.findElement(By.id("helloId")).getText();
        Assert.assertEquals(text, output);
    }

    @Given("I am on the Hello World homepage")
    public void i_am_on_the_Hello_World_homepage() {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();
        driver.navigate().to("http://localhost:8080/");
    }

    @When("I click the link with id {string}")
    public void i_click_the_link_with_id(String html_id) {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();
        driver.findElement(By.id(html_id)).click();
    }

    @Then("I am taken to the hello subpage")
    public void i_am_taken_to_the_hello_subpage() {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();
        String urlText = driver.getCurrentUrl();
        Assert.assertEquals("http://localhost:8080/hello", urlText);
    }
/*
    @Then("I close browser")
    public void close_browser(){
        driver.close();
    }
*/
}
