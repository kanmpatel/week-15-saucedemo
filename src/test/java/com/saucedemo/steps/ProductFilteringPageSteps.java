package com.saucedemo.steps;

import com.saucedemo.websitepages.AddToCartPage;
import com.saucedemo.websitepages.CheckOutPage;
import com.saucedemo.websitepages.LoginPage;
import com.saucedemo.websitepages.ProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ProductFilteringPageSteps {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String username, String password) {
        new LoginPage().enterUserName(username);
        new LoginPage().enterPassword(password);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().ClickOnLoginButton();
    }

    @And("^I filter the products by Price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String filter) {
        new ProductPage().selectProductFilterFromDropDown(filter);
    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() throws InterruptedException {
        new ProductPage().clickOnAddToCartProductOfCheapestProduct();
        new ProductPage().clickOnAddToCartProductOfCostliestProduct();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new ProductPage().clickOnShoppingCrtLink();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new AddToCartPage().ClickOnCheckOutButton();
    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String firstName, String lastName, String zipCode) {
        new AddToCartPage().enterfirstName(firstName);
        new AddToCartPage().enterlastName(lastName);
        new AddToCartPage().enterZipCode(zipCode);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new AddToCartPage().ClickOnContinueButton();
    }


    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckOutPage().ClickOnFinishButton();
    }

    @Then("^I should be able to see message 'Thank you for your order'$")
    public void iShouldBeAbleToSeeMessageThankYouForYourOrder() {
        Assert.assertEquals("Thank you for your order",new CheckOutPage().getVerifyOrderCompeletedMessage());
    }
}
