package pom;

import lombok.Data;
import org.openqa.selenium.By;
@Data
public class RegisterPom {
    By clickRegister = By.linkText("Register");
    By fillInput = By.xpath("//*[@class='form2']//tr//*[@class='input']");
    By firstNameInput = By.xpath("//input[@id='customer.firstName']");
    By secondNameInput = By.xpath("//input[@id='customer.lastName']");
    By address = By.xpath("//input[@id='customer.address.street']");
    By city = By.xpath("//input[@id='customer.address.city']");
    By state = By.xpath("//input[@id='customer.address.state']");
    By zipCode = By.xpath("//input[@id='customer.address.zipCode']");
    By phoneNum = By.xpath("//input[@id='customer.phoneNumber']");
    By SNN = By.xpath("//input[@id='customer.ssn']");
    By userName = By.xpath("//input[@id='customer.username']");
    By password = By.xpath("//input[@id='customer.password']");
    By confirm = By.xpath("//input[@id='repeatedPassword']");
    By registrbtn= By.xpath("//input[@value='Register']");
    By title = By.className("smallText");
    By errormsj = By.className("error");
    private RegisterPom() {

    }

    protected static RegisterPom INSTANCE;


    public static RegisterPom getInstance() {
        if(INSTANCE==null){
            return INSTANCE =new RegisterPom();
        }
        return INSTANCE;
    }
}

