package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.CartPage;
import com.fasttrackit.pages.ProductPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CartSteps extends ScenarioSteps {

    private ProductPage productPage;
    private CartPage cartPage;

    @Step
    public void clickAddToCart(){
        productPage.clickAddToCartButton();
    }

    @Step
    public void checkSubtotalPriceIsDisplayedCorrectly(){
        Assert.assertTrue("The subtotal price is not correct",cartPage.isSubtotalPriceCalculatedCorrectly());
    }

    @Step
    public void checkGrandTotalPriceIsCorrect(){
        Assert.assertTrue("Total price is not correct", cartPage.isGrandTotalPriceCorrect());
    }

    @Step
    public void clickCartButton(){
        cartPage.clickCartButton();
    }
    @Step
    public void clickRemoveFromCartButton(){
        cartPage.clickCartButton();
        cartPage.clickRemoveFromCartButton();
    }
    @Step
    public void clickUpdateCart(){
        cartPage.clickUpdateCartButton();
    }
    @Step
    public void verifyUpdatedCartMessage(String text){
        cartPage.verifyCartUpdatedMessage(text);
    }




}
