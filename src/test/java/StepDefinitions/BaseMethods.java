package StepDefinitions;

import DriverSession.CucumberHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BaseMethods {
    public WebDriver driver = CucumberHooks.driver.get();


    protected WebElement getElement(By locator){
        return driver.findElement(locator);
    }
    protected List<WebElement> getElements(By locator){
        return driver.findElements(locator);
    }

    protected int generateRandNum(int size){
        return 0;
    }
}
