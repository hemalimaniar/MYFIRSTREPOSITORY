package pageObjects;

import browserControl.WebConnector;

public class FormAuthenticationPage extends WebConnector {
    String loginPageXpath = "//input[@id='user-name']";
    String passwordXpath = "//input[@id='password']";
    String clickLoginXpath = "//input[@id='login-button']";

    public void setLoginPageXpath(String userName) {
        BasePage.findElementByXpath(10, loginPageXpath).sendKeys(userName);
    }

    public void setPasswordXpath(String password) {
        BasePage.findElementByXpath(10, passwordXpath).sendKeys(password);
    }

    public void clickLogin() {
        BasePage.findElementByXpath(10, clickLoginXpath).click();
    }

}
