package Tests.cart;

import org.junit.Test;

import Tests.BaseTest;
import pages.CartPage;
import pages.LoginPage;
import pages.HomePage;
import pages.CheckoutInformationsPage;
import pages.CheckoutOverview;

public class CheckoutOverviewTests extends BaseTest {
    public LoginPage loginPage;
    public HomePage homePage;
    public CartPage cartPage;
    public CheckoutInformationsPage checkoutPage;
    public CheckoutOverview checkoutOverview;

    @Test
    public void verifyTotalPriceFor2Products() {

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutInformationsPage checkoutInformationsPage = new CheckoutInformationsPage(driver);
        CheckoutOverview checkoutOverview = new CheckoutOverview(driver);
        loginPage.basePage();
        loginPage.login(standardUsername, standardPassword);
        homePage.verifiySuccessfulLogin(expectedText);
        homePage.verifyProductAddedToCart();
        homePage.verifyProductAddedToCart2();
        homePage.clickOnshoppingCartBadge();
        cartPage.clickOnCheckoutButton();
        checkoutInformationsPage.addInformations(firstName, lastName, zip);
        checkoutOverview.verifyCostFor2Products();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void verifyTotalPrice() {

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutInformationsPage checkoutInformationsPage = new CheckoutInformationsPage(driver);
        CheckoutOverview checkoutOverview = new CheckoutOverview(driver);
        loginPage.basePage();
        loginPage.login(standardUsername, standardPassword);
        homePage.verifiySuccessfulLogin(expectedText);
        homePage.verifyProductAddedToCart();
        homePage.verifyProductAddedToCart2();
        homePage.clickOnshoppingCartBadge();
        cartPage.clickOnCheckoutButton();
        checkoutInformationsPage.addInformations(firstName, lastName, zip);
        checkoutOverview.verifyTotalPrice();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
