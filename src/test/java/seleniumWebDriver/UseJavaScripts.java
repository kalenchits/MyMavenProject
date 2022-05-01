package seleniumWebDriver;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.Style;
import java.util.concurrent.TimeUnit;

public class UseJavaScripts {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://booking.com");
        driver.findElement(By.xpath("//div[@class='bui-avatar bui-avatar--small']")).click();
        driver.findElement(By.xpath("//div[@lang='ru']")).click();
        driver.findElement(By.name("ss")).sendKeys("Лондон");
        driver.findElement(By.name("ss")).sendKeys(Keys.ENTER);

        //dates
        driver.findElement(By.xpath("//*[@data-date='2022-05-05']")).click();
        //driver.findElement(By.xpath("//*[@data-date='2022-05-07']")).click();

        //find 10th hotel
        WebElement tenthHotel = driver.findElement(By.xpath("//div[@data-testid='property-card'][10]"));

        //scroll
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",tenthHotel);

        //color background
        ((JavascriptExecutor)driver).executeScript("arguments[0].style.backgroundColor='green'",tenthHotel);

        //find title
        WebElement tenthHotelTitle = driver.findElement(By.xpath("//div[@data-testid='property-card'][10]//div[@data-testid='title']"));

        //color title
        ((JavascriptExecutor)driver).executeScript("arguments[0].style.color='red'",tenthHotelTitle);

        //check title color
        String titleColor = tenthHotelTitle.getCssValue("color");
        Assert.assertEquals("rgba(255, 0, 0, 1)", titleColor);

        //check background color
        String backgroundColor = tenthHotel.getCssValue("background-color");
        Assert.assertEquals("rgba(0, 128, 0, 1)", backgroundColor);



    }
}
