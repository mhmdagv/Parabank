package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pom.RegisterPom;

import java.util.List;
public class RegisterSteps extends BaseMethods {
    RegisterPom registerPom;

    {
        registerPom = RegisterPom.getInstance();
    }

    @Given("User is in {string} website")
    public void userIsInWebsite(String arg0) {
        driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
    }

    @When("User clicks register button")
    public void userClicksRegisterButton() throws InterruptedException {
        getElement(registerPom.getClickRegister()).click();
    }

    @And("User fills in his information completely")
    public void userFillsInHisInformationCompletely() {
        getElement(registerPom.getFirstNameInput()).sendKeys("Azad");
        getElement(registerPom.getSecondNameInput()).sendKeys("Azadov");
        getElement(registerPom.getAddress()).sendKeys("Mircelal kuc-135");
        getElement(registerPom.getCity()).sendKeys("Baku");
        getElement(registerPom.getState()).sendKeys("Azerbaijan");
        getElement(registerPom.getZipCode()).sendKeys("Az1104");
        getElement(registerPom.getPhoneNum()).sendKeys("+994123456");
        getElement(registerPom.getSNN()).sendKeys("2581473690");
        getElement(registerPom.getUserName()).sendKeys("Azadov Azad");
        getElement(registerPom.getPassword()).sendKeys("444Test");
        getElement(registerPom.getConfirm()).sendKeys("444Test");
    }

    @And("User clicks register button for complete")
    public void userClicksRegisterButtonForComplete() {
        getElement(registerPom.getRegistrbtn()).click();
    }

    @Then("User successfully registered should be displayed on the page")
    public void userSuccessfullyRegisteredShouldBeDisplayedOnThePage() throws InterruptedException {
        Thread.sleep(2000);
   WebElement element = getElement(registerPom.getTitle());
        Assert.assertTrue(element.isDisplayed());

    }
    @Then("User  should be displayed error msj on the page")
    public void userShouldBeDisplayedErrorMsjOnThePage() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> text =getElements(registerPom.getErrormsj());
        for(WebElement element: text){
            Assert.assertTrue(element.isDisplayed());
        }
    }

    @And("User fills in his information is not completed")
    public void userFillsInHisInformationIsNotCompleted() {
        getElement(registerPom.getFirstNameInput()).sendKeys("Sonaa");;
        getElement(registerPom.getSecondNameInput()).sendKeys("Namazova");
        getElement(registerPom.getAddress()).sendKeys("Mircelal kuc-135");
        getElement(registerPom.getCity()).sendKeys("Baku");
        getElement(registerPom.getState()).sendKeys("Azerbaijan");
        getElement(registerPom.getZipCode()).sendKeys("Az1104");
        getElement(registerPom.getPhoneNum()).sendKeys("+994123456");
        getElement(registerPom.getSNN()).sendKeys("2581473690");
        getElement(registerPom.getPassword()).sendKeys("444Test");

    }
}


