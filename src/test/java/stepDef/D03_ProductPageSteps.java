package stepDef;

import Common.PageBase;
import Pages.P03_ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class D03_ProductPageSteps {
    P03_ProductPage productPage = new P03_ProductPage();
    PageBase pageBase = new PageBase();

    @And("user check product specification")
    public void userCheckProductSpecification() {
        pageBase.scrollDown();
        Assert.assertTrue(productPage.checkProductSpecs().contains("200 – 8000"));
        pageBase.scrollUp();
    }

    @And("user add product to cart")
    public void userAddProductToCart() {
        productPage.clickOnAddToCartButton();
    }

    @And("user navigate to cart page")
    public void userNavigateToCartPage() {
        productPage.clickOnCloseButton();
        productPage.viewCart();
    }
}
