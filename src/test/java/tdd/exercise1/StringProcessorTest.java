package tdd.exercise1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringProcessorTest {

    // Probar con números
    // Probar con minúsculas
    // Probar con mayúsculas
    // Probar con espacios en blanco
    // Capitalizar una palabra en minúscula
    // Capitalizar dos palabras en mayúsculas

    /* SOLUCION
    @Test
    void removeSpecialCharsAndKeepNumber() {
        StringProcessor stringProcessor = new StringProcessor();

        String output = stringProcessor.execute("1@2345#%");

        assertThat(output).isEqualTo("12345");
    }

    @Test
    void removeSpecialCharsAndKeepAlphabeticChars() {
        StringProcessor stringProcessor = new StringProcessor();

        String output = stringProcessor.execute("he$llo%");

        assertThat(output).isEqualTo("Hello");
    }

    @Test
    void keepWhiteSpace() {
        StringProcessor stringProcessor = new StringProcessor();

        String output = stringProcessor.execute("Hello World");

        assertThat(output).isEqualTo("Hello World");
    }

    @Test
    void capitalizeOneWord() {
        StringProcessor stringProcessor = new StringProcessor();

        String output = stringProcessor.execute("hello");

        assertThat(output).isEqualTo("Hello");
    }

    @Test
    void capitalizeTwoWordsUsingUpperCase() {
        StringProcessor stringProcessor = new StringProcessor();

        String output = stringProcessor.execute("HELLO WORLD");

        assertThat(output).isEqualTo("Hello World");
    }
    */
}