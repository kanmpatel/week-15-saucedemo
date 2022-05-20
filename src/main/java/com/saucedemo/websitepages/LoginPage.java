package com.saucedemo.websitepages;

import com.saucedemo.utility.Utilites;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utilites {

    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement usernameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;

    public void enterUserName(String username){
        sendTextToElement(usernameField,username);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }

    public void ClickOnLoginButton(){
        clickOnElement(loginButton);
    }
}
