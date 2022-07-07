package a_Pricing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    private WebElement loginButton;

    //  WebElement myElement =  driver.findElement(By.xpath("/button[contains(text(),'Login')]"));

    WebElement myElement1 =  driver.findElement(By.xpath("/button[contains(text(),'Login')]"));

    public HomePage(WebDriver driver) {
        super(driver);
    } //Po stworzeniu obiektu HomePage to inicjalizował webdrive i przekazuje do BasePage(rodzic)

    WebElement myElement =  driver.findElement(By.xpath("/button[contains(text(),'Login')]"));


    public void clickLoginButton() {
        loginButton.click();
    }

}




