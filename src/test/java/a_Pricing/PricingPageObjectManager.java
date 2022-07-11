package a_Pricing;

import org.openqa.selenium.WebDriver;


public class PricingPageObjectManager {
    private WebDriver driver;
    private PricingHomePage pricingHomePage;


    public PricingPageObjectManager(WebDriver driver) { //konstruktor
        this.driver = driver;
    }

    public PricingHomePage getPricingHomePage() {

        return (pricingHomePage == null) ? pricingHomePage = new PricingHomePage(driver) : pricingHomePage; //Zamiast if.

        // to samo co wyżej
        //      if
        //      (bookingHomePage == null) {
        //        return bookingHomePage = new BookingHomePage(driver);
        //     } else {
        //         return bookingHomePage;
        //     }

    }



}
//ternary operator
;

//porządkowanie: CTRL ALT L