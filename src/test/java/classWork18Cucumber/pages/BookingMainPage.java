package classWork18Cucumber.pages;

import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class BookingMainPage extends BookingBasePage {

    private static final String LOCALISATION_BUTTON = "//div[@class='bui-avatar bui-avatar--small']";
    private static final String CHOOSE_RU_LANGUAGE_ICON = "//div[@lang='ru']";
    private static final String SEARCH_FIELD_ID = "ss";
    private static final String CHECK_PRICE_BUTTON = "//span[contains(text(),'Проверить цены')]";

    public BookingMainPage() throws MalformedURLException {
    }

    public void searchCity(String cityName){
        driver.findElement(By.xpath(LOCALISATION_BUTTON)).click();
        driver.findElement(By.xpath(CHOOSE_RU_LANGUAGE_ICON)).click();
        driver.findElement(By.name(SEARCH_FIELD_ID)).sendKeys(cityName);

        driver.findElement(By.xpath(CHECK_PRICE_BUTTON)).click();

       // driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

        /*new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(5))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@data-testid='overlay-spinner']")));

         */




}
