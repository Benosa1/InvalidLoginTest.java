package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class gitForgotPasswordPage {

    @FindBy(how = How.LINK_TEXT, using = "Forgot your password?")
    public static WebElement ForgotPasswordLink;

    @FindBy(how = How.NAME, using = "email")
    public static WebElement ForgotPasswordEmail;

    @FindBy(how = How.XPATH, using = "//*[@id=\"form_forgotpassword\"]/fieldset/p/button/span")
    public static WebElement RetrievePassowrdButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div/p")
    public static WebElement RetrieveSuccessMessage;


    public void ClickForgotPasswordLink() {ForgotPasswordLink.click();}
    public void TypeEmail() {ForgotPasswordEmail.sendKeys("lanreikuesan+1@gmail.com");}
    public void ClickRetrievePasswordButton() {RetrievePassowrdButton.click();}
    public void VerifyRetrievalSuccessMessage() {
        String RetrievalConfirmMessages = RetrieveSuccessMessage.getText();
        System.out.println(RetrievalConfirmMessages);
    }


}
