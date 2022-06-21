package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JUnit5Examples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("== Something before all tests");
    }

    @Test
     void firsttest() {
        System.out.println("======Started first test");
}
    @Test
    void secondtest() {
        System.out.println("======Started second test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("== Something after all tests");

        }

}
