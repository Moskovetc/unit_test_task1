import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Concatenate Words")
class UtilsConcatenateWordsJUnit5Test {

    @DisplayName("Concatenate Latin Words Test")
    @Test
    void concatenateLatinWordsTest() {
        Assertions.assertEquals("HelloWorld", Utils.concatenateWords("Hello", "World"));
    }

    @DisplayName("Concatenate Non-latin Words Test")
    @Test
    void concatenateNonLatinWordsTest() {
        Assertions.assertEquals("ПриветМир", Utils.concatenateWords("Привет", "Мир"));
    }

    @DisplayName("Concatenate Nulls Words Test")
    @Test
    void concatenateNullsWordsTest() {
        Assertions.assertEquals("nullnull", Utils.concatenateWords(null, null));
    }

    @DisplayName("Concatenate Empty Words Test")
    @Test
    void concatenateEmptyWordsTest() {
        Assertions.assertEquals("", Utils.concatenateWords("", ""));
    }

}
