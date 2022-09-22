package com.cvlibraryuk.pages;

import com.cvlibraryuk.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.checkerframework.checker.units.qual.min;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//*[@id='keywords']")
    WebElement jobtitle;

    @CacheLookup
    @FindBy(xpath = "//*[@id='location']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//*[@id='distance_adv']")
    WebElement distance;


    @CacheLookup
    @FindBy(xpath = "//*[@id='more-search-options']")
    WebElement Moresearchoptionlink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//*[@id='sal-max']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//*[@id='sal-type']")
    WebElement salarytype;

    @CacheLookup
    @FindBy(xpath = "")
    WebElement jobtype;

    @CacheLookup
    @FindBy(xpath = "//*[@id='adv-search-btn']")
    WebElement clickfindjobsbutton;


    public String getVerifytheResultText() {
        return getVerifytheResultText();
    }

    public void Enterjobtitle(String title) {
        sendTextToElement(jobtitle, title);

    }

    public void enterlocation(String loc) {
        sendTextToElement(location, loc);

    }

    public void Selectdistance(String mile) {
        selectByVisibleTextFromDropDown(distance, mile);
    }

    public void clickonmoresearchoptionlink() {
        clickOnElement(Moresearchoptionlink);
    }

    public void entarsalaryMin(String min) {
        sendTextToElement(salaryMin, min);
    }

    public void entersalarymax(String max) {
        sendTextToElement(salaryMax, max);
    }

    public void selectsalarytype(String Stype) {
        selectByVisibleTextFromDropDown(salarytype, Stype);
    }

    public void selectjobtype(String Jobtyp) {
        selectByVisibleTextFromDropDown(jobtype, Jobtyp);
    }

    public void clickfindjobsbutton() {
        clickOnElement(clickfindjobsbutton);
    }



    }










