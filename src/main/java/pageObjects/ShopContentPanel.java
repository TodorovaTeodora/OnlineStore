package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopContentPanel {

    public WebDriver driver;
    By continueShopping = By.xpath("//button[contains(text(),'Continue')]");
    By checkOutButton = By.xpath("//a[@class='btn btn-primary']");

    public ShopContentPanel(WebDriver driver) {
           this.driver = driver;
    }
    public WebElement getContinueShopping() {
           return driver.findElement(continueShopping);
    }
    public WebElement getCheckOutButton() {
           return driver.findElement(checkOutButton);
    }
}
