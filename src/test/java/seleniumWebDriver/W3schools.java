package seleniumWebDriver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class W3schools {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/java/");

        WebElement tutorialTitle = driver.findElement(By.xpath("//span[text()='Tutorial']"));

        Actions make = new Actions(driver);

        make
                .doubleClick(tutorialTitle)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c")
                .keyUp(Keys.LEFT_CONTROL)
                .build().perform();

        driver.get("https://google.com");

        WebElement searchField = driver.findElement(By.name("q"));

        make
                .click(searchField)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("v")
                .keyUp(Keys.LEFT_CONTROL)
                .sendKeys(Keys.ENTER)
                .build().perform();

        System.out.println(driver.findElements(By.xpath("//div[contains(@class, 'g') and contains(., 'tutorial')]")).size());

        int result = driver.findElements(By.xpath("//div[contains(@class, 'g') and contains(., 'tutorial')]")).size();
        Assert.assertEquals(10, result);

    }
}
