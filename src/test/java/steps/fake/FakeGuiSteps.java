package steps.fake;

import ClassWork19Logging.L4JLogging;
import classWork17DriverManager.Config;
import classWork17DriverManager.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.util.logging.Logger;

public class FakeGuiSteps {

    private static final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger.getLogger(L4JLogging.class.getName());

    @Given(value = "I go to onliner.by")
    public void checkHeaderTest() throws MalformedURLException {
        LOGGER.info("I start");
        Driver.setConfig(Config.REMOTE);
        Driver.getWebDriver().get("https://www.onliner.by/");
    }

    @When("I start waiting")
    public void checkFooterTest() throws InterruptedException {
        Thread.sleep(3000);
    }

    @Then("I just passed")
    public void verify(){
        Assert.assertTrue(true);
    }
}
