import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class NewTestRunner {

    @CucumberOptions(
            features = "classpath:features",
            plugin = { "pretty", "html:target/cucumber-reports" },
            monochrome = true

    )
    public static class NNewTestRunner extends AbstractTestNGCucumberTests {

        @BeforeClass
        public void beforeClass(){
            System.out.println("TEST BASLADI");
        }

        @AfterClass
        public void afterClass(){
            System.out.println("TEST BITDI");
        }

    }

}
