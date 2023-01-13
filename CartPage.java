package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    By checkoutButtonBy = By.id("checkout");

    public CartPage clickOnCheckoutButton() {
        click(checkoutButtonBy);
        return this;
    }
}
