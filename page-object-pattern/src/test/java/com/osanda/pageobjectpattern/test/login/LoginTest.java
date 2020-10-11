package com.osanda.pageobjectpattern.test.login;

import com.osanda.pageobjectpattern.pages.HomePage;
import com.osanda.pageobjectpattern.pages.LoginPage;
import com.osanda.pageobjectpattern.test.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void verifyValidUserLogin() {
        LoginPage loginPage = new LoginPage(driver); //Create Login Page object

        String loginPageTitle = loginPage.getLoginPageTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));    //Verify login page title

        loginPage.login("mgr123", "mgr!23"); //login to application

        HomePage homePage = new HomePage(driver);   // Go the Home page
        Assert.assertTrue(homePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123")); //Verify home page
    }

}