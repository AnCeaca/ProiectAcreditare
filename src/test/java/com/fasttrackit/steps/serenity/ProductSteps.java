package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.ProductPage;
import com.fasttrackit.pages.SearchResultsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jruby.ir.operands.StringLiteral;

public class ProductSteps extends ScenarioSteps{

    private SearchResultsPage searchResultsPage;
    private ProductPage productPage;

    @Step
    public void selectProductFromList(String productName){
        searchResultsPage.selectProductFromList(productName);
    }
    @Step
    public void verifySuccessMessage(String productName){
        productPage.verifySuccessMessage(productName);
    }
    @Step
    public void setQuantityForProduct(String quantity){
        productPage.setProductQuantity(quantity);
    }
    @Step
    public void navigateToShop(){
        productPage.clickShopButton();
    }
}
