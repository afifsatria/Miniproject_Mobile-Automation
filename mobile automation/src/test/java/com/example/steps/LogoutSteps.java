package com.example.steps;
import com.example.app.pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {
    loginPage loginpages = new loginPage();

    @Given("I am successfully login to my account")
    public void iAmSuccessfullyLoginToMyAccount()throws Exception {
        loginpages.productLabelDisplayed();
        loginpages.clicksLogoutButton();
        Thread.sleep(600);
        loginpages.clickEmailField();
        Thread.sleep(600);
        loginpages.inputEmail("bayu@gmail.com");
        Thread.sleep(600);
        loginpages.clickPasswordField();
        loginpages.inputPassword("@@@@");
        loginpages.clickLoginButton();

    }

    @When("I click logout button on product page for logout")
    public void iClickLogoutButtonOnProductPageForLogout()throws Exception {
        Thread.sleep(600);
        loginpages.productLabelDisplayed();
        loginpages.clicksLogoutButton();
    }

    @Then("I successfully logout")
    public void iSuccessfullyLogout() {
        loginpages.logoutButtonDisplayed();
    }
}
