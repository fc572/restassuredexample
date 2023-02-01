package bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/features/featurebasic.feature"},
        glue = {"src/test/java/bdd/steps/HitEndPoint"})

public class CucumberTestIT {};
