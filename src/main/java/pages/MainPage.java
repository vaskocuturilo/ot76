package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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
     * FindBy annotation sizeMenu.
     */
    @FindBy(css = "div[id='rmenu'] table")
    private List<WebElement> sizeRightMenu;

    /**
     * FindBy annotation mainMap.
     */
    @FindBy(css = "div[id='map']")
    private WebElement mainMap;

    /**
     * FindBy annotation sizeMap.
     */
    @FindBy(css = "div[id='map'] div[id*='OpenLayers']")
    private List<WebElement> sizeMap;




    public boolean checkMenu(){

        return rightMenu.isDisplayed();
    }

    public boolean checkMap(){

        return mainMap.isDisplayed();
    }

    public int mapShouldHaveSize(){
    return sizeMap.size();
    }

    public int rightMenuShouldHaveSize(){
        return sizeRightMenu.size();
    }


}
