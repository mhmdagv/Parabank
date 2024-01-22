import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.presentation.PresentationMode;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.util.ArrayList;
import java.util.List;



    @CucumberOptions(
            features = "classpath:features",
            plugin = {"pretty", "json:target/cucumber.json"}

    )
    public class TestRunner extends AbstractTestNGCucumberTests {


        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
            return scenarios();
        }

        @BeforeClass
        public void beforeClass(){
            System.out.println("TEST BASLADI");
        }

        @AfterTest
        public void afterTest(){
            File reportOutputDirectory = new File("target");
            List<String> jsonFiles = new ArrayList<>();
            jsonFiles.add("target/cucumber.json");
            Configuration configuration = new Configuration(reportOutputDirectory, "Parabank");
            configuration.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
            ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
            reportBuilder.generateReports();
        }

    }


