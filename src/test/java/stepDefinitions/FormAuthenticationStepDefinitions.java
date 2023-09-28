package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FormAuthenticationPage;
import utilities.ConstantUtils;

public class FormAuthenticationStepDefinitions extends WebConnector {
    FormAuthenticationPage page = new FormAuthenticationPage();
    @Given("user navigates to saucedemo Website")
    public void user_navigates_to_saucedemo_website() {
        driver.get(ConstantUtils.BASE_URL);


    }
    @When("I enter correct username as {string} & password as {string}")
    public void i_enter_correct_username_as_password_as(String userName, String password) {
        page.setLoginPageXpath(userName);
        page.setPasswordXpath(password);
    }

    @Then("login should be successful")
    public void login_should_be_successful() {
        page.clickLogin();    }




}
