package com.github.exception;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class LoginPage  extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(LoginPage.class));


    private static By hdrLogin = By.id("logInPanelHeading");
    private static By txtUserName = By.id("txtUsername");
    private static By txtPassword = By.id("txtPassword");
    private static By btnLogin = By.id("btnxLogin");
    private static By alert = By.id("spanMessage");

    public static boolean isLoginPageDisplay() {

        return getDriver().findElement(hdrLogin).isDisplayed();
    }

    public static void setUserName(String userName) {

        getDriver().findElement(txtUserName).sendKeys(userName);
    }

    public static void setPassword(String password) {
        getDriver().findElement(txtPassword).sendKeys(password);
    }

    public static void clickLogin() {
        getDriver().findElement(btnLogin).click();
    }
}
