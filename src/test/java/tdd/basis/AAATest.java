package tdd.basis;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ESTRUCTURA AAA
 */
class AAATest {

    @Test
    void containsOneObject() { // NOMBRE DESCRIPTIVO
        List<String> list = new ArrayList<>(); // ARRANGE

        list.add("Hello World"); // ACT

        assertThat(list).hasSize(1); // ASSERT
    }
}
