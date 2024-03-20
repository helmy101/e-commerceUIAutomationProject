package stepDef;

import Pages.P02_SearchResult;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D02_SearchResultsSteps {
    P02_SearchResult resultsPage = new P02_SearchResult();

    @When("User enter name of a product in search bar")
    public void userEnterNameOfAProductInSearchBar() {
        resultsPage.setSearchBarText("Logitech G102");
    }

    @And("click on search button")
    public void clickOnSearchButton() {
        resultsPage.clickOnSearchButton();
    }

    @Then("the user should find the product")
    public void theUserShouldFindTheProduct() {
        Assert.assertTrue(resultsPage.getSearchResultsCounter().contains("Products found: 1"));
        Assert.assertTrue(resultsPage.searchedItemDescription().contains("Logitech G102 Light Sync"));
    }

    @And("user click on product")
    public void userClickOnProduct() {
        resultsPage.clickOnSearchedItem();
    }
}
