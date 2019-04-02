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
            .setBasePath("getroute.php");

    /**
     * Method getData.
     */
    public void getData(final int typeRoute, final int numberRoute) {
        given(specBuilder.build()).get("?vt=" + typeRoute + "&r=" + numberRoute).then()
                .statusCode(SUCCESS).assertThat()
                .body("$", not(empty()));
    }
}
