package tdd.basis;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * VERIFICACIÓN DE ESTADO
 */
class SquareTest {

    @Test
    void calculateArea() {
        Square square = new Square(5);

        double area = square.area();

        assertThat(area).isEqualTo(25); // SE VERIFICA EL ESTADO DEL OBJETO
    }
}