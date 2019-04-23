# Special Topics Quality Lab

## Objective

For this lab, you will learn a little more about end-to-end testing, by implementing a couple new tests.  You will implement browser-based testing using Cucumber/Gherkin JUnit bindings to run Selenium tests.

## Getting Started:

1. Copy the starter code from here into a new, private repository in your personal GitHub account using [these instructions](https://github.com/jeff-anderson-cscc/submitting-assignments-lab#copy-the-starter-code-into-a-new-private-repository-in-your-personal-github-account) substituting this repository URL ``https://github.com/jschmersal-cscc/special-topics-labs-quality`` for the one referenced in that document.  When adding a collaborator, be sure to add me ("jschmersal-cscc").
2. Create a new branch for your code changes as described in [these instructions](https://github.com/jeff-anderson-cscc/submitting-assignments-lab#before-you-start-coding)
3. WARNING: This lab is like the last one.  IntelliJ doesn't know (by default) that your integration or e2e tests depend on a server running.  So you need to either:
    1. Run the tests using the command line (from the `e2e/` directory):  `mvn clean install`
    1. Run the tests from IntelliJ but make sure your server is running, by running (again from the `e2e/` directory) `mvn jetty:run`.  This will start your server listening on port 8080, so [http://localhost:8080](http://localhost:8080) is navigable in Firefox and you can run your e2e/integration tests against it.  Note that the server will stay running until you hit `<ctrl>-c` in the terminal you ran this command in.

## Completing the Assignment

1. The first part of the lab is to continue what we started in class.  The [simple.feature](e2e/src/test/resources/edu/cscc/topics/quality/e2e/simple.feature) feature file is missing the [Steps](e2e/src/test/java/edu/cscc/topics/quality/e2e/Steps.java) implementation for the second Scenario (`Using the link on the page`).  Fill it in and ensure your test succeeds
    1. Cucumber tests are written in `Given`/`When`/`Then` format.  
        1. The `Given` steps can be considered to be a "setup" phase, or a set of preconditions.  For example, if I have a `Given I am on the CSCC homepage` step, I would expect the implementation of that step to navigate the browser to `https://www.cscc.edu/` so the test can proceed.
        1. The `When` steps are the action or functionality being tested.  For example, `When I click the Submit button` or `When I click the "next" link`.  These generally direct the browser to do some navigation.
        1. The `Then` steps are checking that your `When` step did what you expected.  So `Then the counter should be 1` would have some type of assertion that the counter was incremented (perhaps by inspecting the page and getting the current value of the counter and stating `assertEquals(1, counterValue);`. 
    1. [Step Definitions](https://cucumber.io/docs/cucumber/step-definitions/) as found in `Steps.java` use an annotation (e.g. `@When("^something happens$")`) that specifies the type of step (`When`, in this example) and a regular expression for the rest of the statement to match (`"^something happens$"`, in this example).  That is how a step in a `.feature` file is matched to a step definition in a java class (e.g. `Steps.java`).  The [step definition](https://cucumber.io/docs/cucumber/step-definitions/) tutorial goes through this in more depth.   
1. For the second part of the lab you will add a new feature file with one scenario.  Your scenario should match what you see in the [Scenario Definition](#scenario-definition) section of this `README.md`.
    1.  Note that the URL for the Google Cloud homepage is "https://cloud.google.com".  You can find the "Blog" link at the bottom of the page. 
    1.  There are various ways to [find HTML elements](https://www.seleniumhq.org/docs/03_webdriver.jsp) using Selenium WebDriver.  Some are more stable than others.  Read through the `Locating UI Elements` section of the referenced link and consider the tradeoffs of the various methods.  Can you think of any troubles you might have if you weren't on the Google Cloud dev team but were trying to maintain a rich e2e test suite building off of what you're doing in this lab?
    1.  Whatever method you use to find the link to the Google Cloud Blog page, you will need to [follow the link](https://stackoverflow.com/questions/19060806/click-on-hyperlink-using-selenium-webdriver).
    1.  I suggest you add a new feature file (e.g. `google-cloud.feature`) and a new step definition java class (e.g. `GoogleCloudSteps.java`).

## Hints
1. You'll want to `click()` the element you find.  It's really just that, but you can [see the API](https://www.seleniumhq.org/docs/03_webdriver.jsp#selenium-webdriver-api-commands-and-operations) for more information if you need some help.
1. Probably the trickiest part here is timing related to clicking a hyperlink and verifying you've landed on the correct page.  There are many techniques, but [this StackOverflow post](https://stackoverflow.com/questions/36590274/selenium-how-to-wait-until-page-is-completely-loaded) should get you to a solution that works (if not perfect).

## Submitting Your Work

1. Create a pull request for your branch using [these instructions](https://github.com/jeff-anderson-cscc/submitting-assignments-lab#once-you-are-ready-to-submit-your-work-for-grading)
1. Submit the assignment in Blackboard as described in [these instructions](https://github.com/jeff-anderson-cscc/submitting-assignments-lab#once-your-pull-request-is-created-and-i-am-added-as-a-reviewer)

__NOTE: I will provide feedback via. comments in your pull request.__
If you need to amend your work after you issue your initial pull request:

1. Commit your updates
1. Push your changes to gitHub
1. Verify the new commits were automatically added to your open pull request

## Scenario Definition
```
    Given I am on the Google Cloud homepage
    When I click the Blog link
    Then I am taken to the Google Cloud Blog page
```
