package stepDef;

import Pages.P04_CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class D04_CartPageSteps {
    P04_CartPage cartPage = new P04_CartPage();

    @Then("product should be add to card successfully")
    public void productShouldBeAddToCardSuccessfully() {
        Assert.assertTrue(cartPage.getItemName().contains("Logitech G102 Light Sync Gaming Mouse"));
        Assert.assertEquals(cartPage.getQuantityAmount(), "1");
    }

    @And("user click proceed to checkout")
    public void userClickProceedToCheckout() {
        cartPage.clickOnProceedToCheckOutButton();
    }
}
