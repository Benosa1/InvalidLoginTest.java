package Step_Definition;

import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_forgotPassword_functionalityTest extends TestBase {

    @And("^I click the forgot your password link$")
    public void iClickTheForgotYourPasswordLink() {
        driver.findElement(By.linkText("Forgot your password?")).click();
    }

    @When("^I enter my email$")
    public void iEnterMyEmail() {
        driver.findElement(By.name("email")).sendKeys("lanreikuesan+1@gmail.com");
    }

    @And("^I Click the retrieve passowrd button$")
    public void iClickTheRetrievePassowrdButton() {
        driver.findElement(By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/p/button/span")).click();
    }

    @Then("^I should get a confirmation message$")
    public void iShouldGetAConfirmationMessage() {
        String RetrievalConfirmMessages = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p")).getText();
        System.out.println(RetrievalConfirmMessages);
    }
}
