package framework_with_allure;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import framework_with_allure.pages.MainPage;
import framework_with_allure.utils.SettingsTestData;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static io.qameta.allure.Allure.step;

public class BaseTest {
    protected MainPage mainPage = new MainPage();
    protected Browser browser;



    @BeforeMethod
    public void setup() {

        step("Open browser and go to the site");
        browser = AqualityServices.getBrowser();
        browser.maximize();
        browser.goTo(SettingsTestData.getEnvData().getHost());
    }

    @AfterMethod
    public void teardown() {
        step("Quit browser");
        browser.quit();
    }
}
