import base.BasePage;
import jdk.nashorn.internal.runtime.Debug;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HomePage;

import java.io.IOException;

public class Test extends BasePage {

    public test() throws IOException {
    }

    @BeforeMethod
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
