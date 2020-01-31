package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import suite.SuiteManager;
import util.DriverManager;

public class AdminLoginPage extends SuiteManager {

    @FindBy(id = "email")
    private WebElement loginEmail;
    @FindBy(id = "password")
    private WebElement loginPassword;
    @FindBy(id = "submit")
    private WebElement loginButn;
    @FindBy(css = "a.forgot")
    private WebElement forgotPasswd;

    public AdminLoginPage()
    {
        PageFactory.initElements(DriverManager.driver, this);
    }

    public void enterDetails(WebElement field, String value)
    {
        field.click();
        field.clear();
        field.sendKeys(value);
    }
    public AdminLoginPage loginToAdmin(String user, String pass)
    {
        enterDetails(loginEmail, user);
        enterDetails(loginPassword, pass);
        loginButn.click();
    }
    public AdminForgotPasswordPage resetEmailLink()
    {
        forgotPasswd.click();
        return new AdminForgotPasswordPage();
    }

}
