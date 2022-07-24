package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.CheckoutPage;
import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CheckoutSteps extends ScenarioSteps{

    private HomePage homePage;
    private LoginPage loginPage;
    private CheckoutPage checkoutPage;

    @Step
    public void navigateToCheckout(){
        checkoutPage.clickCheckoutButton();
    }
    @Step
    public void setBillingDetails(String firstName, String lastName, String address){
        checkoutPage.setFirstName(firstName);
        checkoutPage.setLastName(lastName);
        checkoutPage.setAddress(address);
    }
    @Step
    public void setCityField(String city){
        checkoutPage.setCity(city);
    }
    @Step
    public void setPostcodeField(String postcode){
        checkoutPage.setPostcodeField(postcode);
    }
    @Step
    public void setPhoneField(String phone){
        checkoutPage.setPhoneField(phone);
    }
    @Step
    public void clickOrderButton(){
        checkoutPage.clickOrderButton();
    }
    @Step
    public void setEmailField(String email){
        checkoutPage.setEmail(email);
    }
    @Step
    public void verifyOrderMade(String text){
        checkoutPage.verifyOrderReceived(text);
    }
    @Step
    public void verifyRequiredField(String text){
        checkoutPage.verifyRequiredField(text);
    }



}
