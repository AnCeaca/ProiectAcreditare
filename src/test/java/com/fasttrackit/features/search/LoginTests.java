package com.fasttrackit.features.search;

import com.fasttrackit.utils.Constants;
import org.junit.Test;

public class LoginTests extends BaseTests{

    @Test
    public void loginWithValidCredentialsTest(){
        loginSteps.performLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        loginSteps.verifyLoginSuccessful("ceaca.andreea");
    }
    @Test
    public void loginWithInvalidEmail(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials("ceaca.andreea.com", "123456");
        loginSteps.clickLogin();
        loginSteps.verifyLoginFailed("ceaca.andreea@yahoo.com");
    }

    @Test
    public void loginWithInvalidPassword(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials(Constants.USER_EMAIL, "123456");
        loginSteps.clickLogin();
        loginSteps.verifyLoginFailed("ceaca.andreea@yahoo.com");
    }

    @Test
    public void loginWithBlankCredentials(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials(" ", " ");
        loginSteps.clickLogin();
        loginSteps.verifyErrorText("Error: Username is required.");
    }
    @Test
    public void loginWithBlankPassword(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials(Constants.USER_EMAIL, " ");
        loginSteps.clickLogin();
        loginSteps.verifyPasswordErrorMessage("ERROR: The password field is empty.");
    }
    @Test
    public void verifyForgotPasswordButton(){
        loginSteps.navigateToHomepage();
        loginSteps.clickSignInLink();
        loginSteps.clickForgotPasswordButton();
        loginSteps.setResetEmailField("ceaca.andreea@yahoo.com");
        loginSteps.clickResetPassword();
        loginSteps.verifyForgotPassword("Password reset email has been sent.");
    }
    @Test
    public void verifyForgotPasswordWithInvalidUsername(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLogin();
        loginSteps.clickForgotPasswordButton();
        loginSteps.setEmailForReset("ceaca.andreea@com");
        loginSteps.verifyErrorInvalidEmail("Invalid username or email.");
    }
    @Test
    public void verifyRememberMeButton(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials(Constants.USER_EMAIL, Constants.USER_PASS);
        loginSteps.clickRememberMeButton();
        loginSteps.clickLogin();
        loginSteps.doLogout();
//        verify email and password saved in the fields
    }








}
