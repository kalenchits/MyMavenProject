package classWork17DriverManager;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;
    protected static Config config;

    public static WebDriver getWebDriver() throws MalformedURLException {
        if (driver == null){
            driver = DriverManager.getDriver(config);
        }
        setTimeouts(30);
        return driver;
    }

    public static void setTimeouts(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(seconds,TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(seconds,TimeUnit.SECONDS);
    }

    public static void destroy(){
        driver.quit();
        driver = null;
    }
    public static void initDriver(Config config) throws MalformedURLException {
        if (driver == null){
            driver = DriverManager.getDriver(config);
        }
    }

    public static void setConfig(Config theConfig) {
        config = theConfig;
    }


}
