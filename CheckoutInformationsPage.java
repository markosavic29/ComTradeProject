package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class CheckoutInformationsPage extends BasePage {

    public CheckoutInformationsPage(WebDriver driver) {
        super(driver);
    }

    By firstNameBy = By.id("first-name");
    By lastNameBy = By.id("last-name");
    By zipBy = By.id("postal-code");
    By continueBy = By.id("continue");

    public CheckoutInformationsPage addInformations(String firstName, String lastName, String zip) {

        writeText(firstNameBy, firstName);
        writeText(lastNameBy, lastName);
        writeText(zipBy, zip);
        click(continueBy);
        return this;
    }
}
