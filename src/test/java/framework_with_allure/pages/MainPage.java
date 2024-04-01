package framework_with_allure.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import framework_with_allure.LocatorConstants;
import org.openqa.selenium.By;

public class MainPage extends Form {


    public MainPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "Welcome to the-internet")), "Main Page");
    }

    private ILink getNavigationLink(MainPageNavigation navigation) {
        return AqualityServices.getElementFactory().getLink(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,
                navigation.label)), navigation.label);
    }

    public void clickNavigationLink(MainPageNavigation navigation) {
        getNavigationLink(navigation).click();
    }
}
