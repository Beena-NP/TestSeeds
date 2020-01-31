package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import suite.SuiteManager;

public class AdminDashboardPage extends SuiteManager {

    @FindBy(id = "duration_filtering")
    private WebElement durationFilter;


}
