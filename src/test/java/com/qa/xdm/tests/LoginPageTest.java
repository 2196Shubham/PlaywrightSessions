package com.qa.xdm.tests;

import com.microsoft.playwright.Page;
import com.qa.xdm.PlaywrightFactory;
import com.qa.xdm.pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {

    PlaywrightFactory pf;
    Page page;
    LoginPage loginPage;

    @BeforeTest
    public void setup()
    {
        pf = new PlaywrightFactory();
        page = pf.initBrowser("chromium");
        loginPage = new LoginPage(page);
    }
    @Test
    public void loginXdm()
    {
     loginPage.Login("skumar@matchbookai.com","Shubh@2027");
    }
    @AfterTest
    public  void tearDown()
    {
        page.context().browser().close();
    }

}
