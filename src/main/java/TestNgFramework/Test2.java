package TestNgFramework;

import org.testng.annotations.*;

public class Test2 {
    /*@BeforeMethod
    void beforeMethod(){
        System.out.println("Before Every test method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("After every test method");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
    }

    @BeforeTest
    public static  void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    public static void afterTest(){
        System.out.println("After Test");
    }
*/
    /*@Test
    @UseDataProvider("zipCodesAndPlaces")
    public void parameterizedTests_positiveTests_expected200(String countryCode, String zipCode, String location) {
        given().
                pathParam("countryCode", countryCode).pathParam("zipCode",zipCode).
                log().all().
                when().
                get("http://api.zippopotam.us/{countryCode}/{zipCode}").
                then().
                log().body().
                assertThat().contentType(ContentType.JSON).
                assertThat().statusCode(200).
                assertThat().body("places[0].'place name'",equalTo(location));

    }*/

    @Test(priority=10)
    public void dummyTestForTestng4(){
        System.out.println("Dummy Test 4");
    }

    @Test(priority = 1)
    public void dummyTestForTestng5(){
        System.out.println("Dummy Test 5");
    }

    @Test(priority = 6)
    public void dummyTestForTestng6(){
        System.out.println("Dummy Test 6");
    }
}
