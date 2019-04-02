package tests;

import api.ResponseData;
import org.testng.annotations.Test;

public class OpenApiServiceWithCorrectData {

    @Test(description = "Open page on the \"{url}\"")
    public void testGetRouteData() {
        ResponseData responseData = new ResponseData();
        responseData.getData(10, 1);
    }
}
