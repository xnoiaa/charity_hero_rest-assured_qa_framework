package core.be;

import core.be.dto.magnetto.FundModel;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FundApi extends AbstractApi {

    private static final String LINK_FOR_GET_METHOD_EN_VERSION = "/api/v2/charity/fund?Language=EN";
    private static final String LINK_FOR_POST_PAYMENT_METHOD = "/api/v2/charity/fund/payment";

    public FundModel getMethod(int id) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .queryParam("id",id)
                .get(LINK_FOR_GET_METHOD_EN_VERSION)
                .as(FundModel.class);
    }

    public void postJsonFromText() {
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(  "{ \"MerchantId\": 0," +
                        " \"RequestId\": \"string\", " +
                        "\"FundId\": 0, " +
                        "\"Amount\": 0," +
                        " \"Token\": \"string\"," +
                        " \"PaymentSystemCode\": \"applepay\"  }")
                .post(LINK_FOR_POST_PAYMENT_METHOD);

    }

    public void postJsonFile() throws IOException {
        String filename="body.json";
        Path pathToFile = Paths.get(filename);
        String jsonBody = generateStringFromResource(pathToFile.toAbsolutePath().toString());
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .post(LINK_FOR_POST_PAYMENT_METHOD);

    }


    private String generateStringFromResource(String path) throws IOException {

        return new String(Files.readAllBytes(Paths.get(path)));

    }









}
