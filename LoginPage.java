package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    String baseURL = "https://www.saucedemo.com/";
    By usernameBy = By.id("user-name");
    By passwordBy = By.id("password");
    By loginButtonBy = By.id("login-button");
    By errorContainerBy = By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3");
    By usernames = By.id("login_credentials");

    public LoginPage basePage() {
        driver.get(baseURL);
        return this;
    }

    public LoginPage login(String username, String password) {
        writeText(usernameBy, username);
        writeText(passwordBy, password);
        click(loginButtonBy);
        return this;
    }

    public LoginPage verifyUnsuccesfulLogin(String expectedText) {
        String actualText = readText(errorContainerBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }

    public LoginPage verifySuccesfulLogout() {
        waitVisability(usernameBy);
        return this;
    }
}
