package com.fasttrackit.features.search;

import org.junit.Test;

public class CheckoutTests extends BaseTests{

    @Test
    public void verifyCheckout(){
        loginSteps.navigateToHomepage();
        searchSteps.performSearch("beanie");
        productSteps.selectProductFromList("Beanie with Logo");
        cartSteps.clickAddToCart();
        checkoutSteps.navigateToCheckout();
        checkoutSteps.setBillingDetails("Andreea", "Fast", "Strada Cocorilor nr 12");
        checkoutSteps.setCityField("Cluj");
        checkoutSteps.setPostcodeField("400252");
        checkoutSteps.setPhoneField("0720123456");
        checkoutSteps.setEmailField("ceaca.andreea@yahoo.com");
        checkoutSteps.clickOrderButton();
        checkoutSteps.verifyOrderMade("Thank you. Your order has been received.");
    }

    @Test
    public void verifyCheckoutWithoutAddress(){
        loginSteps.navigateToHomepage();
        searchSteps.performSearch("beanie");
        productSteps.selectProductFromList("Beanie with Logo");
        cartSteps.clickAddToCart();
        checkoutSteps.navigateToCheckout();
        checkoutSteps.setBillingDetails("Andreea", "Fast", "Strada Cocorilor nr 12");
        checkoutSteps.setCityField("Cluj");
        checkoutSteps.setPostcodeField("400252");
        checkoutSteps.setPhoneField("0720123456");
        checkoutSteps.clickOrderButton();
        checkoutSteps.verifyRequiredField("Billing Email address is a required field.");
    }
}
