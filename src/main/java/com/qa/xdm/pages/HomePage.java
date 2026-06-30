package com.qa.xdm.pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class HomePage {

    Page page;

    private String filterArrow = "//img[@alt='right arrow']";
    private String companyName = "//input[@placeholder='Enter Company Name']";
    private String country = "//*[@id='mat-select-0']";
    private String state ="//input[@id='mat-input-3']";
    private String applyFilters = "button[type='submit']";

    public HomePage (Page page)
    {
        this.page = page;
    }

    public String getHomePageTitle()
    {
        String title = page.title();
        System.out.println("Page title : " +title);
        return title;
    }

    public String getHomePageURL()
    {
        String url = page.url();
        System.out.println("page.url : "+url);
        return url;
    }

    public void doSearch (String companyValue,String countryValue,String stateName)
    {
        //page.click(filterArrow);
        page.locator("img[alt='filter icon']").locator("..").click();
        page.fill(companyName,companyValue);
        page.locator(country).click();
        page.getByText(countryValue).click();
        page.fill(state,stateName);
        page.getByText(stateName).click();
        page.click(applyFilters);
    }
}
