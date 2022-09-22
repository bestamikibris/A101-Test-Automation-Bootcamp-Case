package com.a101.uiautomationtest.hooks;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"classpath:features"},
        glue = {"com.a101"},
        monochrome=true,
        plugin = {"pretty", "html:target/cucumber"}
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests { }




