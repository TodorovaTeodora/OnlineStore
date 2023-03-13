import base.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;

import java.io.IOException;

public class OrderCompleteTest extends BasePage {

    public OrderCompleteTest() throws IOException {
    }

    @BeforeTest
    public void setup() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver = null;
    }

    @Test
    public void endToEndTest() {
        HomePage home = new HomePage(driver);
    }
}
