package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.AccountPage;
import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;

    @Step
    public void navigateToHomepage(){
        homePage.open();
    }
    @Step
    public void navigateToLogin(){
        homePage.clickAccountLink();
        homePage.clickLoginLink();
    }
    @Step
    public void setCredentials(String email, String pass){
        loginPage.setEmailField(email);
        loginPage.setPasswordField(pass);
    }
    @Step
    public void clickLogin(){
        loginPage.clickLoginButton();
    }
    @Step
    public void performLogin(String email, String password){
        navigateToHomepage();
        navigateToLogin();
        setCredentials(email, password);
        clickLogin();
    }
    @Step
    public void verifyLoginSuccessful(String userName){
        accountPage.verifyLoginSuccessful(userName);
    }
    @Step
    public void verifyLoginFailed(String userName){
        accountPage.verifyLoginFailed(userName);
    }
    @Step
    public void verifyErrorText(String text){
        accountPage.verifyErrorMessage(text);
    }
    @Step
    public void verifyPasswordErrorMessage(String text){
        accountPage.verifyErrorPasswordMessage(text);
    }
    @Step
    public void clickForgotPasswordButton(){
        loginPage.clickForgotPasswordButton();
    }
    @Step
    public void setEmailForReset(String email){
        loginPage.setEmailForResetPassword(email);
    }
    @Step
    public void verifyForgotPassword(String text){
        accountPage.verifyLostPasswordMessage(text);
    }
    @Step
    public void verifyErrorInvalidEmail(String text){
        accountPage.verifyInvalidEmailError(text);
    }
    @Step
    public void clickRememberMeButton(){
        loginPage.clickRememberMeButton();
    }
    @Step
    public void doLogout(){
        loginPage.clickLogoutButton();
    }
    @Step
    public void navigateToRegister(){
        homePage.clickAccountLink();
      //  loginPage.clickRegisterLink();
    }
    @Step
    public void setRegisterCredentials(String email, String pass){
        loginPage.setRegisterEmailField(email);
        loginPage.setRegisterPasswordField(pass);
    }
    @Step
    public void clickRegisterButton(){
        loginPage.clickRegisterButton();
    }
    @Step
    public void verifyRegisterErrorMessage(String text){
        loginPage.verifyRegisterErrorMessage(text);
    }
    @Step
    public void verifyInvalidLoginMessage(String text){
        loginPage.verifyInvalidLoginMessage(text);
    }
    @Step
    public void verifyBlankPassMessage(String text){
        loginPage.verifyBlankPassMessage(text);
    }
    @Step
    public void setResetEmailField(String email){
        accountPage.clickResetEmailField();
        accountPage.fillResetEmailField(email);
    }
    @Step
    public void clickResetPassword(){
        accountPage.clickResetPassword();
    }
    @Step
    public void clickSignInLink(){
        accountPage.clickSignInLink();
    }





}
