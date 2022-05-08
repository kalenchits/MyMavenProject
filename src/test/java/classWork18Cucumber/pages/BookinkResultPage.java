package classWork18Cucumber.pages;

import org.openqa.selenium.By;

public class BookinkResultPage extends BookingBasePage {

    private static final String PROPERTY_CARDS_CSS = "//div[@data-testid='property-card']";

    public int getResults() {
        return driver.findElements(By.xpath(PROPERTY_CARDS_CSS)).size();
    }
}
