package com.fasttrackit.features.search;

import com.fasttrackit.steps.serenity.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTests {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected SearchSteps searchSteps;
    @Steps
    protected ProductSteps productSteps;
    @Steps
    protected CartSteps cartSteps;
    @Steps
    protected CheckoutSteps checkoutSteps;

    @Before
    public void maximize(){
        webDriver.manage().window().maximize();
    }


}
