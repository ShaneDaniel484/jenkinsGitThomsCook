package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = "json:target/cucumber-report.json",features="C:\\Users\\aaron\\Downloads\\BlackSquad_PilotProject 3\\BlackSquad_PilotProject_1\\Thomascook\\src\\test\\resources\\features",
glue="com.stepDefinitions")
public class TestNGLogin extends AbstractTestNGCucumberTests {
}
