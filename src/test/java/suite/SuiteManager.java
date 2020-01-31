package suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import util.ConfigFileReader;
import util.DriverManager;

public class SuiteManager {
    public DriverManager driverManager;
    public ConfigFileReader config;

    @BeforeSuite(alwaysRun = true)
    public void startDriver()
    {
        driverManager = new DriverManager();
    }
    @AfterSuite(alwaysRun = true)
    public void quitDriver()
    {
        driverManager.driver.quit();
    }
    @BeforeClass
    public void launchUrl()
    {
        String adminUrl = config.getProperty("admin_url");
        driverManager.driver.get(adminUrl);
        driverManager.driver.manage().window().maximize();
    }

}
