$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "As user, I would like to Find the car by searching",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3554649700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User navigates saucedemo page and complete the item purchas",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchas",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with credential username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I filter the products by Price \"Price (high to low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select cheapest \u0026 costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter details firstname \"firstName\", lastName \"lastName\" and zipPostalCode \"Zip/PostalCode\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should be able to see message \u0027Thank you for your order\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductFilteringPageSteps.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 264315900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 63
    }
  ],
  "location": "ProductFilteringPageSteps.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 287067800,
  "status": "passed"
});
formatter.match({
  "location": "ProductFilteringPageSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 159433200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (high to low)",
      "offset": 32
    }
  ],
  "location": "ProductFilteringPageSteps.iFilterTheProductsByPrice(String)"
});
formatter.result({
  "duration": 154344400,
  "status": "passed"
});
formatter.match({
  "location": "ProductFilteringPageSteps.iSelectCheapestCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 121672000,
  "status": "passed"
});
formatter.match({
  "location": "ProductFilteringPageSteps.iOpenShoppingCart()"
});
formatter.result({
  "duration": 72690100,
  "status": "passed"
});
formatter.match({
  "location": "ProductFilteringPageSteps.iGoToCheckout()"
});
formatter.result({
  "duration": 74988400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "firstName",
      "offset": 27
    },
    {
      "val": "lastName",
      "offset": 49
    },
    {
      "val": "Zip/PostalCode",
      "offset": 78
    }
  ],
  "location": "ProductFilteringPageSteps.iEnterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 314436400,
  "status": "passed"
});
formatter.match({
  "location": "ProductFilteringPageSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 95134400,
  "status": "passed"
});
formatter.match({
  "location": "ProductFilteringPageSteps.iClickOnFinishButton()"
});
formatter.result({
  "duration": 88491400,
  "status": "passed"
});
formatter.match({
  "location": "ProductFilteringPageSteps.iShouldBeAbleToSeeMessageThankYouForYourOrder()"
});
formatter.result({
  "duration": 40943800,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cT[hank you for your order]\u003e but was:\u003cT[HANK YOU FOR YOUR ORDER]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.saucedemo.steps.ProductFilteringPageSteps.iShouldBeAbleToSeeMessageThankYouForYourOrder(ProductFilteringPageSteps.java:70)\r\n\tat ✽.Then I should be able to see message \u0027Thank you for your order\u0027(purchase.feature:15)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 207754200,
  "status": "passed"
});
});