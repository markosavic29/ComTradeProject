package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverview extends BasePage {

    public CheckoutOverview(WebDriver driver) {
        super(driver);
    }

    By finishButtonBy = By.id("finish");
    By product1PriceBy = By.xpath("//*[@id='checkout_summary_container']/div/div[1]/div[3]/div[2]/div[2]/div");
    By product2PriceBy = By.xpath("//*[@id='checkout_summary_container']/div/div[1]/div[4]/div[2]/div[2]/div");
    By itemTotalBy = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]");
    By taxBy = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]");
    By totalBy = By.xpath("//*[@id='checkout_summary_container']/div/div[2]/div[8]");

    public CheckoutOverview clickOnFinishButton() {
        click(finishButtonBy);
        return this;
    }

    public CheckoutOverview verifyCostFor2Products() {
        double product1Price = Double.parseDouble(readText(product1PriceBy).substring(1));
        double product2Price = Double.parseDouble(readText(product2PriceBy).substring(1));
        double itemTotal = Double.parseDouble(readText(itemTotalBy).substring(13));
        double priceFor2Products = product1Price + product2Price;
        assertDoubleEquals(itemTotal, priceFor2Products);
        return this;
    }

    public CheckoutOverview verifyTotalPrice() {
        double itemTotal = Double.parseDouble(readText(itemTotalBy).substring(13));
        double tax = Double.parseDouble(readText(taxBy).substring(6));
        double total = Double.parseDouble(readText(totalBy).substring(8));
        double totalCheck = itemTotal + tax;
        assertDoubleEquals(total, totalCheck);
        return this;
    }
}
