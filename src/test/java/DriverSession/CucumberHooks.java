package DriverSession;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberHooks {
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @Before
    public void beforeScenario(){
        driver.set(new ChromeDriver());
        driver.get().get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
    }

    @After
    public void afterScenario(Scenario scenario) throws InterruptedException {

        if(scenario.isFailed()) {
            Thread.sleep(300);
            final byte[] screenshot = ((TakesScreenshot) driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        driver.get().quit();
    }
}
