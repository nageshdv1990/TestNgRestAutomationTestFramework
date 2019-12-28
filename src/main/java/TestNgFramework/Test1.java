package TestNgFramework;

import org.testng.annotations.*;

public class Test1 {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Every test method");
    }

    @AfterMethod
    public void afterMethod(){
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
    public void dummyTestForTestng1(){
        System.out.println("Dummy Test 1");
    }

    @Test(priority = 1)
    public void dummyTestForTestng2(){
        System.out.println("Dummy Test 2");
    }

    @Test(priority = 6)
    public void dummyTestForTestng3(){
        System.out.println("Dummy Test 3");
    }
}
