package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginSteps extends BaseMethods{

    @When("User fill username input field with {string}")
    public void userFillUsernameInputFieldWith(String username) {
        driver.findElement(By.cssSelector("[name = 'username']")).sendKeys(username);
    }

    @And("User fill password input field with {string}")
    public void userFillPasswordInputFieldWith(String password) {
        driver.findElement(By.cssSelector("[name = 'password']")).sendKeys(password);
    }

    @And("Click login button")
    public void clickLoginButton(){
     driver.findElement(By.cssSelector("[value = 'Log In']")).click();
    }

    @Given("User is in {string} page")
    public void userIsInPage(String arg0) {
    }

    @When("Click to Open New Account button")
    public void clickToOpenNewAccountButton() {
        driver.findElement(By.linkText("Open New Account")).click();
    }

    @And("Select Savings account")
    public void selectSavingsAccount() {
        WebElement element = driver.findElement(By.id("type"));
        Select select = new Select(element);
        select.selectByValue("1");
    }


    @And("Select {string} account")
    public void selectAccount(String account) throws InterruptedException {
        WebElement element = driver.findElement(By.id("fromAccountId"));
        Thread.sleep(2000);
        Select select = new Select(element);
        select.selectByValue(account);
    }



    @And("Clicks Open New Account button")
    public void clicksOpenNewAccountButton() {
        driver.findElement(By.cssSelector("[value = 'Open New Account']")).click();
    }

    @Then("Account opened message should be displayed")
    public void accountOpenedMessageShouldBeDisplayed() throws InterruptedException {
        WebElement element = driver.findElement(By.className("title"));
        Assert.assertTrue(element.isDisplayed());
    }



    @When("Click Transfer funds button")
    public void clickTransferFundsButton() {
        driver.findElement(By.linkText("Transfer Funds")).click();
    }

    @And("Fill Amount input field with {string}")
    public void fillAmountInputFieldWith(String amount) throws InterruptedException {
        driver.findElement(By.id("amount")).sendKeys(amount);
        Thread.sleep(5000);
    }

    @And("Selects {string} account")
    public void selectsAccount(String account) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//select[@id='fromAccountId']"));
        Thread.sleep(2000);
        Select select = new Select(element);
        select.selectByValue(account);
    }

    @And("Select {string} accounts")
    public void selectAccounts(String account) throws InterruptedException {
        WebElement element = driver.findElement(By.id("toAccountId"));
        Thread.sleep(2000);
        Select select = new Select(element);
        select.selectByValue(account);
    }
    @And("Click Transfer button")
    public void clickTransferButton() {
        driver.findElement(By.cssSelector("[value = 'Transfer']")).click();
    }

    @Then("Transfer Complete message should be displayed")
    public void transferCompleteMessageShouldBeDisplayed() {
        WebElement element = driver.findElement(By.className("title"));
        Assert.assertTrue(element.isDisplayed());
    }


    @When("Click Request loan button")
    public void clickRequestLoanButton() {
        driver.findElement(By.linkText("Request Loan")).click();
    }

    @And("User fill Loan Amount input field with {string}")
    public void userFillLoanAmountInputFieldWith(String amount) {
        driver.findElement(By.id("amount")).sendKeys(amount);
    }

    @And("User fill Down Payment input field with {string}")
    public void userFillDownPaymentInputFieldWith(String amount) {
        driver.findElement(By.id("downPayment")).sendKeys(amount);
    }

    @And("Select From Account with {string}")
    public void selectFromAccountWith(String account) throws InterruptedException {
        WebElement element = driver.findElement(By.id("fromAccountId"));
        Thread.sleep(2000);
        Select select = new Select(element);
        select.selectByValue(account);
    }

    @And("Click Apply now button")
    public void clickApplyNowButton() {
        driver.findElement(By.cssSelector("[value = 'Apply Now']")).click();
    }

    @Then("Loan Request Processed message should be displayed")
    public void loanRequestProcessedMessageShouldBeDisplayed() throws InterruptedException {
        WebElement element = driver.findElement(By.className("title"));
        Assert.assertTrue(element.isDisplayed());
    }
}
