package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    By homePageTitleBy = By.xpath("//*[@id='header_container']/div[2]/span");
    By addToCartButton1By = By.id("add-to-cart-sauce-labs-backpack");
    By addToCartButton2By = By.id("add-to-cart-sauce-labs-bike-light");
    By addToCartButton3By = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By shoppingCartBadgeBy = By.className("shopping_cart_badge");
    By numberOfItemsBy = By.className("inventory_item");
    By hamburgerMenuBy = By.id("react-burger-menu-btn");
    By aboutButtonBy = By.id("about_sidebar_link");
    By logoutButtonBy = By.id("logout_sidebar_link");

    public HomePage verifiySuccessfulLogin(String expectedText) {
        String actualText = readText(homePageTitleBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }

    public HomePage numberOfProducts(int expectedNumberOfProducts) {
        int actualNumberOfProducts = countItems(numberOfItemsBy);
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOfProducts);
        return this;
    }

    public HomePage verifyProductAddedToCart() {
        click(addToCartButton1By);
        waitVisability(shoppingCartBadgeBy);
        return this;
    }

    public HomePage verifyProductAddedToCart2() {
        click(addToCartButton2By);
        waitVisability(shoppingCartBadgeBy);
        return this;
    }

    public HomePage verifyProductAddedToCart3() {
        click(addToCartButton3By);
        waitVisability(shoppingCartBadgeBy);
        return this;
    }

    public HomePage clickOnHamburgerMenu() {
        click(hamburgerMenuBy);
        return this;
    }

    public HomePage verifyAboutLink() {
        String actualHref = readHref(aboutButtonBy);
        assertTextEquals(actualHref, actualHref);
        return this;
    }

    public HomePage clickOnLogoutButton() {
        click(logoutButtonBy);
        return this;
    }

    public HomePage clickOnshoppingCartBadge() {
        click(shoppingCartBadgeBy);
        return this;
    }
}
