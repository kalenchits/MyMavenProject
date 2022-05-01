package peopleTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        //System.setProperties("webdriver.chrome.driver", "/user/bin/chromedriver");
        driver.get("https://selenium.dev");
    }


}

