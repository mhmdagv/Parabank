package createdriversession;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


    public class CucumberHook {
        public static WebDriver driver;


        @Before
        public void beforeScenario(){
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
        }


        @After
        public void afterScenario(){
            driver.quit();
        }

    }


