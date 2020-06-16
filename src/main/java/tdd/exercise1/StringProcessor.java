package tdd.exercise1;

public class StringProcessor {

    /* SOLUCION
    public static final String REGEX = "[^a-zA-Z0-9 ]+";

    public String execute(String input) {
        String cleaned = clean(input);
        return capitalize(cleaned);
    }

    private String capitalize(String input) {
        List<String> words = asList(input.split(" "));
        return words.stream()
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                .collect(joining(" "));
    }

    private String clean(String input) {
        return input.replaceAll(REGEX, "");
    }
    */
}
