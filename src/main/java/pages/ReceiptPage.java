package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReceiptPage extends PageObject {

    /**
     * Instantiates a new Page object.
     *
     * @param webDriver the driver
     */
    public ReceiptPage(WebDriver webDriver) {
        super(webDriver);
    }

    /**
     * FindBy annotation header.
     */
    @FindBy(css = "div[id='tmenu']")
    private WebElement header;

    /**
     * Is init boolean.
     *
     * @return the boolean
     */
    public boolean isInit() {
        return header.isDisplayed();
    }

    public String getTitlePage() {
        return getDriver().getTitle();
    }

    /**
     * Method confirmationHeader.
     *
     * @return the string
     */
    public String confirmationHeader() {
        return header.getText();
    }
}
