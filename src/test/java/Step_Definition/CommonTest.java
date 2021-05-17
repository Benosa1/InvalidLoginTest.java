package Step_Definition;

import Base.TestBase;
import Pages.CreateNewUserPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CommonTest extends TestBase {

    @Before
    public void setup() throws IOException {
        initialize();

    }

    @Given("^I am on the homescreen$")
    public void iAmOnTheHomescreen() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
    }

    @And("^I click on the button to signin$")
    public void iClickOnTheButtonToSignin() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.ClickSignInLink();
    }
}
