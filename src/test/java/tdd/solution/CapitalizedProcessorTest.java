package tdd.solution;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CapitalizedProcessorTest {

    // HOJA DE RUTA
    // 1 Probar con una sola palabra
    // 2 Probar con 2 palabras

    @Test
    void oneWordToCamelCase() {
        CapitalizedProcessor capitalizedProcessor = new CapitalizedProcessor();

        String output = capitalizedProcessor.execute("hello");

        assertThat(output).isEqualTo("Hello");
    }

    @Test
    void multipleWordsToCamelCase() {
        CapitalizedProcessor capitalizedProcessor = new CapitalizedProcessor();

        String output = capitalizedProcessor.execute("hello world");

        assertThat(output).isEqualTo("Hello World");
    }
}