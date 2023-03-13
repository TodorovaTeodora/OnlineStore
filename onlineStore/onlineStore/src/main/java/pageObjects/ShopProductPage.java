package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopProductPage {
    public WebDriver driver;

    By sizeOption = By.id("group_1");
    By quantityIncreaseButton = By.xpath("//i[@class='material-icons touchspin-up']");
    By quantityDecreaseButton = By.xpath("//i[@class='material-icons touchspin-down']");
    By addToCartButton = By.cssSelector("[data-button-action]");
    By homePageLink = By.xpath("//span[text()='Home']");

    public ShopProductPage(WebDriver driver) {
           this.driver = driver;
    }
    public WebElement getSizeOption() {
           return driver.findElement(sizeOption);
    }
    public WebElement getQuantityIncreaseButton() {
           return driver.findElement(quantityIncreaseButton);
    }
    public WebElement getQuantityDecreaseButton() {
           return driver.findElement(quantityDecreaseButton);
    }
    public WebElement getAddToCartButton() {
           return driver.findElement(addToCartButton);
    }
    public WebElement getHomePageLink() {
           return driver.findElement(homePageLink);
   }
}
