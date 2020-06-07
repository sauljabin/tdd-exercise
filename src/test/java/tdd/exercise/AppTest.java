package tdd.exercise;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void containsOneObject() {
        List<String> list = new ArrayList<>();

        list.add("Hello World");

        assertThat(list).hasSize(1);
    }
}
