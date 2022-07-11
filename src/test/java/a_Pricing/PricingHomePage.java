package a_Pricing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PricingHomePage<myElement> extends BasePage {


    // WebElement myElement =  driver.findElement(By.xpath("/button[contains(text(),'Login')]"));

//    WebElement myElement1 =  driver.findElement(By.xpath("/button[contains(text(),'Login')]"));

    public PricingHomePage(WebDriver driver) {
        super(driver);
    } //Po stworzeniu obiektu HomePage to inicjalizował webdrive i przekazuje do BasePage(rodzic)


    WebElement myElement = driver.findElement(By.cssSelector(".p-ripple"));


    public String getSignInTxt()  {


        System.out.println(myElement.getText());
        return myElement.getText();
    }

}




