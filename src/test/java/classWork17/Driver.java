package classWork17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getWebDriver(){
        if (driver == null){
            driver = DriverManager.getDriver(Config.CHROME);
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
    public static void initDriver(Config config){
        if (driver == null){
            driver = DriverManager.getDriver(config);
        }
    }
}
