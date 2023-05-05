package xyz.bank.pages;

import org.openqa.selenium.By;
import xyz.bank.utility.Utility;

public class HomePage extends Utility {

    By homeTab = By.xpath("//button[contains(text(),'Home')]");

    By customerLoginTab = By.xpath("//button[contains(text(),'Customer Login')]");

    By bankManagerLoginTab = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    public void clickOnHome(){
        mouseHoverToElementAndClick(homeTab);
    }
    public void clickOnCustomerLogin(){
        clickOnElement(customerLoginTab);
    }

    public void clickOnBankManagerLogin(){
        clickOnElement(bankManagerLoginTab);
    }


    }

