package tests;

import core.BasePage;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.ReceiptPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class OpenPageWithCorrectData extends BasePage {

    @Test(description = "Open page on the \"{url}\"")
    public void testInitMainPage() {
        ReceiptPage receiptPage = new ReceiptPage(driver);
        assertEquals(receiptPage.getTitlePage(), "МУП ГПТ \"Яргортранс\"");
        assertTrue(receiptPage.isInit());
    }

    @Test(description = "Open page on the \"{url}\"")
    public void testGetDataFromMainPage() {
        MainPage mainPage = new MainPage(driver);
        assertTrue(mainPage.checkMenu());
        assertTrue(mainPage.checkMap());
        assertEquals(mainPage.mapShouldHaveSize(), 29);
        assertEquals(mainPage.rightMenuShouldHaveSize(), 5);
    }

}
