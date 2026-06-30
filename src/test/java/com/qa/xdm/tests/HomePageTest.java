package com.qa.xdm.tests;

import com.microsoft.playwright.Page;
import com.qa.xdm.PlaywrightFactory;
import com.qa.xdm.pages.HomePage;
import com.qa.xdm.pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {

    PlaywrightFactory pf;
    Page page;
    HomePage homePage;
    LoginPage loginPage;

    @BeforeTest
    public void setup()
    {
        pf = new PlaywrightFactory();
        page = pf.initBrowser("chromium");
        loginPage = new LoginPage(page);
        loginPage.Login("skumar@matchbookai.com","Shubh@2027");
        homePage = new HomePage(page);
    }
    @Test
    public void searchTest()
    {
        homePage.doSearch("Dell","US - United States of America (the)","AL");
    }
    @AfterTest
    public  void tearDown()
    {
        page.context().browser().close();
    }
}
