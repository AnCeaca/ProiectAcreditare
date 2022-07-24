package com.fasttrackit.features.search;

import com.fasttrackit.utils.Constants;
import org.junit.Test;

public class RegisterTests extends BaseTests{

    @Test
    public void validRegisterTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToRegister();
        loginSteps.setRegisterCredentials(Constants.REGISTER_EMAIL, Constants.REGISTER_PASS);
        loginSteps.clickRegisterButton();
        loginSteps.verifyLoginSuccessful("ceaca.andreea3");
    }

    @Test
    public void invalidEmailRegisterTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToRegister();
        loginSteps.setRegisterCredentials("ceaca.andreea@com", "Testare123456!@");
        loginSteps.clickRegisterButton();
        loginSteps.verifyInvalidLoginMessage("Error: Please provide a valid email address.");
    }

    @Test
    public void blankPasswordRegisterTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToRegister();
        loginSteps.setRegisterCredentials("ceaca.andreea3@gmail.com", "");
        loginSteps.clickRegisterButton();
        loginSteps.verifyBlankPassMessage("Error: Please enter an account password.");
    }
    @Test
    public void existentEmailRegisterTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToRegister();
        loginSteps.setRegisterCredentials("ceaca.andreea@yahoo.com", "Testare12345!@");
        loginSteps.clickRegisterButton();
        loginSteps.verifyRegisterErrorMessage("Error: An account is already registered with your email address. Please log in.");
    }
}
