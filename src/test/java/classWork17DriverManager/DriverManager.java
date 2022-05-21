package classWork17DriverManager;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;

public class DriverManager {

    public static WebDriver getDriver(Config config) throws MalformedURLException {
        switch (config){
            case CHROME:
                return getChromeDriver();
            case FIREFOX:
                return getFireFoxDriver();
            case EDGE:
                return getEdgeDriver();
            case REMOTE:
                return getRemoteDriver();
            default:
                throw null;
        }
    }

    private static WebDriver getChromeDriver(){
        ChromeOptions caps = new ChromeOptions();
        caps.addArguments("start-maximized");
        return new ChromeDriver(caps);
    }

    private static WebDriver getFireFoxDriver(){
        return new FirefoxDriver();
    }

    private static WebDriver getEdgeDriver(){
        return new EdgeDriver();
    }

    private static WebDriver getRemoteDriver() throws MalformedURLException{

        ChromeOptions options = new ChromeOptions();
        RemoteWebDriver webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options);

        return webDriver;
    }

}
