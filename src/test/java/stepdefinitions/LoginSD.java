package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.LoginPage;

public class LoginSD {

    LoginPage loginPage = new LoginPage();


    @Given("^User is on login page$")
    public void user_is_on_login_page() throws Throwable {
        loginPage.getPageTitle();
    }


    @When("^user enters username and password$")
    public void user_enters_username_and_password() throws Throwable {
        loginPage.enterUser("mngr175171");
        loginPage.enterPassword("AmApere");

    }

    @And("^user clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable {
        loginPage.clickOnLoginBtn();

    }

    @Then("^user have manager access to bank$")
    public void user_have_manager_access_to_bank() throws Throwable {
        loginPage.verifyLoginSuccess();

    }

    @When("^user enters invalid \"(.*)\" and valid \"(.*)\"$")
    public void userEntersInvalidAnd(String username, String password) throws Throwable {
        loginPage.enterUser(username);
        loginPage.enterPassword(password);

    }

    @And("^user click on login button$")
    public void userClickOnLoginButton() throws Throwable {
        loginPage.clickOnLoginBtn();

    }

    @Then("^user is prompted with invalid username and password message$")
    public void userIsPromptedWithInvalidUsernameAndPasswordMessage() throws Throwable {
        loginPage.getTextFromAlertPrompt();
        loginPage.acceptAlertPrompt();



    }

    @When("^user enters valid \"(.*)\" and invalid \"(.*)\"$")
    public void user_enters_valid_and_invalid(String username, String password) throws Throwable {
        loginPage.enterUser(username);
        loginPage.enterPassword(password);

    }

    @And("^user  click on login button$")
    public void user_click_on_login_button() throws Throwable {
        loginPage.clickOnLoginBtn();

    }

    @Then("^user  is prompted with invalid username and password message$")
    public void user_is_prompted_with_invalid_username_and_password_message() throws Throwable {
        loginPage.getTextFromAlertPrompt();
        loginPage.acceptAlertPrompt();

    }



}
