package peopleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Demo2 {

    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:63342"),new ChromeOptions());

        driver.get("https://onliner.by");
        WebElement el = driver.findElement(By.className("onliner_logo"));
        el.click();
        driver.close();
    }
}
