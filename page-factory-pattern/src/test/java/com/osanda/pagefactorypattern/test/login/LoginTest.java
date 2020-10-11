package com.osanda.pagefactorypattern.test.login;

import com.osanda.pagefactorypattern.page.CommonPage;
import com.osanda.pagefactorypattern.page.HomePage;
import com.osanda.pagefactorypattern.page.LoginPage;
import com.osanda.pagefactorypattern.test.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends TestBase {

    @Test
    public void verifyValidUserLogin() {
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        CommonPage commonPage = PageFactory.initElements(driver, CommonPage.class);

        // Verify the login page tab title
        assertEquals(commonPage.getBrowserTabTitle(), "Login - My Store");

        // Input email address
        loginpage.setEmail("osanda@mailinator.com");

        // Input password
        loginpage.setPassword("1qaz2wsx@");

        // Click on SignIn button
        loginpage.clickOnSignInButton();

        // Verify the my store page tab title
        assertEquals(commonPage.getBrowserTabTitle(), "My account - My Store");

        // Verify the username of the logged-in user
        assertEquals(homepage.getLoggedInUsername(), "Osanda Nimalarathna");

        // Click on Logout link
        homepage.clickOnLogoutLink();

        // Verify the login page tab title
        assertEquals(commonPage.getBrowserTabTitle(), "Login - My Store");
    }

}