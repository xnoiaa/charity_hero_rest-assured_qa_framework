package core.be;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

public abstract class AbstractApi {

    public AbstractApi() {

        RestAssured.baseURI = "https://dev.cloud.magnetto.store";
        RestAssured.filters(new RequestLoggingFilter());
        RestAssured.filters(new ResponseLoggingFilter());
    }
}

