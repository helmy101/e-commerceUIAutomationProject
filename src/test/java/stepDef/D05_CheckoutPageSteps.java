package stepDef;

import Common.PageBase;
import Connector.Hook;
import Pages.P05_CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.time.Duration;

public class D05_CheckoutPageSteps {
    P05_CheckoutPage checkoutPage = new P05_CheckoutPage();
    PageBase pageBase = new PageBase();

    @And("user enter delivery details")
    public void userEnterDeliveryDetails() {
        checkoutPage.setCustomerNameText("Ahmed Helmy");
        checkoutPage.setPhoneNumberText("+201001234567");
        checkoutPage.setAddressText("Street 12 building 5 floor 4");
        checkoutPage.setPostalCodeText("11513");
    }

    @And("user select payment")
    public void userSelectPayment() {
        checkoutPage.clickOnPaymentMethodDropDown();
        checkoutPage.selectCashOnDeliveryOption();
    }

    @And("accept terms and conditions")
    public void acceptTermsAndConditions() {
        checkoutPage.clickOnTermsAndConditionsCheckBox();
    }

    @Then("user can place order")
    public void userCanPlaceOrder() {
        Assert.assertTrue(checkoutPage.getPlaceOrderButton().isEnabled());
    }
}
