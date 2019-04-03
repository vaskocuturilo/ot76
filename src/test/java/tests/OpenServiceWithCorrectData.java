package tests;

import api.ResponseData;
import listener.LogListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(LogListener.class)
public class OpenServiceWithCorrectData {

    @Test(description = "Open page on the \"{url}\"")
    public void testGetRouteData() {
        ResponseData responseData = new ResponseData();
        responseData.getData(1, 10);
    }
}
