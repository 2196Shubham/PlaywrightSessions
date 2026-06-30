package com.qa.xdm.pages;

import com.microsoft.playwright.Page;

public class LoginPage {

    Page page;

    private String username = "input[id='loginName']";
    private String password = "input[name='password']";
    private String next = "button[type='submit']";

    public LoginPage(Page page)
    {
        this.page = page;
    }
    public void Login(String loginEmail, String loginPassword)
    {
        page.fill(username,loginEmail);
        page.click(next);
        page.fill(password,loginPassword);
        page.click(next);
        page.title();

    }
}
