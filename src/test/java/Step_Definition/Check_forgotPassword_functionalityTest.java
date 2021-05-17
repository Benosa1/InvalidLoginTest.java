package Step_Definition;

import Base.TestBase;
import Pages.ForgotPasswordPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Check_forgotPassword_functionalityTest extends TestBase {

    @And("^I click the forgot your password link$")
    public void iClickTheForgotYourPasswordLink() {
        ForgotPasswordPage page = PageFactory.initElements(driver, ForgotPasswordPage.class);
        page.ClickForgotPasswordLink();
    }

    @When("^I enter my email$")
    public void iEnterMyEmail() {
        ForgotPasswordPage page = PageFactory.initElements(driver, ForgotPasswordPage.class);
        page.TypeEmail();
    }

    @And("^I Click the retrieve passowrd button$")
    public void iClickTheRetrievePassowrdButton() {
        ForgotPasswordPage page = PageFactory.initElements(driver, ForgotPasswordPage.class);
        page.ClickRetrievePasswordButton();
    }

    @Then("^I should get a confirmation message$")
    public void iShouldGetAConfirmationMessage() {
        ForgotPasswordPage page = PageFactory.initElements(driver, ForgotPasswordPage.class);
        page.VerifyRetrievalSuccessMessage();
        driver.quit();
    }
}
