package BaseTry;

import org.junit.jupiter.api.*;

public class BaseClass {

@BeforeAll
        static void beforeAll(){

}
    int result;

    @BeforeEach
    void beforeEach() {
        System.out.println("####  beforeEach()");
        result = getResult();
    }

    @AfterEach
    void afterEach() {
        System.out.println("####  afterEach()");
        result = 0;
    }


    @Test
    void firstTest() {

        System.out.println("FirstTest999999");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void secondTest() {

        System.out.println("FirstTest999999");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void thirdTest() {

        System.out.println("FirstTest999999");
        Assertions.assertTrue(result > 2);
    }

    private int getResult() {
        return 3;
    }
}

