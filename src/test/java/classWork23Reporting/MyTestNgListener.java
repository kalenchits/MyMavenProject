package classWork23Reporting;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestNgListener implements ITestListener {

    private static final Logger LOGGER = LogManager.getLogger(MyTestNgListener.class);

    String runId="1581";

    public void onTestStart(ITestResult result) {
        LOGGER.info("Test started " + result.getMethod().getDescription());
    }

    public void onTestSuccess(ITestResult result) {
        LOGGER.info("Test successed " + result.getMethod().getDescription());
        TestRailReporter.reportResult(runId,result.getMethod().getDescription(),new TestRailResult(1));
    }

    public void onTestFailure(ITestResult result) {
        LOGGER.info("Test failed " + result.getMethod().getDescription());
        TestRailReporter.reportResult(runId,result.getMethod().getDescription(),new TestRailResult(5));
    }

}
