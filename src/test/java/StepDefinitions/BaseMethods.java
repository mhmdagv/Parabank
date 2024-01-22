package StepDefinitions;

import createDriverSession.CucumberHook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BaseMethods {
    protected WebDriver driver;
    {
        driver = CucumberHook.driver.get();
    }
    protected Actions actions;
    protected WebDriverWait wait;

    public WebElement getElement(By locator){
        return driver.findElement(locator);
    }
    public List<WebElement> getElements(By locator){
        return driver.findElements(locator);
    }
}

