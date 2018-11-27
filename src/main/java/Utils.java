import java.math.BigInteger;

public class Utils {
    public static String concatenateWords(String word1, String word2){
        return word1 + word2;
    }

    public static BigInteger computeFactorial(int number){
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= number; ++i) {
            factorial = BigInteger.valueOf(i).multiply(factorial);
        }
        return factorial;
    }
}
