package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.jruby.ir.operands.StringLiteral;

public class ProductPage extends BasePage {

    @FindBy(css = ".button.alt")
    private WebElementFacade addToCartButton;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade successMessage;
    @FindBy(css = ".input-text")
    private WebElementFacade quantityField;
    @FindBy(id = "menu-item-1728")
    private WebElementFacade shopButton;

    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }
    public void verifySuccessMessage(String productName){
        successMessage.shouldContainText(productName + " has been added to your cart. View cart");
    }
    public void setProductQuantity(String quantity){
        typeInto(quantityField, quantity);
    }
    public void clickShopButton(){
        clickOn(shopButton);
    }



}
