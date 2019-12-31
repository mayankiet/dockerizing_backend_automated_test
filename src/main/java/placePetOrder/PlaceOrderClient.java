package placePetOrder;

import io.restassured.http.ContentType;
import placePetOrder.request.PlaceOrderRequestBody;
import placePetOrder.response.PlaceOrderResponseBody;
import utilities.ConfigReader;
import java.io.IOException;
import static io.restassured.RestAssured.given;

public class PlaceOrderClient {

    private ConfigReader configReader = new ConfigReader();

    public PlaceOrderClient() throws IOException {
    }

    public PlaceOrderResponseBody placePetOrderInStore(PlaceOrderRequestBody placeOrderRequestBody){
        return
                given()
                .contentType(ContentType.JSON)
                .when()
                .body(placeOrderRequestBody)
                .post(configReader.getEndpointUrl())
                .as(PlaceOrderResponseBody.class);
    }
}
