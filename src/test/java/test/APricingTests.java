package test;


import a_Pricing.PricingHomePage;
import a_Pricing.PricingPageObjectManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BookingHomePage;
import page.PageObjectManager;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.*;


public class APricingTests {

    private WebDriver driver;
    private PricingPageObjectManager pricingPageObjectManager;




    @Before // one
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Piotr_\\automation_tests\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver(); //Zaimportowana klasa ChromeDriver, stworzenie obiektu, otwarcie przeglądarki.

        driver.manage().window().maximize();




        driver.get("https://kantarpricing-dev2-front.azurewebsites.net/");

        pricingPageObjectManager = new PricingPageObjectManager(driver);

        System.out.println("before wait");
        TimeUnit.SECONDS.sleep(3);

        //Dwa rodzaje waitów: impicitlyWait oraz expliticWait.
        System.out.println("after wait");


        String LoginText = pricingPageObjectManager.getPricingHomePage().getSignInTxt().trim();
        System.out.println("login text: " + LoginText);
        assertEquals(LoginText, "Sign in");





    }

@Test
    public void enterUserNameANdPassword() throws InterruptedException {

    pricingPageObjectManager.getPricingHomePage().loginToPricing();

    }

//    public void loginToPricing()  {


  //      pricingPageObjectManager.getPricingHomePage().loginToPricing();
    //    System.out.println("login popup");

   // }


}