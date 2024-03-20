package Common;

import Connector.Hook;
import org.openqa.selenium.JavascriptExecutor;

public class PageBase {

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) Hook.driver;
        js.executeScript("window.scrollBy(0,1000)");
    }

    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) Hook.driver;
        js.executeScript("window.scrollBy(0,-1000)");
    }
}
