package com.example.demo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.Tag;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:target/cucumber" },
        features={ "src/test/resources/features" },
        glue = { "com.example.demo" },
        strict = true)
@Tag("UNIT_TEST")
public class TestRunner { }
