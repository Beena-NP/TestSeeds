package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import suite.SuiteManager;
import util.DriverManager;

public class AdminForgotPasswordPage extends SuiteManager {
    @FindBy(id = "forgotEmail")
    private WebElement forgotEmail;
    @FindBy(css = "button.btn.btn-primary.btn-block")
    private WebElement forgotEmailSubmitBtn;

    public AdminForgotPasswordPage()
    {
        PageFactory.initElements(DriverManager.driver, this);
    }

}
