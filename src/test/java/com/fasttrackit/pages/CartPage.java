package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(css = ".product-subtotal .amount")
    private List<WebElementFacade> listOfProductsSubTotalSpan;
    @FindBy(css = ".cart-subtotal .woocommerce-Price-amount.amount")
    private WebElementFacade cartSubtotalPriceSpan;
    @FindBy(css = ".order-total .woocommerce-Price-amount.amount")
    private WebElementFacade cartGrandTotalPriceSpan;
    @FindBy(css = ".fa-shopping-cart")
    private WebElementFacade cartButton;
    @FindBy(css = ".input-text")
    private WebElementFacade quantityButton;
    @FindBy(css = ".remove")
    private WebElementFacade removeButton;
    @FindBy(css = "div + .button")
    private WebElementFacade updateCartButton;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade updatedCartMessage;

    public int getSubtotalPriceFromProducts(){
        int sum = 0;
        for (WebElementFacade element: listOfProductsSubTotalSpan){
            sum+=getPriceFromString(element.getText());
        }
        return sum;
    }

    public boolean isSubtotalPriceCalculatedCorrectly(){
        int actual = getPriceFromString(cartSubtotalPriceSpan.getText());
        int expected = getSubtotalPriceFromProducts();
        return actual == expected;
    }

    public boolean isGrandTotalPriceCorrect(){
        int subtotal = getPriceFromString(cartSubtotalPriceSpan.getText());
        int fees = 0;
        int expected = subtotal + fees;
        int actual = getPriceFromString(cartGrandTotalPriceSpan.getText());
        return expected == actual;
    }

    public void clickCartButton(){
        clickOn(cartButton);
    }
    public void clickRemoveFromCartButton(){
        clickOn(removeButton);
    }
    public void clickUpdateCartButton(){
        clickOn(updateCartButton);
    }
    public void verifyCartUpdatedMessage(String text){
        updatedCartMessage.shouldContainOnlyText("Cart updated.");
    }



}
