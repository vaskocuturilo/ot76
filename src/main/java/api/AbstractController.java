package api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import org.hamcrest.Matchers;

/**
 * Abstract class AbstractController.
 */
public class AbstractController {

    static {
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .addHeader("Content-type", "application/text; charset=cp1251")
                .setBaseUri("http://www.ot76.ru/")
                .log(LogDetail.ALL).build();

        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectResponseTime(Matchers.lessThan(15000L))
                .build();
    }
}
