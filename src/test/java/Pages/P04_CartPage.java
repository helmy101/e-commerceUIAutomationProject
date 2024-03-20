package Pages;

import Connector.Hook;
import org.openqa.selenium.By;

public class P04_CartPage {

    private By itemName = By.className("ty-cart-content__product-title");
    private By itemQuantity = By.id("amount_3385281874");
    private By proccedToCheckOutButton = By.xpath("(//a[@class='ty-btn ty-btn__primary '])[2]");

    public String getItemName() {
        return Hook.driver.findElement(itemName).getText();
    }

    public String getQuantityAmount() {
        return Hook.driver.findElement(itemQuantity).getAttribute("value");
    }

    public void clickOnProceedToCheckOutButton(){
        Hook.driver.findElement(proccedToCheckOutButton).click();
    }
}
