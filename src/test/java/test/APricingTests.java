package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page.BookingHomePage;
import page.PageObjectManager;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class APricingTests {

    private WebDriver driver; //deklaracja zmiennej

    private PageObjectManager pageObjectManager;



    @Before // one
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Piotr_\\automation_tests\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Piotr_\\automation_tests\\firefox\\geckodriver.exe"); //Zmienna środowiskowa, tu jest driver
    //    driver = new FirefoxDriver(); //Zaimportowana klasa FirefoxDriver, stworzenie obiektu, otwarcie przeglądarki.

        //  driver.manage().timeouts().explitWait(10, TimeUnit.SECONDS); //Dwa rodzaje waitów: impicitlyWait oraz expliticWait.
        driver.manage().window().maximize();
        driver.get("https://kantarpricing-dev2-front.azurewebsites.net/");


        pageObjectManager = new PageObjectManager(driver);
    }

    public int monthFromSystem = Calendar.getInstance().get(Calendar.MONTH);


    @Test

    public void checkTextOfTheBar() {

        BookingHomePage bookingHomePage = new BookingHomePage(driver); //CTRL ALT N (inline zmiennej);
        System.out.println("Wypisanie w metodzie (teście LoginTest): " + bookingHomePage.getBarText());
        System.out.println("Zmienna panelText: " + bookingHomePage.getBarText());

        assertEquals(bookingHomePage.getBarText(), "Koronawirus (COVID-19) – wsparcie"); //obiekt, stworzony w 39 wierszu
    }


}