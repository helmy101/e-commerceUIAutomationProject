package Pages;

import Connector.Hook;
import org.openqa.selenium.By;

public class P02_SearchResult {

    private By searchBar = By.id("search_input");
    private By searchButton = By.className("ty-search-magnifier");
    private By searchResultsCounter = By.id("products_search_total_found_515");
    private By searchedItem = By.className("ut2-gl__name");

    public void setSearchBarText(String product) {
        Hook.driver.findElement(searchBar).sendKeys(product);
    }
    public void clickOnSearchButton() {
        Hook.driver.findElement(searchButton).click();
    }
    public String getSearchResultsCounter(){
        return Hook.driver.findElement(searchResultsCounter).getText();
    }
    public String searchedItemDescription(){
        return Hook.driver.findElement(searchedItem).getText();
    }
    public void clickOnSearchedItem() {
        Hook.driver.findElement(searchedItem).click();
    }
}
