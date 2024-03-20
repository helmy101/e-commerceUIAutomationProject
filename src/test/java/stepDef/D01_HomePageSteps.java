package stepDef;

import Pages.P01_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D01_HomePageSteps {
    P01_HomePage homePage = new P01_HomePage();

    @Given("the user in the homepage")
    public void the_user_in_the_homepage() {
        Assert.assertTrue(homePage.getPageTitle().contains("Egyptlaptop"));
    }

    @When("User click on profile button")
    public void userClickOnProfileButton() {
        homePage.clickOnProfileButton();
    }

    @And("User tap on sign in button")
    public void userTapOnSignInButton() {
        homePage.clickOnSignInButton();
    }

    @And("Enter invalid credentials")
    public void enterInvalidCredentials() {
        homePage.enterCredentialsAndClickSubmit();
    }

    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        Assert.assertTrue(homePage.getErrorMessageText().contains("The username or password you have entered is invalid."));
    }
}