package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElementFacade emailField;
    @FindBy(id = "password")
    private WebElementFacade passwordField;
    @FindBy(css = "[value=Login]")
    private WebElementFacade loginButton;
    @FindBy(css = ".woocommerce-LostPassword")
    private WebElementFacade forgotPasswordButton;
    @FindBy(css = ".woocommerce-Input")
    private WebElementFacade forgotPasswordField;
    @FindBy(css = ".woocommerce-form__input")
    private WebElementFacade rememberMeButton;
    @FindBy(css = ".woocommerce-MyAccount-navigation-link--customer-logout")
    private WebElementFacade logoutButton;
    @FindBy(id = ".u-column2 h2")
    private WebElementFacade registerLink;
    @FindBy(id = "reg_email")
    private WebElementFacade registerEmailField;
    @FindBy(id = "reg_password")
    private WebElementFacade registerPasswordField;
    @FindBy(css = ".woocommerce-FormRow .woocommerce-Button.button")
    private WebElementFacade registerButton;
    @FindBy(css = ".woocommerce-error")
    private WebElementFacade errorRegister;
    @FindBy(css = ".woocommerce-error")
    private WebElementFacade invalidLogin;
    @FindBy(css = ".woocommerce-error")
    private WebElementFacade invalidPass;


    public void setEmailField(String email) {
        waitFor(emailField);
        typeInto(emailField, email);
    }
    public void setPasswordField(String password) {
        typeInto(passwordField, password);
    }
    public void clickLoginButton() {
        clickOn(loginButton);
    }
    public void clickForgotPasswordButton(){
        clickOn(forgotPasswordButton);
    }
    public void setEmailForResetPassword(String email){
        typeInto(forgotPasswordField, email);
    }
    public void clickRememberMeButton(){
        clickOn(rememberMeButton);
    }
    public void clickLogoutButton(){
        clickOn(logoutButton);
    }
    public void clickRegisterLink(){
        clickOn(registerLink);
    }
    public void setRegisterEmailField(String email){
        typeInto(registerEmailField, email);
    }
    public void setRegisterPasswordField(String pass){
        typeInto(registerPasswordField, pass);
    }
    public void clickRegisterButton(){
        clickOn(registerButton);
    }
    public void verifyRegisterErrorMessage(String text){
        errorRegister.shouldContainOnlyText("Error: An account is already registered with your email address. Please log in.");
    }
    public void verifyInvalidLoginMessage(String text){
        invalidLogin.shouldContainOnlyText("Error: Please provide a valid email address.");
    }
    public void verifyBlankPassMessage(String text){
        invalidPass.shouldContainOnlyText("Error: Please enter an account password.");
    }
}
