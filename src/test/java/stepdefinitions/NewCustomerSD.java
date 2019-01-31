package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.LoginPage;
import framework.NewAcctPage;
import framework.NewCustomerPage;

import java.util.List;


public class NewCustomerSD {

    NewCustomerPage customerPage = new NewCustomerPage();
    NewAcctPage acctPage = new NewAcctPage();

    @Given("^user is in login page$")
    public void user_is_in_login_page() throws Throwable {

        customerPage.getPageTitle();


    }

    @When("^user enters userid and password$")
    public void user_enters_userid_and_password(DataTable dataTable) throws Throwable {


        customerPage.enterUserAndPass(dataTable);

    }

    @And("^user clicks on the login button$")
    public void user_clicks_on_the_login_button() throws Throwable {

        customerPage.clickOnLoginBtn();

    }


    @And("^user click on add new customer link$")
    public void user_click_on_add_new_customer_link() throws Throwable {
        customerPage.clickOnAddNewCust();


    }

    @And("^user fills in new customer information and submit$")
    public void user_fills_in_new_customer_information_and_submit(DataTable dataTable) throws Throwable {

        customerPage.enterCustomerInfo(dataTable);


    }


    @Then("^new customer should be registered successfully$")
    public void new_customer_should_be_registered_successfully() throws Throwable {
        customerPage.takeScreenshot();

        customerPage.verifySuccessCustAcct();
    }

    @When("^user inputs userid and password$")
    public void userInputsUseridAndPassword(DataTable dataTable) throws Throwable {
        acctPage.enterUserPwd(dataTable);
    }

    @And("^user then click on login button$")
    public void user_then_click_on_login_button() throws Throwable {

        acctPage.clickOnLoginBtn();

    }


    @When("^user verifies customer account$")
    public void userVerifiesCustomerAccount() throws Throwable {
        acctPage.custRegistered();
    }

    @When("^user click new account$")
    public void userClickNewAccount() throws Throwable {
        acctPage.clickNewAcct();
    }

    @When("^user enter account information$")
    public void userEnterAccountInformation(DataTable dataTable) throws Throwable {
        acctPage.enterAcctInfo(dataTable);
    }

    @When("^user submit the account information$")
    public void userSubmitTheAccountInformation() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        acctPage.submitAcctInfo();
    }

    @Then("^new account created$")
    public void newAccountCreated() throws Throwable {
        acctPage.verifyAcctCreation();
    }




}

