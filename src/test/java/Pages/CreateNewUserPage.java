package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CreateNewUserPage {
    public int random;
    public WebDriver driver;
    //Declare your elements locators here
    @FindBy(how = How.CLASS_NAME, using = "login")
    public static WebElement SignInLink;

    @FindBy(how = How.ID_OR_NAME, using = "email_create")
    public static WebElement Email_CreateNewUser;

    @FindBy(how = How.ID, using = "SubmitCreate")
    public static WebElement CreateAccButton;

    @FindBy(how = How.ID_OR_NAME, using = "id_gender")
    public static WebElement UserGender;

    @FindBy(how = How.ID_OR_NAME, using = "customer_firstname")
    public static WebElement UserFirstname;

    @FindBy(how = How.ID_OR_NAME, using = "customer_lastname")
    public static WebElement UserLastname;

    @FindBy(how = How.NAME, using = "passwd")
    public static WebElement UserPassword;

    @FindBy(how = How.ID_OR_NAME, using = "days")
    public static WebElement DOB_Days;

    @FindBy(how = How.ID_OR_NAME, using = "months")
    public static WebElement DOBMonths;

    @FindBy(how = How.ID_OR_NAME, using = "years")
    public static WebElement DOBYears;

    @FindBy(how = How.ID_OR_NAME, using = "newsletter")
    public static WebElement NewsLetter;

    @FindBy(how = How.ID_OR_NAME, using = "optin")
    public static WebElement Optin;

    @FindBy(how = How.ID_OR_NAME, using = "address1")
    public static WebElement UserAddress;

    @FindBy(how = How.ID_OR_NAME, using = "city")
    public static WebElement UserCity;

    @FindBy(how = How.ID_OR_NAME, using = "id_state")
    public static WebElement UserState;

    @FindBy(how = How.ID_OR_NAME, using = "postcode")
    public static WebElement UserPostcode;

    @FindBy(how = How.ID_OR_NAME, using = "phone_mobile")
    public static WebElement UserMobilePhone;

    @FindBy(how = How.ID_OR_NAME, using = "alias")
    public static WebElement AddressAlias;

    @FindBy(how = How.ID_OR_NAME, using = "submitAccount")
    public static WebElement RegisterButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    public static WebElement LoggedInUser;


    //Declare your methods here
    public void ClickSignInLink() {SignInLink.click();}
    public void EnterCreateNewUserEmail()  {
        random = 100 + (int) (Math.random()* (1000-1) + 1);
        Email_CreateNewUser.sendKeys("lanreikuesan" + random + "@gmail.com");
    }
    public void ClickCreateAccButton() { CreateAccButton.click(); }
    public void SetUserGender() {UserGender.click(); }
    public void EnterUSerFirstName() {UserFirstname.sendKeys("Ruke");}
    public void EnterUSerLastname() {UserLastname.sendKeys("Abayomi");}
    public void EnterUserPassword() {UserPassword.sendKeys("march2021");}
    public void SelectUserDOb_Day() {Select Day = new Select(DOB_Days);
            Day.selectByIndex(10);
    }
    public void SelectUserDOb_Month() {Select Month = new Select(DOBMonths);
        Month.selectByIndex(9);
    }
    public void SelectUserDOb_Years() {Select Years = new Select(DOBYears);
        Years.selectByValue("1991");
    }
    public void SelectNewsLetterCheckbox() {NewsLetter.click(); }
    public void SelectOptinCheckBox() {Optin.click();}
    public void TypeUserAddress() {UserAddress.sendKeys("No 1 Testing Street");}
    public void TypeUserCity() {UserCity.sendKeys("Chicago");}
    public void SelectUserState() {
        Select State = new Select(UserState);
        State.selectByVisibleText("Illinois");
    }
    public void TypeUserPostCode() {UserPostcode.sendKeys("00000");}
    public void TypeUserMobilePhone() {UserMobilePhone.sendKeys("123456789");}
    public void ClearAddAliasField() {AddressAlias.clear();}
    public void TypeAddressAlias() {AddressAlias.sendKeys("Testing Headquaters");}
    public void ClickRegisterButton() {RegisterButton.click();}
    public void AssertAccountCreation() {
        String ExpectedUserAccount = "Ruke Abayomi";
        String ActualUserAccount = LoggedInUser.getText();
        Assert.assertEquals(ExpectedUserAccount, ActualUserAccount);
        System.out.println(ActualUserAccount);
    }

}
