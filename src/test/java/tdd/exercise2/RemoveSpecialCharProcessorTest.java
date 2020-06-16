package tdd.exercise2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveSpecialCharProcessorTest {

    // HOJA DE RUTA
    // 1 Probar con una sola palabra
    // 2 Probar con 2 palabras
    // 3 Probar con números
    // 4 Probar con mayúsculas

    @Test
    void removeSpecialCharsAndKeepLetters() {
        RemoveSpecialCharProcessor charProcessor = new RemoveSpecialCharProcessor();

        String output = charProcessor.execute("he$llo%");

        assertThat(output).isEqualTo("hello");
    }

    @Test
    void keepBlanks() {
        RemoveSpecialCharProcessor charProcessor = new RemoveSpecialCharProcessor();

        String output = charProcessor.execute("hello world");

        assertThat(output).isEqualTo("hello world");
    }

    @Test
    void removeSpecialCharsAndKeepNumbers() {
        RemoveSpecialCharProcessor charProcessor = new RemoveSpecialCharProcessor();

        String output = charProcessor.execute("123$%456*()");

        assertThat(output).isEqualTo("123456");
    }

    @Test
    void keepUpperCaseChars() {
        RemoveSpecialCharProcessor charProcessor = new RemoveSpecialCharProcessor();

        String output = charProcessor.execute("Hello World");

        assertThat(output).isEqualTo("Hello World");
    }
}