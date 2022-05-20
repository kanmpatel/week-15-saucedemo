package com.saucedemo.websitepages;

import com.saucedemo.utility.Utilites;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utilites {

    public CheckOutPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    WebElement orderCompeletedMessage;

    public void ClickOnFinishButton(){
        clickOnElement(finishButton);
    }

    public String getVerifyOrderCompeletedMessage(){
        return getTextFromElement(orderCompeletedMessage);
    }
}
