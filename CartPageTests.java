package Tests.cart;

import org.junit.Test;
import org.openqa.selenium.By;

import Tests.BaseTest;
import pages.CartPage;
import pages.LoginPage;
import pages.HomePage;

public class CartPageTests extends BaseTest {
    public LoginPage loginPage;
    public HomePage homePage;
    public CartPage cartPage;

    By cartItems = By.className("cart_item");
    By shoppingCartBadgeBy = By.className("shopping_cart_badge");

    @Test
    public void equalNumberOfProductsInCartAndPage() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        CartPage cartPage = new CartPage(driver);
        loginPage.basePage();
        loginPage.login(standardUsername, standardPassword);
        homePage.verifiySuccessfulLogin(expectedText);
        homePage.verifyProductAddedToCart();
        homePage.verifyProductAddedToCart2();
        homePage.verifyProductAddedToCart3();
        homePage.clickOnshoppingCartBadge();
        int itemsOnPage = cartPage.countItems(cartItems);
        String textInCart = cartPage.readText(shoppingCartBadgeBy);
        int numberInCart = Integer.parseInt(textInCart);
        cartPage.assertIntegerEquals(itemsOnPage, numberInCart);

        try {
            //
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
