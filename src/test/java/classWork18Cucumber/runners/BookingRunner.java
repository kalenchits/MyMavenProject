package classWork18Cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary"},
        glue = {"classWork18Cucumber"},
        features = {"src/test/resources/features/myNewFeature.feature"},
        strict = true,
        tags = {"@QA"} //запустятся только те сценарии, которые помечены тегом @QA
)
public class BookingRunner {
}
