package com.fasttrackit.features.search;


import org.junit.Test;

public class ProductTests extends BaseTests{

    @Test
    public void verifyUserCanSelectCategory(){
        loginSteps.navigateToHomepage();
        productSteps.navigateToShop();
    }

}
