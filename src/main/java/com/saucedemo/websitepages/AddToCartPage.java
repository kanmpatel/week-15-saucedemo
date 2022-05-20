package com.saucedemo.websitepages;

import com.saucedemo.utility.Utilites;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends Utilites {

    public AddToCartPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOutButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement zipCodeField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueButton;

    public void ClickOnCheckOutButton(){
        clickOnElement(checkOutButton);
    }

    public void enterfirstName(String firstName){
        sendTextToElement(firstNameField,firstName);
    }

    public void enterlastName(String lastName){
        sendTextToElement(lastNameField,lastName);
    }

    public void enterZipCode(String zipcode){
        sendTextToElement(zipCodeField,zipcode);
    }

    public void ClickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
