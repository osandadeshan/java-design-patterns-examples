package com.osanda.pageobjectpattern.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;

    private final By usernameTextBox = By.name("uid");
    private final By passwordTextBox = By.name("password");
    private final By titleLabel = By.className("barone");
    private final By loginButton = By.name("btnLogin");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName(String userName) {
        driver.findElement(usernameTextBox).sendKeys(userName);
    }

    public void setPassword(String password) {
        driver.findElement(passwordTextBox).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public String getLoginPageTitle() {
        return driver.findElement(titleLabel).getText();
    }

    public void login(String userName, String password) {
        this.setUserName(userName);
        this.setPassword(password);
        this.clickLoginButton();
    }

}