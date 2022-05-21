package steps.fake;

import classWork17DriverManager.Config;
import classWork17DriverManager.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;

import java.net.MalformedURLException;

public class FakeBaseSteps {

    private static final Logger LOGGER = Logger.getLogger(FakeBaseSteps.class.getName());

    @Before

    public void beforeTest() throws MalformedURLException {
        LOGGER.info("Initializing WebDriver..");
        Driver.initDriver(Config.CHROME);
    }

    @After
    public void afterTest(){
        LOGGER.info("Killing WebDriver..");
        Driver.destroy();
    }
}
