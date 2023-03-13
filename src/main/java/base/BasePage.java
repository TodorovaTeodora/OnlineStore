package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public WebDriver driver;
    private String url;
    private Properties prop;

    public BasePage() throws IOException {
        prop = new Properties();
        FileInputStream data = new FileInputStream(
                System.getProperty("user.dir") + "//src/main/java/resources/config.properties");
        prop.load(data);
    }

    public WebDriver getDriver() throws IOException {
        if(driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }

    public String getUrl() throws IOException {
        url = prop.getProperty("url");
        return url;
    }

    public void takeSnapShot(WebDriver webDriver) throws IOException{
        File srcFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        File destFile = new File( System.getProperty("user.dir") + "//src/screenshots" + timestamp() + ".png" );
        FileUtils.copyFile(srcFile, destFile);
    }

    public String timestamp() {
        return new SimpleDateFormat("yyy-MM-dd HH-mm-ss").format(new Date());
    }
}
