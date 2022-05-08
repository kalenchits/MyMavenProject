package classWork18Cucumber.steps;

import classWork17.Driver;
import classWork18Cucumber.pages.BookingMainPage;
import classWork18Cucumber.pages.BookinkResultPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {

    BookingMainPage bookingMainPage = new BookingMainPage();
    BookinkResultPage bookinkResultPage = new BookinkResultPage();

    @Given("I open test site")
    public void iOpenTestSite() {
        Driver.getWebDriver().get("https://booking.com");
    }

    @When("I fill {string} into form")
    public void iFillIntoForm(String city) {
        bookingMainPage.searchCity(city);
    }

    @Then("I see greeting message")
    public void iSeeGreetingMessage() {
        Assert.assertTrue("Results count is not expected",25 == bookinkResultPage.getResults());
    }

    @After
    public void close() {
        Driver.destroy();
    }

}
