package Step_Definition;

import Base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogo_And_ValidLoginTest  extends TestBase {

    @Given("^I verify that the application logo is displayed$")
    public void i_verify_that_the_application_logo_is_displayed() throws Throwable {
     driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img")).isDisplayed();

    }

    @When("^I enter my valid username$")
    public void i_enter_my_valid_username() throws Throwable {
     driver.findElement(By.name("email")).sendKeys("lanreikuesan+1@gmail.com");

    }

    @When("^I enter my valid password$")
    public void i_enter_my_valid_password() throws Throwable {
     driver.findElement(By.id("passwd")).sendKeys("march2021");

    }

    @When("^I click on the login button$")
    public void i_click_on_the_login_button() throws Throwable {
     driver.findElement(By.name("SubmitLogin")).click();

    }

    @Then("^I should be logged in successfully$")
    public void i_should_be_logged_in_successfully() throws Throwable {
     String SignedInUser = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
     System.out.println(SignedInUser);

     driver.quit();

    }
}
