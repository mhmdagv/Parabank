package stepdefinitions;

import io.cucumber.java.be.I;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;


import static createdriversession.CucumberHook.driver;


public class UpdateInfoSteps {
    @When("Click to Username")
    public void click_to_username() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("aa1");

    }

    @And("Click to Password")
    public void click_to_password() throws InterruptedException {
        Thread.sleep(6000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[2]/input")).sendKeys("aa1");

    }

    @And("LoginBTN")
    public void login_btn() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input")).click();

    }

    @Given("After Log in")
    public void after_logIn() {
        driver.navigate().refresh();

    }

    @When("Clicks Contact Infos")
    public void clicks_contact_infos() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[href='/parabank/updateprofile.htm']")).click();

    }

    @And("Edit All The Contact Info Fields")
    public void edit_all_the_contact_info_fields() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Orkhan");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Maharramov");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("USA");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("New York");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Orkhan State");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("zip99");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("0888888888");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='Update Profile']")).click();
        Thread.sleep(3000);

    }

    @Then("All Field Must Be Updated")
    public void all_field_must_be_updated() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[contains(text(),'Your updated address and phone number have been ad')]")).isDisplayed();


    }

    @When("Clicks Request Loan Info")
    public void clicksRequestLoanInfo()  throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[href='/parabank/requestloan.htm']")).click();
    }

    @And("Fill The Loans Amount {}")
    public void fill_the_loan (String loan) throws  InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='amount']")).sendKeys(loan);
    }

    @And("Fill The Down Amount {}")
    public void fillTheDownAmount(String down)  throws  InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='downPayment']")).sendKeys(down);
    }

    @Then("There Must Be Error Text")
    public void thereMustBeErrorText() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//p[@class='error'])[1]")).isDisplayed() ;
    }

    @Then("There Must Be Decline Text")
    public void thereMustBeDeclineText() throws  InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[@class='error ng-scope']")).isDisplayed();
    }

    @Then("There Must Be Accepted Text")
    public void thereMustBeAcceptedText()  throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//p[normalize-space()='Congratulations, your loan has been approved.'])[1]")).isDisplayed();
    }

    @And("Click ApplyBtn")
    public void clickApplyBtn() throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/table/tbody/tr[4]/td[2]/input")).click();
    }
}

