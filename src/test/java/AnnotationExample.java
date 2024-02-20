import org.testng.annotations.*;

public class AnnotationExample {

    @BeforeClass
    void beforeClass() {
        System.out.println("Execute before Class Happened");

    }

    @AfterClass
    void afterClass() {
        System.out.println("Execute after Class Happened");
    }

    @BeforeMethod
    void beforeEverySingleTest() {
        System.out.println("Execute before every single test");
    }

    @AfterMethod
    void afterEverySingleTest() {
        System.out.println("Execute after every single test");
    }

    @Test
    void FirstTest() {
        System.out.println("First Test");
    }

    @Test
    void SecondTest() {
        System.out.println("Second Test");
    }
}
