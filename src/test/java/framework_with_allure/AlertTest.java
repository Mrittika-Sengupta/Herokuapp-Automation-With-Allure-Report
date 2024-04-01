package framework_with_allure;

import aquality.selenium.browser.AlertActions;
import framework_with_allure.pages.JavaScriptAlertsPage;
import framework_with_allure.pages.MainPageNavigation;
import io.qameta.allure.Issue;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;

public class AlertTest extends BaseTest {
    private JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage();

    @Test
    @Owner("Mrittika")
    @Severity(SeverityLevel.NORMAL)
    
    public void alertTest() {

        step("Click on JavaScript Alerts link");
        mainPage.clickNavigationLink(MainPageNavigation.JAVASCRIPT_ALERT);
        step("Click on Click for JS alert button");
        javaScriptAlertsPage.clickForJsAlertBtn();
        step("Accept alert");
        browser.handleAlert(AlertActions.ACCEPT);
        step("Verify success message is displayed");
        Assert.assertTrue(javaScriptAlertsPage.isSuccessLabelDisplayed(), "Success msg is not displayed");
    }
}
