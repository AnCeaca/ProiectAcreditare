package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(css = ".blog-post-side-layout")
    private List<WebElementFacade> productsList;
    @FindBy(css = ".not-found .page-header")
    private WebElementFacade searchResults;

    public boolean checkProductList(String productName){
        for(WebElementFacade element : productsList){
            if(element.findElement(By.cssSelector(".entry-title a")).getText().equalsIgnoreCase(productName)){
                return true;
            }
        }
        return false;
    }
    public void selectProductFromList(String productName){
        for(WebElementFacade element : productsList){
            if(element.findElement(By.cssSelector(".entry-title a")).getText().equalsIgnoreCase(productName)){
                element.findElement(By.cssSelector("a")).click();
                break;
            }
        }
    }
    public void verifySearchInvalidMessage(String text){
        searchResults.shouldContainOnlyText("NOTHING FOUND");
    }





}
