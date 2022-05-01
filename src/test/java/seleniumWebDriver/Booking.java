package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Booking {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://booking.com");
        driver.findElement(By.xpath("//div[@class='bui-avatar bui-avatar--small']")).click();
        driver.findElement(By.xpath("//div[@lang='ru']")).click();
        driver.findElement(By.name("ss")).sendKeys("Париж");
        driver.findElement(By.xpath("//span[text()='Париж']")).click();

        //dates

        driver.findElement(By.xpath("//*[@data-date='2022-05-03']")).click();
        driver.findElement(By.xpath("//*[@data-date='2022-05-10']")).click();

        //guests
        driver.findElement(By.xpath("//span[@data-children-count]")).click();
        driver.findElement(By.xpath("//span[@id='group_adults_desc']/preceding-sibling::button[1]")).click();
        driver.findElement(By.xpath("//span[@id='group_adults_desc']/preceding-sibling::button[1]")).click();
        driver.findElement(By.xpath("//span[@id='no_rooms_desc']/preceding-sibling::button[1]")).click();
        driver.findElement(By.cssSelector(".sb-searchbox__button ")).click();

        driver.findElement(By.xpath("//button[@aria-label='Increase number of Rooms']")).click();

        driver.findElement(By.xpath("//a[@data-type='price']")).click();

        driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
        new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(5))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@data-testid='overlay-spinner']")));

        WebElement filterPrice = driver.findElement(By.xpath("//div[@id='searchboxInc']//div[@data-filters-group='pri']//div[contains(text(), '+')]"));
        filterPrice.click();




        //driver.close();
        //driver.findElement(By.name("ss")).sendKeys(Keys.ENTER);

        //driver.findElement(By.xpath("//span[contains(@class, " + "'sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb'")).click();
        //driver.findElement(By.xpath("//"))
        //driver.searchField.sendKeys(Keys.ENTER);


    }
}
