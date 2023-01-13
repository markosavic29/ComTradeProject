package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class CheckoutComplete extends BasePage {

    public CheckoutComplete(WebDriver driver) {
        super(driver);
    }

    By succesfulShoppingMassageBy = By.xpath("//*[@id='checkout_complete_container']/h2");

    public CheckoutComplete verifySuccesfulShopping(String shoppingMassage) {
        String actualText = readText(succesfulShoppingMassageBy);
        assertTextEquals(shoppingMassage, actualText);
        return this;
    }
}
