package Pages;

import Connector.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P05_CheckoutPage {
    private By customerNameField = By.id("litecheckout_fullname");
    private By phoneNumberField = By.id("litecheckout_phone");
    private By addressField = By.id("litecheckout_s_address");
    private By postalCodeField = By.id("litecheckout_s_zipcode");
    private By paymentMethodsDropDown = By.className("b--pay-way__opted");
    private By cashOnDeliveryMethod = By.className("b--pay-way__list");
    private By termsAndConditionsCheckBox = By.xpath("(//input[@type='checkbox'])[5]");
    private By placeOrderButton = By.id("litecheckout_place_order");

    public void setCustomerNameText(String customerName) {
        Hook.driver.findElement(customerNameField).sendKeys(customerName);
    }
    public void setPhoneNumberText(String phoneNumber) {
        Hook.driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }
    public void setAddressText(String address) {
        Hook.driver.findElement(addressField).sendKeys(address);
    }
    public void setPostalCodeText(String postalCode) {
        Hook.driver.findElement(postalCodeField).sendKeys(postalCode);
    }
    public void clickOnPaymentMethodDropDown(){
        Hook.driver.findElement(paymentMethodsDropDown).click();
    }
    public void selectCashOnDeliveryOption(){
        Hook.driver.findElement(cashOnDeliveryMethod).click();
    }
    public void clickOnTermsAndConditionsCheckBox(){
        Hook.driver.findElement(termsAndConditionsCheckBox).click();
    }
    public WebElement getPlaceOrderButton() {
        return Hook.driver.findElement(placeOrderButton);
    }

}
