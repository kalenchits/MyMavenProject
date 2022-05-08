package classWork17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver webDriver;

    public static WebDriver getWebDriver(){
        if (webDriver == null){
            webDriver = DriverManager.getDriver(Config.CHROME);
        }
        return webDriver;
    }
    public static void initDriver(Config config){
        if (webDriver == null){
            webDriver = DriverManager.getDriver(config);
        }
    }
}
