package Pages;

import org.openqa.selenium.By;
import Connector.Hook;

public class P01_HomePage {

    private By profileButton = By.className("ut2-icon-outline-account-circle");
    private By signInButton = By.xpath("//a[@data-ca-target-id='login_block4699']");
    private By emailField = By.id("login_popup4699");
    private By passwordField = By.id("psw_popup4699");
    private By submitButton = By.xpath("//bdi[text()='Sign in']");
    private By errorMessage = By.xpath("//div[@class='cm-notification-content notification-content alert-error']");


    public void clickOnProfileButton() {
        Hook.driver.findElement(profileButton).click();
    }

    public void clickOnSignInButton() {
        Hook.driver.findElement(signInButton).click();
    }
    public void enterCredentialsAndClickSubmit() {
        Hook.driver.findElement(emailField).sendKeys("InvalidMail@gmail.com");
        Hook.driver.findElement(passwordField).sendKeys("InvalidPassword");
        Hook.driver.findElement(submitButton).click();
    }
    public String getErrorMessageText(){
        return Hook.driver.findElement(errorMessage).getText();
    }
    public String getPageTitle() {
        return Hook.driver.getTitle();
    }
}

