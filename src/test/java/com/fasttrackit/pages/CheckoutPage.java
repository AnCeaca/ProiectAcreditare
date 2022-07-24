package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends BasePage{

        @FindBy(id = "menu-item-1729")
        private WebElementFacade checkoutButton;
        @FindBy(id = "billing_first_name")
        private WebElementFacade firstNameField;
        @FindBy(id = "billing_last_name")
        private WebElementFacade lastNameField;
        @FindBy(id = "billing_address_1")
        private WebElementFacade addressField;
        @FindBy(id = "billing_city")
        private WebElementFacade cityField;
        @FindBy(id = "billing_postcode")
        private WebElementFacade postcodeField;
        @FindBy(id = "billing_phone")
        private WebElementFacade phoneField;
        @FindBy(id = "place_order")
        private WebElementFacade orderButton;
        @FindBy(id = "billing_email")
        private WebElementFacade emailField;
        @FindBy(css = ".woocommerce-notice")
        private WebElementFacade orderReceivedMessage;
        @FindBy(css = ".woocommerce-error")
        private WebElementFacade requiredField;


    public void clickCheckoutButton(){
        clickOn(checkoutButton);
    }

    public void setFirstName(String firstName){
        typeInto(firstNameField, firstName);
    }
    public void setLastName(String lastName){
        typeInto(lastNameField, lastName);
    }
    public void setAddress(String address){
        typeInto(addressField, address);
    }
    public void setCity(String city){
        typeInto(cityField, city);
    }
    public void setPostcodeField(String postcode){
        typeInto(postcodeField, postcode);
    }
    public void setPhoneField(String phone){
        typeInto(phoneField, phone);
    }
    public void clickOrderButton(){
        clickOn(orderButton);
    }
    public void setEmail(String email){
        typeInto(emailField, email);
    }
    public void verifyOrderReceived(String text){
        orderReceivedMessage.shouldContainOnlyText("Thank you. Your order has been received.");
    }
    public void verifyRequiredField(String text){
        requiredField.shouldContainOnlyText("Billing Email address is a required field.");
    }






}
