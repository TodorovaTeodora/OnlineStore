package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart {

    public WebDriver driver;

    By havePromo = By.id("promo-code");
    By promoTextBox = By.cssSelector("input[name='discount_name']");
    By promoAddButton = By.cssSelector("//span[text()='Add']");
    By proceedToCheckOut= By.cssSelector("a[class='btn btn-primary']");
    By deleteItem= By.xpath("//a[@data-id-product='1']");
    By deleteItem2= By.xpath("//a[@data-id-product='2']");
    By totalValue= By.cssSelector(".cart-total .value");

    public ShoppingCart(WebDriver driver) {this.driver = driver;}
    public WebElement getHavePromo() {return driver.findElement(havePromo);}
    public WebElement getPromoTextBox() {return driver.findElement(promoTextBox);}
    public WebElement getPromoAddButton() {return driver.findElement(promoAddButton);}
    public WebElement getProceedToCheckOut() {return driver.findElement(proceedToCheckOut);}
    public WebElement getDeleteItem() {return driver.findElement(deleteItem);}
    public WebElement getDeleteItem2() {return driver.findElement(deleteItem2);}
    public WebElement getTotalValue() {return driver.findElement(totalValue);}


}
