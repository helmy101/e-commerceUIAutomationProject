package Pages;

import Connector.Hook;
import org.openqa.selenium.By;

import java.time.Duration;

public class P03_ProductPage {
    private By productSpecs = By.xpath("(//div[@class='ty-product-feature__value'])[4]");
    private By addToCartButton = By.id("button_cart_9062");
    private By cartButton = By.id("sw_dropdown_4700");
    private By viewCartButton = By.xpath("//a[@class='ty-btn ty-btn__outline']");
    private By closePopUpButton = By.xpath("//span[@class='cm-notification-close close']");


    public String checkProductSpecs() {
        return Hook.driver.findElement(productSpecs).getText();
    }

    public void clickOnAddToCartButton() {
        Hook.driver.findElement(addToCartButton).click();
        Hook.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    public void clickOnCloseButton() {
        Hook.driver.findElement(closePopUpButton).click();
    }
    public void viewCart(){
        Hook.driver.findElement(cartButton).click();
        Hook.driver.findElement(viewCartButton).click();
    }

}
