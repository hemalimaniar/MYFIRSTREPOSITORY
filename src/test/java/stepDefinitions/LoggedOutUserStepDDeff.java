package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FormAuthenticationPage;

public class LoggedOutUserStepDDeff extends WebConnector {

    FormAuthenticationPage authenticationPage=new FormAuthenticationPage();

    @When("the user enters {string} in the username field")
    public void theUserEntersInTheUsernameField(String username) {
        authenticationPage.setLoginPageXpath(username);
    }

    @Then("the user enters {string} in the password field")
    public void theUserEntersInThePasswordField(String password) {
        authenticationPage.setPasswordXpath(password);
    }

    @And("the user clicks on the login button")
    public void theUserClicksOnTheLoginButton() {
        authenticationPage.clickLogin();
    }

    @Then("the user can see {string}  text in the page")
    public void theUserCanSeeTextInThePage(String expectedtext) {

        Assert.assertTrue(driver.getPageSource().contains(expectedtext));
    }


}
