package classWork18Cucumber;

import classWork17DriverManager.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class DraftPage {

    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver = Driver.getWebDriver();

        driver.get("https://booking.com");

        driver.findElement(By.xpath("//div[@class='bui-avatar bui-avatar--small']")).click();
        driver.findElement(By.xpath("//div[@lang='ru']")).click();
        driver.findElement(By.name("ss")).sendKeys("Париж");

        driver.findElement(By.xpath("//span[contains(text(),'Проверить цены')]")).click();

        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(5))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@data-testid='overlay-spinner']")));

        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        int result = driver.findElements(By.xpath("//div[@data-testid='property-card']")).size();
        System.out.println("Amount of elements at search results are: " + result);
    }

}
