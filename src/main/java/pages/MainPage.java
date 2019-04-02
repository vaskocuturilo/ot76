package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {
    /**
     * Instantiates a new Page object.
     *
     * @param webDriver the driver
     */
    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    /**
     * FindBy annotation rightMenu.
     */
    @FindBy(css = "div[id='rmenu']")
    private WebElement rightMenu;

    /**
     * FindBy annotation mainMap.
     */
    @FindBy(css = "div[id='map']")
    private WebElement mainMap;


    public boolean checkMenu(){

        return rightMenu.isDisplayed();
    }

    public boolean checkMap(){

        return mainMap.isDisplayed();
    }


}
