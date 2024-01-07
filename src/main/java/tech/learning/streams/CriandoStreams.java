package tech.learning.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<Object> print = System.out::println;

        Stream<String> langs = Stream.of("Java", "JavaScript", "Python\n");
        langs.forEach(print);

        String[] maisLangs = {"Elixir", "Go", "NextJS\n"};
        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 3).forEach(print);

        List<String> outrasLangs = Arrays.asList("C", "C#", "PHP", ".NET\n");
        outrasLangs.stream()
                .map((String string) -> {
                    return string.toLowerCase();
                })
                .filter((String string) -> {
                    return string.startsWith("c");
                })
                .forEach(print);
        // Gera Stream de forma infinita (?): Stream.generate(() -> "a").forEach(print);
        // Qual seria um caso de uso pra isso?
        // Stream.iterate(0, n -> n + 1).forEach(print);
    }
}
