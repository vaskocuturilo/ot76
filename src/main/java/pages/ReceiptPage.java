package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReceiptPage extends PageObject {

    /**
     * Instantiates a new Page object.
     *
     * @param driver the driver
     */
    ReceiptPage(WebDriver driver) {
        super(driver);
    }

    /**
     * FindBy annotation header.
     */
    @FindBy(tagName = "p")
    private WebElement header;

    /**
     * Is init boolean.
     *
     * @return the boolean
     */
    public boolean isInit() {
        return header.isDisplayed();
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
