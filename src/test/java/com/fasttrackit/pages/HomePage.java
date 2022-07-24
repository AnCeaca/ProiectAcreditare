package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")
public class HomePage extends BasePage {

    @FindBy (css = "[title = 'Login']")
    private WebElementFacade accountLink;
    @FindBy (css = ".u-column1 h2")
    private WebElementFacade loginLink;
    @FindBy (css = ".search-btn")
    private WebElementFacade searchButton;
    @FindBy (css= ".search-field")
    private WebElementFacade searchField;
    @FindBy (css = ".search-submit")
    private WebElementFacade searchIcon;


    public void clickAccountLink(){
        clickOn(accountLink);
    }
    public void clickLoginLink(){
        clickOn(loginLink);
    }
    public void clickSearchField(){
        clickOn(searchButton);
    }
    public void setSearchField(String keyword){
        typeInto(searchField, keyword);
    }
    public void clickSearchIcon(){
        clickOn(searchIcon);
    }





}
