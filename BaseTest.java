package Tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;
    public String password = "secret_sauce";
    public int numberOfProducts = 6;
    public String standardUsername = "standard_user";
    public String standardPassword = "secret_sauce";
    public String expectedText = "Products";
    public String lockedOutUser = "locked_out_user";
    public String errorTextLockedOut = "Epic sadface: Sorry, this user has been locked out.";
    public String emptyUsername = "";
    public String errorTextEmptyUsername = "Epic sadface: Username is required";
    public String wrongUsername = "Wrong username123";
    public String wrongUsernameOrPaswordErrorText = "Epic sadface: Username and password do not match any user in this service";
    public String emptyPassword = "";
    public String emptyPaswordErrorText = "Epic sadface: Password is required";
    public String wrongPassword = "Wrong Pasword123";
    public String problemUser = "problem_user";
    public String performanceGlitchUser = "performance_glitch_user";
    public String firstName = "Marko";
    public String lastName = "Savic";
    public String zip = "37000";
    public String shoppingMassage = "Thank you for your order!";

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\marko\\Desktop\\ProjekatZaIspit\\ProjekatZaIspit\\lib\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
