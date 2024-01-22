package createDriverSession;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class CucumberHook {
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();


    @Before
    public void beforeScenario(){
        ChromeOptions options = new ChromeOptions();
        driver.set(new ChromeDriver(options));
        driver.get().get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
    }


    @After
    public void afterScenario(Scenario scenario) throws InterruptedException {

        if(scenario.isFailed()) {
            Thread.sleep(300);
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        driver.get().quit();
    }

}
