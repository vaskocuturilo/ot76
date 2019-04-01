package api;

import io.restassured.builder.RequestSpecBuilder;

/**
 * Class ResponseData.
 */
public class ResponseData extends AbstractController {


    /**
     * RequestSpecBuilder for Rest Assured.
     */
    private RequestSpecBuilder specBuilder = new RequestSpecBuilder()
            .addHeader("Content-type", "application/json; charset=UTF-8")
            .setBasePath("getroute.php?vt=1&r=10");

    /**
     * Method getData.
     */
    public void getData() {

    }
}
