package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.SearchResultsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class SearchSteps extends ScenarioSteps {

    private HomePage homePage;
    private SearchResultsPage searchResultsPage;

    @Step
    public void performSearch(String keyword){
        homePage.clickSearchField();
        homePage.setSearchField(keyword);
        homePage.clickSearchIcon();
    }
    @Step
    public void checkProductFromList(String productName){
        Assert.assertTrue(searchResultsPage.checkProductList(productName));
    }
    @Step
    public void verifyInvalidSearchMessage(String text){
        searchResultsPage.verifySearchInvalidMessage(text);
    }



}
