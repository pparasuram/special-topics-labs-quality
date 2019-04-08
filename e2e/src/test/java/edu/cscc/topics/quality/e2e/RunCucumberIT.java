package edu.cscc.topics.quality.e2e;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/*
   This class lets us run all of the feature files.  By default it hooks up to look in your resources
   for .feature files in the same package space as this class (i.e. edu.cscc.topics.quality.e2e
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class RunCucumberIT {

}
