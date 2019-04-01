package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

    /**
     * Private driver.
     */
    private final WebDriver driver;

    /**
     * getter.
     *
     * @return return. driver
     */
    public final WebDriver getDriver() {
        return driver;
    }


    /**
     * Instantiates a new Page object.
     *
     * @param webDriver the driver
     */
    PageObject(final WebDriver webDriver) {
        this.driver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
}
