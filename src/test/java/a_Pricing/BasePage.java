package a_Pricing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BasePage {



    WebDriver driver;



    public BasePage(WebDriver driver) {
        this.driver = driver; //driver z linii 8 przypisz do drivera, który dostałeś z konstruktura.
        PageFactory.initElements(driver, this); // FIndBy się uruchamia z tym driverem (initElements używa drivera)
    } //PageFactory -> realizacja POP za pomocą FindBy.


    //Elements FindBy

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    private WebElement loginButton;





}
