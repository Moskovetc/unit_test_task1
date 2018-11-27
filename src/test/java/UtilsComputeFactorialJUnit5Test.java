import org.junit.jupiter.api.*;

import java.math.BigInteger;
import java.time.Duration;
import java.util.Random;

@DisplayName("Compute Factorial")
class UtilsComputeFactorialJUnit5Test {

    Random random;

    @BeforeEach
    void setUp() {
        random = new Random();
    }

    @AfterEach
    void tearDown() {

    }

    @Disabled
    @DisplayName("Compute factorial 0")
    @Test
    void computeFactorialZeroTest() {
        Assertions.assertEquals(BigInteger.ONE, Utils.computeFactorial(0));
    }

    @DisplayName("Compute factorial 5")
    @Test
    void computeFactorialFiveTest() {
        Assertions.assertEquals(BigInteger.valueOf(120), Utils.computeFactorial(5));
    }

    @DisplayName("Compute factorial random int")
    @Test
    void computeFactorialRandomTest() {
        BigInteger result = Assertions.assertTimeout(Duration.ofMillis(10), () -> Utils.computeFactorial(random.nextInt(500)));
        System.out.println(String.format("result : %s", result));
    }
}
