package com.examples.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
Author : Sathish Ponnusamy
Date: 07/02/2021
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/BeerCans.feature"},
        glue = {"com.examples.cucumber"})

public class RunCucumberTest {
}