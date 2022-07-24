package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class AccountPage extends BasePage {

    @FindBy(css = "#post-13 > div > div > div > p:nth-child(1)")
    private WebElementFacade loginMessage;
    @FindBy(css = ".woocommerce-error")
    private WebElementFacade errorLoginMessage;
    @FindBy(css = "#post-13 > div > div > ul > li")
    private WebElementFacade errorText;
    @FindBy(css = ".woocommerce-error")
    private WebElementFacade errorPassword;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade lostPassword;
    @FindBy(css = ".woocommerce-error")
    private WebElementFacade errorInvalidLogin;
    @FindBy(css = ".woocommerce-Input.woocommerce-Input--text.input-text")
    private WebElementFacade resetEmailField;
    @FindBy(css = ".woocommerce-Button.button")
    private WebElementFacade resetButton;
    @FindBy(css = ".site-header-right-link")
    private WebElementFacade signInLink;


    public void verifyLoginSuccessful(String userName){
        loginMessage.shouldContainOnlyText("Hello "+userName+" (not "+userName+"? Log out)");
    }
    public void verifyLoginFailed(String userName){
       errorLoginMessage.shouldContainOnlyText("ERROR: The password you entered for the email address "+userName+" is incorrect. Lost your password?");
    }
    public void verifyErrorMessage(String text){
        errorText.shouldContainOnlyText("Error: Username is required.");
    }
    public void verifyErrorPasswordMessage(String text){
        errorPassword.shouldContainOnlyText("ERROR: The password field is empty.");
    }
    public void verifyLostPasswordMessage(String text){
        lostPassword.shouldContainOnlyText("Password reset email has been sent.");
    }
    public void verifyInvalidEmailError(String text){
        errorInvalidLogin.shouldContainOnlyText("Invalid username or email.");
    }
    public void fillResetEmailField(String email){
        typeInto(resetEmailField, email);
    }
    public void clickResetPassword(){
        clickOn(resetButton);
    }
    public void clickResetEmailField(){
        clickOn(resetEmailField);
    }
    public void clickSignInLink(){
        clickOn(signInLink);
    }



}
