import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class UtilsJUnit5Test {

    @BeforeAll
    static void initAll() {

    }

    @BeforeEach
    void init() {
    }

    @Test
    private static void concatenateWordsTest(String word1, String word2) {
        System.out.println(String.format("Expected: %s word1: %s word2: %s", word1 + word2, word1, word2));
        assertEquals(word1 + word2, Utils.concatenateWords(word1, word2));
    }

    @Test
    private static void computeFactorialTest(){

    }

    @Test
    void succeedingTest() {
        concatenateWordsTest("Hello", "World");
        concatenateWordsTest(null, "World");
        concatenateWordsTest(null, null);
        concatenateWordsTest("Привет", "Мир");
    }

    @Test
    @Disabled
    void failingTest() {
        fail("a failing test");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }

}
