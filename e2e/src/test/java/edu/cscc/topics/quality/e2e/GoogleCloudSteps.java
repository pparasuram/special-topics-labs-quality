package edu.cscc.topics.quality.e2e;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleCloudSteps {
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
        // WebDriverManager.chromedriver().setup();
        // driver = new ChromeDriver();
    }

    /*
        Note the annotation (@When).
        This step definition triggers on 'When I go to the Hello World homepage'
     */
    /*
        Gherkin/cucumber supports variables in step definitions.  In this instance, any text inside quotes
        is passed as the String argument 'text' to this method.
     */

// new google test

    @Given("I am on the Google Cloud homepage")
    public void i_am_on_the_Google_Cloud_homepage() {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();
        driver.navigate().to("https://cloud.google.com/");
    }

    @When("I click {string}")
    public void i_click_the_link_with_text(String html_text) {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();
        // driver.findElement(By.id(html_id)).click();
        // driver.findElement(By.className(html_class)).click();
        driver.findElement(By.linkText(html_text)).click();
    }

    @Then("I am taken to the Google Cloud Blog page")
    public void i_am_taken_to_the_google_blog_page() {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();
        String urlText = driver.getCurrentUrl();
        Assert.assertEquals("https://cloud.google.com/blog", urlText);
    }

}
