package xyz.bank.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import xyz.bank.utility.Utility;

public class BaseTest extends Utility {
    String browser= PropertyReader.getInstance().getProperty("browser");
    // String browser = "Chrome";
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);


    }
    @AfterMethod
    public void tearDown(){

        //closeBrowser();
    }

}
