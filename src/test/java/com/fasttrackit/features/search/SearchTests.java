package com.fasttrackit.features.search;

import com.fasttrackit.utils.Constants;
import org.junit.Test;

public class SearchTests extends BaseTests {

    @Test
    public void searchProductTest(){
        loginSteps.performLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.performSearch("beanie");
        searchSteps.checkProductFromList("Beanie with Logo");
    }
    @Test
    public void searchWithInvalidInput(){
        loginSteps.performLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.performSearch("@@@@");
        searchSteps.verifyInvalidSearchMessage("NOTHING FOUND");
    }



}
