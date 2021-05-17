package Step_Definition;

import Base.TestBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTest extends TestBase {


    @When("^I enter user email \"([^\"]*)\" in the username field$")
    public void iEnterUserEmailInTheUsernameField(String email) throws Throwable {
        driver.findElement(By.name("email")).sendKeys(email);

    }

    @And("^I enter user password \"([^\"]*)\" in the password field$")
    public void iEnterUserPasswordInThePasswordField(String password) throws Throwable {
        driver.findElement(By.id("passwd")).sendKeys(password);
    }

    @And("^I click on login$")
    public void iClickOnLogin() {
        driver.findElement(By.name("SubmitLogin")).click();
    }

    @Then("^I should get the right error message \"([^\"]*)\"$")
    public void iShouldGetTheRightErrorMessage(String ErrorMessage) throws Throwable {
        String ExpectedErrorMessage = ErrorMessage;
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);

        driver.quit();

    }
}
