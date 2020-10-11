package com.osanda.pageobjectpattern.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;

    private final By usernameLabel = By.xpath("//table//tr[@class='heading3']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHomePageDashboardUserName() {
        return driver.findElement(usernameLabel).getText();
    }

}