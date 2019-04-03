package api;

import io.restassured.builder.RequestSpecBuilder;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

/**
 * Class ResponseData.
 */
public class ResponseData extends AbstractController {

    /**
     * Constant SUCCESS.
     */
    private static final int SUCCESS = 200;

    /**
     * RequestSpecBuilder for Rest Assured.
     */
    private RequestSpecBuilder specBuilder = new RequestSpecBuilder()
            .addHeader("Content-type", "application/text; charset=cp1251")
            .setBasePath("");

    /**
     * Method getData.
     *
     * @param typeRoute   typeRoute.
     * @param numberRoute numberRoute.
     */
    public ResponseData getData(final int typeRoute, final int numberRoute) {
        given(specBuilder.build()).get("getroute.php?vt=" + typeRoute + "&r=" + numberRoute).then()
                .statusCode(SUCCESS).assertThat()
                .body("", not(emptyArray()));
        return this;
    }
}
