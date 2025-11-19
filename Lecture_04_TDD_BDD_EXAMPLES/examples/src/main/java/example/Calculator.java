package example;

import java.util.ArrayList;
import java.util.List;


public class Calculator {

    public int add(int i, int i1) {
        return i+i1;
    }

    public int subtract(int i, int i1) {
        return i-i1;
    }

    public int multiply(int i, int i1) {
        return 0;
    }
}



//class LifecycleTest {
//
//    @BeforeAll static void initAll() { System.out.println("Init once"); }
//    @BeforeEach void init() { System.out.println("Init each test"); }
//    @Test void testOne() { System.out.println("Running test 1"); }
//    @Test void testTwo() { System.out.println("Running test 2"); }
//    @AfterEach void tearDown() { System.out.println("Clean up"); }
//    @AfterAll static void tearDownAll() { System.out.println("All done"); }
//}