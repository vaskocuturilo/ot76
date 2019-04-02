package tests;

import api.ResponseData;
import core.BasePage;
import org.testng.annotations.Test;
import pages.ReceiptPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class OpenPageWithCorrectData extends BasePage {

    @Test(description = "Open page on the \"{url}\"")
    public void testGetDataFromMainPage() {
        ReceiptPage receiptPage = new ReceiptPage(driver);
        assertEquals(receiptPage.getTitlePage(), "МУП ГПТ \"Яргортранс\"");
        assertTrue(receiptPage.isInit());
    }
}
