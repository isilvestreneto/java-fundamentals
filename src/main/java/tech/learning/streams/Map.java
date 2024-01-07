package tech.learning.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

        List<String> marcas = Arrays.asList("Colcci", "Acostamento", "C&A", "Tiffany&Co");
        marcas.stream().map(e -> e.toUpperCase()).forEach(print);

        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        UnaryOperator<String> grito = n -> n + "!!!";

        System.out.println("\n\nUsando composição");
        marcas.stream()
                .map(maiuscula)
                .map(primeiraLetra)
                .map(grito)
                .forEach(print);
    }
}
