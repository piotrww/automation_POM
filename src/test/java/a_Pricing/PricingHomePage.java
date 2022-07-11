package a_Pricing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PricingHomePage<myElement> extends BasePage {


    @FindBy(css = "a#cantAccessAccount")
    private WebElement loginPopUpTextLink;

    // WebElement myElement =  driver.findElement(By.xpath("/button[contains(text(),'Login')]"));

//    WebElement myElement1 =  driver.findElement(By.xpath("/button[contains(text(),'Login')]"));

    public PricingHomePage(WebDriver driver) {
        super(driver);
    } //Po stworzeniu obiektu HomePage to inicjalizował webdrive i przekazuje do BasePage(rodzic)


    WebElement myElement = driver.findElement(By.cssSelector(".p-ripple"));


    public String getSignInTxt() {


        System.out.println(myElement.getText());
        return myElement.getText();
    }

    public void loginToPricing() throws InterruptedException {

        myElement.click();
        System.out.println("clicked sign in");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String popupsHandle = driver.getWindowHandle();
        System.out.println("extra windows: " + popupsHandle);
        Set<String> extras = driver.getWindowHandles();
        for (String extra : extras) {

            System.out.println(extra);
            if (!extra.equals(popupsHandle)) {
                System.out.println("In If");
                driver.switchTo().window(extra);
                System.out.println("switched focus to popup");
                popupLoginEmail.sendKeys("user@usertest.com");
                loginNextButton.click();

            }
        }
        Thread.sleep(3003);


        //System.out.println(loginPopUpTextLink.getText());
    }
}




