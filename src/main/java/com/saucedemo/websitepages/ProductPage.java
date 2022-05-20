package com.saucedemo.websitepages;

import com.saucedemo.utility.Utilites;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends Utilites {

    public ProductPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@class=\"product_sort_container\"]")
    WebElement filterProductDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    List<WebElement> addtoCartButton;

    @CacheLookup
    @FindBy(xpath = "//a[@class=\"shopping_cart_link\"]")
    WebElement shoppingCrtLink;

    public void selectProductFilterFromDropDown(String filter){
        selectByVisibleTextFromDropDown(filterProductDropDown,filter);
    }

    public void clickOnAddToCartProductOfCheapestProduct() {
        clickOnElement(addtoCartButton.get(0));
    }

    public void clickOnAddToCartProductOfCostliestProduct() {
        int sizeOfProduct = addtoCartButton.size();
        clickOnElement(addtoCartButton.get(sizeOfProduct-1));
    }

    public void clickOnShoppingCrtLink(){
        clickOnElement(shoppingCrtLink);
    }
}
