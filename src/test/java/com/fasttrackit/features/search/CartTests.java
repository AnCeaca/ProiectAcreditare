package com.fasttrackit.features.search;

import com.fasttrackit.utils.Constants;
import org.junit.Test;

public class CartTests extends BaseTests{

    @Test
    public void addProductToCart(){
        loginSteps.performLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.performSearch("beanie");
        productSteps.selectProductFromList("Beanie with Logo");
        cartSteps.clickAddToCart();
        productSteps.verifySuccessMessage("Beanie with Logo");
    }

    @Test
    public void addProductToCartByQuantity(){
        loginSteps.performLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.performSearch("cap");
        productSteps.selectProductFromList("Cap");
        productSteps.setQuantityForProduct("2");
        cartSteps.clickAddToCart();
        productSteps.verifySuccessMessage("Cap");
    }
    @Test
    public void verifyTotalPriceIsCorrect(){
        loginSteps.navigateToHomepage();
        searchSteps.performSearch("beanie");
        productSteps.selectProductFromList("Beanie with Logo");
        cartSteps.clickAddToCart();
        productSteps.verifySuccessMessage("Beanie With Logo");
        searchSteps.performSearch("hoodie");
        productSteps.selectProductFromList("Hoodie with Zipper");
        cartSteps.clickAddToCart();
        productSteps.verifySuccessMessage("Hoodie with Zipper");
        cartSteps.clickCartButton();
        cartSteps.checkSubtotalPriceIsDisplayedCorrectly();
        cartSteps.checkGrandTotalPriceIsCorrect();
    }
    @Test
    public void removeProductFromCart(){
        loginSteps.performLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.performSearch("beanie");
        productSteps.selectProductFromList("Beanie with Logo");
        cartSteps.clickAddToCart();
        cartSteps.clickRemoveFromCartButton();
        // verify product removed from cart
    }
    @Test
    public void verifyEmptyCartByQuantity(){
        loginSteps.performLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.performSearch("beanie");
        productSteps.selectProductFromList("Beanie with Logo");
        cartSteps.clickAddToCart();
        cartSteps.clickCartButton();
        productSteps.setQuantityForProduct("0");
        cartSteps.clickUpdateCart();
        cartSteps.verifyUpdatedCartMessage("Cart updated.");
    }



}
