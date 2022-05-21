package com.example.steps;

import com.example.app.pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    loginPage loginpage = new loginPage();

    @Given("I am on alta shop apps")
    public void iAmOnAltaShopApps() {
        loginpage.logoutButtonDisplayed();
    }

    @When("I clicks logout button")
    public void iClicksLogoutButton() {
        loginpage.clicksLogoutButton();
    }

    @And("I go to login page")
    public void iGoToLoginPage() {
        loginpage.loginButtonDisplayed();
    }

    @And("I input {string}")
    public void iInput(String email) throws Exception {
        Thread.sleep(1000);
        loginpage.clickEmailField();
        loginpage.inputEmail(email);
    }

    @And("Input {string}")
    public void input(String password) throws Exception {
        Thread.sleep(1000);
        loginpage.clickPasswordField();
        loginpage.inputPassword(password);
    }

    @And("I Click login button")
    public void iClickLoginButton() {
        loginpage.clicksLoginButton();
    }

    @Then("I get the {string}")
    public void iGetThe(String result) {
        if (result.equals("product_page")){
            loginpage.productLabelDisplayed();
        } else if (result.equals("Email atau Password invalid")){
            loginpage.invalidEmailOrPasswordDisplayed();
        } else if (result.equals("Passsword can not be empty")){
            loginpage.passwordNullDisplayed();
        } else {
            loginpage.emailNullDisplayed();
        }

    }

    @And("Null data")
    public void nullData() throws Exception {
        loginpage.clickPasswordField();
        loginpage.clickEmailField();
    }

    @And("I click login button")
    public void iClicksLoginButton() {
        loginpage.clickLoginButton();
    }

    @Then("the all the error messages appear")
    public void theAllTheErrorMessagesAppear() {
        loginpage.passwordNullDisplayed();
        loginpage.emailNullDisplayed();
    }
}
