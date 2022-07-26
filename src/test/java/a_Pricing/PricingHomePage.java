package a_Pricing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PricingHomePage<myElement> extends BasePage {


    @FindBy(css = "a#cantAccessAccount")
    private WebElement loginPopUpTextLink;

    @FindBy(css = "input#i0118")
    private WebElement pInput;

    @FindBy(css = "input#idSIButton9")
    private WebElement inputSignIn;

    @FindBy(css = "div#consentHeader")
    private WebElement loginWarningMicrosoft;

    @FindBy(css = ".navbar-nav a")
    List<WebElement> topMenuTexts;



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
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        String popupsHandle = driver.getWindowHandle();
        System.out.println("extra windows: " + popupsHandle);
        Set<String> extras = driver.getWindowHandles();
        for (String extra : extras) {

            System.out.println(extra);
            if (!extra.equals(popupsHandle)) {
                System.out.println("In If");
                driver.switchTo().window(extra);
                System.out.println("switched focus to popup");

                Thread.sleep(3000);
                popupLoginEmail.sendKeys("qlibqaservice@kantar.com");
                loginNextButton.click();

                //await asynchroniczny, spróbować.


                Thread.sleep(2000);
                pInput.sendKeys("Automation@41");


                Thread.sleep(2000);
                inputSignIn.click();
                System.out.println("before Microsoft warning");
                Thread.sleep(2000);
                System.out.println(loginWarningMicrosoft.getText());
                inputSignIn.click();

            }
        }
        Thread.sleep(3000);
    }


    public void checkMainElementsOfTopMenu() {


            List<WebElement> m = driver.findElements(By.cssSelector(".navbar-nav a"));
            // iterate over list
            for(int i = 0; i< m.size(); i++) {
                //obtain text
                String s = m.get(i).getText();
                System.out.println("Text is: " + s);
            }


    }
}




