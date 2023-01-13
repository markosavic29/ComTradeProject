package Tests;

import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    public LoginPage loginPage;

    @Test
    public void verifySuccesfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.basePage();
        loginPage.login(standardUsername, standardPassword);
        homePage.verifiySuccessfulLogin(expectedText);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void verifyUnsuccesfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(lockedOutUser, standardPassword);
        loginPage.verifyUnsuccesfulLogin(errorTextLockedOut);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void verifyUnsuccesfulLoginWithEmptyUsername() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(emptyUsername, standardPassword);
        loginPage.verifyUnsuccesfulLogin(errorTextEmptyUsername);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void verifyUnsuccesfulLoginWrongUsername() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(wrongUsername, standardPassword);
        loginPage.verifyUnsuccesfulLogin(wrongUsernameOrPaswordErrorText);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void verifyUnsuccesfulLoginEmptyPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(standardUsername, emptyPassword);
        loginPage.verifyUnsuccesfulLogin(emptyPaswordErrorText);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void verifyUnsuccesfulLoginWrongPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(standardUsername, wrongPassword);
        loginPage.verifyUnsuccesfulLogin(wrongUsernameOrPaswordErrorText);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void verifySuccesfulLoginProblemUser() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.basePage();
        loginPage.login(problemUser, standardPassword);
        homePage.verifiySuccessfulLogin(expectedText);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void verifiySuccessfulLoginPerformanceGlitchUser() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.basePage();
        loginPage.login(performanceGlitchUser, standardPassword);
        homePage.verifiySuccessfulLogin(expectedText);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
