package Step_Definition;

import Base.TestBase;
import Pages.CreateNewUserPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNew_UserAccTest extends TestBase {


    @And("^I enter email to create new user$")
    public void iEnterEmailToCreateNewUser() {
        CreateNewUserPage Lanre = PageFactory.initElements(driver, CreateNewUserPage.class);
        Lanre.EnterCreateNewUserEmail();
    }

    @And("^I click the create account button$")
    public void iClickTheCreateAccountButton() {
        CreateNewUserPage Ruke = PageFactory.initElements(driver, CreateNewUserPage.class);
        Ruke.ClickCreateAccButton();
    }

    @When("^I enter all mandatory details for new user$")
    public void iEnterAllMandatoryDetailsForNewUser() throws InterruptedException {
        Thread.sleep(3000);
        CreateNewUserPage Page = PageFactory.initElements(driver, CreateNewUserPage.class);
        Page.SetUserGender();
        Page.EnterUSerFirstName();
        Page.EnterUSerLastname();
        Page.EnterUserPassword();
        Page.SelectUserDOb_Day();
        Page.SelectUserDOb_Month();
        Page.SelectUserDOb_Years();
        Page.SelectNewsLetterCheckbox();
        Page.SelectOptinCheckBox();
        Page.TypeUserAddress();
        Thread.sleep(3000);
        Page.TypeUserCity();
        Page.SelectUserState();
        Page.TypeUserPostCode();
        Page.TypeUserMobilePhone();
        Page.ClearAddAliasField();
        Page.TypeAddressAlias();

    }
    @And("^I click the register button$")
    public void iClickTheRegisterButton() {
        CreateNewUserPage Page = PageFactory.initElements(driver, CreateNewUserPage.class);
        Page.ClickRegisterButton();
    }

    @Then("^New user should be created successfully$")
    public void newUserShouldBeCreatedSuccessfully() {
        CreateNewUserPage Page = PageFactory.initElements(driver, CreateNewUserPage.class);
        Page.AssertAccountCreation();
        driver.quit();
    }


}
