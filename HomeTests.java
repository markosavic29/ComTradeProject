package Tests;

import org.junit.Test;

import pages.LoginPage;
import pages.HomePage;

public class HomeTests extends BaseTest {

    public LoginPage loginPage;
    public HomePage homePage;

    @Test
    public void verifySucessfulAddToCart() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.basePage();
        loginPage.login(standardUsername, password);
        homePage.verifiySuccessfulLogin(expectedText);
        homePage.verifyProductAddedToCart();
        homePage.verifyProductAddedToCart2();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void numberOfProductsOnHomePage() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.basePage();
        loginPage.login(standardUsername, password);
        homePage.verifiySuccessfulLogin(expectedText);
        homePage.numberOfProducts(numberOfProducts);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void verifyAboutLink() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.basePage();
        loginPage.login(standardUsername, standardPassword);
        homePage.verifiySuccessfulLogin(expectedText);
        homePage.clickOnHamburgerMenu();
        homePage.verifyAboutLink();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void verifiySuccessfulLogout() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.basePage();
        loginPage.login(standardUsername, standardPassword);
        homePage.verifiySuccessfulLogin(expectedText);
        homePage.clickOnHamburgerMenu();
        homePage.clickOnLogoutButton();
        loginPage.verifySuccesfulLogout();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
