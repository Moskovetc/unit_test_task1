public class Utils {
    public static String concatenateWords(String word1, String word2){
        return word1 + word2;
    }

    public static int computeFactorial(int number){
        if (number == 0) return 1;
        return number * computeFactorial(number-1);
    }
}
