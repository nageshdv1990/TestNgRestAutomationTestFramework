package TestNgFramework;

import io.restassured.http.ContentType;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ParameterizedTest {

    @DataProvider(name = "dataSet1")
    public static Object[][] inputsForApi() {
        return new Object[][]{
                {"us", "90210", "Beverly Hills"},
                {"us", "12345", "Schenectady"},
                {"ca", "B2R", "Waverley"}
        };
    }

    @Test(dataProvider = "dataSet1")
    public void parameterizedTests_positiveTests_expected200(String countryCode, String zipCode, String location) {
        given().
                pathParam("countryCode", countryCode).pathParam("zipCode",zipCode).
                log().all().
                when().
                get("http://api.zippopotam.us/{countryCode}/{zipCode}").
                then().
                log().body().
                assertThat().contentType(ContentType.JSON).
                assertThat().statusCode(201).
                assertThat().body("places[0].'place name'",equalTo(location));

    }

}
