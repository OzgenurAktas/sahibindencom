package driver;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import org.openqa.selenium.WebDriver;

public class Driver {

    public static WebDriver webDriver;

    public Driver() {

    }

    @BeforeSuite
    public void initializeDriver() {
        webDriver = DriverFactory.getDriver();
        webDriver.get("https://www.sahibinden.com/");
        webDriver.manage().window().maximize();
    }

    @AfterSuite
    public void closeDriver() {
    }
}
