package com.cvlibraryuk.pages;

import com.cvlibraryuk.utility.Utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Resultpage extends Utility {

    private static final Logger log = LogManager.getLogger(Resultpage.class.getName());

    public Resultpage() {
        PageFactory.initElements(driver, this);
    }
        public String verifyTextSuccessfully(String text){
            WebElement result = driver.findElement(By.xpath("//h1[contains(text(),'"+text+"')]"));
            return getTextFromElement(result);

        }
}


