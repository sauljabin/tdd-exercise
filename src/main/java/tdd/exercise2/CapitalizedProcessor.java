package tdd.exercise2;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.joining;

public class CapitalizedProcessor implements StringProcessor {

    @Override
    public String execute(String input) {
        String[] words = input.split(" ");

        return asList(words).stream()
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                .collect(joining(" "));
    }
}
