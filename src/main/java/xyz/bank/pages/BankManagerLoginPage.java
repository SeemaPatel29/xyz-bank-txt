package xyz.bank.pages;

import org.openqa.selenium.By;
import xyz.bank.utility.Utility;

public class BankManagerLoginPage extends Utility {

    By bankManagerLoginTab = By.xpath("//button[contains(text(),'Bank Manager Login')]");


    public void clickOnBankManagerLogin(){
        clickOnElement(bankManagerLoginTab);
    }


}
