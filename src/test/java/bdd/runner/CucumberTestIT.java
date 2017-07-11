package bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/features/featurebasic.feature"},
        glue = {"src/test/java/bdd/steps/HitEndPoint"})

public class CucumberTestIT {};
