# Special Topics Quality Lab

## Objective

For this lab, you will learn a little more about end-to-end testing, by implementing a couple new tests.  You will implement browser-based testing using Cucumber/Gherkin JUnit bindings to run Selenium tests.

## Getting Started:

1. Copy the starter code from here into a new, private repository in your personal GitHub account using [these instructions](https://github.com/jeff-anderson-cscc/submitting-assignments-lab#copy-the-starter-code-into-a-new-private-repository-in-your-personal-github-account) substituting this repository URL ``https://github.com/jschmersal-cscc/special-topics-labs-quality`` for the one referenced in that document.  When adding a collaborator, be sure to add me ("jschmersal-cscc").
2. Create a new branch for your code changes as described in [these instructions](https://github.com/jeff-anderson-cscc/submitting-assignments-lab#before-you-start-coding)


## Completing the Assignment

1. The first part of the lab is to continue what we started in class.  The [simple.feature](e2e/src/test/resources/edu/cscc/topics/quality/e2e/simple.feature) feature file is missing the [Steps](e2e/src/test/java/edu/cscc/topics/quality/e2e/Steps.java) implementation for the second Scenarion (`Using the link on the page`).  Fill it in and ensure your test succeeds.
1. For the second part of the lab you will add a new feature file with one scenario.  Your scenario should look like:
```
    Given I am on the Google Cloud homepage
    When I click the Blog link
    Then I am taken to the Google Cloud Blog page
```

    1.  Note that the URL for the Google Cloud homepage is "https://cloud.google.com".  You can find the "Blog" link at the bottom of the page. 
    1.  There are various ways to [find HTML elements](https://www.seleniumhq.org/docs/03_webdriver.jsp) using Selenium WebDriver.  Some are more stable than others.  Read through the `Locating UI Elements` section of the referenced link and consider the tradeoffs of the various methods.  Can you think of any troubles you might have if you weren't on the Google Cloud dev team but were trying to maintain a rich e2e test suite building off of what you're doing in this lab?
    1.  Whatever method you use to find the link to the Google Cloud Blog page, you will need to [follow the link](https://stackoverflow.com/questions/19060806/click-on-hyperlink-using-selenium-webdriver).

## Hints
1. Probably the trickiest part here is timing related to clicking a hyperlink and verifying you've landed on the correct page.  There are many techniques, but [this StackOverflow post](https://stackoverflow.com/questions/36590274/selenium-how-to-wait-until-page-is-completely-loaded) should get you to a solution that works (if not perfect).

## Submitting Your Work

1. Create a pull request for your branch using [these instructions](https://github.com/jeff-anderson-cscc/submitting-assignments-lab#once-you-are-ready-to-submit-your-work-for-grading)
1. Submit the assignment in Blackboard as described in [these instructions](https://github.com/jeff-anderson-cscc/submitting-assignments-lab#once-your-pull-request-is-created-and-i-am-added-as-a-reviewer)

__NOTE: I will provide feedback via. comments in your pull request.__
If you need to amend your work after you issue your initial pull request:

1. Commit your updates
1. Push your changes to gitHub
1. Verify the new commits were automatically added to your open pull request

