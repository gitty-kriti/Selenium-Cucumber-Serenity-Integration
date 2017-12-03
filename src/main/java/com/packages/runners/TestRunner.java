package com.packages.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
@CucumberOptions(features="resources/features/TestFeature.feature")
public class TestRunner {

}
