import org.junit.jupiter.api.*;

class LifecycleTest {

    @BeforeAll
    static void initAll() {
        System.out.println("Init once");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("All done");
    }

    @BeforeEach
    void init() {
        System.out.println("Init each test");
    }

    @Test
    void testOne() {
        System.out.println("Running test 1");
    }

    @Test
    void testTwo() {
        System.out.println("Running test 2");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Clean up");
    }
}